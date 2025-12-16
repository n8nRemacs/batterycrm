package com.yandex.div2;

import com.yandex.div2.M4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRadiusTemplate.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/N4;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/M4;", "<init>", "()V", "b", "c", "d", "Lcom/yandex/div2/N4$c;", "Lcom/yandex/div2/N4$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class N4 implements com.yandex.div.json.b, com.yandex.div.json.c<M4> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f373013a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, N4> f373014b = a.f373015l;

    /* compiled from: DivRadialGradientRadiusTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/N4;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/N4;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, N4> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f373015l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final N4 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            N4 dVar;
            Object obj;
            Object obj2;
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            N4.f373013a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            com.yandex.div.json.c cVar = eVar2.a().get(str);
            Object obj3 = null;
            N4 n42 = cVar instanceof N4 ? (N4) cVar : null;
            if (n42 != null) {
                if (n42 instanceof c) {
                    str = "fixed";
                } else {
                    if (!(n42 instanceof d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "relative";
                }
            }
            if (str.equals("fixed")) {
                if (n42 != null) {
                    if (n42 instanceof c) {
                        obj2 = ((c) n42).f373016c;
                    } else {
                        if (!(n42 instanceof d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = ((d) n42).f373017c;
                    }
                    obj3 = obj2;
                }
                dVar = new c(new C38549s1(eVar2, (C38549s1) obj3, false, jSONObject2));
            } else {
                if (!str.equals("relative")) {
                    throw com.yandex.div.json.j.m(jSONObject2, "type", str);
                }
                if (n42 != null) {
                    if (n42 instanceof c) {
                        obj = ((c) n42).f373016c;
                    } else {
                        if (!(n42 instanceof d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj = ((d) n42).f373017c;
                    }
                    obj3 = obj;
                }
                dVar = new d(new R4(eVar2, (R4) obj3, false, jSONObject2));
            }
            return dVar;
        }
    }

    /* compiled from: DivRadialGradientRadiusTemplate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/N4$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivRadialGradientRadiusTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/N4$c;", "Lcom/yandex/div2/N4;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c extends N4 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38549s1 f373016c;

        public c(@Y61.k C38549s1 c38549s1) {
            super(null);
            this.f373016c = c38549s1;
        }
    }

    /* compiled from: DivRadialGradientRadiusTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/N4$d;", "Lcom/yandex/div2/N4;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d extends N4 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final R4 f373017c;

        public d(@Y61.k R4 r42) {
            super(null);
            this.f373017c = r42;
        }
    }

    public /* synthetic */ N4(C42822w c42822w) {
        this();
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final M4 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        if (this instanceof c) {
            return new M4.c(((c) this).f373016c.a(eVar, jSONObject));
        }
        if (!(this instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        R4 r42 = ((d) this).f373017c;
        r42.getClass();
        return new M4.d(new DivRadialGradientRelativeRadius((com.yandex.div.json.expressions.b) H21.b.b(r42.f373479a, eVar, "value", jSONObject, R4.f373478c)));
    }

    public N4() {
    }
}
