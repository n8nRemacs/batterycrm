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

/* compiled from: DivDisappearActionTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/T0;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/S0;", "j", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class T0 implements com.yandex.div.json.b, com.yandex.div.json.c<S0> {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f373536a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<V0> f373537b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<String> f373538c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f373539d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<JSONObject> f373540e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Uri>> f373541f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Uri>> f373542g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f373543h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final j f373518i = new j(null);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f373519j = com.google.firebase.components.g.i(800, com.yandex.div.json.expressions.b.f370552a);

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f373520k = b.a.a(1L);

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f373521l = b.a.a(0L);

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final J0 f373522m = new J0(6);

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final J0 f373523n = new J0(7);

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final J0 f373524o = new J0(8);

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final J0 f373525p = new J0(9);

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final J0 f373526q = new J0(10);

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final J0 f373527r = new J0(11);

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final J0 f373528s = new J0(12);

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public static final J0 f373529t = new J0(13);

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f373530u = b.f373545l;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, U0> f373531v = c.f373546l;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, String> f373532w = d.f373547l;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f373533x = e.f373548l;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, JSONObject> f373534y = f.f373549l;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> f373535z = g.f373550l;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> f373515A = h.f373551l;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f373516B = i.f373552l;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, T0> f373517C = a.f373544l;

    /* compiled from: DivDisappearActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/T0;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/T0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, T0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f373544l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final T0 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new T0(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivDisappearActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f373545l = new b();

        public b() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            J0 j02 = T0.f373523n;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Long> bVar = T0.f373519j;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject, str2, lVar, j02, f370579a, bVar, com.yandex.div.internal.parser.E.f370132b);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivDisappearActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/U0;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/U0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, U0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f373546l = new c();

        public c() {
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

    /* compiled from: DivDisappearActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f373547l = new d();

        public d() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            J0 j02 = T0.f373525p;
            eVar.getClass();
            return (String) C38107c.a(jSONObject2, str, C38107c.f370141c, j02);
        }
    }

    /* compiled from: DivDisappearActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f373548l = new e();

        public e() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            J0 j02 = T0.f373527r;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Long> bVar = T0.f373520k;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject, str2, lVar, j02, f370579a, bVar, com.yandex.div.internal.parser.E.f370132b);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivDisappearActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lorg/json/JSONObject;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, JSONObject> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f373549l = new f();

        public f() {
            super(3);
        }

        @Override // Y41.q
        public final JSONObject invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return (JSONObject) C38107c.h(jSONObject, str, C38107c.f370141c, C38107c.f370139a, eVar.getF370579a());
        }
    }

    /* compiled from: DivDisappearActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f373550l = new g();

        public g() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Uri> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370148b, C38107c.f370139a, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370135e);
        }
    }

    /* compiled from: DivDisappearActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f373551l = new h();

        public h() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Uri> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370148b, C38107c.f370139a, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370135e);
        }
    }

    /* compiled from: DivDisappearActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f373552l = new i();

        public i() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            J0 j02 = T0.f373529t;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Long> bVar = T0.f373521l;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject, str2, lVar, j02, f370579a, bVar, com.yandex.div.internal.parser.E.f370132b);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivDisappearActionTemplate.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/yandex/div2/T0$j;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "DISAPPEAR_DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "DISAPPEAR_DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "DISAPPEAR_DURATION_VALIDATOR", "", "LOG_ID_TEMPLATE_VALIDATOR", "LOG_ID_VALIDATOR", "LOG_LIMIT_DEFAULT_VALUE", "LOG_LIMIT_TEMPLATE_VALIDATOR", "LOG_LIMIT_VALIDATOR", "VISIBILITY_PERCENTAGE_DEFAULT_VALUE", "VISIBILITY_PERCENTAGE_TEMPLATE_VALIDATOR", "VISIBILITY_PERCENTAGE_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class j {
        public /* synthetic */ j(C42822w c42822w) {
            this();
        }

        public j() {
        }
    }

    public T0(com.yandex.div.json.e eVar, T0 t02, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        T0 t03 = (i12 & 2) != 0 ? null : t02;
        boolean z13 = (i12 & 4) != 0 ? false : z12;
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        H21.a<com.yandex.div.json.expressions.b<Long>> aVar = t03 == null ? null : t03.f373536a;
        Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
        E.d dVar = com.yandex.div.internal.parser.E.f370132b;
        this.f373536a = com.yandex.div.internal.parser.s.i(jSONObject, "disappear_duration", z13, aVar, lVar, f373522m, f370579a, dVar);
        H21.a<V0> aVar2 = t03 == null ? null : t03.f373537b;
        V0.f373705c.getClass();
        this.f373537b = com.yandex.div.internal.parser.s.g(jSONObject, "download_callbacks", z13, aVar2, V0.f373712j, f370579a, eVar);
        this.f373538c = com.yandex.div.internal.parser.s.b(jSONObject, "log_id", z13, t03 == null ? null : t03.f373538c, C38107c.f370141c, f373524o, f370579a);
        this.f373539d = com.yandex.div.internal.parser.s.i(jSONObject, "log_limit", z13, t03 == null ? null : t03.f373539d, lVar, f373526q, f370579a, dVar);
        this.f373540e = com.yandex.div.internal.parser.s.h(jSONObject, "payload", z13, t03 == null ? null : t03.f373540e, f370579a);
        H21.a<com.yandex.div.json.expressions.b<Uri>> aVar3 = t03 == null ? null : t03.f373541f;
        Y41.l<String, Uri> lVar2 = com.yandex.div.internal.parser.y.f370148b;
        E.f fVar = com.yandex.div.internal.parser.E.f370135e;
        C38106b c38106b = C38107c.f370139a;
        this.f373541f = com.yandex.div.internal.parser.s.i(jSONObject, "referer", z13, aVar3, lVar2, c38106b, f370579a, fVar);
        this.f373542g = com.yandex.div.internal.parser.s.i(jSONObject, ContextActionHandler.Link.URL, z13, t03 == null ? null : t03.f373542g, lVar2, c38106b, f370579a, fVar);
        this.f373543h = com.yandex.div.internal.parser.s.i(jSONObject, "visibility_percentage", z13, t03 != null ? t03.f373543h : null, lVar, f373528s, f370579a, dVar);
    }

    @Override // com.yandex.div.json.c
    public final com.yandex.div.json.b a(com.yandex.div.json.e eVar, JSONObject jSONObject) {
        return new S0();
    }
}
