package androidx.privacysandbox.ads.adservices.measurement;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeletionRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/a;", "", "a", "b", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f53574a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53575b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Instant f53576c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Instant f53577d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<Uri> f53578e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<Uri> f53579f;

    /* compiled from: DeletionRequest.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/a$a;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    /* renamed from: androidx.privacysandbox.ads.adservices.measurement.a$a, reason: collision with other inner class name */
    public static final class C1904a {
    }

    /* compiled from: DeletionRequest.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/a$b;", "", "<init>", "()V", "", "DELETION_MODE_ALL", "I", "DELETION_MODE_EXCLUDE_INTERNAL_DATA", "MATCH_BEHAVIOR_DELETE", "MATCH_BEHAVIOR_PRESERVE", "a", "b", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* compiled from: DeletionRequest.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/a$b$a;", "", "<init>", "()V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @P41.c
        /* renamed from: androidx.privacysandbox.ads.adservices.measurement.a$b$a, reason: collision with other inner class name */
        public @interface InterfaceC1905a {
        }

        /* compiled from: DeletionRequest.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/a$b$b;", "", "<init>", "()V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @P41.c
        /* renamed from: androidx.privacysandbox.ads.adservices.measurement.a$b$b, reason: collision with other inner class name */
        public @interface InterfaceC1906b {
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    public a() {
        throw null;
    }

    public a(int i12, int i13, Instant instant, Instant instant2, List list, List list2, int i14, C42822w c42822w) {
        instant = (i14 & 4) != 0 ? Instant.MIN : instant;
        instant2 = (i14 & 8) != 0 ? Instant.MAX : instant2;
        list = (i14 & 16) != 0 ? C42784z0.f406748b : list;
        list2 = (i14 & 32) != 0 ? C42784z0.f406748b : list2;
        this.f53574a = i12;
        this.f53575b = i13;
        this.f53576c = instant;
        this.f53577d = instant2;
        this.f53578e = list;
        this.f53579f = list2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f53574a == aVar.f53574a && new HashSet(this.f53578e).equals(new HashSet(aVar.f53578e)) && new HashSet(this.f53579f).equals(new HashSet(aVar.f53579f)) && L.f(this.f53576c, aVar.f53576c) && L.f(this.f53577d, aVar.f53577d) && this.f53575b == aVar.f53575b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53575b) + ((this.f53577d.hashCode() + ((this.f53576c.hashCode() + H.e(H.e(Integer.hashCode(this.f53574a) * 31, 31, this.f53578e), 31, this.f53579f)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sbB = C23088b.b("DeletionRequest { DeletionMode=", this.f53574a == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA", ", MatchBehavior=", this.f53575b == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE", ", Start=");
        sbB.append(this.f53576c);
        sbB.append(", End=");
        sbB.append(this.f53577d);
        sbB.append(", DomainUris=");
        sbB.append(this.f53578e);
        sbB.append(", OriginUris=");
        sbB.append(this.f53579f);
        sbB.append(" }");
        return sbB.toString();
    }
}
