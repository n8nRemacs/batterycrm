package com.yandex.div2;

import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivStroke.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/z6;", "Lcom/yandex/div/json/b;", "c", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.z6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38656z6 implements com.yandex.div.json.b {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final c f377427d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivSizeUnit> f377428e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f377429f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f377430g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final C38507q6 f377431h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, C38656z6> f377432i;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Integer> f377433a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivSizeUnit> f377434b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f377435c;

    /* compiled from: DivStroke.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/z6;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/z6;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.z6$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38656z6> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f377436l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38656z6 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            C38656z6.f377427d.getClass();
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            Y41.l<Object, Integer> lVar = com.yandex.div.internal.parser.y.f370147a;
            E.b bVar = com.yandex.div.internal.parser.E.f370136f;
            C38106b c38106b = C38107c.f370139a;
            com.yandex.div.json.expressions.b bVarC = C38107c.c(jSONObject2, "color", lVar, c38106b, f370579a, bVar);
            DivSizeUnit.f371957c.getClass();
            Y41.l<String, DivSizeUnit> lVar2 = DivSizeUnit.f371958d;
            com.yandex.div.json.expressions.b<DivSizeUnit> bVar2 = C38656z6.f377428e;
            com.yandex.div.json.expressions.b<DivSizeUnit> bVarI = C38107c.i(jSONObject2, "unit", lVar2, c38106b, f370579a, bVar2, C38656z6.f377430g);
            if (bVarI != null) {
                bVar2 = bVarI;
            }
            Y41.l<Number, Long> lVar3 = com.yandex.div.internal.parser.y.f370151e;
            C38507q6 c38507q6 = C38656z6.f377431h;
            com.yandex.div.json.expressions.b<Long> bVar3 = C38656z6.f377429f;
            com.yandex.div.json.expressions.b<Long> bVarI2 = C38107c.i(jSONObject2, "width", lVar3, c38507q6, f370579a, bVar3, com.yandex.div.internal.parser.E.f370132b);
            if (bVarI2 != null) {
                bVar3 = bVarI2;
            }
            return new C38656z6(bVarC, bVar2, bVar3);
        }
    }

    /* compiled from: DivStroke.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.z6$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f377437l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivStroke.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/yandex/div2/z6$c;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div/json/expressions/b;", "UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/F;", "WIDTH_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "WIDTH_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.z6$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        b.a aVar = com.yandex.div.json.expressions.b.f370552a;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        aVar.getClass();
        f377428e = b.a.a(divSizeUnit);
        f377429f = b.a.a(1L);
        D.a aVar2 = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivSizeUnit.values());
        b bVar = b.f377437l;
        aVar2.getClass();
        f377430g = new com.yandex.div.internal.parser.C(bVar, objC);
        f377431h = new C38507q6(5);
        f377432i = a.f377436l;
    }

    @C21.b
    public C38656z6(@Y61.k com.yandex.div.json.expressions.b<Integer> bVar, @Y61.k com.yandex.div.json.expressions.b<DivSizeUnit> bVar2, @Y61.k com.yandex.div.json.expressions.b<Long> bVar3) {
        this.f377433a = bVar;
        this.f377434b = bVar2;
        this.f377435c = bVar3;
    }

    public /* synthetic */ C38656z6(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, int i12, C42822w c42822w) {
        this(bVar, (i12 & 2) != 0 ? f377428e : bVar2, (i12 & 4) != 0 ? f377429f : bVar3);
    }
}
