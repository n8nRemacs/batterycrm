package com.avito.android.beduin.v2.onboarding.impl;

import Y41.l;
import Y61.k;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.util.C35966w1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinV2OnboardingActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/BeduinV2OnboardingActivity;", "Lcom/avito/android/beduin/v2/onboarding/impl/a;", "<init>", "()V", "a", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinV2OnboardingActivity extends com.avito.android.beduin.v2.onboarding.impl.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f104640m = new a(null);

    /* compiled from: BeduinV2OnboardingActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/BeduinV2OnboardingActivity$a;", "", "<init>", "()V", "", "PATH", "Ljava/lang/String;", "SCREEN_NAME", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinV2OnboardingActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<Bundle, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            bundle.putAll(BeduinV2OnboardingActivity.this.getIntent().getExtras());
            return G0.f406611a;
        }
    }

    public BeduinV2OnboardingActivity() {
        super(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_onboarding_empty;
    }

    @Override // com.avito.android.beduin.v2.onboarding.impl.a
    public final void a2() {
        BeduinV2OnboardingFragment.f104672l0.getClass();
        BeduinV2OnboardingFragment beduinV2OnboardingFragment = new BeduinV2OnboardingFragment();
        C35966w1.a(beduinV2OnboardingFragment, -1, new b());
        beduinV2OnboardingFragment.show(getSupportFragmentManager(), "bottom_sheet");
    }
}
