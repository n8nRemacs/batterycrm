package com.avito.beduin.v2.interaction.navigation.flow;

import com.avito.beduin.v2.engine.D;
import com.avito.beduin.v2.interaction.navigation.flow.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Screen.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/t;", "", "a", "b", "c", "Lcom/avito/beduin/v2/interaction/navigation/flow/t$b;", "Lcom/avito/beduin/v2/interaction/navigation/flow/t$c;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class t {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f337543c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f337544a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final D f337545b;

    /* compiled from: Screen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/t$a;", "", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Screen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/t$b;", "Lcom/avito/beduin/v2/interaction/navigation/flow/t;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends t {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final u.c f337546d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final D f337547e;

        public b(@Y61.k u.c cVar, @Y61.k D d12) {
            super(cVar, d12, null);
            this.f337546d = cVar;
            this.f337547e = d12;
        }

        @Override // com.avito.beduin.v2.interaction.navigation.flow.t
        /* renamed from: a */
        public final u getF337544a() {
            return this.f337546d;
        }

        @Override // com.avito.beduin.v2.interaction.navigation.flow.t
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final D getF337545b() {
            return this.f337547e;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f337546d, bVar.f337546d) && L.f(this.f337547e, bVar.f337547e);
        }

        public final int hashCode() {
            return this.f337547e.hashCode() + (this.f337546d.f337552c.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "Named(key=" + this.f337546d + ", rendererState=" + this.f337547e + ')';
        }
    }

    /* compiled from: Screen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/t$c;", "Lcom/avito/beduin/v2/interaction/navigation/flow/t;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends t {

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final D f337548d;

        public c(@Y61.l D d12) {
            super(u.b.f337551c, d12, null);
            this.f337548d = d12;
        }

        @Override // com.avito.beduin.v2.interaction.navigation.flow.t
        @Y61.l
        /* renamed from: b, reason: from getter */
        public final D getF337545b() {
            return this.f337548d;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f337548d, ((c) obj).f337548d);
        }

        public final int hashCode() {
            D d12 = this.f337548d;
            if (d12 == null) {
                return 0;
            }
            return d12.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Root(rendererState=" + this.f337548d + ')';
        }
    }

    public t(u uVar, D d12, C42822w c42822w) {
        this.f337544a = uVar;
        this.f337545b = d12;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public u getF337544a() {
        return this.f337544a;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public D getF337545b() {
        return this.f337545b;
    }
}
