package ru.avito.websocket;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RxWebSocketState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/avito/websocket/u;", "", "<init>", "()V", "a", "b", "c", "Lru/avito/websocket/u$a;", "Lru/avito/websocket/u$b;", "Lru/avito/websocket/u$c;", "_common_rx-websocket_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class u {

    /* compiled from: RxWebSocketState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/websocket/u$a;", "Lru/avito/websocket/u;", "<init>", "()V", "_common_rx-websocket_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends u {
        public a() {
            super(null);
        }

        @Y61.k
        public final String toString() {
            return "Connected";
        }
    }

    /* compiled from: RxWebSocketState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/websocket/u$b;", "Lru/avito/websocket/u;", "<init>", "()V", "_common_rx-websocket_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends u {
        public b() {
            super(null);
        }

        @Y61.k
        public final String toString() {
            return "Connecting";
        }
    }

    /* compiled from: RxWebSocketState.kt */
    @fE0.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/websocket/u$c;", "Lru/avito/websocket/u;", "_common_rx-websocket_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends u {

        /* renamed from: a, reason: collision with root package name */
        public final int f431954a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f431955b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Throwable f431956c;

        public c() {
            this(0, null, null, 7, null);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Disconnected{code=");
            sb2.append(this.f431954a);
            sb2.append(", reason=\"");
            sb2.append(this.f431955b);
            sb2.append("\", error=\"");
            Throwable th2 = this.f431956c;
            return AK.c.s(sb2, th2 != null ? th2.getMessage() : null, "}\"");
        }

        public /* synthetic */ c(int i12, String str, Throwable th2, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? -1 : i12, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : th2);
        }

        public c(int i12, @Y61.l String str, @Y61.l Throwable th2) {
            super(null);
            this.f431954a = i12;
            this.f431955b = str;
            this.f431956c = th2;
        }
    }

    public /* synthetic */ u(C42822w c42822w) {
        this();
    }

    public u() {
    }
}
