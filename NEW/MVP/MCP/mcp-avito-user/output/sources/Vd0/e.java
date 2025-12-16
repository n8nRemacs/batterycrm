package Vd0;

import Od0.InterfaceC14673a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.details.b;
import com.avito.android.publish.C0;
import com.avito.android.publish.details.InterfaceC33678b;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import nF.C44245a;

/* compiled from: HistoricalSuggestNewResultListener.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVd0/e;", "Lcom/avito/android/details/b$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements b.InterfaceC4110b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C0 f17324b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC33678b f17325c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final d f17326d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC14673a f17327e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C44245a f17328f;

    @Inject
    public e(@k C0 c02, @k InterfaceC33678b interfaceC33678b, @k d dVar, @k InterfaceC14673a interfaceC14673a, @k C44245a c44245a) {
        this.f17324b = c02;
        this.f17325c = interfaceC33678b;
        this.f17326d = dVar;
        this.f17327e = interfaceC14673a;
        this.f17328f = c44245a;
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void C5(@k AddressParameter addressParameter) {
        if (this.f17328f.v().invoke().booleanValue()) {
            C0 c02 = this.f17324b;
            if (c02.Ce() || addressParameter.getValue() == null) {
                return;
            }
            Integer categoryId = c02.f231861Y.getNavigation().getCategoryId();
            if (categoryId != null && categoryId.intValue() == 4) {
                return;
            }
            AddressParameter.Value value = addressParameter.getValue();
            if (value != null) {
                this.f17327e.c(value);
            }
            d dVar = this.f17326d;
            dVar.c(new com.avito.android.publish.details.adapter.historical_suggest.new_suggest.k(addressParameter.getValue(), dVar.getF17321c().f233278b));
            this.f17325c.B9(new PublishDetailsFlowTracker.FlowContext[0]);
        }
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
    public final void I9(@k String str) {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void N7(@k PublishMethodWithAllSelectedValueParameter publishMethodWithAllSelectedValueParameter) {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void h5(@l String str) {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void c3(@l ParameterSlot parameterSlot, @l String str) {
    }
}
