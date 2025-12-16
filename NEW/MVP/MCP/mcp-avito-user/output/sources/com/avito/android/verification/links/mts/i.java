package com.avito.android.verification.links.mts;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationMTSResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/links/mts/i;", "", "a", "b", "c", "Lcom/avito/android/verification/links/mts/i$a;", "Lcom/avito/android/verification/links/mts/i$b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface i {

    /* compiled from: VerificationMTSResult.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/links/mts/i$a;", "Lcom/avito/android/verification/links/mts/i;", "LJu/c$b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements i, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f324316b;

        public a(@k String str) {
            this.f324316b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f324316b, ((a) obj).f324316b);
        }

        public final int hashCode() {
            return this.f324316b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Failure(reason="), this.f324316b, ')');
        }
    }

    /* compiled from: VerificationMTSResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/verification/links/mts/i$b;", "Lcom/avito/android/verification/links/mts/i;", "LJu/c$b;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements i, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f324317b = new b();
    }

    /* compiled from: VerificationMTSResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/links/mts/i$c;", "LJu/c$a;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f324318b = new c();
    }
}
