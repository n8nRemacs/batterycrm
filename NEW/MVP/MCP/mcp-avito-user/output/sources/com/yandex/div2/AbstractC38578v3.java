package com.yandex.div2;

import com.yandex.div2.C38467o1;
import com.yandex.div2.C38566u0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivInputMask.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/div2/v3;", "Lcom/yandex/div/json/b;", "<init>", "()V", "b", "c", "d", "Lcom/yandex/div2/v3$d;", "Lcom/yandex/div2/v3$c;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.v3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38578v3 implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f376765a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38578v3> f376766b = a.f376767l;

    /* compiled from: DivInputMask.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/v3;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/v3;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.v3$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38578v3> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f376767l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final AbstractC38578v3 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            AbstractC38578v3.f376765a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            if (str.equals("fixed_length")) {
                C38467o1.f375883e.getClass();
                return new d(C38467o1.b.a(eVar2, jSONObject2));
            }
            if (str.equals("currency")) {
                C38566u0.f376613c.getClass();
                return new c(C38566u0.b.a(eVar2, jSONObject2));
            }
            com.yandex.div.json.c cVarA = eVar2.a().a(str, jSONObject2);
            AbstractC38596x3 abstractC38596x3 = cVarA instanceof AbstractC38596x3 ? (AbstractC38596x3) cVarA : null;
            if (abstractC38596x3 != null) {
                return abstractC38596x3.a(eVar2, jSONObject2);
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: DivInputMask.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/v3$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.v3$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivInputMask.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/v3$c;", "Lcom/yandex/div2/v3;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.v3$c */
    public static class c extends AbstractC38578v3 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38566u0 f376768c;

        public c(@Y61.k C38566u0 c38566u0) {
            super(null);
            this.f376768c = c38566u0;
        }
    }

    /* compiled from: DivInputMask.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/v3$d;", "Lcom/yandex/div2/v3;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.v3$d */
    public static class d extends AbstractC38578v3 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38467o1 f376769c;

        public d(@Y61.k C38467o1 c38467o1) {
            super(null);
            this.f376769c = c38467o1;
        }
    }

    public /* synthetic */ AbstractC38578v3(C42822w c42822w) {
        this();
    }

    @Y61.k
    public final InterfaceC38587w3 a() {
        if (this instanceof d) {
            return ((d) this).f376769c;
        }
        if (this instanceof c) {
            return ((c) this).f376768c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public AbstractC38578v3() {
    }
}
