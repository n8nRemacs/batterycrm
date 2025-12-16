package defpackage;

import one.me.android.MainActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class jl8 extends soc {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jl8(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.a = i2;
    }

    @Override // defpackage.soc, defpackage.wy7
    public final Object get() {
        switch (this.a) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.receiver;
                int i = MainActivity.a1;
                return mainActivity.O();
            case 1:
                return ((vwa) this.receiver).a;
            default:
                return Boolean.valueOf(((x9d) this.receiver).c.j() > 8);
        }
    }
}
