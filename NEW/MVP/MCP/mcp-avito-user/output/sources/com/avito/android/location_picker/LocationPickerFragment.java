package com.avito.android.location_picker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.location_picker.InterfaceC31532a;
import com.avito.android.location_picker.analytics.ScreenCloseFromBlock;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.permissions.C33035e;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import vW.C49271a;

/* compiled from: LocationPickerFragment.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/location_picker/LocationPickerFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/location_picker/a$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LocationPickerFragment extends TabBaseFragment implements InterfaceC31532a.InterfaceC5348a, InterfaceC28477j.b {

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final a f182158D0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.disposables.d f182159A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f182160B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f182161C0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC31532a f182162t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.location_picker.analytics.a f182163u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public C33035e f182164v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.location.find.o f182165w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public N0 f182166x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public K0 f182167y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182168z0;

    /* compiled from: LocationPickerFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/location_picker/LocationPickerFragment$a;", "", "<init>", "()V", "", "KEY_MAP_STATE", "Ljava/lang/String;", "KEY_STATE", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: LocationPickerFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.location_picker.LocationPickerFragment$a$a, reason: collision with other inner class name */
        public static final class C5347a extends kotlin.jvm.internal.N implements Y41.l<Bundle, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ LocationPickerArguments f182169l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5347a(LocationPickerArguments locationPickerArguments) {
                super(1);
                this.f182169l = locationPickerArguments;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(Bundle bundle) {
                bundle.putParcelable("key.arguments.location_picker", this.f182169l);
                return kotlin.G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static LocationPickerFragment a(@Y61.k LocationPickerArguments locationPickerArguments) {
            LocationPickerFragment locationPickerFragment = new LocationPickerFragment();
            C35966w1.a(locationPickerFragment, -1, new C5347a(locationPickerArguments));
            return locationPickerFragment;
        }

        public a() {
        }
    }

    /* compiled from: LocationPickerFragment.kt */
    @Metadata(d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"com/avito/android/location_picker/H0", "invoke", "()Lcom/avito/android/location_picker/H0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<H0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final H0 invoke() {
            return new H0(LocationPickerFragment.this);
        }
    }

    /* compiled from: LocationPickerFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/location_picker/LocationPickerFragment$c", "Landroidx/activity/x;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends androidx.view.x {
        public c() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            LocationPickerFragment locationPickerFragment = LocationPickerFragment.this;
            InterfaceC31532a interfaceC31532a = locationPickerFragment.f182162t0;
            if (interfaceC31532a == null) {
                interfaceC31532a = null;
            }
            LocationPickerState locationPickerStateF0 = interfaceC31532a.f0();
            if (locationPickerStateF0 != null && locationPickerStateF0.f182375t.f182396q) {
                com.avito.android.location_picker.analytics.a aVar = locationPickerFragment.f182163u0;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.b(locationPickerStateF0, ScreenCloseFromBlock.f182204c);
            }
            N0 n02 = locationPickerFragment.f182166x0;
            (n02 != null ? n02 : null).R0();
        }
    }

    /* compiled from: LocationPickerFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Bundle, kotlin.G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Bundle bundle) {
            Bundle bundle2 = bundle;
            InterfaceC31532a interfaceC31532a = LocationPickerFragment.this.f182162t0;
            if (interfaceC31532a == null) {
                interfaceC31532a = null;
            }
            LocationPickerState locationPickerStateF0 = interfaceC31532a.f0();
            bundle2.putParcelable("KEY_STATE", locationPickerStateF0);
            bundle2.putParcelable("KEY_MAP_STATE", locationPickerStateF0 != null ? new AvitoMapTarget(locationPickerStateF0.f182358c, locationPickerStateF0.f182360e) : null);
            return kotlin.G0.f406611a;
        }
    }

    public LocationPickerFragment() {
        super(0, 1, null);
        this.f182168z0 = new com.jakewharton.rxrelay3.c();
        this.f182160B0 = new NavigationState(false, null, 2, null);
        this.f182161C0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final boolean i5() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.l
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        this.f182168z0.accept(new C49271a());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    @Override // androidx.fragment.app.Fragment
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(@Y61.k android.view.LayoutInflater r58, @Y61.l android.view.ViewGroup r59, @Y61.l android.os.Bundle r60) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.location_picker.LocationPickerFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC31532a interfaceC31532a = this.f182162t0;
        if (interfaceC31532a == null) {
            interfaceC31532a = null;
        }
        interfaceC31532a.destroy();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC31532a interfaceC31532a = this.f182162t0;
        if (interfaceC31532a == null) {
            interfaceC31532a = null;
        }
        interfaceC31532a.b();
        com.avito.android.location.find.o oVar = this.f182165w0;
        (oVar != null ? oVar : null).c(requireActivity());
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.avito.android.location.find.o oVar = this.f182165w0;
        if (oVar == null) {
            oVar = null;
        }
        oVar.a(requireActivity());
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        A5(bundle, new d());
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C33035e c33035e = this.f182164v0;
        if (c33035e == null) {
            c33035e = null;
        }
        c33035e.f(null, null, this);
        InterfaceC31532a interfaceC31532a = this.f182162t0;
        if (interfaceC31532a == null) {
            interfaceC31532a = null;
        }
        interfaceC31532a.d(this);
        InterfaceC31532a interfaceC31532a2 = this.f182162t0;
        this.f182159A0 = (interfaceC31532a2 != null ? interfaceC31532a2 : null).c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC31532a interfaceC31532a = this.f182162t0;
        if (interfaceC31532a == null) {
            interfaceC31532a = null;
        }
        interfaceC31532a.a();
        C33035e c33035e = this.f182164v0;
        (c33035e != null ? c33035e : null).a();
        super.onStop();
        io.reactivex.rxjava3.disposables.d dVar = this.f182159A0;
        if (dVar != null) {
            dVar.dispose();
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        K0 k02 = this.f182167y0;
        if (k02 == null) {
            k02 = null;
        }
        k02.d();
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF128888F0() {
        return this.f182160B0;
    }
}
