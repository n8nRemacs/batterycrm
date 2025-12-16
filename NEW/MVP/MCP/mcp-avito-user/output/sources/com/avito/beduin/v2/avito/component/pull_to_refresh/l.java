package com.avito.beduin.v2.avito.component.pull_to_refresh;

import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.o;
import com.avito.beduin.v2.theme.s;
import kotlin.Metadata;

/* compiled from: AvitoPullToRefreshStylePatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/pull_to_refresh/l;", "Lcom/avito/beduin/v2/theme/o;", "Lcom/avito/beduin/v2/avito/component/pull_to_refresh/i;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l extends o<i> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final l f334877b = new l();

    public l() {
        super(h.f334869c.f336560a);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final Object a(G g12) {
        return new i(g12.getString("themeName"), c(g12), com.avito.beduin.v2.theme.h.a(g12, "spinnerSize", j.f334875l), com.avito.beduin.v2.theme.h.a(g12, "spinnerThickness", k.f334876l), s.b(g12, "spinnerColor"));
    }
}
