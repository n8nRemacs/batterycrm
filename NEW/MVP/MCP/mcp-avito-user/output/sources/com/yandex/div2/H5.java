package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38107c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivShapeDrawable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/H5;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class H5 implements com.yandex.div.json.b {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final b f372529d = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Integer> f372530a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final G5 f372531b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final C38656z6 f372532c;

    /* compiled from: DivShapeDrawable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/H5;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/H5;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, H5> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f372533l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final H5 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            H5.f372529d.getClass();
            return b.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivShapeDrawable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div2/H5$b;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static H5 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b bVarC = C38107c.c(jSONObject, "color", com.yandex.div.internal.parser.y.f370147a, C38107c.f370139a, f370579a, com.yandex.div.internal.parser.E.f370136f);
            G5.f372487a.getClass();
            G5 g52 = (G5) C38107c.b(jSONObject, "shape", G5.f372488b, eVar);
            C38656z6.f377427d.getClass();
            return new H5(bVarC, g52, (C38656z6) C38107c.g(jSONObject, "stroke", C38656z6.f377432i, f370579a, eVar));
        }

        public b() {
        }
    }

    static {
        int i12 = a.f372533l;
    }

    @C21.b
    public H5(@Y61.k com.yandex.div.json.expressions.b<Integer> bVar, @Y61.k G5 g52, @Y61.l C38656z6 c38656z6) {
        this.f372530a = bVar;
        this.f372531b = g52;
        this.f372532c = c38656z6;
    }

    public /* synthetic */ H5(com.yandex.div.json.expressions.b bVar, G5 g52, C38656z6 c38656z6, int i12, C42822w c42822w) {
        this(bVar, g52, (i12 & 4) != 0 ? null : c38656z6);
    }
}
