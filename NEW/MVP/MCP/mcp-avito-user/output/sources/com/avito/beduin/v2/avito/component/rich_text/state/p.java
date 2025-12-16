package com.avito.beduin.v2.avito.component.rich_text.state;

import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: RichTextSegmentStyleDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/rich_text/state/p;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/rich_text/state/o;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p implements com.avito.beduin.v2.theme.d<o> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final p f334949a = new p();

    @Y61.k
    public static o b(@Y61.k G g12) {
        com.avito.beduin.v2.theme.l lVarC = com.avito.beduin.v2.theme.h.c(g12, "textStyle", com.avito.beduin.v2.avito.component.text.state.n.f335362b);
        Boolean boolC = g12.c("underline");
        boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
        Boolean boolC2 = g12.c("strikethrough");
        return new o(lVarC, zBooleanValue, boolC2 != null ? boolC2.booleanValue() : false);
    }

    @Override // com.avito.beduin.v2.theme.d
    public final /* bridge */ /* synthetic */ o a(G g12) {
        return b(g12);
    }
}
