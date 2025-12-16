package com.avito.android.parameters_sheet;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ParametersListDialogPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/parameters_sheet/g;", "Lcom/avito/android/parameters_sheet/e;", "_avito_parameters-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements com.avito.android.parameters_sheet.e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.conveyor_item.a> f210814a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f210815b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Set<TV0.d<?, ?>> f210816c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category_parameters.h f210817d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f210818e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public com.avito.android.parameters_sheet.i f210819f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public com.avito.android.parameters_sheet.d f210820g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f210821h = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f210822i = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f210823j = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f210824k = new LinkedHashMap();

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f210825l = new LinkedHashMap();

    /* compiled from: ParametersListDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f210826b = new a<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed on inlined multiselect click", (Throwable) obj);
        }
    }

    /* compiled from: ParametersListDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            g.this.f((Ij.b) obj);
        }
    }

    /* compiled from: ParametersListDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f210828b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed on inlined multiselect click", (Throwable) obj);
        }
    }

    /* compiled from: ParametersListDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", "it", "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            g.this.f((Ij.b) obj);
        }
    }

    /* compiled from: ParametersListDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T> f210830b = new e<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe checkbox select", (Throwable) obj);
        }
    }

    /* compiled from: ParametersListDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", "it", "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            g.this.f((Ij.b) obj);
        }
    }

    /* compiled from: ParametersListDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.parameters_sheet.g$g, reason: collision with other inner class name */
    public static final class C6298g<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C6298g<T> f210832b = new C6298g<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe checkbox select", (Throwable) obj);
        }
    }

    /* compiled from: ParametersListDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {
        public h() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            g.this.f((Ij.b) obj);
        }
    }

    /* compiled from: ParametersListDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final i<T> f210834b = new i<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe radiogroup select", (Throwable) obj);
        }
    }

    /* compiled from: ParametersListDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T> implements l41.g {
        public j() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            g.this.f((Ij.b) obj);
        }
    }

    /* compiled from: ParametersListDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final k<T> f210836b = new k<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe radiogroup select", (Throwable) obj);
        }
    }

    /* compiled from: ParametersListDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/items/a;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/items/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l<T> implements l41.g {
        public l() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.items.a aVar = (com.avito.android.items.a) obj;
            g.this.f210825l.put(aVar.getF157670b(), aVar);
        }
    }

    /* compiled from: ParametersListDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final m<T> f210838b = new m<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed on observeInputValueChanges", (Throwable) obj);
        }
    }

    /* compiled from: ParametersListDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/items/a;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/items/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n<T> implements l41.g {
        public n() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.items.a aVar = (com.avito.android.items.a) obj;
            g.this.f210825l.put(aVar.getF157670b(), aVar);
        }
    }

    /* compiled from: ParametersListDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final o<T> f210840b = new o<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed on observeInputValueChanges", (Throwable) obj);
        }
    }

    /* compiled from: ParametersListDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIj/b;", RequestReviewResultKt.INFO_TYPE, "Lkotlin/G0;", "accept", "(LIj/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p<T> implements l41.g {
        public p() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            g.this.f((Ij.b) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k Set<TV0.d<?, ?>> set, @Y61.k com.avito.android.category_parameters.h hVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f210814a = list;
        this.f210815b = aVar;
        this.f210816c = set;
        this.f210817d = hVar;
        this.f210818e = interfaceC35745a5;
        g();
    }

    @Override // com.avito.android.parameters_sheet.e
    public final void a() {
        com.avito.android.parameters_sheet.d dVar = this.f210820g;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    @Override // com.avito.android.parameters_sheet.e
    public final void b() {
        com.avito.konveyor.util.a.a(this.f210815b, this.f210814a);
    }

    @Override // com.avito.android.parameters_sheet.e
    public final void c() {
        RecyclerView.Adapter adapter;
        List<com.avito.conveyor_item.a> list = this.f210814a;
        for (com.avito.conveyor_item.a aVar : list) {
            if (aVar instanceof com.avito.android.items.a) {
                com.avito.android.items.a aVar2 = (com.avito.android.items.a) aVar;
                aVar2.m(null);
                this.f210825l.put(aVar2.getF157670b(), aVar2);
            } else if (aVar instanceof ParameterElement.C) {
                ParameterElement.C c12 = (ParameterElement.C) aVar;
                c12.f117212h = null;
                for (com.avito.conveyor_item.a aVar3 : c12.f()) {
                    if (aVar3 instanceof JO.m) {
                        c12.f117212h = null;
                        JO.m mVar = (JO.m) aVar3;
                        mVar.f8964e = false;
                        f(new Ij.b(((ParameterElement) aVar).f117181b, mVar, null, 4, null));
                    }
                }
            } else if (aVar instanceof ParameterElement.v) {
                for (JO.m mVar2 : ((ParameterElement.v) aVar).f117545f) {
                    mVar2.f8964e = false;
                    f(new Ij.b(((ParameterElement) aVar).f117181b, mVar2, null, 4, null));
                }
            }
        }
        com.avito.konveyor.util.a.a(this.f210815b, list);
        com.avito.android.parameters_sheet.i iVar = this.f210819f;
        if (iVar == null || (adapter = iVar.f210844c.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    @Override // com.avito.android.parameters_sheet.e
    public final void c0() {
        this.f210820g = null;
    }

    @Override // com.avito.android.parameters_sheet.e
    public final void d(@Y61.k com.avito.android.parameters_sheet.d dVar) {
        this.f210820g = dVar;
    }

    @Override // com.avito.android.parameters_sheet.e
    public final void e(@Y61.k com.avito.android.parameters_sheet.i iVar) {
        this.f210819f = iVar;
        this.f210821h.b(iVar.f210843b.t0(new com.avito.android.parameters_sheet.f(this)));
        g();
    }

    @Override // com.avito.android.parameters_sheet.e
    public final void e0() {
        this.f210822i.e();
        this.f210821h.e();
        this.f210819f = null;
    }

    public final void f(Ij.b bVar) {
        Object next;
        Iterator<T> it = this.f210814a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((com.avito.conveyor_item.a) next).getF157670b(), bVar.f8494a)) {
                    break;
                }
            }
        }
        com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) next;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof ParameterElement.C) {
            this.f210823j.put(bVar.f8494a, bVar);
            return;
        }
        if (aVar instanceof ParameterElement.v) {
            LinkedHashMap linkedHashMap = this.f210824k;
            Map linkedHashMap2 = (Map) linkedHashMap.get(bVar.f8494a);
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
            }
            linkedHashMap2.put(bVar.f8495b.f8961b, bVar);
            linkedHashMap.put(bVar.f8494a, linkedHashMap2);
        }
    }

    public final void g() {
        Iterator<T> it = this.f210816c.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            boolean z12 = dVar instanceof com.avito.android.blueprints.radiogroup.c;
            InterfaceC35745a5 interfaceC35745a5 = this.f210818e;
            io.reactivex.rxjava3.disposables.c cVar = this.f210822i;
            if (z12) {
                cVar.b(((com.avito.android.blueprints.radiogroup.c) dVar).h().j0(interfaceC35745a5.e()).v0(new h(), i.f210834b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.radiogroup.c) {
                cVar.b(((com.avito.android.blueprint.radiogroup.c) dVar).h().j0(interfaceC35745a5.e()).v0(new j(), k.f210836b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprints.input.d) {
                cVar.b(((com.avito.android.blueprints.input.d) dVar).b().j0(interfaceC35745a5.e()).v0(new l(), m.f210838b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.input.c) {
                cVar.b(((com.avito.android.blueprint.input.c) dVar).b().j0(interfaceC35745a5.e()).v0(new n(), o.f210840b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.multiselect.inline.c) {
                cVar.b(((com.avito.android.blueprint.multiselect.inline.c) dVar).g().j0(interfaceC35745a5.e()).v0(new p(), a.f210826b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprints.publish.multiselect.inline.c) {
                cVar.b(((com.avito.android.blueprints.publish.multiselect.inline.c) dVar).g().j0(interfaceC35745a5.e()).v0(new b(), c.f210828b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprints.publish.select.inline.c) {
                cVar.b(((com.avito.android.blueprints.publish.select.inline.c) dVar).g().j0(interfaceC35745a5.e()).v0(new d(), e.f210830b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.checkbox.c) {
                cVar.b(((com.avito.android.blueprint.checkbox.c) dVar).g().j0(interfaceC35745a5.e()).v0(new f(), C6298g.f210832b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
    }
}
