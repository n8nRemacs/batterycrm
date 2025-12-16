package ew0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoCodeOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lew0/d;", "", "a", "b", "Lew0/d$a;", "Lew0/d$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ew0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC40170d {

    /* compiled from: PromoCodeOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew0/d$a;", "Lew0/d;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ew0.d$a */
    public static final /* data */ class a implements InterfaceC40170d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f395463a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f395464b;

        public a(@l String str, @l String str2) {
            this.f395463a = str;
            this.f395464b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f395463a, aVar.f395463a) && L.f(this.f395464b, aVar.f395464b);
        }

        public final int hashCode() {
            String str = this.f395463a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f395464b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseScreenWithResult(promoCode=");
            sb2.append(this.f395463a);
            sb2.append(", toastMessage=");
            return C22026a.c(sb2, this.f395464b, ')');
        }
    }

    /* compiled from: PromoCodeOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew0/d$b;", "Lew0/d;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ew0.d$b */
    public static final /* data */ class b implements InterfaceC40170d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395465a;

        public b(@k String str) {
            this.f395465a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f395465a, ((b) obj).f395465a);
        }

        public final int hashCode() {
            return this.f395465a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToast(text="), this.f395465a, ')');
        }
    }
}
