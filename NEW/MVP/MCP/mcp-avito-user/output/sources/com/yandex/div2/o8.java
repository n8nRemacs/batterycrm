package com.yandex.div2;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.huawei.hms.adapter.internal.CommonCode;
import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.E;
import com.yandex.div2.n8;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivVideoSourceTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div2/o8;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/n8;", "g", "h", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class o8 implements com.yandex.div.json.b, com.yandex.div.json.c<n8> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final g f376063e = new g(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f376064f = a.f376073l;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> f376065g = c.f376075l;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, n8.c> f376066h = d.f376076l;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> f376067i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, o8> f376068j;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f376069a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<String>> f376070b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<h> f376071c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Uri>> f376072d;

    /* compiled from: DivVideoSourceTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f376073l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370151e, C38107c.f370139a, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370132b);
        }
    }

    /* compiled from: DivVideoSourceTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/o8;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/o8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, o8> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f376074l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final o8 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new o8(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivVideoSourceTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f376075l = new c();

        public c() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<String> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.c(jSONObject, str, C38107c.f370141c, C38107c.f370140b, eVar.getF370579a(), com.yandex.div.internal.parser.E.f370133c);
        }
    }

    /* compiled from: DivVideoSourceTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/n8$c;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/n8$c;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, n8.c> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f376076l = new d();

        public d() {
            super(3);
        }

        @Override // Y41.q
        public final n8.c invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            n8.c.f375876c.getClass();
            return (n8.c) C38107c.g(jSONObject2, str, n8.c.f375879f, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivVideoSourceTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f376077l = 0;

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

    /* compiled from: DivVideoSourceTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f376078l = new f();

        public f() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Uri> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.c(jSONObject, str, com.yandex.div.internal.parser.y.f370148b, C38107c.f370139a, eVar.getF370579a(), com.yandex.div.internal.parser.E.f370135e);
        }
    }

    /* compiled from: DivVideoSourceTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div2/o8$g;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class g {
        public /* synthetic */ g(C42822w c42822w) {
            this();
        }

        public g() {
        }
    }

    /* compiled from: DivVideoSourceTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/o8$h;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/n8$c;", "e", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class h implements com.yandex.div.json.b, com.yandex.div.json.c<n8.c> {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final e f376079c = new e(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final D7 f376080d = new D7(28);

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final D7 f376081e = new D7(29);

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public static final p8 f376082f = new p8(0);

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public static final p8 f376083g = new p8(1);

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f376084h = b.f376090l;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f376085i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public static final Y41.p<com.yandex.div.json.e, JSONObject, h> f376086j;

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final H21.a<com.yandex.div.json.expressions.b<Long>> f376087a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final H21.a<com.yandex.div.json.expressions.b<Long>> f376088b;

        /* compiled from: DivVideoSourceTemplate.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/o8$h;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/o8$h;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, h> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f376089l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final h invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
                return new h(eVar, null, false, jSONObject, 6, null);
            }
        }

        /* compiled from: DivVideoSourceTemplate.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f376090l = new b();

            public b() {
                super(3);
            }

            @Override // Y41.q
            public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
                return C38107c.c(jSONObject, str, com.yandex.div.internal.parser.y.f370151e, h.f376081e, eVar.getF370579a(), com.yandex.div.internal.parser.E.f370132b);
            }
        }

        /* compiled from: DivVideoSourceTemplate.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

            /* renamed from: l, reason: collision with root package name */
            public static final /* synthetic */ int f376091l = 0;

            static {
                new c();
            }

            public c() {
                super(3);
            }

            @Override // Y41.q
            public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
                JSONObject jSONObject2 = jSONObject;
                eVar.getClass();
                return (String) C38107c.a(jSONObject2, str, C38107c.f370141c, C38107c.f370139a);
            }
        }

        /* compiled from: DivVideoSourceTemplate.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

            /* renamed from: l, reason: collision with root package name */
            public static final d f376092l = new d();

            public d() {
                super(3);
            }

            @Override // Y41.q
            public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
                return C38107c.c(jSONObject, str, com.yandex.div.internal.parser.y.f370151e, h.f376083g, eVar.getF370579a(), com.yandex.div.internal.parser.E.f370132b);
            }
        }

        /* compiled from: DivVideoSourceTemplate.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/yandex/div2/o8$h$e;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "HEIGHT_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "HEIGHT_VALIDATOR", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "WIDTH_TEMPLATE_VALIDATOR", "WIDTH_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class e {
            public /* synthetic */ e(C42822w c42822w) {
                this();
            }

            public e() {
            }
        }

        static {
            int i12 = c.f376091l;
            f376085i = d.f376092l;
            f376086j = a.f376089l;
        }

        public h(com.yandex.div.json.e eVar, h hVar, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
            hVar = (i12 & 2) != 0 ? null : hVar;
            z12 = (i12 & 4) != 0 ? false : z12;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            H21.a<com.yandex.div.json.expressions.b<Long>> aVar = hVar == null ? null : hVar.f376087a;
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            this.f376087a = com.yandex.div.internal.parser.s.d(jSONObject, "height", z12, aVar, lVar, f376080d, f370579a, dVar);
            this.f376088b = com.yandex.div.internal.parser.s.d(jSONObject, "width", z12, hVar != null ? hVar.f376088b : null, lVar, f376082f, f370579a, dVar);
        }

        @Override // com.yandex.div.json.c
        public final com.yandex.div.json.b a(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new n8.c((com.yandex.div.json.expressions.b) H21.b.b(this.f376087a, eVar, "height", jSONObject, f376084h), (com.yandex.div.json.expressions.b) H21.b.b(this.f376088b, eVar, "width", jSONObject, f376085i));
        }
    }

    static {
        int i12 = e.f376077l;
        f376067i = f.f376078l;
        f376068j = b.f376074l;
    }

    public o8(com.yandex.div.json.e eVar, o8 o8Var, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        o8Var = (i12 & 2) != 0 ? null : o8Var;
        z12 = (i12 & 4) != 0 ? false : z12;
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        H21.a<com.yandex.div.json.expressions.b<Long>> aVar = o8Var == null ? null : o8Var.f376069a;
        Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
        E.d dVar = com.yandex.div.internal.parser.E.f370132b;
        C38106b c38106b = C38107c.f370139a;
        this.f376069a = com.yandex.div.internal.parser.s.i(jSONObject, "bitrate", z12, aVar, lVar, c38106b, f370579a, dVar);
        this.f376070b = com.yandex.div.internal.parser.s.d(jSONObject, "mime_type", z12, o8Var == null ? null : o8Var.f376070b, C38107c.f370141c, c38106b, f370579a, com.yandex.div.internal.parser.E.f370133c);
        H21.a<h> aVar2 = o8Var == null ? null : o8Var.f376071c;
        h.f376079c.getClass();
        this.f376071c = com.yandex.div.internal.parser.s.g(jSONObject, CommonCode.MapKey.HAS_RESOLUTION, z12, aVar2, h.f376086j, f370579a, eVar);
        this.f376072d = com.yandex.div.internal.parser.s.d(jSONObject, ContextActionHandler.Link.URL, z12, o8Var != null ? o8Var.f376072d : null, com.yandex.div.internal.parser.y.f370148b, c38106b, f370579a, com.yandex.div.internal.parser.E.f370135e);
    }

    @Override // com.yandex.div.json.c
    public final com.yandex.div.json.b a(com.yandex.div.json.e eVar, JSONObject jSONObject) {
        return new n8((com.yandex.div.json.expressions.b) H21.b.d(this.f376069a, eVar, "bitrate", jSONObject, f376064f), (com.yandex.div.json.expressions.b) H21.b.b(this.f376070b, eVar, "mime_type", jSONObject, f376065g), (n8.c) H21.b.f(this.f376071c, eVar, CommonCode.MapKey.HAS_RESOLUTION, jSONObject, f376066h), (com.yandex.div.json.expressions.b) H21.b.b(this.f376072d, eVar, ContextActionHandler.Link.URL, jSONObject, f376067i));
    }
}
