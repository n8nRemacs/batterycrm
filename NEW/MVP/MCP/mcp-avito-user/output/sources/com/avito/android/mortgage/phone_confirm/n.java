package com.avito.android.mortgage.phone_confirm;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmed;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneConfirmDialogHandlerImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class n extends N implements Y41.p<String, Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f201663l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Y41.a<G0> aVar) {
        super(2);
        this.f201663l = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (((PhoneConfirmed) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("PHONE_CONFIRM_DIALOG_RESULT", PhoneConfirmed.class) : bundle2.getParcelable("PHONE_CONFIRM_DIALOG_RESULT"))) != null) {
            this.f201663l.invoke();
        }
        return G0.f406611a;
    }
}
