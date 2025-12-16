package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38105a;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.E;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivCurrencyInputMask.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/u0;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div2/w3;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.u0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38566u0 implements com.yandex.div.json.b, InterfaceC38587w3 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f376613c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C38492p0 f376614d = new C38492p0(10);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C38492p0 f376615e = new C38492p0(11);

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<String> f376616a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f376617b;

    /* compiled from: DivCurrencyInputMask.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/u0;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/u0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.u0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38566u0> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f376618l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38566u0 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            C38566u0.f376613c.getClass();
            return b.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivCurrencyInputMask.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/div2/u0$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "LOCALE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "LOCALE_VALIDATOR", "RAW_TEXT_VARIABLE_TEMPLATE_VALIDATOR", "RAW_TEXT_VARIABLE_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.u0$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static C38566u0 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            C38492p0 c38492p0 = C38566u0.f376614d;
            E.e eVar2 = com.yandex.div.internal.parser.E.f370133c;
            C38105a c38105a = C38107c.f370141c;
            return new C38566u0(C38107c.i(jSONObject, "locale", c38105a, c38492p0, f370579a, null, eVar2), (String) C38107c.a(jSONObject, "raw_text_variable", c38105a, C38566u0.f376615e));
        }

        public b() {
        }
    }

    static {
        int i12 = a.f376618l;
    }

    @C21.b
    public C38566u0(@Y61.l com.yandex.div.json.expressions.b<String> bVar, @Y61.k String str) {
        this.f376616a = bVar;
        this.f376617b = str;
    }

    @Override // com.yandex.div2.InterfaceC38587w3
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF376617b() {
        return this.f376617b;
    }

    public /* synthetic */ C38566u0(com.yandex.div.json.expressions.b bVar, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : bVar, str);
    }
}
