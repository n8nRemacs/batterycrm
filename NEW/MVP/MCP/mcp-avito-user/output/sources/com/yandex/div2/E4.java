package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivPointTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/E4;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/D4;", "d", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class E4 implements com.yandex.div.json.b, com.yandex.div.json.c<D4> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final d f372231c = new d(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, O0> f372232d = b.f372238l;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, O0> f372233e = c.f372239l;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, E4> f372234f = a.f372237l;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<Q0> f372235a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<Q0> f372236b;

    /* compiled from: DivPointTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/E4;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/E4;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, E4> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f372237l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final E4 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new E4(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivPointTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/O0;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/O0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, O0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f372238l = new b();

        public b() {
            super(3);
        }

        @Override // Y41.q
        public final O0 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            O0.f373039c.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, O0> pVar = O0.f373042f;
            eVar2.getClass();
            return (O0) C38107c.b(jSONObject2, str, pVar, eVar2);
        }
    }

    /* compiled from: DivPointTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/O0;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/O0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, O0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f372239l = new c();

        public c() {
            super(3);
        }

        @Override // Y41.q
        public final O0 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            O0.f373039c.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, O0> pVar = O0.f373042f;
            eVar2.getClass();
            return (O0) C38107c.b(jSONObject2, str, pVar, eVar2);
        }
    }

    /* compiled from: DivPointTemplate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/E4$d;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    public E4(com.yandex.div.json.e eVar, E4 e42, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        e42 = (i12 & 2) != 0 ? null : e42;
        z12 = (i12 & 4) != 0 ? false : z12;
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        H21.a<Q0> aVar = e42 == null ? null : e42.f372235a;
        Q0.f373459c.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, Q0> pVar = Q0.f373464h;
        this.f372235a = com.yandex.div.internal.parser.s.c(jSONObject, "x", z12, aVar, pVar, f370579a, eVar);
        this.f372236b = com.yandex.div.internal.parser.s.c(jSONObject, "y", z12, e42 != null ? e42.f372236b : null, pVar, f370579a, eVar);
    }

    @Override // com.yandex.div.json.c
    public final com.yandex.div.json.b a(com.yandex.div.json.e eVar, JSONObject jSONObject) {
        return new D4((O0) H21.b.h(this.f372235a, eVar, "x", jSONObject, f372232d), (O0) H21.b.h(this.f372236b, eVar, "y", jSONObject, f372233e));
    }
}
