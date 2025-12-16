package com.avito.android.services_transportation_widget.cargo_capacity_sheet;

import Av0.C13085a;
import Av0.C13087c;
import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.util.R0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: ServiceTransportationCardSelectPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/cargo_capacity_sheet/e;", "Lcom/avito/android/services_transportation_widget/cargo_capacity_sheet/a;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f280478a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C13085a f280479b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<ServiceTransportationWidget.CardSelectField.CardSelectValue> f280480c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ServiceTransportationWidget.CardSelectField.CardSelectValue f280481d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Y41.l<ServiceTransportationWidget.CardSelectField.CardSelectValue, G0> f280482e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C43238h f280483f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public j f280484g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public Object f280485h = C42784z0.f406748b;

    /* renamed from: i, reason: collision with root package name */
    @l
    public Long f280486i;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k R0 r02, @k C13085a c13085a, @k List<ServiceTransportationWidget.CardSelectField.CardSelectValue> list, @l ServiceTransportationWidget.CardSelectField.CardSelectValue cardSelectValue, @k Y41.l<? super ServiceTransportationWidget.CardSelectField.CardSelectValue, G0> lVar) {
        this.f280478a = r02;
        this.f280479b = c13085a;
        this.f280480c = list;
        this.f280481d = cardSelectValue;
        this.f280482e = lVar;
        this.f280483f = U.a(r02.a().plus(t1.b()));
        this.f280486i = cardSelectValue != null ? Long.valueOf(cardSelectValue.getValueId()) : null;
    }

    public static final Object a(e eVar, List list, List list2, SuspendLambda suspendLambda) {
        eVar.getClass();
        C13087c c13087c = new C13087c(list, list2);
        eVar.f280485h = list2;
        return C43259k.g(eVar.f280478a.b(), new b(eVar, list2, C23424o.a(c13087c, false), null), suspendLambda);
    }
}
