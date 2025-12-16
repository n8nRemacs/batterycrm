package com.yandex.div2;

import com.yandex.div.internal.parser.C38107c;
import com.yandex.div2.C38303f1;
import com.yandex.div2.DivSlideTransition;
import com.yandex.div2.X4;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivAppearanceTransition.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/yandex/div2/B;", "Lcom/yandex/div/json/b;", "<init>", "()V", "b", "c", "d", "e", "f", "Lcom/yandex/div2/B$e;", "Lcom/yandex/div2/B$c;", "Lcom/yandex/div2/B$d;", "Lcom/yandex/div2/B$f;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class B implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f370624a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, B> f370625b = a.f370626l;

    /* compiled from: DivAppearanceTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/B;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/B;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, B> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f370626l = new a();

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
        public final B invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            b bVar = B.f370624a;
            bVar.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            switch (str.hashCode()) {
                case 113762:
                    if (str.equals("set")) {
                        C38623z.f377220b.getClass();
                        com.yandex.div.json.i f370579a = eVar2.getF370579a();
                        bVar.getClass();
                        return new e(new C38623z(C38107c.f(jSONObject2, "items", B.f370625b, C38623z.f377221c, f370579a, eVar2)));
                    }
                    break;
                case 3135100:
                    if (str.equals("fade")) {
                        C38303f1.f374755e.getClass();
                        return new c(C38303f1.c.a(eVar2, jSONObject2));
                    }
                    break;
                case 109250890:
                    if (str.equals("scale")) {
                        X4.f374003g.getClass();
                        return new d(X4.c.a(eVar2, jSONObject2));
                    }
                    break;
                case 109526449:
                    if (str.equals("slide")) {
                        DivSlideTransition.f371965f.getClass();
                        return new f(DivSlideTransition.d.a(eVar2, jSONObject2));
                    }
                    break;
            }
            com.yandex.div.json.c cVarA = eVar2.a().a(str, jSONObject2);
            C c12 = cVarA instanceof C ? (C) cVarA : null;
            if (c12 != null) {
                return c12.a(eVar2, jSONObject2);
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: DivAppearanceTransition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/B$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivAppearanceTransition.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/B$c;", "Lcom/yandex/div2/B;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c extends B {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38303f1 f370627c;

        public c(@Y61.k C38303f1 c38303f1) {
            super(null);
            this.f370627c = c38303f1;
        }
    }

    /* compiled from: DivAppearanceTransition.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/B$d;", "Lcom/yandex/div2/B;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d extends B {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final X4 f370628c;

        public d(@Y61.k X4 x42) {
            super(null);
            this.f370628c = x42;
        }
    }

    /* compiled from: DivAppearanceTransition.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/B$e;", "Lcom/yandex/div2/B;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class e extends B {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38623z f370629c;

        public e(@Y61.k C38623z c38623z) {
            super(null);
            this.f370629c = c38623z;
        }
    }

    /* compiled from: DivAppearanceTransition.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/B$f;", "Lcom/yandex/div2/B;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class f extends B {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DivSlideTransition f370630c;

        public f(@Y61.k DivSlideTransition divSlideTransition) {
            super(null);
            this.f370630c = divSlideTransition;
        }
    }

    public /* synthetic */ B(C42822w c42822w) {
        this();
    }

    public B() {
    }
}
