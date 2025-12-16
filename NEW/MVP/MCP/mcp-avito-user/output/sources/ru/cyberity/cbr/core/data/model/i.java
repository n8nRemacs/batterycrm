package ru.cyberity.cbr.core.data.model;

import kotlin.Metadata;

/* compiled from: ApplicantDataField.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"", "", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class i {
    public static final boolean a(@Y61.k String str) {
        return str.equals(FieldName.email.getValue()) || str.equals(FieldName.phone.getValue());
    }
}
