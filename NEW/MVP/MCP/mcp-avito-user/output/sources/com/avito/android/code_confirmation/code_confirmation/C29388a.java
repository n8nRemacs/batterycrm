package com.avito.android.code_confirmation.code_confirmation;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodeInfo;
import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodePayload;
import kotlin.Metadata;

/* compiled from: CodeConfirmationActivity.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_code-confirmation_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.code_confirmation.code_confirmation.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29388a {
    @Y61.l
    public static final ConfirmedCodeInfo a(@Y61.k Intent intent) {
        ConfirmedCodePayload confirmedCodePayload = (ConfirmedCodePayload) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_cc_results", ConfirmedCodePayload.class) : intent.getParcelableExtra("key_cc_results"));
        if (confirmedCodePayload instanceof ConfirmedCodeInfo) {
            return (ConfirmedCodeInfo) confirmedCodePayload;
        }
        return null;
    }
}
