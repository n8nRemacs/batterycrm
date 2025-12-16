package com.avito.android.code_confirmation.code_confirmation.phone_confirm;

import Y61.k;
import com.avito.android.code_confirmation.code_confirmation.RequestCodeV2Source;
import com.avito.android.remote.model.registration.RequestCodeResult;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: PhoneConfirmInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/b;", "", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: PhoneConfirmInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    I<RequestCodeResult> e(@k String str, @k RequestCodeV2Source requestCodeV2Source, boolean z12, boolean z13);

    @k
    I<com.avito.android.code_confirmation.code_confirmation.phone_confirm.a> g(@k String str, @k String str2, @k RequestCodeV2Source requestCodeV2Source);
}
