package com.avito.android.screens.bbip_v2.ui.items.duration;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BbipV2DurationItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/duration/b;", "Lcom/avito/conveyor_item/a;", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f261613b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<a> f261614c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f261615d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f261616e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f261617f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f261618g;

    /* compiled from: BbipV2DurationItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/duration/b$a;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f261619a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f261620b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f261621c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f261622d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f261623e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f261624f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final PrintableText f261625g;

        public a(int i12, @Y61.k String str, boolean z12, boolean z13, boolean z14, boolean z15, @Y61.l PrintableText printableText) {
            this.f261619a = i12;
            this.f261620b = str;
            this.f261621c = z12;
            this.f261622d = z13;
            this.f261623e = z14;
            this.f261624f = z15;
            this.f261625g = printableText;
        }

        public static a a(a aVar, boolean z12, int i12) {
            int i13 = aVar.f261619a;
            String str = aVar.f261620b;
            boolean z13 = aVar.f261622d;
            boolean z14 = aVar.f261623e;
            boolean z15 = (i12 & 32) != 0 ? aVar.f261624f : true;
            PrintableText printableText = aVar.f261625g;
            aVar.getClass();
            return new a(i13, str, z12, z13, z14, z15, printableText);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f261619a == aVar.f261619a && L.f(this.f261620b, aVar.f261620b) && this.f261621c == aVar.f261621c && this.f261622d == aVar.f261622d && this.f261623e == aVar.f261623e && this.f261624f == aVar.f261624f && L.f(this.f261625g, aVar.f261625g);
        }

        public final int hashCode() {
            int i12 = r.i(r.i(r.i(r.i(H.d(Integer.hashCode(this.f261619a) * 31, 31, this.f261620b), 31, this.f261621c), 31, this.f261622d), 31, this.f261623e), 31, this.f261624f);
            PrintableText printableText = this.f261625g;
            return i12 + (printableText == null ? 0 : printableText.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Duration(duration=");
            sb2.append(this.f261619a);
            sb2.append(", formatDuration=");
            sb2.append(this.f261620b);
            sb2.append(", selected=");
            sb2.append(this.f261621c);
            sb2.append(", recommended=");
            sb2.append(this.f261622d);
            sb2.append(", preselected=");
            sb2.append(this.f261623e);
            sb2.append(", shown=");
            sb2.append(this.f261624f);
            sb2.append(", warning=");
            return AK.c.m(sb2, this.f261625g, ')');
        }
    }

    public b(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k List list, boolean z12) {
        this.f261613b = str;
        this.f261614c = list;
        this.f261615d = str2;
        this.f261616e = str3;
        this.f261617f = str4;
        this.f261618g = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b a(b bVar, ArrayList arrayList, boolean z12, int i12) {
        bVar.getClass();
        String str = bVar.f261613b;
        List list = arrayList;
        if ((i12 & 4) != 0) {
            list = bVar.f261614c;
        }
        List list2 = list;
        String str2 = bVar.f261615d;
        String str3 = bVar.f261616e;
        String str4 = bVar.f261617f;
        if ((i12 & 64) != 0) {
            z12 = bVar.f261618g;
        }
        bVar.getClass();
        return new b(str, str2, str3, str4, list2, z12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return L.f(this.f261613b, bVar.f261613b) && L.f(this.f261614c, bVar.f261614c) && L.f(this.f261615d, bVar.f261615d) && L.f(this.f261616e, bVar.f261616e) && L.f(this.f261617f, bVar.f261617f) && this.f261618g == bVar.f261618g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF247713b() {
        return 2121826591;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF261657b() {
        return "bbip_v2_duration";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261618g) + H.d(H.d(H.d(H.e(H.d(1352114881, 31, this.f261613b), 31, this.f261614c), 31, this.f261615d), 31, this.f261616e), 31, this.f261617f);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BbipV2DurationItem(stringId=bbip_v2_duration, title=");
        sb2.append(this.f261613b);
        sb2.append(", durations=");
        sb2.append(this.f261614c);
        sb2.append(", moreButtonLabel=");
        sb2.append(this.f261615d);
        sb2.append(", selectTitle=");
        sb2.append(this.f261616e);
        sb2.append(", selectButtonText=");
        sb2.append(this.f261617f);
        sb2.append(", shouldBlockDurations=");
        return r.x(sb2, this.f261618g, ')');
    }
}
