package androidx.compose.ui.tooling.animation;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.tooling.animation.G;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PreviewAnimationClock.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/animation/u;", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f42793a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f42794b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f42795c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f42796d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f42797e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f42798f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet<G> f42799g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Object f42800h;

    /* compiled from: PreviewAnimationClock.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f42801l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void b(String str) {
        G.f42768a.getClass();
        G gA2 = G.a.a(str);
        if (gA2 != null) {
            this.f42799g.add(gA2);
        }
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final LinkedHashMap getF42796d() {
        return this.f42796d;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final LinkedHashMap getF42798f() {
        return this.f42798f;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final LinkedHashMap getF42797e() {
        return this.f42797e;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final LinkedHashMap getF42794b() {
        return this.f42794b;
    }

    public u(@Y61.k Y41.a<G0> aVar) {
        this.f42793a = aVar;
        this.f42794b = new LinkedHashMap();
        this.f42795c = new LinkedHashMap();
        this.f42796d = new LinkedHashMap();
        this.f42797e = new LinkedHashMap();
        this.f42798f = new LinkedHashMap();
        this.f42799g = new LinkedHashSet<>();
        new LinkedHashSet();
    }

    public /* synthetic */ u(Y41.a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? a.f42801l : aVar);
    }
}
