package com.avito.android.verification.links.redirect;

import DM0.e;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationRedirectLinkInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/links/redirect/a;", "", "a", "b", "Lcom/avito/android/verification/links/redirect/a$a;", "Lcom/avito/android/verification/links/redirect/a$b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: VerificationRedirectLinkInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/redirect/a$a;", "Lcom/avito/android/verification/links/redirect/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.verification.links.redirect.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10039a implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final e.a f324334a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f324335b;

        public C10039a() {
            this(null, null, 3, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10039a)) {
                return false;
            }
            C10039a c10039a = (C10039a) obj;
            return L.f(this.f324334a, c10039a.f324334a) && L.f(this.f324335b, c10039a.f324335b);
        }

        public final int hashCode() {
            e.a aVar = this.f324334a;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            Throwable th2 = this.f324335b;
            return iHashCode + (th2 != null ? th2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Failure(errorDetailsV3=");
            sb2.append(this.f324334a);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f324335b, ')');
        }

        public C10039a(e.a aVar, Throwable th2, int i12, C42822w c42822w) {
            aVar = (i12 & 1) != 0 ? null : aVar;
            th2 = (i12 & 2) != 0 ? null : th2;
            this.f324334a = aVar;
            this.f324335b = th2;
        }
    }

    /* compiled from: VerificationRedirectLinkInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/redirect/a$b;", "Lcom/avito/android/verification/links/redirect/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final e.b f324336a;

        public b(@Y61.k e.b bVar) {
            this.f324336a = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f324336a, ((b) obj).f324336a);
        }

        public final int hashCode() {
            return this.f324336a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Success(data=" + this.f324336a + ')';
        }
    }
}
