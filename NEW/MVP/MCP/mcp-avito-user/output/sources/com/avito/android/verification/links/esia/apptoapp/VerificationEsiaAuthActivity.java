package com.avito.android.verification.links.esia.apptoapp;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.m;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.verification.links.esia.apptoapp.VerificationEsiaFinishResult;
import com.esiasdk.android.esiaLoginClient.e;
import com.esiasdk.android.esiaLoginClient.f;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationEsiaAuthActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/links/esia/apptoapp/VerificationEsiaAuthActivity;", "Landroidx/appcompat/app/m;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationEsiaAuthActivity extends m implements InterfaceC28477j.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f324222c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.esiasdk.android.esiaLoginClient.a f324223b = new com.esiasdk.android.esiaLoginClient.a();

    /* compiled from: VerificationEsiaAuthActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/verification/links/esia/apptoapp/VerificationEsiaAuthActivity$a;", "", "<init>", "()V", "", "ARGS_KEY", "Ljava/lang/String;", "RESULT_KEY", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public static final void H1(VerificationEsiaAuthActivity verificationEsiaAuthActivity, VerificationEsiaFinishResult verificationEsiaFinishResult) {
        int i12 = verificationEsiaFinishResult instanceof VerificationEsiaFinishResult.Success ? -1 : 0;
        Intent intent = new Intent();
        intent.putExtra("verificationEsiaAuthResult", verificationEsiaFinishResult);
        G0 g02 = G0.f406611a;
        verificationEsiaAuthActivity.setResult(i12, intent);
        verificationEsiaAuthActivity.finish();
    }

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    @InterfaceC42830m
    public final void onActivityResult(int i12, int i13, @l Intent intent) {
        if (this.f324223b.a(i12, i13, intent)) {
            return;
        }
        super.onActivityResult(i12, i13, intent);
    }

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        f fVar = f.f339706a;
        com.avito.android.verification.links.esia.apptoapp.a aVar = new com.avito.android.verification.links.esia.apptoapp.a(this);
        fVar.getClass();
        this.f324223b.f339702a = new e(aVar);
        if (bundle == null) {
            Intent intent = getIntent();
            VerificationEsiaAuthArgs verificationEsiaAuthArgs = (VerificationEsiaAuthArgs) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("verificationEsiaAuthArgs", VerificationEsiaAuthArgs.class) : intent.getParcelableExtra("verificationEsiaAuthArgs"));
            f.a(this, verificationEsiaAuthArgs.f324224b, verificationEsiaAuthArgs.f324226d, verificationEsiaAuthArgs.f324225c);
        }
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        f.f339706a.getClass();
        this.f324223b.f339702a = null;
        super.onDestroy();
    }
}
