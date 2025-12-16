package com.avito.android.select.sectioned_multiselect.tab;

import Yp0.AbstractC18314a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.select.bottom_sheet_pagination.blueprints.PaginationState;
import com.avito.android.select.sectioned_multiselect.core.N;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;

/* compiled from: SectionedMultiselectTabPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/tab/n;", "Lcom/avito/android/select/sectioned_multiselect/tab/c;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f266780a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.sectioned_multiselect.Items.section_item.d f266781b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.d f266782c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.d f266783d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f266784e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.sectioned_multiselect.core.P f266785f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.sectioned_multiselect.b f266786g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.glow_animation.f f266787h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final z<PaginationState> f266788i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.select.g f266789j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final N f266790k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public t f266791l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f266792m = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f266793n = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f266794o = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.disposables.i f266795p = new io.reactivex.rxjava3.disposables.i(0);

    /* renamed from: q, reason: collision with root package name */
    public Set<? extends ParcelableEntity<String>> f266796q;

    /* compiled from: SectionedMultiselectTabPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "selectedItems", "Lkotlin/G0;", "accept", "(Ljava/util/Set;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            n nVar = n.this;
            nVar.f266796q = (Set) obj;
            ArrayList arrayListC = nVar.c();
            if (nVar.f266785f.getF266527T() != null && nVar.f266780a == null) {
                arrayListC.add(AbstractC18314a.b.f19694b);
            }
            t tVar = nVar.f266791l;
            if (tVar != null) {
                tVar.a(arrayListC);
            }
        }
    }

    @Inject
    public n(@Y61.l String str, @Y61.k com.avito.android.select.sectioned_multiselect.Items.section_item.d dVar, @Y61.k com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.d dVar2, @Y61.k com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.d dVar3, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.select.sectioned_multiselect.core.P p12, @Y61.k com.avito.android.select.sectioned_multiselect.b bVar, @Y61.k com.avito.android.select.glow_animation.f fVar, @Y61.k z<PaginationState> zVar, @Y61.l @com.avito.android.select.sectioned_multiselect.tab.di.o com.avito.android.select.g gVar, @Y61.k N n12) {
        this.f266780a = str;
        this.f266781b = dVar;
        this.f266782c = dVar2;
        this.f266783d = dVar3;
        this.f266784e = interfaceC35745a5;
        this.f266785f = p12;
        this.f266786g = bVar;
        this.f266787h = fVar;
        this.f266788i = zVar;
        this.f266789j = gVar;
        this.f266790k = n12;
    }

    @Override // com.avito.android.select.sectioned_multiselect.tab.c
    public final void a() {
        com.avito.android.select.sectioned_multiselect.core.P p12 = this.f266785f;
        this.f266793n.b(z.g0(p12.Gb(), p12.Td()).j0(this.f266784e.e()).t0(new a()));
    }

    @Override // com.avito.android.select.sectioned_multiselect.tab.c
    public final void b(@Y61.k t tVar) {
        this.f266791l = tVar;
        z<com.avito.android.select.sectioned_multiselect.Items.section_item.a> zVarD = this.f266781b.d();
        InterfaceC35745a5 interfaceC35745a5 = this.f266784e;
        I0 i0J0 = zVarD.j0(interfaceC35745a5.e());
        f fVar = new f(this);
        l41.g<? super Throwable> gVar = g.f266773b;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = i0J0.v0(fVar, gVar, interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar = this.f266792m;
        cVar.b(dVarV0);
        cVar.b(this.f266783d.d().j0(interfaceC35745a5.e()).v0(new h(this), i.f266775b, interfaceC43543a));
        cVar.b(this.f266782c.d().j0(interfaceC35745a5.e()).v0(new j(this), k.f266777b, interfaceC43543a));
        cVar.b(this.f266787h.d().j0(interfaceC35745a5.e()).v0(new l(this), m.f266779b, interfaceC43543a));
        this.f266794o.b(this.f266788i.d0(o.f266798b).v0(new p(this), q.f266801b, interfaceC43543a));
    }

    public final ArrayList c() {
        com.avito.android.select.sectioned_multiselect.core.P p12 = this.f266785f;
        List<SectionedMultiselectParameter.Value> listJ8 = p12.j8(this.f266780a);
        Set<? extends ParcelableEntity<String>> set = this.f266796q;
        if (set == null) {
            set = null;
        }
        boolean f266519l = p12.getF266519L();
        List<String> listY6 = p12.y6();
        boolean zO2 = p12.o2();
        return new ArrayList(this.f266786g.d(listJ8, set, f266519l, listY6, zO2));
    }

    @Override // com.avito.android.select.sectioned_multiselect.tab.c
    public final void e0() {
        this.f266792m.e();
        this.f266793n.e();
        this.f266794o.e();
        io.reactivex.rxjava3.disposables.i iVar = this.f266795p;
        if (iVar != null) {
            iVar.dispose();
        }
        this.f266795p = null;
        this.f266791l = null;
    }
}
