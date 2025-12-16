package com.avito.beduin.v2.handler.flow.processor;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.handler.flow.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HandlersResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/beduin/v2/handler/flow/processor/a;", "", "<init>", "()V", "a", "b", "Lcom/avito/beduin/v2/handler/flow/processor/a$a;", "Lcom/avito/beduin/v2/handler/flow/processor/a$b;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class a {

    /* compiled from: HandlersResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/handler/flow/processor/a$a;", "Lcom/avito/beduin/v2/handler/flow/processor/a;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.handler.flow.processor.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10444a extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final dU0.f f337169a;

        public C10444a(@k dU0.f fVar) {
            super(null);
            this.f337169a = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10444a) && L.f(this.f337169a, ((C10444a) obj).f337169a);
        }

        public final int hashCode() {
            return this.f337169a.hashCode();
        }

        @k
        public final String toString() {
            return "PlatformInteraction(value=" + this.f337169a + ')';
        }
    }

    /* compiled from: HandlersResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/handler/flow/processor/a$b;", "Lcom/avito/beduin/v2/handler/flow/processor/a;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final m f337170a;

        public b(@k m mVar) {
            super(null);
            this.f337170a = mVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f337170a, ((b) obj).f337170a);
        }

        public final int hashCode() {
            return this.f337170a.hashCode();
        }

        @k
        public final String toString() {
            return "State(value=" + this.f337170a + ')';
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
