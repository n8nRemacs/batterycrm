package defpackage;

import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;

/* loaded from: classes2.dex */
public final /* synthetic */ class sc7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ IdMappingWrapper b;

    public /* synthetic */ sc7(IdMappingWrapper idMappingWrapper, int i) {
        this.a = i;
        this.b = idMappingWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.writeCacheToDisk();
                break;
            default:
                this.b.readCacheFromDisk();
                break;
        }
    }
}
