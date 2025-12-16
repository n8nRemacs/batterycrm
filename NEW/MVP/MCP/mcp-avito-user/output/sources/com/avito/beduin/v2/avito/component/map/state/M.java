package com.avito.beduin.v2.avito.component.map.state;

import com.avito.beduin.v2.avito.component.map.state.RemotePinView;
import kotlin.Metadata;

/* compiled from: PinView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/M;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/map/state/RemotePinView;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class M implements com.avito.beduin.v2.theme.d<RemotePinView> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final M f334630a = new M();

    @Y61.l
    public static RemotePinView b(@Y61.k com.avito.beduin.v2.engine.component.G g12) {
        RemotePinView.a aVar = (RemotePinView.a) g12.f(L.f334629l, "image", "image");
        if (aVar == null) {
            return null;
        }
        RemotePinView.a aVar2 = (RemotePinView.a) g12.f(J.f334627l, "imageDark", "imageDark");
        if (aVar2 == null) {
            aVar2 = aVar;
        }
        return new RemotePinView(aVar, aVar2, (RemotePinView.RemotePinText) g12.f(K.f334628l, "text", "text"));
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ RemotePinView a(com.avito.beduin.v2.engine.component.G g12) {
        return b(g12);
    }
}
