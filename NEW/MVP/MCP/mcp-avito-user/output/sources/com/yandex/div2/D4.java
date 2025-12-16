package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivPoint.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/D4;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class D4 implements com.yandex.div.json.b {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f371168c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, D4> f371169d = a.f371172l;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final O0 f371170a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final O0 f371171b;

    /* compiled from: DivPoint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/D4;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/D4;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, D4> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f371172l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final D4 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            D4.f371168c.getClass();
            eVar2.getClass();
            O0.f373039c.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, O0> pVar = O0.f373042f;
            return new D4((O0) C38107c.b(jSONObject2, "x", pVar, eVar2), (O0) C38107c.b(jSONObject2, "y", pVar, eVar2));
        }
    }

    /* compiled from: DivPoint.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/D4$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @C21.b
    public D4(@Y61.k O0 o02, @Y61.k O0 o03) {
        this.f371170a = o02;
        this.f371171b = o03;
    }
}
