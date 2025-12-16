package com.avito.android.verification.links.vtb;

import Ju.InterfaceC14249c;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationVTBResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/links/vtb/k;", "", "a", "b", "c", "Lcom/avito/android/verification/links/vtb/k$a;", "Lcom/avito/android/verification/links/vtb/k$b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface k {

    /* compiled from: VerificationVTBResult.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/links/vtb/k$a;", "Lcom/avito/android/verification/links/vtb/k;", "LJu/c$b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements k, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f324739b;

        public a(@Y61.k String str) {
            this.f324739b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f324739b, ((a) obj).f324739b);
        }

        public final int hashCode() {
            return this.f324739b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Failure(reason="), this.f324739b, ')');
        }
    }

    /* compiled from: VerificationVTBResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/verification/links/vtb/k$b;", "Lcom/avito/android/verification/links/vtb/k;", "LJu/c$b;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements k, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f324740b = new b();
    }

    /* compiled from: VerificationVTBResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/links/vtb/k$c;", "LJu/c$a;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final c f324741b = new c();
    }
}
