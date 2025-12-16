package com.avito.beduin.v2.avito.component.button.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: ButtonIcon.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/button/state/y;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/button/state/x;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class y implements com.avito.beduin.v2.theme.d<x> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final y f333996a = new y();

    @Override // com.avito.beduin.v2.theme.d
    public final x a(G g12) {
        String string = g12.getString("name");
        if (string == null) {
            return null;
        }
        return new x(string, g12.getString("themeName"));
    }
}
