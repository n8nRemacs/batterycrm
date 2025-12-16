package com.avito.android.mortgage.phone_confirm;

import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.error.ApiError;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhoneConfirmDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/error/ApiError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g extends N implements Y41.l<ApiError, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TZ.b f201566l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TZ.b bVar) {
        super(1);
        this.f201566l = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(ApiError apiError) {
        ApiError apiError2 = apiError;
        com.avito.android.component.toast.c.d(com.avito.android.component.toast.c.f125244a, this.f201566l, com.avito.android.printable_text.b.f(apiError2.getF244063c()), null, new f.c(apiError2), 0, ToastBarPosition.f181046d, 942);
        return G0.f406611a;
    }
}
