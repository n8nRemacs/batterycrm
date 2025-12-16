package com.yandex.div2;

import com.yandex.div2.I3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivInputValidatorTemplate.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/Q3;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/I3;", "<init>", "()V", "b", "c", "d", "Lcom/yandex/div2/Q3$d;", "Lcom/yandex/div2/Q3$c;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class Q3 implements com.yandex.div.json.b, com.yandex.div.json.c<I3> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f373471a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, Q3> f373472b = a.f373473l;

    /* compiled from: DivInputValidatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/Q3;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/Q3;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, Q3> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f373473l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Q3 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            Q3 cVar;
            Object obj;
            Object obj2;
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            Q3.f373471a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            com.yandex.div.json.c cVar2 = eVar2.a().get(str);
            Object obj3 = null;
            Q3 q32 = cVar2 instanceof Q3 ? (Q3) cVar2 : null;
            if (q32 != null) {
                if (q32 instanceof d) {
                    str = "regex";
                } else {
                    if (!(q32 instanceof c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "expression";
                }
            }
            if (str.equals("regex")) {
                if (q32 != null) {
                    if (q32 instanceof d) {
                        obj2 = ((d) q32).f373475c;
                    } else {
                        if (!(q32 instanceof c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = ((c) q32).f373474c;
                    }
                    obj3 = obj2;
                }
                cVar = new d(new P3(eVar2, (P3) obj3, false, jSONObject2));
            } else {
                if (!str.equals("expression")) {
                    throw com.yandex.div.json.j.m(jSONObject2, "type", str);
                }
                if (q32 != null) {
                    if (q32 instanceof d) {
                        obj = ((d) q32).f373475c;
                    } else {
                        if (!(q32 instanceof c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj = ((c) q32).f373474c;
                    }
                    obj3 = obj;
                }
                cVar = new c(new M3(eVar2, (M3) obj3, false, jSONObject2));
            }
            return cVar;
        }
    }

    /* compiled from: DivInputValidatorTemplate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/Q3$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivInputValidatorTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/Q3$c;", "Lcom/yandex/div2/Q3;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c extends Q3 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final M3 f373474c;

        public c(@Y61.k M3 m32) {
            super(null);
            this.f373474c = m32;
        }
    }

    /* compiled from: DivInputValidatorTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/Q3$d;", "Lcom/yandex/div2/Q3;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d extends Q3 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final P3 f373475c;

        public d(@Y61.k P3 p32) {
            super(null);
            this.f373475c = p32;
        }
    }

    public /* synthetic */ Q3(C42822w c42822w) {
        this();
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final I3 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        if (this instanceof d) {
            ((d) this).f373475c.a(eVar, jSONObject);
            return new I3.d(null);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        ((c) this).f373474c.a(eVar, jSONObject);
        return new I3.c(null);
    }

    public Q3() {
    }
}
