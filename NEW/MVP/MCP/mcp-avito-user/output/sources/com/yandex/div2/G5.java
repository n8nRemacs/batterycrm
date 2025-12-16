package com.yandex.div2;

import com.yandex.div2.U4;
import com.yandex.div2.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivShape.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/div2/G5;", "Lcom/yandex/div/json/b;", "<init>", "()V", "a", "c", "d", "Lcom/yandex/div2/G5$d;", "Lcom/yandex/div2/G5$a;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class G5 implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f372487a = new c(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, G5> f372488b = b.f372490l;

    /* compiled from: DivShape.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/G5$a;", "Lcom/yandex/div2/G5;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class a extends G5 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final V f372489c;

        public a(@Y61.k V v12) {
            super(null);
            this.f372489c = v12;
        }
    }

    /* compiled from: DivShape.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/G5;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/G5;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, G5> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f372490l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G5 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            G5.f372487a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            if (str.equals("rounded_rectangle")) {
                U4.f373687f.getClass();
                return new d(U4.b.a(eVar2, jSONObject2));
            }
            if (str.equals("circle")) {
                V.f373699d.getClass();
                return new a(V.b.a(eVar2, jSONObject2));
            }
            com.yandex.div.json.c cVarA = eVar2.a().a(str, jSONObject2);
            J5 j52 = cVarA instanceof J5 ? (J5) cVarA : null;
            if (j52 != null) {
                return j52.a(eVar2, jSONObject2);
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: DivShape.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/G5$c;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: DivShape.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/G5$d;", "Lcom/yandex/div2/G5;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d extends G5 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final U4 f372491c;

        public d(@Y61.k U4 u42) {
            super(null);
            this.f372491c = u42;
        }
    }

    public /* synthetic */ G5(C42822w c42822w) {
        this();
    }

    public G5() {
    }
}
