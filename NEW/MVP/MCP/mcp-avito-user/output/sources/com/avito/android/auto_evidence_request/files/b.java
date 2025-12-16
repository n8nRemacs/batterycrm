package com.avito.android.auto_evidence_request.files;

import Y61.l;
import com.avito.android.remote.model.validation.Validation;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoEvidenceFileValidations.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_evidence_request/files/b;", "", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f95116a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Validation f95117b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Validation f95118c;

    public b(@l String str, @l Validation validation, @l Validation validation2) {
        this.f95116a = str;
        this.f95117b = validation;
        this.f95118c = validation2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f95116a, bVar.f95116a) && L.f(this.f95117b, bVar.f95117b) && L.f(this.f95118c, bVar.f95118c);
    }

    public final int hashCode() {
        String str = this.f95116a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Validation validation = this.f95117b;
        int iHashCode2 = (iHashCode + (validation == null ? 0 : validation.hashCode())) * 31;
        Validation validation2 = this.f95118c;
        return iHashCode2 + (validation2 != null ? validation2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "AutoEvidenceFileValidations(formId=" + this.f95116a + ", typeValidations=" + this.f95117b + ", fileSizeValidation=" + this.f95118c + ')';
    }
}
