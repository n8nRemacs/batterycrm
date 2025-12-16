package com.avito.android.user_advert.advert;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: DetailsId.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/d;", "Lcom/avito/android/user_advert/advert/e;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C35382d extends AbstractC35385e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f308519a;

    public C35382d(@Y61.k String str) {
        super(null);
        this.f308519a = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35382d) && kotlin.jvm.internal.L.f(this.f308519a, ((C35382d) obj).f308519a);
    }

    public final int hashCode() {
        return this.f308519a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("AdvertId(advertId="), this.f308519a, ')');
    }
}
