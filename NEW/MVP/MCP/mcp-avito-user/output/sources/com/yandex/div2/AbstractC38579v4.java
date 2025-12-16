package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import com.yandex.div2.C38588w4;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivPivot.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/div2/v4;", "Lcom/yandex/div/json/b;", "<init>", "()V", "b", "c", "d", "Lcom/yandex/div2/v4$c;", "Lcom/yandex/div2/v4$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.v4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38579v4 implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f376770a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38579v4> f376771b = a.f376772l;

    /* compiled from: DivPivot.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/v4;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/v4;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.v4$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38579v4> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f376772l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final AbstractC38579v4 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            AbstractC38579v4.f376770a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            if (str.equals("pivot-fixed")) {
                C38588w4.f376931c.getClass();
                return new c(C38588w4.c.a(eVar2, jSONObject2));
            }
            if (str.equals("pivot-percentage")) {
                A4.f370595b.getClass();
                return new d(new A4(C38107c.c(jSONObject2, "value", com.yandex.div.internal.parser.y.f370150d, C38107c.f370139a, eVar2.getF370579a(), com.yandex.div.internal.parser.E.f370134d)));
            }
            com.yandex.div.json.c cVarA = eVar2.a().a(str, jSONObject2);
            C4 c42 = cVarA instanceof C4 ? (C4) cVarA : null;
            if (c42 != null) {
                return c42.a(eVar2, jSONObject2);
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: DivPivot.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/v4$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.v4$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivPivot.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/v4$c;", "Lcom/yandex/div2/v4;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.v4$c */
    public static class c extends AbstractC38579v4 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38588w4 f376773c;

        public c(@Y61.k C38588w4 c38588w4) {
            super(null);
            this.f376773c = c38588w4;
        }
    }

    /* compiled from: DivPivot.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/v4$d;", "Lcom/yandex/div2/v4;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.v4$d */
    public static class d extends AbstractC38579v4 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final A4 f376774c;

        public d(@Y61.k A4 a42) {
            super(null);
            this.f376774c = a42;
        }
    }

    public /* synthetic */ AbstractC38579v4(C42822w c42822w) {
        this();
    }

    public AbstractC38579v4() {
    }
}
