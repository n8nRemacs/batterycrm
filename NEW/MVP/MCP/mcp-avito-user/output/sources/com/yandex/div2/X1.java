package com.yandex.div2;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.yandex.div.internal.parser.C38105a;
import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.K5;
import com.yandex.div2.y8;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivGifImageTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/X1;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/O1;", "V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class X1 implements com.yandex.div.json.b, com.yandex.div.json.c<O1> {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final F1 f373822A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final F1 f373823B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final F1 f373824C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final F1 f373825D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373826E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373827F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373828G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373829H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373830I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373831J0;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373832K0;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373833L0;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, DivAccessibility> f373834M0;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public static final DivAccessibility f373835N;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, DivAction> f373836N0;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public static final DivAnimation f373837O;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, DivAnimation> f373838O0;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f373839P;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> f373840P0;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div2.K f373841Q;

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> f373842Q0;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f373843R;

    /* renamed from: R0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentVertical>> f373844R0;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivAlignmentVertical> f373845S;

    /* renamed from: S0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> f373846S0;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public static final K5.e f373847T;

    /* renamed from: T0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.D> f373848T0;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public static final Y0 f373849U;

    /* renamed from: U0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<com.yandex.div2.F>> f373850U0;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public static final Y0 f373851V;

    /* renamed from: V0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.K> f373852V0;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Integer> f373853W;

    /* renamed from: W0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f373854W0;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Boolean> f373855X;

    /* renamed from: X0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> f373856X0;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivImageScale> f373857Y;

    /* renamed from: Y0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentVertical>> f373858Y0;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public static final C38260a8 f373859Z;

    /* renamed from: Z0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<S0>> f373860Z0;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivVisibility> f373861a0;

    /* renamed from: a1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> f373862a1;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public static final K5.d f373863b0;

    /* renamed from: b1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<C38273c1>> f373864b1;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f373865c0;

    /* renamed from: c1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, C38567u1> f373866c1;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f373867d0;

    /* renamed from: d1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> f373868d1;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f373869e0;

    /* renamed from: e1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, K5> f373870e1;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f373871f0;

    /* renamed from: f1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, String> f373872f1;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f373873g0;

    /* renamed from: g1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> f373874g1;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f373875h0;

    /* renamed from: h1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, Y0> f373876h1;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373877i0;

    /* renamed from: i1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, Y0> f373878i1;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373879j0;

    /* renamed from: j1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Integer>> f373880j1;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public static final F1 f373881k0;

    /* renamed from: k1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Boolean>> f373882k1;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final F1 f373883l0;

    /* renamed from: l1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> f373884l1;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373885m0;

    /* renamed from: m1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f373886m1;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373887n0;

    /* renamed from: n1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivImageScale>> f373888n1;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final F1 f373889o0;

    /* renamed from: o1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> f373890o1;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public static final F1 f373891p0;

    /* renamed from: p1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivTooltip>> f373892p1;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373893q0;

    /* renamed from: q1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, C38260a8> f373894q1;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final W1 f373895r0;

    /* renamed from: r1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.T> f373896r1;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373897s0;

    /* renamed from: s1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.B> f373898s1;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final W1 f373899t0;

    /* renamed from: t1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.B> f373900t1;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final W1 f373901u0;

    /* renamed from: u1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivTransitionTrigger>> f373902u1;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final W1 f373903v0;

    /* renamed from: v1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivVisibility>> f373904v1;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final F1 f373905w0;

    /* renamed from: w1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, w8> f373906w1;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final F1 f373907x0;

    /* renamed from: x1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<w8>> f373908x1;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final W1 f373909y0;

    /* renamed from: y1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, K5> f373910y1;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public static final W1 f373911z0;

    /* renamed from: A, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f373912A;

    /* renamed from: B, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivImageScale>> f373913B;

    /* renamed from: C, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<r>> f373914C;

    /* renamed from: D, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<Y7>> f373915D;

    /* renamed from: E, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38270b8> f373916E;

    /* renamed from: F, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div2.U> f373917F;

    /* renamed from: G, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div2.C> f373918G;

    /* renamed from: H, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div2.C> f373919H;

    /* renamed from: I, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<DivTransitionTrigger>> f373920I;

    /* renamed from: J, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivVisibility>> f373921J;

    /* renamed from: K, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<x8> f373922K;

    /* renamed from: L, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<x8>> f373923L;

    /* renamed from: M, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<L5> f373924M;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38447m> f373925a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<r> f373926b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38583w> f373927c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<r>> f373928d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> f373929e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivAlignmentVertical>> f373930f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Double>> f373931g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div2.E> f373932h;

    /* renamed from: i, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<com.yandex.div2.G>> f373933i;

    /* renamed from: j, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div2.L> f373934j;

    /* renamed from: k, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f373935k;

    /* renamed from: l, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> f373936l;

    /* renamed from: m, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivAlignmentVertical>> f373937m;

    /* renamed from: n, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<T0>> f373938n;

    /* renamed from: o, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<r>> f373939o;

    /* renamed from: p, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<C38283d1>> f373940p;

    /* renamed from: q, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38585w1> f373941q;

    /* renamed from: r, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Uri>> f373942r;

    /* renamed from: s, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<L5> f373943s;

    /* renamed from: t, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<String> f373944t;

    /* renamed from: u, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<r>> f373945u;

    /* renamed from: v, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38233a1> f373946v;

    /* renamed from: w, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38233a1> f373947w;

    /* renamed from: x, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Integer>> f373948x;

    /* renamed from: y, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Boolean>> f373949y;

    /* renamed from: z, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<String>> f373950z;

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class A extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final A f373951l = new A();

        public A() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<String> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, C38107c.f370141c, X1.f373823B0, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370133c);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class B extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final B f373952l = new B();

        public B() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370151e, X1.f373825D0, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370132b);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivImageScale;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivImageScale>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C f373953l = new C();

        public C() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivImageScale> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivImageScale.f371558c.getClass();
            Y41.l<String, DivImageScale> lVar = DivImageScale.f371559d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivImageScale> bVar = X1.f373857Y;
            com.yandex.div.json.expressions.b<DivImageScale> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, X1.f373873g0);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivAction;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class D extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> {

        /* renamed from: l, reason: collision with root package name */
        public static final D f373954l = new D();

        public D() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivAction> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            DivAction.f371211f.getClass();
            return C38107c.k(jSONObject, str2, DivAction.f371215j, X1.f373826E0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivTooltip;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class E extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivTooltip>> {

        /* renamed from: l, reason: collision with root package name */
        public static final E f373955l = new E();

        public E() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivTooltip> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            DivTooltip.f372130h.getClass();
            return C38107c.k(jSONObject, str2, DivTooltip.f372135m, X1.f373828G0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/a8;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/a8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class F extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, C38260a8> {

        /* renamed from: l, reason: collision with root package name */
        public static final F f373956l = new F();

        public F() {
            super(3);
        }

        @Override // Y41.q
        public final C38260a8 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            C38260a8.f374376d.getClass();
            C38260a8 c38260a8 = (C38260a8) C38107c.g(jSONObject, str, C38260a8.f374379g, eVar2.getF370579a(), eVar2);
            return c38260a8 == null ? X1.f373859Z : c38260a8;
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/T;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/T;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class G extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.T> {

        /* renamed from: l, reason: collision with root package name */
        public static final G f373957l = new G();

        public G() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div2.T invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            com.yandex.div2.T.f373510a.getClass();
            return (com.yandex.div2.T) C38107c.g(jSONObject2, str, com.yandex.div2.T.f373511b, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/B;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/B;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class H extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.B> {

        /* renamed from: l, reason: collision with root package name */
        public static final H f373958l = new H();

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

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/B;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/B;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class I extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.B> {

        /* renamed from: l, reason: collision with root package name */
        public static final I f373959l = new I();

        public I() {
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

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivTransitionTrigger;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class J extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivTransitionTrigger>> {

        /* renamed from: l, reason: collision with root package name */
        public static final J f373960l = new J();

        public J() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivTransitionTrigger> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            DivTransitionTrigger.f372167c.getClass();
            return C38107c.j(jSONObject2, str, DivTransitionTrigger.f372168d, X1.f373830I0, eVar.getF370579a());
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class K extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final K f373961l = new K();

        public K() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class L extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final L f373962l = new L();

        public L() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class M extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final M f373963l = new M();

        public M() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class N extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final N f373964l = new N();

        public N() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class O extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final O f373965l = new O();

        public O() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivImageScale);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class P extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final P f373966l = new P();

        public P() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class Q extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f373967l = 0;

        static {
            new Q();
        }

        public Q() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            eVar.getClass();
            return (String) C38107c.a(jSONObject2, str, C38107c.f370141c, C38107c.f370139a);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/w8;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class R extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<w8>> {

        /* renamed from: l, reason: collision with root package name */
        public static final R f373968l = new R();

        public R() {
            super(3);
        }

        @Override // Y41.q
        public final List<w8> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            w8.f376942h.getClass();
            return C38107c.k(jSONObject, str2, w8.f376950p, X1.f373832K0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/w8;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/w8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class S extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, w8> {

        /* renamed from: l, reason: collision with root package name */
        public static final S f373969l = new S();

        public S() {
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

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivVisibility;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class T extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivVisibility>> {

        /* renamed from: l, reason: collision with root package name */
        public static final T f373970l = new T();

        public T() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivVisibility> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivVisibility.f372192c.getClass();
            Y41.l<String, DivVisibility> lVar = DivVisibility.f372193d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivVisibility> bVar = X1.f373861a0;
            com.yandex.div.json.expressions.b<DivVisibility> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, X1.f373875h0);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/K5;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/K5;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class U extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, K5> {

        /* renamed from: l, reason: collision with root package name */
        public static final U f373971l = new U();

        public U() {
            super(3);
        }

        @Override // Y41.q
        public final K5 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            K5.f372712a.getClass();
            K5 k52 = (K5) C38107c.g(jSONObject, str, K5.f372713b, eVar2.getF370579a(), eVar2);
            return k52 == null ? X1.f373863b0 : k52;
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0016R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0013R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0013R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\nR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\nR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\nR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\nR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\nR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\nR\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0016R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0016R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\nR\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\nR\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0013R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0013R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u0002030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0016R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u0002030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0016R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0016R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0016R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0013R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\nR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\nR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\nR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\nR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010\nR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020O0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010\nR\u0014\u0010R\u001a\u0002038\u0006X\u0086T¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\"0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020$0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010VR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\"0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010VR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020$0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010VR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020D0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010VR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010VR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010\nR\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020_0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010\nR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020[0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010\u0013R\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006e"}, d2 = {"Lcom/yandex/div2/X1$V;", "", "<init>", "()V", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/r;", "ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivAnimation;", "ACTION_ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/expressions/b;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/G;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/F;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/K;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/K;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAlignmentHorizontal;", "CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivAlignmentVertical;", "CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE", "Lcom/yandex/div2/T0;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/S0;", "DISAPPEAR_ACTIONS_VALIDATOR", "DOUBLETAP_ACTIONS_TEMPLATE_VALIDATOR", "DOUBLETAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/d1;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/c1;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/K5$e;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/K5$e;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "LONGTAP_ACTIONS_TEMPLATE_VALIDATOR", "LONGTAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/Y0;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/Y0;", "PADDINGS_DEFAULT_VALUE", "", "PLACEHOLDER_COLOR_DEFAULT_VALUE", "", "PRELOAD_REQUIRED_DEFAULT_VALUE", "PREVIEW_TEMPLATE_VALIDATOR", "PREVIEW_VALIDATOR", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivImageScale;", "SCALE_DEFAULT_VALUE", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/Y7;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/a8;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/a8;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL", "TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL", "TYPE_HELPER_SCALE", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/x8;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/w8;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class V {
        public /* synthetic */ V(C42822w c42822w) {
            this();
        }

        public V() {
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/DivAccessibility;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/DivAccessibility;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$a, reason: case insensitive filesystem */
    public static final class C38209a extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, DivAccessibility> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38209a f373972l = new C38209a();

        public C38209a() {
            super(3);
        }

        @Override // Y41.q
        public final DivAccessibility invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            DivAccessibility.f371175f.getClass();
            DivAccessibility divAccessibility = (DivAccessibility) C38107c.g(jSONObject, str, DivAccessibility.f371182m, eVar2.getF370579a(), eVar2);
            return divAccessibility == null ? X1.f373835N : divAccessibility;
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivAction;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$b, reason: case insensitive filesystem */
    public static final class C38210b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38210b f373973l = new C38210b();

        public C38210b() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivAction> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            DivAction.f371211f.getClass();
            return C38107c.k(jSONObject, str2, DivAction.f371215j, X1.f373877i0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/DivAnimation;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/DivAnimation;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$c, reason: case insensitive filesystem */
    public static final class C38211c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, DivAnimation> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38211c f373974l = new C38211c();

        public C38211c() {
            super(3);
        }

        @Override // Y41.q
        public final DivAnimation invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            DivAnimation.f371255h.getClass();
            DivAnimation divAnimation = (DivAnimation) C38107c.g(jSONObject, str, DivAnimation.f371264q, eVar2.getF370579a(), eVar2);
            return divAnimation == null ? X1.f373837O : divAnimation;
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/DivAction;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/DivAction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$d, reason: case insensitive filesystem */
    public static final class C38212d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, DivAction> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38212d f373975l = new C38212d();

        public C38212d() {
            super(3);
        }

        @Override // Y41.q
        public final DivAction invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            DivAction.f371211f.getClass();
            return (DivAction) C38107c.g(jSONObject2, str, DivAction.f371215j, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$e, reason: case insensitive filesystem */
    public static final class C38213e extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38213e f373976l = new C38213e();

        public C38213e() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivAlignmentHorizontal.f371238c.getClass();
            return C38107c.i(jSONObject, str2, DivAlignmentHorizontal.f371239d, C38107c.f370139a, eVar.getF370579a(), null, X1.f373865c0);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAlignmentVertical;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$f, reason: case insensitive filesystem */
    public static final class C38214f extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentVertical>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38214f f373977l = new C38214f();

        public C38214f() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivAlignmentVertical> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivAlignmentVertical.f371246c.getClass();
            return C38107c.i(jSONObject, str2, DivAlignmentVertical.f371247d, C38107c.f370139a, eVar.getF370579a(), null, X1.f373867d0);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$g, reason: case insensitive filesystem */
    public static final class C38215g extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38215g f373978l = new C38215g();

        public C38215g() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Double> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Double> lVar = com.yandex.div.internal.parser.y.f370150d;
            F1 f12 = X1.f373883l0;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Double> bVar = X1.f373839P;
            com.yandex.div.json.expressions.b<Double> bVarI = C38107c.i(jSONObject, str2, lVar, f12, f370579a, bVar, com.yandex.div.internal.parser.E.f370134d);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/D;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/D;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$h, reason: case insensitive filesystem */
    public static final class C38216h extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.D> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38216h f373979l = new C38216h();

        public C38216h() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div2.D invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            com.yandex.div.json.e eVar2 = eVar;
            com.yandex.div2.D.f371163b.getClass();
            return (com.yandex.div2.D) C38107c.g(jSONObject2, str, com.yandex.div2.D.f371165d, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/F;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$i, reason: case insensitive filesystem */
    public static final class C38217i extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<com.yandex.div2.F>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38217i f373980l = new C38217i();

        public C38217i() {
            super(3);
        }

        @Override // Y41.q
        public final List<com.yandex.div2.F> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            com.yandex.div2.F.f372262a.getClass();
            return C38107c.k(jSONObject, str2, com.yandex.div2.F.f372263b, X1.f373885m0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/K;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/K;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$j, reason: case insensitive filesystem */
    public static final class C38218j extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.K> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38218j f373981l = new C38218j();

        public C38218j() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div2.K invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            com.yandex.div2.K.f372635f.getClass();
            com.yandex.div2.K k12 = (com.yandex.div2.K) C38107c.g(jSONObject, str, com.yandex.div2.K.f372638i, eVar2.getF370579a(), eVar2);
            return k12 == null ? X1.f373841Q : k12;
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$k, reason: case insensitive filesystem */
    public static final class C38219k extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38219k f373982l = new C38219k();

        public C38219k() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370151e, X1.f373891p0, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370132b);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$l, reason: case insensitive filesystem */
    public static final class C38220l extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38220l f373983l = new C38220l();

        public C38220l() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivAlignmentHorizontal.f371238c.getClass();
            Y41.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.f371239d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar = X1.f373843R;
            com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, X1.f373869e0);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAlignmentVertical;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$m, reason: case insensitive filesystem */
    public static final class C38221m extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentVertical>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38221m f373984l = new C38221m();

        public C38221m() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivAlignmentVertical> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivAlignmentVertical.f371246c.getClass();
            Y41.l<String, DivAlignmentVertical> lVar = DivAlignmentVertical.f371247d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar = X1.f373845S;
            com.yandex.div.json.expressions.b<DivAlignmentVertical> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, X1.f373871f0);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/X1;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/X1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$n, reason: case insensitive filesystem */
    public static final class C38222n extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, X1> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f373985l = 0;

        static {
            new C38222n();
        }

        public C38222n() {
            super(2);
        }

        @Override // Y41.p
        public final X1 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new X1(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/S0;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$o, reason: case insensitive filesystem */
    public static final class C38223o extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<S0>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38223o f373986l = new C38223o();

        public C38223o() {
            super(3);
        }

        @Override // Y41.q
        public final List<S0> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            S0.f373492a.getClass();
            return C38107c.k(jSONObject, str2, S0.f373500i, X1.f373893q0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivAction;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$p, reason: case insensitive filesystem */
    public static final class C38224p extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38224p f373987l = new C38224p();

        public C38224p() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivAction> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            DivAction.f371211f.getClass();
            return C38107c.k(jSONObject, str2, DivAction.f371215j, X1.f373897s0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/c1;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$q, reason: case insensitive filesystem */
    public static final class C38225q extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<C38273c1>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38225q f373988l = new C38225q();

        public C38225q() {
            super(3);
        }

        @Override // Y41.q
        public final List<C38273c1> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            C38273c1.f374687c.getClass();
            return C38107c.k(jSONObject, str2, C38273c1.f374689e, X1.f373901u0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/u1;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/u1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$r, reason: case insensitive filesystem */
    public static final class C38226r extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, C38567u1> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38226r f373989l = new C38226r();

        public C38226r() {
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

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$s, reason: case insensitive filesystem */
    public static final class C38227s extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Uri>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38227s f373990l = new C38227s();

        public C38227s() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Uri> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.c(jSONObject, str, com.yandex.div.internal.parser.y.f370148b, C38107c.f370139a, eVar.getF370579a(), com.yandex.div.internal.parser.E.f370135e);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/K5;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/K5;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$t, reason: case insensitive filesystem */
    public static final class C38228t extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, K5> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38228t f373991l = new C38228t();

        public C38228t() {
            super(3);
        }

        @Override // Y41.q
        public final K5 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            K5.f372712a.getClass();
            K5 k52 = (K5) C38107c.g(jSONObject, str, K5.f372713b, eVar2.getF370579a(), eVar2);
            return k52 == null ? X1.f373847T : k52;
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$u, reason: case insensitive filesystem */
    public static final class C38229u extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38229u f373992l = new C38229u();

        public C38229u() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return (String) C38107c.h(jSONObject, str, C38107c.f370141c, X1.f373907x0, eVar.getF370579a());
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivAction;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.X1$v, reason: case insensitive filesystem */
    public static final class C38230v extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38230v f373993l = new C38230v();

        public C38230v() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivAction> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            DivAction.f371211f.getClass();
            return C38107c.k(jSONObject, str2, DivAction.f371215j, X1.f373909y0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/Y0;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/Y0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, Y0> {

        /* renamed from: l, reason: collision with root package name */
        public static final w f373994l = new w();

        public w() {
            super(3);
        }

        @Override // Y41.q
        public final Y0 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            Y0.f374024f.getClass();
            Y0 y02 = (Y0) C38107c.g(jSONObject, str, Y0.f374035q, eVar2.getF370579a(), eVar2);
            return y02 == null ? X1.f373849U : y02;
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/Y0;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/Y0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, Y0> {

        /* renamed from: l, reason: collision with root package name */
        public static final x f373995l = new x();

        public x() {
            super(3);
        }

        @Override // Y41.q
        public final Y0 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            Y0.f374024f.getClass();
            Y0 y02 = (Y0) C38107c.g(jSONObject, str, Y0.f374035q, eVar2.getF370579a(), eVar2);
            return y02 == null ? X1.f373851V : y02;
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Integer>> {

        /* renamed from: l, reason: collision with root package name */
        public static final y f373996l = new y();

        public y() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Integer> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Object, Integer> lVar = com.yandex.div.internal.parser.y.f370147a;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Integer> bVar = X1.f373853W;
            com.yandex.div.json.expressions.b<Integer> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, com.yandex.div.internal.parser.E.f370136f);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivGifImageTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Boolean>> {

        /* renamed from: l, reason: collision with root package name */
        public static final z f373997l = new z();

        public z() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Boolean> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Object, Boolean> lVar = com.yandex.div.internal.parser.y.f370149c;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Boolean> bVar = X1.f373855X;
            com.yandex.div.json.expressions.b<Boolean> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, com.yandex.div.internal.parser.E.f370131a);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new V(null);
        f373835N = new DivAccessibility(null, null, null, null, null, null, 63, null);
        com.yandex.div.json.expressions.b bVarI = com.google.firebase.components.g.i(100L, com.yandex.div.json.expressions.b.f370552a);
        com.yandex.div.json.expressions.b bVarA = b.a.a(Double.valueOf(0.6d));
        com.yandex.div.json.expressions.b bVarA2 = b.a.a(DivAnimation.Name.FADE);
        Double dValueOf = Double.valueOf(1.0d);
        f373837O = new DivAnimation(bVarI, bVarA, null, null, bVarA2, null, null, b.a.a(dValueOf), 108, null);
        f373839P = b.a.a(dValueOf);
        com.yandex.div.json.expressions.b bVar = null;
        y8.c cVar = null;
        f373841Q = new com.yandex.div2.K(null, null, null, null, null, 31, null);
        f373843R = b.a.a(DivAlignmentHorizontal.CENTER);
        f373845S = b.a.a(DivAlignmentVertical.CENTER);
        f373847T = new K5.e(new y8(bVar, cVar, null, 7, null));
        com.yandex.div.json.expressions.b bVar2 = null;
        com.yandex.div.json.expressions.b bVar3 = null;
        f373849U = new Y0(null, bVar2, bVar3, null, null, 31, null);
        Object[] objArr = null == true ? 1 : 0;
        Object[] objArr2 = null == true ? 1 : 0;
        f373851V = new Y0(null == true ? 1 : 0, null == true ? 1 : 0, objArr2, null, objArr, 31, null);
        f373853W = b.a.a(335544320);
        f373855X = b.a.a(Boolean.FALSE);
        f373857Y = b.a.a(DivImageScale.FILL);
        Object[] objArr3 = null == true ? 1 : 0;
        Object[] objArr4 = null == true ? 1 : 0;
        f373859Z = new C38260a8(null == true ? 1 : 0, null == true ? 1 : 0, objArr4, 7, objArr3);
        f373861a0 = b.a.a(DivVisibility.VISIBLE);
        f373863b0 = new K5.d(new U3(null, 1, null));
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAlignmentHorizontal.values());
        K k12 = K.f373961l;
        aVar.getClass();
        f373865c0 = new com.yandex.div.internal.parser.C(k12, objC);
        f373867d0 = new com.yandex.div.internal.parser.C(L.f373962l, C42756l.C(DivAlignmentVertical.values()));
        f373869e0 = new com.yandex.div.internal.parser.C(M.f373963l, C42756l.C(DivAlignmentHorizontal.values()));
        f373871f0 = new com.yandex.div.internal.parser.C(N.f373964l, C42756l.C(DivAlignmentVertical.values()));
        f373873g0 = new com.yandex.div.internal.parser.C(O.f373965l, C42756l.C(DivImageScale.values()));
        f373875h0 = new com.yandex.div.internal.parser.C(P.f373966l, C42756l.C(DivVisibility.values()));
        f373877i0 = new E1(16);
        f373879j0 = new E1(17);
        f373881k0 = new F1(13);
        f373883l0 = new F1(14);
        f373885m0 = new E1(27);
        f373887n0 = new E1(28);
        f373889o0 = new F1(15);
        f373891p0 = new F1(16);
        f373893q0 = new E1(29);
        f373895r0 = new W1(0);
        f373897s0 = new E1(24);
        f373899t0 = new W1(1);
        f373901u0 = new W1(2);
        f373903v0 = new W1(3);
        f373905w0 = new F1(17);
        f373907x0 = new F1(18);
        f373909y0 = new W1(4);
        f373911z0 = new W1(5);
        f373822A0 = new F1(19);
        f373823B0 = new F1(10);
        f373824C0 = new F1(11);
        f373825D0 = new F1(12);
        f373826E0 = new E1(18);
        f373827F0 = new E1(19);
        f373828G0 = new E1(20);
        f373829H0 = new E1(21);
        f373830I0 = new E1(22);
        f373831J0 = new E1(23);
        f373832K0 = new E1(25);
        f373833L0 = new E1(26);
        f373834M0 = C38209a.f373972l;
        f373836N0 = C38212d.f373975l;
        f373838O0 = C38211c.f373974l;
        f373840P0 = C38210b.f373973l;
        f373842Q0 = C38213e.f373976l;
        f373844R0 = C38214f.f373977l;
        f373846S0 = C38215g.f373978l;
        f373848T0 = C38216h.f373979l;
        f373850U0 = C38217i.f373980l;
        f373852V0 = C38218j.f373981l;
        f373854W0 = C38219k.f373982l;
        f373856X0 = C38220l.f373983l;
        f373858Y0 = C38221m.f373984l;
        f373860Z0 = C38223o.f373986l;
        f373862a1 = C38224p.f373987l;
        f373864b1 = C38225q.f373988l;
        f373866c1 = C38226r.f373989l;
        f373868d1 = C38227s.f373990l;
        f373870e1 = C38228t.f373991l;
        f373872f1 = C38229u.f373992l;
        f373874g1 = C38230v.f373993l;
        f373876h1 = w.f373994l;
        f373878i1 = x.f373995l;
        f373880j1 = y.f373996l;
        f373882k1 = z.f373997l;
        f373884l1 = A.f373951l;
        f373886m1 = B.f373952l;
        f373888n1 = C.f373953l;
        f373890o1 = D.f373954l;
        f373892p1 = E.f373955l;
        f373894q1 = F.f373956l;
        f373896r1 = G.f373957l;
        f373898s1 = H.f373958l;
        f373900t1 = I.f373959l;
        f373902u1 = J.f373960l;
        int i12 = Q.f373967l;
        f373904v1 = T.f373970l;
        f373906w1 = S.f373969l;
        f373908x1 = R.f373968l;
        f373910y1 = U.f373971l;
        int i13 = C38222n.f373985l;
    }

    public /* synthetic */ X1(com.yandex.div.json.e eVar, X1 x12, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        this(eVar, (i12 & 2) != 0 ? null : x12, (i12 & 4) != 0 ? false : z12, jSONObject);
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final O1 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        DivAccessibility divAccessibility = (DivAccessibility) H21.b.f(this.f373925a, eVar, "accessibility", jSONObject, f373834M0);
        if (divAccessibility == null) {
            divAccessibility = f373835N;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        DivAction divAction = (DivAction) H21.b.f(this.f373926b, eVar, "action", jSONObject, f373836N0);
        DivAnimation divAnimation = (DivAnimation) H21.b.f(this.f373927c, eVar, "action_animation", jSONObject, f373838O0);
        if (divAnimation == null) {
            divAnimation = f373837O;
        }
        DivAnimation divAnimation2 = divAnimation;
        List listG = H21.b.g(this.f373928d, eVar, "actions", jSONObject, f373877i0, f373840P0);
        com.yandex.div.json.expressions.b bVar = (com.yandex.div.json.expressions.b) H21.b.d(this.f373929e, eVar, "alignment_horizontal", jSONObject, f373842Q0);
        com.yandex.div.json.expressions.b bVar2 = (com.yandex.div.json.expressions.b) H21.b.d(this.f373930f, eVar, "alignment_vertical", jSONObject, f373844R0);
        com.yandex.div.json.expressions.b<Double> bVar3 = (com.yandex.div.json.expressions.b) H21.b.d(this.f373931g, eVar, "alpha", jSONObject, f373846S0);
        if (bVar3 == null) {
            bVar3 = f373839P;
        }
        com.yandex.div.json.expressions.b<Double> bVar4 = bVar3;
        com.yandex.div2.D d12 = (com.yandex.div2.D) H21.b.f(this.f373932h, eVar, "aspect", jSONObject, f373848T0);
        List listG2 = H21.b.g(this.f373933i, eVar, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, jSONObject, f373885m0, f373850U0);
        com.yandex.div2.K k12 = (com.yandex.div2.K) H21.b.f(this.f373934j, eVar, "border", jSONObject, f373852V0);
        if (k12 == null) {
            k12 = f373841Q;
        }
        com.yandex.div2.K k13 = k12;
        com.yandex.div.json.expressions.b bVar5 = (com.yandex.div.json.expressions.b) H21.b.d(this.f373935k, eVar, "column_span", jSONObject, f373854W0);
        com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar6 = (com.yandex.div.json.expressions.b) H21.b.d(this.f373936l, eVar, "content_alignment_horizontal", jSONObject, f373856X0);
        if (bVar6 == null) {
            bVar6 = f373843R;
        }
        com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar7 = bVar6;
        com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar8 = (com.yandex.div.json.expressions.b) H21.b.d(this.f373937m, eVar, "content_alignment_vertical", jSONObject, f373858Y0);
        if (bVar8 == null) {
            bVar8 = f373845S;
        }
        com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar9 = bVar8;
        List listG3 = H21.b.g(this.f373938n, eVar, "disappear_actions", jSONObject, f373893q0, f373860Z0);
        List listG4 = H21.b.g(this.f373939o, eVar, "doubletap_actions", jSONObject, f373897s0, f373862a1);
        List listG5 = H21.b.g(this.f373940p, eVar, AttachMenuItem.File.EXTENSIONS, jSONObject, f373901u0, f373864b1);
        C38567u1 c38567u1 = (C38567u1) H21.b.f(this.f373941q, eVar, "focus", jSONObject, f373866c1);
        com.yandex.div.json.expressions.b bVar10 = (com.yandex.div.json.expressions.b) H21.b.b(this.f373942r, eVar, "gif_url", jSONObject, f373868d1);
        K5 k52 = (K5) H21.b.f(this.f373943s, eVar, "height", jSONObject, f373870e1);
        if (k52 == null) {
            k52 = f373847T;
        }
        K5 k53 = k52;
        String str = (String) H21.b.d(this.f373944t, eVar, "id", jSONObject, f373872f1);
        List listG6 = H21.b.g(this.f373945u, eVar, "longtap_actions", jSONObject, f373909y0, f373874g1);
        Y0 y02 = (Y0) H21.b.f(this.f373946v, eVar, "margins", jSONObject, f373876h1);
        if (y02 == null) {
            y02 = f373849U;
        }
        Y0 y03 = y02;
        Y0 y04 = (Y0) H21.b.f(this.f373947w, eVar, "paddings", jSONObject, f373878i1);
        if (y04 == null) {
            y04 = f373851V;
        }
        Y0 y05 = y04;
        com.yandex.div.json.expressions.b<Integer> bVar11 = (com.yandex.div.json.expressions.b) H21.b.d(this.f373948x, eVar, "placeholder_color", jSONObject, f373880j1);
        if (bVar11 == null) {
            bVar11 = f373853W;
        }
        com.yandex.div.json.expressions.b<Integer> bVar12 = bVar11;
        com.yandex.div.json.expressions.b<Boolean> bVar13 = (com.yandex.div.json.expressions.b) H21.b.d(this.f373949y, eVar, "preload_required", jSONObject, f373882k1);
        if (bVar13 == null) {
            bVar13 = f373855X;
        }
        com.yandex.div.json.expressions.b<Boolean> bVar14 = bVar13;
        com.yandex.div.json.expressions.b bVar15 = (com.yandex.div.json.expressions.b) H21.b.d(this.f373950z, eVar, MessageSuggest.PREVIEW, jSONObject, f373884l1);
        com.yandex.div.json.expressions.b bVar16 = (com.yandex.div.json.expressions.b) H21.b.d(this.f373912A, eVar, "row_span", jSONObject, f373886m1);
        com.yandex.div.json.expressions.b<DivImageScale> bVar17 = (com.yandex.div.json.expressions.b) H21.b.d(this.f373913B, eVar, "scale", jSONObject, f373888n1);
        if (bVar17 == null) {
            bVar17 = f373857Y;
        }
        com.yandex.div.json.expressions.b<DivImageScale> bVar18 = bVar17;
        List listG7 = H21.b.g(this.f373914C, eVar, "selected_actions", jSONObject, f373826E0, f373890o1);
        List listG8 = H21.b.g(this.f373915D, eVar, "tooltips", jSONObject, f373828G0, f373892p1);
        C38260a8 c38260a8 = (C38260a8) H21.b.f(this.f373916E, eVar, "transform", jSONObject, f373894q1);
        if (c38260a8 == null) {
            c38260a8 = f373859Z;
        }
        C38260a8 c38260a82 = c38260a8;
        com.yandex.div2.T t12 = (com.yandex.div2.T) H21.b.f(this.f373917F, eVar, "transition_change", jSONObject, f373896r1);
        com.yandex.div2.B b12 = (com.yandex.div2.B) H21.b.f(this.f373918G, eVar, "transition_in", jSONObject, f373898s1);
        com.yandex.div2.B b13 = (com.yandex.div2.B) H21.b.f(this.f373919H, eVar, "transition_out", jSONObject, f373900t1);
        List listE = H21.b.e(this.f373920I, eVar, jSONObject, f373830I0, f373902u1);
        com.yandex.div.json.expressions.b<DivVisibility> bVar19 = (com.yandex.div.json.expressions.b) H21.b.d(this.f373921J, eVar, "visibility", jSONObject, f373904v1);
        if (bVar19 == null) {
            bVar19 = f373861a0;
        }
        com.yandex.div.json.expressions.b<DivVisibility> bVar20 = bVar19;
        w8 w8Var = (w8) H21.b.f(this.f373922K, eVar, "visibility_action", jSONObject, f373906w1);
        List listG9 = H21.b.g(this.f373923L, eVar, "visibility_actions", jSONObject, f373832K0, f373908x1);
        K5 k54 = (K5) H21.b.f(this.f373924M, eVar, "width", jSONObject, f373910y1);
        if (k54 == null) {
            k54 = f373863b0;
        }
        return new O1(divAccessibility2, divAction, divAnimation2, listG, bVar, bVar2, bVar4, d12, listG2, k13, bVar5, bVar7, bVar9, listG3, listG4, listG5, c38567u1, bVar10, k53, str, listG6, y03, y05, bVar12, bVar14, bVar15, bVar16, bVar18, listG7, listG8, c38260a82, t12, b12, b13, listE, bVar20, w8Var, listG9, k54);
    }

    public X1(@Y61.k com.yandex.div.json.e eVar, @Y61.l X1 x12, boolean z12, @Y61.k JSONObject jSONObject) {
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        H21.a<C38447m> aVar = x12 == null ? null : x12.f373925a;
        C38447m.f375826g.getClass();
        this.f373925a = com.yandex.div.internal.parser.s.g(jSONObject, "accessibility", z12, aVar, C38447m.f375842w, f370579a, eVar);
        H21.a<r> aVar2 = x12 == null ? null : x12.f373926b;
        r.f376158i.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, r> pVar = r.f376172w;
        this.f373926b = com.yandex.div.internal.parser.s.g(jSONObject, "action", z12, aVar2, pVar, f370579a, eVar);
        H21.a<C38583w> aVar3 = x12 == null ? null : x12.f373927c;
        C38583w.f376783i.getClass();
        this.f373927c = com.yandex.div.internal.parser.s.g(jSONObject, "action_animation", z12, aVar3, C38583w.f376782D, f370579a, eVar);
        this.f373928d = com.yandex.div.internal.parser.s.j(jSONObject, "actions", z12, x12 == null ? null : x12.f373928d, pVar, f373879j0, f370579a, eVar);
        H21.a<com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> aVar4 = x12 == null ? null : x12.f373929e;
        DivAlignmentHorizontal.f371238c.getClass();
        Y41.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.f371239d;
        C38106b c38106b = C38107c.f370139a;
        this.f373929e = com.yandex.div.internal.parser.s.i(jSONObject, "alignment_horizontal", z12, aVar4, lVar, c38106b, f370579a, f373865c0);
        H21.a<com.yandex.div.json.expressions.b<DivAlignmentVertical>> aVar5 = x12 == null ? null : x12.f373930f;
        DivAlignmentVertical.f371246c.getClass();
        Y41.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.f371247d;
        this.f373930f = com.yandex.div.internal.parser.s.i(jSONObject, "alignment_vertical", z12, aVar5, lVar2, c38106b, f370579a, f373867d0);
        this.f373931g = com.yandex.div.internal.parser.s.i(jSONObject, "alpha", z12, x12 == null ? null : x12.f373931g, com.yandex.div.internal.parser.y.f370150d, f373881k0, f370579a, com.yandex.div.internal.parser.E.f370134d);
        H21.a<com.yandex.div2.E> aVar6 = x12 == null ? null : x12.f373932h;
        com.yandex.div2.E.f372200b.getClass();
        this.f373932h = com.yandex.div.internal.parser.s.g(jSONObject, "aspect", z12, aVar6, com.yandex.div2.E.f372204f, f370579a, eVar);
        H21.a<List<com.yandex.div2.G>> aVar7 = x12 == null ? null : x12.f373933i;
        com.yandex.div2.G.f372308a.getClass();
        this.f373933i = com.yandex.div.internal.parser.s.j(jSONObject, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, z12, aVar7, com.yandex.div2.G.f372309b, f373887n0, f370579a, eVar);
        H21.a<com.yandex.div2.L> aVar8 = x12 == null ? null : x12.f373934j;
        com.yandex.div2.L.f372728f.getClass();
        this.f373934j = com.yandex.div.internal.parser.s.g(jSONObject, "border", z12, aVar8, com.yandex.div2.L.f372737o, f370579a, eVar);
        H21.a<com.yandex.div.json.expressions.b<Long>> aVar9 = x12 == null ? null : x12.f373935k;
        Y41.l<Number, Long> lVar3 = com.yandex.div.internal.parser.y.f370151e;
        E.d dVar = com.yandex.div.internal.parser.E.f370132b;
        this.f373935k = com.yandex.div.internal.parser.s.i(jSONObject, "column_span", z12, aVar9, lVar3, f373889o0, f370579a, dVar);
        this.f373936l = com.yandex.div.internal.parser.s.i(jSONObject, "content_alignment_horizontal", z12, x12 == null ? null : x12.f373936l, lVar, c38106b, f370579a, f373869e0);
        this.f373937m = com.yandex.div.internal.parser.s.i(jSONObject, "content_alignment_vertical", z12, x12 == null ? null : x12.f373937m, lVar2, c38106b, f370579a, f373871f0);
        H21.a<List<T0>> aVar10 = x12 == null ? null : x12.f373938n;
        T0.f373518i.getClass();
        this.f373938n = com.yandex.div.internal.parser.s.j(jSONObject, "disappear_actions", z12, aVar10, T0.f373517C, f373895r0, f370579a, eVar);
        this.f373939o = com.yandex.div.internal.parser.s.j(jSONObject, "doubletap_actions", z12, x12 == null ? null : x12.f373939o, pVar, f373899t0, f370579a, eVar);
        H21.a<List<C38283d1>> aVar11 = x12 == null ? null : x12.f373940p;
        C38283d1.f374708c.getClass();
        this.f373940p = com.yandex.div.internal.parser.s.j(jSONObject, AttachMenuItem.File.EXTENSIONS, z12, aVar11, C38283d1.f374713h, f373903v0, f370579a, eVar);
        H21.a<C38585w1> aVar12 = x12 == null ? null : x12.f373941q;
        C38585w1.f376878f.getClass();
        this.f373941q = com.yandex.div.internal.parser.s.g(jSONObject, "focus", z12, aVar12, C38585w1.f376891s, f370579a, eVar);
        this.f373942r = com.yandex.div.internal.parser.s.d(jSONObject, "gif_url", z12, x12 == null ? null : x12.f373942r, com.yandex.div.internal.parser.y.f370148b, c38106b, f370579a, com.yandex.div.internal.parser.E.f370135e);
        H21.a<L5> aVar13 = x12 == null ? null : x12.f373943s;
        L5.f372755a.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, L5> pVar2 = L5.f372756b;
        this.f373943s = com.yandex.div.internal.parser.s.g(jSONObject, "height", z12, aVar13, pVar2, f370579a, eVar);
        H21.a<String> aVar14 = x12 == null ? null : x12.f373944t;
        C38105a c38105a = C38107c.f370141c;
        this.f373944t = com.yandex.div.internal.parser.s.f(jSONObject, "id", z12, aVar14, c38105a, f373905w0, f370579a);
        this.f373945u = com.yandex.div.internal.parser.s.j(jSONObject, "longtap_actions", z12, x12 == null ? null : x12.f373945u, pVar, f373911z0, f370579a, eVar);
        H21.a<C38233a1> aVar15 = x12 == null ? null : x12.f373946v;
        C38233a1.f374131f.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, C38233a1> pVar3 = C38233a1.f374151z;
        this.f373946v = com.yandex.div.internal.parser.s.g(jSONObject, "margins", z12, aVar15, pVar3, f370579a, eVar);
        this.f373947w = com.yandex.div.internal.parser.s.g(jSONObject, "paddings", z12, x12 == null ? null : x12.f373947w, pVar3, f370579a, eVar);
        this.f373948x = com.yandex.div.internal.parser.s.i(jSONObject, "placeholder_color", z12, x12 == null ? null : x12.f373948x, com.yandex.div.internal.parser.y.f370147a, c38106b, f370579a, com.yandex.div.internal.parser.E.f370136f);
        this.f373949y = com.yandex.div.internal.parser.s.i(jSONObject, "preload_required", z12, x12 == null ? null : x12.f373949y, com.yandex.div.internal.parser.y.f370149c, c38106b, f370579a, com.yandex.div.internal.parser.E.f370131a);
        this.f373950z = com.yandex.div.internal.parser.s.i(jSONObject, MessageSuggest.PREVIEW, z12, x12 == null ? null : x12.f373950z, c38105a, f373822A0, f370579a, com.yandex.div.internal.parser.E.f370133c);
        this.f373912A = com.yandex.div.internal.parser.s.i(jSONObject, "row_span", z12, x12 == null ? null : x12.f373912A, lVar3, f373824C0, f370579a, dVar);
        H21.a<com.yandex.div.json.expressions.b<DivImageScale>> aVar16 = x12 == null ? null : x12.f373913B;
        DivImageScale.f371558c.getClass();
        this.f373913B = com.yandex.div.internal.parser.s.i(jSONObject, "scale", z12, aVar16, DivImageScale.f371559d, c38106b, f370579a, f373873g0);
        H21.a<List<r>> aVar17 = x12 == null ? null : x12.f373914C;
        r.f376158i.getClass();
        this.f373914C = com.yandex.div.internal.parser.s.j(jSONObject, "selected_actions", z12, aVar17, r.f376172w, f373827F0, f370579a, eVar);
        H21.a<List<Y7>> aVar18 = x12 == null ? null : x12.f373915D;
        Y7.f374048h.getClass();
        this.f373915D = com.yandex.div.internal.parser.s.j(jSONObject, "tooltips", z12, aVar18, Y7.f374062v, f373829H0, f370579a, eVar);
        H21.a<C38270b8> aVar19 = x12 == null ? null : x12.f373916E;
        C38270b8.f374668d.getClass();
        this.f373916E = com.yandex.div.internal.parser.s.g(jSONObject, "transform", z12, aVar19, C38270b8.f374674j, f370579a, eVar);
        H21.a<com.yandex.div2.U> aVar20 = x12 == null ? null : x12.f373917F;
        com.yandex.div2.U.f373671a.getClass();
        this.f373917F = com.yandex.div.internal.parser.s.g(jSONObject, "transition_change", z12, aVar20, com.yandex.div2.U.f373672b, f370579a, eVar);
        H21.a<com.yandex.div2.C> aVar21 = x12 == null ? null : x12.f373918G;
        com.yandex.div2.C.f371018a.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, com.yandex.div2.C> pVar4 = com.yandex.div2.C.f371019b;
        this.f373918G = com.yandex.div.internal.parser.s.g(jSONObject, "transition_in", z12, aVar21, pVar4, f370579a, eVar);
        this.f373919H = com.yandex.div.internal.parser.s.g(jSONObject, "transition_out", z12, x12 == null ? null : x12.f373919H, pVar4, f370579a, eVar);
        H21.a<List<DivTransitionTrigger>> aVar22 = x12 == null ? null : x12.f373920I;
        DivTransitionTrigger.f372167c.getClass();
        this.f373920I = com.yandex.div.internal.parser.s.k(jSONObject, z12, aVar22, DivTransitionTrigger.f372168d, f373831J0, f370579a);
        H21.a<com.yandex.div.json.expressions.b<DivVisibility>> aVar23 = x12 == null ? null : x12.f373921J;
        DivVisibility.f372192c.getClass();
        this.f373921J = com.yandex.div.internal.parser.s.i(jSONObject, "visibility", z12, aVar23, DivVisibility.f372193d, C38107c.f370139a, f370579a, f373875h0);
        H21.a<x8> aVar24 = x12 == null ? null : x12.f373922K;
        x8.f376980i.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, x8> pVar5 = x8.f376979C;
        this.f373922K = com.yandex.div.internal.parser.s.g(jSONObject, "visibility_action", z12, aVar24, pVar5, f370579a, eVar);
        this.f373923L = com.yandex.div.internal.parser.s.j(jSONObject, "visibility_actions", z12, x12 == null ? null : x12.f373923L, pVar5, f373833L0, f370579a, eVar);
        this.f373924M = com.yandex.div.internal.parser.s.g(jSONObject, "width", z12, x12 == null ? null : x12.f373924M, pVar2, f370579a, eVar);
    }
}
