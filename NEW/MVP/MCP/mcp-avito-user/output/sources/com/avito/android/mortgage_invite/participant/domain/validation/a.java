package com.avito.android.mortgage_invite.participant.domain.validation;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43059p;

/* compiled from: ParticipantFieldValidator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/domain/validation/a;", "Lcom/avito/android/mortgage_invite/participant/domain/validation/m;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements m {
    @Inject
    public a() {
    }

    @Override // com.avito.android.mortgage_invite.participant.domain.validation.m
    @Y61.l
    public final PrintableText a(@Y61.k String str) {
        if (str.length() == 0) {
            return com.avito.android.printable_text.b.c(R.string.mortgage_participant_empty_field_error, new Serializable[0]);
        }
        if (new C43059p("[А-я]{2,}\\s[А-я]{2,}").a(str)) {
            return null;
        }
        return com.avito.android.printable_text.b.c(R.string.mortgage_participant_name_field_error, new Serializable[0]);
    }
}
