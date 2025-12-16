package com.avito.android.publish.view;

import Y41.q;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.details.SelectItemBaseFragment;
import com.avito.android.publish.FlowType;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.publish.objects.InterfaceC33971t;
import com.avito.android.publish.objects.RunnableC33945f;
import com.avito.android.publish.objects.result.ObjectsFragmentResultImpl;
import com.avito.android.publish.price_list.t;
import com.avito.android.publish.view.i;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.Metro;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.suggest_locations.InterfaceC35139d;
import com.avito.android.util.InterfaceC35845m2;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: ItemDetailsBaseFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/view/ItemDetailsBaseFragment;", "Lcom/avito/android/details/SelectItemBaseFragment;", "Lcom/avito/android/publish/view/i$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class ItemDetailsBaseFragment extends SelectItemBaseFragment implements i.a {

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.objects.result.a f245619A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.view.result_handler.a f245620B0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final Handler f245621s0 = new Handler();

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public PublishIntentFactory f245622t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.select.new_metro.j f245623u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.select_districts.g f245624v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public InterfaceC35139d f245625w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f245626x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public InterfaceC33971t f245627y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public t f245628z0;

    /* compiled from: ItemDetailsBaseFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f245629a;

        static {
            int[] iArr = new int[AddressParameter.GeoFlowType.values().length];
            try {
                iArr[AddressParameter.GeoFlowType.HISTORICAL_SUGGEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddressParameter.GeoFlowType.SUGGEST_REGION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f245629a = iArr;
        }
    }

    /* compiled from: ItemDetailsBaseFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements q<Integer, Integer, Intent, G0> {
        @Override // Y41.q
        public final G0 invoke(Integer num, Integer num2, Intent intent) {
            int iIntValue = num.intValue();
            ItemDetailsBaseFragment itemDetailsBaseFragment = (ItemDetailsBaseFragment) this.receiver;
            itemDetailsBaseFragment.f245621s0.post(new RunnableC33945f(num2.intValue(), iIntValue, intent, itemDetailsBaseFragment, 1));
            return G0.f406611a;
        }
    }

    /* compiled from: ItemDetailsBaseFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements q<Integer, Integer, Intent, G0> {
        @Override // Y41.q
        public final G0 invoke(Integer num, Integer num2, Intent intent) {
            int iIntValue = num.intValue();
            ItemDetailsBaseFragment itemDetailsBaseFragment = (ItemDetailsBaseFragment) this.receiver;
            itemDetailsBaseFragment.f245621s0.post(new RunnableC33945f(num2.intValue(), iIntValue, intent, itemDetailsBaseFragment, 1));
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.publish.view.i.a
    public final void Q2(@Y61.k ObjectsParameter objectsParameter) {
        t tVar = this.f245628z0;
        if (tVar == null) {
            tVar = null;
        }
        tVar.a(objectsParameter.getId());
    }

    @Override // com.avito.android.publish.view.m.a
    public final void g4(@Y61.k AddressParameter addressParameter, boolean z12) {
        if (addressParameter.getFlowType() == null || addressParameter.getFlowType() == AddressParameter.GeoFlowType.MAP) {
            AddressParameter.Value value = addressParameter.getValue();
            PublishIntentFactory publishIntentFactory = this.f245622t0;
            Intent intentG = (publishIntentFactory != null ? publishIntentFactory : null).g((2046 & 1) != 0 ? null : value, (2046 & 4) != 0 ? null : null, (2046 & 8) != 0 ? null : null, (2046 & 16) != 0 ? PublishIntentFactory.LocationPickerChooseButtonLocation.f231991b : PublishIntentFactory.LocationPickerChooseButtonLocation.f231992c, (2046 & 32) != 0 ? null : null, (2046 & 64) != 0 ? null : null, (2046 & 128) != 0 ? null : null, (2046 & 256) == 0, (2046 & 1024) != 0 ? null : null, FlowType.f231903c);
            com.avito.android.publish.view.result_handler.a aVar = this.f245620B0;
            if (aVar == null) {
                aVar = null;
            }
            aVar.c(l1(), this, intentG, ErrorCodes.PROTOCOL_EXCEPTION, false);
            return;
        }
        AddressParameter.Value value2 = addressParameter.getValue();
        AddressParameter.GeoFlowType flowType = addressParameter.getFlowType();
        int i12 = flowType == null ? -1 : a.f245629a[flowType.ordinal()];
        PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType = i12 != 1 ? i12 != 2 ? PublishIntentFactory.SuggestLocationsFlowType.Default.f231995b : PublishIntentFactory.SuggestLocationsFlowType.Region.f231998b : PublishIntentFactory.SuggestLocationsFlowType.Historical.f231997b;
        AddressParameter.ValidationRules validationRules = addressParameter.getValidationRules();
        InterfaceC35139d interfaceC35139d = this.f245625w0;
        InterfaceC35139d interfaceC35139d2 = interfaceC35139d != null ? interfaceC35139d : null;
        String text = value2 != null ? value2.getText() : null;
        if (text == null) {
            text = "";
        }
        Intent intentA = interfaceC35139d2.a(null, null, null, text, PublishIntentFactory.LocationPickerChooseButtonLocation.f231992c, null, (32576 & 64) != 0 ? PublishIntentFactory.SuggestLocationsFlowType.Default.f231995b : suggestLocationsFlowType, (32576 & 128) != 0 ? null : null, (32576 & 256) != 0 ? null : validationRules, (32576 & 2048) != 0 ? null : null, (32576 & 8192) != 0 ? null : null, (32576 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : Boolean.TRUE);
        com.avito.android.publish.view.result_handler.a aVar2 = this.f245620B0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        aVar2.c(l1(), this, intentA, ErrorCodes.PROTOCOL_EXCEPTION, false);
    }

    @Override // com.avito.android.publish.view.i.a
    public final void h4(@Y61.k ObjectsParameter objectsParameter, @Y61.l Integer num) {
        InterfaceC33971t interfaceC33971t = this.f245627y0;
        if (interfaceC33971t == null) {
            interfaceC33971t = null;
        }
        interfaceC33971t.a(objectsParameter.getId(), (12 & 2) != 0 ? null : num, (12 & 4) != 0 ? null : null, (12 & 8) == 0, (12 & 16) != 0 ? false : num != null);
    }

    @Override // com.avito.android.publish.view.i.a
    public final void m2(@Y61.k DistrictParameter districtParameter) {
        DistrictParameter.Widget.Config config;
        Integer locationId;
        com.avito.android.select_districts.g gVar = this.f245624v0;
        if (gVar == null) {
            gVar = null;
        }
        String id2 = districtParameter.getId();
        DistrictParameter.Widget widget = districtParameter.getWidget();
        if (widget == null || (config = widget.getConfig()) == null || (locationId = config.getLocationId()) == null) {
            return;
        }
        int iIntValue = locationId.intValue();
        List<? extends District> value = districtParameter.getValue();
        if (value == null) {
            value = C42784z0.f406748b;
        }
        Intent intentA = gVar.a(iIntValue, id2, value);
        com.avito.android.publish.view.result_handler.a aVar = this.f245620B0;
        (aVar != null ? aVar : null).c(l1(), this, intentA, ErrorCodes.SSL_HANDSHAKE_EXCEPTION, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        com.avito.android.publish.view.result_handler.a aVar = this.f245620B0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.d(getTag(), i12, i13, intent, new b(3, this, ItemDetailsBaseFragment.class, "onPublishIntentResult", "onPublishIntentResult(IILandroid/content/Intent;)V", 0));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.avito.android.publish.view.result_handler.a aVar = this.f245620B0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.b(getTag(), new c(3, this, ItemDetailsBaseFragment.class, "onPublishIntentResult", "onPublishIntentResult(IILandroid/content/Intent;)V", 0));
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.f245621s0.removeCallbacksAndMessages(null);
        super.onStop();
    }

    @Override // com.avito.android.details.SelectItemBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.publish.objects.result.a aVar = this.f245619A0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.b(new f(this), C42745f0.U(ObjectsFragmentResultImpl.ObjectsRequestKey.f238086c, ObjectsFragmentResultImpl.ObjectsRequestKey.f238087d));
    }

    @Override // com.avito.android.publish.view.i.a
    public final void p2(@Y61.k MetroParameter metroParameter, @Y61.l Integer num, @Y61.l String str) {
        MetroParameter.Widget.Config config;
        Integer locationId;
        com.avito.android.select.new_metro.j jVar = this.f245623u0;
        com.avito.android.select.new_metro.j jVar2 = jVar != null ? jVar : null;
        String id2 = metroParameter.getId();
        MetroParameter.Widget widget = metroParameter.getWidget();
        if (widget == null || (config = widget.getConfig()) == null || (locationId = config.getLocationId()) == null) {
            return;
        }
        int iIntValue = locationId.intValue();
        List<? extends Metro> value = metroParameter.getValue();
        if (value == null) {
            value = C42784z0.f406748b;
        }
        Intent intentA = jVar2.a(null, id2, iIntValue, num, str, true, value, null);
        com.avito.android.publish.view.result_handler.a aVar = this.f245620B0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.c(l1(), this, intentA, 1005, false);
    }

    public abstract void s5(int i12, int i13, @Y61.l Intent intent);
}
