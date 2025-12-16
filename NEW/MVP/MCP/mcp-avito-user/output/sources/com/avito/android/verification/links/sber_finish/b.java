package com.avito.android.verification.links.sber_finish;

import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SberIdResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/links/sber_finish/b;", "", "a", "b", "Lcom/avito/android/verification/links/sber_finish/b$a;", "Lcom/avito/android/verification/links/sber_finish/b$b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: SberIdResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/sber_finish/b$a;", "Lcom/avito/android/verification/links/sber_finish/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f324441a;

        public a(@Y61.k String str) {
            this.f324441a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f324441a, ((a) obj).f324441a);
        }

        public final int hashCode() {
            return this.f324441a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Failure(reason="), this.f324441a, ')');
        }
    }

    /* compiled from: SberIdResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/sber_finish/b$b;", "Lcom/avito/android/verification/links/sber_finish/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.verification.links.sber_finish.b$b, reason: collision with other inner class name */
    public static final /* data */ class C10041b implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f324442a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f324443b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f324444c;

        public C10041b(@l String str, @l String str2, @l String str3) {
            this.f324442a = str;
            this.f324443b = str2;
            this.f324444c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10041b)) {
                return false;
            }
            C10041b c10041b = (C10041b) obj;
            return L.f(this.f324442a, c10041b.f324442a) && L.f(this.f324443b, c10041b.f324443b) && L.f(this.f324444c, c10041b.f324444c);
        }

        public final int hashCode() {
            String str = this.f324442a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f324443b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f324444c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Success(authCode=");
            sb2.append(this.f324442a);
            sb2.append(", nonce=");
            sb2.append(this.f324443b);
            sb2.append(", state=");
            return C22026a.c(sb2, this.f324444c, ')');
        }

        public /* synthetic */ C10041b(String str, String str2, String str3, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : str3);
        }
    }
}
