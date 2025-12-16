package defpackage;

import android.os.Handler;
import android.os.Looper;
import ru.ok.android.externcalls.sdk.AudioLevelListener;

/* loaded from: classes.dex */
public final /* synthetic */ class hv1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qv1 b;

    public /* synthetic */ hv1(qv1 qv1Var, int i) {
        this.a = i;
        this.b = qv1Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ucf.a(((w21) this.b.b).b());
            case 1:
                return (f9a) this.b.q.getValue();
            case 2:
                ((e9a) this.b.s.getValue()).h(Boolean.TRUE);
                return qqg.a;
            case 3:
                return (e9a) this.b.s.getValue();
            case 4:
                return new AudioLevelListener((short) 500, new Handler(Looper.getMainLooper()), new o3(28, this.b));
            default:
                return new lv1(this.b);
        }
    }
}
