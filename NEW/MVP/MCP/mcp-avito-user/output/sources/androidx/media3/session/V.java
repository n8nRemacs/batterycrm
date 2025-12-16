package androidx.media3.session;

import androidx.media3.common.H;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.r;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class V implements r.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlaybackException f52324c;

    public /* synthetic */ V(int i12, PlaybackException playbackException) {
        this.f52323b = i12;
        this.f52324c = playbackException;
    }

    @Override // androidx.media3.common.util.r.a
    public final void invoke(Object obj) {
        H.g gVar = (H.g) obj;
        switch (this.f52323b) {
            case 0:
                gVar.p(this.f52324c);
                break;
            case 1:
                gVar.g(this.f52324c);
                break;
            case 2:
                gVar.p(this.f52324c);
                break;
            default:
                gVar.g(this.f52324c);
                break;
        }
    }
}
