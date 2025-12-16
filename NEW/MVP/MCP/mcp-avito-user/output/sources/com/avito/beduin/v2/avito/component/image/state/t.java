package com.avito.beduin.v2.avito.component.image.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FallbackDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/image/state/t;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/image/state/s;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class t implements com.avito.beduin.v2.theme.d<s> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final t f334450a = new t();

    @Y61.l
    public static u b(@Y61.k G g12) {
        if (!L.f(g12.getString("mode"), "localIcon")) {
            return null;
        }
        w.f334456a.getClass();
        return w.b(g12);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ s a(G g12) {
        return b(g12);
    }
}
