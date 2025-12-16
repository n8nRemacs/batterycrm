package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38107c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: ColorVariable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/c;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38271c implements com.yandex.div.json.b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f374682c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final com.google.firebase.components.g f374683d = new com.google.firebase.components.g(22);

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final String f374684a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    public final int f374685b;

    /* compiled from: ColorVariable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/c;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/c;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.c$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38271c> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f374686l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38271c invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            C38271c.f374682c.getClass();
            return b.a(eVar, jSONObject);
        }
    }

    /* compiled from: ColorVariable.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/c$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "NAME_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "NAME_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.c$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static C38271c a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            eVar.getClass();
            return new C38271c((String) C38107c.a(jSONObject, "name", C38107c.f370141c, C38271c.f374683d), ((Number) C38107c.a(jSONObject, "value", com.yandex.div.internal.parser.y.f370147a, C38107c.f370139a)).intValue());
        }

        public b() {
        }
    }

    static {
        int i12 = a.f374686l;
    }

    @C21.b
    public C38271c(@Y61.k String str, int i12) {
        this.f374684a = str;
        this.f374685b = i12;
    }
}
