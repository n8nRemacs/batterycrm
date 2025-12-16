package com.avito.beduin.v2.engine;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Payload.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/u;", "Lcom/avito/beduin/v2/engine/B;", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class u implements B {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f336906c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f336907a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<?> f336908b;

    /* compiled from: Payload.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/u$a;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public u(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        this.f336907a = str;
        this.f336908b = fVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return L.f(this.f336907a, uVar.f336907a) && L.f(this.f336908b, uVar.f336908b);
    }

    public final int hashCode() {
        return this.f336908b.hashCode() + (this.f336907a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "InternalPayload(targetId=" + this.f336907a + ", field=" + this.f336908b + ')';
    }
}
