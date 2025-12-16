package com.yandex.div2;

import com.yandex.div2.AbstractC38591w7;
import com.yandex.div2.C38371h6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivTextRangeBackground.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div2/v7;", "Lcom/yandex/div/json/b;", "<init>", "()V", "b", "c", "Lcom/yandex/div2/v7$c;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.v7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38582v7 implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f376775a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38582v7> f376776b = a.f376777l;

    /* compiled from: DivTextRangeBackground.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/v7;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/v7;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.v7$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38582v7> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f376777l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final AbstractC38582v7 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            AbstractC38582v7.f376775a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            if (str.equals("solid")) {
                C38371h6.f375274b.getClass();
                return new c(C38371h6.b.a(eVar2, jSONObject2));
            }
            com.yandex.div.json.c cVarA = eVar2.a().a(str, jSONObject2);
            AbstractC38591w7 abstractC38591w7 = cVarA instanceof AbstractC38591w7 ? (AbstractC38591w7) cVarA : null;
            if (abstractC38591w7 == null) {
                throw com.yandex.div.json.j.m(jSONObject2, "type", str);
            }
            if (abstractC38591w7 instanceof AbstractC38591w7.c) {
                return new c(((AbstractC38591w7.c) abstractC38591w7).f376941c.a(eVar2, jSONObject2));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: DivTextRangeBackground.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/v7$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.v7$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivTextRangeBackground.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/v7$c;", "Lcom/yandex/div2/v7;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.v7$c */
    public static class c extends AbstractC38582v7 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38371h6 f376778c;

        public c(@Y61.k C38371h6 c38371h6) {
            super(null);
            this.f376778c = c38371h6;
        }
    }

    public /* synthetic */ AbstractC38582v7(C42822w c42822w) {
        this();
    }

    public AbstractC38582v7() {
    }
}
