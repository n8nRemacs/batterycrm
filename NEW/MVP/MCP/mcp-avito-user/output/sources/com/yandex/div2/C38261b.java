package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38107c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: BoolVariableTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/b;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/a;", "e", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38261b implements com.yandex.div.json.b, com.yandex.div.json.c<C38231a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final com.google.firebase.components.g f374384c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final com.google.firebase.components.g f374385d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, String> f374386e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, Boolean> f374387f;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<String> f374388a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<Boolean> f374389b;

    /* compiled from: BoolVariableTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/b;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.b$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38261b> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f374390l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38261b invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new C38261b(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: BoolVariableTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.b$b, reason: collision with other inner class name */
    public static final class C10940b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final C10940b f374391l = new C10940b();

        public C10940b() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.google.firebase.components.g gVar = C38261b.f374385d;
            eVar.getClass();
            return (String) C38107c.a(jSONObject2, str, C38107c.f370141c, gVar);
        }
    }

    /* compiled from: BoolVariableTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.b$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f374392l = 0;

        static {
            new c();
        }

        public c() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return (String) C38107c.h(jSONObject, str, C38107c.f370141c, C38107c.f370139a, eVar.getF370579a());
        }
    }

    /* compiled from: BoolVariableTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.b$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f374393l = new d();

        public d() {
            super(3);
        }

        @Override // Y41.q
        public final Boolean invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            Y41.l<Object, Boolean> lVar = com.yandex.div.internal.parser.y.f370149c;
            eVar.getClass();
            return (Boolean) C38107c.a(jSONObject2, str, lVar, C38107c.f370139a);
        }
    }

    /* compiled from: BoolVariableTemplate.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/b$e;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "NAME_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "NAME_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.b$e */
    public static final class e {
        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
        }
    }

    static {
        new e(null);
        f374384c = new com.google.firebase.components.g(20);
        f374385d = new com.google.firebase.components.g(21);
        f374386e = C10940b.f374391l;
        int i12 = c.f374392l;
        f374387f = d.f374393l;
        int i13 = a.f374390l;
    }

    public /* synthetic */ C38261b(com.yandex.div.json.e eVar, C38261b c38261b, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        this(eVar, (i12 & 2) != 0 ? null : c38261b, (i12 & 4) != 0 ? false : z12, jSONObject);
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C38231a a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        return new C38231a((String) H21.b.b(this.f374388a, eVar, "name", jSONObject, f374386e), ((Boolean) H21.b.b(this.f374389b, eVar, "value", jSONObject, f374387f)).booleanValue());
    }

    public C38261b(@Y61.k com.yandex.div.json.e eVar, @Y61.l C38261b c38261b, boolean z12, @Y61.k JSONObject jSONObject) {
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        this.f374388a = com.yandex.div.internal.parser.s.b(jSONObject, "name", z12, c38261b == null ? null : c38261b.f374388a, C38107c.f370141c, f374384c, f370579a);
        this.f374389b = com.yandex.div.internal.parser.s.b(jSONObject, "value", z12, c38261b == null ? null : c38261b.f374389b, com.yandex.div.internal.parser.y.f370149c, C38107c.f370139a, f370579a);
    }
}
