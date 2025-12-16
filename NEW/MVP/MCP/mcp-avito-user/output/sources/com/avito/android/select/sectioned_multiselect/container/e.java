package com.avito.android.select.sectioned_multiselect.container;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.tab.adapter.j;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.select.sectioned_multiselect.container.tab_layout.ContainerTabItem;
import com.avito.android.select.sectioned_multiselect.core.N;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kq0.C43487a;
import l41.o;

/* compiled from: SectionedMultiselectContainerPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/container/e;", "Lcom/avito/android/select/sectioned_multiselect/container/d;", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements com.avito.android.select.sectioned_multiselect.container.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.select.sectioned_multiselect.core.P f266446a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f266447b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final N f266448c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public h f266449d;

    /* compiled from: SectionedMultiselectContainerPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/container/e$a;", "", "a", "b", "Lcom/avito/android/select/sectioned_multiselect/container/e$a$a;", "Lcom/avito/android/select/sectioned_multiselect/container/e$a$b;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: SectionedMultiselectContainerPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/container/e$a$a;", "Lcom/avito/android/select/sectioned_multiselect/container/e$a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.select.sectioned_multiselect.container.e$a$a, reason: collision with other inner class name */
        public static final /* data */ class C7949a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ArrayList f266450a;

            public C7949a(@k ArrayList arrayList) {
                this.f266450a = arrayList;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7949a) && this.f266450a.equals(((C7949a) obj).f266450a);
            }

            public final int hashCode() {
                return this.f266450a.hashCode();
            }

            @k
            public final String toString() {
                return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("MultiTabData(data="), this.f266450a, ')');
            }
        }

        /* compiled from: SectionedMultiselectContainerPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/container/e$a$b;", "Lcom/avito/android/select/sectioned_multiselect/container/e$a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final List<ContainerTabItem> f266451a;

            public b(@k List<ContainerTabItem> list) {
                this.f266451a = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f266451a, ((b) obj).f266451a);
            }

            public final int hashCode() {
                return this.f266451a.hashCode();
            }

            @k
            public final String toString() {
                return H.p(new StringBuilder("WithoutTabData(data="), this.f266451a, ')');
            }
        }
    }

    /* compiled from: SectionedMultiselectContainerPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "it", "Lcom/avito/android/select/sectioned_multiselect/container/e$a;", "apply", "(Ljava/util/Set;)Lcom/avito/android/select/sectioned_multiselect/container/e$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Set set = (Set) obj;
            e eVar = e.this;
            List<SectionedMultiselectParameter.Tab> listP4 = eVar.f266446a.p4();
            com.avito.android.select.sectioned_multiselect.core.P p12 = eVar.f266446a;
            boolean f266526s = p12.getF266526S();
            if (listP4 == null) {
                return new a.b(Collections.singletonList(new ContainerTabItem(null, "", "")));
            }
            List<SectionedMultiselectParameter.Tab> list = listP4;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (SectionedMultiselectParameter.Tab tab : list) {
                String id2 = tab.getId();
                String tabTitle = tab.getTabTitle();
                List<SectionedMultiselectParameter.Value> listJ8 = p12.j8(tab.getId());
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = listJ8.iterator();
                while (it.hasNext()) {
                    List<SectionedMultiselectParameter.Value> options = ((SectionedMultiselectParameter.Value) it.next()).getOptions();
                    if (options == null) {
                        options = C42784z0.f406748b;
                    }
                    C42745f0.h(options, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (T t12 : set) {
                    if (t12 instanceof SectionedMultiselectParameter.Value) {
                        arrayList3.add(t12);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (arrayList2.contains((SectionedMultiselectParameter.Value) next)) {
                        arrayList4.add(next);
                    }
                }
                arrayList.add(new ContainerTabItem(id2, tabTitle, !arrayList4.isEmpty() ? String.valueOf(arrayList4.size()) : (set.isEmpty() || !f266526s) ? eVar.f266448c.f266514a.getString(R.string.all_chosen) : ""));
            }
            return new a.C7949a(arrayList);
        }
    }

    /* compiled from: SectionedMultiselectContainerPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/container/e$a;", "tabData", "Lkotlin/G0;", "accept", "(Lcom/avito/android/select/sectioned_multiselect/container/e$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            h hVar;
            boolean z12;
            a aVar = (a) obj;
            boolean z13 = aVar instanceof a.C7949a;
            e eVar = e.this;
            if (!z13) {
                if (!(aVar instanceof a.b) || (hVar = eVar.f266449d) == null) {
                    return;
                }
                List<ContainerTabItem> list = ((a.b) aVar).f266451a;
                j<ContainerTabItem> jVar = hVar.f266459b;
                z12 = jVar.getCount() == 0;
                D6.w(hVar.f266462e);
                if (z12) {
                    jVar.E5(list);
                    hVar.f266460c.notifyDataSetChanged();
                    return;
                }
                return;
            }
            h hVar2 = eVar.f266449d;
            if (hVar2 != null) {
                ArrayList arrayList = ((a.C7949a) aVar).f266450a;
                j<ContainerTabItem> jVar2 = hVar2.f266459b;
                z12 = jVar2.getCount() == 0;
                AvitoTabLayout avitoTabLayout = hVar2.f266462e;
                D6.H(avitoTabLayout);
                jVar2.E5(arrayList);
                C43487a c43487a = hVar2.f266458a;
                if (!z12) {
                    c43487a.d();
                    return;
                }
                c43487a.d();
                hVar2.f266460c.notifyDataSetChanged();
                int i12 = hVar2.f266461d;
                if (i12 != -1) {
                    avitoTabLayout.q(avitoTabLayout.j(i12), true);
                }
            }
        }
    }

    /* compiled from: SectionedMultiselectContainerPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f266454b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    @Inject
    public e(@k com.avito.android.select.sectioned_multiselect.core.P p12, @k InterfaceC35745a5 interfaceC35745a5, @k N n12) {
        this.f266446a = p12;
        this.f266447b = interfaceC35745a5;
        this.f266448c = n12;
    }

    @Override // com.avito.android.select.sectioned_multiselect.container.d
    public final void a() {
        com.avito.android.select.sectioned_multiselect.core.P p12 = this.f266446a;
        z zVarG0 = z.g0(p12.Gb(), p12.Td());
        InterfaceC35745a5 interfaceC35745a5 = this.f266447b;
        zVarG0.x0(interfaceC35745a5.a()).d0(new b()).j0(interfaceC35745a5.e()).u0(new c(), d.f266454b);
    }

    @Override // com.avito.android.select.sectioned_multiselect.container.d
    public final void b(@k h hVar) {
        this.f266449d = hVar;
    }

    @Override // com.avito.android.select.sectioned_multiselect.container.d
    public final void e0() {
        this.f266449d = null;
    }
}
