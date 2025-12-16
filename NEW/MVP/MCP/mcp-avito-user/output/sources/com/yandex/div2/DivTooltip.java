package com.yandex.div2;

import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivTooltip.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivTooltip;", "Lcom/yandex/div/json/b;", "c", "Position", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class DivTooltip implements com.yandex.div.json.b {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final c f372130h = new c(null);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f372131i = com.google.firebase.components.g.i(5000, com.yandex.div.json.expressions.b.f370552a);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f372132j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final D7 f372133k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final D7 f372134l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, DivTooltip> f372135m;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final DivAnimation f372136a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final DivAnimation f372137b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final AbstractC38330g f372138c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f372139d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final String f372140e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final D4 f372141f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Position> f372142g;

    /* compiled from: DivTooltip.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivTooltip$Position;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Position {
        LEFT("left"),
        TOP_LEFT("top-left"),
        TOP("top"),
        TOP_RIGHT("top-right"),
        RIGHT("right"),
        BOTTOM_RIGHT("bottom-right"),
        BOTTOM("bottom"),
        BOTTOM_LEFT("bottom-left");


        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f372143c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Y41.l<String, Position> f372144d = a.f372155l;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f372154b;

        /* compiled from: DivTooltip.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivTooltip$Position;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, Position> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f372155l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final Position invoke(String str) {
                String str2 = str;
                Position position = Position.LEFT;
                if (str2.equals("left")) {
                    return position;
                }
                Position position2 = Position.TOP_LEFT;
                if (str2.equals("top-left")) {
                    return position2;
                }
                Position position3 = Position.TOP;
                if (str2.equals("top")) {
                    return position3;
                }
                Position position4 = Position.TOP_RIGHT;
                if (str2.equals("top-right")) {
                    return position4;
                }
                Position position5 = Position.RIGHT;
                if (str2.equals("right")) {
                    return position5;
                }
                Position position6 = Position.BOTTOM_RIGHT;
                if (str2.equals("bottom-right")) {
                    return position6;
                }
                Position position7 = Position.BOTTOM;
                if (str2.equals("bottom")) {
                    return position7;
                }
                Position position8 = Position.BOTTOM_LEFT;
                if (str2.equals("bottom-left")) {
                    return position8;
                }
                return null;
            }
        }

        /* compiled from: DivTooltip.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivTooltip$Position$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        Position(String str) {
            this.f372154b = str;
        }
    }

    /* compiled from: DivTooltip.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivTooltip;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivTooltip;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, DivTooltip> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f372156l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final DivTooltip invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            DivTooltip.f372130h.getClass();
            com.yandex.div.json.i iVarB = eVar2.getF370579a();
            DivAnimation.f371255h.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, DivAnimation> pVar = DivAnimation.f371264q;
            DivAnimation divAnimation = (DivAnimation) C38107c.g(jSONObject2, "animation_in", pVar, iVarB, eVar2);
            DivAnimation divAnimation2 = (DivAnimation) C38107c.g(jSONObject2, "animation_out", pVar, iVarB, eVar2);
            AbstractC38330g.f375012a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38330g> pVar2 = AbstractC38330g.f375013b;
            C38106b c38106b = C38107c.f370139a;
            AbstractC38330g abstractC38330g = (AbstractC38330g) C38107c.b(jSONObject2, "div", pVar2, eVar2);
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            D7 d72 = DivTooltip.f372133k;
            com.yandex.div.json.expressions.b<Long> bVar = DivTooltip.f372131i;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject2, "duration", lVar, d72, iVarB, bVar, com.yandex.div.internal.parser.E.f370132b);
            if (bVarI != null) {
                bVar = bVarI;
            }
            String str = (String) C38107c.a(jSONObject2, "id", C38107c.f370141c, DivTooltip.f372134l);
            D4.f371168c.getClass();
            D4 d42 = (D4) C38107c.g(jSONObject2, "offset", D4.f371169d, iVarB, eVar2);
            Position.f372143c.getClass();
            return new DivTooltip(divAnimation, divAnimation2, abstractC38330g, bVar, str, d42, C38107c.c(jSONObject2, "position", Position.f372144d, c38106b, iVarB, DivTooltip.f372132j));
        }
    }

    /* compiled from: DivTooltip.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f372157l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Position);
        }
    }

    /* compiled from: DivTooltip.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div2/DivTooltip$c;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "DURATION_VALIDATOR", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivTooltip$Position;", "TYPE_HELPER_POSITION", "Lcom/yandex/div/internal/parser/D;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(Position.values());
        b bVar = b.f372157l;
        aVar.getClass();
        f372132j = new com.yandex.div.internal.parser.C(bVar, objC);
        f372133k = new D7(14);
        f372134l = new D7(15);
        f372135m = a.f372156l;
    }

    @C21.b
    public DivTooltip(@Y61.l DivAnimation divAnimation, @Y61.l DivAnimation divAnimation2, @Y61.k AbstractC38330g abstractC38330g, @Y61.k com.yandex.div.json.expressions.b<Long> bVar, @Y61.k String str, @Y61.l D4 d42, @Y61.k com.yandex.div.json.expressions.b<Position> bVar2) {
        this.f372136a = divAnimation;
        this.f372137b = divAnimation2;
        this.f372138c = abstractC38330g;
        this.f372139d = bVar;
        this.f372140e = str;
        this.f372141f = d42;
        this.f372142g = bVar2;
    }

    public /* synthetic */ DivTooltip(DivAnimation divAnimation, DivAnimation divAnimation2, AbstractC38330g abstractC38330g, com.yandex.div.json.expressions.b bVar, String str, D4 d42, com.yandex.div.json.expressions.b bVar2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : divAnimation, (i12 & 2) != 0 ? null : divAnimation2, abstractC38330g, (i12 & 8) != 0 ? f372131i : bVar, str, (i12 & 32) != 0 ? null : d42, bVar2);
    }
}
