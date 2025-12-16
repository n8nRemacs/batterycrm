package com.yandex.div2;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38107c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivNinePatchBackgroundTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/Z3;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/Y3;", "e", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class Z3 implements com.yandex.div.json.b, com.yandex.div.json.c<Y3> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C38374i f374079c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> f374080d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, C38374i> f374081e;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Uri>> f374082a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38384j> f374083b;

    /* compiled from: DivNinePatchBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/Z3;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/Z3;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, Z3> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f374084l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Z3 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new Z3(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivNinePatchBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f374085l = new b();

        public b() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Uri> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.c(jSONObject, str, com.yandex.div.internal.parser.y.f370148b, C38107c.f370139a, eVar.getF370579a(), com.yandex.div.internal.parser.E.f370135e);
        }
    }

    /* compiled from: DivNinePatchBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/i;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/i;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, C38374i> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f374086l = new c();

        public c() {
            super(3);
        }

        @Override // Y41.q
        public final C38374i invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            C38374i.f375287e.getClass();
            C38374i c38374i = (C38374i) C38107c.g(jSONObject, str, C38374i.f375296n, eVar2.getF370579a(), eVar2);
            return c38374i == null ? Z3.f374079c : c38374i;
        }
    }

    /* compiled from: DivNinePatchBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f374087l = 0;

        static {
            new d();
        }

        public d() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            eVar.getClass();
            return (String) C38107c.a(jSONObject2, str, C38107c.f370141c, C38107c.f370139a);
        }
    }

    /* compiled from: DivNinePatchBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/div2/Z3$e;", "", "<init>", "()V", "Lcom/yandex/div2/i;", "INSETS_DEFAULT_VALUE", "Lcom/yandex/div2/i;", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e {
        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
        }
    }

    static {
        new e(null);
        f374079c = new C38374i(null, null, null, null, 15, null);
        f374080d = b.f374085l;
        f374081e = c.f374086l;
        int i12 = d.f374087l;
        int i13 = a.f374084l;
    }

    public /* synthetic */ Z3(com.yandex.div.json.e eVar, Z3 z32, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        this(eVar, (i12 & 2) != 0 ? null : z32, (i12 & 4) != 0 ? false : z12, jSONObject);
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Y3 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        com.yandex.div.json.expressions.b bVar = (com.yandex.div.json.expressions.b) H21.b.b(this.f374082a, eVar, "image_url", jSONObject, f374080d);
        C38374i c38374i = (C38374i) H21.b.h(this.f374083b, eVar, "insets", jSONObject, f374081e);
        if (c38374i == null) {
            c38374i = f374079c;
        }
        return new Y3(bVar, c38374i);
    }

    public Z3(@Y61.k com.yandex.div.json.e eVar, @Y61.l Z3 z32, boolean z12, @Y61.k JSONObject jSONObject) {
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        this.f374082a = com.yandex.div.internal.parser.s.d(jSONObject, "image_url", z12, z32 == null ? null : z32.f374082a, com.yandex.div.internal.parser.y.f370148b, C38107c.f370139a, f370579a, com.yandex.div.internal.parser.E.f370135e);
        H21.a<C38384j> aVar = z32 == null ? null : z32.f374083b;
        C38384j.f375387e.getClass();
        this.f374083b = com.yandex.div.internal.parser.s.g(jSONObject, "insets", z12, aVar, C38384j.f375404v, f370579a, eVar);
    }
}
