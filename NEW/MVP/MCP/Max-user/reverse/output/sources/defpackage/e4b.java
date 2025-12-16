package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class e4b implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ e4b(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                mei.d("watchdog-".concat(this.b), new vj5((Runnable) obj, 2));
                break;
            case 1:
                mei.d("watchdog-".concat(this.b), new vj5((Runnable) obj, 3));
                break;
            default:
                String str = (String) obj;
                return Boolean.valueOf(str.length() > 0 && y4e.a.i().i(str, this.b));
        }
        return qqg.a;
    }
}
