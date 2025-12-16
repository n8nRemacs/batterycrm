package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodeInfo;
import kotlin.Metadata;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/CodeAlreadyConfirmedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CodeAlreadyConfirmedException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ConfirmedCodeInfo f119395b;

    public CodeAlreadyConfirmedException(@Y61.k ConfirmedCodeInfo confirmedCodeInfo) {
        this.f119395b = confirmedCodeInfo;
    }
}
