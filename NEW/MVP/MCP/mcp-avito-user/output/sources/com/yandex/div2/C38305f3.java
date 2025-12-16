package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.G5;
import com.yandex.div2.K5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivIndicatorTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/f3;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/DivIndicator;", "S", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.f3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38305f3 implements com.yandex.div.json.b, com.yandex.div.json.c<DivIndicator> {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final M2 f374846A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final M2 f374847B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final M2 f374848C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final M2 f374849D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public static final M2 f374850E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public static final M2 f374851F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, DivAccessibility> f374852G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Integer>> f374853H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> f374854I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, U4> f374855J0;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> f374856K0;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentVertical>> f374857L0;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public static final DivAccessibility f374858M;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> f374859M0;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Integer> f374860N;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivIndicator.Animation>> f374861N0;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f374862O;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<com.yandex.div2.F>> f374863O0;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f374864P;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.K> f374865P0;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivIndicator.Animation> f374866Q;

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f374867Q0;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div2.K f374868R;

    /* renamed from: R0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<S0>> f374869R0;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public static final K5.e f374870S;

    /* renamed from: S0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<C38273c1>> f374871S0;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Integer> f374872T;

    /* renamed from: T0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, C38567u1> f374873T0;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public static final Y0 f374874U;

    /* renamed from: U0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, K5> f374875U0;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f374876V;

    /* renamed from: V0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, String> f374877V0;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public static final Y0 f374878W;

    /* renamed from: W0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Integer>> f374879W0;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public static final G5.d f374880X;

    /* renamed from: X0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, U4> f374881X0;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public static final C38502q1 f374882Y;

    /* renamed from: Y0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, U4> f374883Y0;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public static final C38260a8 f374884Z;

    /* renamed from: Z0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, AbstractC38265b3> f374885Z0;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivVisibility> f374886a0;

    /* renamed from: a1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, Y0> f374887a1;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public static final K5.d f374888b0;

    /* renamed from: b1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> f374889b1;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f374890c0;

    /* renamed from: c1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, Y0> f374891c1;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f374892d0;

    /* renamed from: d1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, String> f374893d1;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f374894e0;

    /* renamed from: e1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f374895e1;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f374896f0;

    /* renamed from: f1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> f374897f1;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public static final C38459n2 f374898g0;

    /* renamed from: g1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, G5> f374899g1;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public static final C38285d3 f374900h0;

    /* renamed from: h1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, C38502q1> f374901h1;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public static final C38285d3 f374902i0;

    /* renamed from: i1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivTooltip>> f374903i1;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public static final C38285d3 f374904j0;

    /* renamed from: j1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, C38260a8> f374905j1;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public static final C38295e3 f374906k0;

    /* renamed from: k1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, T> f374907k1;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final C38295e3 f374908l0;

    /* renamed from: l1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.B> f374909l1;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final C38285d3 f374910m0;

    /* renamed from: m1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.B> f374911m1;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final C38285d3 f374912n0;

    /* renamed from: n1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivTransitionTrigger>> f374913n1;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final C38295e3 f374914o0;

    /* renamed from: o1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivVisibility>> f374915o1;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public static final C38295e3 f374916p0;

    /* renamed from: p1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, w8> f374917p1;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public static final M2 f374918q0;

    /* renamed from: q1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<w8>> f374919q1;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final C38295e3 f374920r0;

    /* renamed from: r1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, K5> f374921r1;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final C38285d3 f374922s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final C38285d3 f374923t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final C38285d3 f374924u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final C38285d3 f374925v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final C38285d3 f374926w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final C38285d3 f374927x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final C38295e3 f374928y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public static final M2 f374929z0;

    /* renamed from: A, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<J5> f374930A;

    /* renamed from: B, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38549s1> f374931B;

    /* renamed from: C, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<Y7>> f374932C;

    /* renamed from: D, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38270b8> f374933D;

    /* renamed from: E, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<U> f374934E;

    /* renamed from: F, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div2.C> f374935F;

    /* renamed from: G, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div2.C> f374936G;

    /* renamed from: H, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<DivTransitionTrigger>> f374937H;

    /* renamed from: I, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivVisibility>> f374938I;

    /* renamed from: J, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<x8> f374939J;

    /* renamed from: K, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<x8>> f374940K;

    /* renamed from: L, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<L5> f374941L;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38447m> f374942a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Integer>> f374943b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Double>> f374944c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<V4> f374945d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> f374946e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivAlignmentVertical>> f374947f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Double>> f374948g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivIndicator.Animation>> f374949h;

    /* renamed from: i, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<com.yandex.div2.G>> f374950i;

    /* renamed from: j, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div2.L> f374951j;

    /* renamed from: k, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f374952k;

    /* renamed from: l, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<T0>> f374953l;

    /* renamed from: m, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<C38283d1>> f374954m;

    /* renamed from: n, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38585w1> f374955n;

    /* renamed from: o, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<L5> f374956o;

    /* renamed from: p, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<String> f374957p;

    /* renamed from: q, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Integer>> f374958q;

    /* renamed from: r, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<V4> f374959r;

    /* renamed from: s, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<V4> f374960s;

    /* renamed from: t, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<AbstractC38275c3> f374961t;

    /* renamed from: u, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38233a1> f374962u;

    /* renamed from: v, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Double>> f374963v;

    /* renamed from: w, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38233a1> f374964w;

    /* renamed from: x, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<String> f374965x;

    /* renamed from: y, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f374966y;

    /* renamed from: z, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<r>> f374967z;

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivAction;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$A */
    public static final class A extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> {

        /* renamed from: l, reason: collision with root package name */
        public static final A f374968l = new A();

        public A() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivAction> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            DivAction.f371211f.getClass();
            return C38107c.k(jSONObject, str2, DivAction.f371215j, C38305f3.f374928y0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/G5;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/G5;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$B */
    public static final class B extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, G5> {

        /* renamed from: l, reason: collision with root package name */
        public static final B f374969l = new B();

        public B() {
            super(3);
        }

        @Override // Y41.q
        public final G5 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            G5.f372487a.getClass();
            G5 g52 = (G5) C38107c.g(jSONObject, str, G5.f372488b, eVar2.getF370579a(), eVar2);
            return g52 == null ? C38305f3.f374880X : g52;
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/q1;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/q1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$C */
    public static final class C extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, C38502q1> {

        /* renamed from: l, reason: collision with root package name */
        public static final C f374970l = new C();

        public C() {
            super(3);
        }

        @Override // Y41.q
        public final C38502q1 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            C38502q1.f376146c.getClass();
            C38502q1 c38502q1 = (C38502q1) C38107c.g(jSONObject, str, C38502q1.f376150g, eVar2.getF370579a(), eVar2);
            return c38502q1 == null ? C38305f3.f374882Y : c38502q1;
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivTooltip;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$D */
    public static final class D extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivTooltip>> {

        /* renamed from: l, reason: collision with root package name */
        public static final D f374971l = new D();

        public D() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivTooltip> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            DivTooltip.f372130h.getClass();
            return C38107c.k(jSONObject, str2, DivTooltip.f372135m, C38305f3.f374846A0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/a8;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/a8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$E */
    public static final class E extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, C38260a8> {

        /* renamed from: l, reason: collision with root package name */
        public static final E f374972l = new E();

        public E() {
            super(3);
        }

        @Override // Y41.q
        public final C38260a8 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            C38260a8.f374376d.getClass();
            C38260a8 c38260a8 = (C38260a8) C38107c.g(jSONObject, str, C38260a8.f374379g, eVar2.getF370579a(), eVar2);
            return c38260a8 == null ? C38305f3.f374884Z : c38260a8;
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/T;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/T;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$F */
    public static final class F extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, T> {

        /* renamed from: l, reason: collision with root package name */
        public static final F f374973l = new F();

        public F() {
            super(3);
        }

        @Override // Y41.q
        public final T invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            T.f373510a.getClass();
            return (T) C38107c.g(jSONObject2, str, T.f373511b, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/B;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/B;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$G */
    public static final class G extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.B> {

        /* renamed from: l, reason: collision with root package name */
        public static final G f374974l = new G();

        public G() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div2.B invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            com.yandex.div2.B.f370624a.getClass();
            return (com.yandex.div2.B) C38107c.g(jSONObject2, str, com.yandex.div2.B.f370625b, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/B;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/B;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$H */
    public static final class H extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.B> {

        /* renamed from: l, reason: collision with root package name */
        public static final H f374975l = new H();

        public H() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div2.B invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            com.yandex.div2.B.f370624a.getClass();
            return (com.yandex.div2.B) C38107c.g(jSONObject2, str, com.yandex.div2.B.f370625b, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivTransitionTrigger;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$I */
    public static final class I extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivTransitionTrigger>> {

        /* renamed from: l, reason: collision with root package name */
        public static final I f374976l = new I();

        public I() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivTransitionTrigger> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            DivTransitionTrigger.f372167c.getClass();
            return C38107c.j(jSONObject2, str, DivTransitionTrigger.f372168d, C38305f3.f374848C0, eVar.getF370579a());
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.f3$J */
    public static final class J extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final J f374977l = new J();

        public J() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.f3$K */
    public static final class K extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final K f374978l = new K();

        public K() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.f3$L */
    public static final class L extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final L f374979l = new L();

        public L() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivIndicator.Animation);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.f3$M */
    public static final class M extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final M f374980l = new M();

        public M() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$N */
    public static final class N extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f374981l = 0;

        static {
            new N();
        }

        public N() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            eVar.getClass();
            return (String) C38107c.a(jSONObject2, str, C38107c.f370141c, C38107c.f370139a);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/w8;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$O */
    public static final class O extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<w8>> {

        /* renamed from: l, reason: collision with root package name */
        public static final O f374982l = new O();

        public O() {
            super(3);
        }

        @Override // Y41.q
        public final List<w8> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            w8.f376942h.getClass();
            return C38107c.k(jSONObject, str2, w8.f376950p, C38305f3.f374850E0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/w8;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/w8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$P */
    public static final class P extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, w8> {

        /* renamed from: l, reason: collision with root package name */
        public static final P f374983l = new P();

        public P() {
            super(3);
        }

        @Override // Y41.q
        public final w8 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            w8.f376942h.getClass();
            return (w8) C38107c.g(jSONObject2, str, w8.f376950p, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivVisibility;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$Q */
    public static final class Q extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivVisibility>> {

        /* renamed from: l, reason: collision with root package name */
        public static final Q f374984l = new Q();

        public Q() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivVisibility> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivVisibility.f372192c.getClass();
            Y41.l<String, DivVisibility> lVar = DivVisibility.f372193d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivVisibility> bVar = C38305f3.f374886a0;
            com.yandex.div.json.expressions.b<DivVisibility> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, C38305f3.f374896f0);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/K5;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/K5;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$R */
    public static final class R extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, K5> {

        /* renamed from: l, reason: collision with root package name */
        public static final R f374985l = new R();

        public R() {
            super(3);
        }

        @Override // Y41.q
        public final K5 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            K5.f372712a.getClass();
            K5 k52 = (K5) C38107c.g(jSONObject, str, K5.f372713b, eVar2.getF370579a(), eVar2);
            return k52 == null ? C38305f3.f374888b0 : k52;
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u000fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u000fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u000fR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u000fR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\nR\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\nR\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u000fR\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u000fR\u0014\u00107\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u001f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u000fR\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u001f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u000fR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0019R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0019R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0019R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0019R\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0019R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020K0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0019R\u0014\u0010N\u001a\u00020-8\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020T0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010SR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00140P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010SR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020W0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010SR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010\u0019R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u0019R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020W0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\nR\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006a"}, d2 = {"Lcom/yandex/div2/f3$S;", "", "<init>", "()V", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/b;", "", "ACTIVE_ITEM_COLOR_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "", "ACTIVE_ITEM_SIZE_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/F;", "ACTIVE_ITEM_SIZE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "ACTIVE_ITEM_SIZE_VALIDATOR", "ALPHA_DEFAULT_VALUE", "ALPHA_TEMPLATE_VALIDATOR", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivIndicator$Animation;", "ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/G;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/F;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/K;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/K;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/T0;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/S0;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/d1;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/c1;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/K5$e;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/K5$e;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "INACTIVE_ITEM_COLOR_DEFAULT_VALUE", "Lcom/yandex/div2/Y0;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/Y0;", "MINIMUM_ITEM_SIZE_DEFAULT_VALUE", "MINIMUM_ITEM_SIZE_TEMPLATE_VALIDATOR", "MINIMUM_ITEM_SIZE_VALIDATOR", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/r;", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/G5$d;", "SHAPE_DEFAULT_VALUE", "Lcom/yandex/div2/G5$d;", "Lcom/yandex/div2/q1;", "SPACE_BETWEEN_CENTERS_DEFAULT_VALUE", "Lcom/yandex/div2/q1;", "Lcom/yandex/div2/Y7;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/a8;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/a8;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_ANIMATION", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/x8;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/w8;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.f3$S */
    public static final class S {
        public /* synthetic */ S(C42822w c42822w) {
            this();
        }

        public S() {
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/DivAccessibility;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/DivAccessibility;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$a, reason: case insensitive filesystem */
    public static final class C38306a extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, DivAccessibility> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38306a f374986l = new C38306a();

        public C38306a() {
            super(3);
        }

        @Override // Y41.q
        public final DivAccessibility invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            DivAccessibility.f371175f.getClass();
            DivAccessibility divAccessibility = (DivAccessibility) C38107c.g(jSONObject, str, DivAccessibility.f371182m, eVar2.getF370579a(), eVar2);
            return divAccessibility == null ? C38305f3.f374858M : divAccessibility;
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$b, reason: case insensitive filesystem */
    public static final class C38307b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Integer>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38307b f374987l = new C38307b();

        public C38307b() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Integer> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Object, Integer> lVar = com.yandex.div.internal.parser.y.f370147a;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Integer> bVar = C38305f3.f374860N;
            com.yandex.div.json.expressions.b<Integer> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, com.yandex.div.internal.parser.E.f370136f);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$c, reason: case insensitive filesystem */
    public static final class C38308c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38308c f374988l = new C38308c();

        public C38308c() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Double> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Double> lVar = com.yandex.div.internal.parser.y.f370150d;
            C38285d3 c38285d3 = C38305f3.f374900h0;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Double> bVar = C38305f3.f374862O;
            com.yandex.div.json.expressions.b<Double> bVarI = C38107c.i(jSONObject, str2, lVar, c38285d3, f370579a, bVar, com.yandex.div.internal.parser.E.f370134d);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/U4;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/U4;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$d, reason: case insensitive filesystem */
    public static final class C38309d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, U4> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38309d f374989l = new C38309d();

        public C38309d() {
            super(3);
        }

        @Override // Y41.q
        public final U4 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            U4.f373687f.getClass();
            return (U4) C38107c.g(jSONObject2, str, U4.f373691j, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$e, reason: case insensitive filesystem */
    public static final class C38310e extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38310e f374990l = new C38310e();

        public C38310e() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivAlignmentHorizontal.f371238c.getClass();
            return C38107c.i(jSONObject, str2, DivAlignmentHorizontal.f371239d, C38107c.f370139a, eVar.getF370579a(), null, C38305f3.f374890c0);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAlignmentVertical;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$f, reason: case insensitive filesystem */
    public static final class C38311f extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentVertical>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38311f f374991l = new C38311f();

        public C38311f() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivAlignmentVertical> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivAlignmentVertical.f371246c.getClass();
            return C38107c.i(jSONObject, str2, DivAlignmentVertical.f371247d, C38107c.f370139a, eVar.getF370579a(), null, C38305f3.f374892d0);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$g, reason: case insensitive filesystem */
    public static final class C38312g extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38312g f374992l = new C38312g();

        public C38312g() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Double> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Double> lVar = com.yandex.div.internal.parser.y.f370150d;
            C38285d3 c38285d3 = C38305f3.f374904j0;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Double> bVar = C38305f3.f374864P;
            com.yandex.div.json.expressions.b<Double> bVarI = C38107c.i(jSONObject, str2, lVar, c38285d3, f370579a, bVar, com.yandex.div.internal.parser.E.f370134d);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivIndicator$Animation;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$h, reason: case insensitive filesystem */
    public static final class C38313h extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivIndicator.Animation>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38313h f374993l = new C38313h();

        public C38313h() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivIndicator.Animation> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivIndicator.Animation.f371639c.getClass();
            Y41.l<String, DivIndicator.Animation> lVar = DivIndicator.Animation.f371640d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivIndicator.Animation> bVar = C38305f3.f374866Q;
            com.yandex.div.json.expressions.b<DivIndicator.Animation> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, C38305f3.f374894e0);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/F;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$i, reason: case insensitive filesystem */
    public static final class C38314i extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<com.yandex.div2.F>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38314i f374994l = new C38314i();

        public C38314i() {
            super(3);
        }

        @Override // Y41.q
        public final List<com.yandex.div2.F> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            com.yandex.div2.F.f372262a.getClass();
            return C38107c.k(jSONObject, str2, com.yandex.div2.F.f372263b, C38305f3.f374906k0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/K;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/K;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$j, reason: case insensitive filesystem */
    public static final class C38315j extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.K> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38315j f374995l = new C38315j();

        public C38315j() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div2.K invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            com.yandex.div2.K.f372635f.getClass();
            com.yandex.div2.K k12 = (com.yandex.div2.K) C38107c.g(jSONObject, str, com.yandex.div2.K.f372638i, eVar2.getF370579a(), eVar2);
            return k12 == null ? C38305f3.f374868R : k12;
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$k, reason: case insensitive filesystem */
    public static final class C38316k extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38316k f374996l = new C38316k();

        public C38316k() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370151e, C38305f3.f374912n0, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370132b);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/f3;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/f3;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$l, reason: case insensitive filesystem */
    public static final class C38317l extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38305f3> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f374997l = 0;

        static {
            new C38317l();
        }

        public C38317l() {
            super(2);
        }

        @Override // Y41.p
        public final C38305f3 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new C38305f3(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/S0;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$m, reason: case insensitive filesystem */
    public static final class C38318m extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<S0>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38318m f374998l = new C38318m();

        public C38318m() {
            super(3);
        }

        @Override // Y41.q
        public final List<S0> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            S0.f373492a.getClass();
            return C38107c.k(jSONObject, str2, S0.f373500i, C38305f3.f374914o0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/c1;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$n, reason: case insensitive filesystem */
    public static final class C38319n extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<C38273c1>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38319n f374999l = new C38319n();

        public C38319n() {
            super(3);
        }

        @Override // Y41.q
        public final List<C38273c1> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            C38273c1.f374687c.getClass();
            return C38107c.k(jSONObject, str2, C38273c1.f374689e, C38305f3.f374918q0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/u1;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/u1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$o, reason: case insensitive filesystem */
    public static final class C38320o extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, C38567u1> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38320o f375000l = new C38320o();

        public C38320o() {
            super(3);
        }

        @Override // Y41.q
        public final C38567u1 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            C38567u1.f376619f.getClass();
            return (C38567u1) C38107c.g(jSONObject2, str, C38567u1.f376624k, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/K5;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/K5;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$p, reason: case insensitive filesystem */
    public static final class C38321p extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, K5> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38321p f375001l = new C38321p();

        public C38321p() {
            super(3);
        }

        @Override // Y41.q
        public final K5 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            K5.f372712a.getClass();
            K5 k52 = (K5) C38107c.g(jSONObject, str, K5.f372713b, eVar2.getF370579a(), eVar2);
            return k52 == null ? C38305f3.f374870S : k52;
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$q, reason: case insensitive filesystem */
    public static final class C38322q extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38322q f375002l = new C38322q();

        public C38322q() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return (String) C38107c.h(jSONObject, str, C38107c.f370141c, C38305f3.f374923t0, eVar.getF370579a());
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$r, reason: case insensitive filesystem */
    public static final class C38323r extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Integer>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38323r f375003l = new C38323r();

        public C38323r() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Integer> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Object, Integer> lVar = com.yandex.div.internal.parser.y.f370147a;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Integer> bVar = C38305f3.f374872T;
            com.yandex.div.json.expressions.b<Integer> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, com.yandex.div.internal.parser.E.f370136f);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/U4;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/U4;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$s, reason: case insensitive filesystem */
    public static final class C38324s extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, U4> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38324s f375004l = new C38324s();

        public C38324s() {
            super(3);
        }

        @Override // Y41.q
        public final U4 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            U4.f373687f.getClass();
            return (U4) C38107c.g(jSONObject2, str, U4.f373691j, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/U4;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/U4;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$t */
    public static final class t extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, U4> {

        /* renamed from: l, reason: collision with root package name */
        public static final t f375005l = new t();

        public t() {
            super(3);
        }

        @Override // Y41.q
        public final U4 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            U4.f373687f.getClass();
            return (U4) C38107c.g(jSONObject2, str, U4.f373691j, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/b3;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/b3;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$u */
    public static final class u extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, AbstractC38265b3> {

        /* renamed from: l, reason: collision with root package name */
        public static final u f375006l = new u();

        public u() {
            super(3);
        }

        @Override // Y41.q
        public final AbstractC38265b3 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            AbstractC38265b3.f374394a.getClass();
            return (AbstractC38265b3) C38107c.g(jSONObject2, str, AbstractC38265b3.f374395b, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/Y0;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/Y0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$v */
    public static final class v extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, Y0> {

        /* renamed from: l, reason: collision with root package name */
        public static final v f375007l = new v();

        public v() {
            super(3);
        }

        @Override // Y41.q
        public final Y0 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            Y0.f374024f.getClass();
            Y0 y02 = (Y0) C38107c.g(jSONObject, str, Y0.f374035q, eVar2.getF370579a(), eVar2);
            return y02 == null ? C38305f3.f374874U : y02;
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$w */
    public static final class w extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> {

        /* renamed from: l, reason: collision with root package name */
        public static final w f375008l = new w();

        public w() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Double> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Double> lVar = com.yandex.div.internal.parser.y.f370150d;
            C38285d3 c38285d3 = C38305f3.f374925v0;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Double> bVar = C38305f3.f374876V;
            com.yandex.div.json.expressions.b<Double> bVarI = C38107c.i(jSONObject, str2, lVar, c38285d3, f370579a, bVar, com.yandex.div.internal.parser.E.f370134d);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/Y0;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/Y0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$x */
    public static final class x extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, Y0> {

        /* renamed from: l, reason: collision with root package name */
        public static final x f375009l = new x();

        public x() {
            super(3);
        }

        @Override // Y41.q
        public final Y0 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            Y0.f374024f.getClass();
            Y0 y02 = (Y0) C38107c.g(jSONObject, str, Y0.f374035q, eVar2.getF370579a(), eVar2);
            return y02 == null ? C38305f3.f374878W : y02;
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$y */
    public static final class y extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final y f375010l = new y();

        public y() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return (String) C38107c.h(jSONObject, str, C38107c.f370141c, C38107c.f370139a, eVar.getF370579a());
        }
    }

    /* compiled from: DivIndicatorTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.f3$z */
    public static final class z extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final z f375011l = new z();

        public z() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370151e, C38305f3.f374927x0, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370132b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new S(null);
        f374858M = new DivAccessibility(null, null, null, null, null, null, 63, null);
        com.yandex.div.json.expressions.b.f370552a.getClass();
        f374860N = b.a.a(16768096);
        f374862O = b.a.a(Double.valueOf(1.3d));
        f374864P = b.a.a(Double.valueOf(1.0d));
        f374866Q = b.a.a(DivIndicator.Animation.SCALE);
        com.yandex.div.json.expressions.b bVar = null;
        C42822w c42822w = null;
        f374868R = new com.yandex.div2.K(null, null, null, null, null, 31, null);
        f374870S = new K5.e(new y8(bVar, null, null, 7, null));
        f374872T = b.a.a(865180853);
        int i12 = 31;
        Object[] objArr = null == true ? 1 : 0;
        f374874U = new Y0(bVar, null == true ? 1 : 0, null == true ? 1 : 0, null, objArr, i12, c42822w);
        f374876V = b.a.a(Double.valueOf(0.5d));
        com.yandex.div.json.expressions.b bVar2 = null;
        f374878W = new Y0(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i12, c42822w);
        Object[] objArr2 = null == true ? 1 : 0;
        f374880X = new G5.d(new U4(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, objArr2, i12, null));
        f374882Y = new C38502q1(null, b.a.a(15L), 1, null);
        f374884Z = new C38260a8(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, null);
        f374886a0 = b.a.a(DivVisibility.VISIBLE);
        f374888b0 = new K5.d(new U3(null, 1, null));
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAlignmentHorizontal.values());
        J j12 = J.f374977l;
        aVar.getClass();
        f374890c0 = new com.yandex.div.internal.parser.C(j12, objC);
        f374892d0 = new com.yandex.div.internal.parser.C(K.f374978l, C42756l.C(DivAlignmentVertical.values()));
        f374894e0 = new com.yandex.div.internal.parser.C(L.f374979l, C42756l.C(DivIndicator.Animation.values()));
        f374896f0 = new com.yandex.div.internal.parser.C(M.f374980l, C42756l.C(DivVisibility.values()));
        f374898g0 = new C38459n2(29);
        f374900h0 = new C38285d3(0);
        f374902i0 = new C38285d3(1);
        f374904j0 = new C38285d3(2);
        f374906k0 = new C38295e3(0);
        f374908l0 = new C38295e3(1);
        f374910m0 = new C38285d3(3);
        f374912n0 = new C38285d3(4);
        f374914o0 = new C38295e3(2);
        f374916p0 = new C38295e3(3);
        f374918q0 = new M2(29);
        f374920r0 = new C38295e3(4);
        f374922s0 = new C38285d3(5);
        f374923t0 = new C38285d3(6);
        f374924u0 = new C38285d3(7);
        f374925v0 = new C38285d3(8);
        f374926w0 = new C38285d3(9);
        f374927x0 = new C38285d3(10);
        f374928y0 = new C38295e3(5);
        f374929z0 = new M2(22);
        f374846A0 = new M2(23);
        f374847B0 = new M2(24);
        f374848C0 = new M2(25);
        f374849D0 = new M2(26);
        f374850E0 = new M2(27);
        f374851F0 = new M2(28);
        f374852G0 = C38306a.f374986l;
        f374853H0 = C38307b.f374987l;
        f374854I0 = C38308c.f374988l;
        f374855J0 = C38309d.f374989l;
        f374856K0 = C38310e.f374990l;
        f374857L0 = C38311f.f374991l;
        f374859M0 = C38312g.f374992l;
        f374861N0 = C38313h.f374993l;
        f374863O0 = C38314i.f374994l;
        f374865P0 = C38315j.f374995l;
        f374867Q0 = C38316k.f374996l;
        f374869R0 = C38318m.f374998l;
        f374871S0 = C38319n.f374999l;
        f374873T0 = C38320o.f375000l;
        f374875U0 = C38321p.f375001l;
        f374877V0 = C38322q.f375002l;
        f374879W0 = C38323r.f375003l;
        f374881X0 = C38324s.f375004l;
        f374883Y0 = t.f375005l;
        f374885Z0 = u.f375006l;
        f374887a1 = v.f375007l;
        f374889b1 = w.f375008l;
        f374891c1 = x.f375009l;
        f374893d1 = y.f375010l;
        f374895e1 = z.f375011l;
        f374897f1 = A.f374968l;
        f374899g1 = B.f374969l;
        f374901h1 = C.f374970l;
        f374903i1 = D.f374971l;
        f374905j1 = E.f374972l;
        f374907k1 = F.f374973l;
        f374909l1 = G.f374974l;
        f374911m1 = H.f374975l;
        f374913n1 = I.f374976l;
        int i13 = N.f374981l;
        f374915o1 = Q.f374984l;
        f374917p1 = P.f374983l;
        f374919q1 = O.f374982l;
        f374921r1 = R.f374985l;
        int i14 = C38317l.f374997l;
    }

    public /* synthetic */ C38305f3(com.yandex.div.json.e eVar, C38305f3 c38305f3, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        this(eVar, (i12 & 2) != 0 ? null : c38305f3, (i12 & 4) != 0 ? false : z12, jSONObject);
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final DivIndicator a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        DivAccessibility divAccessibility = (DivAccessibility) H21.b.f(this.f374942a, eVar, "accessibility", jSONObject, f374852G0);
        if (divAccessibility == null) {
            divAccessibility = f374858M;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        com.yandex.div.json.expressions.b<Integer> bVar = (com.yandex.div.json.expressions.b) H21.b.d(this.f374943b, eVar, "active_item_color", jSONObject, f374853H0);
        if (bVar == null) {
            bVar = f374860N;
        }
        com.yandex.div.json.expressions.b<Integer> bVar2 = bVar;
        com.yandex.div.json.expressions.b<Double> bVar3 = (com.yandex.div.json.expressions.b) H21.b.d(this.f374944c, eVar, "active_item_size", jSONObject, f374854I0);
        if (bVar3 == null) {
            bVar3 = f374862O;
        }
        com.yandex.div.json.expressions.b<Double> bVar4 = bVar3;
        U4 u42 = (U4) H21.b.f(this.f374945d, eVar, "active_shape", jSONObject, f374855J0);
        com.yandex.div.json.expressions.b bVar5 = (com.yandex.div.json.expressions.b) H21.b.d(this.f374946e, eVar, "alignment_horizontal", jSONObject, f374856K0);
        com.yandex.div.json.expressions.b bVar6 = (com.yandex.div.json.expressions.b) H21.b.d(this.f374947f, eVar, "alignment_vertical", jSONObject, f374857L0);
        com.yandex.div.json.expressions.b<Double> bVar7 = (com.yandex.div.json.expressions.b) H21.b.d(this.f374948g, eVar, "alpha", jSONObject, f374859M0);
        if (bVar7 == null) {
            bVar7 = f374864P;
        }
        com.yandex.div.json.expressions.b<Double> bVar8 = bVar7;
        com.yandex.div.json.expressions.b<DivIndicator.Animation> bVar9 = (com.yandex.div.json.expressions.b) H21.b.d(this.f374949h, eVar, "animation", jSONObject, f374861N0);
        if (bVar9 == null) {
            bVar9 = f374866Q;
        }
        com.yandex.div.json.expressions.b<DivIndicator.Animation> bVar10 = bVar9;
        List listG = H21.b.g(this.f374950i, eVar, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, jSONObject, f374906k0, f374863O0);
        com.yandex.div2.K k12 = (com.yandex.div2.K) H21.b.f(this.f374951j, eVar, "border", jSONObject, f374865P0);
        if (k12 == null) {
            k12 = f374868R;
        }
        com.yandex.div2.K k13 = k12;
        com.yandex.div.json.expressions.b bVar11 = (com.yandex.div.json.expressions.b) H21.b.d(this.f374952k, eVar, "column_span", jSONObject, f374867Q0);
        List listG2 = H21.b.g(this.f374953l, eVar, "disappear_actions", jSONObject, f374914o0, f374869R0);
        List listG3 = H21.b.g(this.f374954m, eVar, AttachMenuItem.File.EXTENSIONS, jSONObject, f374918q0, f374871S0);
        C38567u1 c38567u1 = (C38567u1) H21.b.f(this.f374955n, eVar, "focus", jSONObject, f374873T0);
        K5 k52 = (K5) H21.b.f(this.f374956o, eVar, "height", jSONObject, f374875U0);
        if (k52 == null) {
            k52 = f374870S;
        }
        K5 k53 = k52;
        String str = (String) H21.b.d(this.f374957p, eVar, "id", jSONObject, f374877V0);
        com.yandex.div.json.expressions.b<Integer> bVar12 = (com.yandex.div.json.expressions.b) H21.b.d(this.f374958q, eVar, "inactive_item_color", jSONObject, f374879W0);
        if (bVar12 == null) {
            bVar12 = f374872T;
        }
        com.yandex.div.json.expressions.b<Integer> bVar13 = bVar12;
        U4 u43 = (U4) H21.b.f(this.f374959r, eVar, "inactive_minimum_shape", jSONObject, f374881X0);
        U4 u44 = (U4) H21.b.f(this.f374960s, eVar, "inactive_shape", jSONObject, f374883Y0);
        AbstractC38265b3 abstractC38265b3 = (AbstractC38265b3) H21.b.f(this.f374961t, eVar, "items_placement", jSONObject, f374885Z0);
        Y0 y02 = (Y0) H21.b.f(this.f374962u, eVar, "margins", jSONObject, f374887a1);
        if (y02 == null) {
            y02 = f374874U;
        }
        Y0 y03 = y02;
        com.yandex.div.json.expressions.b<Double> bVar14 = (com.yandex.div.json.expressions.b) H21.b.d(this.f374963v, eVar, "minimum_item_size", jSONObject, f374889b1);
        if (bVar14 == null) {
            bVar14 = f374876V;
        }
        com.yandex.div.json.expressions.b<Double> bVar15 = bVar14;
        Y0 y04 = (Y0) H21.b.f(this.f374964w, eVar, "paddings", jSONObject, f374891c1);
        if (y04 == null) {
            y04 = f374878W;
        }
        Y0 y05 = y04;
        String str2 = (String) H21.b.d(this.f374965x, eVar, "pager_id", jSONObject, f374893d1);
        com.yandex.div.json.expressions.b bVar16 = (com.yandex.div.json.expressions.b) H21.b.d(this.f374966y, eVar, "row_span", jSONObject, f374895e1);
        List listG4 = H21.b.g(this.f374967z, eVar, "selected_actions", jSONObject, f374928y0, f374897f1);
        G5 g52 = (G5) H21.b.f(this.f374930A, eVar, "shape", jSONObject, f374899g1);
        if (g52 == null) {
            g52 = f374880X;
        }
        G5 g53 = g52;
        C38502q1 c38502q1 = (C38502q1) H21.b.f(this.f374931B, eVar, "space_between_centers", jSONObject, f374901h1);
        if (c38502q1 == null) {
            c38502q1 = f374882Y;
        }
        C38502q1 c38502q12 = c38502q1;
        List listG5 = H21.b.g(this.f374932C, eVar, "tooltips", jSONObject, f374846A0, f374903i1);
        C38260a8 c38260a8 = (C38260a8) H21.b.f(this.f374933D, eVar, "transform", jSONObject, f374905j1);
        if (c38260a8 == null) {
            c38260a8 = f374884Z;
        }
        C38260a8 c38260a82 = c38260a8;
        T t12 = (T) H21.b.f(this.f374934E, eVar, "transition_change", jSONObject, f374907k1);
        com.yandex.div2.B b12 = (com.yandex.div2.B) H21.b.f(this.f374935F, eVar, "transition_in", jSONObject, f374909l1);
        com.yandex.div2.B b13 = (com.yandex.div2.B) H21.b.f(this.f374936G, eVar, "transition_out", jSONObject, f374911m1);
        List listE = H21.b.e(this.f374937H, eVar, jSONObject, f374848C0, f374913n1);
        com.yandex.div.json.expressions.b<DivVisibility> bVar17 = (com.yandex.div.json.expressions.b) H21.b.d(this.f374938I, eVar, "visibility", jSONObject, f374915o1);
        if (bVar17 == null) {
            bVar17 = f374886a0;
        }
        com.yandex.div.json.expressions.b<DivVisibility> bVar18 = bVar17;
        w8 w8Var = (w8) H21.b.f(this.f374939J, eVar, "visibility_action", jSONObject, f374917p1);
        List listG6 = H21.b.g(this.f374940K, eVar, "visibility_actions", jSONObject, f374850E0, f374919q1);
        K5 k54 = (K5) H21.b.f(this.f374941L, eVar, "width", jSONObject, f374921r1);
        if (k54 == null) {
            k54 = f374888b0;
        }
        return new DivIndicator(divAccessibility2, bVar2, bVar4, u42, bVar5, bVar6, bVar8, bVar10, listG, k13, bVar11, listG2, listG3, c38567u1, k53, str, bVar13, u43, u44, abstractC38265b3, y03, bVar15, y05, str2, bVar16, listG4, g53, c38502q12, listG5, c38260a82, t12, b12, b13, listE, bVar18, w8Var, listG6, k54);
    }

    public C38305f3(@Y61.k com.yandex.div.json.e eVar, @Y61.l C38305f3 c38305f3, boolean z12, @Y61.k JSONObject jSONObject) {
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        H21.a<C38447m> aVar = c38305f3 == null ? null : c38305f3.f374942a;
        C38447m.f375826g.getClass();
        this.f374942a = com.yandex.div.internal.parser.s.g(jSONObject, "accessibility", z12, aVar, C38447m.f375842w, f370579a, eVar);
        H21.a<com.yandex.div.json.expressions.b<Integer>> aVar2 = c38305f3 == null ? null : c38305f3.f374943b;
        Y41.l<Object, Integer> lVar = com.yandex.div.internal.parser.y.f370147a;
        E.b bVar = com.yandex.div.internal.parser.E.f370136f;
        C38106b c38106b = C38107c.f370139a;
        this.f374943b = com.yandex.div.internal.parser.s.i(jSONObject, "active_item_color", z12, aVar2, lVar, c38106b, f370579a, bVar);
        H21.a<com.yandex.div.json.expressions.b<Double>> aVar3 = c38305f3 == null ? null : c38305f3.f374944c;
        Y41.l<Number, Double> lVar2 = com.yandex.div.internal.parser.y.f370150d;
        E.c cVar = com.yandex.div.internal.parser.E.f370134d;
        this.f374944c = com.yandex.div.internal.parser.s.i(jSONObject, "active_item_size", z12, aVar3, lVar2, f374898g0, f370579a, cVar);
        H21.a<V4> aVar4 = c38305f3 == null ? null : c38305f3.f374945d;
        V4.f373725f.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, V4> pVar = V4.f373734o;
        this.f374945d = com.yandex.div.internal.parser.s.g(jSONObject, "active_shape", z12, aVar4, pVar, f370579a, eVar);
        H21.a<com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> aVar5 = c38305f3 == null ? null : c38305f3.f374946e;
        DivAlignmentHorizontal.f371238c.getClass();
        this.f374946e = com.yandex.div.internal.parser.s.i(jSONObject, "alignment_horizontal", z12, aVar5, DivAlignmentHorizontal.f371239d, c38106b, f370579a, f374890c0);
        H21.a<com.yandex.div.json.expressions.b<DivAlignmentVertical>> aVar6 = c38305f3 == null ? null : c38305f3.f374947f;
        DivAlignmentVertical.f371246c.getClass();
        this.f374947f = com.yandex.div.internal.parser.s.i(jSONObject, "alignment_vertical", z12, aVar6, DivAlignmentVertical.f371247d, c38106b, f370579a, f374892d0);
        this.f374948g = com.yandex.div.internal.parser.s.i(jSONObject, "alpha", z12, c38305f3 == null ? null : c38305f3.f374948g, lVar2, f374902i0, f370579a, cVar);
        H21.a<com.yandex.div.json.expressions.b<DivIndicator.Animation>> aVar7 = c38305f3 == null ? null : c38305f3.f374949h;
        DivIndicator.Animation.f371639c.getClass();
        this.f374949h = com.yandex.div.internal.parser.s.i(jSONObject, "animation", z12, aVar7, DivIndicator.Animation.f371640d, c38106b, f370579a, f374894e0);
        H21.a<List<com.yandex.div2.G>> aVar8 = c38305f3 == null ? null : c38305f3.f374950i;
        com.yandex.div2.G.f372308a.getClass();
        this.f374950i = com.yandex.div.internal.parser.s.j(jSONObject, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, z12, aVar8, com.yandex.div2.G.f372309b, f374908l0, f370579a, eVar);
        H21.a<com.yandex.div2.L> aVar9 = c38305f3 == null ? null : c38305f3.f374951j;
        com.yandex.div2.L.f372728f.getClass();
        this.f374951j = com.yandex.div.internal.parser.s.g(jSONObject, "border", z12, aVar9, com.yandex.div2.L.f372737o, f370579a, eVar);
        H21.a<com.yandex.div.json.expressions.b<Long>> aVar10 = c38305f3 == null ? null : c38305f3.f374952k;
        Y41.l<Number, Long> lVar3 = com.yandex.div.internal.parser.y.f370151e;
        E.d dVar = com.yandex.div.internal.parser.E.f370132b;
        this.f374952k = com.yandex.div.internal.parser.s.i(jSONObject, "column_span", z12, aVar10, lVar3, f374910m0, f370579a, dVar);
        H21.a<List<T0>> aVar11 = c38305f3 == null ? null : c38305f3.f374953l;
        T0.f373518i.getClass();
        this.f374953l = com.yandex.div.internal.parser.s.j(jSONObject, "disappear_actions", z12, aVar11, T0.f373517C, f374916p0, f370579a, eVar);
        H21.a<List<C38283d1>> aVar12 = c38305f3 == null ? null : c38305f3.f374954m;
        C38283d1.f374708c.getClass();
        this.f374954m = com.yandex.div.internal.parser.s.j(jSONObject, AttachMenuItem.File.EXTENSIONS, z12, aVar12, C38283d1.f374713h, f374920r0, f370579a, eVar);
        H21.a<C38585w1> aVar13 = c38305f3 == null ? null : c38305f3.f374955n;
        C38585w1.f376878f.getClass();
        this.f374955n = com.yandex.div.internal.parser.s.g(jSONObject, "focus", z12, aVar13, C38585w1.f376891s, f370579a, eVar);
        H21.a<L5> aVar14 = c38305f3 == null ? null : c38305f3.f374956o;
        L5.f372755a.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, L5> pVar2 = L5.f372756b;
        this.f374956o = com.yandex.div.internal.parser.s.g(jSONObject, "height", z12, aVar14, pVar2, f370579a, eVar);
        this.f374957p = com.yandex.div.internal.parser.s.f(jSONObject, "id", z12, c38305f3 == null ? null : c38305f3.f374957p, C38107c.f370141c, f374922s0, f370579a);
        this.f374958q = com.yandex.div.internal.parser.s.i(jSONObject, "inactive_item_color", z12, c38305f3 == null ? null : c38305f3.f374958q, lVar, c38106b, f370579a, bVar);
        this.f374959r = com.yandex.div.internal.parser.s.g(jSONObject, "inactive_minimum_shape", z12, c38305f3 == null ? null : c38305f3.f374959r, pVar, f370579a, eVar);
        this.f374960s = com.yandex.div.internal.parser.s.g(jSONObject, "inactive_shape", z12, c38305f3 == null ? null : c38305f3.f374960s, pVar, f370579a, eVar);
        H21.a<AbstractC38275c3> aVar15 = c38305f3 == null ? null : c38305f3.f374961t;
        AbstractC38275c3.f374693a.getClass();
        this.f374961t = com.yandex.div.internal.parser.s.g(jSONObject, "items_placement", z12, aVar15, AbstractC38275c3.f374694b, f370579a, eVar);
        H21.a<C38233a1> aVar16 = c38305f3 == null ? null : c38305f3.f374962u;
        C38233a1.f374131f.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, C38233a1> pVar3 = C38233a1.f374151z;
        this.f374962u = com.yandex.div.internal.parser.s.g(jSONObject, "margins", z12, aVar16, pVar3, f370579a, eVar);
        this.f374963v = com.yandex.div.internal.parser.s.i(jSONObject, "minimum_item_size", z12, c38305f3 == null ? null : c38305f3.f374963v, lVar2, f374924u0, f370579a, cVar);
        this.f374964w = com.yandex.div.internal.parser.s.g(jSONObject, "paddings", z12, c38305f3 == null ? null : c38305f3.f374964w, pVar3, f370579a, eVar);
        this.f374965x = com.yandex.div.internal.parser.s.h(jSONObject, "pager_id", z12, c38305f3 == null ? null : c38305f3.f374965x, f370579a);
        this.f374966y = com.yandex.div.internal.parser.s.i(jSONObject, "row_span", z12, c38305f3 == null ? null : c38305f3.f374966y, lVar3, f374926w0, f370579a, dVar);
        H21.a<List<r>> aVar17 = c38305f3 == null ? null : c38305f3.f374967z;
        r.f376158i.getClass();
        this.f374967z = com.yandex.div.internal.parser.s.j(jSONObject, "selected_actions", z12, aVar17, r.f376172w, f374929z0, f370579a, eVar);
        H21.a<J5> aVar18 = c38305f3 == null ? null : c38305f3.f374930A;
        J5.f372625a.getClass();
        this.f374930A = com.yandex.div.internal.parser.s.g(jSONObject, "shape", z12, aVar18, J5.f372626b, f370579a, eVar);
        H21.a<C38549s1> aVar19 = c38305f3 == null ? null : c38305f3.f374931B;
        C38549s1.f376582c.getClass();
        this.f374931B = com.yandex.div.internal.parser.s.g(jSONObject, "space_between_centers", z12, aVar19, C38549s1.f376589j, f370579a, eVar);
        H21.a<List<Y7>> aVar20 = c38305f3 == null ? null : c38305f3.f374932C;
        Y7.f374048h.getClass();
        this.f374932C = com.yandex.div.internal.parser.s.j(jSONObject, "tooltips", z12, aVar20, Y7.f374062v, f374847B0, f370579a, eVar);
        H21.a<C38270b8> aVar21 = c38305f3 == null ? null : c38305f3.f374933D;
        C38270b8.f374668d.getClass();
        this.f374933D = com.yandex.div.internal.parser.s.g(jSONObject, "transform", z12, aVar21, C38270b8.f374674j, f370579a, eVar);
        H21.a<U> aVar22 = c38305f3 == null ? null : c38305f3.f374934E;
        U.f373671a.getClass();
        this.f374934E = com.yandex.div.internal.parser.s.g(jSONObject, "transition_change", z12, aVar22, U.f373672b, f370579a, eVar);
        H21.a<com.yandex.div2.C> aVar23 = c38305f3 == null ? null : c38305f3.f374935F;
        com.yandex.div2.C.f371018a.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, com.yandex.div2.C> pVar4 = com.yandex.div2.C.f371019b;
        this.f374935F = com.yandex.div.internal.parser.s.g(jSONObject, "transition_in", z12, aVar23, pVar4, f370579a, eVar);
        this.f374936G = com.yandex.div.internal.parser.s.g(jSONObject, "transition_out", z12, c38305f3 == null ? null : c38305f3.f374936G, pVar4, f370579a, eVar);
        H21.a<List<DivTransitionTrigger>> aVar24 = c38305f3 == null ? null : c38305f3.f374937H;
        DivTransitionTrigger.f372167c.getClass();
        this.f374937H = com.yandex.div.internal.parser.s.k(jSONObject, z12, aVar24, DivTransitionTrigger.f372168d, f374849D0, f370579a);
        H21.a<com.yandex.div.json.expressions.b<DivVisibility>> aVar25 = c38305f3 == null ? null : c38305f3.f374938I;
        DivVisibility.f372192c.getClass();
        this.f374938I = com.yandex.div.internal.parser.s.i(jSONObject, "visibility", z12, aVar25, DivVisibility.f372193d, C38107c.f370139a, f370579a, f374896f0);
        H21.a<x8> aVar26 = c38305f3 == null ? null : c38305f3.f374939J;
        x8.f376980i.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, x8> pVar5 = x8.f376979C;
        this.f374939J = com.yandex.div.internal.parser.s.g(jSONObject, "visibility_action", z12, aVar26, pVar5, f370579a, eVar);
        this.f374940K = com.yandex.div.internal.parser.s.j(jSONObject, "visibility_actions", z12, c38305f3 == null ? null : c38305f3.f374940K, pVar5, f374851F0, f370579a, eVar);
        this.f374941L = com.yandex.div.internal.parser.s.g(jSONObject, "width", z12, c38305f3 == null ? null : c38305f3.f374941L, pVar2, f370579a, eVar);
    }
}
