package androidx.media3.session;

import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class D0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f51934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G0 f51935c;

    public /* synthetic */ D0(G0 g02, int i12) {
        this.f51934b = i12;
        this.f51935c = g02;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        G0 g02 = this.f51935c;
        switch (this.f51934b) {
            case 0:
                int i12 = G0.f52048x;
                androidx.media3.common.util.M.I(g02.f52297k, runnable);
                break;
            case 1:
                int i13 = G0.f52048x;
                androidx.media3.common.util.M.I(g02.f52297k, runnable);
                break;
            case 2:
                int i14 = G0.f52048x;
                androidx.media3.common.util.M.I(g02.f52297k, runnable);
                break;
            case 3:
                int i15 = G0.f52048x;
                androidx.media3.common.util.M.I(g02.f52297k, runnable);
                break;
            default:
                int i16 = G0.f52048x;
                androidx.media3.common.util.M.I(g02.f52297k, runnable);
                break;
        }
    }
}
