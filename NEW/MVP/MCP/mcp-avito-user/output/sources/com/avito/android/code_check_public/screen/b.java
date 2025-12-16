package com.avito.android.code_check_public.screen;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Screen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/screen/b;", "", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.code_check_public.a f119330a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AppbarNavigationIcon f119331b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final a f119332c;

    public b(@k com.avito.android.code_check_public.a aVar, @k AppbarNavigationIcon appbarNavigationIcon, @l a aVar2) {
        this.f119330a = aVar;
        this.f119331b = appbarNavigationIcon;
        this.f119332c = aVar2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f119330a, bVar.f119330a) && this.f119331b == bVar.f119331b && L.f(this.f119332c, bVar.f119332c);
    }

    public final int hashCode() {
        int iHashCode = (this.f119331b.hashCode() + (this.f119330a.hashCode() * 31)) * 31;
        a aVar = this.f119332c;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @k
    public final String toString() {
        return "AppbarConfig(appbarNavigation=" + this.f119330a + ", appbarNavigationIcon=" + this.f119331b + ", appbarAction=" + this.f119332c + ')';
    }

    public /* synthetic */ b(com.avito.android.code_check_public.a aVar, AppbarNavigationIcon appbarNavigationIcon, a aVar2, int i12, C42822w c42822w) {
        this(aVar, appbarNavigationIcon, (i12 & 4) != 0 ? null : aVar2);
    }
}
