package androidx.media3.exoplayer;

import androidx.media3.common.H;
import androidx.media3.common.util.InterfaceC23115f;
import androidx.media3.common.util.r;
import com.adjust.sdk.network.ErrorCodes;
import com.google.common.base.InterfaceC37276u;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.exoplayer.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23179x implements r.a, InterfaceC37276u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50341b;

    public static void a(StringBuilder sb2, int i12, String str, int i13, String str2) {
        sb2.append(i12);
        sb2.append(str);
        sb2.append(i13);
        sb2.append(str2);
    }

    @Override // com.google.common.base.InterfaceC37276u
    public Object apply(Object obj) {
        return new androidx.media3.exoplayer.analytics.p((InterfaceC23115f) obj);
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        H.g gVar = (H.g) obj;
        switch (this.f50341b) {
            case 0:
                int i12 = A.f48357h0;
                gVar.g(new ExoPlaybackException(2, new ExoTimeoutException("Player release timed out."), ErrorCodes.MALFORMED_URL_EXCEPTION));
                break;
            default:
                gVar.onRenderedFirstFrame();
                break;
        }
    }
}
