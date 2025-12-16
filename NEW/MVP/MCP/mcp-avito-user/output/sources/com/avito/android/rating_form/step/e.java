package com.avito.android.rating_form.step;

import android.net.Uri;
import androidx.compose.foundation.H;
import com.avito.android.rating_form.step.z;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormFileInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/e;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f249467a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Uri f249468b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f249469c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Long f249470d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final z f249471e;

    public e(long j12, @Y61.l Uri uri, @Y61.k String str, @Y61.l Long l12, @Y61.k z zVar) {
        this.f249467a = j12;
        this.f249468b = uri;
        this.f249469c = str;
        this.f249470d = l12;
        this.f249471e = zVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f249467a == eVar.f249467a && L.f(this.f249468b, eVar.f249468b) && L.f(this.f249469c, eVar.f249469c) && L.f(this.f249470d, eVar.f249470d) && L.f(this.f249471e, eVar.f249471e);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f249467a) * 31;
        Uri uri = this.f249468b;
        int iD2 = H.d((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.f249469c);
        Long l12 = this.f249470d;
        return this.f249471e.hashCode() + ((iD2 + (l12 != null ? l12.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "LocalFile(id=" + this.f249467a + ", uri=" + this.f249468b + ", name=" + this.f249469c + ", size=" + this.f249470d + ", state=" + this.f249471e + ')';
    }

    public /* synthetic */ e(long j12, Uri uri, String str, Long l12, z zVar, int i12, C42822w c42822w) {
        this(j12, uri, str, l12, (i12 & 16) != 0 ? new z.c(0.0f) : zVar);
    }
}
