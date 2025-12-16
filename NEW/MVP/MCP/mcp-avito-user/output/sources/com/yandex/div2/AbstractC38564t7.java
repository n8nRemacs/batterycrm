package com.yandex.div2;

import com.yandex.div2.F4;
import com.yandex.div2.S3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivTextGradient.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/div2/t7;", "Lcom/yandex/div/json/b;", "<init>", "()V", "b", "c", "d", "Lcom/yandex/div2/t7$c;", "Lcom/yandex/div2/t7$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.t7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38564t7 implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f376608a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38564t7> f376609b = a.f376610l;

    /* compiled from: DivTextGradient.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/t7;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/t7;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.t7$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38564t7> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f376610l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final AbstractC38564t7 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            AbstractC38564t7.f376608a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            if (str.equals("gradient")) {
                S3.f373502c.getClass();
                return new c(S3.b.a(eVar2, jSONObject2));
            }
            if (str.equals("radial_gradient")) {
                F4.f372271e.getClass();
                return new d(F4.b.a(eVar2, jSONObject2));
            }
            com.yandex.div.json.c cVarA = eVar2.a().a(str, jSONObject2);
            AbstractC38573u7 abstractC38573u7 = cVarA instanceof AbstractC38573u7 ? (AbstractC38573u7) cVarA : null;
            if (abstractC38573u7 != null) {
                return abstractC38573u7.a(eVar2, jSONObject2);
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: DivTextGradient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/t7$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.t7$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivTextGradient.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/t7$c;", "Lcom/yandex/div2/t7;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.t7$c */
    public static class c extends AbstractC38564t7 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final S3 f376611c;

        public c(@Y61.k S3 s32) {
            super(null);
            this.f376611c = s32;
        }
    }

    /* compiled from: DivTextGradient.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/t7$d;", "Lcom/yandex/div2/t7;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.t7$d */
    public static class d extends AbstractC38564t7 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final F4 f376612c;

        public d(@Y61.k F4 f42) {
            super(null);
            this.f376612c = f42;
        }
    }

    public /* synthetic */ AbstractC38564t7(C42822w c42822w) {
        this();
    }

    @Y61.k
    public final Object a() {
        if (this instanceof c) {
            return ((c) this).f376611c;
        }
        if (this instanceof d) {
            return ((d) this).f376612c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public AbstractC38564t7() {
    }
}
