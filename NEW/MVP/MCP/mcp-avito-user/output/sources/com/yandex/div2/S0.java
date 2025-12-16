package com.yandex.div2;

import android.net.Uri;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.yandex.div.internal.parser.C38105a;
import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivDisappearAction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/S0;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class S0 implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f373492a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f373493b = com.google.firebase.components.g.i(800, com.yandex.div.json.expressions.b.f370552a);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f373494c = b.a.a(1L);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f373495d = b.a.a(0L);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final J0 f373496e = new J0(2);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final J0 f373497f = new J0(3);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final J0 f373498g = new J0(4);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final J0 f373499h = new J0(5);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, S0> f373500i = a.f373501l;

    /* compiled from: DivDisappearAction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/S0;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/S0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, S0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f373501l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final S0 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            S0.f373492a.getClass();
            com.yandex.div.json.i f370579a = eVar2.getF370579a();
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            J0 j02 = S0.f373496e;
            com.yandex.div.json.expressions.b<Long> bVar = S0.f373493b;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            C38107c.i(jSONObject2, "disappear_duration", lVar, j02, f370579a, bVar, dVar);
            U0.f373676c.getClass();
            J0 j03 = S0.f373497f;
            C38105a c38105a = C38107c.f370141c;
            C38107c.i(jSONObject2, "log_limit", lVar, S0.f373498g, f370579a, S0.f373494c, dVar);
            C38106b c38106b = C38107c.f370139a;
            Y41.l<String, Uri> lVar2 = com.yandex.div.internal.parser.y.f370148b;
            E.f fVar = com.yandex.div.internal.parser.E.f370135e;
            C38107c.i(jSONObject2, "referer", lVar2, c38106b, f370579a, null, fVar);
            C38107c.i(jSONObject2, ContextActionHandler.Link.URL, lVar2, c38106b, f370579a, null, fVar);
            C38107c.i(jSONObject2, "visibility_percentage", lVar, S0.f373499h, f370579a, S0.f373495d, dVar);
            return new S0();
        }
    }

    /* compiled from: DivDisappearAction.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/yandex/div2/S0$b;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "DISAPPEAR_DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "DISAPPEAR_DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "DISAPPEAR_DURATION_VALIDATOR", "", "LOG_ID_TEMPLATE_VALIDATOR", "LOG_ID_VALIDATOR", "LOG_LIMIT_DEFAULT_VALUE", "LOG_LIMIT_TEMPLATE_VALIDATOR", "LOG_LIMIT_VALIDATOR", "VISIBILITY_PERCENTAGE_DEFAULT_VALUE", "VISIBILITY_PERCENTAGE_TEMPLATE_VALIDATOR", "VISIBILITY_PERCENTAGE_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @C21.b
    public S0() {
        throw null;
    }

    public S0(com.yandex.div.json.expressions.b bVar, U0 u02, String str, com.yandex.div.json.expressions.b bVar2, JSONObject jSONObject, com.yandex.div.json.expressions.b bVar3, com.yandex.div.json.expressions.b bVar4, com.yandex.div.json.expressions.b bVar5, int i12, C42822w c42822w) {
    }
}
