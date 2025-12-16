package com.avito.beduin.v2.interaction.detached.flow;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.beduin.v2.engine.D;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ShowBottomSheetInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/detached/flow/g;", "Lcom/avito/beduin/v2/handler/flow/actions/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class g implements com.avito.beduin.v2.handler.flow.actions.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final BottomSheetHeight f337322a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BottomSheetModalSize f337323b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final BottomSheetContentPaddings f337324c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final D f337325d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Y41.a<dU0.f> f337326e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final LinkedHashMap f337327f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Y41.a<dU0.f> f337328g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Y41.a<dU0.f> f337329h;

    /* compiled from: ShowBottomSheetInteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/detached/flow/g$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f337330b = new a();

        public a() {
            super("ShowBottomSheet");
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0127  */
        @Override // dU0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final dU0.b b(com.avito.beduin.v2.engine.core.z r14, com.avito.beduin.v2.engine.field.m r15) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
            /*
                Method dump skipped, instructions count: 410
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.detached.flow.g.a.b(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.m):dU0.b");
        }
    }

    public g(@k BottomSheetHeight bottomSheetHeight, @k BottomSheetModalSize bottomSheetModalSize, @k BottomSheetContentPaddings bottomSheetContentPaddings, @k D d12, @k Y41.a aVar, @l LinkedHashMap linkedHashMap, @k Y41.a aVar2) {
        this.f337322a = bottomSheetHeight;
        this.f337323b = bottomSheetModalSize;
        this.f337324c = bottomSheetContentPaddings;
        this.f337325d = d12;
        this.f337326e = aVar;
        this.f337327f = linkedHashMap;
        this.f337328g = aVar2;
        this.f337329h = aVar2;
    }

    @Override // com.avito.beduin.v2.handler.flow.actions.b
    @k
    public final Y41.a<dU0.f> c() {
        return this.f337329h;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f337322a == gVar.f337322a && this.f337323b == gVar.f337323b && this.f337324c == gVar.f337324c && this.f337325d.equals(gVar.f337325d) && this.f337326e.equals(gVar.f337326e) && L.f(this.f337327f, gVar.f337327f) && this.f337328g.equals(gVar.f337328g);
    }

    public final int hashCode() {
        int iH2 = r.h((this.f337325d.hashCode() + ((this.f337324c.hashCode() + ((this.f337323b.hashCode() + (this.f337322a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f337326e);
        LinkedHashMap linkedHashMap = this.f337327f;
        return this.f337328g.hashCode() + ((iH2 + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowBottomSheetInteraction(height=");
        sb2.append(this.f337322a);
        sb2.append(", modalSize=");
        sb2.append(this.f337323b);
        sb2.append(", contentPaddings=");
        sb2.append(this.f337324c);
        sb2.append(", renderState=");
        sb2.append(this.f337325d);
        sb2.append(", onShow=");
        sb2.append(this.f337326e);
        sb2.append(", metaInfo=");
        sb2.append(this.f337327f);
        sb2.append(", onDismiss=");
        return r.v(sb2, this.f337328g, ')');
    }
}
