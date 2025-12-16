package com.avito.beduin.v2.avito.component.image.state;

import com.avito.beduin.v2.avito.component.image.state.Scale;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FallbackDeclaration.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/image/state/w;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/image/state/u;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class w implements com.avito.beduin.v2.theme.d<u> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final w f334456a = new w();

    @Y61.k
    public static u b(@Y61.k G g12) {
        Scale scaleA;
        String string = g12.getString("name");
        if (string == null) {
            string = "";
        }
        String string2 = g12.getString("themeName");
        com.avito.beduin.v2.theme.r rVar = (com.avito.beduin.v2.theme.r) g12.f(v.f334455l, "color", "color");
        String string3 = g12.getString("scale");
        if (string3 != null) {
            Scale.f334399d.getClass();
            scaleA = Scale.a.a(string3);
        } else {
            scaleA = Scale.f334400e;
        }
        return new u(string, string2, rVar, scaleA);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ u a(G g12) {
        return b(g12);
    }
}
