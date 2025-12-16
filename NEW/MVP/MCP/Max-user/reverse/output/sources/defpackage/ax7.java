package defpackage;

/* loaded from: classes.dex */
public abstract class ax7 extends br6 {
    public static final int[] s0 = hb2.h;
    public final int X;
    public xee Y;
    public final boolean Z;
    public final b6 d;
    public int[] o;

    public ax7(b6 b6Var, int i) {
        this.a = i;
        this.c = new fy7(0, null, (yw7.STRICT_DUPLICATE_DETECTION.b & i) != 0 ? new zva(this) : null);
        this.b = (yw7.WRITE_NUMBERS_AS_STRINGS.b & i) != 0;
        this.o = s0;
        this.Y = vo4.a;
        this.d = b6Var;
        if ((yw7.ESCAPE_NON_ASCII.b & i) != 0) {
            this.X = 127;
        }
        this.Z = !((yw7.QUOTE_FIELD_NAMES.b & i) != 0);
    }
}
