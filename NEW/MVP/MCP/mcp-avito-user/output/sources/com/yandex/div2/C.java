package com.yandex.div2;

import com.yandex.div2.B;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivAppearanceTransitionTemplate.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/div2/C;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/B;", "<init>", "()V", "b", "c", "d", "e", "f", "Lcom/yandex/div2/C$e;", "Lcom/yandex/div2/C$c;", "Lcom/yandex/div2/C$d;", "Lcom/yandex/div2/C$f;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class C implements com.yandex.div.json.b, com.yandex.div.json.c<B> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f371018a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, C> f371019b = a.f371020l;

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/C;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/C;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f371020l = new a();

        public a() {
            super(2);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        @Override // Y41.p
        public final C invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            C eVar2;
            com.yandex.div.json.e eVar3 = eVar;
            JSONObject jSONObject2 = jSONObject;
            C.f371018a.getClass();
            eVar3.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            com.yandex.div.json.c cVar = eVar3.a().get(str);
            C c12 = cVar instanceof C ? (C) cVar : null;
            if (c12 != null) {
                if (c12 instanceof e) {
                    str = "set";
                } else if (c12 instanceof c) {
                    str = "fade";
                } else if (c12 instanceof d) {
                    str = "scale";
                } else {
                    if (!(c12 instanceof f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "slide";
                }
            }
            switch (str.hashCode()) {
                case 113762:
                    if (str.equals("set")) {
                        eVar2 = new e(new A(eVar3, (A) (c12 != null ? c12.c() : null), false, jSONObject2));
                        return eVar2;
                    }
                    break;
                case 3135100:
                    if (str.equals("fade")) {
                        eVar2 = new c(new C38366h1(eVar3, (C38366h1) (c12 != null ? c12.c() : null), false, jSONObject2));
                        return eVar2;
                    }
                    break;
                case 109250890:
                    if (str.equals("scale")) {
                        eVar2 = new d(new Z4(eVar3, (Z4) (c12 != null ? c12.c() : null), false, jSONObject2));
                        return eVar2;
                    }
                    break;
                case 109526449:
                    if (str.equals("slide")) {
                        eVar2 = new f(new O5(eVar3, (O5) (c12 != null ? c12.c() : null), false, jSONObject2));
                        return eVar2;
                    }
                    break;
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/C$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/C$c;", "Lcom/yandex/div2/C;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c extends C {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38366h1 f371021c;

        public c(@Y61.k C38366h1 c38366h1) {
            super(null);
            this.f371021c = c38366h1;
        }
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/C$d;", "Lcom/yandex/div2/C;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d extends C {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Z4 f371022c;

        public d(@Y61.k Z4 z42) {
            super(null);
            this.f371022c = z42;
        }
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/C$e;", "Lcom/yandex/div2/C;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class e extends C {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final A f371023c;

        public e(@Y61.k A a12) {
            super(null);
            this.f371023c = a12;
        }
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/C$f;", "Lcom/yandex/div2/C;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class f extends C {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final O5 f371024c;

        public f(@Y61.k O5 o52) {
            super(null);
            this.f371024c = o52;
        }
    }

    public /* synthetic */ C(C42822w c42822w) {
        this();
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final B a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        if (this instanceof e) {
            A a12 = ((e) this).f371023c;
            a12.getClass();
            Y41.q<String, JSONObject, com.yandex.div.json.e, List<B>> qVar = A.f370590d;
            return new B.e(new C38623z(H21.b.i(a12.f370591a, eVar, "items", jSONObject, A.f370588b, qVar)));
        }
        if (this instanceof c) {
            return new B.c(((c) this).f371021c.a(eVar, jSONObject));
        }
        if (this instanceof d) {
            return new B.d(((d) this).f371022c.a(eVar, jSONObject));
        }
        if (this instanceof f) {
            return new B.f(((f) this).f371024c.a(eVar, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Y61.k
    public final Object c() {
        if (this instanceof e) {
            return ((e) this).f371023c;
        }
        if (this instanceof c) {
            return ((c) this).f371021c;
        }
        if (this instanceof d) {
            return ((d) this).f371022c;
        }
        if (this instanceof f) {
            return ((f) this).f371024c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public C() {
    }
}
