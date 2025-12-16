package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivPagerLayoutMode.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/div2/h4;", "Lcom/yandex/div/json/b;", "<init>", "()V", "b", "c", "d", "Lcom/yandex/div2/h4$d;", "Lcom/yandex/div2/h4$c;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.h4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38369h4 implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f375269a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38369h4> f375270b = a.f375271l;

    /* compiled from: DivPagerLayoutMode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/h4;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/h4;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.h4$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38369h4> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f375271l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final AbstractC38369h4 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            AbstractC38369h4.f375269a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            if (str.equals("percentage")) {
                C38236a4.f374164b.getClass();
                C38561t4.f376603b.getClass();
                return new d(new C38236a4((C38561t4) C38107c.b(jSONObject2, "page_width", C38561t4.f376605d, eVar2)));
            }
            if (str.equals("fixed")) {
                W3.f373780b.getClass();
                C38502q1.f376146c.getClass();
                return new c(new W3((C38502q1) C38107c.b(jSONObject2, "neighbour_page_width", C38502q1.f376150g, eVar2)));
            }
            com.yandex.div.json.c cVarA = eVar2.a().a(str, jSONObject2);
            AbstractC38379i4 abstractC38379i4 = cVarA instanceof AbstractC38379i4 ? (AbstractC38379i4) cVarA : null;
            if (abstractC38379i4 != null) {
                return abstractC38379i4.a(eVar2, jSONObject2);
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: DivPagerLayoutMode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/h4$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.h4$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivPagerLayoutMode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/h4$c;", "Lcom/yandex/div2/h4;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.h4$c */
    public static class c extends AbstractC38369h4 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final W3 f375272c;

        public c(@Y61.k W3 w32) {
            super(null);
            this.f375272c = w32;
        }
    }

    /* compiled from: DivPagerLayoutMode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/h4$d;", "Lcom/yandex/div2/h4;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.h4$d */
    public static class d extends AbstractC38369h4 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38236a4 f375273c;

        public d(@Y61.k C38236a4 c38236a4) {
            super(null);
            this.f375273c = c38236a4;
        }
    }

    public /* synthetic */ AbstractC38369h4(C42822w c42822w) {
        this();
    }

    public AbstractC38369h4() {
    }
}
