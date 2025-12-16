package com.avito.beduin.v2.avito.component.circularCounter.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: Content.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/circularCounter/state/l;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/circularCounter/state/k;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class l implements com.avito.beduin.v2.theme.d<k> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final l f334109a = new l();

    @Override // com.avito.beduin.v2.theme.d
    public final k a(G g12) {
        String string = g12.getString("value");
        if (string == null) {
            return null;
        }
        return new k(string);
    }
}
