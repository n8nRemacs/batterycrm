package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivEdgeInsets.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/Y0;", "Lcom/yandex/div/json/b;", "c", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class Y0 implements com.yandex.div.json.b {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final c f374024f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f374025g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f374026h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f374027i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f374028j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivSizeUnit> f374029k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f374030l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final J0 f374031m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final J0 f374032n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final J0 f374033o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final J0 f374034p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, Y0> f374035q;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f374036a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f374037b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f374038c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f374039d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivSizeUnit> f374040e;

    /* compiled from: DivEdgeInsets.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/Y0;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/Y0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, Y0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f374041l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Y0 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            Y0.f374024f.getClass();
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            J0 j02 = Y0.f374031m;
            com.yandex.div.json.expressions.b<Long> bVar = Y0.f374025g;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject2, "bottom", lVar, j02, f370579a, bVar, dVar);
            if (bVarI != null) {
                bVar = bVarI;
            }
            J0 j03 = Y0.f374032n;
            com.yandex.div.json.expressions.b<Long> bVar2 = Y0.f374026h;
            com.yandex.div.json.expressions.b<Long> bVarI2 = C38107c.i(jSONObject2, "left", lVar, j03, f370579a, bVar2, dVar);
            if (bVarI2 != null) {
                bVar2 = bVarI2;
            }
            J0 j04 = Y0.f374033o;
            com.yandex.div.json.expressions.b<Long> bVar3 = Y0.f374027i;
            com.yandex.div.json.expressions.b<Long> bVarI3 = C38107c.i(jSONObject2, "right", lVar, j04, f370579a, bVar3, dVar);
            if (bVarI3 != null) {
                bVar3 = bVarI3;
            }
            J0 j05 = Y0.f374034p;
            com.yandex.div.json.expressions.b<Long> bVar4 = Y0.f374028j;
            com.yandex.div.json.expressions.b<Long> bVarI4 = C38107c.i(jSONObject2, "top", lVar, j05, f370579a, bVar4, dVar);
            if (bVarI4 != null) {
                bVar4 = bVarI4;
            }
            DivSizeUnit.f371957c.getClass();
            Y41.l<String, DivSizeUnit> lVar2 = DivSizeUnit.f371958d;
            com.yandex.div.json.expressions.b<DivSizeUnit> bVar5 = Y0.f374029k;
            com.yandex.div.json.expressions.b<DivSizeUnit> bVarI5 = C38107c.i(jSONObject2, "unit", lVar2, C38107c.f370139a, f370579a, bVar5, Y0.f374030l);
            return new Y0(bVar, bVar2, bVar3, bVar4, bVarI5 == null ? bVar5 : bVarI5);
        }
    }

    /* compiled from: DivEdgeInsets.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f374042l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivEdgeInsets.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/yandex/div2/Y0$c;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "BOTTOM_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "BOTTOM_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "BOTTOM_VALIDATOR", "LEFT_DEFAULT_VALUE", "LEFT_TEMPLATE_VALIDATOR", "LEFT_VALIDATOR", "RIGHT_DEFAULT_VALUE", "RIGHT_TEMPLATE_VALIDATOR", "RIGHT_VALIDATOR", "TOP_DEFAULT_VALUE", "TOP_TEMPLATE_VALIDATOR", "TOP_VALIDATOR", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivSizeUnit;", "TYPE_HELPER_UNIT", "Lcom/yandex/div/internal/parser/D;", "UNIT_DEFAULT_VALUE", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        com.yandex.div.json.expressions.b.f370552a.getClass();
        f374025g = b.a.a(0L);
        f374026h = b.a.a(0L);
        f374027i = b.a.a(0L);
        f374028j = b.a.a(0L);
        f374029k = b.a.a(DivSizeUnit.DP);
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivSizeUnit.values());
        b bVar = b.f374042l;
        aVar.getClass();
        f374030l = new com.yandex.div.internal.parser.C(bVar, objC);
        f374031m = new J0(14);
        f374032n = new J0(15);
        f374033o = new J0(16);
        f374034p = new J0(17);
        f374035q = a.f374041l;
    }

    @C21.b
    public Y0() {
        this(null, null, null, null, null, 31, null);
    }

    @C21.b
    public Y0(@Y61.k com.yandex.div.json.expressions.b<Long> bVar, @Y61.k com.yandex.div.json.expressions.b<Long> bVar2, @Y61.k com.yandex.div.json.expressions.b<Long> bVar3, @Y61.k com.yandex.div.json.expressions.b<Long> bVar4, @Y61.k com.yandex.div.json.expressions.b<DivSizeUnit> bVar5) {
        this.f374036a = bVar;
        this.f374037b = bVar2;
        this.f374038c = bVar3;
        this.f374039d = bVar4;
        this.f374040e = bVar5;
    }

    public /* synthetic */ Y0(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, com.yandex.div.json.expressions.b bVar4, com.yandex.div.json.expressions.b bVar5, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? f374025g : bVar, (i12 & 2) != 0 ? f374026h : bVar2, (i12 & 4) != 0 ? f374027i : bVar3, (i12 & 8) != 0 ? f374028j : bVar4, (i12 & 16) != 0 ? f374029k : bVar5);
    }
}
