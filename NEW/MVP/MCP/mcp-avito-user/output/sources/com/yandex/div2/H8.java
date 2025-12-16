package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38105a;
import com.yandex.div.internal.parser.C38107c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: StrVariable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/H8;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class H8 implements com.yandex.div.json.b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f372534c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final D8 f372535d = new D8(5);

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final String f372536a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final String f372537b;

    /* compiled from: StrVariable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/H8;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/H8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, H8> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f372538l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final H8 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            H8.f372534c.getClass();
            return b.a(eVar, jSONObject);
        }
    }

    /* compiled from: StrVariable.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/H8$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "NAME_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "NAME_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static H8 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            eVar.getClass();
            D8 d82 = H8.f372535d;
            C38105a c38105a = C38107c.f370141c;
            return new H8((String) C38107c.a(jSONObject, "name", c38105a, d82), (String) C38107c.a(jSONObject, "value", c38105a, C38107c.f370139a));
        }

        public b() {
        }
    }

    static {
        int i12 = a.f372538l;
    }

    @C21.b
    public H8(@Y61.k String str, @Y61.k String str2) {
        this.f372536a = str;
        this.f372537b = str2;
    }
}
