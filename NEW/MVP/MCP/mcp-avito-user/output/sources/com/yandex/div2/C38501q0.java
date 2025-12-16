package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.E;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivCornersRadius.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/q0;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.q0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38501q0 implements com.yandex.div.json.b {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final b f376135e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final C38574v f376136f = new C38574v(28);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final C38574v f376137g = new C38574v(29);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final C38492p0 f376138h = new C38492p0(0);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final C38492p0 f376139i = new C38492p0(1);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, C38501q0> f376140j = a.f376145l;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f376141a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f376142b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f376143c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f376144d;

    /* compiled from: DivCornersRadius.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/q0;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/q0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.q0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38501q0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f376145l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38501q0 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            C38501q0.f376135e.getClass();
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            C38574v c38574v = C38501q0.f376136f;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            return new C38501q0(C38107c.i(jSONObject2, "bottom-left", lVar, c38574v, f370579a, null, dVar), C38107c.i(jSONObject2, "bottom-right", lVar, C38501q0.f376137g, f370579a, null, dVar), C38107c.i(jSONObject2, "top-left", lVar, C38501q0.f376138h, f370579a, null, dVar), C38107c.i(jSONObject2, "top-right", lVar, C38501q0.f376139i, f370579a, null, dVar));
        }
    }

    /* compiled from: DivCornersRadius.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/yandex/div2/q0$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "BOTTOM_LEFT_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "BOTTOM_LEFT_VALIDATOR", "BOTTOM_RIGHT_TEMPLATE_VALIDATOR", "BOTTOM_RIGHT_VALIDATOR", "TOP_LEFT_TEMPLATE_VALIDATOR", "TOP_LEFT_VALIDATOR", "TOP_RIGHT_TEMPLATE_VALIDATOR", "TOP_RIGHT_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.q0$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @C21.b
    public C38501q0() {
        this(null, null, null, null, 15, null);
    }

    @C21.b
    public C38501q0(@Y61.l com.yandex.div.json.expressions.b<Long> bVar, @Y61.l com.yandex.div.json.expressions.b<Long> bVar2, @Y61.l com.yandex.div.json.expressions.b<Long> bVar3, @Y61.l com.yandex.div.json.expressions.b<Long> bVar4) {
        this.f376141a = bVar;
        this.f376142b = bVar2;
        this.f376143c = bVar3;
        this.f376144d = bVar4;
    }

    public /* synthetic */ C38501q0(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, com.yandex.div.json.expressions.b bVar4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : bVar, (i12 & 2) != 0 ? null : bVar2, (i12 & 4) != 0 ? null : bVar3, (i12 & 8) != 0 ? null : bVar4);
    }
}
