package com.yandex.div2;

import com.yandex.div2.AbstractC38369h4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivPagerLayoutModeTemplate.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/i4;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/h4;", "<init>", "()V", "b", "c", "d", "Lcom/yandex/div2/i4$d;", "Lcom/yandex/div2/i4$c;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.i4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38379i4 implements com.yandex.div.json.b, com.yandex.div.json.c<AbstractC38369h4> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f375302a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38379i4> f375303b = a.f375304l;

    /* compiled from: DivPagerLayoutModeTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/i4;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/i4;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.i4$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38379i4> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f375304l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final AbstractC38379i4 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            AbstractC38379i4 cVar;
            Object obj;
            Object obj2;
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            AbstractC38379i4.f375302a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            com.yandex.div.json.c cVar2 = eVar2.a().get(str);
            Object obj3 = null;
            AbstractC38379i4 abstractC38379i4 = cVar2 instanceof AbstractC38379i4 ? (AbstractC38379i4) cVar2 : null;
            if (abstractC38379i4 != null) {
                if (abstractC38379i4 instanceof d) {
                    str = "percentage";
                } else {
                    if (!(abstractC38379i4 instanceof c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "fixed";
                }
            }
            if (str.equals("percentage")) {
                if (abstractC38379i4 != null) {
                    if (abstractC38379i4 instanceof d) {
                        obj2 = ((d) abstractC38379i4).f375306c;
                    } else {
                        if (!(abstractC38379i4 instanceof c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = ((c) abstractC38379i4).f375305c;
                    }
                    obj3 = obj2;
                }
                cVar = new d(new C38266b4(eVar2, (C38266b4) obj3, false, jSONObject2));
            } else {
                if (!str.equals("fixed")) {
                    throw com.yandex.div.json.j.m(jSONObject2, "type", str);
                }
                if (abstractC38379i4 != null) {
                    if (abstractC38379i4 instanceof d) {
                        obj = ((d) abstractC38379i4).f375306c;
                    } else {
                        if (!(abstractC38379i4 instanceof c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj = ((c) abstractC38379i4).f375305c;
                    }
                    obj3 = obj;
                }
                cVar = new c(new X3(eVar2, (X3) obj3, false, jSONObject2));
            }
            return cVar;
        }
    }

    /* compiled from: DivPagerLayoutModeTemplate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/i4$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.i4$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivPagerLayoutModeTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/i4$c;", "Lcom/yandex/div2/i4;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.i4$c */
    public static class c extends AbstractC38379i4 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final X3 f375305c;

        public c(@Y61.k X3 x32) {
            super(null);
            this.f375305c = x32;
        }
    }

    /* compiled from: DivPagerLayoutModeTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/i4$d;", "Lcom/yandex/div2/i4;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.i4$d */
    public static class d extends AbstractC38379i4 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38266b4 f375306c;

        public d(@Y61.k C38266b4 c38266b4) {
            super(null);
            this.f375306c = c38266b4;
        }
    }

    public /* synthetic */ AbstractC38379i4(C42822w c42822w) {
        this();
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC38369h4 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        if (this instanceof d) {
            C38266b4 c38266b4 = ((d) this).f375306c;
            c38266b4.getClass();
            return new AbstractC38369h4.d(new C38236a4((C38561t4) H21.b.h(c38266b4.f374400a, eVar, "page_width", jSONObject, C38266b4.f374399b)));
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        X3 x32 = ((c) this).f375305c;
        x32.getClass();
        return new AbstractC38369h4.c(new W3((C38502q1) H21.b.h(x32.f373999a, eVar, "neighbour_page_width", jSONObject, X3.f373998b)));
    }

    public AbstractC38379i4() {
    }
}
