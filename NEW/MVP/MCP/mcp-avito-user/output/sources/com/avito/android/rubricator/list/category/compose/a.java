package com.avito.android.rubricator.list.category.compose;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.I3;
import androidx.compose.ui.graphics.InterfaceC22276o0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rubricator.list.category.model.CategoryListItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryColumnItem.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "rotation", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: CategoryColumnItem.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.rubricator.list.category.compose.a$a, reason: collision with other inner class name */
    public static final class C7658a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<CategoryListItem, G0> f255857l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ CategoryListItem f255858m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7658a(l<? super CategoryListItem, G0> lVar, CategoryListItem categoryListItem) {
            super(0);
            this.f255857l = lVar;
            this.f255858m = categoryListItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f255857l.invoke(this.f255858m);
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryColumnItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/o0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/o0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<InterfaceC22276o0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I3<Float> f255859l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(I3<Float> i32) {
            super(1);
            this.f255859l = i32;
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC22276o0 interfaceC22276o0) {
            interfaceC22276o0.d(this.f255859l.getF42167b().floatValue());
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryColumnItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CategoryListItem f255860l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<CategoryListItem, G0> f255861m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<DeepLink, G0> f255862n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(CategoryListItem categoryListItem, l<? super CategoryListItem, G0> lVar, l<? super DeepLink, G0> lVar2, int i12) {
            super(2);
            this.f255860l = categoryListItem;
            this.f255861m = lVar;
            this.f255862n = lVar2;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            l<DeepLink, G0> lVar = this.f255862n;
            a.a(this.f255860l, this.f255861m, lVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryColumnItem.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<DeepLink, G0> f255863l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ CategoryListItem f255864m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(l<? super DeepLink, G0> lVar, CategoryListItem categoryListItem) {
            super(0);
            this.f255863l = lVar;
            this.f255864m = categoryListItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f255863l.invoke(this.f255864m.f255920d);
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryColumnItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CategoryListItem f255865l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<DeepLink, G0> f255866m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f255867n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(CategoryListItem categoryListItem, l<? super DeepLink, G0> lVar, int i12) {
            super(2);
            this.f255865l = categoryListItem;
            this.f255866m = lVar;
            this.f255867n = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f255867n | 1);
            a.b(this.f255865l, this.f255866m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019e  */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean, int] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.rubricator.list.category.model.CategoryListItem r44, @Y61.k Y41.l<? super com.avito.android.rubricator.list.category.model.CategoryListItem, kotlin.G0> r45, @Y61.k Y41.l<? super com.avito.android.deep_linking.links.DeepLink, kotlin.G0> r46, @Y61.l androidx.compose.runtime.A r47, int r48) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rubricator.list.category.compose.a.a(com.avito.android.rubricator.list.category.model.CategoryListItem, Y41.l, Y41.l, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.avito.android.rubricator.list.category.model.CategoryListItem r18, Y41.l<? super com.avito.android.deep_linking.links.DeepLink, kotlin.G0> r19, androidx.compose.runtime.A r20, int r21) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rubricator.list.category.compose.a.b(com.avito.android.rubricator.list.category.model.CategoryListItem, Y41.l, androidx.compose.runtime.A, int):void");
    }
}
