package Fc1;

import androidx.compose.runtime.C22026a;
import feedback.shared.sdk.api.network.entities.RequestType;

/* loaded from: classes9.dex */
public final class B3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RequestType f4822a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f4823b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4824a;

        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[RequestType.GET_CAMPAIGNS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestType.POST_VISITS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestType.POST_ANSWERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RequestType.POST_SCREENSHOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4824a = iArr;
        }
    }

    public B3(@Y61.k RequestType requestType, @Y61.l String str) {
        this.f4822a = requestType;
        this.f4823b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B3)) {
            return false;
        }
        B3 b32 = (B3) obj;
        return this.f4822a == b32.f4822a && kotlin.jvm.internal.L.f(this.f4823b, b32.f4823b);
    }

    public final int hashCode() {
        int iHashCode = this.f4822a.hashCode() * 31;
        String str = this.f4823b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QueueData(requestType=");
        sb2.append(this.f4822a);
        sb2.append(", data=");
        return C22026a.c(sb2, this.f4823b, ')');
    }
}
