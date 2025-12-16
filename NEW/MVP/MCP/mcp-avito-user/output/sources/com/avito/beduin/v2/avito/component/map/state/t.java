package com.avito.beduin.v2.avito.component.map.state;

import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.beduin.v2.avito.component.map.state.RemotePinView;
import kotlin.Metadata;

/* compiled from: PinView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/t;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/map/state/RemotePinView$a;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class t implements com.avito.beduin.v2.theme.d<RemotePinView.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final t f334753a = new t();

    @Y61.l
    public static RemotePinView.a b(@Y61.k com.avito.beduin.v2.engine.component.G g12) {
        Integer numA;
        String string = g12.getString(ContextActionHandler.Link.URL);
        if (string == null || (numA = g12.a("width")) == null) {
            return null;
        }
        int iIntValue = numA.intValue();
        Integer numA2 = g12.a("height");
        if (numA2 != null) {
            return new RemotePinView.a(string, iIntValue, numA2.intValue());
        }
        return null;
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ RemotePinView.a a(com.avito.beduin.v2.engine.component.G g12) {
        return b(g12);
    }
}
