package cf;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectBookingAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcf/a;", "", "a", "b", "Lcf/a$a;", "Lcf/a$b;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC27184a {

    /* compiled from: AutoSelectBookingAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcf/a$a;", "Lcf/a;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cf.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2052a implements InterfaceC27184a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f58063a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f58064b;

        public C2052a(@k String str, @k String str2) {
            this.f58063a = str;
            this.f58064b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2052a)) {
                return false;
            }
            C2052a c2052a = (C2052a) obj;
            return L.f(this.f58063a, c2052a.f58063a) && L.f(this.f58064b, c2052a.f58064b);
        }

        public final int hashCode() {
            return this.f58064b.hashCode() + (this.f58063a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CancelBookingClicked(itemId=");
            sb2.append(this.f58063a);
            sb2.append(", buttonTitle=");
            return C22026a.c(sb2, this.f58064b, ')');
        }
    }

    /* compiled from: AutoSelectBookingAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcf/a$b;", "Lcf/a;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cf.a$b */
    public static final /* data */ class b implements InterfaceC27184a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f58065a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f58066b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f58067c;

        public b() {
            this(null, null, false, 7, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f58065a, bVar.f58065a) && L.f(this.f58066b, bVar.f58066b) && this.f58067c == bVar.f58067c;
        }

        public final int hashCode() {
            String str = this.f58065a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f58066b;
            return Boolean.hashCode(this.f58067c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseDialog(itemId=");
            sb2.append(this.f58065a);
            sb2.append(", buttonTitle=");
            sb2.append(this.f58066b);
            sb2.append(", isReloadOnClose=");
            return r.x(sb2, this.f58067c, ')');
        }

        public b(String str, String str2, boolean z12, int i12, C42822w c42822w) {
            str = (i12 & 1) != 0 ? null : str;
            str2 = (i12 & 2) != 0 ? null : str2;
            z12 = (i12 & 4) != 0 ? false : z12;
            this.f58065a = str;
            this.f58066b = str2;
            this.f58067c = z12;
        }
    }
}
