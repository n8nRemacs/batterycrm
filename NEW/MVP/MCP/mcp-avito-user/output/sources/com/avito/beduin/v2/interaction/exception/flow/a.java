package com.avito.beduin.v2.interaction.exception.flow;

import FV0.h;
import Y61.k;
import com.avito.beduin.v2.handler.flow.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BottomSheetExceptionInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/interaction/exception/flow/a;", "LFV0/h;", "Lcom/avito/beduin/v2/handler/flow/e;", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/beduin/v2/interaction/exception/flow/d;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends i<d> implements h, com.avito.beduin.v2.handler.flow.e {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.utils.detached.b f337388c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e f337389d;

    /* compiled from: BottomSheetExceptionInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/interaction/exception/flow/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.interaction.exception.flow.a$a, reason: collision with other inner class name */
    public static final class C10454a {
        public /* synthetic */ C10454a(C42822w c42822w) {
            this();
        }

        public C10454a() {
        }
    }

    static {
        new C10454a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(@k com.avito.beduin.v2.utils.detached.b bVar) {
        e eVar = e.f337401b;
        super(eVar);
        this.f337388c = bVar;
        this.f337389d = eVar;
    }

    @Override // FV0.h
    public final void P() {
        this.f337388c.P();
    }

    @Override // FV0.h
    public final void Q(@k FV0.a aVar) {
        this.f337388c.Q(aVar);
    }

    @Override // com.avito.beduin.v2.handler.flow.i, com.avito.beduin.v2.handler.flow.j
    @k
    /* renamed from: k */
    public final dU0.c getF337165b() {
        return this.f337389d;
    }

    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i p(dU0.b bVar) {
        return C43175k.G(new b(this, (d) bVar, null));
    }
}
