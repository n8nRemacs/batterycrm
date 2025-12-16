package defpackage;

/* loaded from: classes2.dex */
public enum rs4 {
    REGULAR((byte) 0),
    DELAYED((byte) 1);

    public static final r8j d = new r8j(18);
    public final byte a;
    public final bwf b;
    public final bwf c;

    rs4(byte b) {
        this.a = b;
        final int i = 0;
        this.b = new bwf(new cm6(this) { // from class: qs4
            public final /* synthetic */ rs4 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return Boolean.valueOf(this.b == rs4.REGULAR);
                    default:
                        return Boolean.valueOf(this.b == rs4.DELAYED);
                }
            }
        });
        final int i2 = 1;
        this.c = new bwf(new cm6(this) { // from class: qs4
            public final /* synthetic */ rs4 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(this.b == rs4.REGULAR);
                    default:
                        return Boolean.valueOf(this.b == rs4.DELAYED);
                }
            }
        });
    }

    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }
}
