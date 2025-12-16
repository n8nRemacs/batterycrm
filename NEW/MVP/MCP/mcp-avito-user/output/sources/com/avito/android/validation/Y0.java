package com.avito.android.validation;

import android.content.Context;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.item_map.view.C31075l;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.NotFoundException;
import com.avito.android.validation.n1;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.flowable.C41840d0;
import io.reactivex.rxjava3.internal.operators.flowable.C41902y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l41.InterfaceC43543a;

/* compiled from: ParametersListPresenterImpl.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/validation/Y0;", "Lcom/avito/android/validation/r0;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Y0 implements InterfaceC36030r0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36026p f319322a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f319323b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f319324c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.i0 f319325d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<List<com.avito.conveyor_item.a>> f319326e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<UV0.a<? extends com.avito.conveyor_item.a>> f319327f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public ArrayList f319328g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f319329h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.l f319330i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f319331j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f319332k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<kotlin.G0> f319333l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f319334m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public ParametersTree f319335n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public Context f319336o;

    @Inject
    public Y0(@Y61.k InterfaceC36026p interfaceC36026p, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.util.text.a aVar, @Y61.k com.avito.android.analytics.i0 i0Var) {
        this.f319322a = interfaceC36026p;
        this.f319323b = interfaceC35745a5;
        this.f319324c = aVar;
        this.f319325d = i0Var;
        com.jakewharton.rxrelay3.b<List<com.avito.conveyor_item.a>> bVar = new com.jakewharton.rxrelay3.b<>();
        this.f319326e = bVar;
        com.jakewharton.rxrelay3.c<UV0.a<? extends com.avito.conveyor_item.a>> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f319327f = cVar;
        this.f319328g = new ArrayList();
        this.f319329h = new io.reactivex.rxjava3.disposables.c();
        this.f319331j = bVar;
        this.f319332k = cVar;
        com.jakewharton.rxrelay3.c<kotlin.G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f319333l = cVar2;
        this.f319334m = cVar2;
    }

    public static ParameterElement k(com.avito.conveyor_item.a aVar) throws CloneNotSupportedException {
        if (aVar instanceof ParameterElement.H) {
            ParameterElement.H h12 = (ParameterElement.H) aVar;
            return new ParameterElement.H(h12.f117298d, h12.f117299e, h12.f117300f, h12.f117301g, h12.f117302h, h12.f117303i, h12.f117304j, h12.f117305k, h12.f117306l, h12.f117307m, h12.f117308n, h12.f117309o, h12.f117310p, h12.f117311q, h12.f117312r, h12.f117313s, h12.f117314t, h12.f117315u, h12.f117316v, h12.f117317w, h12.f117318x, h12.f117319y);
        }
        if (aVar instanceof ParameterElement.p) {
            return ParameterElement.p.f((ParameterElement.p) aVar, null, null, null, null, 536870911);
        }
        if (!(aVar instanceof ParameterElement.I)) {
            throw new CloneNotSupportedException();
        }
        ParameterElement.I i12 = (ParameterElement.I) aVar;
        return new ParameterElement.I(i12.f117323d, i12.f117324e, i12.f117325f, i12.f117326g, i12.f117327h, i12.f117328i, i12.f117329j, i12.f117330k);
    }

    public static boolean o(com.avito.android.items.a aVar) {
        String str;
        String str2;
        String f117481f;
        if (aVar instanceof com.avito.android.items.d) {
            com.avito.android.items.d dVar = (com.avito.android.items.d) aVar;
            if ((dVar.getF173921f() instanceof ItemWithState.State.Normal) && ((f117481f = dVar.getF117481f()) == null || f117481f.length() == 0)) {
                return false;
            }
        } else if (aVar instanceof ParameterElement.H) {
            ParameterElement.H h12 = (ParameterElement.H) aVar;
            if ((h12.f117309o instanceof ItemWithState.State.Normal) && ((str2 = h12.f117300f) == null || str2.length() == 0)) {
                return false;
            }
        } else if (aVar instanceof ParameterElement.I) {
            ParameterElement.I i12 = (ParameterElement.I) aVar;
            if ((i12.f117330k instanceof ItemWithState.State.Normal) && ((str = i12.f117329j) == null || str.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.avito.android.validation.InterfaceC36030r0
    public final void a() {
        this.f319329h.e();
        io.reactivex.rxjava3.internal.observers.l lVar = this.f319330i;
        if (lVar != null) {
            DisposableHelper.a(lVar);
        }
        this.f319330i = null;
    }

    @Override // com.avito.android.validation.InterfaceC36030r0
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF319334m() {
        return this.f319334m;
    }

    @Override // com.avito.android.validation.InterfaceC36030r0
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final com.jakewharton.rxrelay3.b getF319331j() {
        return this.f319331j;
    }

    @Override // com.avito.android.validation.InterfaceC36014j
    public final void d() {
        this.f319336o = null;
    }

    @Override // com.avito.android.validation.InterfaceC36014j
    public final void e(@Y61.k Context context) {
        this.f319336o = context;
    }

    @Override // com.avito.android.validation.InterfaceC36030r0
    public final void f(@Y61.k ParametersTree parametersTree, @Y61.l ParametersTree parametersTree2) {
        this.f319335n = parametersTree;
        this.f319322a.g(parametersTree, parametersTree2);
    }

    @Override // com.avito.android.validation.InterfaceC36030r0
    @Y61.k
    /* renamed from: g, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF319332k() {
        return this.f319332k;
    }

    @Override // com.avito.android.validation.l1
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.O h(@Y61.k List list, @Y61.k Set set) {
        this.f319328g = new ArrayList(list);
        return new io.reactivex.rxjava3.internal.operators.single.C(this.f319322a.a(set).s(this.f319323b.e()), new com.avito.android.blueprints.publish.reg_number.d(23, C36042x0.f319438l)).N(new AJ.b(16, C36044y0.f319440l)).N(new AJ.b(17, C36046z0.f319452l)).K(new C36034t0(0, new A0(this))).N(new AJ.b(18, B0.f319246l)).H0().k(new C36034t0(1, new D0(this))).r(new com.avito.android.blueprints.publish.reg_number.d(24, new E0(this)));
    }

    @Override // com.avito.android.validation.InterfaceC36030r0
    public final void i(@Y61.k Set<? extends TV0.d<?, ?>> set) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f319323b;
        AbstractC41777j<T> abstractC41777jG0 = this.f319326e.y(150L, timeUnit, interfaceC35745a5.c()).K(new C31075l(25, new I0(this))).j0(interfaceC35745a5.f()).G0(BackpressureStrategy.f401955d);
        C31075l c31075l = new C31075l(26, new J0(this));
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        Objects.requireNonNull(gVar, "onError is null");
        Objects.requireNonNull(interfaceC43543a, "onComplete is null");
        io.reactivex.rxjava3.internal.operators.flowable.O0 o0M = new io.reactivex.rxjava3.internal.operators.flowable.S(abstractC41777jG0, c31075l, gVar, interfaceC43543a, interfaceC43543a).w(new com.avito.android.blueprints.publish.reg_number.d(22, new L0(this))).m(interfaceC35745a5.e());
        C31075l c31075l2 = new C31075l(27, new N0(this, set));
        Objects.requireNonNull(gVar, "onError is null");
        Objects.requireNonNull(interfaceC43543a, "onComplete is null");
        this.f319330i = new C41902y0(new io.reactivex.rxjava3.internal.operators.flowable.S(o0M, c31075l2, gVar, interfaceC43543a, interfaceC43543a)).v(new com.avito.android.advert_core.task.a(10), new C31075l(28, O0.f319281l));
    }

    public final void j(Y41.l<? super List<? extends com.avito.conveyor_item.a>, kotlin.G0> lVar) {
        lVar.invoke(this.f319328g);
        this.f319327f.accept(new UV0.c(new ArrayList(this.f319328g)));
    }

    public final int l(String str) throws NotFoundException {
        Iterator it = this.f319328g.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (kotlin.jvm.internal.L.f(((com.avito.conveyor_item.a) it.next()).getStringId(), str)) {
                break;
            }
            i12++;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new NotFoundException(str, (Throwable) null, 2, (C42822w) null);
    }

    public final void m(n1 n1Var) {
        ItemWithState.State warning;
        CharSequence text;
        if ((n1Var instanceof n1.c) || (n1Var instanceof n1.b)) {
            return;
        }
        com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) this.f319328g.get(l(n1Var.f319402a));
        if (aVar instanceof ItemWithState) {
            if (n1Var instanceof n1.a.c) {
                warning = new ItemWithState.State.Error.ErrorWithMessage(C36018l.b((n1.a.c) n1Var, aVar));
            } else if (n1Var instanceof n1.a.b) {
                warning = new ItemWithState.State.Error.ErrorWithMessage(((n1.a.b) n1Var).f319404c);
            } else if (n1Var instanceof n1.a.C9897a) {
                Context context = this.f319336o;
                AttributedText attributedText = ((n1.a.C9897a) n1Var).f319408g;
                if (context == null || (text = this.f319324c.c(context, attributedText)) == null) {
                    text = attributedText.getText();
                }
                warning = new ItemWithState.State.Error.ErrorWithMessage(text);
            } else {
                warning = new ItemWithState.State.Warning(((n1.a) n1Var).f319404c);
            }
            ((ItemWithState) aVar).O0(warning);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(com.avito.android.validation.n1 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.avito.android.validation.n1.c
            r1 = 1
            if (r0 == 0) goto Laf
            java.lang.String r0 = r9.f319402a
            com.avito.android.remote.model.category_parameters.ParametersTree r2 = r8.f319335n
            r3 = 0
            if (r2 == 0) goto L11
            java.util.List r2 = r2.getParametersExceptOwnedBySlots()
            goto L12
        L11:
            r2 = r3
        L12:
            r4 = 0
            if (r2 == 0) goto L50
            r5 = r2
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L26
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L26
            goto L50
        L26:
            java.util.Iterator r5 = r5.iterator()
        L2a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L50
            java.lang.Object r6 = r5.next()
            com.avito.android.remote.model.category_parameters.base.ParameterSlot r6 = (com.avito.android.remote.model.category_parameters.base.ParameterSlot) r6
            boolean r7 = r6 instanceof com.avito.android.remote.model.category_parameters.base.WithDependency
            if (r7 == 0) goto L3d
            com.avito.android.remote.model.category_parameters.base.WithDependency r6 = (com.avito.android.remote.model.category_parameters.base.WithDependency) r6
            goto L3e
        L3d:
            r6 = r3
        L3e:
            if (r6 == 0) goto L4b
            java.util.List r6 = r6.getParamsMustBeFilled()
            if (r6 == 0) goto L4b
            boolean r6 = r6.contains(r0)
            goto L4c
        L4b:
            r6 = r4
        L4c:
            if (r6 == 0) goto L2a
            r5 = r1
            goto L51
        L50:
            r5 = r4
        L51:
            if (r5 == 0) goto L92
            if (r2 == 0) goto L77
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L5b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L73
            java.lang.Object r5 = r2.next()
            r6 = r5
            com.avito.android.remote.model.category_parameters.base.ParameterSlot r6 = (com.avito.android.remote.model.category_parameters.base.ParameterSlot) r6
            java.lang.String r6 = r6.getId()
            boolean r6 = kotlin.jvm.internal.L.f(r6, r0)
            if (r6 == 0) goto L5b
            goto L74
        L73:
            r5 = r3
        L74:
            com.avito.android.remote.model.category_parameters.base.ParameterSlot r5 = (com.avito.android.remote.model.category_parameters.base.ParameterSlot) r5
            goto L78
        L77:
            r5 = r3
        L78:
            boolean r0 = r5 instanceof com.avito.android.remote.model.category_parameters.base.EditableParameter
            if (r0 == 0) goto L7f
            com.avito.android.remote.model.category_parameters.base.EditableParameter r5 = (com.avito.android.remote.model.category_parameters.base.EditableParameter) r5
            goto L80
        L7f:
            r5 = r3
        L80:
            if (r5 == 0) goto L89
            boolean r0 = r5.hasValue()
            if (r0 != r1) goto L89
            r4 = r1
        L89:
            if (r4 == 0) goto L92
            com.jakewharton.rxrelay3.c<kotlin.G0> r0 = r8.f319333l
            kotlin.G0 r2 = kotlin.G0.f406611a
            r0.accept(r2)
        L92:
            java.lang.String r9 = r9.f319402a
            int r9 = r8.l(r9)
            java.util.ArrayList r0 = r8.f319328g
            java.lang.Object r9 = r0.get(r9)
            com.avito.conveyor_item.a r9 = (com.avito.conveyor_item.a) r9
            boolean r0 = r9 instanceof com.avito.android.items.ItemWithState
            if (r0 == 0) goto Lbb
            com.avito.android.items.ItemWithState r9 = (com.avito.android.items.ItemWithState) r9
            com.avito.android.items.ItemWithState$State$Normal r0 = new com.avito.android.items.ItemWithState$State$Normal
            r0.<init>(r3, r1, r3)
            r9.O0(r0)
            goto Lbb
        Laf:
            boolean r0 = r9 instanceof com.avito.android.validation.n1.a
            if (r0 == 0) goto Lb4
            goto Lb6
        Lb4:
            boolean r1 = r9 instanceof com.avito.android.validation.n1.b
        Lb6:
            if (r1 == 0) goto Lbb
            r8.m(r9)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.validation.Y0.n(com.avito.android.validation.n1):void");
    }

    public final io.reactivex.rxjava3.internal.observers.y p(io.reactivex.rxjava3.core.z zVar) {
        return (io.reactivex.rxjava3.internal.observers.y) zVar.x0(this.f319323b.e()).v0(new C36034t0(5, new G0(this)), new C36034t0(6, H0.f319265l), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    public final io.reactivex.rxjava3.internal.observers.l q(io.reactivex.rxjava3.core.z zVar) {
        io.reactivex.rxjava3.internal.operators.observable.O oK2 = zVar.K(new C36034t0(3, new P0(this)));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f319323b;
        AbstractC41777j<T> abstractC41777jG0 = oK2.y(300L, timeUnit, interfaceC35745a5.c()).G0(BackpressureStrategy.f401955d);
        com.avito.android.blueprints.publish.reg_number.d dVar = new com.avito.android.blueprints.publish.reg_number.d(25, new Q0(this));
        io.reactivex.rxjava3.internal.functions.b.a(Integer.MAX_VALUE, "maxConcurrency");
        return new C41840d0(abstractC41777jG0, dVar).x(interfaceC35745a5.e()).v(new com.avito.android.advert_core.task.a(10), new C36034t0(4, R0.f319289l));
    }
}
