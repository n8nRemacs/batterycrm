package com.avito.android.blueprint.video.url;

import Hj.C13996a;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.items.ItemWithState;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.util.C35857n6;
import com.avito.android.validation.j1;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishVideoUrlPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/blueprint/video/url/h;", "Lcom/avito/android/blueprint/video/url/c;", "Lcom/avito/android/validation/j1;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements c, j1 {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<com.avito.android.items.a> f105798b;

    /* renamed from: c, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Q<Boolean, com.avito.android.items.a>> f105799c;

    /* renamed from: d, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ItemWithAdditionalButton> f105800d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f105801e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f105802f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f105803g;

    /* compiled from: PublishVideoUrlPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ParameterElement.I f105805m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ParameterElement.I i12) {
            super(0);
            this.f105805m = i12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            h.this.f105800d.accept(this.f105805m);
            return G0.f406611a;
        }
    }

    @Inject
    public h() {
        com.jakewharton.rxrelay3.c<com.avito.android.items.a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105798b = cVar;
        com.jakewharton.rxrelay3.c<Q<Boolean, com.avito.android.items.a>> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f105799c = cVar2;
        com.jakewharton.rxrelay3.c<ItemWithAdditionalButton> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f105800d = cVar3;
        this.f105801e = cVar;
        this.f105802f = cVar2;
        this.f105803g = cVar3;
    }

    public static void V(j jVar, ParameterElement.I.a aVar, ItemWithState.State state) {
        jVar.q1();
        jVar.mv();
        if ((state instanceof ItemWithState.State.Error) || (state instanceof ItemWithState.State.Warning)) {
            jVar.mv();
            return;
        }
        if (aVar instanceof ParameterElement.I.a.d) {
            jVar.c0();
            return;
        }
        if (aVar instanceof ParameterElement.I.a.c) {
            jVar.q1();
            return;
        }
        if (aVar instanceof ParameterElement.I.a.b) {
            jVar.q1();
        } else if (aVar instanceof ParameterElement.I.a.C3416a) {
            ParameterElement.I.a.C3416a c3416a = (ParameterElement.I.a.C3416a) aVar;
            jVar.sJ(c3416a.f117332b, c3416a.f117331a);
        }
    }

    @Override // com.avito.android.blueprint.video.url.c
    @Y61.k
    /* renamed from: G, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF105803g() {
        return this.f105803g;
    }

    public final C13996a O(ParameterElement.I i12) {
        ParameterElement.I.a aVar = i12.f117327h;
        return new C13996a(i12.f117324e, aVar instanceof ParameterElement.I.a.c ? new ItemWithState.State.Error.ErrorWithMessage(((ParameterElement.I.a.c) aVar).f117335a) : i12.f117330k, false, false, null, null, i12.f117328i != null ? new a(i12) : null, null, null, 444, null);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((j) eVar, (ParameterElement.I) aVar);
    }

    @Override // com.avito.android.blueprint.video.url.c, com.avito.android.validation.j1
    @Y61.k
    public final z<com.avito.android.items.a> b() {
        return this.f105801e;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        ParameterElement.I i13 = (ParameterElement.I) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C35857n6) {
                obj = obj2;
            }
        }
        C35857n6 c35857n6 = (C35857n6) (obj instanceof C35857n6 ? obj : null);
        if (c35857n6 == null) {
            k(jVar, i13);
            return;
        }
        jVar.a60(O(i13));
        ParameterElement.I.a aVar2 = c35857n6.f318937b;
        if (aVar2 != null) {
            V(jVar, aVar2, c35857n6.f318936a);
        }
        jVar.K(new f(this, i13));
        jVar.t1(new g(this, i13));
    }

    public final void k(@Y61.k j jVar, @Y61.k ParameterElement.I i12) {
        jVar.K(null);
        jVar.m7();
        jVar.a60(O(i12));
        jVar.o(i12.f117325f);
        jVar.T0(new FormatterType(Integer.MAX_VALUE, 1, null));
        jVar.h0();
        jVar.I0(Integer.MAX_VALUE);
        jVar.m(i12.f117329j);
        jVar.t1(new d(this, i12));
        jVar.K(new e(this, i12));
        V(jVar, i12.f117327h, i12.f117330k);
    }

    @Override // com.avito.android.blueprint.video.url.c
    @Y61.k
    public final z<Q<Boolean, com.avito.android.items.a>> n() {
        return this.f105802f;
    }
}
