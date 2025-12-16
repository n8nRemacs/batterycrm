package KA;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSetSelectionNameState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LKA/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f9343h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final c f9344i = new c("", true, false, new b(com.avito.android.printable_text.b.a(), false), null, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f9345b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9346c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9347d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final b f9348e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f9349f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Boolean f9350g;

    /* compiled from: ExtendedProfileSetSelectionNameState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKA/c$a;", "", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKA/c$b;", "", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f9351a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f9352b;

        public b(@k PrintableText printableText, boolean z12) {
            this.f9351a = printableText;
            this.f9352b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f9351a, bVar.f9351a) && this.f9352b == bVar.f9352b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f9352b) + (this.f9351a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Hint(text=");
            sb2.append(this.f9351a);
            sb2.append(", highlightError=");
            return r.x(sb2, this.f9352b, ')');
        }
    }

    public c(@k String str, boolean z12, boolean z13, @k b bVar, @l String str2, @l Boolean bool) {
        this.f9345b = str;
        this.f9346c = z12;
        this.f9347d = z13;
        this.f9348e = bVar;
        this.f9349f = str2;
        this.f9350g = bool;
    }

    public static c a(c cVar, String str, boolean z12, boolean z13, b bVar, String str2, Boolean bool, int i12) {
        if ((i12 & 1) != 0) {
            str = cVar.f9345b;
        }
        String str3 = str;
        if ((i12 & 2) != 0) {
            z12 = cVar.f9346c;
        }
        boolean z14 = z12;
        if ((i12 & 4) != 0) {
            z13 = cVar.f9347d;
        }
        boolean z15 = z13;
        if ((i12 & 8) != 0) {
            bVar = cVar.f9348e;
        }
        b bVar2 = bVar;
        if ((i12 & 16) != 0) {
            str2 = cVar.f9349f;
        }
        String str4 = str2;
        if ((i12 & 32) != 0) {
            bool = cVar.f9350g;
        }
        cVar.getClass();
        return new c(str3, z14, z15, bVar2, str4, bool);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f9345b, cVar.f9345b) && this.f9346c == cVar.f9346c && this.f9347d == cVar.f9347d && L.f(this.f9348e, cVar.f9348e) && L.f(this.f9349f, cVar.f9349f) && L.f(this.f9350g, cVar.f9350g);
    }

    public final int hashCode() {
        int iHashCode = (this.f9348e.hashCode() + r.i(r.i(this.f9345b.hashCode() * 31, 31, this.f9346c), 31, this.f9347d)) * 31;
        String str = this.f9349f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f9350g;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileSetSelectionNameState(name=");
        sb2.append(this.f9345b);
        sb2.append(", isPublic=");
        sb2.append(this.f9346c);
        sb2.append(", isLoading=");
        sb2.append(this.f9347d);
        sb2.append(", hint=");
        sb2.append(this.f9348e);
        sb2.append(", savedName=");
        sb2.append(this.f9349f);
        sb2.append(", savedIsPublic=");
        return C0.g(sb2, this.f9350g, ')');
    }
}
