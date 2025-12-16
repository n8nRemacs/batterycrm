package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.InterfaceC23174z;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class H implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J f49506c;

    public /* synthetic */ H(J j12, int i12) {
        this.f49505b = i12;
        this.f49506c = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J j12 = this.f49506c;
        switch (this.f49505b) {
            case 0:
                j12.f49517G = true;
                break;
            case 1:
                Map<String, String> map = J.f49509N;
                j12.o();
                break;
            default:
                if (!j12.f49523M) {
                    InterfaceC23174z.a aVar = j12.f49540r;
                    aVar.getClass();
                    aVar.g(j12);
                    break;
                }
                break;
        }
    }
}
