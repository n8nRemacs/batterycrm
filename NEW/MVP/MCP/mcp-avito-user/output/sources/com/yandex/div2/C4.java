package com.yandex.div2;

import com.yandex.div2.AbstractC38579v4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivPivotTemplate.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/C4;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/v4;", "<init>", "()V", "b", "c", "d", "Lcom/yandex/div2/C4$c;", "Lcom/yandex/div2/C4$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class C4 implements com.yandex.div.json.b, com.yandex.div.json.c<AbstractC38579v4> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f371153a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, C4> f371154b = a.f371155l;

    /* compiled from: DivPivotTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/C4;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/C4;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C4> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f371155l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C4 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            C4 dVar;
            Object obj;
            Object obj2;
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            C4.f371153a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            com.yandex.div.json.c cVar = eVar2.a().get(str);
            Object obj3 = null;
            C4 c42 = cVar instanceof C4 ? (C4) cVar : null;
            if (c42 != null) {
                if (c42 instanceof c) {
                    str = "pivot-fixed";
                } else {
                    if (!(c42 instanceof d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "pivot-percentage";
                }
            }
            if (str.equals("pivot-fixed")) {
                if (c42 != null) {
                    if (c42 instanceof c) {
                        obj2 = ((c) c42).f371156c;
                    } else {
                        if (!(c42 instanceof d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = ((d) c42).f371157c;
                    }
                    obj3 = obj2;
                }
                dVar = new c(new C38606y4(eVar2, (C38606y4) obj3, false, jSONObject2));
            } else {
                if (!str.equals("pivot-percentage")) {
                    throw com.yandex.div.json.j.m(jSONObject2, "type", str);
                }
                if (c42 != null) {
                    if (c42 instanceof c) {
                        obj = ((c) c42).f371156c;
                    } else {
                        if (!(c42 instanceof d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj = ((d) c42).f371157c;
                    }
                    obj3 = obj;
                }
                dVar = new d(new B4(eVar2, (B4) obj3, false, jSONObject2));
            }
            return dVar;
        }
    }

    /* compiled from: DivPivotTemplate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/C4$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivPivotTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/C4$c;", "Lcom/yandex/div2/C4;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c extends C4 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38606y4 f371156c;

        public c(@Y61.k C38606y4 c38606y4) {
            super(null);
            this.f371156c = c38606y4;
        }
    }

    /* compiled from: DivPivotTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/C4$d;", "Lcom/yandex/div2/C4;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d extends C4 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final B4 f371157c;

        public d(@Y61.k B4 b42) {
            super(null);
            this.f371157c = b42;
        }
    }

    public /* synthetic */ C4(C42822w c42822w) {
        this();
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC38579v4 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        if (this instanceof c) {
            return new AbstractC38579v4.c(((c) this).f371156c.a(eVar, jSONObject));
        }
        if (!(this instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        B4 b42 = ((d) this).f371157c;
        b42.getClass();
        return new AbstractC38579v4.d(new A4((com.yandex.div.json.expressions.b) H21.b.b(b42.f370633a, eVar, "value", jSONObject, B4.f370632b)));
    }

    public C4() {
    }
}
