package sQ;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobInterviewInvitationResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LsQ/e;", "", "", "text", "", "lat", AddressParameter.Value.LNG, "<init>", "(Ljava/lang/String;DD)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "D", "a", "()D", "b", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sQ.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C48095e {

    @com.google.gson.annotations.c("lat")
    private final double lat;

    @com.google.gson.annotations.c(AddressParameter.Value.LNG)
    private final double lng;

    @com.google.gson.annotations.c("text")
    @k
    private final String text;

    public C48095e(@k String str, double d12, double d13) {
        this.text = str;
        this.lat = d12;
        this.lng = d13;
    }

    /* renamed from: a, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* renamed from: b, reason: from getter */
    public final double getLng() {
        return this.lng;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48095e)) {
            return false;
        }
        C48095e c48095e = (C48095e) obj;
        return L.f(this.text, c48095e.text) && Double.compare(this.lat, c48095e.lat) == 0 && Double.compare(this.lng, c48095e.lng) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.lng) + androidx.compose.ui.graphics.colorspace.e.d(this.text.hashCode() * 31, 31, this.lat);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Location(text=");
        sb2.append(this.text);
        sb2.append(", lat=");
        sb2.append(this.lat);
        sb2.append(", lng=");
        return androidx.compose.ui.graphics.colorspace.e.o(sb2, this.lng, ')');
    }
}
