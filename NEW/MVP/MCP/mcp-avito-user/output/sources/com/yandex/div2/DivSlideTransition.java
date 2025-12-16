package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivSlideTransition.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/DivSlideTransition;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div2/c8;", "d", "Edge", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class DivSlideTransition implements com.yandex.div.json.b, InterfaceC38280c8 {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final d f371965f = new d(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f371966g = com.google.firebase.components.g.i(200, com.yandex.div.json.expressions.b.f370552a);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Edge> f371967h = b.a.a(Edge.BOTTOM);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivAnimationInterpolator> f371968i = b.a.a(DivAnimationInterpolator.EASE_IN_OUT);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f371969j = b.a.a(0L);

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371970k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371971l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final C38403j5 f371972m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final C38403j5 f371973n;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final O0 f371974a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f371975b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Edge> f371976c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivAnimationInterpolator> f371977d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f371978e;

    /* compiled from: DivSlideTransition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivSlideTransition$Edge;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Edge {
        LEFT("left"),
        TOP("top"),
        RIGHT("right"),
        BOTTOM("bottom");


        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f371979c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Y41.l<String, Edge> f371980d = a.f371987l;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f371986b;

        /* compiled from: DivSlideTransition.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivSlideTransition$Edge;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, Edge> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f371987l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final Edge invoke(String str) {
                String str2 = str;
                Edge edge = Edge.LEFT;
                if (str2.equals("left")) {
                    return edge;
                }
                Edge edge2 = Edge.TOP;
                if (str2.equals("top")) {
                    return edge2;
                }
                Edge edge3 = Edge.RIGHT;
                if (str2.equals("right")) {
                    return edge3;
                }
                Edge edge4 = Edge.BOTTOM;
                if (str2.equals("bottom")) {
                    return edge4;
                }
                return null;
            }
        }

        /* compiled from: DivSlideTransition.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivSlideTransition$Edge$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        Edge(String str) {
            this.f371986b = str;
        }
    }

    /* compiled from: DivSlideTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivSlideTransition;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivSlideTransition;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, DivSlideTransition> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f371988l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final DivSlideTransition invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            DivSlideTransition.f371965f.getClass();
            return d.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivSlideTransition.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f371989l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Edge);
        }
    }

    /* compiled from: DivSlideTransition.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f371990l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
        }
    }

    /* compiled from: DivSlideTransition.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/div2/DivSlideTransition$d;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "DURATION_VALIDATOR", "Lcom/yandex/div2/DivSlideTransition$Edge;", "EDGE_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimationInterpolator;", "INTERPOLATOR_DEFAULT_VALUE", "START_DELAY_DEFAULT_VALUE", "START_DELAY_TEMPLATE_VALIDATOR", "START_DELAY_VALIDATOR", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_EDGE", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_INTERPOLATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static DivSlideTransition a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            O0.f373039c.getClass();
            O0 o02 = (O0) C38107c.g(jSONObject, "distance", O0.f373042f, f370579a, eVar);
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            C38403j5 c38403j5 = DivSlideTransition.f371972m;
            com.yandex.div.json.expressions.b<Long> bVar = DivSlideTransition.f371966g;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject, "duration", lVar, c38403j5, f370579a, bVar, dVar);
            if (bVarI != null) {
                bVar = bVarI;
            }
            Edge.f371979c.getClass();
            Y41.l<String, Edge> lVar2 = Edge.f371980d;
            com.yandex.div.json.expressions.b<Edge> bVar2 = DivSlideTransition.f371967h;
            com.yandex.div.internal.parser.C c12 = DivSlideTransition.f371970k;
            C38106b c38106b = C38107c.f370139a;
            com.yandex.div.json.expressions.b<Edge> bVarI2 = C38107c.i(jSONObject, "edge", lVar2, c38106b, f370579a, bVar2, c12);
            if (bVarI2 != null) {
                bVar2 = bVarI2;
            }
            DivAnimationInterpolator.f371286c.getClass();
            Y41.l<String, DivAnimationInterpolator> lVar3 = DivAnimationInterpolator.f371287d;
            com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVar3 = DivSlideTransition.f371968i;
            com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVarI3 = C38107c.i(jSONObject, "interpolator", lVar3, c38106b, f370579a, bVar3, DivSlideTransition.f371971l);
            if (bVarI3 != null) {
                bVar3 = bVarI3;
            }
            C38403j5 c38403j52 = DivSlideTransition.f371973n;
            com.yandex.div.json.expressions.b<Long> bVar4 = DivSlideTransition.f371969j;
            com.yandex.div.json.expressions.b<Long> bVarI4 = C38107c.i(jSONObject, "start_delay", lVar, c38403j52, f370579a, bVar4, dVar);
            return new DivSlideTransition(o02, bVar, bVar2, bVar3, bVarI4 == null ? bVar4 : bVarI4);
        }

        public d() {
        }
    }

    static {
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(Edge.values());
        b bVar = b.f371989l;
        aVar.getClass();
        f371970k = new com.yandex.div.internal.parser.C(bVar, objC);
        f371971l = new com.yandex.div.internal.parser.C(c.f371990l, C42756l.C(DivAnimationInterpolator.values()));
        f371972m = new C38403j5(23);
        f371973n = new C38403j5(24);
        int i12 = a.f371988l;
    }

    @C21.b
    public DivSlideTransition() {
        this(null, null, null, null, null, 31, null);
    }

    @C21.b
    public DivSlideTransition(@Y61.l O0 o02, @Y61.k com.yandex.div.json.expressions.b<Long> bVar, @Y61.k com.yandex.div.json.expressions.b<Edge> bVar2, @Y61.k com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVar3, @Y61.k com.yandex.div.json.expressions.b<Long> bVar4) {
        this.f371974a = o02;
        this.f371975b = bVar;
        this.f371976c = bVar2;
        this.f371977d = bVar3;
        this.f371978e = bVar4;
    }

    public /* synthetic */ DivSlideTransition(O0 o02, com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, com.yandex.div.json.expressions.b bVar4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : o02, (i12 & 2) != 0 ? f371966g : bVar, (i12 & 4) != 0 ? f371967h : bVar2, (i12 & 8) != 0 ? f371968i : bVar3, (i12 & 16) != 0 ? f371969j : bVar4);
    }
}
