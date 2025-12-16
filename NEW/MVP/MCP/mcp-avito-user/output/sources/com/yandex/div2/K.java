package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.json.expressions.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivBorder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/K;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class K implements com.yandex.div.json.b {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final b f372635f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Boolean> f372636g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final C38574v f372637h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, K> f372638i;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f372639a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final C38501q0 f372640b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Boolean> f372641c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final E5 f372642d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final C38656z6 f372643e;

    /* compiled from: DivBorder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/K;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/K;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, K> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f372644l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final K invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            K.f372635f.getClass();
            com.yandex.div.json.i f370579a = eVar2.getF370579a();
            com.yandex.div.json.expressions.b bVarI = C38107c.i(jSONObject2, "corner_radius", com.yandex.div.internal.parser.y.f370151e, K.f372637h, f370579a, null, com.yandex.div.internal.parser.E.f370132b);
            C38501q0.f376135e.getClass();
            C38501q0 c38501q0 = (C38501q0) C38107c.g(jSONObject2, "corners_radius", C38501q0.f376140j, f370579a, eVar2);
            Y41.l<Object, Boolean> lVar = com.yandex.div.internal.parser.y.f370149c;
            com.yandex.div.json.expressions.b<Boolean> bVar = K.f372636g;
            com.yandex.div.json.expressions.b<Boolean> bVarI2 = C38107c.i(jSONObject2, "has_shadow", lVar, C38107c.f370139a, f370579a, bVar, com.yandex.div.internal.parser.E.f370131a);
            com.yandex.div.json.expressions.b<Boolean> bVar2 = bVarI2 == null ? bVar : bVarI2;
            E5.f372240e.getClass();
            E5 e52 = (E5) C38107c.g(jSONObject2, "shadow", E5.f372246k, f370579a, eVar2);
            C38656z6.f377427d.getClass();
            return new K(bVarI, c38501q0, bVar2, e52, (C38656z6) C38107c.g(jSONObject2, "stroke", C38656z6.f377432i, f370579a, eVar2));
        }
    }

    /* compiled from: DivBorder.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/div2/K$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "CORNER_RADIUS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "CORNER_RADIUS_VALIDATOR", "Lcom/yandex/div/json/expressions/b;", "", "HAS_SHADOW_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        b.a aVar = com.yandex.div.json.expressions.b.f370552a;
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        f372636g = b.a.a(bool);
        f372637h = new C38574v(7);
        f372638i = a.f372644l;
    }

    @C21.b
    public K() {
        this(null, null, null, null, null, 31, null);
    }

    @C21.b
    public K(@Y61.l com.yandex.div.json.expressions.b<Long> bVar, @Y61.l C38501q0 c38501q0, @Y61.k com.yandex.div.json.expressions.b<Boolean> bVar2, @Y61.l E5 e52, @Y61.l C38656z6 c38656z6) {
        this.f372639a = bVar;
        this.f372640b = c38501q0;
        this.f372641c = bVar2;
        this.f372642d = e52;
        this.f372643e = c38656z6;
    }

    public /* synthetic */ K(com.yandex.div.json.expressions.b bVar, C38501q0 c38501q0, com.yandex.div.json.expressions.b bVar2, E5 e52, C38656z6 c38656z6, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : bVar, (i12 & 2) != 0 ? null : c38501q0, (i12 & 4) != 0 ? f372636g : bVar2, (i12 & 8) != 0 ? null : e52, (i12 & 16) != 0 ? null : c38656z6);
    }
}
