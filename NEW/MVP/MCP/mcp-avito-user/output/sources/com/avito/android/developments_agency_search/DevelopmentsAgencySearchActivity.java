package com.avito.android.developments_agency_search;

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
import com.avito.android.developments_agency_search.DevelopmentsAgencySearchFragmentParams;
import com.avito.android.developments_agency_search.screen.deal_cabinet.DealCabinetFragment;
import com.avito.android.developments_agency_search.screen.deal_room.DealRoomFragment;
import com.avito.android.developments_agency_search.screen.realty_agency_search.RealtyAgencySearchFragment;
import com.avito.android.ui.fragments.BaseFragment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DevelopmentsAgencySearchActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/DevelopmentsAgencySearchActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DevelopmentsAgencySearchActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f136208m = new a(null);

    /* compiled from: DevelopmentsAgencySearchActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/developments_agency_search/DevelopmentsAgencySearchActivity$a;", "", "<init>", "()V", "", "EXTRA_FRAGMENT_PARAMS", "Ljava/lang/String;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BaseFragment a2(DevelopmentsAgencySearchFragmentParams developmentsAgencySearchFragmentParams) {
        DealRoomFragment dealRoomFragment;
        if (developmentsAgencySearchFragmentParams instanceof DevelopmentsAgencySearchFragmentParams.RealtyAgencySearchFragmentParams) {
            RealtyAgencySearchFragment.f138222V0.getClass();
            return RealtyAgencySearchFragment.a.a(((DevelopmentsAgencySearchFragmentParams.RealtyAgencySearchFragmentParams) developmentsAgencySearchFragmentParams).f136211b);
        }
        if (developmentsAgencySearchFragmentParams instanceof DevelopmentsAgencySearchFragmentParams.DealCabinetFragmentParams) {
            DealCabinetFragment.f136758y0.getClass();
            DealCabinetFragment dealCabinetFragment = new DealCabinetFragment();
            dealCabinetFragment.f136769w0.setValue(dealCabinetFragment, DealCabinetFragment.f136759z0[0], ((DevelopmentsAgencySearchFragmentParams.DealCabinetFragmentParams) developmentsAgencySearchFragmentParams).f136209b);
            dealRoomFragment = dealCabinetFragment;
        } else {
            if (!(developmentsAgencySearchFragmentParams instanceof DevelopmentsAgencySearchFragmentParams.DealRoomFragmentParams)) {
                throw new NoWhenBranchMatchedException();
            }
            DealRoomFragment.f137222z0.getClass();
            DealRoomFragment dealRoomFragment2 = new DealRoomFragment();
            dealRoomFragment2.f137229t0.setValue(dealRoomFragment2, DealRoomFragment.f137221A0[0], ((DevelopmentsAgencySearchFragmentParams.DealRoomFragmentParams) developmentsAgencySearchFragmentParams).f136210b);
            dealRoomFragment = dealRoomFragment2;
        }
        return dealRoomFragment;
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("fragment_params", DevelopmentsAgencySearchFragmentParams.class) : intent.getParcelableExtra("fragment_params");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            H hE2 = getSupportFragmentManager().e();
            hE2.n(android.R.id.content, a2((DevelopmentsAgencySearchFragmentParams) parcelableExtra), null);
            hE2.e();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("fragment_params", DevelopmentsAgencySearchFragmentParams.class) : intent.getParcelableExtra("fragment_params");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        BaseFragment baseFragmentA2 = a2((DevelopmentsAgencySearchFragmentParams) parcelableExtra);
        H hE2 = getSupportFragmentManager().e();
        hE2.n(android.R.id.content, baseFragmentA2, null);
        hE2.e();
    }
}
