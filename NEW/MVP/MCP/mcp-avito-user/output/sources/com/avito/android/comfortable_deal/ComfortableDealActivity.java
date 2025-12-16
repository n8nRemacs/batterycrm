package com.avito.android.comfortable_deal;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.comfortable_deal.client_room.ClientRoomFragment;
import com.avito.android.comfortable_deal.client_room.model.ClientRoomArguments;
import com.avito.android.comfortable_deal.clients.ClientsFragment;
import com.avito.android.comfortable_deal.clients.model.ClientsArguments;
import com.avito.android.comfortable_deal.contract_sign.ContractSignFragment;
import com.avito.android.comfortable_deal.contract_sign.model.ContractSignArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ComfortableDealActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/ComfortableDealActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComfortableDealActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f119734m = new a(null);

    /* compiled from: ComfortableDealActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/ComfortableDealActivity$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int L1() {
        return R.id.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            H hE2 = getSupportFragmentManager().e();
            Parcelable parcelableExtra = getIntent().getParcelableExtra("arguments");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (parcelableExtra instanceof ContractSignArguments) {
                ContractSignFragment.f120776t0.getClass();
                hE2.j(R.id.fragment_container, ContractSignFragment.a.a((ContractSignArguments) parcelableExtra), null, 1);
            } else if (parcelableExtra instanceof ClientsArguments) {
                ClientsFragment.f120092u0.getClass();
                hE2.j(R.id.fragment_container, ClientsFragment.a.a((ClientsArguments) parcelableExtra), null, 1);
            } else if (parcelableExtra instanceof ClientRoomArguments) {
                ClientRoomFragment.f119786t0.getClass();
                hE2.j(R.id.fragment_container, ClientRoomFragment.a.a((ClientRoomArguments) parcelableExtra), null, 1);
            }
            hE2.e();
        }
    }
}
