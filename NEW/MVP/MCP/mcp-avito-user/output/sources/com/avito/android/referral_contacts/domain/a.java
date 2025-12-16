package com.avito.android.referral_contacts.domain;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContactsDataSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/referral_contacts/domain/a;", "", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f252446a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f252447b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public ArrayList<String> f252448c = new ArrayList<>();

    public a(@k String str, @k String str2) {
        this.f252446a = str;
        this.f252447b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f252446a, aVar.f252446a) && L.f(this.f252447b, aVar.f252447b);
    }

    public final int hashCode() {
        return this.f252447b.hashCode() + (this.f252446a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Contact(id=");
        sb2.append(this.f252446a);
        sb2.append(", name=");
        return C22026a.c(sb2, this.f252447b, ')');
    }
}
