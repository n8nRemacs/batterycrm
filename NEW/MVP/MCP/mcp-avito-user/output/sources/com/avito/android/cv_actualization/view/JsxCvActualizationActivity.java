package com.avito.android.cv_actualization.view;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.cv_actualization.view.code_input.JsxCvActualizationCodeInputFragment;
import com.avito.android.cv_actualization.view.code_input.JsxCvActualizationCodeInputOpenParams;
import com.avito.android.cv_actualization.view.phone_input.JsxCvActualizationPhoneInputFragment;
import com.avito.android.cv_actualization.view.phone_input.JsxCvActualizationPhoneInputOpenParams;
import com.avito.android.cv_actualization.view.phone_select.ui.JsxCvActualizationPhoneSelectFragment;
import com.avito.android.cv_actualization.view.phone_select.ui.JsxCvActualizationPhoneSelectOpenParams;
import com.avito.android.util.C35961v3;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: JsxCvActualizationActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cv_actualization/view/JsxCvActualizationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "Lcom/avito/android/cv_actualization/view/e;", "<init>", "()V", "a", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class JsxCvActualizationActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a, e {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final a f131105n = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Object f131106m = C35961v3.a(this);

    /* compiled from: JsxCvActualizationActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cv_actualization/view/JsxCvActualizationActivity$a;", "", "<init>", "()V", "", "ACTUALIZATION_RESULT_KEY", "Ljava/lang/String;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.cv_actualization.view.e
    public final void X0(long j12, @k String str) {
        JsxCvActualizationCodeInputOpenParams jsxCvActualizationCodeInputOpenParams = new JsxCvActualizationCodeInputOpenParams(str, j12);
        H hE2 = getSupportFragmentManager().e();
        JsxCvActualizationCodeInputFragment.f131116B0.getClass();
        JsxCvActualizationCodeInputFragment jsxCvActualizationCodeInputFragment = new JsxCvActualizationCodeInputFragment();
        jsxCvActualizationCodeInputFragment.f131118A0.setValue(jsxCvActualizationCodeInputFragment, JsxCvActualizationCodeInputFragment.f131117C0[0], jsxCvActualizationCodeInputOpenParams);
        hE2.n(R.id.fragment_container, jsxCvActualizationCodeInputFragment, null);
        hE2.c(null);
        hE2.e();
    }

    @Override // com.avito.android.cv_actualization.view.e
    public final void a1() {
        getSupportFragmentManager().Y();
    }

    @Override // com.avito.android.cv_actualization.view.e
    public final void c(boolean z12) {
        JsxCvActualizationPhoneInputOpenParams jsxCvActualizationPhoneInputOpenParams = new JsxCvActualizationPhoneInputOpenParams(z12);
        H hE2 = getSupportFragmentManager().e();
        JsxCvActualizationPhoneInputFragment.f131228z0.getClass();
        JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment = new JsxCvActualizationPhoneInputFragment();
        jsxCvActualizationPhoneInputFragment.f131239x0.setValue(jsxCvActualizationPhoneInputFragment, JsxCvActualizationPhoneInputFragment.f131227A0[0], jsxCvActualizationPhoneInputOpenParams);
        hE2.n(R.id.fragment_container, jsxCvActualizationPhoneInputFragment, null);
        if (!z12) {
            hE2.c(null);
        }
        hE2.e();
    }

    @Override // android.app.Activity, com.avito.android.cv_actualization.view.e
    public final void finish() {
        K2.c(this);
        super.finish();
    }

    @Override // com.avito.android.cv_actualization.view.e
    public final void o0(@k String str) {
        Intent intent = new Intent();
        intent.putExtra("ACTUALIZATION_RESULT_KEY", str);
        G0 g02 = G0.f406611a;
        setResult(-1, intent);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        JsxCvActualizationPhoneSelectFragment jsxCvActualizationPhoneSelectFragment;
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        H hE2 = getSupportFragmentManager().e();
        ?? r02 = this.f131106m;
        if (((JsxCvActualizationOpenParams) r02.getValue()).f131107b) {
            JsxCvActualizationPhoneInputFragment.a aVar = JsxCvActualizationPhoneInputFragment.f131228z0;
            Object jsxCvActualizationPhoneInputOpenParams = new JsxCvActualizationPhoneInputOpenParams(true);
            aVar.getClass();
            JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment = new JsxCvActualizationPhoneInputFragment();
            jsxCvActualizationPhoneInputFragment.f131239x0.setValue(jsxCvActualizationPhoneInputFragment, JsxCvActualizationPhoneInputFragment.f131227A0[0], jsxCvActualizationPhoneInputOpenParams);
            jsxCvActualizationPhoneSelectFragment = jsxCvActualizationPhoneInputFragment;
        } else {
            JsxCvActualizationPhoneSelectFragment.a aVar2 = JsxCvActualizationPhoneSelectFragment.f131373y0;
            JsxCvActualizationPhoneSelectOpenParams jsxCvActualizationPhoneSelectOpenParams = new JsxCvActualizationPhoneSelectOpenParams(((JsxCvActualizationOpenParams) r02.getValue()).f131108c);
            aVar2.getClass();
            JsxCvActualizationPhoneSelectFragment jsxCvActualizationPhoneSelectFragment2 = new JsxCvActualizationPhoneSelectFragment();
            jsxCvActualizationPhoneSelectFragment2.f131383v0.setValue(jsxCvActualizationPhoneSelectFragment2, JsxCvActualizationPhoneSelectFragment.f131374z0[0], jsxCvActualizationPhoneSelectOpenParams);
            jsxCvActualizationPhoneSelectFragment = jsxCvActualizationPhoneSelectFragment2;
        }
        hE2.j(R.id.fragment_container, jsxCvActualizationPhoneSelectFragment, null, 1);
        hE2.e();
    }
}
