package com.yandex.div2;

import com.yandex.div2.H5;
import com.yandex.div2.X0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivDrawable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div2/W0;", "Lcom/yandex/div/json/b;", "<init>", "()V", "b", "c", "Lcom/yandex/div2/W0$c;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class W0 implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f373775a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, W0> f373776b = a.f373777l;

    /* compiled from: DivDrawable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/W0;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/W0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, W0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f373777l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final W0 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            W0.f373775a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            if (str.equals("shape_drawable")) {
                H5.f372529d.getClass();
                return new c(H5.b.a(eVar2, jSONObject2));
            }
            com.yandex.div.json.c cVarA = eVar2.a().a(str, jSONObject2);
            X0 x02 = cVarA instanceof X0 ? (X0) cVarA : null;
            if (x02 == null) {
                throw com.yandex.div.json.j.m(jSONObject2, "type", str);
            }
            if (x02 instanceof X0.c) {
                return new c(((X0.c) x02).f373821c.a(eVar2, jSONObject2));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: DivDrawable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/W0$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivDrawable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/W0$c;", "Lcom/yandex/div2/W0;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c extends W0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final H5 f373778c;

        public c(@Y61.k H5 h52) {
            super(null);
            this.f373778c = h52;
        }
    }

    public /* synthetic */ W0(C42822w c42822w) {
        this();
    }

    public W0() {
    }
}
