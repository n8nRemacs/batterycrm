package com.avito.android.authorization.reset_password;

import com.avito.android.R;
import com.avito.android.code_confirmation.code_confirmation.CodeAlreadyConfirmedException;
import com.avito.android.code_confirmation.code_confirmation.FollowDeeplinkException;
import com.avito.android.code_confirmation.code_confirmation.ShowUserDialogException;
import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodeInfo;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.ApiException;
import java.io.Serializable;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;

/* compiled from: ResetPasswordPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class r extends N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f94191l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar) {
        super(1);
        this.f94191l = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        B b12;
        Throwable th3 = th2;
        s sVar = this.f94191l;
        sVar.getClass();
        sVar.f94204m = P0.c();
        if (th3 instanceof FollowDeeplinkException) {
            b.a.a(sVar.f94198g, ((FollowDeeplinkException) th3).f119415b, null, null, 6);
        } else if (th3 instanceof CodeAlreadyConfirmedException) {
            ConfirmedCodeInfo confirmedCodeInfo = ((CodeAlreadyConfirmedException) th3).f119395b;
            String str = confirmedCodeInfo.f119575b;
            ResetPasswordActivity resetPasswordActivity = sVar.f94200i;
            if (resetPasswordActivity != null) {
                resetPasswordActivity.b2(str, confirmedCodeInfo.f119576c);
            }
        } else if (th3 instanceof ShowUserDialogException) {
            sVar.d(((ShowUserDialogException) th3).f119432b);
        } else if (th3 instanceof ApiException) {
            ApiError apiError = ((ApiException) th3).f318522b;
            if (apiError instanceof com.avito.android.remote.error.s) {
                sVar.d(((com.avito.android.remote.error.s) apiError).getUserDialog());
            } else if (apiError instanceof com.avito.android.remote.error.r) {
                Map<String, String> mapC = ((com.avito.android.remote.error.r) apiError).c();
                sVar.f94204m = mapC;
                if (!mapC.isEmpty() && (b12 = sVar.f94199h) != null) {
                    b12.c((String) C42745f0.D(mapC.values()));
                }
            } else {
                B b13 = sVar.f94199h;
                if (b13 != null) {
                    com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, b13.f94099b, com.avito.android.printable_text.b.f(com.avito.android.error.z.k(apiError)), null, null, null, new f.c(apiError), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
                }
            }
        } else {
            B b14 = sVar.f94199h;
            if (b14 != null) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.auth_common_error, new Serializable[0]);
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.b(cVar, b14.f94099b, printableTextC, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
            }
        }
        return G0.f406611a;
    }
}
