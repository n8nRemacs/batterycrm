package com.avito.android.publish.price_list.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectPriceListViewState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/f;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class f extends q {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f238849l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final f f238850m = new f("", null, "", null, false, false, false, C42784z0.f406748b, null, null, 768, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f238851b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f238852c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f238853d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final PrintableText f238854e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f238855f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f238856g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f238857h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f238858i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final List<? extends com.avito.conveyor_item.a> f238859j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Set<String> f238860k;

    /* compiled from: SelectPriceListViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/f$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@l String str, @l String str2, @k String str3, @l PrintableText printableText, boolean z12, boolean z13, boolean z14, @k List<? extends com.avito.conveyor_item.a> list, @k List<? extends com.avito.conveyor_item.a> list2, @k Set<String> set) {
        this.f238851b = str;
        this.f238852c = str2;
        this.f238853d = str3;
        this.f238854e = printableText;
        this.f238855f = z12;
        this.f238856g = z13;
        this.f238857h = z14;
        this.f238858i = list;
        this.f238859j = list2;
        this.f238860k = set;
    }

    public static f a(f fVar, String str, String str2, String str3, PrintableText printableText, boolean z12, boolean z13, boolean z14, List list, List list2, int i12) {
        String str4 = (i12 & 1) != 0 ? fVar.f238851b : str;
        String str5 = (i12 & 2) != 0 ? fVar.f238852c : str2;
        String str6 = (i12 & 4) != 0 ? fVar.f238853d : str3;
        PrintableText printableText2 = (i12 & 8) != 0 ? fVar.f238854e : printableText;
        boolean z15 = (i12 & 16) != 0 ? fVar.f238855f : z12;
        boolean z16 = (i12 & 32) != 0 ? fVar.f238856g : z13;
        boolean z17 = (i12 & 64) != 0 ? fVar.f238857h : z14;
        List list3 = (i12 & 128) != 0 ? fVar.f238858i : list;
        List list4 = (i12 & 256) != 0 ? fVar.f238859j : list2;
        Set<String> set = fVar.f238860k;
        fVar.getClass();
        return new f(str4, str5, str6, printableText2, z15, z16, z17, list3, list4, set);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f238851b, fVar.f238851b) && L.f(this.f238852c, fVar.f238852c) && L.f(this.f238853d, fVar.f238853d) && L.f(this.f238854e, fVar.f238854e) && this.f238855f == fVar.f238855f && this.f238856g == fVar.f238856g && this.f238857h == fVar.f238857h && L.f(this.f238858i, fVar.f238858i) && L.f(this.f238859j, fVar.f238859j) && L.f(this.f238860k, fVar.f238860k);
    }

    public final int hashCode() {
        String str = this.f238851b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f238852c;
        int iD2 = H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f238853d);
        PrintableText printableText = this.f238854e;
        return this.f238860k.hashCode() + H.e(H.e(r.i(r.i(r.i((iD2 + (printableText != null ? printableText.hashCode() : 0)) * 31, 31, this.f238855f), 31, this.f238856g), 31, this.f238857h), 31, this.f238858i), 31, this.f238859j);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectPriceListViewState(headerTitle=");
        sb2.append(this.f238851b);
        sb2.append(", subtitle=");
        sb2.append(this.f238852c);
        sb2.append(", searchInputHint=");
        sb2.append(this.f238853d);
        sb2.append(", mainButtonTitle=");
        sb2.append(this.f238854e);
        sb2.append(", isActionButtonEnabled=");
        sb2.append(this.f238855f);
        sb2.append(", isClearIconVisible=");
        sb2.append(this.f238856g);
        sb2.append(", showProgressOverlay=");
        sb2.append(this.f238857h);
        sb2.append(", items=");
        sb2.append(this.f238858i);
        sb2.append(", allItems=");
        sb2.append(this.f238859j);
        sb2.append(", expandedState=");
        return AK.c.u(sb2, this.f238860k, ')');
    }

    public f(String str, String str2, String str3, PrintableText printableText, boolean z12, boolean z13, boolean z14, List list, List list2, Set set, int i12, C42822w c42822w) {
        this(str, str2, str3, printableText, z12, z13, z14, list, (i12 & 256) != 0 ? C42784z0.f406748b : list2, (i12 & 512) != 0 ? new LinkedHashSet() : set);
    }
}
