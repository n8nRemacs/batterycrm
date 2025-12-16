package com.yandex.div2;

import com.yandex.div2.AbstractC38582v7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivTextRangeBackgroundTemplate.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lcom/yandex/div2/w7;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/v7;", "<init>", "()V", "b", "c", "Lcom/yandex/div2/w7$c;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.w7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38591w7 implements com.yandex.div.json.b, com.yandex.div.json.c<AbstractC38582v7> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f376938a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38591w7> f376939b = a.f376940l;

    /* compiled from: DivTextRangeBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/w7;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/w7;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.w7$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, AbstractC38591w7> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f376940l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final AbstractC38591w7 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            AbstractC38591w7.f376938a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            com.yandex.div.json.c cVar = eVar2.a().get(str);
            C38381i6 c38381i6 = null;
            AbstractC38591w7 abstractC38591w7 = cVar instanceof AbstractC38591w7 ? (AbstractC38591w7) cVar : null;
            if (abstractC38591w7 != null) {
                if (!(abstractC38591w7 instanceof c)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "solid";
            }
            if (!str.equals("solid")) {
                throw com.yandex.div.json.j.m(jSONObject2, "type", str);
            }
            if (abstractC38591w7 != null) {
                if (!(abstractC38591w7 instanceof c)) {
                    throw new NoWhenBranchMatchedException();
                }
                c38381i6 = ((c) abstractC38591w7).f376941c;
            }
            return new c(new C38381i6(eVar2, c38381i6, false, jSONObject2));
        }
    }

    /* compiled from: DivTextRangeBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/w7$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.w7$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivTextRangeBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/w7$c;", "Lcom/yandex/div2/w7;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.w7$c */
    public static class c extends AbstractC38591w7 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38381i6 f376941c;

        public c(@Y61.k C38381i6 c38381i6) {
            super(null);
            this.f376941c = c38381i6;
        }
    }

    public /* synthetic */ AbstractC38591w7(C42822w c42822w) {
        this();
    }

    @Override // com.yandex.div.json.c
    public final com.yandex.div.json.b a(com.yandex.div.json.e eVar, JSONObject jSONObject) {
        if (this instanceof c) {
            return new AbstractC38582v7.c(((c) this).f376941c.a(eVar, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    public AbstractC38591w7() {
    }
}
