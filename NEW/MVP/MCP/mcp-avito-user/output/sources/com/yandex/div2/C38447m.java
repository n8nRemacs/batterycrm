package com.yandex.div2;

import com.yandex.div.internal.parser.C38105a;
import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import com.yandex.div2.DivAccessibility;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivAccessibilityTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/m;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/DivAccessibility;", "i", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38447m implements com.yandex.div.json.b, com.yandex.div.json.c<DivAccessibility> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final i f375826g = new i(null);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivAccessibility.Mode> f375827h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Boolean> f375828i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f375829j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final C38364h f375830k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final C38364h f375831l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final C38364h f375832m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final C38364h f375833n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final C38364h f375834o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final C38364h f375835p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> f375836q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> f375837r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAccessibility.Mode>> f375838s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Boolean>> f375839t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> f375840u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, DivAccessibility.Type> f375841v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, C38447m> f375842w;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<String>> f375843a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<String>> f375844b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivAccessibility.Mode>> f375845c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Boolean>> f375846d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<String>> f375847e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<DivAccessibility.Type> f375848f;

    /* compiled from: DivAccessibilityTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/m;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/m;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.m$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38447m> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f375849l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38447m invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new C38447m(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivAccessibilityTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.m$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f375850l = new b();

        public b() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<String> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, C38107c.f370141c, C38447m.f375831l, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370133c);
        }
    }

    /* compiled from: DivAccessibilityTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.m$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f375851l = new c();

        public c() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<String> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, C38107c.f370141c, C38447m.f375833n, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370133c);
        }
    }

    /* compiled from: DivAccessibilityTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAccessibility$Mode;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.m$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAccessibility.Mode>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f375852l = new d();

        public d() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivAccessibility.Mode> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivAccessibility.Mode.f371188c.getClass();
            Y41.l<String, DivAccessibility.Mode> lVar = DivAccessibility.Mode.f371189d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivAccessibility.Mode> bVar = C38447m.f375827h;
            com.yandex.div.json.expressions.b<DivAccessibility.Mode> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, C38447m.f375829j);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivAccessibilityTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.m$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Boolean>> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f375853l = new e();

        public e() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Boolean> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Object, Boolean> lVar = com.yandex.div.internal.parser.y.f370149c;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Boolean> bVar = C38447m.f375828i;
            com.yandex.div.json.expressions.b<Boolean> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, com.yandex.div.internal.parser.E.f370131a);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivAccessibilityTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.m$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f375854l = new f();

        public f() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<String> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, C38107c.f370141c, C38447m.f375835p, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370133c);
        }
    }

    /* compiled from: DivAccessibilityTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.m$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f375855l = new g();

        public g() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAccessibility.Mode);
        }
    }

    /* compiled from: DivAccessibilityTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/DivAccessibility$Type;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/DivAccessibility$Type;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.m$h */
    public static final class h extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, DivAccessibility.Type> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f375856l = new h();

        public h() {
            super(3);
        }

        @Override // Y41.q
        public final DivAccessibility.Type invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            DivAccessibility.Type.f371196c.getClass();
            return (DivAccessibility.Type) C38107c.h(jSONObject2, str, DivAccessibility.Type.f371197d, C38107c.f370139a, eVar.getF370579a());
        }
    }

    /* compiled from: DivAccessibilityTemplate.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/div2/m$i;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "DESCRIPTION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "DESCRIPTION_VALIDATOR", "HINT_TEMPLATE_VALIDATOR", "HINT_VALIDATOR", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAccessibility$Mode;", "MODE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "", "MUTE_AFTER_ACTION_DEFAULT_VALUE", "STATE_DESCRIPTION_TEMPLATE_VALIDATOR", "STATE_DESCRIPTION_VALIDATOR", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_MODE", "Lcom/yandex/div/internal/parser/D;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.m$i */
    public static final class i {
        public /* synthetic */ i(C42822w c42822w) {
            this();
        }

        public i() {
        }
    }

    static {
        b.a aVar = com.yandex.div.json.expressions.b.f370552a;
        DivAccessibility.Mode mode = DivAccessibility.Mode.DEFAULT;
        aVar.getClass();
        f375827h = b.a.a(mode);
        f375828i = b.a.a(Boolean.FALSE);
        D.a aVar2 = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAccessibility.Mode.values());
        g gVar = g.f375855l;
        aVar2.getClass();
        f375829j = new com.yandex.div.internal.parser.C(gVar, objC);
        f375830k = new C38364h(13);
        f375831l = new C38364h(14);
        f375832m = new C38364h(15);
        f375833n = new C38364h(16);
        f375834o = new C38364h(17);
        f375835p = new C38364h(18);
        f375836q = b.f375850l;
        f375837r = c.f375851l;
        f375838s = d.f375852l;
        f375839t = e.f375853l;
        f375840u = f.f375854l;
        f375841v = h.f375856l;
        f375842w = a.f375849l;
    }

    public C38447m(com.yandex.div.json.e eVar, C38447m c38447m, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        C38447m c38447m2 = (i12 & 2) != 0 ? null : c38447m;
        boolean z13 = (i12 & 4) != 0 ? false : z12;
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        H21.a<com.yandex.div.json.expressions.b<String>> aVar = c38447m2 == null ? null : c38447m2.f375843a;
        E.e eVar2 = com.yandex.div.internal.parser.E.f370133c;
        C38105a c38105a = C38107c.f370141c;
        this.f375843a = com.yandex.div.internal.parser.s.i(jSONObject, "description", z13, aVar, c38105a, f375830k, f370579a, eVar2);
        this.f375844b = com.yandex.div.internal.parser.s.i(jSONObject, "hint", z13, c38447m2 == null ? null : c38447m2.f375844b, c38105a, f375832m, f370579a, eVar2);
        H21.a<com.yandex.div.json.expressions.b<DivAccessibility.Mode>> aVar2 = c38447m2 == null ? null : c38447m2.f375845c;
        DivAccessibility.Mode.f371188c.getClass();
        Y41.l<String, DivAccessibility.Mode> lVar = DivAccessibility.Mode.f371189d;
        C38106b c38106b = C38107c.f370139a;
        this.f375845c = com.yandex.div.internal.parser.s.i(jSONObject, "mode", z13, aVar2, lVar, c38106b, f370579a, f375829j);
        this.f375846d = com.yandex.div.internal.parser.s.i(jSONObject, "mute_after_action", z13, c38447m2 == null ? null : c38447m2.f375846d, com.yandex.div.internal.parser.y.f370149c, c38106b, f370579a, com.yandex.div.internal.parser.E.f370131a);
        this.f375847e = com.yandex.div.internal.parser.s.i(jSONObject, "state_description", z13, c38447m2 == null ? null : c38447m2.f375847e, c38105a, f375834o, f370579a, eVar2);
        H21.a<DivAccessibility.Type> aVar3 = c38447m2 != null ? c38447m2.f375848f : null;
        DivAccessibility.Type.f371196c.getClass();
        this.f375848f = com.yandex.div.internal.parser.s.f(jSONObject, "type", z13, aVar3, DivAccessibility.Type.f371197d, c38106b, f370579a);
    }

    @Override // com.yandex.div.json.c
    public final com.yandex.div.json.b a(com.yandex.div.json.e eVar, JSONObject jSONObject) {
        com.yandex.div.json.expressions.b bVar = (com.yandex.div.json.expressions.b) H21.b.d(this.f375843a, eVar, "description", jSONObject, f375836q);
        com.yandex.div.json.expressions.b bVar2 = (com.yandex.div.json.expressions.b) H21.b.d(this.f375844b, eVar, "hint", jSONObject, f375837r);
        com.yandex.div.json.expressions.b<DivAccessibility.Mode> bVar3 = (com.yandex.div.json.expressions.b) H21.b.d(this.f375845c, eVar, "mode", jSONObject, f375838s);
        if (bVar3 == null) {
            bVar3 = f375827h;
        }
        com.yandex.div.json.expressions.b<DivAccessibility.Mode> bVar4 = bVar3;
        return new DivAccessibility(bVar, bVar2, bVar4, (com.yandex.div.json.expressions.b) H21.b.d(this.f375847e, eVar, "state_description", jSONObject, f375840u), (DivAccessibility.Type) H21.b.d(this.f375848f, eVar, "type", jSONObject, f375841v));
    }
}
