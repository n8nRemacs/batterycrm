package com.yandex.div2;

import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.json.expressions.b;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivDimension.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/O0;", "Lcom/yandex/div/json/b;", "c", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class O0 implements com.yandex.div.json.b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final c f373039c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivSizeUnit> f373040d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f373041e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, O0> f373042f;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivSizeUnit> f373043a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> f373044b;

    /* compiled from: DivDimension.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/O0;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/O0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, O0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f373045l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final O0 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            O0.f373039c.getClass();
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            DivSizeUnit.f371957c.getClass();
            Y41.l<String, DivSizeUnit> lVar = DivSizeUnit.f371958d;
            com.yandex.div.json.expressions.b<DivSizeUnit> bVar = O0.f373040d;
            com.yandex.div.internal.parser.C c12 = O0.f373041e;
            C38106b c38106b = C38107c.f370139a;
            com.yandex.div.json.expressions.b<DivSizeUnit> bVarI = C38107c.i(jSONObject2, "unit", lVar, c38106b, f370579a, bVar, c12);
            if (bVarI != null) {
                bVar = bVarI;
            }
            return new O0(bVar, C38107c.c(jSONObject2, "value", com.yandex.div.internal.parser.y.f370150d, c38106b, f370579a, com.yandex.div.internal.parser.E.f370134d));
        }
    }

    /* compiled from: DivDimension.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f373046l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivDimension.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/O0$c;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div/json/expressions/b;", "UNIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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
        f373040d = b.a.a(divSizeUnit);
        D.a aVar2 = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivSizeUnit.values());
        b bVar = b.f373046l;
        aVar2.getClass();
        f373041e = new com.yandex.div.internal.parser.C(bVar, objC);
        f373042f = a.f373045l;
    }

    @C21.b
    public O0(@Y61.k com.yandex.div.json.expressions.b<DivSizeUnit> bVar, @Y61.k com.yandex.div.json.expressions.b<Double> bVar2) {
        this.f373043a = bVar;
        this.f373044b = bVar2;
    }

    public /* synthetic */ O0(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? f373040d : bVar, bVar2);
    }
}
