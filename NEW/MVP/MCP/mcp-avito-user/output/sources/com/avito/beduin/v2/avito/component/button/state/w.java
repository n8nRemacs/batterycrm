package com.avito.beduin.v2.avito.component.button.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ButtonIcon.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/button/state/w;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/button/state/v;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w implements com.avito.beduin.v2.theme.d<v> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final w f333993a = new w();

    @Y61.l
    public static v b(@Y61.k G g12) {
        String string = g12.getString("type");
        if (L.f(string, "TextIcon")) {
            A.f333934a.getClass();
            String string2 = g12.getString("name");
            if (string2 == null) {
                return null;
            }
            return new z(string2, g12.getString("themeName"));
        }
        if (!L.f(string, "LocalIcon")) {
            return null;
        }
        y.f333996a.getClass();
        String string3 = g12.getString("name");
        if (string3 == null) {
            return null;
        }
        return new x(string3, g12.getString("themeName"));
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ v a(G g12) {
        return b(g12);
    }
}
