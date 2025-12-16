package com.avito.android.category_items_tree.screens.items_screen.components;

import androidx.compose.runtime.internal.C22096n;
import com.avito.android.category_items_tree.generated.api.api_1_promo_category_tree_items.Api1PromoCategoryTreeItemsResponse;
import com.avito.android.category_items_tree.screens.items_screen.a;
import com.avito.android.deep_linking.links.EmptyDeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: CategoryItemsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final A f116819a = new A();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f116820b = new C22096n(9665057, a.f116822l, false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22096n f116821c = new C22096n(177110142, b.f116823l, false);

    /* compiled from: CategoryItemsScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f116822l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                i.b("Аудио и видео", Api1PromoCategoryTreeItemsResponse.ActionType.Button, C42745f0.U(new a.b("1", "Беспроводные наушники Creative Zen Air White", new a.d("4 800 ₽", "6 000 ₽", "–20%"), "", false, new EmptyDeepLink(), new a.C3406a("50 ₽", "114", "18", "4", null, null)), new a.b("2", "Наушники проводные белые Honor АМ115", new a.d("635 ₽", null, null), "", false, new EmptyDeepLink(), new a.C3406a("50 ₽", "12", "182", "14", null, null)), a.c.f116813a), z.f116923l, null, a13, 3126, 16);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryItemsScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f116823l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                i.c(null, a13, 0, 1);
            }
            return G0.f406611a;
        }
    }
}
