package com.avito.android.publish.screen.objects;

import Ge0.InterfaceC13872a;
import Zd.InterfaceC19542a;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.C22960s;
import androidx.view.result.ActivityResult;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.publish.FlowType;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.publish.objects.InterfaceC33971t;
import com.avito.android.publish.screen.objects.ObjectFillFormFragment;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.select.Arguments;
import com.avito.android.select.auto_early_access_select.AutoEarlyAccessSelectParams;
import com.avito.android.suggest_institutes_bottom_sheet.SelectedSuggestInstitute;
import com.avito.android.suggest_locations.InterfaceC35139d;
import i.b;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: ObjectFillFormInternalRouter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/objects/e;", "Lcom/avito/android/publish/screen/objects/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements com.avito.android.publish.screen.objects.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ObjectFillFormFragment f240143b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13872a, G0> f240144c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Context f240145d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public com.avito.android.suggest_institutes_bottom_sheet.a f240146e;

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public InterfaceC35139d f240147f;

    /* renamed from: g, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f240148g;

    /* renamed from: h, reason: collision with root package name */
    @Inject
    public PublishIntentFactory f240149h;

    /* renamed from: i, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.objects.result.a f240150i;

    /* renamed from: j, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.deprecated_design.dialog.a f240151j;

    /* renamed from: k, reason: collision with root package name */
    @Inject
    public InterfaceC33971t f240152k;

    /* renamed from: l, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.date_picker.b f240153l;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f240154m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public Locale f240155n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public h31.e<ObjectsParameter> f240156o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public u3.l<SimpleTestGroupWithNone> f240157p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public Dialog f240158q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Intent> f240159r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Intent> f240160s;

    /* compiled from: ObjectFillFormInternalRouter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<String, Bundle, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            SelectedSuggestInstitute selectedSuggestInstitute = (SelectedSuggestInstitute) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("SELECTED_SUGGEST_INSTITUTE", SelectedSuggestInstitute.class) : bundle2.getParcelable("SELECTED_SUGGEST_INSTITUTE"));
            if (selectedSuggestInstitute != null) {
                ((ObjectFillFormFragment.h) e.this.f240144c).invoke(new InterfaceC13872a.o.j(selectedSuggestInstitute));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormInternalRouter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f240162a;

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
            f240162a = iArr;
        }
    }

    /* compiled from: ObjectFillFormInternalRouter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c implements androidx.view.result.a, D {
        public c() {
        }

        @Override // androidx.view.result.a
        public final void a(Object obj) {
            e eVar = e.this;
            eVar.getClass();
            Intent intent = ((ActivityResult) obj).f21243c;
            AddressParameter.Value value = intent != null ? (AddressParameter.Value) intent.getParcelableExtra("EXTRA_ADDRESS_RESULT") : null;
            String stringExtra = intent != null ? intent.getStringExtra("EXTRA_ADDRESS_PARAM_ID") : null;
            if (value != null) {
                com.avito.android.details.b bVar = eVar.f240143b.f135892n0;
                (bVar != null ? bVar : null).E(value, stringExtra);
            }
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof androidx.view.result.a) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new H(1, e.this, e.class, "onAddressIntentResult", "onAddressIntentResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: ObjectFillFormInternalRouter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d implements androidx.view.result.a, D {
        public d() {
        }

        @Override // androidx.view.result.a
        public final void a(Object obj) {
            e eVar = e.this;
            eVar.getClass();
            ((ObjectFillFormFragment.h) eVar.f240144c).invoke(new InterfaceC13872a.b(((ActivityResult) obj).f21242b == -1));
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof androidx.view.result.a) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new H(1, e.this, e.class, "onAuthIntentResult", "onAuthIntentResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@Y61.k ObjectFillFormFragment objectFillFormFragment, @Y61.k Y41.l<? super InterfaceC13872a, G0> lVar) {
        this.f240143b = objectFillFormFragment;
        this.f240144c = lVar;
        this.f240145d = objectFillFormFragment.requireContext();
        this.f240159r = objectFillFormFragment.registerForActivityResult(new b.m(), new d());
        this.f240160s = objectFillFormFragment.registerForActivityResult(new b.m(), new c());
        C22960s.b(objectFillFormFragment, "SUGGEST_INSTITUTES", new a());
    }

    @Override // com.avito.android.publish.view.a.b
    public final void K2(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f240154m;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, null, 2);
    }

    @Override // com.avito.android.details.j.b
    public final void O2(@Y61.k AutoEarlyAccessSelectParams autoEarlyAccessSelectParams) {
        this.f240143b.O2(autoEarlyAccessSelectParams);
    }

    @Override // com.avito.android.details.j.b
    public final void R1(@Y61.k Arguments arguments) {
        this.f240143b.R1(arguments);
    }

    @Override // com.avito.android.publish.view.m.a
    public final void g4(@Y61.k AddressParameter addressParameter, boolean z12) {
        AddressParameter.GeoFlowType flowType = addressParameter.getFlowType();
        androidx.view.result.h<Intent> hVar = this.f240160s;
        if (flowType == null || addressParameter.getFlowType() == AddressParameter.GeoFlowType.MAP) {
            AddressParameter.Value value = addressParameter.getValue();
            PublishIntentFactory publishIntentFactory = this.f240149h;
            hVar.b((publishIntentFactory != null ? publishIntentFactory : null).g((2046 & 1) != 0 ? null : value, (2046 & 4) != 0 ? null : null, (2046 & 8) != 0 ? null : null, (2046 & 16) != 0 ? PublishIntentFactory.LocationPickerChooseButtonLocation.f231991b : PublishIntentFactory.LocationPickerChooseButtonLocation.f231992c, (2046 & 32) != 0 ? null : null, (2046 & 64) != 0 ? null : null, (2046 & 128) != 0 ? null : null, (2046 & 256) == 0, (2046 & 1024) != 0 ? null : null, FlowType.f231903c));
            return;
        }
        AddressParameter.Value value2 = addressParameter.getValue();
        AddressParameter.GeoFlowType flowType2 = addressParameter.getFlowType();
        String id2 = addressParameter.getId();
        InterfaceC35139d interfaceC35139d = this.f240147f;
        if (interfaceC35139d == null) {
            interfaceC35139d = null;
        }
        int i12 = flowType2 == null ? -1 : b.f240162a[flowType2.ordinal()];
        PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType = i12 != 1 ? i12 != 2 ? PublishIntentFactory.SuggestLocationsFlowType.Default.f231995b : PublishIntentFactory.SuggestLocationsFlowType.Region.f231998b : PublishIntentFactory.SuggestLocationsFlowType.Historical.f231997b;
        String text = value2 != null ? value2.getText() : null;
        hVar.b(interfaceC35139d.a(null, null, null, text == null ? "" : text, PublishIntentFactory.LocationPickerChooseButtonLocation.f231992c, null, (32576 & 64) != 0 ? PublishIntentFactory.SuggestLocationsFlowType.Default.f231995b : suggestLocationsFlowType, (32576 & 128) != 0 ? null : null, (32576 & 256) != 0 ? null : null, (32576 & 2048) != 0 ? null : null, (32576 & 8192) != 0 ? null : id2, (32576 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : Boolean.TRUE));
    }

    @Override // com.avito.android.details.j.b
    public final void t3(@Y61.k com.avito.android.blueprints.selector_card_group_bottom_sheet.k kVar) {
        this.f240143b.t3(kVar);
    }
}
