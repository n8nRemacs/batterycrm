package Sz0;

import Tz0.C15431e;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSz0/c;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sz0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C15274c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f15249a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f15250b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f15251c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f15252d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C15431e f15253e;

    public C15274c(@k String str, @k String str2, @l DeepLink deepLink, @l String str3, @l C15431e c15431e) {
        this.f15249a = str;
        this.f15250b = str2;
        this.f15251c = deepLink;
        this.f15252d = str3;
        this.f15253e = c15431e;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15274c)) {
            return false;
        }
        C15274c c15274c = (C15274c) obj;
        return L.f(this.f15249a, c15274c.f15249a) && L.f(this.f15250b, c15274c.f15250b) && L.f(this.f15251c, c15274c.f15251c) && L.f(this.f15252d, c15274c.f15252d) && L.f(this.f15253e, c15274c.f15253e);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f15249a.hashCode() * 31, 31, this.f15250b);
        DeepLink deepLink = this.f15251c;
        int iHashCode = (iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str = this.f15252d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C15431e c15431e = this.f15253e;
        return iHashCode2 + (c15431e != null ? c15431e.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ItemInfo(id=" + this.f15249a + ", title=" + this.f15250b + ", deeplink=" + this.f15251c + ", imageLink=" + this.f15252d + ", iconWithTooltip=" + this.f15253e + ')';
    }
}
