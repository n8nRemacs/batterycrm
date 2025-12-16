package yH0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.webrtc.h;

/* compiled from: FaqSurveyEntity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyH0/a;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yH0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C50115a {

    /* renamed from: a, reason: collision with root package name */
    public final long f443009a;

    /* renamed from: b, reason: collision with root package name */
    public final long f443010b;

    /* renamed from: c, reason: collision with root package name */
    public final long f443011c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f443012d;

    public C50115a(long j12, long j13, long j14, @k LinkedHashMap linkedHashMap) {
        this.f443009a = j12;
        this.f443010b = j13;
        this.f443011c = j14;
        this.f443012d = linkedHashMap;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50115a)) {
            return false;
        }
        C50115a c50115a = (C50115a) obj;
        return this.f443009a == c50115a.f443009a && this.f443010b == c50115a.f443010b && this.f443011c == c50115a.f443011c && this.f443012d.equals(c50115a.f443012d);
    }

    public final int hashCode() {
        return this.f443012d.hashCode() + r.g(r.g(Long.hashCode(this.f443009a) * 31, 31, this.f443010b), 31, this.f443011c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FaqSurveyEntity(itemId=");
        sb2.append(this.f443009a);
        sb2.append(", categoryId=");
        sb2.append(this.f443010b);
        sb2.append(", microcategoryId=");
        sb2.append(this.f443011c);
        sb2.append(", answers=");
        return h.e(sb2, this.f443012d, ')');
    }
}
