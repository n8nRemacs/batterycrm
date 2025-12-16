package com.yandex.div2;

import com.yandex.div2.AbstractC38548s0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivCountTemplate.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/t0;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/s0;", "<init>", "()V", "b", "c", "d", "Lcom/yandex/div2/t0$d;", "Lcom/yandex/div2/t0$c;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.t0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38557t0 implements com.yandex.div.json.b, com.yandex.div.json.c<AbstractC38548s0> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f376598a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38557t0> f376599b = a.f376600l;

    /* compiled from: DivCountTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/t0;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/t0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.t0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38557t0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f376600l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final AbstractC38557t0 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            Object obj;
            Object obj2;
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            AbstractC38557t0.f376598a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            com.yandex.div.json.c cVar = eVar2.a().get(str);
            Object obj3 = null;
            AbstractC38557t0 abstractC38557t0 = cVar instanceof AbstractC38557t0 ? (AbstractC38557t0) cVar : null;
            if (abstractC38557t0 != null) {
                if (abstractC38557t0 instanceof d) {
                    str = "infinity";
                } else {
                    if (!(abstractC38557t0 instanceof c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "fixed";
                }
            }
            if (str.equals("infinity")) {
                if (abstractC38557t0 != null) {
                    if (abstractC38557t0 instanceof d) {
                        obj2 = ((d) abstractC38557t0).f376602c;
                    } else {
                        if (!(abstractC38557t0 instanceof c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = ((c) abstractC38557t0).f376601c;
                    }
                    obj3 = obj2;
                }
                return new d(new C38451m3());
            }
            if (!str.equals("fixed")) {
                throw com.yandex.div.json.j.m(jSONObject2, "type", str);
            }
            if (abstractC38557t0 != null) {
                if (abstractC38557t0 instanceof d) {
                    obj = ((d) abstractC38557t0).f376602c;
                } else {
                    if (!(abstractC38557t0 instanceof c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj = ((c) abstractC38557t0).f376601c;
                }
                obj3 = obj;
            }
            return new c(new C38449m1(eVar2, (C38449m1) obj3, false, jSONObject2));
        }
    }

    /* compiled from: DivCountTemplate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/t0$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.t0$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivCountTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/t0$c;", "Lcom/yandex/div2/t0;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.t0$c */
    public static class c extends AbstractC38557t0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38449m1 f376601c;

        public c(@Y61.k C38449m1 c38449m1) {
            super(null);
            this.f376601c = c38449m1;
        }
    }

    /* compiled from: DivCountTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/t0$d;", "Lcom/yandex/div2/t0;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.t0$d */
    public static class d extends AbstractC38557t0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38451m3 f376602c;

        public d(@Y61.k C38451m3 c38451m3) {
            super(null);
            this.f376602c = c38451m3;
        }
    }

    public /* synthetic */ AbstractC38557t0(C42822w c42822w) {
        this();
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC38548s0 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        if (this instanceof d) {
            ((d) this).f376602c.getClass();
            new C38442l3();
            return new AbstractC38548s0.d(null);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        C38449m1 c38449m1 = ((c) this).f376601c;
        c38449m1.getClass();
        return new AbstractC38548s0.c(null);
    }

    public AbstractC38557t0() {
    }
}
