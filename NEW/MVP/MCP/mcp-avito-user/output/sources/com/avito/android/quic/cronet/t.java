package com.avito.android.quic.cronet;

import androidx.compose.foundation.H;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import okhttp3.Protocol;

/* compiled from: CronetInternalErrorsRelay.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/quic/cronet/t;", "", "<init>", "()V", "a", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<a> f246225a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final z<a> f246226b;

    /* compiled from: CronetInternalErrorsRelay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/t$a;", "", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final org.chromium.net.CronetException f246227a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f246228b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Protocol f246229c;

        public a(@Y61.k org.chromium.net.CronetException cronetException, @Y61.k String str, @Y61.k Protocol protocol) {
            this.f246227a = cronetException;
            this.f246228b = str;
            this.f246229c = protocol;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f246227a, aVar.f246227a) && L.f(this.f246228b, aVar.f246228b) && this.f246229c == aVar.f246229c;
        }

        public final int hashCode() {
            return this.f246229c.hashCode() + H.d(this.f246227a.hashCode() * 31, 31, this.f246228b);
        }

        @Y61.k
        public final String toString() {
            return "Error(exception=" + this.f246227a + ", urlStr=" + this.f246228b + ", protocol=" + this.f246229c + ')';
        }
    }

    @Inject
    public t() {
        com.jakewharton.rxrelay3.d<a> dVarM = C31685o.m();
        this.f246225a = dVarM;
        this.f246226b = dVarM;
    }
}
