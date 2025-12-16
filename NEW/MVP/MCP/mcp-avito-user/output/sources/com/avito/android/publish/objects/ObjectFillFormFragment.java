package com.avito.android.publish.objects;

import Zd.InterfaceC19542a;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.C22960s;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.authorization.AuthSource;
import com.avito.android.blueprints.publish.date_interval.c;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.details.SelectItemBaseFragment;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.shadow_layout.ShadowFrameLayout;
import com.avito.android.publish.FlowType;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.publish.details.C33745e;
import com.avito.android.publish.details.C33757i;
import com.avito.android.publish.details.C33766l;
import com.avito.android.publish.details.C33775o;
import com.avito.android.publish.details.C33781q;
import com.avito.android.publish.details.C33789t;
import com.avito.android.publish.details.ItemDetailsView;
import com.avito.android.publish.objects.C33975x;
import com.avito.android.publish.objects.ObjectFillFormScreenParams;
import com.avito.android.publish.objects.di.C33894a;
import com.avito.android.publish.objects.di.InterfaceC33935s;
import com.avito.android.publish.objects.di.InterfaceC33938v;
import com.avito.android.publish.objects.result.ObjectsFragmentResultImpl;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.price_list.PriceListDisplayingOptions;
import com.avito.android.suggest_institutes_bottom_sheet.SelectedSuggestInstitute;
import com.avito.android.suggest_locations.InterfaceC35139d;
import com.avito.android.util.H2;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.K2;
import com.avito.android.validation.InterfaceC36014j;
import com.avito.android.validation.InterfaceC36030r0;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import l41.InterfaceC43543a;
import okhttp3.internal.http2.Http2;

