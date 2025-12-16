package com.yandex.div2;

import com.yandex.div2.T;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivChangeTransitionTemplate.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/U;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/T;", "<init>", "()V", "a", "c", "d", "Lcom/yandex/div2/U$d;", "Lcom/yandex/div2/U$a;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class U implements com.yandex.div.json.b, com.yandex.div.json.c<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f373671a = new c(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, U> f373672b = b.f373674l;

    /* compiled from: DivChangeTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/U$a;", "Lcom/yandex/div2/U;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class a extends U {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final O f373673c;

        public a(@Y61.k O o12) {
            super(null);
            this.f373673c = o12;
        }
    }

    /* compiled from: DivChangeTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/U;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/U;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, U> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f373674l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final U invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            U aVar;
            Object obj;
            Object obj2;
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            U.f373671a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            com.yandex.div.json.c cVar = eVar2.a().get(str);
            Object obj3 = null;
            U u12 = cVar instanceof U ? (U) cVar : null;
            if (u12 != null) {
                if (u12 instanceof d) {
                    str = "set";
                } else {
                    if (!(u12 instanceof a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "change_bounds";
                }
            }
            if (str.equals("set")) {
                if (u12 != null) {
                    if (u12 instanceof d) {
                        obj2 = ((d) u12).f373675c;
                    } else {
                        if (!(u12 instanceof a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = ((a) u12).f373673c;
                    }
                    obj3 = obj2;
                }
                aVar = new d(new S(eVar2, (S) obj3, false, jSONObject2));
            } else {
                if (!str.equals("change_bounds")) {
                    throw com.yandex.div.json.j.m(jSONObject2, "type", str);
                }
                if (u12 != null) {
                    if (u12 instanceof d) {
                        obj = ((d) u12).f373675c;
                    } else {
                        if (!(u12 instanceof a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj = ((a) u12).f373673c;
                    }
                    obj3 = obj;
                }
                aVar = new a(new O(eVar2, (O) obj3, false, jSONObject2));
            }
            return aVar;
        }
    }

    /* compiled from: DivChangeTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/U$c;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: DivChangeTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/U$d;", "Lcom/yandex/div2/U;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d extends U {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final S f373675c;

        public d(@Y61.k S s5) {
            super(null);
            this.f373675c = s5;
        }
    }

    public /* synthetic */ U(C42822w c42822w) {
        this();
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final T a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        if (!(this instanceof d)) {
            if (this instanceof a) {
                return new T.a(((a) this).f373673c.a(eVar, jSONObject));
            }
            throw new NoWhenBranchMatchedException();
        }
        S s5 = ((d) this).f373675c;
        s5.getClass();
        Y41.q<String, JSONObject, com.yandex.div.json.e, List<T>> qVar = S.f373487d;
        return new T.d(new Q(H21.b.i(s5.f373488a, eVar, "items", jSONObject, S.f373485b, qVar)));
    }

    public U() {
    }
}
