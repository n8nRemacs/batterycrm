package aQ0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AppliesToVacancy.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LaQ0/a;", "", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: aQ0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C19807a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f20896a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f20897b;

    public C19807a(@k String str, @k DeepLink deepLink) {
        this.f20896a = str;
        this.f20897b = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19807a)) {
            return false;
        }
        C19807a c19807a = (C19807a) obj;
        return L.f(this.f20896a, c19807a.f20896a) && L.f(this.f20897b, c19807a.f20897b);
    }

    public final int hashCode() {
        return this.f20897b.hashCode() + (this.f20896a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppliesBannerButton(text=");
        sb2.append(this.f20896a);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f20897b, ')');
    }
}
