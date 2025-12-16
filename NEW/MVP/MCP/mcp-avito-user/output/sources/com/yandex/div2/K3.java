package com.yandex.div2;

import com.yandex.div.internal.parser.C38105a;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivInputValidatorBaseTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/K3;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/J3;", "e", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class K3 implements com.yandex.div.json.b, com.yandex.div.json.c<J3> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Boolean> f372686d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C38605y3 f372687e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final C38605y3 f372688f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final C38605y3 f372689g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final C38605y3 f372690h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Boolean>> f372691i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> f372692j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, String> f372693k;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Boolean>> f372694a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<String>> f372695b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<String> f372696c;

    /* compiled from: DivInputValidatorBaseTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Boolean>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f372697l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Boolean> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Object, Boolean> lVar = com.yandex.div.internal.parser.y.f370149c;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Boolean> bVar = K3.f372686d;
            com.yandex.div.json.expressions.b<Boolean> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, com.yandex.div.internal.parser.E.f370131a);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivInputValidatorBaseTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/K3;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/K3;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, K3> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f372698l = 0;

        static {
            new b();
        }

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final K3 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new K3(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivInputValidatorBaseTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f372699l = new c();

        public c() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<String> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, C38107c.f370141c, K3.f372688f, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370133c);
        }
    }

    /* compiled from: DivInputValidatorBaseTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f372700l = new d();

        public d() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return (String) C38107c.h(jSONObject, str, C38107c.f370141c, K3.f372690h, eVar.getF370579a());
        }
    }

    /* compiled from: DivInputValidatorBaseTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/yandex/div2/K3$e;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "ALLOW_EMPTY_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "", "LABEL_ID_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "LABEL_ID_VALIDATOR", "VARIABLE_TEMPLATE_VALIDATOR", "VARIABLE_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e {
        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
        }
    }

    static {
        new e(null);
        b.a aVar = com.yandex.div.json.expressions.b.f370552a;
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        f372686d = b.a.a(bool);
        f372687e = new C38605y3(10);
        f372688f = new C38605y3(11);
        f372689g = new C38605y3(12);
        f372690h = new C38605y3(13);
        f372691i = a.f372697l;
        f372692j = c.f372699l;
        f372693k = d.f372700l;
        int i12 = b.f372698l;
    }

    public K3(com.yandex.div.json.e eVar, K3 k32, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        k32 = (i12 & 2) != 0 ? null : k32;
        z12 = (i12 & 4) != 0 ? false : z12;
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        this.f372694a = com.yandex.div.internal.parser.s.i(jSONObject, "allow_empty", z12, k32 == null ? null : k32.f372694a, com.yandex.div.internal.parser.y.f370149c, C38107c.f370139a, f370579a, com.yandex.div.internal.parser.E.f370131a);
        H21.a<com.yandex.div.json.expressions.b<String>> aVar = k32 == null ? null : k32.f372695b;
        E.e eVar2 = com.yandex.div.internal.parser.E.f370133c;
        C38105a c38105a = C38107c.f370141c;
        this.f372695b = com.yandex.div.internal.parser.s.i(jSONObject, "label_id", z12, aVar, c38105a, f372687e, f370579a, eVar2);
        this.f372696c = com.yandex.div.internal.parser.s.f(jSONObject, "variable", z12, k32 != null ? k32.f372696c : null, c38105a, f372689g, f370579a);
    }

    @Override // com.yandex.div.json.c
    public final com.yandex.div.json.b a(com.yandex.div.json.e eVar, JSONObject jSONObject) {
        return new J3();
    }
}
