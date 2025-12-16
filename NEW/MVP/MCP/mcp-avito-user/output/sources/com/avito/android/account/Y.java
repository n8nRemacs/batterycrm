package com.avito.android.account;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CredentialsInfo.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/account/Y;", "", "a", "b", "Lcom/avito/android/account/Y$a;", "Lcom/avito/android/account/Y$b;", "_avito_account-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface Y {

    /* compiled from: CredentialsInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/account/Y$a;", "Lcom/avito/android/account/Y;", "_avito_account-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements Y {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f68093a;

        public a(@Y61.k String str) {
            this.f68093a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f68093a, ((a) obj).f68093a);
        }

        public final int hashCode() {
            return this.f68093a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Login(login="), this.f68093a, ')');
        }
    }

    /* compiled from: CredentialsInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/account/Y$b;", "Lcom/avito/android/account/Y;", "_avito_account-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements Y {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f68094a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f68095b;

        public b(@Y61.k String str, @Y61.l String str2) {
            this.f68094a = str;
            this.f68095b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f68094a, bVar.f68094a) && kotlin.jvm.internal.L.f(this.f68095b, bVar.f68095b);
        }

        public final int hashCode() {
            int iHashCode = this.f68094a.hashCode() * 31;
            String str = this.f68095b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Social(socialNetworkType=");
            sb2.append(this.f68094a);
            sb2.append(", socialId=");
            return C22026a.c(sb2, this.f68095b, ')');
        }

        public /* synthetic */ b(String str, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2);
        }
    }
}
