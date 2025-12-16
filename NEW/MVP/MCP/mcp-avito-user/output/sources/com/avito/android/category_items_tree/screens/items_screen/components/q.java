package com.avito.android.category_items_tree.screens.items_screen.components;

import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.category_items_tree.generated.api.api_1_promo_category_tree_items.Api1PromoCategoryTreeItemsResponse;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class q extends N implements Y41.r<InterfaceC20793y, Integer, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f116889l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Api1PromoCategoryTreeItemsResponse.ActionType f116890m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f116891n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(List list, Api1PromoCategoryTreeItemsResponse.ActionType actionType, InterfaceC22204y1 interfaceC22204y1) {
        super(4);
        this.f116889l = list;
        this.f116890m = actionType;
        this.f116891n = interfaceC22204y1;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    @Override // Y41.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.foundation.lazy.InterfaceC20793y r9, java.lang.Integer r10, androidx.compose.runtime.A r11, java.lang.Integer r12) {
        /*
            r8 = this;
            r0 = 1
            r1 = 6
            androidx.compose.foundation.lazy.y r9 = (androidx.compose.foundation.lazy.InterfaceC20793y) r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            androidx.compose.runtime.A r11 = (androidx.compose.runtime.A) r11
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r2 = r12 & 6
            r3 = 2
            if (r2 != 0) goto L22
            boolean r9 = r11.B(r9)
            if (r9 == 0) goto L1f
            r9 = 4
            goto L20
        L1f:
            r9 = r3
        L20:
            r9 = r9 | r12
            goto L23
        L22:
            r9 = r12
        L23:
            r12 = r12 & 48
            r2 = 16
            if (r12 != 0) goto L34
            boolean r12 = r11.m(r10)
            if (r12 == 0) goto L32
            r12 = 32
            goto L33
        L32:
            r12 = r2
        L33:
            r9 = r9 | r12
        L34:
            r12 = r9 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            r5 = 0
            if (r12 == r4) goto L3d
            r12 = r0
            goto L3e
        L3d:
            r12 = r5
        L3e:
            r9 = r9 & r0
            boolean r9 = r11.p(r9, r12)
            if (r9 == 0) goto Lca
            java.util.List r9 = r8.f116889l
            java.lang.Object r9 = r9.get(r10)
            com.avito.android.category_items_tree.screens.items_screen.a r9 = (com.avito.android.category_items_tree.screens.items_screen.a) r9
            r10 = -253195730(0xfffffffff0e88a2e, float:-5.7574057E29)
            r11.C(r10)
            boolean r10 = r9 instanceof com.avito.android.category_items_tree.screens.items_screen.a.b
            if (r10 == 0) goto L9c
            r10 = -253147309(0xfffffffff0e94753, float:-5.7756986E29)
            r11.C(r10)
            r2 = r9
            com.avito.android.category_items_tree.screens.items_screen.a$b r2 = (com.avito.android.category_items_tree.screens.items_screen.a.b) r2
            r10 = 1377313051(0x5218211b, float:1.6334761E11)
            r11.C(r10)
            androidx.compose.runtime.y1 r10 = r8.f116891n
            boolean r12 = r11.B(r10)
            boolean r0 = r11.B(r9)
            r12 = r12 | r0
            java.lang.Object r0 = r11.t()
            if (r12 != 0) goto L80
            androidx.compose.runtime.A$a r12 = androidx.compose.runtime.A.f37866a
            r12.getClass()
            androidx.compose.runtime.A$a$a r12 = androidx.compose.runtime.A.a.f37868b
            if (r0 != r12) goto L8a
        L80:
            com.avito.android.category_items_tree.screens.items_screen.components.n r0 = new com.avito.android.category_items_tree.screens.items_screen.components.n
            com.avito.android.category_items_tree.screens.items_screen.a$b r9 = (com.avito.android.category_items_tree.screens.items_screen.a.b) r9
            r0.<init>(r9, r10)
            r11.H(r0)
        L8a:
            r4 = r0
            Y41.a r4 = (Y41.a) r4
            r11.h()
            r5 = 0
            r7 = 0
            com.avito.android.category_items_tree.generated.api.api_1_promo_category_tree_items.Api1PromoCategoryTreeItemsResponse$ActionType r3 = r8.f116890m
            r6 = r11
            com.avito.android.category_items_tree.screens.items_screen.components.C29367b.a(r2, r3, r4, r5, r6, r7)
            r11.h()
            goto Lc6
        L9c:
            boolean r9 = r9 instanceof com.avito.android.category_items_tree.screens.items_screen.a.c
            if (r9 == 0) goto Lbd
            r9 = -252439145(0xfffffffff0f41597, float:-6.0432354E29)
            r11.C(r9)
            r9 = r5
        La7:
            r10 = 5
            if (r9 >= r10) goto Lb9
            androidx.compose.ui.v$a r10 = androidx.compose.ui.v.f42878y1
            float r12 = (float) r2
            androidx.compose.ui.unit.h$a r4 = androidx.compose.ui.unit.h.f42849c
            r4 = 0
            androidx.compose.ui.v r10 = androidx.compose.foundation.layout.R1.k(r12, r4, r3, r10)
            com.avito.android.category_items_tree.screens.items_screen.components.C29367b.f(r10, r11, r1, r5)
            int r9 = r9 + r0
            goto La7
        Lb9:
            r11.h()
            goto Lc6
        Lbd:
            r9 = -252159773(0xfffffffff0f858e3, float:-6.1487792E29)
            r11.C(r9)
            r11.h()
        Lc6:
            r11.h()
            goto Lcd
        Lca:
            r11.f()
        Lcd:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category_items_tree.screens.items_screen.components.q.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
