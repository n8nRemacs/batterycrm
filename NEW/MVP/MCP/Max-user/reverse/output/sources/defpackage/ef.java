package defpackage;

import one.me.sdk.media.ffmpeg.AnimatedFileDrawable;

/* loaded from: classes2.dex */
public final /* synthetic */ class ef implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ df b;

    public /* synthetic */ ef(df dfVar, int i) {
        this.a = i;
        this.b = dfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                df dfVar = this.b;
                dfVar.b.p1.b();
                ie.d(new ef(dfVar, 1));
                break;
            default:
                AnimatedFileDrawable animatedFileDrawable = this.b.b;
                if (animatedFileDrawable.t1 != null) {
                    cq0.c();
                    animatedFileDrawable.t1 = null;
                }
                animatedFileDrawable.s1 = false;
                AnimatedFileDrawable.a(animatedFileDrawable);
                animatedFileDrawable.e();
                break;
        }
    }
}
