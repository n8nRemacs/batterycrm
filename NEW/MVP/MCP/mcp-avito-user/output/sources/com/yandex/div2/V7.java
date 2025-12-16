package com.yandex.div2;

import com.yandex.div.internal.parser.C38105a;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.E;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivTimer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/V7;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class V7 implements com.yandex.div.json.b {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final b f373747g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f373748h = com.google.firebase.components.g.i(0, com.yandex.div.json.expressions.b.f370552a);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final D7 f373749i = new D7(2);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final U7 f373750j = new U7(0);

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final D7 f373751k = new D7(3);

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final U7 f373752l = new U7(1);

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final D7 f373753m = new D7(4);

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final D7 f373754n = new D7(5);

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, V7> f373755o = a.f373762l;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f373756a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f373757b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final String f373758c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f373759d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f373760e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final String f373761f;

    /* compiled from: DivTimer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/V7;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/V7;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, V7> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f373762l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final V7 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            V7.f373747g.getClass();
            com.yandex.div.json.i f370579a = eVar2.getF370579a();
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            D7 d72 = V7.f373749i;
            com.yandex.div.json.expressions.b<Long> bVar = V7.f373748h;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject2, "duration", lVar, d72, f370579a, bVar, dVar);
            com.yandex.div.json.expressions.b<Long> bVar2 = bVarI == null ? bVar : bVarI;
            DivAction.f371211f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, DivAction> pVar = DivAction.f371215j;
            List listK = C38107c.k(jSONObject2, "end_actions", pVar, V7.f373750j, f370579a, eVar2);
            D7 d73 = V7.f373751k;
            C38105a c38105a = C38107c.f370141c;
            return new V7(bVar2, listK, (String) C38107c.a(jSONObject2, "id", c38105a, d73), C38107c.k(jSONObject2, "tick_actions", pVar, V7.f373752l, f370579a, eVar2), C38107c.i(jSONObject2, "tick_interval", lVar, V7.f373753m, f370579a, null, dVar), (String) C38107c.h(jSONObject2, "value_variable", c38105a, V7.f373754n, f370579a));
        }
    }

    /* compiled from: DivTimer.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/yandex/div2/V7$b;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "DURATION_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAction;", "END_ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "TICK_ACTIONS_VALIDATOR", "TICK_INTERVAL_TEMPLATE_VALIDATOR", "TICK_INTERVAL_VALIDATOR", "VALUE_VARIABLE_TEMPLATE_VALIDATOR", "VALUE_VARIABLE_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public V7(@Y61.k com.yandex.div.json.expressions.b<Long> bVar, @Y61.l List<? extends DivAction> list, @Y61.k String str, @Y61.l List<? extends DivAction> list2, @Y61.l com.yandex.div.json.expressions.b<Long> bVar2, @Y61.l String str2) {
        this.f373756a = bVar;
        this.f373757b = list;
        this.f373758c = str;
        this.f373759d = list2;
        this.f373760e = bVar2;
        this.f373761f = str2;
    }

    public /* synthetic */ V7(com.yandex.div.json.expressions.b bVar, List list, String str, List list2, com.yandex.div.json.expressions.b bVar2, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? f373748h : bVar, (i12 & 2) != 0 ? null : list, str, (i12 & 8) != 0 ? null : list2, (i12 & 16) != 0 ? null : bVar2, (i12 & 32) != 0 ? null : str2);
    }
}
