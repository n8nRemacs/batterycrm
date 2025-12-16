package com.avito.beduin.v2.interaction.detached.flow;

import Y61.k;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.interaction.detached.flow.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;

/* compiled from: ShowBottomSheetInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/interaction/detached/flow/h;", "LFV0/h;", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/beduin/v2/interaction/detached/flow/g;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends com.avito.beduin.v2.handler.flow.i<g> implements FV0.h {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f337331d;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.utils.detached.b f337332c;

    /* compiled from: ShowBottomSheetInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/interaction/detached/flow/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f337331d = "ShowBottomSheetInteractionHandler";
    }

    public h(@k com.avito.beduin.v2.utils.detached.b bVar) {
        super(g.a.f337330b);
        this.f337332c = bVar;
    }

    @Override // FV0.h
    public final void P() {
        this.f337332c.P();
    }

    @Override // FV0.h
    public final void Q(@k FV0.a aVar) {
        this.f337332c.Q(aVar);
    }

    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i o(InterfaceC36238a interfaceC36238a, dU0.b bVar) {
        return new X(C43175k.G(new i((g) bVar, this, null)), new j(3, null));
    }
}
