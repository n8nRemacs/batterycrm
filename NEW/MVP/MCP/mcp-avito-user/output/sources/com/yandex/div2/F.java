package com.yandex.div2;

import com.yandex.div2.C38371h6;
import com.yandex.div2.E2;
import com.yandex.div2.F4;
import com.yandex.div2.S3;
import com.yandex.div2.Y3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivBackground.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/div2/F;", "Lcom/yandex/div/json/b;", "<init>", "()V", "b", "c", "d", "e", "f", "g", "Lcom/yandex/div2/F$d;", "Lcom/yandex/div2/F$f;", "Lcom/yandex/div2/F$c;", "Lcom/yandex/div2/F$g;", "Lcom/yandex/div2/F$e;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class F implements com.yandex.div.json.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f372262a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<com.yandex.div.json.e, JSONObject, F> f372263b = a.f372264l;

    /* compiled from: DivBackground.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/F;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/F;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, F> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f372264l = new a();

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
        public final F invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            com.yandex.div.json.e eVar2 = eVar;
            JSONObject jSONObject2 = jSONObject;
            F.f372262a.getClass();
            eVar2.getClass();
            String str = (String) com.yandex.div.internal.parser.r.a(jSONObject2);
            switch (str.hashCode()) {
                case -30518633:
                    if (str.equals("nine_patch_image")) {
                        Y3.f374043c.getClass();
                        return new e(Y3.b.a(eVar2, jSONObject2));
                    }
                    break;
                case 89650992:
                    if (str.equals("gradient")) {
                        S3.f373502c.getClass();
                        return new d(S3.b.a(eVar2, jSONObject2));
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        E2.f372209h.getClass();
                        return new c(E2.e.a(eVar2, jSONObject2));
                    }
                    break;
                case 109618859:
                    if (str.equals("solid")) {
                        C38371h6.f375274b.getClass();
                        return new g(C38371h6.b.a(eVar2, jSONObject2));
                    }
                    break;
                case 1881846096:
                    if (str.equals("radial_gradient")) {
                        F4.f372271e.getClass();
                        return new f(F4.b.a(eVar2, jSONObject2));
                    }
                    break;
            }
            com.yandex.div.json.c cVarA = eVar2.a().a(str, jSONObject2);
            G g12 = cVarA instanceof G ? (G) cVarA : null;
            if (g12 != null) {
                return g12.a(eVar2, jSONObject2);
            }
            throw com.yandex.div.json.j.m(jSONObject2, "type", str);
        }
    }

    /* compiled from: DivBackground.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/F$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivBackground.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/F$c;", "Lcom/yandex/div2/F;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c extends F {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final E2 f372265c;

        public c(@Y61.k E2 e22) {
            super(null);
            this.f372265c = e22;
        }
    }

    /* compiled from: DivBackground.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/F$d;", "Lcom/yandex/div2/F;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d extends F {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final S3 f372266c;

        public d(@Y61.k S3 s32) {
            super(null);
            this.f372266c = s32;
        }
    }

    /* compiled from: DivBackground.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/F$e;", "Lcom/yandex/div2/F;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class e extends F {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Y3 f372267c;

        public e(@Y61.k Y3 y32) {
            super(null);
            this.f372267c = y32;
        }
    }

    /* compiled from: DivBackground.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/F$f;", "Lcom/yandex/div2/F;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class f extends F {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final F4 f372268c;

        public f(@Y61.k F4 f42) {
            super(null);
            this.f372268c = f42;
        }
    }

    /* compiled from: DivBackground.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div2/F$g;", "Lcom/yandex/div2/F;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class g extends F {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C38371h6 f372269c;

        public g(@Y61.k C38371h6 c38371h6) {
            super(null);
            this.f372269c = c38371h6;
        }
    }

    public /* synthetic */ F(C42822w c42822w) {
        this();
    }

    public F() {
    }
}
