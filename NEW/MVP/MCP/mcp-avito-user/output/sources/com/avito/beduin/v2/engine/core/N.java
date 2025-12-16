package com.avito.beduin.v2.engine.core;

import kotlin.Metadata;

/* compiled from: Value.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/engine/core/N;", "", "a", "c", "d", "e", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface N {

    /* compiled from: Value.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/core/N$a;", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a();

        @Y61.k
        /* renamed from: b */
        M getF336602b();

        void dispose();

        /* renamed from: i */
        boolean getF336603c();
    }

    /* compiled from: Value.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: Value.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/core/N$c;", "Lcom/avito/beduin/v2/engine/core/N$a;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public Object f336597a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public M f336598b;

        public c(@Y61.k N n12, @Y61.k M m12) {
            this.f336597a = n12;
            this.f336598b = m12;
        }

        @Override // com.avito.beduin.v2.engine.core.N.a
        public final void a() {
            this.f336597a = null;
            this.f336598b = null;
        }

        @Override // com.avito.beduin.v2.engine.core.N.a
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final M getF336602b() {
            return this.f336598b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.beduin.v2.engine.core.N, java.lang.Object] */
        @Override // com.avito.beduin.v2.engine.core.N.a
        public final void dispose() {
            ?? r02 = this.f336597a;
            M m12 = this.f336598b;
            if (r02 != 0 && m12 != null) {
                r02.m(m12);
            }
            a();
        }

        @Override // com.avito.beduin.v2.engine.core.N.a
        /* renamed from: i */
        public final boolean getF336603c() {
            return this.f336597a == null || this.f336598b == null;
        }
    }

    /* compiled from: Value.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/core/N$e;", "Lcom/avito/beduin/v2/engine/core/N$a;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Object f336601a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final M f336602b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f336603c;

        public e(@Y61.k N n12, @Y61.k M m12) {
            this.f336601a = n12;
            this.f336602b = m12;
        }

        @Override // com.avito.beduin.v2.engine.core.N.a
        public final void a() {
            this.f336603c = true;
        }

        @Override // com.avito.beduin.v2.engine.core.N.a
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final M getF336602b() {
            return this.f336602b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.beduin.v2.engine.core.N, java.lang.Object] */
        @Override // com.avito.beduin.v2.engine.core.N.a
        public final void dispose() {
            this.f336601a.m(this.f336602b);
            this.f336603c = true;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f336601a.equals(eVar.f336601a) && this.f336602b.equals(eVar.f336602b);
        }

        public final int hashCode() {
            return this.f336602b.hashCode() + (this.f336601a.hashCode() * 31);
        }

        @Override // com.avito.beduin.v2.engine.core.N.a
        /* renamed from: i, reason: from getter */
        public final boolean getF336603c() {
            return this.f336603c;
        }

        @Y61.k
        public final String toString() {
            return "WeakBond(source=" + this.f336601a + ", reader=" + this.f336602b + ')';
        }
    }

    @Y61.k
    a f(@Y61.k M m12, boolean z12);

    void m(@Y61.k M m12);

    /* compiled from: Value.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/core/N$d;", "Lcom/avito/beduin/v2/engine/core/N$a;", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f336599a = new d();

        /* renamed from: b, reason: collision with root package name */
        public static final boolean f336600b = true;

        @Override // com.avito.beduin.v2.engine.core.N.a
        @Y61.k
        /* renamed from: b */
        public final M getF336602b() {
            throw new kotlin.G("An operation is not implemented: Not yet implemented");
        }

        @Override // com.avito.beduin.v2.engine.core.N.a
        /* renamed from: i */
        public final boolean getF336603c() {
            return f336600b;
        }

        @Override // com.avito.beduin.v2.engine.core.N.a
        public final void a() {
        }

        @Override // com.avito.beduin.v2.engine.core.N.a
        public final void dispose() {
        }
    }
}
