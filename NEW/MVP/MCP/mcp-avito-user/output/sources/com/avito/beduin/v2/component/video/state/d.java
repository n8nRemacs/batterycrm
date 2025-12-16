package com.avito.beduin.v2.component.video.state;

import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: VideoState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/video/state/d;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/component/video/state/c;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class d implements com.avito.beduin.v2.theme.d<c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d f336359a = new d();

    @Y61.l
    public static c b(@Y61.k G g12) {
        String string = g12.getString(ContextActionHandler.Link.URL);
        if (string == null) {
            return null;
        }
        String string2 = g12.getString("scale");
        if (string2 == null) {
            VideoScale[] videoScaleArr = VideoScale.f336354b;
            string2 = "Fit";
        }
        return new c(string, VideoScale.valueOf(string2));
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ c a(G g12) {
        return b(g12);
    }
}
