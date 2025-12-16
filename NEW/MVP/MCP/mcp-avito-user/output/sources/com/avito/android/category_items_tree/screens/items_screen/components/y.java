package com.avito.android.category_items_tree.screens.items_screen.components;

import androidx.compose.runtime.internal.C22096n;
import com.avito.android.category_items_tree.generated.api.api_1_promo_category_tree_items.Api1PromoCategoryTreeItemsResponse;
import com.avito.android.category_items_tree.screens.items_screen.a;
import com.avito.android.deep_linking.links.EmptyDeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final y f116918a = new y();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f116919b = new C22096n(1271861332, a.f116921l, false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22096n f116920c = new C22096n(105198632, b.f116922l, false);

    /* compiled from: CategoryItem.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f116921l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                C29367b.a(new a.b("", "Беспроводные наушники Creative Zen Air White", new a.d("4 800 000 ₽", "6 000 000 ₽", "–20%"), "", false, new EmptyDeepLink(), new a.C3406a("50 ₽", "100000", "1000", "1000", "Авто рассылка", null)), Api1PromoCategoryTreeItemsResponse.ActionType.Item, x.f116917l, null, a13, 432);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryItem.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f116922l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                C29367b.f(null, a13, 0, 1);
            }
            return G0.f406611a;
        }
    }
}
