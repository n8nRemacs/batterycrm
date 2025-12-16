package com.avito.android.code_check_public.screen;

import Y61.k;
import Y61.l;
import com.avito.android.code_check_public.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Screen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/screen/i;", "", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.code_check_public.a f119385a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.code_check_public.a f119386b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final b f119387c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Set<a.InterfaceC3494a.d> f119388d;

    public i() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f119385a, iVar.f119385a) && L.f(this.f119386b, iVar.f119386b) && L.f(this.f119387c, iVar.f119387c) && L.f(this.f119388d, iVar.f119388d);
    }

    public final int hashCode() {
        int iHashCode = (this.f119386b.hashCode() + (this.f119385a.hashCode() * 31)) * 31;
        b bVar = this.f119387c;
        return this.f119388d.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenNavigation(nextNavigation=");
        sb2.append(this.f119385a);
        sb2.append(", backNavigation=");
        sb2.append(this.f119386b);
        sb2.append(", appbarConfig=");
        sb2.append(this.f119387c);
        sb2.append(", navVariants=");
        return AK.c.u(sb2, this.f119388d, ')');
    }

    public i(@k com.avito.android.code_check_public.a aVar, @k com.avito.android.code_check_public.a aVar2, @l b bVar, @k Set<a.InterfaceC3494a.d> set) {
        this.f119385a = aVar;
        this.f119386b = aVar2;
        this.f119387c = bVar;
        this.f119388d = set;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public i(com.avito.android.code_check_public.a aVar, com.avito.android.code_check_public.a aVar2, b bVar, Set set, int i12, C42822w c42822w) {
        int i13 = 1;
        this((i12 & 1) != 0 ? new a.b.C3497b(null, null, null, null, null, 31, null) : aVar, (i12 & 2) != 0 ? new a.InterfaceC3494a.C3495a(null, i13, 0 == true ? 1 : 0) : aVar2, (i12 & 4) != 0 ? new b(new a.InterfaceC3494a.C3495a(0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), AppbarNavigationIcon.f119297b, null) : bVar, (i12 & 8) != 0 ? B0.f406639b : set);
    }
}
