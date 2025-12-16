package com.yandex.div2;

import android.net.Uri;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import com.yandex.div2.DivAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivActionTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div2/r;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/DivAction;", "k", "l", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class r implements com.yandex.div.json.b, com.yandex.div.json.c<DivAction> {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final k f376158i = new k(null);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f376159j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final C38364h f376160k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final C38364h f376161l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final C38491p f376162m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final C38491p f376163n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, U0> f376164o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, String> f376165p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> f376166q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction.d>> f376167r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, JSONObject> f376168s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> f376169t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAction.Target>> f376170u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> f376171v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, r> f376172w;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<V0> f376173a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<String> f376174b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Uri>> f376175c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<l>> f376176d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<JSONObject> f376177e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Uri>> f376178f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivAction.Target>> f376179g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Uri>> f376180h;

    /* compiled from: DivActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/r;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/r;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, r> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f376181l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final r invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new r(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/U0;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/U0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, U0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f376182l = new b();

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

    /* compiled from: DivActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f376183l = new c();

        public c() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            C38364h c38364h = r.f376161l;
            eVar.getClass();
            return (String) C38107c.a(jSONObject2, str, C38107c.f370141c, c38364h);
        }
    }

    /* compiled from: DivActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f376184l = new d();

        public d() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Uri> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370148b, C38107c.f370139a, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370135e);
        }
    }

    /* compiled from: DivActionTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivAction$d;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction.d>> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f376185l = new e();

        public e() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivAction.d> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            DivAction.d.f371230d.getClass();
            return C38107c.k(jSONObject, str2, DivAction.d.f371233g, r.f376162m, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lorg/json/JSONObject;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, JSONObject> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f376186l = new f();

        public f() {
            super(3);
        }

        @Override // Y41.q
        public final JSONObject invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return (JSONObject) C38107c.h(jSONObject, str, C38107c.f370141c, C38107c.f370139a, eVar.getF370579a());
        }
    }

    /* compiled from: DivActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f376187l = new g();

        public g() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Uri> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370148b, C38107c.f370139a, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370135e);
        }
    }

    /* compiled from: DivActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAction$Target;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAction.Target>> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f376188l = new h();

        public h() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivAction.Target> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivAction.Target.f371221c.getClass();
            return C38107c.i(jSONObject, str2, DivAction.Target.f371222d, C38107c.f370139a, eVar.getF370579a(), null, r.f376159j);
        }
    }

    /* compiled from: DivActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f376189l = new i();

        public i() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAction.Target);
        }
    }

    /* compiled from: DivActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> {

        /* renamed from: l, reason: collision with root package name */
        public static final j f376190l = new j();

        public j() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Uri> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370148b, C38107c.f370139a, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370135e);
        }
    }

    /* compiled from: DivActionTemplate.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div2/r$k;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "LOG_ID_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "LOG_ID_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/r$l;", "MENU_ITEMS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAction$d;", "MENU_ITEMS_VALIDATOR", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAction$Target;", "TYPE_HELPER_TARGET", "Lcom/yandex/div/internal/parser/D;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class k {
        public /* synthetic */ k(C42822w c42822w) {
            this();
        }

        public k() {
        }
    }

    /* compiled from: DivActionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/r$l;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/DivAction$d;", "e", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class l implements com.yandex.div.json.b, com.yandex.div.json.c<DivAction.d> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final e f376191d = new e(null);

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final C38491p f376192e = new C38491p(4);

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public static final C38491p f376193f = new C38491p(5);

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public static final C38364h f376194g = new C38364h(23);

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public static final C38364h f376195h = new C38364h(24);

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public static final Y41.q<String, JSONObject, com.yandex.div.json.e, DivAction> f376196i = b.f376204l;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> f376197j = a.f376203l;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> f376198k = d.f376206l;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public static final Y41.p<com.yandex.div.json.e, JSONObject, l> f376199l = c.f376205l;

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final H21.a<r> f376200a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final H21.a<List<r>> f376201b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final H21.a<com.yandex.div.json.expressions.b<String>> f376202c;

        /* compiled from: DivActionTemplate.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivAction;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f376203l = new a();

            public a() {
                super(3);
            }

            @Override // Y41.q
            public final List<DivAction> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
                String str2 = str;
                com.yandex.div.json.e eVar2 = eVar;
                DivAction.f371211f.getClass();
                return C38107c.k(jSONObject, str2, DivAction.f371215j, l.f376192e, eVar2.getF370579a(), eVar2);
            }
        }

        /* compiled from: DivActionTemplate.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/DivAction;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/DivAction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, DivAction> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f376204l = new b();

            public b() {
                super(3);
            }

            @Override // Y41.q
            public final DivAction invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
                JSONObject jSONObject2 = jSONObject;
                com.yandex.div.json.e eVar2 = eVar;
                DivAction.f371211f.getClass();
                return (DivAction) C38107c.g(jSONObject2, str, DivAction.f371215j, eVar2.getF370579a(), eVar2);
            }
        }

        /* compiled from: DivActionTemplate.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/r$l;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/r$l;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, l> {

            /* renamed from: l, reason: collision with root package name */
            public static final c f376205l = new c();

            public c() {
                super(2);
            }

            @Override // Y41.p
            public final l invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
                return new l(eVar, null, false, jSONObject, 6, null);
            }
        }

        /* compiled from: DivActionTemplate.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> {

            /* renamed from: l, reason: collision with root package name */
            public static final d f376206l = new d();

            public d() {
                super(3);
            }

            @Override // Y41.q
            public final com.yandex.div.json.expressions.b<String> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
                return C38107c.c(jSONObject, str, C38107c.f370141c, l.f376195h, eVar.getF370579a(), com.yandex.div.internal.parser.E.f370133c);
            }
        }

        /* compiled from: DivActionTemplate.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/yandex/div2/r$l$e;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/r;", "ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "", "TEXT_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "TEXT_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class e {
            public /* synthetic */ e(C42822w c42822w) {
                this();
            }

            public e() {
            }
        }

        public l(com.yandex.div.json.e eVar, l lVar, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
            lVar = (i12 & 2) != 0 ? null : lVar;
            z12 = (i12 & 4) != 0 ? false : z12;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            H21.a<r> aVar = lVar == null ? null : lVar.f376200a;
            r.f376158i.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, r> pVar = r.f376172w;
            this.f376200a = com.yandex.div.internal.parser.s.g(jSONObject, "action", z12, aVar, pVar, f370579a, eVar);
            this.f376201b = com.yandex.div.internal.parser.s.j(jSONObject, "actions", z12, lVar == null ? null : lVar.f376201b, pVar, f376193f, f370579a, eVar);
            this.f376202c = com.yandex.div.internal.parser.s.d(jSONObject, "text", z12, lVar != null ? lVar.f376202c : null, C38107c.f370141c, f376194g, f370579a, com.yandex.div.internal.parser.E.f370133c);
        }

        @Override // com.yandex.div.json.c
        public final com.yandex.div.json.b a(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new DivAction.d((DivAction) H21.b.f(this.f376200a, eVar, "action", jSONObject, f376196i), H21.b.g(this.f376201b, eVar, "actions", jSONObject, f376192e, f376197j), (com.yandex.div.json.expressions.b) H21.b.b(this.f376202c, eVar, "text", jSONObject, f376198k));
        }
    }

    static {
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAction.Target.values());
        i iVar = i.f376189l;
        aVar.getClass();
        f376159j = new com.yandex.div.internal.parser.C(iVar, objC);
        f376160k = new C38364h(21);
        f376161l = new C38364h(22);
        f376162m = new C38491p(2);
        f376163n = new C38491p(3);
        f376164o = b.f376182l;
        f376165p = c.f376183l;
        f376166q = d.f376184l;
        f376167r = e.f376185l;
        f376168s = f.f376186l;
        f376169t = g.f376187l;
        f376170u = h.f376188l;
        f376171v = j.f376190l;
        f376172w = a.f376181l;
    }

    public r(com.yandex.div.json.e eVar, r rVar, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        r rVar2 = (i12 & 2) != 0 ? null : rVar;
        boolean z13 = (i12 & 4) != 0 ? false : z12;
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        H21.a<V0> aVar = rVar2 == null ? null : rVar2.f376173a;
        V0.f373705c.getClass();
        this.f376173a = com.yandex.div.internal.parser.s.g(jSONObject, "download_callbacks", z13, aVar, V0.f373712j, f370579a, eVar);
        this.f376174b = com.yandex.div.internal.parser.s.b(jSONObject, "log_id", z13, rVar2 == null ? null : rVar2.f376174b, C38107c.f370141c, f376160k, f370579a);
        H21.a<com.yandex.div.json.expressions.b<Uri>> aVar2 = rVar2 == null ? null : rVar2.f376175c;
        Y41.l<String, Uri> lVar = com.yandex.div.internal.parser.y.f370148b;
        E.f fVar = com.yandex.div.internal.parser.E.f370135e;
        C38106b c38106b = C38107c.f370139a;
        this.f376175c = com.yandex.div.internal.parser.s.i(jSONObject, "log_url", z13, aVar2, lVar, c38106b, f370579a, fVar);
        H21.a<List<l>> aVar3 = rVar2 == null ? null : rVar2.f376176d;
        l.f376191d.getClass();
        this.f376176d = com.yandex.div.internal.parser.s.j(jSONObject, "menu_items", z13, aVar3, l.f376199l, f376163n, f370579a, eVar);
        this.f376177e = com.yandex.div.internal.parser.s.h(jSONObject, "payload", z13, rVar2 == null ? null : rVar2.f376177e, f370579a);
        this.f376178f = com.yandex.div.internal.parser.s.i(jSONObject, "referer", z13, rVar2 == null ? null : rVar2.f376178f, lVar, c38106b, f370579a, fVar);
        H21.a<com.yandex.div.json.expressions.b<DivAction.Target>> aVar4 = rVar2 == null ? null : rVar2.f376179g;
        DivAction.Target.f371221c.getClass();
        this.f376179g = com.yandex.div.internal.parser.s.i(jSONObject, "target", z13, aVar4, DivAction.Target.f371222d, c38106b, f370579a, f376159j);
        this.f376180h = com.yandex.div.internal.parser.s.i(jSONObject, ContextActionHandler.Link.URL, z13, rVar2 != null ? rVar2.f376180h : null, lVar, c38106b, f370579a, fVar);
    }

    @Override // com.yandex.div.json.c
    public final com.yandex.div.json.b a(com.yandex.div.json.e eVar, JSONObject jSONObject) {
        U0 u02 = (U0) H21.b.f(this.f376173a, eVar, "download_callbacks", jSONObject, f376164o);
        String str = (String) H21.b.b(this.f376174b, eVar, "log_id", jSONObject, f376165p);
        com.yandex.div.json.expressions.b bVar = (com.yandex.div.json.expressions.b) H21.b.d(this.f376175c, eVar, "log_url", jSONObject, f376166q);
        List listG = H21.b.g(this.f376176d, eVar, "menu_items", jSONObject, f376162m, f376167r);
        JSONObject jSONObject2 = (JSONObject) H21.b.d(this.f376177e, eVar, "payload", jSONObject, f376168s);
        com.yandex.div.json.expressions.b bVar2 = (com.yandex.div.json.expressions.b) H21.b.d(this.f376178f, eVar, "referer", jSONObject, f376169t);
        return new DivAction(u02, str, bVar, listG, jSONObject2, bVar2, (com.yandex.div.json.expressions.b) H21.b.d(this.f376180h, eVar, ContextActionHandler.Link.URL, jSONObject, f376171v));
    }
}
