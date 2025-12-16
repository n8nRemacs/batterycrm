package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import com.yandex.div2.DivSlideTransition;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivSlideTransitionTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/O5;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/DivSlideTransition;", "j", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class O5 implements com.yandex.div.json.b, com.yandex.div.json.c<DivSlideTransition> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f373134f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivSlideTransition.Edge> f373135g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivAnimationInterpolator> f373136h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f373137i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f373138j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f373139k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final C38403j5 f373140l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final C38403j5 f373141m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final C38403j5 f373142n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final C38403j5 f373143o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, O0> f373144p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f373145q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivSlideTransition.Edge>> f373146r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAnimationInterpolator>> f373147s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f373148t;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<Q0> f373149a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f373150b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivSlideTransition.Edge>> f373151c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivAnimationInterpolator>> f373152d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f373153e;

    /* compiled from: DivSlideTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/O5;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/O5;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, O5> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f373154l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final O5 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new O5(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivSlideTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/O0;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/O0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, O0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f373155l = new b();

        public b() {
            super(3);
        }

        @Override // Y41.q
        public final O0 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            O0.f373039c.getClass();
            return (O0) C38107c.g(jSONObject2, str, O0.f373042f, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivSlideTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f373156l = new c();

        public c() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            C38403j5 c38403j5 = O5.f373141m;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Long> bVar = O5.f373134f;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject, str2, lVar, c38403j5, f370579a, bVar, com.yandex.div.internal.parser.E.f370132b);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivSlideTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivSlideTransition$Edge;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivSlideTransition.Edge>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f373157l = new d();

        public d() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivSlideTransition.Edge> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivSlideTransition.Edge.f371979c.getClass();
            Y41.l<String, DivSlideTransition.Edge> lVar = DivSlideTransition.Edge.f371980d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivSlideTransition.Edge> bVar = O5.f373135g;
            com.yandex.div.json.expressions.b<DivSlideTransition.Edge> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, O5.f373138j);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivSlideTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAnimationInterpolator;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAnimationInterpolator>> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f373158l = new e();

        public e() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivAnimationInterpolator> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivAnimationInterpolator.f371286c.getClass();
            Y41.l<String, DivAnimationInterpolator> lVar = DivAnimationInterpolator.f371287d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVar = O5.f373136h;
            com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, O5.f373139k);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivSlideTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f373159l = new f();

        public f() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            C38403j5 c38403j5 = O5.f373143o;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Long> bVar = O5.f373137i;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject, str2, lVar, c38403j5, f370579a, bVar, com.yandex.div.internal.parser.E.f370132b);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivSlideTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f373160l = new g();

        public g() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSlideTransition.Edge);
        }
    }

    /* compiled from: DivSlideTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f373161l = new h();

        public h() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
        }
    }

    /* compiled from: DivSlideTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f373162l = 0;

        static {
            new i();
        }

        public i() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            eVar.getClass();
            return (String) C38107c.a(jSONObject2, str, C38107c.f370141c, C38107c.f370139a);
        }
    }

    /* compiled from: DivSlideTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/div2/O5$j;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "DURATION_VALIDATOR", "Lcom/yandex/div2/DivSlideTransition$Edge;", "EDGE_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimationInterpolator;", "INTERPOLATOR_DEFAULT_VALUE", "START_DELAY_DEFAULT_VALUE", "START_DELAY_TEMPLATE_VALIDATOR", "START_DELAY_VALIDATOR", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_EDGE", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_INTERPOLATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class j {
        public /* synthetic */ j(C42822w c42822w) {
            this();
        }

        public j() {
        }
    }

    static {
        new j(null);
        f373134f = com.google.firebase.components.g.i(200L, com.yandex.div.json.expressions.b.f370552a);
        f373135g = b.a.a(DivSlideTransition.Edge.BOTTOM);
        f373136h = b.a.a(DivAnimationInterpolator.EASE_IN_OUT);
        f373137i = b.a.a(0L);
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivSlideTransition.Edge.values());
        g gVar = g.f373160l;
        aVar.getClass();
        f373138j = new com.yandex.div.internal.parser.C(gVar, objC);
        f373139k = new com.yandex.div.internal.parser.C(h.f373161l, C42756l.C(DivAnimationInterpolator.values()));
        f373140l = new C38403j5(25);
        f373141m = new C38403j5(26);
        f373142n = new C38403j5(27);
        f373143o = new C38403j5(28);
        f373144p = b.f373155l;
        f373145q = c.f373156l;
        f373146r = d.f373157l;
        f373147s = e.f373158l;
        f373148t = f.f373159l;
        int i12 = i.f373162l;
        int i13 = a.f373154l;
    }

    public /* synthetic */ O5(com.yandex.div.json.e eVar, O5 o52, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        this(eVar, (i12 & 2) != 0 ? null : o52, (i12 & 4) != 0 ? false : z12, jSONObject);
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final DivSlideTransition a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        O0 o02 = (O0) H21.b.f(this.f373149a, eVar, "distance", jSONObject, f373144p);
        com.yandex.div.json.expressions.b<Long> bVar = (com.yandex.div.json.expressions.b) H21.b.d(this.f373150b, eVar, "duration", jSONObject, f373145q);
        if (bVar == null) {
            bVar = f373134f;
        }
        com.yandex.div.json.expressions.b<Long> bVar2 = bVar;
        com.yandex.div.json.expressions.b<DivSlideTransition.Edge> bVar3 = (com.yandex.div.json.expressions.b) H21.b.d(this.f373151c, eVar, "edge", jSONObject, f373146r);
        if (bVar3 == null) {
            bVar3 = f373135g;
        }
        com.yandex.div.json.expressions.b<DivSlideTransition.Edge> bVar4 = bVar3;
        com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVar5 = (com.yandex.div.json.expressions.b) H21.b.d(this.f373152d, eVar, "interpolator", jSONObject, f373147s);
        if (bVar5 == null) {
            bVar5 = f373136h;
        }
        com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVar6 = bVar5;
        com.yandex.div.json.expressions.b<Long> bVar7 = (com.yandex.div.json.expressions.b) H21.b.d(this.f373153e, eVar, "start_delay", jSONObject, f373148t);
        if (bVar7 == null) {
            bVar7 = f373137i;
        }
        return new DivSlideTransition(o02, bVar2, bVar4, bVar6, bVar7);
    }

    public O5(@Y61.k com.yandex.div.json.e eVar, @Y61.l O5 o52, boolean z12, @Y61.k JSONObject jSONObject) {
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        H21.a<Q0> aVar = o52 == null ? null : o52.f373149a;
        Q0.f373459c.getClass();
        this.f373149a = com.yandex.div.internal.parser.s.g(jSONObject, "distance", z12, aVar, Q0.f373464h, f370579a, eVar);
        H21.a<com.yandex.div.json.expressions.b<Long>> aVar2 = o52 == null ? null : o52.f373150b;
        Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
        E.d dVar = com.yandex.div.internal.parser.E.f370132b;
        this.f373150b = com.yandex.div.internal.parser.s.i(jSONObject, "duration", z12, aVar2, lVar, f373140l, f370579a, dVar);
        H21.a<com.yandex.div.json.expressions.b<DivSlideTransition.Edge>> aVar3 = o52 == null ? null : o52.f373151c;
        DivSlideTransition.Edge.f371979c.getClass();
        Y41.l<String, DivSlideTransition.Edge> lVar2 = DivSlideTransition.Edge.f371980d;
        C38106b c38106b = C38107c.f370139a;
        this.f373151c = com.yandex.div.internal.parser.s.i(jSONObject, "edge", z12, aVar3, lVar2, c38106b, f370579a, f373138j);
        H21.a<com.yandex.div.json.expressions.b<DivAnimationInterpolator>> aVar4 = o52 == null ? null : o52.f373152d;
        DivAnimationInterpolator.f371286c.getClass();
        this.f373152d = com.yandex.div.internal.parser.s.i(jSONObject, "interpolator", z12, aVar4, DivAnimationInterpolator.f371287d, c38106b, f370579a, f373139k);
        this.f373153e = com.yandex.div.internal.parser.s.i(jSONObject, "start_delay", z12, o52 == null ? null : o52.f373153e, lVar, f373142n, f370579a, dVar);
    }
}
