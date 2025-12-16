package com.avito.android.advert.item.beduin;

import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23040h0;
import bj.AbstractC25658a;
import com.avito.android.R;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.form.BeduinForm;
import com.avito.android.util.InterfaceC35745a5;
import dj.InterfaceC39736a;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;

/* compiled from: AdvertDetailsBeduinItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/beduin/AdvertDetailsBeduinItemViewImpl;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/beduin/i;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertDetailsBeduinItemViewImpl extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f73211b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final k f73212c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.advert.l f73213d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f73214e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f73215f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f73216g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public y f73217h;

    /* compiled from: AdvertDetailsBeduinItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/beduin/AdvertDetailsBeduinItemViewImpl$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.beduin.AdvertDetailsBeduinItemViewImpl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public final boolean J() {
            return false;
        }
    }

    /* compiled from: AdvertDetailsBeduinItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/beduin_models/BeduinModel;", "kotlin.jvm.PlatformType", "beduinItems", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<List<? extends BeduinModel>, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetailsBeduinItem f73219m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdvertDetailsBeduinItem advertDetailsBeduinItem) {
            super(1);
            this.f73219m = advertDetailsBeduinItem;
        }

        @Override // Y41.l
        public final G0 invoke(List<? extends BeduinModel> list) {
            List<? extends BeduinModel> list2 = list;
            AdvertDetailsBeduinItemViewImpl advertDetailsBeduinItemViewImpl = AdvertDetailsBeduinItemViewImpl.this;
            if (list2 == null) {
                advertDetailsBeduinItemViewImpl.f73216g.setVisibility(8);
            } else if (!list2.isEmpty()) {
                com.avito.android.beduin.common.form.store.b f103565k = advertDetailsBeduinItemViewImpl.f73214e.getF103565k();
                AdvertDetailsBeduinItem advertDetailsBeduinItem = this.f73219m;
                InterfaceC43779a interfaceC43779aJ = f103565k.get(advertDetailsBeduinItem.f73206b);
                if (interfaceC43779aJ == null) {
                    interfaceC43779aJ = advertDetailsBeduinItemViewImpl.f73214e.j();
                    com.avito.android.beduin_shared.model.utils.m.b(interfaceC43779aJ, new BeduinForm(advertDetailsBeduinItem.f73206b, list2));
                }
                advertDetailsBeduinItemViewImpl.f73216g.setVisibility(0);
                y yVar = advertDetailsBeduinItemViewImpl.f73217h;
                if (yVar != null) {
                    DisposableHelper.a(yVar);
                }
                I0 i0J0 = interfaceC43779aJ.getF103348p().j0(advertDetailsBeduinItemViewImpl.f73215f.e());
                final AbstractC25658a<? extends RecyclerView.C> abstractC25658a = advertDetailsBeduinItemViewImpl.f73211b;
                advertDetailsBeduinItemViewImpl.f73217h = (y) i0J0.t0(new l41.g() { // from class: com.avito.android.advert.item.beduin.j
                    @Override // l41.g
                    public final void accept(Object obj) {
                        abstractC25658a.m((List) obj);
                    }
                });
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsBeduinItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f73220b;

        public b(Y41.l lVar) {
            this.f73220b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f73220b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f73220b;
        }

        public final int hashCode() {
            return this.f73220b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f73220b.invoke(obj);
        }
    }

    public AdvertDetailsBeduinItemViewImpl(@Y61.k View view, @Y61.k InterfaceC39736a interfaceC39736a, @Y61.k AbstractC25658a<? extends RecyclerView.C> abstractC25658a, @Y61.k k kVar, @Y61.k com.avito.android.advert_core.advert.l lVar, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super(view);
        this.f73211b = abstractC25658a;
        this.f73212c = kVar;
        this.f73213d = lVar;
        this.f73214e = interfaceC40691b;
        this.f73215f = interfaceC35745a5;
        View viewFindViewById = view.findViewById(R.id.beduin_items_recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f73216g = recyclerView;
        recyclerView.setAdapter(abstractC25658a);
        recyclerView.setScrollContainer(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new AnonymousClass1());
        abstractC25658a.o(interfaceC39736a);
    }

    @Override // com.avito.android.advert.item.beduin.i
    public final void PM(@Y61.k AdvertDetailsBeduinItem advertDetailsBeduinItem) {
        k kVar = this.f73212c;
        kVar.getF73244N().observe(this.f73213d.e(), new b(new a(advertDetailsBeduinItem)));
        kVar.B(advertDetailsBeduinItem.f73207c);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        y yVar = this.f73217h;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}
