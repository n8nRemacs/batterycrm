package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import com.yandex.div2.I4;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivRadialGradientCenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/div2/G4;", "Lcom/yandex/div/json/b;", "<init>", "()V", "b", "c", "d", "Lcom/yandex/div2/G4$c;", "Lcom/yandex/div2/G4$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class G4 implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f372482a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, G4> f372483b = a.f372484l;

    /* compiled from: DivRadialGradientCenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/G4;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/G4;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, G4> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f372484l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G4 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            G4.f372482a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            if (str.equals("fixed")) {
                I4.f372584c.getClass();
                return new c(I4.c.a(eVar2, jSONObject2));
            }
            if (str.equals("relative")) {
                O4.f373131b.getClass();
                return new d(new O4(C38107c.c(jSONObject2, "value", com.yandex.div.internal.parser.y.f370150d, C38107c.f370139a, eVar2.getF370579a(), com.yandex.div.internal.parser.E.f370134d)));
            }
            com.yandex.div.json.c cVarA = eVar2.a().a(str, jSONObject2);
            H4 h42 = cVarA instanceof H4 ? (H4) cVarA : null;
            if (h42 != null) {
                return h42.a(eVar2, jSONObject2);
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: DivRadialGradientCenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/G4$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivRadialGradientCenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/G4$c;", "Lcom/yandex/div2/G4;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c extends G4 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final I4 f372485c;

        public c(@Y61.k I4 i42) {
            super(null);
            this.f372485c = i42;
        }
    }

    /* compiled from: DivRadialGradientCenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/G4$d;", "Lcom/yandex/div2/G4;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d extends G4 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final O4 f372486c;

        public d(@Y61.k O4 o42) {
            super(null);
            this.f372486c = o42;
        }
    }

    public /* synthetic */ G4(C42822w c42822w) {
        this();
    }

    public G4() {
    }
}
