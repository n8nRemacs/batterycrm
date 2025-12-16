package com.avito.android.user_adverts.root_screen.adverts_host.header.search_view;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsSearchData.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/b;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f312782a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f312783b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, Object> f312784c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, Object> f312785d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UserAdvertsSearchStartFromType f312786e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f312787f;

    public b() {
        this(null, false, null, null, null, null, 63, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f312782a, bVar.f312782a) && this.f312783b == bVar.f312783b && L.f(this.f312784c, bVar.f312784c) && L.f(this.f312785d, bVar.f312785d) && this.f312786e == bVar.f312786e && L.f(this.f312787f, bVar.f312787f);
    }

    public final int hashCode() {
        return this.f312787f.hashCode() + ((this.f312786e.hashCode() + AK.c.c(AK.c.c(r.i(this.f312782a.hashCode() * 31, 31, this.f312783b), 31, this.f312784c), 31, this.f312785d)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserAdvertsSearchData(query=");
        sb2.append(this.f312782a);
        sb2.append(", queryByTitle=");
        sb2.append(this.f312783b);
        sb2.append(", filterParams=");
        sb2.append(this.f312784c);
        sb2.append(", defaultFilterParams=");
        sb2.append(this.f312785d);
        sb2.append(", startFromType=");
        sb2.append(this.f312786e);
        sb2.append(", shortcut=");
        return C22026a.c(sb2, this.f312787f, ')');
    }

    public b(@k UserAdvertsSearchStartFromType userAdvertsSearchStartFromType, @k String str, @k String str2, @k Map map, @k Map map2, boolean z12) {
        this.f312782a = str;
        this.f312783b = z12;
        this.f312784c = map;
        this.f312785d = map2;
        this.f312786e = userAdvertsSearchStartFromType;
        this.f312787f = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b(String str, boolean z12, Map map, Map map2, UserAdvertsSearchStartFromType userAdvertsSearchStartFromType, String str2, int i12, C42822w c42822w) {
        String str3 = (i12 & 1) != 0 ? "" : str;
        boolean z13 = (i12 & 2) != 0 ? false : z12;
        this((i12 & 16) != 0 ? UserAdvertsSearchStartFromType.f312778b : userAdvertsSearchStartFromType, str3, (i12 & 32) != 0 ? "" : str2, (i12 & 4) != 0 ? P0.c() : map, (i12 & 8) != 0 ? P0.c() : map2, z13);
    }
}
