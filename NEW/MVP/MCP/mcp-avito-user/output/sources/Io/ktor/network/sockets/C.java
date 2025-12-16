package io.ktor.network.sockets;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DatagramSendChannel.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-network"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<Throwable, G0> f400211a = a.f400213l;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<Throwable, G0> f400212b = b.f400214l;

    /* compiled from: DatagramSendChannel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f400213l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Throwable th2) {
            return G0.f406611a;
        }
    }

    /* compiled from: DatagramSendChannel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f400214l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Throwable th2) {
            return G0.f406611a;
        }
    }

    public static final void a(Y41.l lVar) {
        String str;
        if (lVar == f400212b) {
            str = "Another handler was already registered and successfully invoked";
        } else {
            str = "Another handler was already registered: " + lVar;
        }
        throw new IllegalStateException(str);
    }
}
