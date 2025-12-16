package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import com.yandex.div2.AbstractC38409k1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivFilter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div2/j1;", "Lcom/yandex/div/json/b;", "<init>", "()V", "a", "c", "Lcom/yandex/div2/j1$a;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.j1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38386j1 implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f375414a = new c(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38386j1> f375415b = b.f375417l;

    /* compiled from: DivFilter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/j1$a;", "Lcom/yandex/div2/j1;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.j1$a */
    public static class a extends AbstractC38386j1 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final I f375416c;

        public a(@Y61.k I i12) {
            super(null);
            this.f375416c = i12;
        }
    }

    /* compiled from: DivFilter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/j1;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/j1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.j1$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38386j1> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f375417l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final AbstractC38386j1 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            AbstractC38386j1.f375414a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            if (str.equals("blur")) {
                I.f372539b.getClass();
                return new a(new I(C38107c.c(jSONObject2, "radius", com.yandex.div.internal.parser.y.f370151e, I.f372540c, eVar2.getF370579a(), com.yandex.div.internal.parser.E.f370132b)));
            }
            com.yandex.div.json.c cVarA = eVar2.a().a(str, jSONObject2);
            AbstractC38409k1 abstractC38409k1 = cVarA instanceof AbstractC38409k1 ? (AbstractC38409k1) cVarA : null;
            if (abstractC38409k1 == null) {
                throw com.yandex.div.json.j.m(jSONObject2, "type", str);
            }
            if (!(abstractC38409k1 instanceof AbstractC38409k1.a)) {
                throw new NoWhenBranchMatchedException();
            }
            J j12 = ((AbstractC38409k1.a) abstractC38409k1).f375637c;
            j12.getClass();
            return new a(new I((com.yandex.div.json.expressions.b) H21.b.b(j12.f372615a, eVar2, "radius", jSONObject2, J.f372614d)));
        }
    }

    /* compiled from: DivFilter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/j1$c;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.j1$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    public /* synthetic */ AbstractC38386j1(C42822w c42822w) {
        this();
    }

    public AbstractC38386j1() {
    }
}
