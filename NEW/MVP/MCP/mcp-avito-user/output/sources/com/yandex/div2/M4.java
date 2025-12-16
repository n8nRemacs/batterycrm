package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import com.yandex.div2.C38502q1;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRadius.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/div2/M4;", "Lcom/yandex/div/json/b;", "<init>", "()V", "b", "c", "d", "Lcom/yandex/div2/M4$c;", "Lcom/yandex/div2/M4$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class M4 implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f372799a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, M4> f372800b = a.f372801l;

    /* compiled from: DivRadialGradientRadius.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/M4;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/M4;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, M4> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f372801l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final M4 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            M4.f372799a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            if (str.equals("fixed")) {
                C38502q1.f376146c.getClass();
                return new c(C38502q1.c.a(eVar2, jSONObject2));
            }
            if (str.equals("relative")) {
                DivRadialGradientRelativeRadius.f371862b.getClass();
                com.yandex.div.json.i f370579a = eVar2.getF370579a();
                DivRadialGradientRelativeRadius.Value.f371865c.getClass();
                return new d(new DivRadialGradientRelativeRadius(C38107c.c(jSONObject2, "value", DivRadialGradientRelativeRadius.Value.f371866d, C38107c.f370139a, f370579a, DivRadialGradientRelativeRadius.f371863c)));
            }
            com.yandex.div.json.c cVarA = eVar2.a().a(str, jSONObject2);
            N4 n42 = cVarA instanceof N4 ? (N4) cVarA : null;
            if (n42 != null) {
                return n42.a(eVar2, jSONObject2);
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: DivRadialGradientRadius.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/M4$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivRadialGradientRadius.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/M4$c;", "Lcom/yandex/div2/M4;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c extends M4 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38502q1 f372802c;

        public c(@Y61.k C38502q1 c38502q1) {
            super(null);
            this.f372802c = c38502q1;
        }
    }

    /* compiled from: DivRadialGradientRadius.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/M4$d;", "Lcom/yandex/div2/M4;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d extends M4 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DivRadialGradientRelativeRadius f372803c;

        public d(@Y61.k DivRadialGradientRelativeRadius divRadialGradientRelativeRadius) {
            super(null);
            this.f372803c = divRadialGradientRelativeRadius;
        }
    }

    public /* synthetic */ M4(C42822w c42822w) {
        this();
    }

    public M4() {
    }
}
