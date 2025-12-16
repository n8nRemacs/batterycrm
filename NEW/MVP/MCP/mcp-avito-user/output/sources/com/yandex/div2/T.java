package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import com.yandex.div2.M;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivChangeTransition.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/div2/T;", "Lcom/yandex/div/json/b;", "<init>", "()V", "a", "c", "d", "Lcom/yandex/div2/T$d;", "Lcom/yandex/div2/T$a;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class T implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f373510a = new c(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, T> f373511b = b.f373513l;

    /* compiled from: DivChangeTransition.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/T$a;", "Lcom/yandex/div2/T;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class a extends T {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final M f373512c;

        public a(@Y61.k M m12) {
            super(null);
            this.f373512c = m12;
        }
    }

    /* compiled from: DivChangeTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/T;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/T;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, T> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f373513l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final T invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            c cVar = T.f373510a;
            cVar.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            if (str.equals("set")) {
                Q.f373455b.getClass();
                com.yandex.div.json.i f370579a = eVar2.getF370579a();
                cVar.getClass();
                return new d(new Q(C38107c.f(jSONObject2, "items", T.f373511b, Q.f373456c, f370579a, eVar2)));
            }
            if (str.equals("change_bounds")) {
                M.f372761d.getClass();
                return new a(M.c.a(eVar2, jSONObject2));
            }
            com.yandex.div.json.c cVarA = eVar2.a().a(str, jSONObject2);
            U u12 = cVarA instanceof U ? (U) cVarA : null;
            if (u12 != null) {
                return u12.a(eVar2, jSONObject2);
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: DivChangeTransition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/T$c;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: DivChangeTransition.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/T$d;", "Lcom/yandex/div2/T;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d extends T {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Q f373514c;

        public d(@Y61.k Q q12) {
            super(null);
            this.f373514c = q12;
        }
    }

    public /* synthetic */ T(C42822w c42822w) {
        this();
    }

    public T() {
    }
}
