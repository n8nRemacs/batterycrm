package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38107c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivPercentageSize.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/t4;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.t4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38561t4 implements com.yandex.div.json.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final b f376603b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final O3 f376604c = new O3(23);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, C38561t4> f376605d = a.f376607l;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> f376606a;

    /* compiled from: DivPercentageSize.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/t4;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/t4;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.t4$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38561t4> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f376607l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38561t4 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            C38561t4.f376603b.getClass();
            return new C38561t4(C38107c.c(jSONObject2, "value", com.yandex.div.internal.parser.y.f370150d, C38561t4.f376604c, eVar.getF370579a(), com.yandex.div.internal.parser.E.f370134d));
        }
    }

    /* compiled from: DivPercentageSize.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/yandex/div2/t4$b;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/F;", "", "VALUE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "VALUE_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.t4$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @C21.b
    public C38561t4(@Y61.k com.yandex.div.json.expressions.b<Double> bVar) {
        this.f376606a = bVar;
    }
}
