package com.avito.android.mandatory_verification.domain.file_uploader;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FileData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/domain/file_uploader/a;", "", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f184504a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f184505b;

    /* renamed from: c, reason: collision with root package name */
    public final long f184506c;

    public a(@Y61.k String str, @Y61.k String str2, long j12) {
        this.f184504a = str;
        this.f184505b = str2;
        this.f184506c = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f184504a, aVar.f184504a) && L.f(this.f184505b, aVar.f184505b) && this.f184506c == aVar.f184506c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f184506c) + H.d(this.f184504a.hashCode() * 31, 31, this.f184505b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileData(fileId=");
        sb2.append(this.f184504a);
        sb2.append(", name=");
        sb2.append(this.f184505b);
        sb2.append(", size=");
        return r.u(sb2, this.f184506c, ')');
    }
}
