package com.avito.android.mortgage_invite;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.mortgage_invite.MortgageInviteFragmentParams;
import com.avito.android.mortgage_invite.client_form.ApplicationClientFormFragment;
import com.avito.android.mortgage_invite.contact_info.ApplicationContactInfoFragment;
import com.avito.android.mortgage_invite.lead.ApplicationLeadFragment;
import com.avito.android.ui.fragments.BaseFragment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageInviteActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage_invite/MortgageInviteActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MortgageInviteActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f205009m = new a(null);

    /* compiled from: MortgageInviteActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/MortgageInviteActivity$a;", "", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public static BaseFragment a2(MortgageInviteFragmentParams mortgageInviteFragmentParams) {
        if (mortgageInviteFragmentParams instanceof MortgageInviteFragmentParams.ApplicationLead) {
            ApplicationLeadFragment.f205841t0.getClass();
            return ApplicationLeadFragment.a.a(((MortgageInviteFragmentParams.ApplicationLead) mortgageInviteFragmentParams).f205010b);
        }
        if (mortgageInviteFragmentParams instanceof MortgageInviteFragmentParams.ContactInfo) {
            ApplicationContactInfoFragment.f205577u0.getClass();
            return ApplicationContactInfoFragment.a.a(((MortgageInviteFragmentParams.ContactInfo) mortgageInviteFragmentParams).f205012b);
        }
        if (!(mortgageInviteFragmentParams instanceof MortgageInviteFragmentParams.ClientForm)) {
            throw new NoWhenBranchMatchedException();
        }
        ApplicationClientFormFragment.f205015t0.getClass();
        return ApplicationClientFormFragment.a.a(((MortgageInviteFragmentParams.ClientForm) mortgageInviteFragmentParams).f205011b);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.mortgage_application_invite_activity;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("FRAGMENT_PARAMS", MortgageInviteFragmentParams.class) : intent.getParcelableExtra("FRAGMENT_PARAMS");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            H hE2 = getSupportFragmentManager().e();
            hE2.n(R.id.container, a2((MortgageInviteFragmentParams) parcelableExtra), null);
            hE2.e();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("FRAGMENT_PARAMS", MortgageInviteFragmentParams.class) : intent.getParcelableExtra("FRAGMENT_PARAMS");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        BaseFragment baseFragmentA2 = a2((MortgageInviteFragmentParams) parcelableExtra);
        H hE2 = getSupportFragmentManager().e();
        hE2.n(R.id.container, baseFragmentA2, null);
        hE2.c(null);
        hE2.e();
    }
}
