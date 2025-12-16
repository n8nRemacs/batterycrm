package com.yandex.div2;

import com.yandex.div2.AbstractC38564t7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivTextGradientTemplate.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/u7;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/t7;", "<init>", "()V", "b", "c", "d", "Lcom/yandex/div2/u7$c;", "Lcom/yandex/div2/u7$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.u7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38573u7 implements com.yandex.div.json.b, com.yandex.div.json.c<AbstractC38564t7> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f376653a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38573u7> f376654b = a.f376655l;

    /* compiled from: DivTextGradientTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/u7;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/u7;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.u7$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38573u7> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f376655l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final AbstractC38573u7 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            AbstractC38573u7 dVar;
            Object obj;
            Object obj2;
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            AbstractC38573u7.f376653a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            com.yandex.div.json.c cVar = eVar2.a().get(str);
            Object obj3 = null;
            AbstractC38573u7 abstractC38573u7 = cVar instanceof AbstractC38573u7 ? (AbstractC38573u7) cVar : null;
            if (abstractC38573u7 != null) {
                if (abstractC38573u7 instanceof c) {
                    str = "gradient";
                } else {
                    if (!(abstractC38573u7 instanceof d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "radial_gradient";
                }
            }
            if (str.equals("gradient")) {
                if (abstractC38573u7 != null) {
                    if (abstractC38573u7 instanceof c) {
                        obj2 = ((c) abstractC38573u7).f376656c;
                    } else {
                        if (!(abstractC38573u7 instanceof d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = ((d) abstractC38573u7).f376657c;
                    }
                    obj3 = obj2;
                }
                dVar = new c(new T3(eVar2, (T3) obj3, false, jSONObject2));
            } else {
                if (!str.equals("radial_gradient")) {
                    throw com.yandex.div.json.j.m(jSONObject2, "type", str);
                }
                if (abstractC38573u7 != null) {
                    if (abstractC38573u7 instanceof c) {
                        obj = ((c) abstractC38573u7).f376656c;
                    } else {
                        if (!(abstractC38573u7 instanceof d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj = ((d) abstractC38573u7).f376657c;
                    }
                    obj3 = obj;
                }
                dVar = new d(new T4(eVar2, (T4) obj3, false, jSONObject2));
            }
            return dVar;
        }
    }

    /* compiled from: DivTextGradientTemplate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/u7$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.u7$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivTextGradientTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/u7$c;", "Lcom/yandex/div2/u7;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.u7$c */
    public static class c extends AbstractC38573u7 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final T3 f376656c;

        public c(@Y61.k T3 t32) {
            super(null);
            this.f376656c = t32;
        }
    }

    /* compiled from: DivTextGradientTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/u7$d;", "Lcom/yandex/div2/u7;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.u7$d */
    public static class d extends AbstractC38573u7 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final T4 f376657c;

        public d(@Y61.k T4 t42) {
            super(null);
            this.f376657c = t42;
        }
    }

    public /* synthetic */ AbstractC38573u7(C42822w c42822w) {
        this();
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC38564t7 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        if (this instanceof c) {
            return new AbstractC38564t7.c(((c) this).f376656c.a(eVar, jSONObject));
        }
        if (this instanceof d) {
            return new AbstractC38564t7.d(((d) this).f376657c.a(eVar, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public AbstractC38573u7() {
    }
}
