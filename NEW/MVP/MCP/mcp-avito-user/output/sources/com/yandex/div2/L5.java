package com.yandex.div2;

import com.yandex.div2.K5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivSizeTemplate.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0004\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/yandex/div2/L5;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/K5;", "<init>", "()V", "b", "c", "d", "e", "Lcom/yandex/div2/L5$c;", "Lcom/yandex/div2/L5$d;", "Lcom/yandex/div2/L5$e;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class L5 implements com.yandex.div.json.b, com.yandex.div.json.c<K5> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f372755a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, L5> f372756b = a.f372757l;

    /* compiled from: DivSizeTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/L5;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/L5;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, L5> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f372757l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final L5 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            L5 cVar;
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            L5.f372755a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            com.yandex.div.json.c cVar2 = eVar2.a().get(str);
            L5 l52 = cVar2 instanceof L5 ? (L5) cVar2 : null;
            if (l52 != null) {
                if (l52 instanceof c) {
                    str = "fixed";
                } else if (l52 instanceof d) {
                    str = "match_parent";
                } else {
                    if (!(l52 instanceof e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "wrap_content";
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode == 97445748) {
                if (str.equals("fixed")) {
                    cVar = new c(new C38549s1(eVar2, (C38549s1) (l52 != null ? l52.c() : null), false, jSONObject2));
                    return cVar;
                }
                throw com.yandex.div.json.j.m(jSONObject2, "type", str);
            }
            if (iHashCode == 343327108) {
                if (str.equals("wrap_content")) {
                    cVar = new e(new A8(eVar2, (A8) (l52 != null ? l52.c() : null), false, jSONObject2));
                    return cVar;
                }
                throw com.yandex.div.json.j.m(jSONObject2, "type", str);
            }
            if (iHashCode == 1386124388 && str.equals("match_parent")) {
                cVar = new d(new V3(eVar2, (V3) (l52 != null ? l52.c() : null), false, jSONObject2));
                return cVar;
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: DivSizeTemplate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/L5$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivSizeTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/L5$c;", "Lcom/yandex/div2/L5;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c extends L5 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38549s1 f372758c;

        public c(@Y61.k C38549s1 c38549s1) {
            super(null);
            this.f372758c = c38549s1;
        }
    }

    /* compiled from: DivSizeTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/L5$d;", "Lcom/yandex/div2/L5;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d extends L5 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final V3 f372759c;

        public d(@Y61.k V3 v32) {
            super(null);
            this.f372759c = v32;
        }
    }

    /* compiled from: DivSizeTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/L5$e;", "Lcom/yandex/div2/L5;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class e extends L5 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final A8 f372760c;

        public e(@Y61.k A8 a82) {
            super(null);
            this.f372760c = a82;
        }
    }

    public /* synthetic */ L5(C42822w c42822w) {
        this();
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final K5 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        if (this instanceof c) {
            return new K5.c(((c) this).f372758c.a(eVar, jSONObject));
        }
        if (!(this instanceof d)) {
            if (this instanceof e) {
                return new K5.e(((e) this).f372760c.a(eVar, jSONObject));
            }
            throw new NoWhenBranchMatchedException();
        }
        V3 v32 = ((d) this).f372759c;
        v32.getClass();
        return new K5.d(new U3((com.yandex.div.json.expressions.b) H21.b.d(v32.f373721a, eVar, "weight", jSONObject, V3.f373720d)));
    }

    @Y61.k
    public final Object c() {
        if (this instanceof c) {
            return ((c) this).f372758c;
        }
        if (this instanceof d) {
            return ((d) this).f372759c;
        }
        if (this instanceof e) {
            return ((e) this).f372760c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public L5() {
    }
}
