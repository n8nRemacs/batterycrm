package com.yandex.div2;

import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import com.yandex.div2.AbstractC38548s0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivAnimation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/b;", "d", "Name", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class DivAnimation implements com.yandex.div.json.b {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final d f371255h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f371256i = com.google.firebase.components.g.i(300, com.yandex.div.json.expressions.b.f370552a);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivAnimationInterpolator> f371257j = b.a.a(DivAnimationInterpolator.SPRING);

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f371258k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371259l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371260m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final C38364h f371261n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final C38491p f371262o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final C38364h f371263p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, DivAnimation> f371264q;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f371265a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Double> f371266b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivAnimationInterpolator> f371267c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAnimation> f371268d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Name> f371269e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f371270f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Double> f371271g;

    /* compiled from: DivAnimation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivAnimation$Name;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Name {
        FADE("fade"),
        TRANSLATE("translate"),
        SCALE("scale"),
        NATIVE("native"),
        SET("set"),
        NO_ANIMATION("no_animation");


        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f371272c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Y41.l<String, Name> f371273d = a.f371282l;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f371281b;

        /* compiled from: DivAnimation.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivAnimation$Name;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, Name> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f371282l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final Name invoke(String str) {
                String str2 = str;
                Name name = Name.FADE;
                if (str2.equals("fade")) {
                    return name;
                }
                Name name2 = Name.TRANSLATE;
                if (str2.equals("translate")) {
                    return name2;
                }
                Name name3 = Name.SCALE;
                if (str2.equals("scale")) {
                    return name3;
                }
                Name name4 = Name.NATIVE;
                if (str2.equals("native")) {
                    return name4;
                }
                Name name5 = Name.SET;
                if (str2.equals("set")) {
                    return name5;
                }
                Name name6 = Name.NO_ANIMATION;
                if (str2.equals("no_animation")) {
                    return name6;
                }
                return null;
            }
        }

        /* compiled from: DivAnimation.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivAnimation$Name$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        Name(String str) {
            this.f371281b = str;
        }
    }

    /* compiled from: DivAnimation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivAnimation;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivAnimation;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, DivAnimation> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f371283l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final DivAnimation invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            DivAnimation.f371255h.getClass();
            com.yandex.div.json.i f370579a = eVar2.getF370579a();
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            C38364h c38364h = DivAnimation.f371261n;
            com.yandex.div.json.expressions.b<Long> bVar = DivAnimation.f371256i;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject2, "duration", lVar, c38364h, f370579a, bVar, dVar);
            com.yandex.div.json.expressions.b<Long> bVar2 = bVarI == null ? bVar : bVarI;
            Y41.l<Number, Double> lVar2 = com.yandex.div.internal.parser.y.f370150d;
            E.c cVar = com.yandex.div.internal.parser.E.f370134d;
            C38106b c38106b = C38107c.f370139a;
            com.yandex.div.json.expressions.b bVarI2 = C38107c.i(jSONObject2, "end_value", lVar2, c38106b, f370579a, null, cVar);
            DivAnimationInterpolator.f371286c.getClass();
            Y41.l<String, DivAnimationInterpolator> lVar3 = DivAnimationInterpolator.f371287d;
            com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVar3 = DivAnimation.f371257j;
            com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVarI3 = C38107c.i(jSONObject2, "interpolator", lVar3, c38106b, f370579a, bVar3, DivAnimation.f371259l);
            com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVar4 = bVarI3 == null ? bVar3 : bVarI3;
            List listK = C38107c.k(jSONObject2, "items", DivAnimation.f371264q, DivAnimation.f371262o, f370579a, eVar2);
            Name.f371272c.getClass();
            com.yandex.div.json.expressions.b bVarC = C38107c.c(jSONObject2, "name", Name.f371273d, c38106b, f370579a, DivAnimation.f371260m);
            AbstractC38548s0.f376579a.getClass();
            C38364h c38364h2 = DivAnimation.f371263p;
            com.yandex.div.json.expressions.b<Long> bVar5 = DivAnimation.f371258k;
            com.yandex.div.json.expressions.b<Long> bVarI4 = C38107c.i(jSONObject2, "start_delay", lVar, c38364h2, f370579a, bVar5, dVar);
            if (bVarI4 != null) {
                bVar5 = bVarI4;
            }
            return new DivAnimation(bVar2, bVarI2, bVar4, listK, bVarC, bVar5, C38107c.i(jSONObject2, "start_value", lVar2, c38106b, f370579a, null, cVar));
        }
    }

    /* compiled from: DivAnimation.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f371284l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
        }
    }

    /* compiled from: DivAnimation.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f371285l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Name);
        }
    }

    /* compiled from: DivAnimation.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/yandex/div2/DivAnimation$d;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "DURATION_VALIDATOR", "Lcom/yandex/div2/DivAnimationInterpolator;", "INTERPOLATOR_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAnimation;", "ITEMS_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/s0$d;", "REPEAT_DEFAULT_VALUE", "Lcom/yandex/div2/s0$d;", "START_DELAY_DEFAULT_VALUE", "START_DELAY_TEMPLATE_VALIDATOR", "START_DELAY_VALIDATOR", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_INTERPOLATOR", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAnimation$Name;", "TYPE_HELPER_NAME", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    static {
        C42822w c42822w = null;
        f371255h = new d(c42822w);
        new C38442l3();
        new AbstractC38548s0.d(c42822w);
        f371258k = b.a.a(0L);
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAnimationInterpolator.values());
        b bVar = b.f371284l;
        aVar.getClass();
        f371259l = new com.yandex.div.internal.parser.C(bVar, objC);
        f371260m = new com.yandex.div.internal.parser.C(c.f371285l, C42756l.C(Name.values()));
        f371261n = new C38364h(25);
        f371262o = new C38491p(6);
        f371263p = new C38364h(26);
        f371264q = a.f371283l;
    }

    @C21.b
    public DivAnimation(@Y61.k com.yandex.div.json.expressions.b bVar, @Y61.l com.yandex.div.json.expressions.b bVar2, @Y61.k com.yandex.div.json.expressions.b bVar3, @Y61.l List list, @Y61.k com.yandex.div.json.expressions.b bVar4, @Y61.k com.yandex.div.json.expressions.b bVar5, @Y61.l com.yandex.div.json.expressions.b bVar6) {
        this.f371265a = bVar;
        this.f371266b = bVar2;
        this.f371267c = bVar3;
        this.f371268d = list;
        this.f371269e = bVar4;
        this.f371270f = bVar5;
        this.f371271g = bVar6;
    }

    public /* synthetic */ DivAnimation(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, List list, com.yandex.div.json.expressions.b bVar4, AbstractC38548s0 abstractC38548s0, com.yandex.div.json.expressions.b bVar5, com.yandex.div.json.expressions.b bVar6, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? f371256i : bVar, (i12 & 2) != 0 ? null : bVar2, (i12 & 4) != 0 ? f371257j : bVar3, (i12 & 8) != 0 ? null : list, bVar4, (i12 & 64) != 0 ? f371258k : bVar5, (i12 & 128) != 0 ? null : bVar6);
    }
}