/* compiled from: ObjectFillFormFragment.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/objects/ObjectFillFormFragment;", "Lcom/avito/android/details/SelectItemBaseFragment;", "Lcom/avito/android/publish/objects/x$b;", "LId0/c;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ObjectFillFormFragment extends SelectItemBaseFragment implements C33975x.b, Id0.c, InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.date_picker.b f237529A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.deprecated_design.dialog.a f237530B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public InterfaceC33971t f237531C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.objects.result.a f237532D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f237533E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public InterfaceC33888b f237534F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f237535G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.view.result_handler.a f237536H0;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public InterfaceC36014j f237537I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public com.avito.android.suggest_institutes_bottom_sheet.a f237538J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public u3.l<SimpleTestGroupWithNone> f237539K0;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public final Handler f237540L0 = new Handler();

    /* renamed from: M0, reason: collision with root package name */
    @Y61.l
    public H2 f237541M0;

    /* renamed from: N0, reason: collision with root package name */
    public C33789t f237542N0;

    /* renamed from: O0, reason: collision with root package name */
    public com.avito.android.publish.details.r f237543O0;

    /* renamed from: P0, reason: collision with root package name */
    public C33781q f237544P0;

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.l
    public N0 f237545Q0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f237546s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public PublishIntentFactory f237547t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public InterfaceC35139d f237548u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f237549v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public C33975x f237550w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public InterfaceC33955k f237551x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public RecyclerView.Adapter<?> f237552y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f237553z0;

    /* compiled from: ObjectFillFormFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f237554a;

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
            f237554a = iArr;
        }
    }

    /* compiled from: ObjectFillFormFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "keyboardShown", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            ObjectFillFormFragment objectFillFormFragment = ObjectFillFormFragment.this;
            InterfaceC33888b interfaceC33888b = objectFillFormFragment.f237534F0;
            if (interfaceC33888b == null) {
                interfaceC33888b = null;
            }
            interfaceC33888b.i(zBooleanValue);
            C33789t c33789t = objectFillFormFragment.f237542N0;
            N0 n02 = (c33789t != null ? c33789t : null).f234946f;
            if (n02 != null) {
                n02.f237523b = zBooleanValue;
                ShadowFrameLayout shadowFrameLayout = n02.f237525d;
                if (shadowFrameLayout != null) {
                    n02.a(shadowFrameLayout, zBooleanValue, n02.f237524c);
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends kotlin.jvm.internal.H implements Y41.q<Integer, Integer, Intent, kotlin.G0> {
        @Override // Y41.q
        public final kotlin.G0 invoke(Integer num, Integer num2, Intent intent) {
            int iIntValue = num.intValue();
            ObjectFillFormFragment objectFillFormFragment = (ObjectFillFormFragment) this.receiver;
            objectFillFormFragment.f237540L0.post(new RunnableC33945f(num2.intValue(), iIntValue, intent, objectFillFormFragment, 0));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormFragment.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<String, Bundle, kotlin.G0> {
        public d() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            SelectedSuggestInstitute selectedSuggestInstitute = (SelectedSuggestInstitute) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("SELECTED_SUGGEST_INSTITUTE", SelectedSuggestInstitute.class) : bundle2.getParcelable("SELECTED_SUGGEST_INSTITUTE"));
            if (selectedSuggestInstitute != null) {
                C33975x c33975x = ObjectFillFormFragment.this.f237550w0;
                if (c33975x == null) {
                    c33975x = null;
                }
                c33975x.f238115P.a0(selectedSuggestInstitute.f291979b, selectedSuggestInstitute.f291980c);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends kotlin.jvm.internal.H implements Y41.q<Integer, Integer, Intent, kotlin.G0> {
        @Override // Y41.q
        public final kotlin.G0 invoke(Integer num, Integer num2, Intent intent) {
            int iIntValue = num.intValue();
            ObjectFillFormFragment objectFillFormFragment = (ObjectFillFormFragment) this.receiver;
            objectFillFormFragment.f237540L0.post(new RunnableC33945f(num2.intValue(), iIntValue, intent, objectFillFormFragment, 0));
            return kotlin.G0.f406611a;
        }
    }

    public final void E0() {
        K2.e(this);
        InterfaceC33971t interfaceC33971t = this.f237531C0;
        if (interfaceC33971t == null) {
            interfaceC33971t = null;
        }
        interfaceC33971t.i0();
    }

    public final void F3(@Y61.k c.a aVar, @Y61.k ParameterElement.C29377e c29377e, @Y61.k Y41.l<? super Long, kotlin.G0> lVar) {
        com.avito.android.publish.date_picker.b bVar = this.f237529A0;
        if (bVar == null) {
            bVar = null;
        }
        bVar.d(requireContext(), aVar, c29377e, lVar);
    }

    @Override // Id0.c
    public final int K1() {
        u3.l<SimpleTestGroupWithNone> lVar = this.f237539K0;
        if (lVar == null) {
            lVar = null;
        }
        return lVar.f439745a.f439749b.b() ? R.layout.publish_details_object_actions_re23 : R.layout.publish_details_actions;
    }

    @Override // com.avito.android.publish.view.a.b
    public final void K2(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f237533E0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, null, 2);
    }

    @Override // Id0.c
    public final void g2() {
        H2 h22 = this.f237541M0;
        if (h22 != null) {
            h22.dispose();
        }
    }

    @Override // com.avito.android.publish.view.m.a
    public final void g4(@Y61.k AddressParameter addressParameter, boolean z12) {
        if (addressParameter.getFlowType() == null || addressParameter.getFlowType() == AddressParameter.GeoFlowType.MAP) {
            AddressParameter.Value value = addressParameter.getValue();
            PublishIntentFactory publishIntentFactory = this.f237547t0;
            Intent intentG = (publishIntentFactory != null ? publishIntentFactory : null).g((2046 & 1) != 0 ? null : value, (2046 & 4) != 0 ? null : null, (2046 & 8) != 0 ? null : null, (2046 & 16) != 0 ? PublishIntentFactory.LocationPickerChooseButtonLocation.f231991b : PublishIntentFactory.LocationPickerChooseButtonLocation.f231992c, (2046 & 32) != 0 ? null : null, (2046 & 64) != 0 ? null : null, (2046 & 128) != 0 ? null : null, (2046 & 256) == 0, (2046 & 1024) != 0 ? null : null, FlowType.f231903c);
            com.avito.android.publish.view.result_handler.a aVar = this.f237536H0;
            if (aVar == null) {
                aVar = null;
            }
            aVar.c(l1(), this, intentG, ErrorCodes.PROTOCOL_EXCEPTION, true);
            return;
        }
        AddressParameter.Value value2 = addressParameter.getValue();
        AddressParameter.GeoFlowType flowType = addressParameter.getFlowType();
        String id2 = addressParameter.getId();
        InterfaceC35139d interfaceC35139d = this.f237548u0;
        InterfaceC35139d interfaceC35139d2 = interfaceC35139d != null ? interfaceC35139d : null;
        int i12 = flowType == null ? -1 : a.f237554a[flowType.ordinal()];
        PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType = i12 != 1 ? i12 != 2 ? PublishIntentFactory.SuggestLocationsFlowType.Default.f231995b : PublishIntentFactory.SuggestLocationsFlowType.Region.f231998b : PublishIntentFactory.SuggestLocationsFlowType.Historical.f231997b;
        String text = value2 != null ? value2.getText() : null;
        if (text == null) {
            text = "";
        }
        Intent intentA = interfaceC35139d2.a(null, null, null, text, PublishIntentFactory.LocationPickerChooseButtonLocation.f231992c, null, (32576 & 64) != 0 ? PublishIntentFactory.SuggestLocationsFlowType.Default.f231995b : suggestLocationsFlowType, (32576 & 128) != 0 ? null : null, (32576 & 256) != 0 ? null : null, (32576 & 2048) != 0 ? null : null, (32576 & 8192) != 0 ? null : id2, (32576 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : Boolean.TRUE);
        com.avito.android.publish.view.result_handler.a aVar2 = this.f237536H0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        aVar2.c(l1(), this, intentA, ErrorCodes.PROTOCOL_EXCEPTION, true);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        com.avito.android.publish.view.result_handler.a aVar = this.f237536H0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.d(getTag(), i12, i13, intent, new c(3, this, ObjectFillFormFragment.class, "onPublishIntentResult", "onPublishIntentResult(IILandroid/content/Intent;)V", 0));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC36014j interfaceC36014j = this.f237537I0;
        if (interfaceC36014j == null) {
            interfaceC36014j = null;
        }
        interfaceC36014j.e(requireContext());
        C22960s.b(this, "SUGGEST_INSTITUTES", new d());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        u3.l<SimpleTestGroupWithNone> lVar = this.f237539K0;
        if (lVar == null) {
            lVar = null;
        }
        return layoutInflater.inflate(lVar.f439745a.f439749b.b() ? R.layout.publish_details_object_re23 : R.layout.publish_details, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC36014j interfaceC36014j = this.f237537I0;
        if (interfaceC36014j == null) {
            interfaceC36014j = null;
        }
        interfaceC36014j.d();
        super.onDestroy();
    }

    @Override // com.avito.android.details.SelectItemBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C33975x c33975x = this.f237550w0;
        if (c33975x == null) {
            c33975x = null;
        }
        if (!c33975x.f238120U.v().invoke().booleanValue()) {
            c33975x.f238124Y.f238098d.e();
        }
        Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set = c33975x.f238132g0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof com.avito.android.publish.slots.q) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.avito.android.publish.slots.q) it.next()).clear();
        }
        c33975x.f238108E.a();
        c33975x.f238128c0.e();
        c33975x.f238129d0 = null;
        super.onDestroyView();
        N0 n02 = this.f237545Q0;
        if (n02 != null) {
            n02.b();
        }
        this.f237545Q0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.avito.android.publish.view.result_handler.a aVar = this.f237536H0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.b(getTag(), new e(3, this, ObjectFillFormFragment.class, "onPublishIntentResult", "onPublishIntentResult(IILandroid/content/Intent;)V", 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC33955k interfaceC33955k = this.f237551x0;
        if (interfaceC33955k == null) {
            interfaceC33955k = null;
        }
        bundle.putBundle("interactor", interfaceC33955k.P());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C33975x c33975x = this.f237550w0;
        if (c33975x == null) {
            c33975x = null;
        }
        c33975x.f238130e0 = this;
        c33975x.f238114O.e(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        this.f237540L0.removeCallbacksAndMessages(null);
        C33975x c33975x = this.f237550w0;
        (c33975x != null ? c33975x : null).c0();
        super.onStop();
    }

    @Override // com.avito.android.details.SelectItemBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        InterfaceC35745a5 interfaceC35745a5;
        String title;
        SelectParameter.Value selectedValue;
        PriceListDisplayingOptions priceListDisplaying;
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        N0 n02 = new N0(viewGroup);
        this.f237545Q0 = n02;
        C33947g c33947g = new C33947g(this, 0);
        C33975x c33975x = this.f237550w0;
        C33975x c33975x2 = c33975x != null ? c33975x : null;
        InterfaceC28373a interfaceC28373a = this.f237549v0;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        RecyclerView.Adapter<?> adapter = this.f237552y0;
        RecyclerView.Adapter<?> adapter2 = adapter != null ? adapter : null;
        com.avito.android.recycler.data_aware.c cVar = this.f237553z0;
        com.avito.android.recycler.data_aware.c cVar2 = cVar != null ? cVar : null;
        com.avito.android.lib.deprecated_design.dialog.a aVar = this.f237530B0;
        this.f237542N0 = new C33789t(viewGroup, c33947g, c33975x2, interfaceC28373a2, 0L, adapter2, cVar2, aVar != null ? aVar : null, Boolean.FALSE, true, null, n02, 1040, null);
        this.f237543O0 = new com.avito.android.publish.details.r(view);
        C33975x c33975x3 = this.f237550w0;
        if (c33975x3 == null) {
            c33975x3 = null;
        }
        C33789t c33789t = this.f237542N0;
        if (c33789t == null) {
            c33789t = null;
        }
        Set<TV0.d<?, ?>> set = this.f237535G0;
        if (set == null) {
            set = null;
        }
        c33975x3.f238129d0 = c33789t;
        InterfaceC33955k interfaceC33955k = c33975x3.f238113N;
        ParametersTree parametersTreeWa = interfaceC33955k.wa();
        com.avito.android.publish.objects.slot.c cVar3 = c33975x3.f238124Y;
        if (parametersTreeWa != null) {
            c33975x3.f238132g0 = cVar3.a(c33975x3.f238132g0, parametersTreeWa);
        }
        u3.l<SimpleTestGroupWithNone> lVar = c33975x3.f238127b0;
        if (lVar.f439745a.f439749b.b()) {
            c33789t.o(R.attr.ic_close24);
            c33789t.n(!interfaceC33955k.getF238072m() ? ItemDetailsView.RightTopButtonStyle.f232949c : ItemDetailsView.RightTopButtonStyle.f232950d);
        } else {
            c33789t.o(R.attr.ic_arrowBack24);
            c33789t.n(ItemDetailsView.RightTopButtonStyle.f232950d);
        }
        DisplayingOptions displayingOptions = c33975x3.le().getDisplayingOptions();
        String valuesProviderParamId = (displayingOptions == null || (priceListDisplaying = displayingOptions.getPriceListDisplaying()) == null) ? null : priceListDisplaying.getValuesProviderParamId();
        ObjectFillFormScreenParams.SelectedValue selectedValue2 = c33975x3.f238110K;
        Q1 q12 = c33975x3.f238120U;
        if (valuesProviderParamId != null && q12.x().invoke().booleanValue() && !lVar.f439745a.f439749b.b()) {
            ParametersTree parametersTreeWa2 = interfaceC33955k.wa();
            ParameterSlot parameterSlotFindParameter = parametersTreeWa2 != null ? parametersTreeWa2.findParameter(valuesProviderParamId) : null;
            SelectParameter selectParameter = parameterSlotFindParameter instanceof SelectParameter ? (SelectParameter) parameterSlotFindParameter : null;
            if (selectParameter == null || (selectedValue = selectParameter.getSelectedValue()) == null || (title = selectedValue.getTitle()) == null) {
                title = selectedValue2 != null ? selectedValue2.f237562d : null;
                if (title == null) {
                    title = "";
                }
            }
            C33789t c33789t2 = c33975x3.f238129d0;
            if (c33789t2 != null) {
                c33789t2.p(title);
            }
        }
        if (c33975x3.f238121V) {
            c33975x3.f238111L.c(new Gd0.d(c33975x3.ne(), c33975x3.oe(), c33975x3.me(), c33975x3.f238112M));
        }
        InterfaceC36030r0 interfaceC36030r0 = c33975x3.f238108E;
        interfaceC36030r0.i(set);
        com.jakewharton.rxrelay3.c cVarG = interfaceC36030r0.getF319332k();
        C33976y c33976y = new C33976y(c33975x3, c33789t);
        l41.g<? super Throwable> gVar = C33977z.f238168b;
        cVarG.getClass();
        io.reactivex.rxjava3.disposables.d dVarV0 = cVarG.v0(c33976y, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c);
        io.reactivex.rxjava3.disposables.c cVar4 = c33975x3.f238128c0;
        cVar4.b(dVarV0);
        Iterator<T> it = set.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            interfaceC35745a5 = c33975x3.f238117R;
            if (!zHasNext) {
                break;
            }
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.blueprints.input.d) {
                com.avito.android.blueprints.input.d dVar2 = (com.avito.android.blueprints.input.d) dVar;
                cVar4.b(dVar2.b().k0(com.avito.android.items.d.class).v0(new K(c33975x3), W.f237571b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                cVar4.b(dVar2.n().t0(new C33950h0(c33975x3)));
            } else if (dVar instanceof com.avito.android.blueprint.input.c) {
                cVar4.b(((com.avito.android.blueprint.input.c) dVar).b().k0(com.avito.android.items.d.class).v0(new s0(c33975x3), w0.f238107b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprints.chips.d) {
                io.reactivex.rxjava3.core.z<Ij.b> zVarH = ((com.avito.android.blueprints.chips.d) dVar).h();
                x0 x0Var = new x0(c33975x3);
                l41.g<? super Throwable> gVar2 = y0.f238167b;
                zVarH.getClass();
                cVar4.b(zVarH.v0(x0Var, gVar2, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.chips.single.d) {
                io.reactivex.rxjava3.core.z<Ij.b> zVarH2 = ((com.avito.android.blueprint.chips.single.d) dVar).h();
                z0 z0Var = new z0(c33975x3);
                l41.g<? super Throwable> gVar3 = A0.f237468b;
                zVarH2.getClass();
                cVar4.b(zVarH2.v0(z0Var, gVar3, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprints.chips_multiselect.c) {
                io.reactivex.rxjava3.core.z<Ij.b> zVarH3 = ((com.avito.android.blueprints.chips_multiselect.c) dVar).h();
                A a12 = new A(c33975x3);
                l41.g<? super Throwable> gVar4 = B.f237469b;
                zVarH3.getClass();
                cVar4.b(zVarH3.v0(a12, gVar4, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.chips.multiple.c) {
                io.reactivex.rxjava3.core.z<Ij.b> zVarH4 = ((com.avito.android.blueprint.chips.multiple.c) dVar).h();
                C c12 = new C(c33975x3);
                l41.g<? super Throwable> gVar5 = D.f237473b;
                zVarH4.getClass();
                cVar4.b(zVarH4.v0(c12, gVar5, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprints.radiogroup.c) {
                io.reactivex.rxjava3.core.z<Ij.b> zVarH5 = ((com.avito.android.blueprints.radiogroup.c) dVar).h();
                E e12 = new E(c33975x3);
                l41.g<? super Throwable> gVar6 = F.f237477b;
                zVarH5.getClass();
                cVar4.b(zVarH5.v0(e12, gVar6, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.radiogroup.c) {
                io.reactivex.rxjava3.core.z<Ij.b> zVarH6 = ((com.avito.android.blueprint.radiogroup.c) dVar).h();
                G g12 = new G(c33975x3);
                l41.g<? super Throwable> gVar7 = H.f237481b;
                zVarH6.getClass();
                cVar4.b(zVarH6.v0(g12, gVar7, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprints.select.c) {
                cVar4.b(((com.avito.android.blueprints.select.c) dVar).c().k0(ParameterElement.C.class).v0(new I(c33975x3), J.f237487b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprints.selector_card_group_bottom_sheet.l) {
                C43259k.d(androidx.view.N0.a(c33975x3), null, null, new L((com.avito.android.blueprints.selector_card_group_bottom_sheet.l) dVar, c33975x3, null), 3);
            } else if (dVar instanceof com.avito.android.blueprint.select.c) {
                cVar4.b(((com.avito.android.blueprint.select.c) dVar).c().k0(ParameterElement.C.class).v0(new M(c33975x3), N.f237521b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.address.c) {
                cVar4.b(((com.avito.android.blueprint.address.c) dVar).c().k0(ParameterElement.C.class).v0(new O(c33975x3), P.f237563b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.multiselect.c) {
                com.avito.android.blueprint.multiselect.c cVar5 = (com.avito.android.blueprint.multiselect.c) dVar;
                io.reactivex.rxjava3.internal.operators.observable.I0 i0J0 = cVar5.c().j0(interfaceC35745a5.e());
                Q q13 = new Q(c33975x3);
                l41.g<? super Throwable> gVar8 = S.f237567b;
                InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
                cVar4.b(i0J0.v0(q13, gVar8, interfaceC43543a));
                cVar4.b(cVar5.z().j0(interfaceC35745a5.e()).v0(new T(c33975x3), U.f237569b, interfaceC43543a));
            } else if (dVar instanceof com.avito.android.blueprints.publish.multiselect.c) {
                com.avito.android.blueprints.publish.multiselect.c cVar6 = (com.avito.android.blueprints.publish.multiselect.c) dVar;
                io.reactivex.rxjava3.internal.operators.observable.I0 i0J02 = cVar6.c().j0(interfaceC35745a5.e());
                V v12 = new V(c33975x3);
                l41.g<? super Throwable> gVar9 = X.f237572b;
                InterfaceC43543a interfaceC43543a2 = io.reactivex.rxjava3.internal.functions.a.f401993c;
                cVar4.b(i0J02.v0(v12, gVar9, interfaceC43543a2));
                cVar4.b(cVar6.z().j0(interfaceC35745a5.e()).v0(new Y(c33975x3), Z.f237574b, interfaceC43543a2));
            } else if (dVar instanceof com.avito.android.compose_items.multiselect.c) {
                com.avito.android.compose_items.multiselect.c cVar7 = (com.avito.android.compose_items.multiselect.c) dVar;
                io.reactivex.rxjava3.internal.operators.observable.I0 i0J03 = cVar7.c().j0(interfaceC35745a5.e());
                C33887a0 c33887a0 = new C33887a0(c33975x3);
                l41.g<? super Throwable> gVar10 = C33889b0.f237576b;
                InterfaceC43543a interfaceC43543a3 = io.reactivex.rxjava3.internal.functions.a.f401993c;
                cVar4.b(i0J03.v0(c33887a0, gVar10, interfaceC43543a3));
                cVar4.b(cVar7.z().j0(interfaceC35745a5.e()).v0(new C33891c0(c33975x3), C33893d0.f237598b, interfaceC43543a3));
            } else if (dVar instanceof com.avito.android.compose_items.chips_multiselect.c) {
                io.reactivex.rxjava3.core.z<Ij.b> zVarH7 = ((com.avito.android.compose_items.chips_multiselect.c) dVar).h();
                C33944e0 c33944e0 = new C33944e0(c33975x3);
                l41.g<? super Throwable> gVar11 = C33946f0.f238040b;
                zVarH7.getClass();
                cVar4.b(zVarH7.v0(c33944e0, gVar11, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.compose_items.chips_select.c) {
                io.reactivex.rxjava3.core.z<Ij.b> zVarH8 = ((com.avito.android.compose_items.chips_select.c) dVar).h();
                C33948g0 c33948g0 = new C33948g0(c33975x3);
                l41.g<? super Throwable> gVar12 = C33952i0.f238045b;
                zVarH8.getClass();
                cVar4.b(zVarH8.v0(c33948g0, gVar12, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprints.publish.select.inline.c) {
                cVar4.b(((com.avito.android.blueprints.publish.select.inline.c) dVar).g().j0(interfaceC35745a5.e()).v0(new C33954j0(c33975x3), C33956k0.f238050b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprint.checkbox.c) {
                cVar4.b(((com.avito.android.blueprint.checkbox.c) dVar).g().j0(interfaceC35745a5.e()).v0(new C33958l0(c33975x3), C33960m0.f238054b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprints.switcher.b) {
                q12.getClass();
                kotlin.reflect.n<Object> nVar = Q1.f67448x0[79];
                if (((Boolean) q12.f67499m0.a().invoke()).booleanValue()) {
                    cVar4.b(((com.avito.android.blueprints.switcher.b) dVar).b().j0(interfaceC35745a5.e()).v0(new C33962n0(c33975x3), C33964o0.f238058b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                }
            } else if (dVar instanceof com.avito.android.publish.objects.blueprints.c) {
                C41981q0 f237585c = ((com.avito.android.publish.objects.blueprints.c) dVar).getF237585c();
                C33966p0 c33966p0 = new C33966p0(c33975x3);
                l41.g<? super Throwable> gVar13 = C33968q0.f238073b;
                f237585c.getClass();
                cVar4.b(f237585c.v0(c33966p0, gVar13, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprints.publish.date_interval.c) {
                new com.avito.android.blueprints.publish.date_interval.f(new J0(c33975x3)).a((com.avito.android.blueprints.publish.date_interval.c) dVar, cVar4);
            } else if (dVar instanceof com.avito.android.blueprint.date.interval.c) {
                new com.avito.android.blueprint.date.interval.f(new I0(c33975x3)).a((com.avito.android.blueprint.date.interval.c) dVar, cVar4);
            } else if (dVar instanceof com.avito.android.publish.slots.imv.item.d) {
                cVar4.b(((com.avito.android.publish.slots.imv.item.d) dVar).f244279f.y(300L, TimeUnit.MILLISECONDS, interfaceC35745a5.c()).j0(interfaceC35745a5.e()).v0(new C33969r0(c33975x3), t0.f238100b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.blueprints.job_suggest.c) {
                cVar4.b(kotlinx.coroutines.rx3.y.b(((com.avito.android.blueprints.job_suggest.c) dVar).f106042c).x0(interfaceC35745a5.e()).y(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).v0(new u0(c33975x3), v0.f238106b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
        C41981q0 c41981q0 = cVar3.f238097c;
        B0 b02 = new B0(c33975x3);
        l41.g<? super Throwable> gVar14 = C0.f237472b;
        c41981q0.getClass();
        cVar4.b(c41981q0.v0(b02, gVar14, io.reactivex.rxjava3.internal.functions.a.f401993c));
        c33975x3.re();
        if (selectedValue2 != null && q12.x().invoke().booleanValue()) {
            c33975x3.qe(new Ij.b(selectedValue2.f237560b, new JO.m(selectedValue2.f237561c, selectedValue2.f237562d, null, true, null, null, null, false, null, null, false, null, null, null, null, null, 65524, null), null, 4, null));
        }
        cVar4.b(c33975x3.f238126a0.a().z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(new F0(c33975x3), G0.f237480b));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Parcelable parcelable = requireArguments().getParcelable("object_fill_form_screen_params_key");
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ObjectFillFormScreenParams objectFillFormScreenParams = (ObjectFillFormScreenParams) parcelable;
        Bundle bundle2 = bundle != null ? bundle.getBundle("interactor") : null;
        InterfaceC33938v.a aVarA = C33894a.a();
        Resources resources = getResources();
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(this);
        Bundle arguments = getArguments();
        boolean z12 = arguments != null ? arguments.getBoolean("isPriceList", false) : false;
        aVarA.a(resources, activityC22955mRequireActivity, this, objectFillFormScreenParams.f237557b, objectFillFormScreenParams.f237558c, objectFillFormScreenParams.f237559d, bundle2, rVarC, z12, (InterfaceC33935s) C29972i.a(C29972i.b(this), InterfaceC33935s.class), cv.c.b(this)).a(this);
    }

    public final void s5(@Y61.k String str) {
        K2.e(this);
        com.avito.android.publish.objects.result.a aVar = this.f237532D0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.a(ObjectsFragmentResultImpl.ObjectsRequestKey.f238086c, str);
        InterfaceC33971t interfaceC33971t = this.f237531C0;
        (interfaceC33971t != null ? interfaceC33971t : null).i0();
    }

    @Override // Id0.c
    public final void t2(@Y61.k View view) {
        com.avito.android.publish.details.r rVar = this.f237543O0;
        if (rVar == null) {
            rVar = null;
        }
        C33975x c33975x = this.f237550w0;
        if (c33975x == null) {
            c33975x = null;
        }
        C33757i c33757i = new C33757i(view, rVar, c33975x);
        com.avito.android.publish.details.r rVar2 = this.f237543O0;
        if (rVar2 == null) {
            rVar2 = null;
        }
        C33975x c33975x2 = this.f237550w0;
        if (c33975x2 == null) {
            c33975x2 = null;
        }
        C33745e c33745e = new C33745e(c33757i, new C33775o(view, rVar2, c33975x2));
        com.avito.android.publish.details.r rVar3 = this.f237543O0;
        if (rVar3 == null) {
            rVar3 = null;
        }
        this.f237544P0 = new C33781q(requireView(), c33745e, new C33766l(view, rVar3));
        InterfaceC33888b interfaceC33888b = this.f237534F0;
        if (interfaceC33888b == null) {
            interfaceC33888b = null;
        }
        C33789t c33789t = this.f237542N0;
        interfaceC33888b.a(c33789t != null ? c33789t : null, c33745e);
        this.f237541M0 = K2.a(requireActivity(), new b());
        c33745e.r(requireArguments().getBoolean("isEdit") ? getResources().getString(R.string.save_changes) : getResources().getString(R.string.add));
        c33745e.f();
    }

    public final void t5() {
        InterfaceC19542a interfaceC19542a = this.f237546s0;
        if (interfaceC19542a == null) {
            interfaceC19542a = null;
        }
        Intent intentA = interfaceC19542a.a(AuthSource.f92694c);
        com.avito.android.publish.view.result_handler.a aVar = this.f237536H0;
        (aVar != null ? aVar : null).c(l1(), this, intentA, 1, false);
    }
}
