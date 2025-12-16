package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.json.expressions.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivShadow.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/E5;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class E5 implements com.yandex.div.json.b {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final b f372240e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f372241f = C38492p0.a(0.19d, com.yandex.div.json.expressions.b.f370552a);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f372242g = b.a.a(2L);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Integer> f372243h = b.a.a(0);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final C38403j5 f372244i = new C38403j5(17);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final C38403j5 f372245j = new C38403j5(18);

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, E5> f372246k = a.f372251l;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> f372247a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f372248b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Integer> f372249c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final D4 f372250d;

    /* compiled from: DivShadow.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/E5;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/E5;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, E5> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f372251l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final E5 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            E5.f372240e.getClass();
            com.yandex.div.json.i f370579a = eVar2.getF370579a();
            Y41.l<Number, Double> lVar = com.yandex.div.internal.parser.y.f370150d;
            C38403j5 c38403j5 = E5.f372244i;
            com.yandex.div.json.expressions.b<Double> bVar = E5.f372241f;
            com.yandex.div.json.expressions.b<Double> bVarI = C38107c.i(jSONObject2, "alpha", lVar, c38403j5, f370579a, bVar, com.yandex.div.internal.parser.E.f370134d);
            if (bVarI != null) {
                bVar = bVarI;
            }
            Y41.l<Number, Long> lVar2 = com.yandex.div.internal.parser.y.f370151e;
            C38403j5 c38403j52 = E5.f372245j;
            com.yandex.div.json.expressions.b<Long> bVar2 = E5.f372242g;
            com.yandex.div.json.expressions.b<Long> bVarI2 = C38107c.i(jSONObject2, "blur", lVar2, c38403j52, f370579a, bVar2, com.yandex.div.internal.parser.E.f370132b);
            if (bVarI2 != null) {
                bVar2 = bVarI2;
            }
            Y41.l<Object, Integer> lVar3 = com.yandex.div.internal.parser.y.f370147a;
            com.yandex.div.json.expressions.b<Integer> bVar3 = E5.f372243h;
            com.yandex.div.json.expressions.b<Integer> bVarI3 = C38107c.i(jSONObject2, "color", lVar3, C38107c.f370139a, f370579a, bVar3, com.yandex.div.internal.parser.E.f370136f);
            if (bVarI3 != null) {
                bVar3 = bVarI3;
            }
            D4.f371168c.getClass();
            return new E5(bVar, bVar2, bVar3, (D4) C38107c.b(jSONObject2, "offset", D4.f371169d, eVar2));
        }
    }

    /* compiled from: DivShadow.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/yandex/div2/E5$b;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "ALPHA_VALIDATOR", "", "BLUR_DEFAULT_VALUE", "BLUR_TEMPLATE_VALIDATOR", "BLUR_VALIDATOR", "", "COLOR_DEFAULT_VALUE", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @C21.b
    public E5(@Y61.k com.yandex.div.json.expressions.b<Double> bVar, @Y61.k com.yandex.div.json.expressions.b<Long> bVar2, @Y61.k com.yandex.div.json.expressions.b<Integer> bVar3, @Y61.k D4 d42) {
        this.f372247a = bVar;
        this.f372248b = bVar2;
        this.f372249c = bVar3;
        this.f372250d = d42;
    }

    public /* synthetic */ E5(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, D4 d42, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? f372241f : bVar, (i12 & 2) != 0 ? f372242g : bVar2, (i12 & 4) != 0 ? f372243h : bVar3, d42);
    }
}
