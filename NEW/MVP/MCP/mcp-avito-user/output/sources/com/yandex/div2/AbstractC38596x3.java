package com.yandex.div2;

import com.yandex.div2.AbstractC38578v3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivInputMaskTemplate.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/x3;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/v3;", "<init>", "()V", "b", "c", "d", "Lcom/yandex/div2/x3$d;", "Lcom/yandex/div2/x3$c;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.x3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38596x3 implements com.yandex.div.json.b, com.yandex.div.json.c<AbstractC38578v3> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f376959a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38596x3> f376960b = a.f376961l;

    /* compiled from: DivInputMaskTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/x3;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/x3;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.x3$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38596x3> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f376961l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final AbstractC38596x3 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            AbstractC38596x3 cVar;
            Object obj;
            Object obj2;
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            AbstractC38596x3.f376959a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            com.yandex.div.json.c cVar2 = eVar2.a().get(str);
            Object obj3 = null;
            AbstractC38596x3 abstractC38596x3 = cVar2 instanceof AbstractC38596x3 ? (AbstractC38596x3) cVar2 : null;
            if (abstractC38596x3 != null) {
                if (abstractC38596x3 instanceof d) {
                    str = "fixed_length";
                } else {
                    if (!(abstractC38596x3 instanceof c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "currency";
                }
            }
            if (str.equals("fixed_length")) {
                if (abstractC38596x3 != null) {
                    if (abstractC38596x3 instanceof d) {
                        obj2 = ((d) abstractC38596x3).f376963c;
                    } else {
                        if (!(abstractC38596x3 instanceof c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = ((c) abstractC38596x3).f376962c;
                    }
                    obj3 = obj2;
                }
                cVar = new d(new C38493p1(eVar2, (C38493p1) obj3, false, jSONObject2));
            } else {
                if (!str.equals("currency")) {
                    throw com.yandex.div.json.j.m(jSONObject2, "type", str);
                }
                if (abstractC38596x3 != null) {
                    if (abstractC38596x3 instanceof d) {
                        obj = ((d) abstractC38596x3).f376963c;
                    } else {
                        if (!(abstractC38596x3 instanceof c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj = ((c) abstractC38596x3).f376962c;
                    }
                    obj3 = obj;
                }
                cVar = new c(new C38575v0(eVar2, (C38575v0) obj3, false, jSONObject2));
            }
            return cVar;
        }
    }

    /* compiled from: DivInputMaskTemplate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/x3$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.x3$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivInputMaskTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/x3$c;", "Lcom/yandex/div2/x3;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.x3$c */
    public static class c extends AbstractC38596x3 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38575v0 f376962c;

        public c(@Y61.k C38575v0 c38575v0) {
            super(null);
            this.f376962c = c38575v0;
        }
    }

    /* compiled from: DivInputMaskTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/x3$d;", "Lcom/yandex/div2/x3;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.x3$d */
    public static class d extends AbstractC38596x3 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38493p1 f376963c;

        public d(@Y61.k C38493p1 c38493p1) {
            super(null);
            this.f376963c = c38493p1;
        }
    }

    public /* synthetic */ AbstractC38596x3(C42822w c42822w) {
        this();
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC38578v3 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        if (this instanceof d) {
            return new AbstractC38578v3.d(((d) this).f376963c.a(eVar, jSONObject));
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        C38575v0 c38575v0 = ((c) this).f376962c;
        c38575v0.getClass();
        return new AbstractC38578v3.c(new C38566u0((com.yandex.div.json.expressions.b) H21.b.d(c38575v0.f376665a, eVar, "locale", jSONObject, C38575v0.f376663g), (String) H21.b.b(c38575v0.f376666b, eVar, "raw_text_variable", jSONObject, C38575v0.f376664h)));
    }

    public AbstractC38596x3() {
    }
}
