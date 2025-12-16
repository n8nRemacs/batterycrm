package com.yandex.div2;

import com.yandex.div2.G5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivShapeTemplate.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/J5;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/G5;", "<init>", "()V", "a", "c", "d", "Lcom/yandex/div2/J5$d;", "Lcom/yandex/div2/J5$a;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class J5 implements com.yandex.div.json.b, com.yandex.div.json.c<G5> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f372625a = new c(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, J5> f372626b = b.f372628l;

    /* compiled from: DivShapeTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/J5$a;", "Lcom/yandex/div2/J5;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class a extends J5 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final W f372627c;

        public a(@Y61.k W w12) {
            super(null);
            this.f372627c = w12;
        }
    }

    /* compiled from: DivShapeTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/J5;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/J5;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, J5> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f372628l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final J5 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            J5 aVar;
            Object obj;
            Object obj2;
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            J5.f372625a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            com.yandex.div.json.c cVar = eVar2.a().get(str);
            Object obj3 = null;
            J5 j52 = cVar instanceof J5 ? (J5) cVar : null;
            if (j52 != null) {
                if (j52 instanceof d) {
                    str = "rounded_rectangle";
                } else {
                    if (!(j52 instanceof a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "circle";
                }
            }
            if (str.equals("rounded_rectangle")) {
                if (j52 != null) {
                    if (j52 instanceof d) {
                        obj2 = ((d) j52).f372629c;
                    } else {
                        if (!(j52 instanceof a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = ((a) j52).f372627c;
                    }
                    obj3 = obj2;
                }
                aVar = new d(new V4(eVar2, (V4) obj3, false, jSONObject2));
            } else {
                if (!str.equals("circle")) {
                    throw com.yandex.div.json.j.m(jSONObject2, "type", str);
                }
                if (j52 != null) {
                    if (j52 instanceof d) {
                        obj = ((d) j52).f372629c;
                    } else {
                        if (!(j52 instanceof a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj = ((a) j52).f372627c;
                    }
                    obj3 = obj;
                }
                aVar = new a(new W(eVar2, (W) obj3, false, jSONObject2));
            }
            return aVar;
        }
    }

    /* compiled from: DivShapeTemplate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/J5$c;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: DivShapeTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/J5$d;", "Lcom/yandex/div2/J5;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d extends J5 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final V4 f372629c;

        public d(@Y61.k V4 v42) {
            super(null);
            this.f372629c = v42;
        }
    }

    public /* synthetic */ J5(C42822w c42822w) {
        this();
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final G5 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        if (this instanceof d) {
            return new G5.d(((d) this).f372629c.a(eVar, jSONObject));
        }
        if (this instanceof a) {
            return new G5.a(((a) this).f372627c.a(eVar, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public J5() {
    }
}
