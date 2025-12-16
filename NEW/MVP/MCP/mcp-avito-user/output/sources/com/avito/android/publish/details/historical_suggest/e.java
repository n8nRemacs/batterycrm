package com.avito.android.publish.details.historical_suggest;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import com.avito.android.details.b;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.publish.C0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.analytics.events.AddressChoiceType;
import com.avito.android.publish.details.C33771m1;
import com.avito.android.publish.details.InterfaceC33678b;
import com.avito.android.publish.details.ItemDetailsView;
import com.avito.android.publish.details.S0;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.publish.details.w2;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.InterfaceC35745a5;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import nF.C44245a;

/* compiled from: HistoricalSuggestViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/historical_suggest/e;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/publish/details/w2;", "Lcom/avito/android/details/b$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends M0 implements w2, b.InterfaceC4110b {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final C0 f234648E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final S0 f234649J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33678b f234650K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final i f234651L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f234652M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C33771m1 f234653N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final b f234654O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f234655P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C44245a f234656Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f234657R = new io.reactivex.rxjava3.disposables.c();

    public e(@Y61.k C0 c02, @Y61.k S0 s02, @Y61.k InterfaceC33678b interfaceC33678b, @Y61.k i iVar, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k C33771m1 c33771m1, @Y61.k b bVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C44245a c44245a) {
        this.f234648E = c02;
        this.f234649J = s02;
        this.f234650K = interfaceC33678b;
        this.f234651L = iVar;
        this.f234652M = interfaceC33535v;
        this.f234653N = c33771m1;
        this.f234654O = bVar;
        this.f234655P = interfaceC35745a5;
        this.f234656Q = c44245a;
    }

    public static final AddressParameter.Value ke(e eVar, AddressSuggestion addressSuggestion) {
        eVar.getClass();
        Coordinates coordinates = addressSuggestion.getCoordinates();
        double latitude = coordinates != null ? coordinates.getLatitude() : 0.0d;
        Coordinates coordinates2 = addressSuggestion.getCoordinates();
        return new AddressParameter.Value(latitude, coordinates2 != null ? coordinates2.getLongitude() : 0.0d, addressSuggestion.c(), addressSuggestion.getJsonWebToken(), null, 16, null);
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void C5(@Y61.k AddressParameter addressParameter) {
        Object next;
        if (this.f234656Q.v().invoke().booleanValue()) {
            return;
        }
        C0 c02 = this.f234648E;
        if (c02.Ce() || addressParameter.getValue() == null) {
            return;
        }
        Integer categoryId = c02.f231861Y.getRootNavigation().getCategoryId();
        if (categoryId != null && categoryId.intValue() == 4) {
            return;
        }
        AddressParameter.Value value = addressParameter.getValue();
        if (value != null) {
            this.f234652M.n0(AddressChoiceType.f232216h, value);
        }
        b bVar = this.f234654O;
        JO.d f234643b = bVar.getF234643b();
        if (f234643b != null) {
            List<JO.c> list = f234643b.f8945e;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((JO.c) next).f8941d.equals(addressParameter.getValue())) {
                        break;
                    }
                }
            }
            bVar.b(new JO.d(f234643b.f8942b, f234643b.f8943c, (JO.c) next, list));
            this.f234650K.B9(new PublishDetailsFlowTracker.FlowContext[0]);
        }
    }

    @Override // com.avito.android.publish.details.w2
    public final void e0() {
        this.f234657R.e();
    }

    @Override // com.avito.android.publish.details.w2
    public final void p2(@Y61.k ItemDetailsView itemDetailsView) {
        if (this.f234656Q.v().invoke().booleanValue()) {
            return;
        }
        ParametersTree parametersTreeWa = this.f234649J.wa();
        AddressParameter addressParameter = parametersTreeWa != null ? (AddressParameter) parametersTreeWa.getFirstParameterOfType(AddressParameter.class) : null;
        C0 c02 = this.f234648E;
        if (c02.Ce()) {
            return;
        }
        Integer categoryId = c02.f231861Y.getRootNavigation().getCategoryId();
        if ((categoryId != null && categoryId.intValue() == 4) || addressParameter == null || addressParameter.getFlowType() != AddressParameter.GeoFlowType.HISTORICAL_SUGGEST || this.f234654O.getF234643b() != null) {
            return;
        }
        this.f234657R.b(this.f234651L.a().s(this.f234655P.e()).x(new c(parametersTreeWa, addressParameter, this), d.f234647b));
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void Nc() {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void n9() {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void vd() {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void I9(@Y61.k String str) {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void N7(@Y61.k PublishMethodWithAllSelectedValueParameter publishMethodWithAllSelectedValueParameter) {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void h5(@Y61.l String str) {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void c3(@Y61.l ParameterSlot parameterSlot, @Y61.l String str) {
    }
}
