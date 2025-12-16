package com.avito.android.bxcontent.garage;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddCarToGarageDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bxcontent/garage/i;", "", "a", "b", "Lcom/avito/android/bxcontent/garage/i$a;", "Lcom/avito/android/bxcontent/garage/i$b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface i {

    /* compiled from: AddCarToGarageDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/garage/i$a;", "Lcom/avito/android/bxcontent/garage/i;", "LJu/c$b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements i, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f111114b;

        public a(@k String str) {
            this.f111114b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f111114b, ((a) obj).f111114b);
        }

        public final int hashCode() {
            return this.f111114b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("AddCarToGarageError(errorMessage="), this.f111114b, ')');
        }
    }

    /* compiled from: AddCarToGarageDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bxcontent/garage/i$b;", "Lcom/avito/android/bxcontent/garage/i;", "LJu/c$b;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements i, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f111115b = new b();
    }
}
