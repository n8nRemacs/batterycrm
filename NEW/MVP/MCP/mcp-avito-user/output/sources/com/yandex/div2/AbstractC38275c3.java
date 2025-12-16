package com.yandex.div2;

import com.yandex.div2.AbstractC38265b3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivIndicatorItemPlacementTemplate.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/c3;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/b3;", "<init>", "()V", "b", "c", "d", "Lcom/yandex/div2/c3$c;", "Lcom/yandex/div2/c3$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.c3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38275c3 implements com.yandex.div.json.b, com.yandex.div.json.c<AbstractC38265b3> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f374693a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38275c3> f374694b = a.f374695l;

    /* compiled from: DivIndicatorItemPlacementTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/c3;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/c3;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.c3$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38275c3> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f374695l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final AbstractC38275c3 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            AbstractC38275c3 dVar;
            Object obj;
            Object obj2;
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            AbstractC38275c3.f374693a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            com.yandex.div.json.c cVar = eVar2.a().get(str);
            Object obj3 = null;
            AbstractC38275c3 abstractC38275c3 = cVar instanceof AbstractC38275c3 ? (AbstractC38275c3) cVar : null;
            if (abstractC38275c3 != null) {
                if (abstractC38275c3 instanceof c) {
                    str = "default";
                } else {
                    if (!(abstractC38275c3 instanceof d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "stretch";
                }
            }
            if (str.equals("default")) {
                if (abstractC38275c3 != null) {
                    if (abstractC38275c3 instanceof c) {
                        obj2 = ((c) abstractC38275c3).f374696c;
                    } else {
                        if (!(abstractC38275c3 instanceof d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = ((d) abstractC38275c3).f374697c;
                    }
                    obj3 = obj2;
                }
                dVar = new c(new N0(eVar2, (N0) obj3, false, jSONObject2));
            } else {
                if (!str.equals("stretch")) {
                    throw com.yandex.div.json.j.m(jSONObject2, "type", str);
                }
                if (abstractC38275c3 != null) {
                    if (abstractC38275c3 instanceof c) {
                        obj = ((c) abstractC38275c3).f374696c;
                    } else {
                        if (!(abstractC38275c3 instanceof d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj = ((d) abstractC38275c3).f374697c;
                    }
                    obj3 = obj;
                }
                dVar = new d(new C38621y6(eVar2, (C38621y6) obj3, false, jSONObject2));
            }
            return dVar;
        }
    }

    /* compiled from: DivIndicatorItemPlacementTemplate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/c3$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.c3$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivIndicatorItemPlacementTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/c3$c;", "Lcom/yandex/div2/c3;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.c3$c */
    public static class c extends AbstractC38275c3 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final N0 f374696c;

        public c(@Y61.k N0 n02) {
            super(null);
            this.f374696c = n02;
        }
    }

    /* compiled from: DivIndicatorItemPlacementTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/c3$d;", "Lcom/yandex/div2/c3;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.c3$d */
    public static class d extends AbstractC38275c3 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38621y6 f374697c;

        public d(@Y61.k C38621y6 c38621y6) {
            super(null);
            this.f374697c = c38621y6;
        }
    }

    public /* synthetic */ AbstractC38275c3(C42822w c42822w) {
        this();
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC38265b3 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        if (!(this instanceof c)) {
            if (this instanceof d) {
                return new AbstractC38265b3.d(((d) this).f374697c.a(eVar, jSONObject));
            }
            throw new NoWhenBranchMatchedException();
        }
        N0 n02 = ((c) this).f374696c;
        n02.getClass();
        C38502q1 c38502q1 = (C38502q1) H21.b.f(n02.f372806a, eVar, "space_between_centers", jSONObject, N0.f372805c);
        if (c38502q1 == null) {
            c38502q1 = N0.f372804b;
        }
        return new AbstractC38265b3.c(new M0(c38502q1));
    }

    public AbstractC38275c3() {
    }
}
