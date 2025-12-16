package com.avito.android.verification.links.mts;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.m;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import i.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.mts.biometry.api.SDKEnvironment;
import ru.mts.biometry.sdk.OnboardingSettings;
import ru.mts.biometry.sdk.feature.main.ui.BiometryActivity;
import z91.C50425a;
import z91.C50426b;

/* compiled from: VerificationMTSActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/links/mts/VerificationMTSActivity;", "Landroidx/appcompat/app/m;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationMTSActivity extends m implements InterfaceC28477j.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f324277c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final androidx.view.result.h<Intent> f324278b = registerForActivityResult(new b.m(), new com.avito.android.str_seller_orders.orders_seller.a(this, 5));

    /* compiled from: VerificationMTSActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/links/mts/VerificationMTSActivity$a;", "", "<init>", "()V", "", "ARGS_KEY", "Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        VerificationMTSArgs verificationMTSArgs = (VerificationMTSArgs) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("verificationMTSArgs", VerificationMTSArgs.class) : intent.getParcelableExtra("verificationMTSArgs"));
        C50425a c50425a = C50425a.f443885a;
        Context applicationContext = getApplicationContext();
        C50426b c50426b = new C50426b(verificationMTSArgs.f324279b, verificationMTSArgs.f324281d, verificationMTSArgs.f324280c, null, verificationMTSArgs.f324283f ? SDKEnvironment.f436295d : SDKEnvironment.f436294c, null, new OnboardingSettings(verificationMTSArgs.f324282e), 32, null);
        c50425a.getClass();
        Intent intent2 = new Intent(applicationContext, (Class<?>) BiometryActivity.class);
        intent2.putExtra("clientToken", c50426b.f443886a);
        intent2.putExtra("useINN", c50426b.f443888c);
        intent2.putExtra(BeduinPromoBlockModel.SERIALIZED_NAME_THEME, c50426b.f443889d);
        intent2.putExtra("backend", c50426b.f443890e.ordinal());
        intent2.putExtra("passportResultScreenDesign", c50426b.f443891f.ordinal());
        intent2.putExtra("ONBOARDING", c50426b.f443892g);
        this.f324278b.b(intent2);
    }
}
