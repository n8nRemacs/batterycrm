package com.avito.android.verification.links.start;

import EM0.e;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationStartLinkInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/links/start/a;", "", "a", "b", "Lcom/avito/android/verification/links/start/a$a;", "Lcom/avito/android/verification/links/start/a$b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: VerificationStartLinkInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/start/a$a;", "Lcom/avito/android/verification/links/start/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.verification.links.start.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10042a implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final e.a f324500a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f324501b;

        public C10042a() {
            this(null, null, 3, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10042a)) {
                return false;
            }
            C10042a c10042a = (C10042a) obj;
            return L.f(this.f324500a, c10042a.f324500a) && L.f(this.f324501b, c10042a.f324501b);
        }

        public final int hashCode() {
            e.a aVar = this.f324500a;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            Throwable th2 = this.f324501b;
            return iHashCode + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Failure(errorDetailsV3=");
            sb2.append(this.f324500a);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f324501b, ')');
        }

        public C10042a(e.a aVar, Throwable th2, int i12, C42822w c42822w) {
            aVar = (i12 & 1) != 0 ? null : aVar;
            th2 = (i12 & 2) != 0 ? null : th2;
            this.f324500a = aVar;
            this.f324501b = th2;
        }
    }

    /* compiled from: VerificationStartLinkInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/start/a$b;", "Lcom/avito/android/verification/links/start/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final e.b f324502a;

        public b(@k e.b bVar) {
            this.f324502a = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f324502a, ((b) obj).f324502a);
        }

        public final int hashCode() {
            return this.f324502a.hashCode();
        }

        @k
        public final String toString() {
            return "Success(data=" + this.f324502a + ')';
        }
    }
}
