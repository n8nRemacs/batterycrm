package com.yandex.div2;

import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.json.expressions.b;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivDimensionTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/Q0;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/O0;", "e", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class Q0 implements com.yandex.div.json.b, com.yandex.div.json.c<O0> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final e f373459c = new e(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivSizeUnit> f373460d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f373461e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivSizeUnit>> f373462f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> f373463g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, Q0> f373464h;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivSizeUnit>> f373465a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Double>> f373466b;

    /* compiled from: DivDimensionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/Q0;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/Q0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, Q0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f373467l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Q0 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new Q0(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivDimensionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f373468l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivDimensionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivSizeUnit;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivSizeUnit>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f373469l = new c();

        public c() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivSizeUnit> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivSizeUnit.f371957c.getClass();
            Y41.l<String, DivSizeUnit> lVar = DivSizeUnit.f371958d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivSizeUnit> bVar = Q0.f373460d;
            com.yandex.div.json.expressions.b<DivSizeUnit> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, Q0.f373461e);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivDimensionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f373470l = new d();

        public d() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Double> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.c(jSONObject, str, com.yandex.div.internal.parser.y.f370150d, C38107c.f370139a, eVar.getF370579a(), com.yandex.div.internal.parser.E.f370134d);
        }
    }

    /* compiled from: DivDimensionTemplate.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/Q0$e;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div/json/expressions/b;", "UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e {
        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
        }
    }

    static {
        b.a aVar = com.yandex.div.json.expressions.b.f370552a;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        aVar.getClass();
        f373460d = b.a.a(divSizeUnit);
        D.a aVar2 = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivSizeUnit.values());
        b bVar = b.f373468l;
        aVar2.getClass();
        f373461e = new com.yandex.div.internal.parser.C(bVar, objC);
        f373462f = c.f373469l;
        f373463g = d.f373470l;
        f373464h = a.f373467l;
    }

    public Q0(com.yandex.div.json.e eVar, Q0 q02, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        q02 = (i12 & 2) != 0 ? null : q02;
        z12 = (i12 & 4) != 0 ? false : z12;
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        H21.a<com.yandex.div.json.expressions.b<DivSizeUnit>> aVar = q02 == null ? null : q02.f373465a;
        DivSizeUnit.f371957c.getClass();
        Y41.l<String, DivSizeUnit> lVar = DivSizeUnit.f371958d;
        C38106b c38106b = C38107c.f370139a;
        this.f373465a = com.yandex.div.internal.parser.s.i(jSONObject, "unit", z12, aVar, lVar, c38106b, f370579a, f373461e);
        this.f373466b = com.yandex.div.internal.parser.s.d(jSONObject, "value", z12, q02 != null ? q02.f373466b : null, com.yandex.div.internal.parser.y.f370150d, c38106b, f370579a, com.yandex.div.internal.parser.E.f370134d);
    }

    @Override // com.yandex.div.json.c
    public final com.yandex.div.json.b a(com.yandex.div.json.e eVar, JSONObject jSONObject) {
        com.yandex.div.json.expressions.b<DivSizeUnit> bVar = (com.yandex.div.json.expressions.b) H21.b.d(this.f373465a, eVar, "unit", jSONObject, f373462f);
        if (bVar == null) {
            bVar = f373460d;
        }
        return new O0(bVar, (com.yandex.div.json.expressions.b) H21.b.b(this.f373466b, eVar, "value", jSONObject, f373463g));
    }
}
