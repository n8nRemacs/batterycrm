package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38107c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivCircleShape.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/V;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class V implements com.yandex.div.json.b {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final b f373699d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C38502q1 f373700e = new C38502q1(null, com.google.firebase.components.g.i(10, com.yandex.div.json.expressions.b.f370552a), 1, null);

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Integer> f373701a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final C38502q1 f373702b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final C38656z6 f373703c;

    /* compiled from: DivCircleShape.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/V;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/V;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, V> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f373704l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final V invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            V.f373699d.getClass();
            return b.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivCircleShape.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/div2/V$b;", "", "<init>", "()V", "Lcom/yandex/div2/q1;", "RADIUS_DEFAULT_VALUE", "Lcom/yandex/div2/q1;", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static V a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b bVarI = C38107c.i(jSONObject, "background_color", com.yandex.div.internal.parser.y.f370147a, C38107c.f370139a, f370579a, null, com.yandex.div.internal.parser.E.f370136f);
            C38502q1.f376146c.getClass();
            C38502q1 c38502q1 = (C38502q1) C38107c.g(jSONObject, "radius", C38502q1.f376150g, f370579a, eVar);
            if (c38502q1 == null) {
                c38502q1 = V.f373700e;
            }
            C38656z6.f377427d.getClass();
            return new V(bVarI, c38502q1, (C38656z6) C38107c.g(jSONObject, "stroke", C38656z6.f377432i, f370579a, eVar));
        }

        public b() {
        }
    }

    static {
        int i12 = a.f373704l;
    }

    @C21.b
    public V() {
        this(null, null, null, 7, null);
    }

    @C21.b
    public V(@Y61.l com.yandex.div.json.expressions.b<Integer> bVar, @Y61.k C38502q1 c38502q1, @Y61.l C38656z6 c38656z6) {
        this.f373701a = bVar;
        this.f373702b = c38502q1;
        this.f373703c = c38656z6;
    }

    public /* synthetic */ V(com.yandex.div.json.expressions.b bVar, C38502q1 c38502q1, C38656z6 c38656z6, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : bVar, (i12 & 2) != 0 ? f373700e : c38502q1, (i12 & 4) != 0 ? null : c38656z6);
    }
}
