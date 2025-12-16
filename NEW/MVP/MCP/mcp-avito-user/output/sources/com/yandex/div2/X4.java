package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivScaleTransition.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/X4;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div2/c8;", "c", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class X4 implements com.yandex.div.json.b, InterfaceC38280c8 {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final c f374003g = new c(null);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f374004h = com.google.firebase.components.g.i(200, com.yandex.div.json.expressions.b.f370552a);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivAnimationInterpolator> f374005i = b.a.a(DivAnimationInterpolator.EASE_IN_OUT);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f374006j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f374007k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f374008l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f374009m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f374010n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final O3 f374011o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final O3 f374012p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final O3 f374013q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final O3 f374014r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final W4 f374015s;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f374016a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivAnimationInterpolator> f374017b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> f374018c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> f374019d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> f374020e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f374021f;

    /* compiled from: DivScaleTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/X4;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/X4;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, X4> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f374022l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final X4 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            X4.f374003g.getClass();
            return c.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivScaleTransition.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f374023l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
        }
    }

    /* compiled from: DivScaleTransition.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001c\u001a\u00020\u001b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/div2/X4$c;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "DURATION_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "DURATION_VALIDATOR", "Lcom/yandex/div2/DivAnimationInterpolator;", "INTERPOLATOR_DEFAULT_VALUE", "", "PIVOT_X_DEFAULT_VALUE", "PIVOT_X_TEMPLATE_VALIDATOR", "PIVOT_X_VALIDATOR", "PIVOT_Y_DEFAULT_VALUE", "PIVOT_Y_TEMPLATE_VALIDATOR", "PIVOT_Y_VALIDATOR", "SCALE_DEFAULT_VALUE", "SCALE_TEMPLATE_VALIDATOR", "SCALE_VALIDATOR", "START_DELAY_DEFAULT_VALUE", "START_DELAY_TEMPLATE_VALIDATOR", "START_DELAY_VALIDATOR", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_INTERPOLATOR", "Lcom/yandex/div/internal/parser/D;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static X4 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            O3 o32 = X4.f374011o;
            com.yandex.div.json.expressions.b<Long> bVar = X4.f374004h;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject, "duration", lVar, o32, f370579a, bVar, dVar);
            if (bVarI != null) {
                bVar = bVarI;
            }
            DivAnimationInterpolator.f371286c.getClass();
            Y41.l<String, DivAnimationInterpolator> lVar2 = DivAnimationInterpolator.f371287d;
            com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVar2 = X4.f374005i;
            com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVarI2 = C38107c.i(jSONObject, "interpolator", lVar2, C38107c.f370139a, f370579a, bVar2, X4.f374010n);
            if (bVarI2 != null) {
                bVar2 = bVarI2;
            }
            Y41.l<Number, Double> lVar3 = com.yandex.div.internal.parser.y.f370150d;
            O3 o33 = X4.f374012p;
            com.yandex.div.json.expressions.b<Double> bVar3 = X4.f374006j;
            E.c cVar = com.yandex.div.internal.parser.E.f370134d;
            com.yandex.div.json.expressions.b<Double> bVarI3 = C38107c.i(jSONObject, "pivot_x", lVar3, o33, f370579a, bVar3, cVar);
            if (bVarI3 != null) {
                bVar3 = bVarI3;
            }
            O3 o34 = X4.f374013q;
            com.yandex.div.json.expressions.b<Double> bVar4 = X4.f374007k;
            com.yandex.div.json.expressions.b<Double> bVarI4 = C38107c.i(jSONObject, "pivot_y", lVar3, o34, f370579a, bVar4, cVar);
            if (bVarI4 != null) {
                bVar4 = bVarI4;
            }
            O3 o35 = X4.f374014r;
            com.yandex.div.json.expressions.b<Double> bVar5 = X4.f374008l;
            com.yandex.div.json.expressions.b<Double> bVarI5 = C38107c.i(jSONObject, "scale", lVar3, o35, f370579a, bVar5, cVar);
            if (bVarI5 != null) {
                bVar5 = bVarI5;
            }
            W4 w42 = X4.f374015s;
            com.yandex.div.json.expressions.b<Long> bVar6 = X4.f374009m;
            com.yandex.div.json.expressions.b<Long> bVarI6 = C38107c.i(jSONObject, "start_delay", lVar, w42, f370579a, bVar6, dVar);
            return new X4(bVar, bVar2, bVar3, bVar4, bVar5, bVarI6 == null ? bVar6 : bVarI6);
        }

        public c() {
        }
    }

    static {
        Double dValueOf = Double.valueOf(0.5d);
        f374006j = b.a.a(dValueOf);
        f374007k = b.a.a(dValueOf);
        f374008l = b.a.a(Double.valueOf(0.0d));
        f374009m = b.a.a(0L);
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAnimationInterpolator.values());
        b bVar = b.f374023l;
        aVar.getClass();
        f374010n = new com.yandex.div.internal.parser.C(bVar, objC);
        f374011o = new O3(26);
        f374012p = new O3(27);
        f374013q = new O3(28);
        f374014r = new O3(29);
        f374015s = new W4(0);
        int i12 = a.f374022l;
    }

    @C21.b
    public X4() {
        this(null, null, null, null, null, null, 63, null);
    }

    @C21.b
    public X4(@Y61.k com.yandex.div.json.expressions.b<Long> bVar, @Y61.k com.yandex.div.json.expressions.b<DivAnimationInterpolator> bVar2, @Y61.k com.yandex.div.json.expressions.b<Double> bVar3, @Y61.k com.yandex.div.json.expressions.b<Double> bVar4, @Y61.k com.yandex.div.json.expressions.b<Double> bVar5, @Y61.k com.yandex.div.json.expressions.b<Long> bVar6) {
        this.f374016a = bVar;
        this.f374017b = bVar2;
        this.f374018c = bVar3;
        this.f374019d = bVar4;
        this.f374020e = bVar5;
        this.f374021f = bVar6;
    }

    public /* synthetic */ X4(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, com.yandex.div.json.expressions.b bVar4, com.yandex.div.json.expressions.b bVar5, com.yandex.div.json.expressions.b bVar6, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? f374004h : bVar, (i12 & 2) != 0 ? f374005i : bVar2, (i12 & 4) != 0 ? f374006j : bVar3, (i12 & 8) != 0 ? f374007k : bVar4, (i12 & 16) != 0 ? f374008l : bVar5, (i12 & 32) != 0 ? f374009m : bVar6);
    }
}
