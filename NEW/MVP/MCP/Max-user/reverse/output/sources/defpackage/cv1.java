package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl;

/* loaded from: classes2.dex */
public final /* synthetic */ class cv1 implements Runnable {
    public final /* synthetic */ em6 X;
    public final /* synthetic */ int a;
    public final /* synthetic */ CallsAudioManagerV2Impl b;
    public final /* synthetic */ cm6 c;
    public final /* synthetic */ cm6 d;
    public final /* synthetic */ String o;

    public /* synthetic */ cv1(CallsAudioManagerV2Impl callsAudioManagerV2Impl, cm6 cm6Var, cm6 cm6Var2, String str, em6 em6Var, int i) {
        this.a = i;
        this.b = callsAudioManagerV2Impl;
        this.c = cm6Var;
        this.d = cm6Var2;
        this.o = str;
        this.X = em6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CallsAudioManagerV2Impl.doOnOwnThreadWithDelay$lambda$9(this.b, this.c, this.d, this.o, this.X);
                break;
            default:
                CallsAudioManagerV2Impl.doOnOwnThread$lambda$8(this.b, this.c, this.d, this.o, this.X);
                break;
        }
    }
}
