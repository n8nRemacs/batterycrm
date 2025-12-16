package com.avito.android.success_screen_after_apply.deeplink;

import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.success_screen_after_apply.SuccessScreenAfterApplyDeeplink;
import com.avito.android.success_screen_after_apply.ui.SuccessScreenAfterApplyResult;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import iA0.C41262b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import l41.g;
import rv.C47919b;

/* compiled from: SuccessScreenAfterApplyDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/success_screen_after_apply/deeplink/b;", "Lev/a;", "Lcom/avito/android/success_screen_after_apply/SuccessScreenAfterApplyDeeplink;", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends AbstractC40161a<SuccessScreenAfterApplyDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f291704f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final h31.e<C41262b> f291705g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.f f291706h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C43238h f291707i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f291708j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: SuccessScreenAfterApplyDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "fragmentResult", "Lkotlin/G0;", "accept", "(Lrv/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = Build.VERSION.SDK_INT;
            Bundle bundle = ((C47919b) obj).f437159b;
            SuccessScreenAfterApplyResult successScreenAfterApplyResult = (SuccessScreenAfterApplyResult) (i12 >= 34 ? (Parcelable) bundle.getParcelable("SUCCESS_SCREEN_BOTTOM_SHEET_RESULT_KEY", SuccessScreenAfterApplyResult.class) : bundle.getParcelable("SUCCESS_SCREEN_BOTTOM_SHEET_RESULT_KEY"));
            boolean z12 = successScreenAfterApplyResult instanceof SuccessScreenAfterApplyResult.OpenEdit;
            b bVar = b.this;
            if (z12) {
                bVar.j(new SuccessScreenAfterApplyDeeplink.b.C8830b(((SuccessScreenAfterApplyResult.OpenEdit) successScreenAfterApplyResult).f291776b));
            } else if (successScreenAfterApplyResult instanceof SuccessScreenAfterApplyResult.Dismiss) {
                bVar.j(new SuccessScreenAfterApplyDeeplink.b.a(((SuccessScreenAfterApplyResult.Dismiss) successScreenAfterApplyResult).f291775b));
            } else {
                bVar.j(SuccessScreenAfterApplyDeeplink.b.c.f291697b);
            }
        }
    }

    @Inject
    public b(@k a.d dVar, @k h31.e<C41262b> eVar, @k a.f fVar, @k R0 r02) {
        this.f291704f = dVar;
        this.f291705g = eVar;
        this.f291706h = fVar;
        this.f291707i = U.a(CoroutineContext.Element.DefaultImpls.plus(Q0.a(), r02.a()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f291707i, null, null, new com.avito.android.success_screen_after_apply.deeplink.a(this, (SuccessScreenAfterApplyDeeplink) deepLink, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f291708j.b(this.f291706h.l1("SUCCESS_SCREEN_BOTTOM_SHEET_REQUEST_KEY").t0(new a()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f291708j.e();
    }
}
