package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38107c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivSolidBackgroundTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/i6;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/h6;", "d", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.i6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38381i6 implements com.yandex.div.json.b, com.yandex.div.json.c<C38371h6> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Integer>> f375307b;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Integer>> f375308a;

    /* compiled from: DivSolidBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.i6$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Integer>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f375309l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Integer> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.c(jSONObject, str, com.yandex.div.internal.parser.y.f370147a, C38107c.f370139a, eVar.getF370579a(), com.yandex.div.internal.parser.E.f370136f);
        }
    }

    /* compiled from: DivSolidBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/i6;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/i6;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.i6$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38381i6> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f375310l = 0;

        static {
            new b();
        }

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final C38381i6 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new C38381i6(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivSolidBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.i6$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f375311l = 0;

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

    /* compiled from: DivSolidBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div2/i6$d;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.i6$d */
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    static {
        new d(null);
        f375307b = a.f375309l;
        int i12 = c.f375311l;
        int i13 = b.f375310l;
    }

    public /* synthetic */ C38381i6(com.yandex.div.json.e eVar, C38381i6 c38381i6, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        this(eVar, (i12 & 2) != 0 ? null : c38381i6, (i12 & 4) != 0 ? false : z12, jSONObject);
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C38371h6 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        return new C38371h6((com.yandex.div.json.expressions.b) H21.b.b(this.f375308a, eVar, "color", jSONObject, f375307b));
    }

    public C38381i6(@Y61.k com.yandex.div.json.e eVar, @Y61.l C38381i6 c38381i6, boolean z12, @Y61.k JSONObject jSONObject) {
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        this.f375308a = com.yandex.div.internal.parser.s.d(jSONObject, "color", z12, c38381i6 == null ? null : c38381i6.f375308a, com.yandex.div.internal.parser.y.f370147a, C38107c.f370139a, f370579a, com.yandex.div.internal.parser.E.f370136f);
    }
}
