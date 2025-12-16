package com.avito.android.category_items_tree.screens.tree_screen.components;

import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: Tree.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f117034a = new c();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f117035b = new C22096n(-1546757910, a.f117037l, false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22096n f117036c = new C22096n(-1705557936, b.f117038l, false);

    /* compiled from: Tree.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f117037l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a(C42745f0.U(new com.avito.android.category_items_tree.screens.tree_screen.k(0, "1", "Товары", false, true), new com.avito.android.category_items_tree.screens.tree_screen.k(1, "2", "Личные вещи", false, false), new com.avito.android.category_items_tree.screens.tree_screen.k(2, "3", "Одежда, обувь, аксессуары и другой текст две строки", true, false), new com.avito.android.category_items_tree.screens.tree_screen.k(2, "4", "Детская одежда и обувь", true, false)), C29372b.f117033l, a13, 48);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Tree.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f117038l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.b(null, a13, 0);
            }
            return G0.f406611a;
        }
    }
}
