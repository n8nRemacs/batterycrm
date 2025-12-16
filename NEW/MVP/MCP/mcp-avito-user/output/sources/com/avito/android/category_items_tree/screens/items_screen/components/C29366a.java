package com.avito.android.category_items_tree.screens.items_screen.components;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.category_items_tree.generated.api.api_1_promo_category_tree_items.Api1PromoCategoryTreeItemsResponse;
import com.avito.android.category_items_tree.screens.items_screen.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.category_items_tree.screens.items_screen.components.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29366a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a.b f116832l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Api1PromoCategoryTreeItemsResponse.ActionType f116833m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f116834n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f116835o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f116836p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29366a(a.b bVar, Api1PromoCategoryTreeItemsResponse.ActionType actionType, Y41.a aVar, v.a aVar2, int i12) {
        super(2);
        this.f116832l = bVar;
        this.f116833m = actionType;
        this.f116834n = aVar;
        this.f116835o = aVar2;
        this.f116836p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        C29367b.a(this.f116832l, this.f116833m, this.f116834n, this.f116835o, a12, C22066f2.a(this.f116836p | 1));
        return G0.f406611a;
    }
}
