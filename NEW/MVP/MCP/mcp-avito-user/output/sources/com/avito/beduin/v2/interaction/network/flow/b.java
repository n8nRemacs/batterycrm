package com.avito.beduin.v2.interaction.network.flow;

import TT0.a;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.interaction.network.flow.a;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.internal.K;

/* compiled from: HttpRequestInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/b;", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/beduin/v2/interaction/network/flow/a;", "a", "b", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class b extends com.avito.beduin.v2.handler.flow.i<com.avito.beduin.v2.interaction.network.flow.a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SU0.g f337591c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CU0.d f337592d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.interaction.network.parser.serializer.c f337593e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.C1074a.C1075a f337594f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SU0.k f337595g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SU0.a f337596h;

    /* compiled from: HttpRequestInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: HttpRequestInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/b$b;", "", "a", "b", "Lcom/avito/beduin/v2/interaction/network/flow/b$b$a;", "Lcom/avito/beduin/v2/interaction/network/flow/b$b$b;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.interaction.network.flow.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC10460b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.engine.field.d f337597a;

        /* compiled from: HttpRequestInteractionHandler.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/b$b$a;", "Lcom/avito/beduin/v2/interaction/network/flow/b$b;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.interaction.network.flow.b$b$a */
        public static final class a extends AbstractC10460b {
        }

        /* compiled from: HttpRequestInteractionHandler.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/b$b$b;", "Lcom/avito/beduin/v2/interaction/network/flow/b$b;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.interaction.network.flow.b$b$b, reason: collision with other inner class name */
        public static final class C10461b extends AbstractC10460b {
        }

        public AbstractC10460b(com.avito.beduin.v2.engine.field.d dVar, C42822w c42822w) {
            this.f337597a = dVar;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@Y61.k SU0.g gVar, @Y61.k CU0.d dVar, @Y61.k com.avito.beduin.v2.interaction.network.parser.serializer.c cVar, @Y61.k SU0.k kVar, @Y61.k SU0.a aVar) {
        super(a.C10458a.f337582b);
        TT0.a.f15671a.getClass();
        a.C1074a.C1075a c1075a = a.C1074a.f15673b;
        this.f337591c = gVar;
        this.f337592d = dVar;
        this.f337593e = cVar;
        this.f337594f = c1075a;
        this.f337595g = kVar;
        this.f337596h = aVar;
    }

    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i o(InterfaceC36238a interfaceC36238a, dU0.b bVar) {
        com.avito.beduin.v2.interaction.network.flow.a aVar = (com.avito.beduin.v2.interaction.network.flow.a) bVar;
        InterfaceC43160i interfaceC43160iD = C43175k.d(new c(this, aVar, interfaceC36238a.c(), null));
        this.f337594f.getClass();
        return new X(new C43137a0(new e(aVar, null), C43175k.I(K.f411877a, new d(C43175k.I(C43262l0.f411945a, interfaceC43160iD), aVar))), new f(3, null));
    }
}
