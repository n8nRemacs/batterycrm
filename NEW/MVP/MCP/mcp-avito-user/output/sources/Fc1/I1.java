package Fc1;

import androidx.compose.runtime.C22026a;

/* loaded from: classes9.dex */
public final class I1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f5010a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f5011b;

    public I1(@Y61.l String str, @Y61.l String str2) {
        this.f5010a = str;
        this.f5011b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I1)) {
            return false;
        }
        I1 i12 = (I1) obj;
        return kotlin.jvm.internal.L.f(this.f5010a, i12.f5010a) && kotlin.jvm.internal.L.f(this.f5011b, i12.f5011b);
    }

    public final int hashCode() {
        String str = this.f5010a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5011b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeedbackFieldScreenshot(createCaption=");
        sb2.append(this.f5010a);
        sb2.append(", uploadCaption=");
        return C22026a.c(sb2, this.f5011b, ')');
    }
}
