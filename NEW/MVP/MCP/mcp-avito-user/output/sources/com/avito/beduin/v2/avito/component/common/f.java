package com.avito.beduin.v2.avito.component.common;

import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.s;
import kotlin.Metadata;

/* compiled from: ColorPatchDeclaration.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/common/f;", "Lcom/avito/beduin/v2/theme/d;", "Lcom/avito/beduin/v2/avito/component/common/e;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements com.avito.beduin.v2.theme.d<e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final f f334125a = new f();

    @Override // com.avito.beduin.v2.theme.d
    public final e a(G g12) {
        return new e(s.b(g12, "default"), s.b(g12, "pressed"), s.b(g12, BeduinCartItemModel.DISABLED_STRING));
    }
}
