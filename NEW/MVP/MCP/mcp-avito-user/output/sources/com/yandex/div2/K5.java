package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import com.yandex.div2.C38502q1;
import com.yandex.div2.y8;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivSize.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div2/K5;", "Lcom/yandex/div/json/b;", "<init>", "()V", "b", "c", "d", "e", "Lcom/yandex/div2/K5$c;", "Lcom/yandex/div2/K5$d;", "Lcom/yandex/div2/K5$e;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class K5 implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f372712a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, K5> f372713b = a.f372714l;

    /* compiled from: DivSize.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/K5;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/K5;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, K5> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f372714l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final K5 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            K5.f372712a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            int iHashCode = str.hashCode();
            if (iHashCode != 97445748) {
                if (iHashCode != 343327108) {
                    if (iHashCode == 1386124388 && str.equals("match_parent")) {
                        U3.f373683b.getClass();
                        return new d(new U3(C38107c.i(jSONObject2, "weight", com.yandex.div.internal.parser.y.f370150d, U3.f373684c, eVar2.getF370579a(), null, com.yandex.div.internal.parser.E.f370134d)));
                    }
                } else if (str.equals("wrap_content")) {
                    y8.f377206d.getClass();
                    return new e(y8.b.a(eVar2, jSONObject2));
                }
            } else if (str.equals("fixed")) {
                C38502q1.f376146c.getClass();
                return new c(C38502q1.c.a(eVar2, jSONObject2));
            }
            com.yandex.div.json.c cVarA = eVar2.a().a(str, jSONObject2);
            L5 l52 = cVarA instanceof L5 ? (L5) cVarA : null;
            if (l52 != null) {
                return l52.a(eVar2, jSONObject2);
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: DivSize.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/K5$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivSize.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/K5$c;", "Lcom/yandex/div2/K5;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c extends K5 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38502q1 f372715c;

        public c(@Y61.k C38502q1 c38502q1) {
            super(null);
            this.f372715c = c38502q1;
        }
    }

    /* compiled from: DivSize.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/K5$d;", "Lcom/yandex/div2/K5;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d extends K5 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final U3 f372716c;

        public d(@Y61.k U3 u32) {
            super(null);
            this.f372716c = u32;
        }
    }

    /* compiled from: DivSize.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/K5$e;", "Lcom/yandex/div2/K5;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class e extends K5 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final y8 f372717c;

        public e(@Y61.k y8 y8Var) {
            super(null);
            this.f372717c = y8Var;
        }
    }

    public /* synthetic */ K5(C42822w c42822w) {
        this();
    }

    @Y61.k
    public final Object a() {
        if (this instanceof c) {
            return ((c) this).f372715c;
        }
        if (this instanceof d) {
            return ((d) this).f372716c;
        }
        if (this instanceof e) {
            return ((e) this).f372717c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public K5() {
    }
}
