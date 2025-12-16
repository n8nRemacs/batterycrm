package com.avito.beduin.v2.avito.component.image.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContentDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/image/state/l;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/image/state/k;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements com.avito.beduin.v2.theme.d<k> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final l f334424a = new l();

    @Y61.l
    @InterfaceC42830m
    public static k b(@Y61.k G g12, @Y61.k String str, @Y61.l Scale scale) {
        String string = g12.getString(str);
        if (L.f(string, "localIcon")) {
            p.f334430a.getClass();
            return p.b(g12, scale);
        }
        if (!L.f(string, "remoteImage")) {
            return null;
        }
        r.f334447a.getClass();
        return r.b(g12, scale);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final k a(G g12) {
        return b(g12, "mode", null);
    }
}
