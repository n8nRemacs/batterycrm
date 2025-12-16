package com.yandex.div2;

import com.yandex.div2.AbstractC38386j1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivFilterTemplate.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lcom/yandex/div2/k1;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/j1;", "<init>", "()V", "a", "c", "Lcom/yandex/div2/k1$a;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.k1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38409k1 implements com.yandex.div.json.b, com.yandex.div.json.c<AbstractC38386j1> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f375635a = new c(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38409k1> f375636b = b.f375638l;

    /* compiled from: DivFilterTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/k1$a;", "Lcom/yandex/div2/k1;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.k1$a */
    public static class a extends AbstractC38409k1 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final J f375637c;

        public a(@Y61.k J j12) {
            super(null);
            this.f375637c = j12;
        }
    }

    /* compiled from: DivFilterTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/k1;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/k1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.k1$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38409k1> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f375638l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final AbstractC38409k1 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            AbstractC38409k1.f375635a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            com.yandex.div.json.c cVar = eVar2.a().get(str);
            J j12 = null;
            AbstractC38409k1 abstractC38409k1 = cVar instanceof AbstractC38409k1 ? (AbstractC38409k1) cVar : null;
            if (abstractC38409k1 != null) {
                if (!(abstractC38409k1 instanceof a)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "blur";
            }
            if (!str.equals("blur")) {
                throw com.yandex.div.json.j.m(jSONObject2, "type", str);
            }
            if (abstractC38409k1 != null) {
                if (!(abstractC38409k1 instanceof a)) {
                    throw new NoWhenBranchMatchedException();
                }
                j12 = ((a) abstractC38409k1).f375637c;
            }
            return new a(new J(eVar2, j12, false, jSONObject2));
        }
    }

    /* compiled from: DivFilterTemplate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/k1$c;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.k1$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    public /* synthetic */ AbstractC38409k1(C42822w c42822w) {
        this();
    }

    @Override // com.yandex.div.json.c
    public final com.yandex.div.json.b a(com.yandex.div.json.e eVar, JSONObject jSONObject) {
        if (!(this instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        J j12 = ((a) this).f375637c;
        j12.getClass();
        return new AbstractC38386j1.a(new I((com.yandex.div.json.expressions.b) H21.b.b(j12.f372615a, eVar, "radius", jSONObject, J.f372614d)));
    }

    public AbstractC38409k1() {
    }
}
