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

/* compiled from: DivVisibilityAction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/w8;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class w8 implements com.yandex.div.json.b {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final b f376942h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f376943i = com.google.firebase.components.g.i(1, com.yandex.div.json.expressions.b.f370552a);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f376944j = b.a.a(800L);

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f376945k = b.a.a(50L);

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final p8 f376946l = new p8(14);

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final p8 f376947m = new p8(15);

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final p8 f376948n = new p8(16);

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final p8 f376949o = new p8(17);

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, w8> f376950p = a.f376958l;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final String f376951a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f376952b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final JSONObject f376953c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Uri> f376954d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Uri> f376955e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f376956f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f376957g;

    /* compiled from: DivVisibilityAction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/w8;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/w8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, w8> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f376958l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final w8 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            w8.f376942h.getClass();
            com.yandex.div.json.i f370579a = eVar2.getF370579a();
            U0.f373676c.getClass();
            U0 u02 = (U0) C38107c.g(jSONObject2, "download_callbacks", U0.f373679f, f370579a, eVar2);
            p8 p8Var = w8.f376946l;
            C38105a c38105a = C38107c.f370141c;
            String str = (String) C38107c.a(jSONObject2, "log_id", c38105a, p8Var);
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            p8 p8Var2 = w8.f376947m;
            com.yandex.div.json.expressions.b<Long> bVar = w8.f376943i;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject2, "log_limit", lVar, p8Var2, f370579a, bVar, dVar);
            if (bVarI != null) {
                bVar = bVarI;
            }
            C38106b c38106b = C38107c.f370139a;
            JSONObject jSONObject3 = (JSONObject) C38107c.h(jSONObject2, "payload", c38105a, c38106b, f370579a);
            Y41.l<String, Uri> lVar2 = com.yandex.div.internal.parser.y.f370148b;
            E.f fVar = com.yandex.div.internal.parser.E.f370135e;
            com.yandex.div.json.expressions.b bVarI2 = C38107c.i(jSONObject2, "referer", lVar2, c38106b, f370579a, null, fVar);
            com.yandex.div.json.expressions.b bVarI3 = C38107c.i(jSONObject2, ContextActionHandler.Link.URL, lVar2, c38106b, f370579a, null, fVar);
            p8 p8Var3 = w8.f376948n;
            com.yandex.div.json.expressions.b<Long> bVar2 = w8.f376944j;
            com.yandex.div.json.expressions.b<Long> bVarI4 = C38107c.i(jSONObject2, "visibility_duration", lVar, p8Var3, f370579a, bVar2, dVar);
            com.yandex.div.json.expressions.b<Long> bVar3 = bVarI4 == null ? bVar2 : bVarI4;
            p8 p8Var4 = w8.f376949o;
            com.yandex.div.json.expressions.b<Long> bVar4 = w8.f376945k;
            com.yandex.div.json.expressions.b<Long> bVarI5 = C38107c.i(jSONObject2, "visibility_percentage", lVar, p8Var4, f370579a, bVar4, dVar);
            if (bVarI5 == null) {
                bVarI5 = bVar4;
            }
            return new w8(u02, str, bVar, jSONObject3, bVarI2, bVarI3, bVar3, bVarI5);
        }
    }

    /* compiled from: DivVisibilityAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/yandex/div2/w8$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "LOG_ID_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "LOG_ID_VALIDATOR", "Lcom/yandex/div/json/expressions/b;", "", "LOG_LIMIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "LOG_LIMIT_TEMPLATE_VALIDATOR", "LOG_LIMIT_VALIDATOR", "VISIBILITY_DURATION_DEFAULT_VALUE", "VISIBILITY_DURATION_TEMPLATE_VALIDATOR", "VISIBILITY_DURATION_VALIDATOR", "VISIBILITY_PERCENTAGE_DEFAULT_VALUE", "VISIBILITY_PERCENTAGE_TEMPLATE_VALIDATOR", "VISIBILITY_PERCENTAGE_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @C21.b
    public w8(@Y61.l U0 u02, @Y61.k String str, @Y61.k com.yandex.div.json.expressions.b<Long> bVar, @Y61.l JSONObject jSONObject, @Y61.l com.yandex.div.json.expressions.b<Uri> bVar2, @Y61.l com.yandex.div.json.expressions.b<Uri> bVar3, @Y61.k com.yandex.div.json.expressions.b<Long> bVar4, @Y61.k com.yandex.div.json.expressions.b<Long> bVar5) {
        this.f376951a = str;
        this.f376952b = bVar;
        this.f376953c = jSONObject;
        this.f376954d = bVar2;
        this.f376955e = bVar3;
        this.f376956f = bVar4;
        this.f376957g = bVar5;
    }

    public /* synthetic */ w8(U0 u02, String str, com.yandex.div.json.expressions.b bVar, JSONObject jSONObject, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, com.yandex.div.json.expressions.b bVar4, com.yandex.div.json.expressions.b bVar5, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : u02, str, (i12 & 4) != 0 ? f376943i : bVar, (i12 & 8) != 0 ? null : jSONObject, (i12 & 16) != 0 ? null : bVar2, (i12 & 32) != 0 ? null : bVar3, (i12 & 64) != 0 ? f376944j : bVar4, (i12 & 128) != 0 ? f376945k : bVar5);
    }
}
