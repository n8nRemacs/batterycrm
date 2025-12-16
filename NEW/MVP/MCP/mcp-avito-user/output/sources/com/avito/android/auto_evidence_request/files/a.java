package com.avito.android.auto_evidence_request.files;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoEvidenceFileValidationResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_evidence_request/files/a;", "", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f95112a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f95113b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f95114c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f95115d;

    public a(boolean z12, boolean z13, @l String str, @l String str2) {
        this.f95112a = z12;
        this.f95113b = z13;
        this.f95114c = str;
        this.f95115d = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f95112a == aVar.f95112a && this.f95113b == aVar.f95113b && L.f(this.f95114c, aVar.f95114c) && L.f(this.f95115d, aVar.f95115d);
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f95112a) * 31, 31, this.f95113b);
        String str = this.f95114c;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95115d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoEvidenceFileValidationResult(isSizeValid=");
        sb2.append(this.f95112a);
        sb2.append(", isExtensionValid=");
        sb2.append(this.f95113b);
        sb2.append(", fileOriginalName=");
        sb2.append(this.f95114c);
        sb2.append(", fileSizeFormatted=");
        return C22026a.c(sb2, this.f95115d, ')');
    }
}
