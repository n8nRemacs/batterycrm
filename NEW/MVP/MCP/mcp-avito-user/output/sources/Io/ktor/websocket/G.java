package io.ktor.websocket;

import b41.C25411b;
import io.ktor.util.C41586b;
import io.ktor.websocket.AbstractC41723i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.sequences.o0;
import kotlin.text.C43066x;

/* compiled from: WebSocketDeflateExtension.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/websocket/G;", "Lio/ktor/websocket/L;", "Lio/ktor/websocket/G$b;", "a", "b", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class G implements L<b> {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f401427d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f401428a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f401429b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f401430c;

    /* compiled from: WebSocketDeflateExtension.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/websocket/G$a;", "Lio/ktor/websocket/M;", "Lio/ktor/websocket/G$b;", "Lio/ktor/websocket/G;", "<init>", "()V", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements M<b, G> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WebSocketDeflateExtension.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/websocket/G$b;", "", "<init>", "()V", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y41.l<? super List<O>, G0> f401431a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Y41.l<? super AbstractC41723i, Boolean> f401432b;

        /* compiled from: WebSocketDeflateExtension.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/websocket/i;", "it", "", "invoke", "(Lio/ktor/websocket/i;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<AbstractC41723i, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f401433l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ Boolean invoke(AbstractC41723i abstractC41723i) {
                return Boolean.TRUE;
            }
        }

        /* compiled from: WebSocketDeflateExtension.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lio/ktor/websocket/O;", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: io.ktor.websocket.G$b$b, reason: collision with other inner class name */
        public static final class C11429b extends kotlin.jvm.internal.N implements Y41.l<List<O>, G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final C11429b f401434l = new C11429b();

            public C11429b() {
                super(1);
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ G0 invoke(List<O> list) {
                return G0.f406611a;
            }
        }

        public b() {
            C11429b c11429b = C11429b.f401434l;
            this.f401432b = a.f401433l;
        }
    }

    static {
        new a(null);
        new C41586b("WebsocketDeflateExtension");
        f401427d = true;
    }

    @Override // io.ktor.websocket.L
    @Y61.k
    public final ArrayList a() {
        return null;
    }

    @Override // io.ktor.websocket.L
    @Y61.k
    public final AbstractC41723i b(@Y61.k AbstractC41723i abstractC41723i) {
        if ((abstractC41723i instanceof AbstractC41723i.f) || (abstractC41723i instanceof AbstractC41723i.a)) {
            throw null;
        }
        return abstractC41723i;
    }

    @Override // io.ktor.websocket.L
    @Y61.k
    public final AbstractC41723i c(@Y61.k AbstractC41723i abstractC41723i) {
        if ((!abstractC41723i.f401561e || (!(abstractC41723i instanceof AbstractC41723i.f) && !(abstractC41723i instanceof AbstractC41723i.a))) && !this.f401430c) {
            return abstractC41723i;
        }
        this.f401430c = true;
        C42756l.W(abstractC41723i.f401559c, C25411b.f56904b);
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.websocket.L
    public final boolean d(@Y61.k List<O> list) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(((O) next).f401436a, "permessage-deflate")) {
                break;
            }
        }
        O o12 = (O) next;
        if (o12 == null) {
            return false;
        }
        this.f401429b = false;
        this.f401428a = false;
        o0.a aVar = new o0.a(new o0(new C42770s0(o12.f401437b), N.f401435l));
        while (aVar.f410559b.hasNext()) {
            kotlin.Q q12 = (kotlin.Q) aVar.next();
            String str = (String) q12.f406619b;
            String str2 = (String) q12.f406620c;
            switch (str.hashCode()) {
                case -708713803:
                    if (!str.equals("client_no_context_takeover")) {
                        continue;
                    } else {
                        if (!C43066x.K(str2)) {
                            throw new IllegalStateException("WebSocket permessage-deflate extension parameter client_no_context_takeover shouldn't have a value. Current: ".concat(str2).toString());
                        }
                        this.f401428a = true;
                        break;
                    }
                case 646404390:
                    if (str.equals("client_max_window_bits") && !C43066x.K(str2) && Integer.parseInt(str2) != 15) {
                        throw new IllegalStateException("Only 15 window size is supported.");
                    }
                    break;
                case 1266201133:
                    if (!str.equals("server_no_context_takeover")) {
                        continue;
                    } else {
                        if (!C43066x.K(str2)) {
                            throw new IllegalStateException("WebSocket permessage-deflate extension parameter server_no_context_takeover shouldn't have a value. Current: ".concat(str2).toString());
                        }
                        this.f401429b = true;
                        break;
                    }
                case 2034279582:
                    str.equals("server_max_window_bits");
                    break;
            }
        }
        return true;
    }
}
