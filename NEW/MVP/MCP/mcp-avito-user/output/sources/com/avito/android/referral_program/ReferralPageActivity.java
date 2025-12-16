package com.avito.android.referral_program;

import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.util.C35966w1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ReferralPageActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/referral_program/ReferralPageActivity;", "Lcom/avito/android/referral_program/a;", "<init>", "()V", "a", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ReferralPageActivity extends com.avito.android.referral_program.a {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f252601m = new a(null);

    /* compiled from: ReferralPageActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_program/ReferralPageActivity$a;", "", "<init>", "()V", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ReferralPageActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Bundle, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            bundle.putAll(ReferralPageActivity.this.getIntent().getExtras());
            return G0.f406611a;
        }
    }

    public ReferralPageActivity() {
        super(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.overlay_fragment_container;
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    @Override // com.avito.android.referral_program.a
    public final void a2() {
        ReferralPageStatusBarFragment.f252606C0.getClass();
        ReferralPageStatusBarFragment referralPageStatusBarFragment = new ReferralPageStatusBarFragment();
        C35966w1.a(referralPageStatusBarFragment, -1, new b());
        H hE2 = getSupportFragmentManager().e();
        hE2.n(R.id.fragment_container, referralPageStatusBarFragment, null);
        hE2.e();
    }
}
