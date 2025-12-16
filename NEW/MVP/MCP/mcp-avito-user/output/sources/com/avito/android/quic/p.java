package com.avito.android.quic;

import android.location.Location;
import j.k0;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43059p;
import okhttp3.HttpUrl;

/* compiled from: QuicStrategy.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/quic/p;", "", "a", "b", "c", "d", "e", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f246281a = a.f246282a;

    /* compiled from: QuicStrategy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/quic/p$a;", "", "<init>", "()V", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f246282a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C43059p f246283b = new C43059p("^\\d\\d\\.img\\.avito\\.st$");

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final Set<C43059p> f246284c = C42756l.l0(new C43059p[]{new C43059p("/\\d+/toggles"), new C43059p("/\\d+/config/android"), new C43059p("/\\d+/features")});

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Set<Integer> f246285d = C42756l.l0(new Integer[]{3226, 4204, 4205, 3224, 4599, 6545, 3223, 5596});

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final List<String> f246286e = C42745f0.U("mts", "megafon");
    }

    /* compiled from: QuicStrategy.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/p$b;", "", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @Y61.k
        String a();

        boolean b();
    }

    /* compiled from: QuicStrategy.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/p$d;", "", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
        @Y61.l
        Location a();
    }

    /* compiled from: QuicStrategy.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/p$e;", "", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e {
        @Y61.l
        Object a(@Y61.k String str, @Y61.k SuspendLambda suspendLambda);
    }

    boolean a(@Y61.k HttpUrl httpUrl);

    boolean c();

    boolean d();

    @Y61.k
    HttpUrl e(@Y61.k HttpUrl httpUrl);

    /* compiled from: QuicStrategy.kt */
    @k0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/quic/p$c;", "Lcom/avito/android/quic/p;", "<init>", "()V", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements p {
        static {
            new c();
        }

        @Override // com.avito.android.quic.p
        public final boolean a(@Y61.k HttpUrl httpUrl) {
            return false;
        }

        @Override // com.avito.android.quic.p
        public final boolean c() {
            return false;
        }

        @Override // com.avito.android.quic.p
        public final boolean d() {
            return false;
        }

        @Override // com.avito.android.quic.p
        @Y61.k
        public final HttpUrl e(@Y61.k HttpUrl httpUrl) {
            return httpUrl;
        }
    }
}
