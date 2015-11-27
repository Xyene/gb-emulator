package nitrous;

import java.awt.*;

public class PaletteColors
{
    public static final PaletteColors[] byHash = new PaletteColors[0x100];

    static
    {
        byHash[0xFF] = new PaletteColors(new int[]{0xFFFFFF, 0xFF9C00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0xFF9C00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0xFF9C00, 0xFF0000, 0x000000});
        byHash[0x71] = new PaletteColors(new int[]{0xFFFFFF, 0xFF9C00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0xFF9C00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0xFF9C00, 0xFF0000, 0x000000});
        byHash[0xDB] = new PaletteColors(new int[]{0xFFFFFF, 0xFFFF00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0xFFFF00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0xFFFF00, 0xFF0000, 0x000000});
        byHash[0x15] = new PaletteColors(new int[]{0xFFFFFF, 0xFFFF00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0xFFFF00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0xFFFF00, 0xFF0000, 0x000000});
        byHash[0x88] = new PaletteColors(new int[]{0xA59CFF, 0xFFFF00, 0x006300, 0x000000}, new int[]{0xA59CFF, 0xFFFF00, 0x006300, 0x000000}, new int[]{0xA59CFF, 0xFFFF00, 0x006300, 0x000000});
        byHash[0x16] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000});
        byHash[0x92] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000});
        byHash[0x35] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000});
        byHash[0x75] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000});
        byHash[0x99] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000});
        byHash[0x0C] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000});
        byHash[0xB7] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000});
        byHash[0x67] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000});
        byHash[0xE8] = new PaletteColors(new int[]{0x000000, 0x008484, 0xFFDE00, 0xFFFFFF}, new int[]{0x000000, 0x008484, 0xFFDE00, 0xFFFFFF}, new int[]{0x000000, 0x008484, 0xFFDE00, 0xFFFFFF});
        byHash[0x28] = new PaletteColors(new int[]{0x000000, 0x008484, 0xFFDE00, 0xFFFFFF}, new int[]{0x000000, 0x008484, 0xFFDE00, 0xFFFFFF}, new int[]{0x000000, 0x008484, 0xFFDE00, 0xFFFFFF});
        byHash[0xA5] = new PaletteColors(new int[]{0x000000, 0x008484, 0xFFDE00, 0xFFFFFF}, new int[]{0x000000, 0x008484, 0xFFDE00, 0xFFFFFF}, new int[]{0x000000, 0x008484, 0xFFDE00, 0xFFFFFF});
        byHash[0x58] = new PaletteColors(new int[]{0xFFFFFF, 0xA5A5A5, 0x525252, 0x000000}, new int[]{0xFFFFFF, 0xA5A5A5, 0x525252, 0x000000}, new int[]{0xFFFFFF, 0xA5A5A5, 0x525252, 0x000000});
        byHash[0x6F] = new PaletteColors(new int[]{0xFFFFFF, 0xFFCE00, 0x9C6300, 0x000000}, new int[]{0xFFFFFF, 0xFFCE00, 0x9C6300, 0x000000}, new int[]{0xFFFFFF, 0xFFCE00, 0x9C6300, 0x000000});
        byHash[0x8C] = new PaletteColors(new int[]{0xFFFFFF, 0xADAD84, 0x42737B, 0x000000}, new int[]{0xFFFFFF, 0xFF7300, 0x944200, 0x000000}, new int[]{0xFFFFFF, 0xADAD84, 0x42737B, 0x000000});
        byHash[0x61] = new PaletteColors(new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000});
        byHash[0xD3] = new PaletteColors(new int[]{0xFFFFFF, 0x8C8CDE, 0x52528C, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0x8C8CDE, 0x52528C, 0x000000});
        byHash[0x14] = new PaletteColors(new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0xAA] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF31, 0x0063C5, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0x7BFF31, 0x0063C5, 0x000000});
        byHash[0x3C] = new PaletteColors(new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0x9C] = new PaletteColors(new int[]{0xFFFFFF, 0x8C8CDE, 0x52528C, 0x000000}, new int[]{0xFFFFFF, 0x8C8CDE, 0x52528C, 0x000000}, new int[]{0xFFC542, 0xFFD600, 0x943A00, 0x4A0000});
        byHash[0xB3] = new PaletteColors(new int[]{0xFFFFFF, 0xADAD84, 0x42737B, 0x000000}, new int[]{0xFFFFFF, 0xFF7300, 0x944200, 0x000000}, new int[]{0xFFFFFF, 0xFF7300, 0x944200, 0x000000});
        byHash[0x34] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF00, 0xB57300, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0x66] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF00, 0xB57300, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0xF4] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF00, 0xB57300, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0x3D] = new PaletteColors(new int[]{0xFFFFFF, 0x52FF00, 0xFF4200, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0x6A] = new PaletteColors(new int[]{0xFFFFFF, 0x52FF00, 0xFF4200, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0x19] = new PaletteColors(new int[]{0xFFFFFF, 0xFF9C00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0x1D] = new PaletteColors(new int[]{0xA59CFF, 0xFFFF00, 0x006300, 0x000000}, new int[]{0xFF6352, 0xD60000, 0x630000, 0x000000}, new int[]{0xFF6352, 0xD60000, 0x630000, 0x000000});
        byHash[0x46] = new PaletteColors(new int[]{0xB5B5FF, 0xFFFF94, 0xAD5A42, 0x000000}, new int[]{0x000000, 0xFFFFFF, 0xFF8484, 0x943A3A}, new int[]{0x000000, 0xFFFFFF, 0xFF8484, 0x943A3A});
        byHash[0x0D] = new PaletteColors(new int[]{0xFFFFFF, 0x8C8CDE, 0x52528C, 0x000000}, new int[]{0xFFC542, 0xFFD600, 0x943A00, 0x4A0000}, new int[]{0xFFC542, 0xFFD600, 0x943A00, 0x4A0000});
        byHash[0xBF] = new PaletteColors(new int[]{0xFFFFFF, 0x8C8CDE, 0x52528C, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0x4B] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0x90] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0x9A] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0xBD] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0x28] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0x97] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000});
        byHash[0x39] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000});
        byHash[0x43] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000});
        byHash[0xA5] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000}, new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000});
        byHash[0x00] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF31, 0x0063C5, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0x3F] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF31, 0x0063C5, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0xC6] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF31, 0x0063C5, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0x18] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF31, 0x0063C5, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0x66] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF31, 0x0063C5, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0x95] = new PaletteColors(new int[]{0xFFFFFF, 0x52FF00, 0xFF4200, 0x000000}, new int[]{0xFFFFFF, 0x52FF00, 0xFF4200, 0x000000}, new int[]{0xFFFFFF, 0x5ABDFF, 0xFF0000, 0x0000FF});
        byHash[0xB3] = new PaletteColors(new int[]{0xFFFFFF, 0x52FF00, 0xFF4200, 0x000000}, new int[]{0xFFFFFF, 0x52FF00, 0xFF4200, 0x000000}, new int[]{0xFFFFFF, 0x5ABDFF, 0xFF0000, 0x0000FF});
        byHash[0x3E] = new PaletteColors(new int[]{0xFFFFFF, 0xFF9C00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0xFF9C00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0x5ABDFF, 0xFF0000, 0x0000FF});
        byHash[0xE0] = new PaletteColors(new int[]{0xFFFFFF, 0xFF9C00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0xFF9C00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0x5ABDFF, 0xFF0000, 0x0000FF});
        byHash[0xF2] = new PaletteColors(new int[]{0xFFFFFF, 0xFFFF00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0xFFFF00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0x5ABDFF, 0xFF0000, 0x0000FF});
        byHash[0x69] = new PaletteColors(new int[]{0xFFFFFF, 0xFFFF00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0xFFFF00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0x5ABDFF, 0xFF0000, 0x0000FF});
        byHash[0x0D] = new PaletteColors(new int[]{0xFFFFFF, 0xFFFF00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0xFFFF00, 0xFF0000, 0x000000}, new int[]{0xFFFFFF, 0x5ABDFF, 0xFF0000, 0x0000FF});
        byHash[0x59] = new PaletteColors(new int[]{0xFFFFFF, 0xADAD84, 0x42737B, 0x000000}, new int[]{0xFFFFFF, 0xFF7300, 0x944200, 0x000000}, new int[]{0xFFFFFF, 0x5ABDFF, 0xFF0000, 0x0000FF});
        byHash[0xC6] = new PaletteColors(new int[]{0xFFFFFF, 0xADAD84, 0x42737B, 0x000000}, new int[]{0xFFFFFF, 0xFF7300, 0x944200, 0x000000}, new int[]{0xFFFFFF, 0x5ABDFF, 0xFF0000, 0x0000FF});
        byHash[0xA8] = new PaletteColors(new int[]{0xFFFF9C, 0x94B5FF, 0x639473, 0x003A3A}, new int[]{0xFFC542, 0xFFD600, 0x943A00, 0x4A0000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0x86] = new PaletteColors(new int[]{0xFFFF9C, 0x94B5FF, 0x639473, 0x003A3A}, new int[]{0xFFC542, 0xFFD600, 0x943A00, 0x4A0000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0xD1] = new PaletteColors(new int[]{0x6BFF00, 0xFFFFFF, 0xFF524A, 0x000000}, new int[]{0xFFFFFF, 0xFFFFFF, 0x63A5FF, 0x0000FF}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000});
        byHash[0xF0] = new PaletteColors(new int[]{0x6BFF00, 0xFFFFFF, 0xFF524A, 0x000000}, new int[]{0xFFFFFF, 0xFFFFFF, 0x63A5FF, 0x0000FF}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000});
        byHash[0xCE] = new PaletteColors(new int[]{0x6BFF00, 0xFFFFFF, 0xFF524A, 0x000000}, new int[]{0xFFFFFF, 0xFFFFFF, 0x63A5FF, 0x0000FF}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000});
        byHash[0xBF] = new PaletteColors(new int[]{0x6BFF00, 0xFFFFFF, 0xFF524A, 0x000000}, new int[]{0xFFFFFF, 0xFFFFFF, 0x63A5FF, 0x0000FF}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000});
        byHash[0x36] = new PaletteColors(new int[]{0x52DE00, 0xFF8400, 0xFFFF00, 0xFFFFFF}, new int[]{0xFFFFFF, 0xFFFFFF, 0x63A5FF, 0x0000FF}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000});
        byHash[0x5C] = new PaletteColors(new int[]{0xA59CFF, 0xFFFF00, 0x006300, 0x000000}, new int[]{0xFF6352, 0xD60000, 0x630000, 0x000000}, new int[]{0x0000FF, 0xFFFFFF, 0xFFFF7B, 0x0084FF});
        byHash[0x49] = new PaletteColors(new int[]{0xA59CFF, 0xFFFF00, 0x006300, 0x000000}, new int[]{0xFF6352, 0xD60000, 0x630000, 0x000000}, new int[]{0x0000FF, 0xFFFFFF, 0xFFFF7B, 0x0084FF});
        byHash[0xB3] = new PaletteColors(new int[]{0xA59CFF, 0xFFFF00, 0x006300, 0x000000}, new int[]{0xFF6352, 0xD60000, 0x630000, 0x000000}, new int[]{0x0000FF, 0xFFFFFF, 0xFFFF7B, 0x0084FF});
        byHash[0x27] = new PaletteColors(new int[]{0xA59CFF, 0xFFFF00, 0x006300, 0x000000}, new int[]{0xFF6352, 0xD60000, 0x630000, 0x000000}, new int[]{0x0000FF, 0xFFFFFF, 0xFFFF7B, 0x0084FF});
        byHash[0xC9] = new PaletteColors(new int[]{0xFFFFCE, 0x63EFEF, 0x9C8431, 0x5A5A5A}, new int[]{0xFFFFFF, 0xFF7300, 0x944200, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000});
        byHash[0x4E] = new PaletteColors(new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFFFF7B, 0x0084FF, 0xFF0000});
        byHash[0x6B] = new PaletteColors(new int[]{0xFFFFFF, 0x8C8CDE, 0x52528C, 0x000000}, new int[]{0xFFC542, 0xFFD600, 0x943A00, 0x4A0000}, new int[]{0xFFFFFF, 0x5ABDFF, 0xFF0000, 0x0000FF});
        byHash[0x18] = new PaletteColors(new int[]{0xFFFFFF, 0x8C8CDE, 0x52528C, 0x000000}, new int[]{0xFFC542, 0xFFD600, 0x943A00, 0x4A0000}, new int[]{0xFFFFFF, 0x5ABDFF, 0xFF0000, 0x0000FF});
        byHash[0x6A] = new PaletteColors(new int[]{0xFFFFFF, 0x8C8CDE, 0x52528C, 0x000000}, new int[]{0xFFC542, 0xFFD600, 0x943A00, 0x4A0000}, new int[]{0xFFFFFF, 0x5ABDFF, 0xFF0000, 0x0000FF});
        byHash[0x9D] = new PaletteColors(new int[]{0xFFFFFF, 0x8C8CDE, 0x52528C, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000});
        byHash[0x17] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000});
        byHash[0x8B] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000});
        byHash[0x27] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000});
        byHash[0x61] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000});
        byHash[0x10] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000}, new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000});
        byHash[0xF6] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000}, new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000});
        byHash[0x68] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000}, new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000});
        byHash[0x29] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000}, new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000});
        byHash[0x52] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000}, new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000});
        byHash[0x01] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000}, new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000});
        byHash[0x5D] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000}, new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000});
        byHash[0x6D] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000}, new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000});
        byHash[0x70] = new PaletteColors(new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0x00FF00, 0x318400, 0x004A00}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000});
        byHash[0xF7] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000});
        byHash[0xA2] = new PaletteColors(new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000});
        byHash[0x46] = new PaletteColors(new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000}, new int[]{0xFFFF00, 0xFF0000, 0x630000, 0x000000}, new int[]{0xFFFFFF, 0x7BFF31, 0x008400, 0x000000});
        byHash[0xD3] = new PaletteColors(new int[]{0xFFFFFF, 0xADAD84, 0x42737B, 0x000000}, new int[]{0xFFFFFF, 0xFFAD63, 0x843100, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000});
        byHash[0xF4] = new PaletteColors(new int[]{0xFFFFFF, 0x7BFF31, 0x0063C5, 0x000000}, new int[]{0xFFFFFF, 0xFF8484, 0x943A3A, 0x000000}, new int[]{0xFFFFFF, 0x63A5FF, 0x0000FF, 0x000000});

        int[] dmgColors = new int[]{Color.WHITE.getRGB(), Color.LIGHT_GRAY.getRGB(), Color.DARK_GRAY.getRGB(), Color.BLACK.getRGB()};
        PaletteColors dmgPalette = new PaletteColors(dmgColors, dmgColors, dmgColors);
        for (int i = 0; i < byHash.length; i++)
        {
            if (byHash[i] == null)
                byHash[i] = dmgPalette;
        }
    }

    public final int[] bg;
    public final int[] obj0;
    public final int[] obj1;

    public PaletteColors(int[] bg, int[] obj0, int[] obj1)
    {
        this.bg = bg;
        this.obj0 = obj0;
        this.obj1 = obj1;
    }
}
