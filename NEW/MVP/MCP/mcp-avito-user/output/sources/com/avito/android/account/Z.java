package com.avito.android.account;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: LoginSuggest.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/account/Z;", "", "_avito_account-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f68096a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f68097b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f68098c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f68099d;

    public Z(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        this.f68096a = str;
        this.f68097b = str2;
        this.f68098c = str3;
        this.f68099d = str4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z12 = (Z) obj;
        return kotlin.jvm.internal.L.f(this.f68096a, z12.f68096a) && kotlin.jvm.internal.L.f(this.f68097b, z12.f68097b) && kotlin.jvm.internal.L.f(this.f68098c, z12.f68098c) && kotlin.jvm.internal.L.f(this.f68099d, z12.f68099d);
    }

    public final int hashCode() {
        int iHashCode = this.f68096a.hashCode() * 31;
        String str = this.f68097b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f68098c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f68099d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoginSuggest(userHashId=");
        sb2.append(this.f68096a);
        sb2.append(", login=");
        sb2.append(this.f68097b);
        sb2.append(", social=");
        sb2.append(this.f68098c);
        sb2.append(", socialId=");
        return C22026a.c(sb2, this.f68099d, ')');
    }
}
