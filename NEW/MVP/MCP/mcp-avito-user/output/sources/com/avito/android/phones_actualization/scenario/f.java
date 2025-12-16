package com.avito.android.phones_actualization.scenario;

import To.d;
import com.avito.android.code_check_public.a;
import com.avito.android.remote.model.registration.RequestCodeResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: ActualizePhonesPhoneRequestInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/registration/RequestCodeResult;", "requestResult", "LTo/d;", "invoke", "(Lcom/avito/android/remote/model/registration/RequestCodeResult;)LTo/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.l<RequestCodeResult, To.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f216249l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str) {
        super(1);
        this.f216249l = str;
    }

    @Override // Y41.l
    public final To.d invoke(RequestCodeResult requestCodeResult) {
        RequestCodeResult requestCodeResult2 = requestCodeResult;
        if (requestCodeResult2 instanceof RequestCodeResult.Ok) {
            RequestCodeResult.Ok ok2 = (RequestCodeResult.Ok) requestCodeResult2;
            return new d.a(this.f216249l, ok2.getNextTryTime() - ok2.getLastTryTime(), 5, null, 8, null);
        }
        if (requestCodeResult2 instanceof RequestCodeResult.Confirmed) {
            return new d.C1084d(new a.b.C3496a(null, 1, null));
        }
        if (requestCodeResult2 instanceof RequestCodeResult.ErrorDialog) {
            return new d.f(new com.avito.android.code_check_public.i(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(((RequestCodeResult.ErrorDialog) requestCodeResult2).getUserDialog()), null, 2, null));
        }
        if (requestCodeResult2 instanceof RequestCodeResult.Failure) {
            return new d.c.b(com.avito.android.printable_text.b.f(((RequestCodeResult.Failure) requestCodeResult2).getMessage()));
        }
        if (requestCodeResult2 instanceof RequestCodeResult.IncorrectData) {
            String str = (String) C42745f0.F(((RequestCodeResult.IncorrectData) requestCodeResult2).getMessages().values());
            return new d.c.b(str != null ? com.avito.android.printable_text.b.f(str) : com.avito.android.code_check_public.k.a());
        }
        if (requestCodeResult2 instanceof RequestCodeResult.VerifyByCall) {
            return new d.C1084d(new a.InterfaceC3494a.b(((RequestCodeResult.VerifyByCall) requestCodeResult2).getDeeplink(), null, 2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
