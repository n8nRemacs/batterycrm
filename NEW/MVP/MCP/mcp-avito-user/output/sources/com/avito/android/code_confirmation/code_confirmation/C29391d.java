package com.avito.android.code_confirmation.code_confirmation;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: CodeConfirmationIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/d;", "Lcom/avito/android/code_confirmation/code_confirmation/c;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.code_confirmation.code_confirmation.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29391d implements InterfaceC29390c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f119487a;

    @Inject
    public C29391d(@Y61.k Context context) {
        this.f119487a = context;
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.InterfaceC29390c
    @Y61.k
    @InterfaceC42830m
    public final Intent a(@Y61.k SmsCodeConfirmationParams smsCodeConfirmationParams, @Y61.k CodeConfirmationSource codeConfirmationSource) {
        return new Intent(this.f119487a, (Class<?>) CodeConfirmationActivity.class).putExtra("key_sms_cc_params", smsCodeConfirmationParams).putExtra("src", (Parcelable) codeConfirmationSource);
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.InterfaceC29390c
    @Y61.k
    @InterfaceC42830m
    public final Intent b(@Y61.k s0 s0Var) {
        Context context = this.f119487a;
        return new Intent(context, (Class<?>) CodeConfirmationActivity.class).putExtra("key_sms_cc_params", s0Var.f119631a).putExtra("src", (Parcelable) s0Var.f119632b);
    }
}
