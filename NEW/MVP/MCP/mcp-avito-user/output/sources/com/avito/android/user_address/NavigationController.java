package com.avito.android.user_address;

import Y61.k;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.deeplink_handler.view.impl.a;
import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.list.UserAddressListFragment;
import com.avito.android.user_address.map.UserAddressMapFragment;
import com.avito.android.user_address.suggest.UserAddressSuggestFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: NavigationController.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/NavigationController;", "", "Mode", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NavigationController {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final FragmentManager f307095a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a.C4058a f307096b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f307097c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NavigationController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/NavigationController$Mode;", "", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Mode {

        /* renamed from: b, reason: collision with root package name */
        public static final Mode f307098b;

        /* renamed from: c, reason: collision with root package name */
        public static final Mode f307099c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Mode[] f307100d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f307101e;

        static {
            Mode mode = new Mode("CREATE", 0);
            f307098b = mode;
            Mode mode2 = new Mode("EDIT", 1);
            f307099c = mode2;
            Mode[] modeArr = {mode, mode2};
            f307100d = modeArr;
            f307101e = kotlin.enums.c.a(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f307100d.clone();
        }
    }

    public NavigationController(@k FragmentManager fragmentManager, @k a.C4058a c4058a, @k Y41.a aVar) {
        this.f307095a = fragmentManager;
        this.f307096b = c4058a;
        this.f307097c = aVar;
    }

    public final void a(@k UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.List list) {
        UserAddressListFragment.f307300z0.getClass();
        UserAddressListFragment userAddressListFragment = new UserAddressListFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("list_params_key", list);
        userAddressListFragment.setArguments(bundle);
        H hE2 = this.f307095a.e();
        hE2.n(R.id.fragment_container, userAddressListFragment, "UserAddressListFragment");
        hE2.e();
    }

    public final void b(@k UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map) {
        FragmentManager fragmentManager = this.f307095a;
        Fragment fragment = (Fragment) C42745f0.G(fragmentManager.P());
        boolean zF2 = L.f(fragment != null ? fragment.getTag() : null, "UserAddressListFragment");
        UserAddressMapFragment.f307488A0.getClass();
        UserAddressMapFragment userAddressMapFragmentA = UserAddressMapFragment.a.a(map);
        H hE2 = fragmentManager.e();
        if (zF2) {
            hE2.j(R.id.fragment_container, userAddressMapFragmentA, "UserAddressAddNewAddressFragment", 1);
        } else {
            hE2.n(R.id.fragment_container, userAddressMapFragmentA, null);
        }
        hE2.e();
    }

    public final void c(@k UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests suggests, boolean z12) {
        UserAddressSuggestFragment.f307999z0.getClass();
        UserAddressSuggestFragment userAddressSuggestFragmentA = UserAddressSuggestFragment.a.a(suggests);
        H hE2 = this.f307095a.e();
        if (z12) {
            hE2.n(R.id.fragment_container, userAddressSuggestFragmentA, "UserAddressSuggestFragment");
        } else {
            hE2.j(R.id.fragment_container, userAddressSuggestFragmentA, "UserAddressSuggestFragment", 1);
        }
        hE2.e();
    }
}
