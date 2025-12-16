package com.avito.android.sx_address;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.sx_address.address_video_verification.SxAddressVideoVerificationFragment;
import com.avito.android.sx_address.entry.SxAddressEntryFragment;
import com.avito.android.sx_address.list.SxAddressListFragment;
import com.avito.android.sx_address.new_address.SxNewAddressFragment;
import com.avito.android.sx_address.selectaddresslist.SelectAddressListFragment;
import com.avito.android.util.C35961v3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SxAddressActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/SxAddressActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SxAddressActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f292523m = new a(null);

    /* compiled from: SxAddressActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/SxAddressActivity$a;", "", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static Intent a(@k Context context, @k SxAddressParams sxAddressParams) {
            Intent intent = new Intent(context, (Class<?>) SxAddressActivity.class);
            C35961v3.b(intent, sxAddressParams);
            return intent;
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        Fragment sxAddressVideoVerificationFragment;
        super.onCreate(bundle);
        if (bundle == null) {
            SxAddressParams sxAddressParams = (SxAddressParams) C35961v3.a(this).getValue();
            if (sxAddressParams instanceof SxAddressListParams) {
                SxAddressListFragment.f293014F0.getClass();
                sxAddressVideoVerificationFragment = new SxAddressListFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("sx_list_address_params_key", (SxAddressListParams) sxAddressParams);
                sxAddressVideoVerificationFragment.setArguments(bundle2);
            } else if (sxAddressParams instanceof SxNewAddressOpenParams) {
                SxNewAddressFragment.f293548w0.getClass();
                sxAddressVideoVerificationFragment = new SxNewAddressFragment();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("sx_add_address_params_key", (SxAddressControl) sxAddressParams);
                sxAddressVideoVerificationFragment.setArguments(bundle3);
            } else if (sxAddressParams instanceof SxAddressEditParams) {
                SxNewAddressFragment.f293548w0.getClass();
                sxAddressVideoVerificationFragment = new SxNewAddressFragment();
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("sx_add_address_params_key", (SxAddressControl) sxAddressParams);
                sxAddressVideoVerificationFragment.setArguments(bundle4);
            } else if (sxAddressParams instanceof SxAddressEntryLinksParams) {
                SxAddressEntryFragment.f292885s0.getClass();
                sxAddressVideoVerificationFragment = new SxAddressEntryFragment();
                Bundle bundle5 = new Bundle();
                bundle5.putParcelable("sx_address_entry_links_params_key", (SxAddressEntryLinksParams) sxAddressParams);
                sxAddressVideoVerificationFragment.setArguments(bundle5);
            } else if (sxAddressParams instanceof SelectAddressListParams) {
                SelectAddressListFragment.f294013x0.getClass();
                sxAddressVideoVerificationFragment = new SelectAddressListFragment();
                Bundle bundle6 = new Bundle();
                bundle6.putParcelable("select_address_list_params_key", (SelectAddressListParams) sxAddressParams);
                sxAddressVideoVerificationFragment.setArguments(bundle6);
            } else {
                if (!(sxAddressParams instanceof SxAddressVideoVerificationParams)) {
                    throw new NoWhenBranchMatchedException();
                }
                SxAddressVideoVerificationFragment.f292558s0.getClass();
                sxAddressVideoVerificationFragment = new SxAddressVideoVerificationFragment();
                Bundle bundle7 = new Bundle();
                bundle7.putParcelable("sx_address_video_verification_params_key", (SxAddressVideoVerificationParams) sxAddressParams);
                sxAddressVideoVerificationFragment.setArguments(bundle7);
            }
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, sxAddressVideoVerificationFragment, null, 1);
            hE2.e();
        }
    }
}
