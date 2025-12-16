package com.avito.android.category_items_tree.screens.items_screen.components;

import Yn.InterfaceC18301a;
import androidx.compose.runtime.C22066f2;
import com.avito.android.category_items_tree.generated.api.api_1_promo_category_tree_items.Api1PromoCategoryTreeItemsResponse;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryItemsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class t extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f116905l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Api1PromoCategoryTreeItemsResponse.ActionType f116906m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List<com.avito.android.category_items_tree.screens.items_screen.a> f116907n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC18301a, G0> f116908o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f116909p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f116910q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f116911r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(String str, Api1PromoCategoryTreeItemsResponse.ActionType actionType, List<? extends com.avito.android.category_items_tree.screens.items_screen.a> list, Y41.l<? super InterfaceC18301a, G0> lVar, androidx.compose.ui.v vVar, int i12, int i13) {
        super(2);
        this.f116905l = str;
        this.f116906m = actionType;
        this.f116907n = list;
        this.f116908o = lVar;
        this.f116909p = vVar;
        this.f116910q = i12;
        this.f116911r = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f116910q | 1);
        androidx.compose.ui.v vVar = this.f116909p;
        List<com.avito.android.category_items_tree.screens.items_screen.a> list = this.f116907n;
        i.b(this.f116905l, this.f116906m, list, this.f116908o, vVar, a12, iA2, this.f116911r);
        return G0.f406611a;
    }
}
