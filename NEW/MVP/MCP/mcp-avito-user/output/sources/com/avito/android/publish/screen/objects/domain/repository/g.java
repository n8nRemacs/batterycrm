package com.avito.android.publish.screen.objects.domain.repository;

import Jd0.C14188a;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.objects.C33953j;
import com.avito.android.publish.objects.InterfaceC33886a;
import com.avito.android.publish.objects.ObjectFillFormScreenParams;
import com.avito.android.publish.screen.objects.di.InterfaceC34011b;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.price_list.PriceListDisplayingOptions;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.V2;
import com.avito.android.validation.InterfaceC36030r0;
import com.avito.conveyor_item.a;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.rx3.y;
import t3.l0;
import yc.C50213a;

/* compiled from: ObjectItemsRepository.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/objects/domain/repository/g;", "Lcom/avito/android/publish/screen/objects/domain/repository/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f240023a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ObjectFillFormScreenParams f240024b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.objects.domain.repository.a f240025c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.objects.slot.c f240026d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category_parameters.a f240027e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36030r0 f240028f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Set<TV0.d<?, ?>> f240029g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f240030h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C50213a f240031i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Q1 f240032j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f240033k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C33953j f240034l = new C33953j(new C14188a(this, 4));

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final e2 f240035m = f2.b(0, 32, null, 5);

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final e2 f240036n = f2.b(0, 32, null, 5);

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f240037o = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> f240038p = new LinkedHashSet();

    /* compiled from: ObjectItemsRepository.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            g.this.b();
        }
    }

    /* compiled from: ObjectItemsRepository.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f240040b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe update slot event", (Throwable) obj);
        }
    }

    /* compiled from: ObjectItemsRepository.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/screen/objects/domain/repository/g$c", "Lcom/avito/android/publish/objects/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC33886a {
        @Override // TV0.a
        /* renamed from: getId */
        public final long getF72677b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId */
        public final String getF75720c() {
            return "delete object element";
        }
    }

    @Inject
    public g(@InterfaceC34011b boolean z12, @Y61.k ObjectFillFormScreenParams objectFillFormScreenParams, @Y61.k com.avito.android.publish.screen.objects.domain.repository.a aVar, @Y61.k com.avito.android.publish.objects.slot.c cVar, @Y61.k com.avito.android.category_parameters.a aVar2, @Y61.k InterfaceC36030r0 interfaceC36030r0, @Y61.k Set<TV0.d<?, ?>> set, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a, @Y61.k Q1 q12, @l0 @Y61.k u3.l<SimpleTestGroupWithNone> lVar) {
        this.f240023a = z12;
        this.f240024b = objectFillFormScreenParams;
        this.f240025c = aVar;
        this.f240026d = cVar;
        this.f240027e = aVar2;
        this.f240028f = interfaceC36030r0;
        this.f240029g = set;
        this.f240030h = interfaceC28373a;
        this.f240031i = c50213a;
        this.f240032j = q12;
        this.f240033k = lVar;
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.e
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final e2 getF240036n() {
        return this.f240036n;
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.e
    public final void b() {
        AttributedText f173944d;
        com.avito.android.publish.screen.objects.domain.repository.a aVar = this.f240025c;
        ParametersTree parametersTreeWa = aVar.wa();
        ArrayList arrayList = new ArrayList(com.avito.android.category_parameters.a.c(this.f240027e, parametersTreeWa, null, this.f240038p, null, 26));
        if (!aVar.getF240012h() && !this.f240033k.f439745a.f439749b.b()) {
            arrayList.add(new c());
        }
        InterfaceC36030r0 interfaceC36030r0 = this.f240028f;
        interfaceC36030r0.f(parametersTreeWa, null);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.avito.conveyor_item.a aVar2 = (com.avito.conveyor_item.a) it.next();
            if ((aVar2 instanceof JO.i) && (f173944d = ((JO.i) aVar2).getF173944d()) != null) {
                f173944d.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 12));
            }
            arrayList2.add(aVar2);
        }
        interfaceC36030r0.getF319331j().accept(arrayList2);
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.e
    public final void c() {
        this.f240028f.i(this.f240029g);
        f();
        if (this.f240023a) {
            com.avito.android.publish.screen.objects.domain.repository.a aVar = this.f240025c;
            this.f240030h.c(new Gd0.d(aVar.b8(), aVar.dc(), aVar.Z5(), this.f240031i));
        }
        C41981q0 c41981q0 = this.f240026d.f238097c;
        a aVar2 = new a();
        l41.g<? super Throwable> gVar = b.f240040b;
        c41981q0.getClass();
        this.f240037o.b(c41981q0.v0(aVar2, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
        b();
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.e
    @Y61.k
    public final f d() {
        return new f(y.a(this.f240028f.getF319332k()), this);
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.e
    @Y61.l
    public final String e() {
        SelectParameter.Value selectedValue;
        String title;
        PriceListDisplayingOptions priceListDisplaying;
        com.avito.android.publish.screen.objects.domain.repository.a aVar = this.f240025c;
        DisplayingOptions displayingOptions = aVar.Dc().getDisplayingOptions();
        String valuesProviderParamId = (displayingOptions == null || (priceListDisplaying = displayingOptions.getPriceListDisplaying()) == null) ? null : priceListDisplaying.getValuesProviderParamId();
        if (valuesProviderParamId == null || !this.f240032j.x().invoke().booleanValue() || this.f240033k.f439745a.f439749b.b()) {
            return null;
        }
        ParameterSlot parameterSlotFindParameter = aVar.wa().findParameter(valuesProviderParamId);
        SelectParameter selectParameter = parameterSlotFindParameter instanceof SelectParameter ? (SelectParameter) parameterSlotFindParameter : null;
        if (selectParameter != null && (selectedValue = selectParameter.getSelectedValue()) != null && (title = selectedValue.getTitle()) != null) {
            return title;
        }
        ObjectFillFormScreenParams.SelectedValue selectedValue2 = this.f240024b.f237559d;
        String str = selectedValue2 != null ? selectedValue2.f237562d : null;
        return str == null ? "" : str;
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.e
    public final void f() {
        this.f240038p = this.f240026d.a(this.f240038p, this.f240025c.wa());
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.e
    @Y61.k
    /* renamed from: g, reason: from getter */
    public final e2 getF240035m() {
        return this.f240035m;
    }

    @Override // com.avito.android.publish.screen.objects.domain.repository.e
    public final void h() {
        if (this.f240032j.v().invoke().booleanValue()) {
            this.f240026d.f238098d.e();
        }
        Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set = this.f240038p;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof q) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((q) it.next()).clear();
        }
        InterfaceC36030r0 interfaceC36030r0 = this.f240028f;
        interfaceC36030r0.a();
        this.f240037o.e();
        interfaceC36030r0.a();
    }
}
