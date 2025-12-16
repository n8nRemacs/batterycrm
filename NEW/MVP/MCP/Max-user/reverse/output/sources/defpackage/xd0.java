package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final /* synthetic */ class xd0 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ xd0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                a93.s0.x(this.b).k().getIcon();
                i = -1;
                break;
            case 1:
                a93.s0.x(this.b).k().b();
                i = -1728053248;
                break;
            default:
                CharSequence charSequenceB = ((s5g) obj).b(this.b);
                return charSequenceB == null ? "" : charSequenceB;
        }
        return Integer.valueOf(i);
    }
}
