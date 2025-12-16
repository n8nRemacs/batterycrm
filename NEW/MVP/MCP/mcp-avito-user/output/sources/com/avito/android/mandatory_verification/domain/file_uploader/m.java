package com.avito.android.mandatory_verification.domain.file_uploader;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FileValidationData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/domain/file_uploader/m;", "", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<String> f184574a;

    /* renamed from: b, reason: collision with root package name */
    public final long f184575b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f184576c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f184577d;

    public m(long j12, @Y61.k String str, @Y61.k String str2, @Y61.k List list) {
        this.f184574a = list;
        this.f184575b = j12;
        this.f184576c = str;
        this.f184577d = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f184574a, mVar.f184574a) && this.f184575b == mVar.f184575b && L.f(this.f184576c, mVar.f184576c) && L.f(this.f184577d, mVar.f184577d);
    }

    public final int hashCode() {
        return this.f184577d.hashCode() + H.d(r.g(this.f184574a.hashCode() * 31, 31, this.f184575b), 31, this.f184576c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileValidationData(types=");
        sb2.append(this.f184574a);
        sb2.append(", maxFileSize=");
        sb2.append(this.f184575b);
        sb2.append(", wrongFormatMessage=");
        sb2.append(this.f184576c);
        sb2.append(", fileSizeExceedMessage=");
        return C22026a.c(sb2, this.f184577d, ')');
    }
}
