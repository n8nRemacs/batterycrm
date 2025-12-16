package com.avito.android.saved_searches.presentation.items.banner;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.saved_searches.presentation.items.CommunicationType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WarningInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/banner/g;", "", "a", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class g {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f258436g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f258437a;

    /* renamed from: b, reason: collision with root package name */
    public final int f258438b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f258439c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f258440d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f258441e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final CommunicationType f258442f;

    /* compiled from: WarningInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/banner/g$a;", "", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k String str, int i12, @l String str2, @l String str3, @l DeepLink deepLink, @k CommunicationType communicationType) {
        this.f258437a = str;
        this.f258438b = i12;
        this.f258439c = str2;
        this.f258440d = str3;
        this.f258441e = deepLink;
        this.f258442f = communicationType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f258437a, gVar.f258437a) && this.f258438b == gVar.f258438b && L.f(this.f258439c, gVar.f258439c) && L.f(this.f258440d, gVar.f258440d) && L.f(this.f258441e, gVar.f258441e) && this.f258442f == gVar.f258442f;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f258438b, this.f258437a.hashCode() * 31, 31);
        String str = this.f258439c;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f258440d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.f258441e;
        return this.f258442f.hashCode() + ((iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "WarningInfo(title=" + this.f258437a + ", style=" + this.f258438b + ", actionTitle=" + this.f258439c + ", actionStyle=" + this.f258440d + ", actionDeepLink=" + this.f258441e + ", type=" + this.f258442f + ')';
    }
}
