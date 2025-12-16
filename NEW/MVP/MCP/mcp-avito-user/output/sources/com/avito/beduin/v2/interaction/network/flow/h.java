package com.avito.beduin.v2.interaction.network.flow;

import TT0.a;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.interaction.network.flow.g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.internal.K;

/* compiled from: NetworkRequestInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/h;", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/beduin/v2/interaction/network/flow/g;", "a", "b", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends com.avito.beduin.v2.handler.flow.i<g> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f337640i = 0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SU0.g f337641c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CU0.b f337642d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.interaction.network.parser.serializer.c f337643e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.C1074a.C1075a f337644f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SU0.k f337645g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SU0.a f337646h;

    /* compiled from: NetworkRequestInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: NetworkRequestInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/h$b;", "", "b", "c", "d", "Lcom/avito/beduin/v2/interaction/network/flow/h$b$b;", "Lcom/avito/beduin/v2/interaction/network/flow/h$b$c;", "Lcom/avito/beduin/v2/interaction/network/flow/h$b$d;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: NetworkRequestInteractionHandler.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            @Y61.k
            public static A a(@Y61.k b bVar, @Y61.k C36272i c36272i) {
                if (bVar instanceof c) {
                    return new A(new Q("progress", new A(new Q("value", c36272i.c(((c) bVar).f337650a)))));
                }
                if (bVar instanceof d) {
                    d dVar = (d) bVar;
                    return new A(new com.avito.beduin.v2.engine.field.m((Map<String, ? extends com.avito.beduin.v2.engine.field.d>) P0.l(dVar.f337651a.a(c36272i).f336778b.f336870a, new Q("isSuccess", c36272i.f(dVar.f337652b)))), null, 2, null);
                }
                if (bVar instanceof InterfaceC10464b.c) {
                    String message = ((InterfaceC10464b.c) bVar).f337649a.getMessage();
                    return new A(new Q("error", new A(new Q("transport-error", new A(new Q("message", c36272i.e(message != null ? message : "")))))));
                }
                if (!(bVar instanceof InterfaceC10464b.C10465b)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC10464b.C10465b c10465b = (InterfaceC10464b.C10465b) bVar;
                Q q12 = new Q("httpStatusCode", c36272i.c(c10465b.f337647a));
                String message2 = c10465b.f337648b.getMessage();
                return new A(q12, new Q("error", new A(new Q("parsing-error", new A(new Q("message", c36272i.e(message2 != null ? message2 : "")))))));
            }
        }

        /* compiled from: NetworkRequestInteractionHandler.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/h$b$b;", "Lcom/avito/beduin/v2/interaction/network/flow/h$b;", "b", "c", "Lcom/avito/beduin/v2/interaction/network/flow/h$b$b$b;", "Lcom/avito/beduin/v2/interaction/network/flow/h$b$b$c;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.interaction.network.flow.h$b$b, reason: collision with other inner class name */
        public interface InterfaceC10464b extends b {

            /* compiled from: NetworkRequestInteractionHandler.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.beduin.v2.interaction.network.flow.h$b$b$a */
            public static final class a {
            }

            /* compiled from: NetworkRequestInteractionHandler.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/h$b$b$b;", "Lcom/avito/beduin/v2/interaction/network/flow/h$b$b;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.beduin.v2.interaction.network.flow.h$b$b$b, reason: collision with other inner class name */
            public static final class C10465b implements InterfaceC10464b {

                /* renamed from: a, reason: collision with root package name */
                public final int f337647a;

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final Throwable f337648b;

                public C10465b(int i12, @Y61.k Throwable th2) {
                    this.f337647a = i12;
                    this.f337648b = th2;
                }

                @Override // com.avito.beduin.v2.interaction.network.flow.h.b
                @Y61.k
                public final A a(@Y61.k C36272i c36272i) {
                    return a.a(this, c36272i);
                }
            }

            /* compiled from: NetworkRequestInteractionHandler.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/h$b$b$c;", "Lcom/avito/beduin/v2/interaction/network/flow/h$b$b;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.beduin.v2.interaction.network.flow.h$b$b$c */
            public static final class c implements InterfaceC10464b {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final Exception f337649a;

                public c(@Y61.k Exception exc) {
                    this.f337649a = exc;
                }

                @Override // com.avito.beduin.v2.interaction.network.flow.h.b
                @Y61.k
                public final A a(@Y61.k C36272i c36272i) {
                    return a.a(this, c36272i);
                }
            }
        }

        /* compiled from: NetworkRequestInteractionHandler.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/h$b$c;", "Lcom/avito/beduin/v2/interaction/network/flow/h$b;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements b {

            /* renamed from: a, reason: collision with root package name */
            public final int f337650a;

            public c(int i12) {
                this.f337650a = i12;
            }

            @Override // com.avito.beduin.v2.interaction.network.flow.h.b
            @Y61.k
            public final A a(@Y61.k C36272i c36272i) {
                return a.a(this, c36272i);
            }
        }

        /* compiled from: NetworkRequestInteractionHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/h$b$d;", "Lcom/avito/beduin/v2/interaction/network/flow/h$b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final a f337651a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f337652b;

            /* compiled from: NetworkRequestInteractionHandler.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/h$b$d$a;", "", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class a {

                /* renamed from: a, reason: collision with root package name */
                public final int f337653a;

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final com.avito.beduin.v2.engine.field.d f337654b;

                public a(int i12, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
                    this.f337653a = i12;
                    this.f337654b = dVar;
                }

                @Y61.k
                public final A a(@Y61.k C36272i c36272i) {
                    Q q12 = new Q("httpStatusCode", c36272i.c(this.f337653a));
                    com.avito.beduin.v2.engine.field.d dVar = this.f337654b;
                    return new A(q12, new Q("result", dVar instanceof A ? (A) dVar : new A(new Q("value", dVar))));
                }
            }

            public d(@Y61.k a aVar, boolean z12) {
                this.f337651a = aVar;
                this.f337652b = z12;
            }

            @Override // com.avito.beduin.v2.interaction.network.flow.h.b
            @Y61.k
            public final A a(@Y61.k C36272i c36272i) {
                return a.a(this, c36272i);
            }
        }

        @Y61.k
        A a(@Y61.k C36272i c36272i);
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@Y61.k SU0.g gVar, @Y61.k CU0.b bVar, @Y61.k com.avito.beduin.v2.interaction.network.parser.serializer.c cVar, @Y61.k SU0.k kVar, @Y61.k SU0.a aVar) {
        super(g.a.f337631b);
        TT0.a.f15671a.getClass();
        a.C1074a.C1075a c1075a = a.C1074a.f15673b;
        this.f337641c = gVar;
        this.f337642d = bVar;
        this.f337643e = cVar;
        this.f337644f = c1075a;
        this.f337645g = kVar;
        this.f337646h = aVar;
    }

    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i o(InterfaceC36238a interfaceC36238a, dU0.b bVar) {
        g gVar = (g) bVar;
        InterfaceC43160i interfaceC43160iD = C43175k.d(new i(gVar, this, interfaceC36238a.c(), null));
        this.f337644f.getClass();
        return new X(new C43137a0(new k(this, gVar, null), C43175k.I(K.f411877a, new j(C43175k.I(C43262l0.f411945a, interfaceC43160iD), this, gVar, interfaceC36238a))), new l(3, null));
    }
}
