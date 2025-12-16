package EN0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientRoomOneTimeEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LEN0/b;", "", "a", "b", "c", "d", "e", "f", "LEN0/b$a;", "LEN0/b$b;", "LEN0/b$c;", "LEN0/b$d;", "LEN0/b$e;", "LEN0/b$f;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: ClientRoomOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEN0/b$a;", "LEN0/b;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f3954a;

        public a(@k String str) {
            this.f3954a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f3954a, ((a) obj).f3954a);
        }

        public final int hashCode() {
            return this.f3954a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Call(phone="), this.f3954a, ')');
        }
    }

    /* compiled from: ClientRoomOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEN0/b$b;", "LEN0/b;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: EN0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0230b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3955a;

        public C0230b(boolean z12) {
            this.f3955a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0230b) && this.f3955a == ((C0230b) obj).f3955a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f3955a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CloseScreen(needUpdate="), this.f3955a, ')');
        }
    }

    /* compiled from: ClientRoomOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEN0/b$c;", "LEN0/b;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f3956a;

        public c(@k String str) {
            this.f3956a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f3956a, ((c) obj).f3956a);
        }

        public final int hashCode() {
            return this.f3956a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CopyNumber(phone="), this.f3956a, ')');
        }
    }

    /* compiled from: ClientRoomOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEN0/b$d;", "LEN0/b;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f3957a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f3958b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f3959c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f3960d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f3961e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f3962f;

        public d(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k String str6) {
            this.f3957a = str;
            this.f3958b = str2;
            this.f3959c = str3;
            this.f3960d = str4;
            this.f3961e = str5;
            this.f3962f = str6;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f3957a, dVar.f3957a) && L.f(this.f3958b, dVar.f3958b) && L.f(this.f3959c, dVar.f3959c) && L.f(this.f3960d, dVar.f3960d) && L.f(this.f3961e, dVar.f3961e) && L.f(this.f3962f, dVar.f3962f);
        }

        public final int hashCode() {
            return this.f3962f.hashCode() + H.d(H.d(H.d(H.d(this.f3957a.hashCode() * 31, 31, this.f3958b), 31, this.f3959c), 31, this.f3960d), 31, this.f3961e);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Edit(id=");
            sb2.append(this.f3957a);
            sb2.append(", firstName=");
            sb2.append(this.f3958b);
            sb2.append(", lastName=");
            sb2.append(this.f3959c);
            sb2.append(", middleName=");
            sb2.append(this.f3960d);
            sb2.append(", phone=");
            sb2.append(this.f3961e);
            sb2.append(", email=");
            return C22026a.c(sb2, this.f3962f, ')');
        }
    }

    /* compiled from: ClientRoomOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEN0/b$e;", "LEN0/b;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f3963a;

        public e(@k PrintableText printableText) {
            this.f3963a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f3963a, ((e) obj).f3963a);
        }

        public final int hashCode() {
            return this.f3963a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowErrorMessage(text="), this.f3963a, ')');
        }
    }

    /* compiled from: ClientRoomOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEN0/b$f;", "LEN0/b;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DN0.b f3964a;

        public f(@k DN0.b bVar) {
            this.f3964a = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f3964a, ((f) obj).f3964a);
        }

        public final int hashCode() {
            return this.f3964a.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateCategory(selectedCategory=" + this.f3964a + ')';
        }
    }
}
