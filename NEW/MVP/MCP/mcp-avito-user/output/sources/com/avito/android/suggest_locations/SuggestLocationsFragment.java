package com.avito.android.suggest_locations;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.geo_common.model.location_picker.LocationFlowType;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.location_picker.LocationPickerArguments;
import com.avito.android.location_picker.LocationPickerFragment;
import com.avito.android.location_picker.view.LocationPickerChooseButtonLocation;
import com.avito.android.publish.FlowType;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.suggest_locations.InterfaceC35160z;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.K2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestLocationsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/suggest_locations/SuggestLocationsFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/suggest_locations/z$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestLocationsFragment extends TabBaseFragment implements InterfaceC35160z.a, InterfaceC28477j.b {

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public static final a f292138F0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public PublishIntentFactory f292139A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f292140B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f292141C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.l
    public AddressParameter.ValidationRules f292142D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<Location> f292143E0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC35160z f292144t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public PublishIntentFactory.LocationPickerChooseButtonLocation f292145u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public String f292146v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f292147w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public String f292148x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public String f292149y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public Boolean f292150z0;

    /* compiled from: SuggestLocationsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/suggest_locations/SuggestLocationsFragment$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "KEY_STATE", "PICKER_LOCATION_DIALOG_FRAGMENT_TAG", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: SuggestLocationsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.suggest_locations.SuggestLocationsFragment$a$a, reason: collision with other inner class name */
        public static final class C8858a extends kotlin.jvm.internal.N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ SuggestLocationsArguments f292151l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8858a(SuggestLocationsArguments suggestLocationsArguments) {
                super(1);
                this.f292151l = suggestLocationsArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("key_arguments", this.f292151l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static SuggestLocationsFragment a(@Y61.k SuggestLocationsArguments suggestLocationsArguments) {
            SuggestLocationsFragment suggestLocationsFragment = new SuggestLocationsFragment();
            C35966w1.a(suggestLocationsFragment, -1, new C8858a(suggestLocationsArguments));
            return suggestLocationsFragment;
        }

        public a() {
        }
    }

    /* compiled from: SuggestLocationsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[PublishIntentFactory.LocationPickerChooseButtonLocation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation = PublishIntentFactory.LocationPickerChooseButtonLocation.f231991b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: SuggestLocationsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Bundle, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            Bundle bundle2 = bundle;
            InterfaceC35160z interfaceC35160z = SuggestLocationsFragment.this.f292144t0;
            if (interfaceC35160z == null) {
                interfaceC35160z = null;
            }
            com.avito.android.util.G.c(bundle2, "key_state", interfaceC35160z.d0());
            return G0.f406611a;
        }
    }

    public SuggestLocationsFragment() {
        super(0, 1, null);
        this.f292141C0 = new NavigationState(false, null, 2, null);
        this.f292143E0 = new com.avito.android.util.architecture_components.D<>();
    }

    public final void D5() {
        K2.e(this);
        if (!(l1() instanceof SuggestLocationsActivity)) {
            B5(0, null);
            r5();
            return;
        }
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.setResult(0);
        }
        ActivityC22955m activityC22955mL12 = l1();
        if (activityC22955mL12 != null) {
            activityC22955mL12.finish();
        }
    }

    public final void E5(@Y61.k AddressSuggestion addressSuggestion) {
        K2.e(this);
        Coordinates coordinates = addressSuggestion.getCoordinates();
        double latitude = coordinates != null ? coordinates.getLatitude() : 0.0d;
        Coordinates coordinates2 = addressSuggestion.getCoordinates();
        F5(new AddressParameter.Value(latitude, coordinates2 != null ? coordinates2.getLongitude() : 0.0d, addressSuggestion.c(), addressSuggestion.getJsonWebToken(), null, 16, null));
    }

    public final void F5(AddressParameter.Value value) {
        if (this.f292148x0 != null) {
            Bundle bundleB = C22777e.b(new kotlin.Q("EXTRA_ADDRESS_RESULT", value));
            String str = this.f292148x0;
            if (str != null) {
                getParentFragmentManager().o0(bundleB, str);
                return;
            }
            return;
        }
        if (!(l1() instanceof SuggestLocationsActivity)) {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_ADDRESS_RESULT", value);
            G0 g02 = G0.f406611a;
            B5(-1, intent);
            r5();
            return;
        }
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            Intent intent2 = new Intent();
            intent2.putExtra("EXTRA_ADDRESS_RESULT", value);
            intent2.putExtra("EXTRA_ADDRESS_PARAM_ID", this.f292149y0);
            G0 g03 = G0.f406611a;
            activityC22955mL1.setResult(-1, intent2);
        }
        ActivityC22955m activityC22955mL12 = l1();
        if (activityC22955mL12 != null) {
            activityC22955mL12.finish();
        }
    }

    public final void G5() {
        ActivityC22955m activityC22955mL1 = l1();
        if ((activityC22955mL1 != null ? activityC22955mL1.getCurrentFocus() : null) == null) {
            ActivityC22955m activityC22955mL12 = l1();
            Object systemService = activityC22955mL12 != null ? activityC22955mL12.getSystemService("input_method") : null;
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                View view = getView();
                inputMethodManager.hideSoftInputFromWindow(view != null ? view.getWindowToken() : null, 0);
            }
        }
    }

    public final void H5(@Y61.k AddressSuggestion addressSuggestion) {
        K2.e(this);
        PublishIntentFactory publishIntentFactory = this.f292139A0;
        if (publishIntentFactory == null) {
            publishIntentFactory = null;
        }
        PublishIntentFactory publishIntentFactory2 = publishIntentFactory;
        Coordinates coordinates = addressSuggestion.getCoordinates();
        double latitude = coordinates != null ? coordinates.getLatitude() : 0.0d;
        Coordinates coordinates2 = addressSuggestion.getCoordinates();
        AddressParameter.Value value = new AddressParameter.Value(latitude, coordinates2 != null ? coordinates2.getLongitude() : 0.0d, addressSuggestion.c(), addressSuggestion.getJsonWebToken(), null, 16, null);
        PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation = this.f292145u0;
        if (locationPickerChooseButtonLocation == null) {
            locationPickerChooseButtonLocation = PublishIntentFactory.LocationPickerChooseButtonLocation.f231991b;
        }
        startActivityForResult(publishIntentFactory2.g((2046 & 1) != 0 ? null : value, (2046 & 4) != 0 ? null : null, (2046 & 8) != 0 ? null : null, (2046 & 16) != 0 ? PublishIntentFactory.LocationPickerChooseButtonLocation.f231991b : locationPickerChooseButtonLocation, (2046 & 32) != 0 ? null : null, (2046 & 64) != 0 ? null : null, (2046 & 128) != 0 ? null : this.f292142D0, (2046 & 256) == 0, (2046 & 1024) != 0 ? null : this.f292149y0, FlowType.f231905e), ErrorCodes.PROTOCOL_EXCEPTION);
    }

    public final void I5(@Y61.k AddressSuggestion addressSuggestion, @j.D int i12) {
        LocationPickerChooseButtonLocation locationPickerChooseButtonLocation;
        int iOrdinal;
        K2.e(this);
        G5();
        Coordinates coordinates = addressSuggestion.getCoordinates();
        double latitude = coordinates != null ? coordinates.getLatitude() : 0.0d;
        Coordinates coordinates2 = addressSuggestion.getCoordinates();
        AddressParameter.Value value = new AddressParameter.Value(latitude, coordinates2 != null ? coordinates2.getLongitude() : 0.0d, addressSuggestion.c(), addressSuggestion.getJsonWebToken(), null, 16, null);
        PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation2 = this.f292145u0;
        if (locationPickerChooseButtonLocation2 == null || (iOrdinal = locationPickerChooseButtonLocation2.ordinal()) == 0) {
            locationPickerChooseButtonLocation = LocationPickerChooseButtonLocation.f182519b;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            locationPickerChooseButtonLocation = LocationPickerChooseButtonLocation.f182520c;
        }
        LocationPickerArguments locationPickerArguments = new LocationPickerArguments(value, null, null, null, locationPickerChooseButtonLocation, null, null, this.f292142D0, false, false, false, null, false, this.f292149y0, false, LocationFlowType.f159419g, 24430, null);
        LocationPickerFragment.f182158D0.getClass();
        LocationPickerFragment locationPickerFragmentA = LocationPickerFragment.a.a(locationPickerArguments);
        androidx.fragment.app.H hE2 = getParentFragmentManager().e();
        hE2.j(i12, locationPickerFragmentA, "tag.picker_location_dialog_fragment", 1);
        hE2.c(null);
        hE2.e();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.l
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        AddressParameter.Value value;
        Bundle extras;
        super.onActivityResult(i12, i13, intent);
        if (i12 == 1004 && i13 == -1) {
            if (intent == null || (extras = intent.getExtras()) == null) {
                value = null;
            } else {
                value = (AddressParameter.Value) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("EXTRA_ADDRESS_RESULT", AddressParameter.Value.class) : extras.getParcelable("EXTRA_ADDRESS_RESULT"));
            }
            if (value != null) {
                F5(value);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(@Y61.l android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = r20
            super.onCreate(r21)
            android.os.Bundle r1 = r20.getArguments()
            if (r1 == 0) goto Lce
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r3 < r4) goto L18
            java.lang.Object r1 = com.avito.android.short_term_rent.h.k(r1)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            goto L1e
        L18:
            java.lang.String r3 = "key_arguments"
            android.os.Parcelable r1 = r1.getParcelable(r3)
        L1e:
            com.avito.android.suggest_locations.SuggestLocationsArguments r1 = (com.avito.android.suggest_locations.SuggestLocationsArguments) r1
            if (r1 == 0) goto Lce
            java.lang.String r3 = r1.f292126e
            r0.f292146v0 = r3
            com.avito.android.publish.PublishIntentFactory$LocationPickerChooseButtonLocation r3 = r1.f292127f
            r0.f292145u0 = r3
            com.avito.android.remote.model.category_parameters.AddressParameter$ValidationRules r3 = r1.f292130i
            r0.f292142D0 = r3
            boolean r3 = r1.f292131j
            r0.f292147w0 = r3
            java.lang.String r3 = r1.f292136o
            r0.f292149y0 = r3
            java.lang.Boolean r3 = r1.f292137p
            r0.f292150z0 = r3
            android.os.Bundle r3 = r20.t5(r21)
            java.lang.Integer r4 = r1.f292125d
            if (r4 == 0) goto L48
            int r4 = r4.intValue()
        L46:
            r9 = r4
            goto L4c
        L48:
            com.avito.android.suggest_locations.OpenEventFromBlock[] r4 = com.avito.android.suggest_locations.OpenEventFromBlock.f292117b
            r4 = -1
            goto L46
        L4c:
            java.lang.String r10 = r0.f292146v0
            com.avito.android.analytics.screens.D$a r4 = com.avito.android.analytics.screens.D.f90335a
            r4.getClass()
            com.avito.android.analytics.screens.F r4 = com.avito.android.analytics.screens.D.a.a()
            if (r10 == 0) goto L5c
            java.lang.String r5 = "addressesSuggest"
            goto L5e
        L5c:
            java.lang.String r5 = "locationSuggest"
        L5e:
            com.avito.android.suggest_locations.di.q$a r6 = com.avito.android.suggest_locations.di.d.a()
            if (r3 == 0) goto L6c
            java.lang.String r7 = "key_state"
            com.avito.android.util.Kundle r3 = com.avito.android.util.G.a(r3, r7)
            if (r3 != 0) goto L71
        L6c:
            com.avito.android.util.Kundle r3 = new com.avito.android.util.Kundle
            r3.<init>()
        L71:
            if (r10 == 0) goto L76
            r7 = 1
        L74:
            r12 = r7
            goto L78
        L76:
            r7 = 0
            goto L74
        L78:
            com.avito.android.analytics.screens.k r15 = new com.avito.android.analytics.screens.k
            com.avito.android.analytics.screens.LocationSuggestsScreen r7 = com.avito.android.analytics.screens.LocationSuggestsScreen.f90396d
            com.avito.android.analytics.screens.r r8 = com.avito.android.analytics.screens.s.c(r20)
            r15.<init>(r7, r8, r5)
            com.avito.android.K r5 = com.avito.android.di.C29972i.b(r20)
            java.lang.Class<com.avito.android.suggest_locations.di.r> r7 = com.avito.android.suggest_locations.di.r.class
            com.avito.android.di.h r5 = com.avito.android.di.C29972i.a(r5, r7)
            r19 = r5
            com.avito.android.suggest_locations.di.r r19 = (com.avito.android.suggest_locations.di.r) r19
            java.lang.String r14 = r1.f292134m
            java.lang.Boolean r13 = r1.f292137p
            java.lang.String r7 = r1.f292123b
            java.lang.String r8 = r1.f292124c
            com.avito.android.publish.PublishIntentFactory$SuggestLocationsFlowType r11 = r1.f292128g
            java.lang.String r5 = r1.f292129h
            boolean r2 = r1.f292131j
            r21 = r15
            boolean r15 = r1.f292132k
            r16 = r5
            r5 = r6
            r6 = r3
            r3 = r13
            r13 = r16
            r16 = r14
            r14 = r2
            r2 = r21
            r17 = r3
            r18 = r2
            com.avito.android.suggest_locations.di.q r2 = r5.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.a(r0)
            com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker r2 = r0.f292140B0
            if (r2 == 0) goto Lbf
            goto Lc0
        Lbf:
            r2 = 0
        Lc0:
            long r3 = r4.b()
            r2.a(r3)
            java.lang.String r1 = r1.f292135n
            r0.f292148x0 = r1
            kotlin.G0 r2 = kotlin.G0.f406611a
            goto Lcf
        Lce:
            r2 = 0
        Lcf:
            if (r2 != 0) goto Ld4
            r20.D5()
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.suggest_locations.SuggestLocationsFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // androidx.fragment.app.Fragment
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(@Y61.k android.view.LayoutInflater r9, @Y61.l android.view.ViewGroup r10, @Y61.l android.os.Bundle r11) {
        /*
            r8 = this;
            com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker r11 = r8.f292140B0
            r0 = 0
            if (r11 == 0) goto L6
            goto L7
        L6:
            r11 = r0
        L7:
            r11.e()
            r11 = 2131562786(0x7f0d1122, float:1.875101E38)
            r1 = 0
            android.view.View r9 = r9.inflate(r11, r10, r1)
            android.os.Bundle r10 = r8.getArguments()
            if (r10 == 0) goto L33
            int r11 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r11 < r2) goto L25
            java.lang.Object r10 = com.avito.android.short_term_rent.h.k(r10)
            android.os.Parcelable r10 = (android.os.Parcelable) r10
            goto L2b
        L25:
            java.lang.String r11 = "key_arguments"
            android.os.Parcelable r10 = r10.getParcelable(r11)
        L2b:
            com.avito.android.suggest_locations.SuggestLocationsArguments r10 = (com.avito.android.suggest_locations.SuggestLocationsArguments) r10
            if (r10 == 0) goto L33
            boolean r10 = r10.f292133l
            r6 = r10
            goto L34
        L33:
            r6 = r1
        L34:
            com.avito.android.suggest_locations.d0 r10 = new com.avito.android.suggest_locations.d0
            java.lang.String r11 = r8.f292146v0
            if (r11 == 0) goto L3d
            r11 = 1
            r4 = r11
            goto L3e
        L3d:
            r4 = r1
        L3e:
            boolean r5 = r8.f292147w0
            java.lang.Boolean r11 = r8.f292150z0
            if (r11 == 0) goto L48
            boolean r1 = r11.booleanValue()
        L48:
            r7 = r1
            r2 = r10
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            com.avito.android.suggest_locations.z r11 = r8.f292144t0
            if (r11 == 0) goto L53
            goto L54
        L53:
            r11 = r0
        L54:
            r11.b(r10)
            com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker r10 = r8.f292140B0
            if (r10 == 0) goto L5c
            r0 = r10
        L5c:
            r0.d()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.suggest_locations.SuggestLocationsFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC35160z interfaceC35160z = this.f292144t0;
        if (interfaceC35160z == null) {
            interfaceC35160z = null;
        }
        interfaceC35160z.e0();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        A5(bundle, new c());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC35160z interfaceC35160z = this.f292144t0;
        if (interfaceC35160z == null) {
            interfaceC35160z = null;
        }
        interfaceC35160z.a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC35160z interfaceC35160z = this.f292144t0;
        if (interfaceC35160z == null) {
            interfaceC35160z = null;
        }
        interfaceC35160z.c0();
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF128888F0() {
        return this.f292141C0;
    }
}
