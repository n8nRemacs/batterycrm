package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import com.yandex.div2.C38599x6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivIndicatorItemPlacement.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/div2/b3;", "Lcom/yandex/div/json/b;", "<init>", "()V", "b", "c", "d", "Lcom/yandex/div2/b3$c;", "Lcom/yandex/div2/b3$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.b3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38265b3 implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f374394a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38265b3> f374395b = a.f374396l;

    /* compiled from: DivIndicatorItemPlacement.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/b3;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/b3;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.b3$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38265b3> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f374396l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final AbstractC38265b3 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            AbstractC38265b3.f374394a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            if (str.equals("default")) {
                M0.f372773b.getClass();
                com.yandex.div.json.i f370579a = eVar2.getF370579a();
                C38502q1.f376146c.getClass();
                C38502q1 c38502q1 = (C38502q1) C38107c.g(jSONObject2, "space_between_centers", C38502q1.f376150g, f370579a, eVar2);
                if (c38502q1 == null) {
                    c38502q1 = M0.f372774c;
                }
                return new c(new M0(c38502q1));
            }
            if (str.equals("stretch")) {
                C38599x6.f376964c.getClass();
                return new d(C38599x6.b.a(eVar2, jSONObject2));
            }
            com.yandex.div.json.c cVarA = eVar2.a().a(str, jSONObject2);
            AbstractC38275c3 abstractC38275c3 = cVarA instanceof AbstractC38275c3 ? (AbstractC38275c3) cVarA : null;
            if (abstractC38275c3 != null) {
                return abstractC38275c3.a(eVar2, jSONObject2);
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: DivIndicatorItemPlacement.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/b3$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.b3$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivIndicatorItemPlacement.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/b3$c;", "Lcom/yandex/div2/b3;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.b3$c */
    public static class c extends AbstractC38265b3 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final M0 f374397c;

        public c(@Y61.k M0 m02) {
            super(null);
            this.f374397c = m02;
        }
    }

    /* compiled from: DivIndicatorItemPlacement.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/b3$d;", "Lcom/yandex/div2/b3;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.b3$d */
    public static class d extends AbstractC38265b3 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38599x6 f374398c;

        public d(@Y61.k C38599x6 c38599x6) {
            super(null);
            this.f374398c = c38599x6;
        }
    }

    public /* synthetic */ AbstractC38265b3(C42822w c42822w) {
        this();
    }

    public AbstractC38265b3() {
    }
}
