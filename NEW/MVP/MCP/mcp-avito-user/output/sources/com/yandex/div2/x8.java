package com.yandex.div2;

import android.net.Uri;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivVisibilityActionTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/x8;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/w8;", "j", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class x8 implements com.yandex.div.json.b, com.yandex.div.json.c<w8> {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<V0> f376998a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<String> f376999b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f377000c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<JSONObject> f377001d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Uri>> f377002e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Uri>> f377003f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f377004g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f377005h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final j f376980i = new j(null);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f376981j = com.google.firebase.components.g.i(1, com.yandex.div.json.expressions.b.f370552a);

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f376982k = b.a.a(800L);

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f376983l = b.a.a(50L);

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final p8 f376984m = new p8(18);

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final p8 f376985n = new p8(19);

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final p8 f376986o = new p8(20);

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final p8 f376987p = new p8(21);

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final p8 f376988q = new p8(22);

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final p8 f376989r = new p8(23);

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final p8 f376990s = new p8(24);

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public static final p8 f376991t = new p8(25);

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, U0> f376992u = b.f377007l;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, String> f376993v = c.f377008l;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f376994w = d.f377009l;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, JSONObject> f376995x = e.f377010l;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> f376996y = f.f377011l;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> f376997z = g.f377012l;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f376977A = h.f377013l;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f376978B = i.f377014l;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, x8> f376979C = a.f377006l;

    /* compiled from: DivVisibilityActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/x8;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/x8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, x8> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f377006l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final x8 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new x8(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivVisibilityActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/U0;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/U0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, U0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f377007l = new b();

        public b() {
            super(3);
        }

        @Override // Y41.q
        public final U0 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            U0.f373676c.getClass();
            return (U0) C38107c.g(jSONObject2, str, U0.f373679f, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivVisibilityActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f377008l = new c();

        public c() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            p8 p8Var = x8.f376985n;
            eVar.getClass();
            return (String) C38107c.a(jSONObject2, str, C38107c.f370141c, p8Var);
        }
    }

    /* compiled from: DivVisibilityActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f377009l = new d();

        public d() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            p8 p8Var = x8.f376987p;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Long> bVar = x8.f376981j;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject, str2, lVar, p8Var, f370579a, bVar, com.yandex.div.internal.parser.E.f370132b);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivVisibilityActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lorg/json/JSONObject;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, JSONObject> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f377010l = new e();

        public e() {
            super(3);
        }

        @Override // Y41.q
        public final JSONObject invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return (JSONObject) C38107c.h(jSONObject, str, C38107c.f370141c, C38107c.f370139a, eVar.getF370579a());
        }
    }

    /* compiled from: DivVisibilityActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f377011l = new f();

        public f() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Uri> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370148b, C38107c.f370139a, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370135e);
        }
    }

    /* compiled from: DivVisibilityActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f377012l = new g();

        public g() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Uri> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370148b, C38107c.f370139a, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370135e);
        }
    }

    /* compiled from: DivVisibilityActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f377013l = new h();

        public h() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            p8 p8Var = x8.f376989r;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Long> bVar = x8.f376982k;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject, str2, lVar, p8Var, f370579a, bVar, com.yandex.div.internal.parser.E.f370132b);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivVisibilityActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f377014l = new i();

        public i() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            p8 p8Var = x8.f376991t;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Long> bVar = x8.f376983l;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject, str2, lVar, p8Var, f370579a, bVar, com.yandex.div.internal.parser.E.f370132b);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivVisibilityActionTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/yandex/div2/x8$j;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "LOG_ID_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "LOG_ID_VALIDATOR", "Lcom/yandex/div/json/expressions/b;", "", "LOG_LIMIT_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "LOG_LIMIT_TEMPLATE_VALIDATOR", "LOG_LIMIT_VALIDATOR", "VISIBILITY_DURATION_DEFAULT_VALUE", "VISIBILITY_DURATION_TEMPLATE_VALIDATOR", "VISIBILITY_DURATION_VALIDATOR", "VISIBILITY_PERCENTAGE_DEFAULT_VALUE", "VISIBILITY_PERCENTAGE_TEMPLATE_VALIDATOR", "VISIBILITY_PERCENTAGE_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class j {
        public /* synthetic */ j(C42822w c42822w) {
            this();
        }

        public j() {
        }
    }

    public x8(com.yandex.div.json.e eVar, x8 x8Var, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        x8 x8Var2 = (i12 & 2) != 0 ? null : x8Var;
        boolean z13 = (i12 & 4) != 0 ? false : z12;
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        H21.a<V0> aVar = x8Var2 == null ? null : x8Var2.f376998a;
        V0.f373705c.getClass();
        this.f376998a = com.yandex.div.internal.parser.s.g(jSONObject, "download_callbacks", z13, aVar, V0.f373712j, f370579a, eVar);
        this.f376999b = com.yandex.div.internal.parser.s.b(jSONObject, "log_id", z13, x8Var2 == null ? null : x8Var2.f376999b, C38107c.f370141c, f376984m, f370579a);
        H21.a<com.yandex.div.json.expressions.b<Long>> aVar2 = x8Var2 == null ? null : x8Var2.f377000c;
        Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
        E.d dVar = com.yandex.div.internal.parser.E.f370132b;
        this.f377000c = com.yandex.div.internal.parser.s.i(jSONObject, "log_limit", z13, aVar2, lVar, f376986o, f370579a, dVar);
        this.f377001d = com.yandex.div.internal.parser.s.h(jSONObject, "payload", z13, x8Var2 == null ? null : x8Var2.f377001d, f370579a);
        H21.a<com.yandex.div.json.expressions.b<Uri>> aVar3 = x8Var2 == null ? null : x8Var2.f377002e;
        Y41.l<String, Uri> lVar2 = com.yandex.div.internal.parser.y.f370148b;
        E.f fVar = com.yandex.div.internal.parser.E.f370135e;
        C38106b c38106b = C38107c.f370139a;
        this.f377002e = com.yandex.div.internal.parser.s.i(jSONObject, "referer", z13, aVar3, lVar2, c38106b, f370579a, fVar);
        this.f377003f = com.yandex.div.internal.parser.s.i(jSONObject, ContextActionHandler.Link.URL, z13, x8Var2 == null ? null : x8Var2.f377003f, lVar2, c38106b, f370579a, fVar);
        this.f377004g = com.yandex.div.internal.parser.s.i(jSONObject, "visibility_duration", z13, x8Var2 == null ? null : x8Var2.f377004g, lVar, f376988q, f370579a, dVar);
        this.f377005h = com.yandex.div.internal.parser.s.i(jSONObject, "visibility_percentage", z13, x8Var2 != null ? x8Var2.f377005h : null, lVar, f376990s, f370579a, dVar);
    }

    @Override // com.yandex.div.json.c
    public final com.yandex.div.json.b a(com.yandex.div.json.e eVar, JSONObject jSONObject) {
        U0 u02 = (U0) H21.b.f(this.f376998a, eVar, "download_callbacks", jSONObject, f376992u);
        String str = (String) H21.b.b(this.f376999b, eVar, "log_id", jSONObject, f376993v);
        com.yandex.div.json.expressions.b<Long> bVar = (com.yandex.div.json.expressions.b) H21.b.d(this.f377000c, eVar, "log_limit", jSONObject, f376994w);
        if (bVar == null) {
            bVar = f376981j;
        }
        com.yandex.div.json.expressions.b<Long> bVar2 = bVar;
        JSONObject jSONObject2 = (JSONObject) H21.b.d(this.f377001d, eVar, "payload", jSONObject, f376995x);
        com.yandex.div.json.expressions.b bVar3 = (com.yandex.div.json.expressions.b) H21.b.d(this.f377002e, eVar, "referer", jSONObject, f376996y);
        com.yandex.div.json.expressions.b bVar4 = (com.yandex.div.json.expressions.b) H21.b.d(this.f377003f, eVar, ContextActionHandler.Link.URL, jSONObject, f376997z);
        com.yandex.div.json.expressions.b<Long> bVar5 = (com.yandex.div.json.expressions.b) H21.b.d(this.f377004g, eVar, "visibility_duration", jSONObject, f376977A);
        if (bVar5 == null) {
            bVar5 = f376982k;
        }
        com.yandex.div.json.expressions.b<Long> bVar6 = bVar5;
        com.yandex.div.json.expressions.b<Long> bVar7 = (com.yandex.div.json.expressions.b) H21.b.d(this.f377005h, eVar, "visibility_percentage", jSONObject, f376978B);
        if (bVar7 == null) {
            bVar7 = f376983l;
        }
        return new w8(u02, str, bVar2, jSONObject2, bVar3, bVar4, bVar6, bVar7);
    }
}
