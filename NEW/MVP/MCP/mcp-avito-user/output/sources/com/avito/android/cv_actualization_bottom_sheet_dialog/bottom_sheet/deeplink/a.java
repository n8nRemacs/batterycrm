package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.deeplink;

import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui.JsxActualizationBottomSheetDialogFragment;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui.JsxActualizationBottomSheetOpenParams;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui.JsxActualizationBottomSheetResult;
import com.avito.android.cv_actualization_bottom_sheet_dialog.deeplink.JsxCvActualizationBottomSheetDeeplink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.g;
import rv.C47919b;

/* compiled from: JsxCvActualizationBottomSheetDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/deeplink/a;", "Lev/a;", "Lcom/avito/android/cv_actualization_bottom_sheet_dialog/deeplink/JsxCvActualizationBottomSheetDeeplink;", "_avito_job_cv-actualization-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<JsxCvActualizationBottomSheetDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f131457f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.f f131458g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f131459h = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: JsxCvActualizationBottomSheetDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "fragmentResult", "Lkotlin/G0;", "accept", "(Lrv/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.deeplink.a$a, reason: collision with other inner class name */
    public static final class C3923a<T> implements g {
        public C3923a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = Build.VERSION.SDK_INT;
            Bundle bundle = ((C47919b) obj).f437159b;
            JsxActualizationBottomSheetResult jsxActualizationBottomSheetResult = (JsxActualizationBottomSheetResult) (i12 >= 34 ? (Parcelable) bundle.getParcelable("CV_ACTUALIZATION_BOTTOM_SHEET_RESULT_KEY", JsxActualizationBottomSheetResult.class) : bundle.getParcelable("CV_ACTUALIZATION_BOTTOM_SHEET_RESULT_KEY"));
            a.this.j(jsxActualizationBottomSheetResult instanceof JsxActualizationBottomSheetResult.Success ? new JsxCvActualizationBottomSheetDeeplink.b.c(((JsxActualizationBottomSheetResult.Success) jsxActualizationBottomSheetResult).f131556b) : L.f(jsxActualizationBottomSheetResult, JsxActualizationBottomSheetResult.Dismiss.f131554b) ? JsxCvActualizationBottomSheetDeeplink.b.a.f131567b : JsxCvActualizationBottomSheetDeeplink.b.C3931b.f131568b);
        }
    }

    @Inject
    public a(@k a.d dVar, @k a.f fVar) {
        this.f131457f = dVar;
        this.f131458g = fVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        JsxCvActualizationBottomSheetDeeplink jsxCvActualizationBottomSheetDeeplink = (JsxCvActualizationBottomSheetDeeplink) deepLink;
        JsxActualizationBottomSheetOpenParams jsxActualizationBottomSheetOpenParams = new JsxActualizationBottomSheetOpenParams(jsxCvActualizationBottomSheetDeeplink.f131560b, jsxCvActualizationBottomSheetDeeplink.f131561c, jsxCvActualizationBottomSheetDeeplink.f131562d, jsxCvActualizationBottomSheetDeeplink.f131563e, jsxCvActualizationBottomSheetDeeplink.f131564f, jsxCvActualizationBottomSheetDeeplink.f131565g, jsxCvActualizationBottomSheetDeeplink.f131566h);
        JsxActualizationBottomSheetDialogFragment.f131530q0.getClass();
        JsxActualizationBottomSheetDialogFragment jsxActualizationBottomSheetDialogFragment = new JsxActualizationBottomSheetDialogFragment();
        jsxActualizationBottomSheetDialogFragment.f131535k0.setValue(jsxActualizationBottomSheetDialogFragment, JsxActualizationBottomSheetDialogFragment.f131531r0[0], jsxActualizationBottomSheetOpenParams);
        this.f131457f.w1(jsxActualizationBottomSheetDialogFragment, this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f131459h.b(this.f131458g.l1("CV_ACTUALIZATION_BOTTOM_SHEET_REQUEST_KEY").t0(new C3923a()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f131459h.e();
    }
}
