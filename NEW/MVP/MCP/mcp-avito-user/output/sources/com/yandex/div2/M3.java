package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38105a;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivInputValidatorExpressionTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/M3;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/L3;", "g", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class M3 implements com.yandex.div.json.b, com.yandex.div.json.c<L3> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Boolean> f372778e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final C38605y3 f372779f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final C38605y3 f372780g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final C38605y3 f372781h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final C38605y3 f372782i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final C38605y3 f372783j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final C38605y3 f372784k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Boolean>> f372785l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> f372786m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> f372787n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, String> f372788o;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Boolean>> f372789a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<String>> f372790b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<String>> f372791c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<String> f372792d;

    /* compiled from: DivInputValidatorExpressionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Boolean>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f372793l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Boolean> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Object, Boolean> lVar = com.yandex.div.internal.parser.y.f370149c;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Boolean> bVar = M3.f372778e;
            com.yandex.div.json.expressions.b<Boolean> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, com.yandex.div.internal.parser.E.f370131a);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivInputValidatorExpressionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f372794l = new b();

        public b() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<String> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.c(jSONObject, str, C38107c.f370141c, M3.f372780g, eVar.getF370579a(), com.yandex.div.internal.parser.E.f370133c);
        }
    }

    /* compiled from: DivInputValidatorExpressionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/M3;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/M3;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, M3> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f372795l = 0;

        static {
            new c();
        }

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final M3 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new M3(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivInputValidatorExpressionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f372796l = new d();

        public d() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<String> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.c(jSONObject, str, C38107c.f370141c, M3.f372782i, eVar.getF370579a(), com.yandex.div.internal.parser.E.f370133c);
        }
    }

    /* compiled from: DivInputValidatorExpressionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f372797l = 0;

        static {
            new e();
        }

        public e() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            eVar.getClass();
            return (String) C38107c.a(jSONObject2, str, C38107c.f370141c, C38107c.f370139a);
        }
    }

    /* compiled from: DivInputValidatorExpressionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f372798l = new f();

        public f() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            C38605y3 c38605y3 = M3.f372784k;
            eVar.getClass();
            return (String) C38107c.a(jSONObject2, str, C38107c.f370141c, c38605y3);
        }
    }

    /* compiled from: DivInputValidatorExpressionTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/yandex/div2/M3$g;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "ALLOW_EMPTY_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "", "CONDITION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "CONDITION_VALIDATOR", "LABEL_ID_TEMPLATE_VALIDATOR", "LABEL_ID_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "VARIABLE_TEMPLATE_VALIDATOR", "VARIABLE_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class g {
        public /* synthetic */ g(C42822w c42822w) {
            this();
        }

        public g() {
        }
    }

    static {
        new g(null);
        b.a aVar = com.yandex.div.json.expressions.b.f370552a;
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        f372778e = b.a.a(bool);
        f372779f = new C38605y3(17);
        f372780g = new C38605y3(18);
        f372781h = new C38605y3(19);
        f372782i = new C38605y3(20);
        f372783j = new C38605y3(21);
        f372784k = new C38605y3(22);
        f372785l = a.f372793l;
        f372786m = b.f372794l;
        f372787n = d.f372796l;
        int i12 = e.f372797l;
        f372788o = f.f372798l;
        int i13 = c.f372795l;
    }

    public /* synthetic */ M3(com.yandex.div.json.e eVar, M3 m32, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        this(eVar, (i12 & 2) != 0 ? null : m32, (i12 & 4) != 0 ? false : z12, jSONObject);
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final L3 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        return new L3();
    }

    public M3(@Y61.k com.yandex.div.json.e eVar, @Y61.l M3 m32, boolean z12, @Y61.k JSONObject jSONObject) {
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        this.f372789a = com.yandex.div.internal.parser.s.i(jSONObject, "allow_empty", z12, m32 == null ? null : m32.f372789a, com.yandex.div.internal.parser.y.f370149c, C38107c.f370139a, f370579a, com.yandex.div.internal.parser.E.f370131a);
        H21.a<com.yandex.div.json.expressions.b<String>> aVar = m32 == null ? null : m32.f372790b;
        E.e eVar2 = com.yandex.div.internal.parser.E.f370133c;
        C38105a c38105a = C38107c.f370141c;
        this.f372790b = com.yandex.div.internal.parser.s.d(jSONObject, "condition", z12, aVar, c38105a, f372779f, f370579a, eVar2);
        this.f372791c = com.yandex.div.internal.parser.s.d(jSONObject, "label_id", z12, m32 == null ? null : m32.f372791c, c38105a, f372781h, f370579a, eVar2);
        this.f372792d = com.yandex.div.internal.parser.s.b(jSONObject, "variable", z12, m32 == null ? null : m32.f372792d, c38105a, f372783j, f370579a);
    }
}
