package kotlin;

import com.avito.beduin.v2.interaction.navigation.flow.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LeT/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "d", "LeT/c$a;", "LeT/c$b;", "LeT/c$c;", "LeT/c$d;", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eT.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC40048c extends com.avito.android.analytics.screens.mvi.q {

    /* compiled from: BeduinState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LeT/c$a;", "LeT/c;", "a", "b", "LeT/c$a$a;", "LeT/c$a$b;", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eT.c$a */
    public static abstract class a extends AbstractC40048c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final com.avito.beduin.v2.engine.n f395210b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.engine.D f395211c;

        /* compiled from: BeduinState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeT/c$a$a;", "LeT/c$a;", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: eT.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C11083a extends a {

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final com.avito.beduin.v2.engine.n f395212d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final com.avito.beduin.v2.engine.D f395213e;

            public C11083a(@Y61.l com.avito.beduin.v2.engine.n nVar, @Y61.k com.avito.beduin.v2.engine.D d12) {
                super(nVar, d12, null);
                this.f395212d = nVar;
                this.f395213e = d12;
            }

            @Override // kotlin.AbstractC40048c.a
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final com.avito.beduin.v2.engine.D getF395211c() {
                return this.f395213e;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C11083a)) {
                    return false;
                }
                C11083a c11083a = (C11083a) obj;
                return kotlin.jvm.internal.L.f(this.f395212d, c11083a.f395212d) && kotlin.jvm.internal.L.f(this.f395213e, c11083a.f395213e);
            }

            public final int hashCode() {
                com.avito.beduin.v2.engine.n nVar = this.f395212d;
                return this.f395213e.hashCode() + ((nVar == null ? 0 : nVar.hashCode()) * 31);
            }

            @Y61.k
            public final String toString() {
                return "V1(engineState=" + this.f395212d + ", rendererState=" + this.f395213e + ')';
            }
        }

        /* compiled from: BeduinState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeT/c$a$b;", "LeT/c$a;", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: eT.c$a$b */
        public static final /* data */ class b extends a {

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final com.avito.beduin.v2.engine.n f395214d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final C40049d f395215e;

            public b(@Y61.l com.avito.beduin.v2.engine.n nVar, @Y61.k C40049d c40049d) {
                super(nVar, c40049d.f395220a.get(u.b.f337551c), null);
                this.f395214d = nVar;
                this.f395215e = c40049d;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.L.f(this.f395214d, bVar.f395214d) && kotlin.jvm.internal.L.f(this.f395215e, bVar.f395215e);
            }

            public final int hashCode() {
                com.avito.beduin.v2.engine.n nVar = this.f395214d;
                return this.f395215e.f395220a.hashCode() + ((nVar == null ? 0 : nVar.hashCode()) * 31);
            }

            @Y61.k
            public final String toString() {
                return "V2(engineState=" + this.f395214d + ", screenContent=" + this.f395215e + ')';
            }
        }

        public a(com.avito.beduin.v2.engine.n nVar, com.avito.beduin.v2.engine.D d12, C42822w c42822w) {
            super(null);
            this.f395210b = nVar;
            this.f395211c = d12;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public com.avito.beduin.v2.engine.D getF395211c() {
            return this.f395211c;
        }
    }

    /* compiled from: BeduinState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeT/c$b;", "LeT/c;", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eT.c$b */
    public static final /* data */ class b extends AbstractC40048c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Throwable f395216b;

        public b(@Y61.k Throwable th2) {
            super(null);
            this.f395216b = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f395216b, ((b) obj).f395216b);
        }

        public final int hashCode() {
            return this.f395216b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(error="), this.f395216b, ')');
        }
    }

    /* compiled from: BeduinState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeT/c$c;", "LeT/c;", "<init>", "()V", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eT.c$c, reason: collision with other inner class name */
    public static final class C11084c extends AbstractC40048c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C11084c f395217b = new C11084c();

        public C11084c() {
            super(null);
        }
    }

    /* compiled from: BeduinState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeT/c$d;", "LeT/c;", "<init>", "()V", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eT.c$d */
    public static final class d extends AbstractC40048c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final d f395218b = new d();

        public d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC40048c(C42822w c42822w) {
        this();
    }

    public AbstractC40048c() {
    }
}
