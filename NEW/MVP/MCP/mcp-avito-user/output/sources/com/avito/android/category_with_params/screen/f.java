package com.avito.android.category_with_params.screen;

import Y41.p;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import com.avito.android.category_with_params.entity.ListItem;
import fo.InterfaceC40453a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryItems.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_category-with-params_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f {

    /* compiled from: CategoryItems.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<m0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<ListItem> f117722l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ float f117723m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f117724n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC40453a, G0> f117725o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends ListItem> list, float f12, boolean z12, Y41.l<? super InterfaceC40453a, G0> lVar) {
            super(1);
            this.f117722l = list;
            this.f117723m = f12;
            this.f117724n = z12;
            this.f117725o = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(m0 m0Var) {
            m0 m0Var2 = m0Var;
            com.avito.android.category_with_params.screen.a aVar = com.avito.android.category_with_params.screen.a.f117712l;
            com.avito.android.category_with_params.screen.b bVar = com.avito.android.category_with_params.screen.b.f117713l;
            List<ListItem> list = this.f117722l;
            m0Var2.a(list.size(), aVar != null ? new c(aVar, list) : null, new d(bVar, list), new C22096n(-632812321, new e(list, this.f117723m, this.f117724n, this.f117725o), true));
            return G0.f406611a;
        }
    }

    /* compiled from: CategoryItems.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<ListItem> f117726l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f117727m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC40453a, G0> f117728n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f117729o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends ListItem> list, boolean z12, Y41.l<? super InterfaceC40453a, G0> lVar, int i12) {
            super(2);
            this.f117726l = list;
            this.f117727m = z12;
            this.f117728n = lVar;
            this.f117729o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f117729o | 1);
            boolean z12 = this.f117727m;
            Y41.l<InterfaceC40453a, G0> lVar = this.f117728n;
            f.a(this.f117726l, z12, lVar, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k List<? extends ListItem> list, boolean z12, @Y61.k Y41.l<? super InterfaceC40453a, G0> lVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-1815841238);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        C20650b.a(null, null, R1.e(0.0f, 0.0f, 0.0f, 82, 7), false, null, null, null, false, null, new a(list, 16, z12, lVar), bE2, 384, 507);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(list, z12, lVar, i12);
        }
    }
}
