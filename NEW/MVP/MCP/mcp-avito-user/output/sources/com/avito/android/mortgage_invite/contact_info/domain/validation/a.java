package com.avito.android.mortgage_invite.contact_info.domain.validation;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: ContactInfoFieldValidator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/domain/validation/a;", "Lcom/avito/android/mortgage_invite/contact_info/domain/validation/e;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements e {
    @Inject
    public a() {
    }

    @Override // com.avito.android.mortgage_invite.contact_info.domain.validation.e
    @l
    public final PrintableText a(@k String str) {
        if (str.length() == 0) {
            return com.avito.android.printable_text.b.c(R.string.contact_info_empty_field_error, new Serializable[0]);
        }
        if (C43066x.D(str) != '9') {
            return com.avito.android.printable_text.b.c(R.string.contact_info_phone_invalid_format_error, new Serializable[0]);
        }
        if (str.length() < 10) {
            return com.avito.android.printable_text.b.c(R.string.contact_info_phone_invalid_length_error, new Serializable[0]);
        }
        return null;
    }
}
