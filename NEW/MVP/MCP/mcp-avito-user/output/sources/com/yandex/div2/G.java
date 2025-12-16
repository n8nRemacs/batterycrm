package com.yandex.div2;

import com.yandex.div2.F;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivBackgroundTemplate.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0006\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/div2/G;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/F;", "<init>", "()V", "b", "c", "d", "e", "f", "g", "Lcom/yandex/div2/G$d;", "Lcom/yandex/div2/G$f;", "Lcom/yandex/div2/G$c;", "Lcom/yandex/div2/G$g;", "Lcom/yandex/div2/G$e;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class G implements com.yandex.div.json.b, com.yandex.div.json.c<F> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f372308a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, G> f372309b = a.f372310l;

    /* compiled from: DivBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/G;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/G;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, G> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f372310l = new a();

        public a() {
            super(2);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // Y41.p
        public final G invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            G eVar2;
            com.yandex.div.json.e eVar3 = eVar;
            JSONObject jSONObject2 = jSONObject;
            G.f372308a.getClass();
            eVar3.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            com.yandex.div.json.c cVar = eVar3.a().get(str);
            G g12 = cVar instanceof G ? (G) cVar : null;
            if (g12 != null) {
                if (g12 instanceof d) {
                    str = "gradient";
                } else if (g12 instanceof f) {
                    str = "radial_gradient";
                } else if (g12 instanceof c) {
                    str = "image";
                } else if (g12 instanceof g) {
                    str = "solid";
                } else {
                    if (!(g12 instanceof e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "nine_patch_image";
                }
            }
            switch (str.hashCode()) {
                case -30518633:
                    if (str.equals("nine_patch_image")) {
                        eVar2 = new e(new Z3(eVar3, (Z3) (g12 != null ? g12.c() : null), false, jSONObject2));
                        return eVar2;
                    }
                    break;
                case 89650992:
                    if (str.equals("gradient")) {
                        eVar2 = new d(new T3(eVar3, (T3) (g12 != null ? g12.c() : null), false, jSONObject2));
                        return eVar2;
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        eVar2 = new c(new I2(eVar3, (I2) (g12 != null ? g12.c() : null), false, jSONObject2));
                        return eVar2;
                    }
                    break;
                case 109618859:
                    if (str.equals("solid")) {
                        eVar2 = new g(new C38381i6(eVar3, (C38381i6) (g12 != null ? g12.c() : null), false, jSONObject2));
                        return eVar2;
                    }
                    break;
                case 1881846096:
                    if (str.equals("radial_gradient")) {
                        eVar2 = new f(new T4(eVar3, (T4) (g12 != null ? g12.c() : null), false, jSONObject2));
                        return eVar2;
                    }
                    break;
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/G$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/G$c;", "Lcom/yandex/div2/G;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c extends G {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final I2 f372311c;

        public c(@Y61.k I2 i22) {
            super(null);
            this.f372311c = i22;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/G$d;", "Lcom/yandex/div2/G;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d extends G {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final T3 f372312c;

        public d(@Y61.k T3 t32) {
            super(null);
            this.f372312c = t32;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/G$e;", "Lcom/yandex/div2/G;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class e extends G {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Z3 f372313c;

        public e(@Y61.k Z3 z32) {
            super(null);
            this.f372313c = z32;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/G$f;", "Lcom/yandex/div2/G;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class f extends G {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final T4 f372314c;

        public f(@Y61.k T4 t42) {
            super(null);
            this.f372314c = t42;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/G$g;", "Lcom/yandex/div2/G;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class g extends G {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38381i6 f372315c;

        public g(@Y61.k C38381i6 c38381i6) {
            super(null);
            this.f372315c = c38381i6;
        }
    }

    public /* synthetic */ G(C42822w c42822w) {
        this();
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final F a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        if (this instanceof d) {
            return new F.d(((d) this).f372312c.a(eVar, jSONObject));
        }
        if (this instanceof f) {
            return new F.f(((f) this).f372314c.a(eVar, jSONObject));
        }
        if (this instanceof c) {
            return new F.c(((c) this).f372311c.a(eVar, jSONObject));
        }
        if (this instanceof g) {
            return new F.g(((g) this).f372315c.a(eVar, jSONObject));
        }
        if (this instanceof e) {
            return new F.e(((e) this).f372313c.a(eVar, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Y61.k
    public final Object c() {
        if (this instanceof d) {
            return ((d) this).f372312c;
        }
        if (this instanceof f) {
            return ((f) this).f372314c;
        }
        if (this instanceof c) {
            return ((c) this).f372311c;
        }
        if (this instanceof g) {
            return ((g) this).f372315c;
        }
        if (this instanceof e) {
            return ((e) this).f372313c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public G() {
    }
}
