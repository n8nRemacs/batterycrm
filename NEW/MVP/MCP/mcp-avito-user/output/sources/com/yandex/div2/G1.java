package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import com.yandex.div2.DivGallery;
import com.yandex.div2.K5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivGalleryTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/G1;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/DivGallery;", "R", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class G1 implements com.yandex.div.json.b, com.yandex.div.json.c<DivGallery> {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f372316A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f372317B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f372318C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f372319D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f372320E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f372321F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f372322G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f372323H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f372324I0;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public static final DivAccessibility f372325J;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public static final E1 f372326J0;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f372327K;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, DivAccessibility> f372328K0;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div2.K f372329L;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> f372330L0;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivGallery.CrossContentAlignment> f372331M;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentVertical>> f372332M0;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f372333N;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> f372334N0;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public static final K5.e f372335O;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<com.yandex.div2.F>> f372336O0;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f372337P;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.K> f372338P0;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public static final Y0 f372339Q;

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f372340Q0;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivGallery.Orientation> f372341R;

    /* renamed from: R0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f372342R0;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public static final Y0 f372343S;

    /* renamed from: S0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivGallery.CrossContentAlignment>> f372344S0;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Boolean> f372345T;

    /* renamed from: T0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f372346T0;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivGallery.ScrollMode> f372347U;

    /* renamed from: U0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f372348U0;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public static final C38260a8 f372349V;

    /* renamed from: V0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<S0>> f372350V0;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivVisibility> f372351W;

    /* renamed from: W0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<C38273c1>> f372352W0;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public static final K5.d f372353X;

    /* renamed from: X0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, C38567u1> f372354X0;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f372355Y;

    /* renamed from: Y0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, K5> f372356Y0;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f372357Z;

    /* renamed from: Z0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, String> f372358Z0;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f372359a0;

    /* renamed from: a1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f372360a1;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f372361b0;

    /* renamed from: b1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<AbstractC38330g>> f372362b1;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f372363c0;

    /* renamed from: c1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, Y0> f372364c1;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f372365d0;

    /* renamed from: d1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivGallery.Orientation>> f372366d1;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f372367e0;

    /* renamed from: e1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, Y0> f372368e1;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f372369f0;

    /* renamed from: f1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Boolean>> f372370f1;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f372371g0;

    /* renamed from: g1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f372372g1;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public static final E1 f372373h0;

    /* renamed from: h1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivGallery.ScrollMode>> f372374h1;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f372375i0;

    /* renamed from: i1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> f372376i1;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f372377j0;

    /* renamed from: j1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivTooltip>> f372378j1;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f372379k0;

    /* renamed from: k1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, C38260a8> f372380k1;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f372381l0;

    /* renamed from: l1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, T> f372382l1;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final F1 f372383m0;

    /* renamed from: m1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.B> f372384m1;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final F1 f372385n0;

    /* renamed from: n1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.B> f372386n1;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f372387o0;

    /* renamed from: o1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivTransitionTrigger>> f372388o1;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f372389p0;

    /* renamed from: p1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivVisibility>> f372390p1;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public static final E1 f372391q0;

    /* renamed from: q1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, w8> f372392q1;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final E1 f372393r0;

    /* renamed from: r1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<w8>> f372394r1;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final E1 f372395s0;

    /* renamed from: s1, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, K5> f372396s1;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final E1 f372397t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final F1 f372398u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final F1 f372399v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final F1 f372400w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f372401x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f372402y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f372403z0;

    /* renamed from: A, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38270b8> f372404A;

    /* renamed from: B, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<U> f372405B;

    /* renamed from: C, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div2.C> f372406C;

    /* renamed from: D, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div2.C> f372407D;

    /* renamed from: E, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<DivTransitionTrigger>> f372408E;

    /* renamed from: F, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivVisibility>> f372409F;

    /* renamed from: G, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<x8> f372410G;

    /* renamed from: H, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<x8>> f372411H;

    /* renamed from: I, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<L5> f372412I;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38447m> f372413a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> f372414b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivAlignmentVertical>> f372415c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Double>> f372416d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<com.yandex.div2.G>> f372417e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div2.L> f372418f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f372419g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f372420h;

    /* renamed from: i, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivGallery.CrossContentAlignment>> f372421i;

    /* renamed from: j, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f372422j;

    /* renamed from: k, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f372423k;

    /* renamed from: l, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<T0>> f372424l;

    /* renamed from: m, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<C38283d1>> f372425m;

    /* renamed from: n, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38585w1> f372426n;

    /* renamed from: o, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<L5> f372427o;

    /* renamed from: p, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<String> f372428p;

    /* renamed from: q, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f372429q;

    /* renamed from: r, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<AbstractC38259a7>> f372430r;

    /* renamed from: s, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38233a1> f372431s;

    /* renamed from: t, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivGallery.Orientation>> f372432t;

    /* renamed from: u, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38233a1> f372433u;

    /* renamed from: v, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Boolean>> f372434v;

    /* renamed from: w, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f372435w;

    /* renamed from: x, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivGallery.ScrollMode>> f372436x;

    /* renamed from: y, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<r>> f372437y;

    /* renamed from: z, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<Y7>> f372438z;

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivTooltip;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class A extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivTooltip>> {

        /* renamed from: l, reason: collision with root package name */
        public static final A f372439l = new A();

        public A() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivTooltip> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            DivTooltip.f372130h.getClass();
            return C38107c.k(jSONObject, str2, DivTooltip.f372135m, G1.f372320E0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/a8;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/a8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class B extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, C38260a8> {

        /* renamed from: l, reason: collision with root package name */
        public static final B f372440l = new B();

        public B() {
            super(3);
        }

        @Override // Y41.q
        public final C38260a8 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            C38260a8.f374376d.getClass();
            C38260a8 c38260a8 = (C38260a8) C38107c.g(jSONObject, str, C38260a8.f374379g, eVar2.getF370579a(), eVar2);
            return c38260a8 == null ? G1.f372349V : c38260a8;
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/T;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/T;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, T> {

        /* renamed from: l, reason: collision with root package name */
        public static final C f372441l = new C();

        public C() {
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

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/B;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/B;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class D extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.B> {

        /* renamed from: l, reason: collision with root package name */
        public static final D f372442l = new D();

        public D() {
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

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/B;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/B;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class E extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.B> {

        /* renamed from: l, reason: collision with root package name */
        public static final E f372443l = new E();

        public E() {
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

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivTransitionTrigger;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class F extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivTransitionTrigger>> {

        /* renamed from: l, reason: collision with root package name */
        public static final F f372444l = new F();

        public F() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivTransitionTrigger> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            DivTransitionTrigger.f372167c.getClass();
            return C38107c.j(jSONObject2, str, DivTransitionTrigger.f372168d, G1.f372322G0, eVar.getF370579a());
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class G extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final G f372445l = new G();

        public G() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class H extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final H f372446l = new H();

        public H() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class I extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final I f372447l = new I();

        public I() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivGallery.CrossContentAlignment);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class J extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final J f372448l = new J();

        public J() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivGallery.Orientation);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class K extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final K f372449l = new K();

        public K() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivGallery.ScrollMode);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class L extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final L f372450l = new L();

        public L() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class M extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f372451l = 0;

        static {
            new M();
        }

        public M() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            eVar.getClass();
            return (String) C38107c.a(jSONObject2, str, C38107c.f370141c, C38107c.f370139a);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/w8;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class N extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<w8>> {

        /* renamed from: l, reason: collision with root package name */
        public static final N f372452l = new N();

        public N() {
            super(3);
        }

        @Override // Y41.q
        public final List<w8> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            w8.f376942h.getClass();
            return C38107c.k(jSONObject, str2, w8.f376950p, G1.f372324I0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/w8;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/w8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class O extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, w8> {

        /* renamed from: l, reason: collision with root package name */
        public static final O f372453l = new O();

        public O() {
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

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivVisibility;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class P extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivVisibility>> {

        /* renamed from: l, reason: collision with root package name */
        public static final P f372454l = new P();

        public P() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivVisibility> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivVisibility.f372192c.getClass();
            Y41.l<String, DivVisibility> lVar = DivVisibility.f372193d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivVisibility> bVar = G1.f372351W;
            com.yandex.div.json.expressions.b<DivVisibility> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, G1.f372365d0);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/K5;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/K5;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class Q extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, K5> {

        /* renamed from: l, reason: collision with root package name */
        public static final Q f372455l = new Q();

        public Q() {
            super(3);
        }

        @Override // Y41.q
        public final K5 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            K5.f372712a.getClass();
            K5 k52 = (K5) C38107c.g(jSONObject, str, K5.f372713b, eVar2.getF370579a(), eVar2);
            return k52 == null ? G1.f372353X : k52;
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\rR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\rR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\rR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\rR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\nR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\rR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\rR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0012R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0012R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0012R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0012R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\rR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\rR\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0012R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0012R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00180\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\nR\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\rR\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\rR\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\nR\u0014\u0010>\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010;R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\nR\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\rR\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\rR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010\nR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0012R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0012R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0012R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0012R\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u0012R\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020P0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010\u0012R\u0014\u0010S\u001a\u00020/8\u0006X\u0086T¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020V0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010XR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001d0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010XR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020<0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010XR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020C0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010XR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020^0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010XR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020`0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010\u0012R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010\u0012R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020^0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010\nR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010g¨\u0006h"}, d2 = {"Lcom/yandex/div2/G1$R;", "", "<init>", "()V", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/b;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/G;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/F;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/K;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/K;", "", "COLUMN_COUNT_TEMPLATE_VALIDATOR", "COLUMN_COUNT_VALIDATOR", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivGallery$CrossContentAlignment;", "CROSS_CONTENT_ALIGNMENT_DEFAULT_VALUE", "CROSS_SPACING_TEMPLATE_VALIDATOR", "CROSS_SPACING_VALIDATOR", "DEFAULT_ITEM_DEFAULT_VALUE", "DEFAULT_ITEM_TEMPLATE_VALIDATOR", "DEFAULT_ITEM_VALIDATOR", "Lcom/yandex/div2/T0;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/S0;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/d1;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/c1;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/K5$e;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/K5$e;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/a7;", "ITEMS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/g;", "ITEMS_VALIDATOR", "ITEM_SPACING_DEFAULT_VALUE", "ITEM_SPACING_TEMPLATE_VALIDATOR", "ITEM_SPACING_VALIDATOR", "Lcom/yandex/div2/Y0;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/Y0;", "Lcom/yandex/div2/DivGallery$Orientation;", "ORIENTATION_DEFAULT_VALUE", "PADDINGS_DEFAULT_VALUE", "", "RESTRICT_PARENT_SCROLL_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivGallery$ScrollMode;", "SCROLL_MODE_DEFAULT_VALUE", "Lcom/yandex/div2/r;", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/Y7;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/a8;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/a8;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_CROSS_CONTENT_ALIGNMENT", "TYPE_HELPER_ORIENTATION", "TYPE_HELPER_SCROLL_MODE", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/x8;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/w8;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class R {
        public /* synthetic */ R(C42822w c42822w) {
            this();
        }

        public R() {
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/DivAccessibility;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/DivAccessibility;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$a, reason: case insensitive filesystem */
    public static final class C38147a extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, DivAccessibility> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38147a f372456l = new C38147a();

        public C38147a() {
            super(3);
        }

        @Override // Y41.q
        public final DivAccessibility invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            DivAccessibility.f371175f.getClass();
            DivAccessibility divAccessibility = (DivAccessibility) C38107c.g(jSONObject, str, DivAccessibility.f371182m, eVar2.getF370579a(), eVar2);
            return divAccessibility == null ? G1.f372325J : divAccessibility;
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$b, reason: case insensitive filesystem */
    public static final class C38148b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38148b f372457l = new C38148b();

        public C38148b() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivAlignmentHorizontal.f371238c.getClass();
            return C38107c.i(jSONObject, str2, DivAlignmentHorizontal.f371239d, C38107c.f370139a, eVar.getF370579a(), null, G1.f372355Y);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAlignmentVertical;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$c, reason: case insensitive filesystem */
    public static final class C38149c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentVertical>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38149c f372458l = new C38149c();

        public C38149c() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivAlignmentVertical> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivAlignmentVertical.f371246c.getClass();
            return C38107c.i(jSONObject, str2, DivAlignmentVertical.f371247d, C38107c.f370139a, eVar.getF370579a(), null, G1.f372357Z);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$d, reason: case insensitive filesystem */
    public static final class C38150d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38150d f372459l = new C38150d();

        public C38150d() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Double> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Double> lVar = com.yandex.div.internal.parser.y.f370150d;
            C38576v1 c38576v1 = G1.f372369f0;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Double> bVar = G1.f372327K;
            com.yandex.div.json.expressions.b<Double> bVarI = C38107c.i(jSONObject, str2, lVar, c38576v1, f370579a, bVar, com.yandex.div.internal.parser.E.f370134d);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/F;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$e, reason: case insensitive filesystem */
    public static final class C38151e extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<com.yandex.div2.F>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38151e f372460l = new C38151e();

        public C38151e() {
            super(3);
        }

        @Override // Y41.q
        public final List<com.yandex.div2.F> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            com.yandex.div2.F.f372262a.getClass();
            return C38107c.k(jSONObject, str2, com.yandex.div2.F.f372263b, G1.f372371g0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/K;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/K;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$f, reason: case insensitive filesystem */
    public static final class C38152f extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.K> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38152f f372461l = new C38152f();

        public C38152f() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div2.K invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            com.yandex.div2.K.f372635f.getClass();
            com.yandex.div2.K k12 = (com.yandex.div2.K) C38107c.g(jSONObject, str, com.yandex.div2.K.f372638i, eVar2.getF370579a(), eVar2);
            return k12 == null ? G1.f372329L : k12;
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$g, reason: case insensitive filesystem */
    public static final class C38153g extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38153g f372462l = new C38153g();

        public C38153g() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370151e, G1.f372377j0, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370132b);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$h, reason: case insensitive filesystem */
    public static final class C38154h extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38154h f372463l = new C38154h();

        public C38154h() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370151e, G1.f372381l0, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370132b);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/G1;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/G1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$i, reason: case insensitive filesystem */
    public static final class C38155i extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, G1> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f372464l = 0;

        static {
            new C38155i();
        }

        public C38155i() {
            super(2);
        }

        @Override // Y41.p
        public final G1 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new G1(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivGallery$CrossContentAlignment;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$j, reason: case insensitive filesystem */
    public static final class C38156j extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivGallery.CrossContentAlignment>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38156j f372465l = new C38156j();

        public C38156j() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivGallery.CrossContentAlignment> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivGallery.CrossContentAlignment.f371529c.getClass();
            Y41.l<String, DivGallery.CrossContentAlignment> lVar = DivGallery.CrossContentAlignment.f371530d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivGallery.CrossContentAlignment> bVar = G1.f372331M;
            com.yandex.div.json.expressions.b<DivGallery.CrossContentAlignment> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, G1.f372359a0);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$k, reason: case insensitive filesystem */
    public static final class C38157k extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38157k f372466l = new C38157k();

        public C38157k() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370151e, G1.f372385n0, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370132b);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$l, reason: case insensitive filesystem */
    public static final class C38158l extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38158l f372467l = new C38158l();

        public C38158l() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            C38576v1 c38576v1 = G1.f372389p0;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Long> bVar = G1.f372333N;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject, str2, lVar, c38576v1, f370579a, bVar, com.yandex.div.internal.parser.E.f370132b);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/S0;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$m, reason: case insensitive filesystem */
    public static final class C38159m extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<S0>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38159m f372468l = new C38159m();

        public C38159m() {
            super(3);
        }

        @Override // Y41.q
        public final List<S0> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            S0.f373492a.getClass();
            return C38107c.k(jSONObject, str2, S0.f373500i, G1.f372391q0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/c1;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$n, reason: case insensitive filesystem */
    public static final class C38160n extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<C38273c1>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38160n f372469l = new C38160n();

        public C38160n() {
            super(3);
        }

        @Override // Y41.q
        public final List<C38273c1> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            C38273c1.f374687c.getClass();
            return C38107c.k(jSONObject, str2, C38273c1.f374689e, G1.f372395s0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/u1;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/u1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$o, reason: case insensitive filesystem */
    public static final class C38161o extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, C38567u1> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38161o f372470l = new C38161o();

        public C38161o() {
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

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/K5;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/K5;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$p, reason: case insensitive filesystem */
    public static final class C38162p extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, K5> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38162p f372471l = new C38162p();

        public C38162p() {
            super(3);
        }

        @Override // Y41.q
        public final K5 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            K5.f372712a.getClass();
            K5 k52 = (K5) C38107c.g(jSONObject, str, K5.f372713b, eVar2.getF370579a(), eVar2);
            return k52 == null ? G1.f372335O : k52;
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$q, reason: case insensitive filesystem */
    public static final class C38163q extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38163q f372472l = new C38163q();

        public C38163q() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return (String) C38107c.h(jSONObject, str, C38107c.f370141c, G1.f372399v0, eVar.getF370579a());
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a$\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/g;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.G1$r, reason: case insensitive filesystem */
    public static final class C38164r extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<AbstractC38330g>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38164r f372473l = new C38164r();

        public C38164r() {
            super(3);
        }

        @Override // Y41.q
        public final List<AbstractC38330g> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            AbstractC38330g.f375012a.getClass();
            return C38107c.f(jSONObject, str2, AbstractC38330g.f375013b, G1.f372402y0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final s f372474l = new s();

        public s() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Long> lVar = com.yandex.div.internal.parser.y.f370151e;
            C38576v1 c38576v1 = G1.f372401x0;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Long> bVar = G1.f372337P;
            com.yandex.div.json.expressions.b<Long> bVarI = C38107c.i(jSONObject, str2, lVar, c38576v1, f370579a, bVar, com.yandex.div.internal.parser.E.f370132b);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/Y0;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/Y0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, Y0> {

        /* renamed from: l, reason: collision with root package name */
        public static final t f372475l = new t();

        public t() {
            super(3);
        }

        @Override // Y41.q
        public final Y0 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            Y0.f374024f.getClass();
            Y0 y02 = (Y0) C38107c.g(jSONObject, str, Y0.f374035q, eVar2.getF370579a(), eVar2);
            return y02 == null ? G1.f372339Q : y02;
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivGallery$Orientation;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivGallery.Orientation>> {

        /* renamed from: l, reason: collision with root package name */
        public static final u f372476l = new u();

        public u() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivGallery.Orientation> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivGallery.Orientation.f371537c.getClass();
            Y41.l<String, DivGallery.Orientation> lVar = DivGallery.Orientation.f371538d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivGallery.Orientation> bVar = G1.f372341R;
            com.yandex.div.json.expressions.b<DivGallery.Orientation> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, G1.f372361b0);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/Y0;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/Y0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, Y0> {

        /* renamed from: l, reason: collision with root package name */
        public static final v f372477l = new v();

        public v() {
            super(3);
        }

        @Override // Y41.q
        public final Y0 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            Y0.f374024f.getClass();
            Y0 y02 = (Y0) C38107c.g(jSONObject, str, Y0.f374035q, eVar2.getF370579a(), eVar2);
            return y02 == null ? G1.f372343S : y02;
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Boolean>> {

        /* renamed from: l, reason: collision with root package name */
        public static final w f372478l = new w();

        public w() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Boolean> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Object, Boolean> lVar = com.yandex.div.internal.parser.y.f370149c;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Boolean> bVar = G1.f372345T;
            com.yandex.div.json.expressions.b<Boolean> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, com.yandex.div.internal.parser.E.f370131a);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final x f372479l = new x();

        public x() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370151e, G1.f372317B0, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370132b);
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivGallery$ScrollMode;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivGallery.ScrollMode>> {

        /* renamed from: l, reason: collision with root package name */
        public static final y f372480l = new y();

        public y() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivGallery.ScrollMode> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivGallery.ScrollMode.f371544c.getClass();
            Y41.l<String, DivGallery.ScrollMode> lVar = DivGallery.ScrollMode.f371545d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivGallery.ScrollMode> bVar = G1.f372347U;
            com.yandex.div.json.expressions.b<DivGallery.ScrollMode> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, G1.f372363c0);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivGalleryTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivAction;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> {

        /* renamed from: l, reason: collision with root package name */
        public static final z f372481l = new z();

        public z() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivAction> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            DivAction.f371211f.getClass();
            return C38107c.k(jSONObject, str2, DivAction.f371215j, G1.f372318C0, eVar2.getF370579a(), eVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new R(null);
        f372325J = new DivAccessibility(null, null, null, null, null, null, 63, null);
        f372327K = C38492p0.a(1.0d, com.yandex.div.json.expressions.b.f370552a);
        int i12 = 31;
        C42822w c42822w = null;
        f372329L = new com.yandex.div2.K(null, null, null, null, null, 31, null);
        f372331M = b.a.a(DivGallery.CrossContentAlignment.START);
        f372333N = b.a.a(0L);
        f372335O = new K5.e(new y8(null, null, null, 7, null));
        f372337P = b.a.a(8L);
        com.yandex.div.json.expressions.b bVar = null;
        f372339Q = new Y0(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, bVar, null == true ? 1 : 0, i12, c42822w);
        f372341R = b.a.a(DivGallery.Orientation.HORIZONTAL);
        f372343S = new Y0(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, bVar, null == true ? 1 : 0, i12, c42822w);
        f372345T = b.a.a(Boolean.FALSE);
        f372347U = b.a.a(DivGallery.ScrollMode.DEFAULT);
        Object[] objArr = null == true ? 1 : 0;
        f372349V = new C38260a8(null == true ? 1 : 0, null == true ? 1 : 0, objArr, 7, null == true ? 1 : 0);
        f372351W = b.a.a(DivVisibility.VISIBLE);
        f372353X = new K5.d(new U3(null, 1, null));
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAlignmentHorizontal.values());
        G g12 = G.f372445l;
        aVar.getClass();
        f372355Y = new com.yandex.div.internal.parser.C(g12, objC);
        f372357Z = new com.yandex.div.internal.parser.C(H.f372446l, C42756l.C(DivAlignmentVertical.values()));
        f372359a0 = new com.yandex.div.internal.parser.C(I.f372447l, C42756l.C(DivGallery.CrossContentAlignment.values()));
        f372361b0 = new com.yandex.div.internal.parser.C(J.f372448l, C42756l.C(DivGallery.Orientation.values()));
        f372363c0 = new com.yandex.div.internal.parser.C(K.f372449l, C42756l.C(DivGallery.ScrollMode.values()));
        f372365d0 = new com.yandex.div.internal.parser.C(L.f372450l, C42756l.C(DivVisibility.values()));
        f372367e0 = new C38576v1(19);
        f372369f0 = new C38576v1(21);
        f372371g0 = new C38458n1(28);
        f372373h0 = new E1(1);
        f372375i0 = new C38576v1(25);
        f372377j0 = new C38576v1(26);
        f372379k0 = new C38576v1(27);
        f372381l0 = new C38576v1(28);
        f372383m0 = new F1(0);
        f372385n0 = new F1(1);
        f372387o0 = new C38576v1(24);
        f372389p0 = new C38576v1(29);
        f372391q0 = new E1(2);
        f372393r0 = new E1(3);
        f372395s0 = new E1(4);
        f372397t0 = new E1(5);
        f372398u0 = new F1(2);
        f372399v0 = new F1(3);
        f372400w0 = new F1(4);
        f372401x0 = new C38576v1(20);
        f372402y0 = new C38458n1(20);
        f372403z0 = new C38458n1(21);
        f372316A0 = new C38576v1(22);
        f372317B0 = new C38576v1(23);
        f372318C0 = new C38458n1(22);
        f372319D0 = new C38458n1(23);
        f372320E0 = new C38458n1(24);
        f372321F0 = new C38458n1(25);
        f372322G0 = new C38458n1(26);
        f372323H0 = new C38458n1(27);
        f372324I0 = new C38458n1(29);
        f372326J0 = new E1(0);
        f372328K0 = C38147a.f372456l;
        f372330L0 = C38148b.f372457l;
        f372332M0 = C38149c.f372458l;
        f372334N0 = C38150d.f372459l;
        f372336O0 = C38151e.f372460l;
        f372338P0 = C38152f.f372461l;
        f372340Q0 = C38153g.f372462l;
        f372342R0 = C38154h.f372463l;
        f372344S0 = C38156j.f372465l;
        f372346T0 = C38157k.f372466l;
        f372348U0 = C38158l.f372467l;
        f372350V0 = C38159m.f372468l;
        f372352W0 = C38160n.f372469l;
        f372354X0 = C38161o.f372470l;
        f372356Y0 = C38162p.f372471l;
        f372358Z0 = C38163q.f372472l;
        f372360a1 = s.f372474l;
        f372362b1 = C38164r.f372473l;
        f372364c1 = t.f372475l;
        f372366d1 = u.f372476l;
        f372368e1 = v.f372477l;
        f372370f1 = w.f372478l;
        f372372g1 = x.f372479l;
        f372374h1 = y.f372480l;
        f372376i1 = z.f372481l;
        f372378j1 = A.f372439l;
        f372380k1 = B.f372440l;
        f372382l1 = C.f372441l;
        f372384m1 = D.f372442l;
        f372386n1 = E.f372443l;
        f372388o1 = F.f372444l;
        int i13 = M.f372451l;
        f372390p1 = P.f372454l;
        f372392q1 = O.f372453l;
        f372394r1 = N.f372452l;
        f372396s1 = Q.f372455l;
        int i14 = C38155i.f372464l;
    }

    public /* synthetic */ G1(com.yandex.div.json.e eVar, G1 g12, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        this(eVar, (i12 & 2) != 0 ? null : g12, (i12 & 4) != 0 ? false : z12, jSONObject);
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final DivGallery a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        DivAccessibility divAccessibility = (DivAccessibility) H21.b.f(this.f372413a, eVar, "accessibility", jSONObject, f372328K0);
        if (divAccessibility == null) {
            divAccessibility = f372325J;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        com.yandex.div.json.expressions.b bVar = (com.yandex.div.json.expressions.b) H21.b.d(this.f372414b, eVar, "alignment_horizontal", jSONObject, f372330L0);
        com.yandex.div.json.expressions.b bVar2 = (com.yandex.div.json.expressions.b) H21.b.d(this.f372415c, eVar, "alignment_vertical", jSONObject, f372332M0);
        com.yandex.div.json.expressions.b<Double> bVar3 = (com.yandex.div.json.expressions.b) H21.b.d(this.f372416d, eVar, "alpha", jSONObject, f372334N0);
        if (bVar3 == null) {
            bVar3 = f372327K;
        }
        com.yandex.div.json.expressions.b<Double> bVar4 = bVar3;
        List listG = H21.b.g(this.f372417e, eVar, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, jSONObject, f372371g0, f372336O0);
        com.yandex.div2.K k12 = (com.yandex.div2.K) H21.b.f(this.f372418f, eVar, "border", jSONObject, f372338P0);
        if (k12 == null) {
            k12 = f372329L;
        }
        com.yandex.div2.K k13 = k12;
        com.yandex.div.json.expressions.b bVar5 = (com.yandex.div.json.expressions.b) H21.b.d(this.f372419g, eVar, "column_count", jSONObject, f372340Q0);
        com.yandex.div.json.expressions.b bVar6 = (com.yandex.div.json.expressions.b) H21.b.d(this.f372420h, eVar, "column_span", jSONObject, f372342R0);
        com.yandex.div.json.expressions.b<DivGallery.CrossContentAlignment> bVar7 = (com.yandex.div.json.expressions.b) H21.b.d(this.f372421i, eVar, "cross_content_alignment", jSONObject, f372344S0);
        if (bVar7 == null) {
            bVar7 = f372331M;
        }
        com.yandex.div.json.expressions.b<DivGallery.CrossContentAlignment> bVar8 = bVar7;
        com.yandex.div.json.expressions.b bVar9 = (com.yandex.div.json.expressions.b) H21.b.d(this.f372422j, eVar, "cross_spacing", jSONObject, f372346T0);
        com.yandex.div.json.expressions.b<Long> bVar10 = (com.yandex.div.json.expressions.b) H21.b.d(this.f372423k, eVar, "default_item", jSONObject, f372348U0);
        if (bVar10 == null) {
            bVar10 = f372333N;
        }
        com.yandex.div.json.expressions.b<Long> bVar11 = bVar10;
        List listG2 = H21.b.g(this.f372424l, eVar, "disappear_actions", jSONObject, f372391q0, f372350V0);
        List listG3 = H21.b.g(this.f372425m, eVar, AttachMenuItem.File.EXTENSIONS, jSONObject, f372395s0, f372352W0);
        C38567u1 c38567u1 = (C38567u1) H21.b.f(this.f372426n, eVar, "focus", jSONObject, f372354X0);
        K5 k52 = (K5) H21.b.f(this.f372427o, eVar, "height", jSONObject, f372356Y0);
        if (k52 == null) {
            k52 = f372335O;
        }
        K5 k53 = k52;
        String str = (String) H21.b.d(this.f372428p, eVar, "id", jSONObject, f372358Z0);
        com.yandex.div.json.expressions.b<Long> bVar12 = (com.yandex.div.json.expressions.b) H21.b.d(this.f372429q, eVar, "item_spacing", jSONObject, f372360a1);
        if (bVar12 == null) {
            bVar12 = f372337P;
        }
        com.yandex.div.json.expressions.b<Long> bVar13 = bVar12;
        List listI = H21.b.i(this.f372430r, eVar, "items", jSONObject, f372402y0, f372362b1);
        Y0 y02 = (Y0) H21.b.f(this.f372431s, eVar, "margins", jSONObject, f372364c1);
        if (y02 == null) {
            y02 = f372339Q;
        }
        Y0 y03 = y02;
        com.yandex.div.json.expressions.b<DivGallery.Orientation> bVar14 = (com.yandex.div.json.expressions.b) H21.b.d(this.f372432t, eVar, "orientation", jSONObject, f372366d1);
        if (bVar14 == null) {
            bVar14 = f372341R;
        }
        com.yandex.div.json.expressions.b<DivGallery.Orientation> bVar15 = bVar14;
        Y0 y04 = (Y0) H21.b.f(this.f372433u, eVar, "paddings", jSONObject, f372368e1);
        if (y04 == null) {
            y04 = f372343S;
        }
        Y0 y05 = y04;
        com.yandex.div.json.expressions.b<Boolean> bVar16 = (com.yandex.div.json.expressions.b) H21.b.d(this.f372434v, eVar, "restrict_parent_scroll", jSONObject, f372370f1);
        if (bVar16 == null) {
            bVar16 = f372345T;
        }
        com.yandex.div.json.expressions.b<Boolean> bVar17 = bVar16;
        com.yandex.div.json.expressions.b bVar18 = (com.yandex.div.json.expressions.b) H21.b.d(this.f372435w, eVar, "row_span", jSONObject, f372372g1);
        com.yandex.div.json.expressions.b<DivGallery.ScrollMode> bVar19 = (com.yandex.div.json.expressions.b) H21.b.d(this.f372436x, eVar, "scroll_mode", jSONObject, f372374h1);
        if (bVar19 == null) {
            bVar19 = f372347U;
        }
        com.yandex.div.json.expressions.b<DivGallery.ScrollMode> bVar20 = bVar19;
        List listG4 = H21.b.g(this.f372437y, eVar, "selected_actions", jSONObject, f372318C0, f372376i1);
        List listG5 = H21.b.g(this.f372438z, eVar, "tooltips", jSONObject, f372320E0, f372378j1);
        C38260a8 c38260a8 = (C38260a8) H21.b.f(this.f372404A, eVar, "transform", jSONObject, f372380k1);
        if (c38260a8 == null) {
            c38260a8 = f372349V;
        }
        C38260a8 c38260a82 = c38260a8;
        T t12 = (T) H21.b.f(this.f372405B, eVar, "transition_change", jSONObject, f372382l1);
        com.yandex.div2.B b12 = (com.yandex.div2.B) H21.b.f(this.f372406C, eVar, "transition_in", jSONObject, f372384m1);
        com.yandex.div2.B b13 = (com.yandex.div2.B) H21.b.f(this.f372407D, eVar, "transition_out", jSONObject, f372386n1);
        List listE = H21.b.e(this.f372408E, eVar, jSONObject, f372322G0, f372388o1);
        com.yandex.div.json.expressions.b<DivVisibility> bVar21 = (com.yandex.div.json.expressions.b) H21.b.d(this.f372409F, eVar, "visibility", jSONObject, f372390p1);
        if (bVar21 == null) {
            bVar21 = f372351W;
        }
        com.yandex.div.json.expressions.b<DivVisibility> bVar22 = bVar21;
        w8 w8Var = (w8) H21.b.f(this.f372410G, eVar, "visibility_action", jSONObject, f372392q1);
        List listG6 = H21.b.g(this.f372411H, eVar, "visibility_actions", jSONObject, f372324I0, f372394r1);
        K5 k54 = (K5) H21.b.f(this.f372412I, eVar, "width", jSONObject, f372396s1);
        if (k54 == null) {
            k54 = f372353X;
        }
        return new DivGallery(divAccessibility2, bVar, bVar2, bVar4, listG, k13, bVar5, bVar6, bVar8, bVar9, bVar11, listG2, listG3, c38567u1, k53, str, bVar13, listI, y03, bVar15, y05, bVar17, bVar18, bVar20, listG4, listG5, c38260a82, t12, b12, b13, listE, bVar22, w8Var, listG6, k54);
    }

    public G1(@Y61.k com.yandex.div.json.e eVar, @Y61.l G1 g12, boolean z12, @Y61.k JSONObject jSONObject) {
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        H21.a<C38447m> aVar = g12 == null ? null : g12.f372413a;
        C38447m.f375826g.getClass();
        this.f372413a = com.yandex.div.internal.parser.s.g(jSONObject, "accessibility", z12, aVar, C38447m.f375842w, f370579a, eVar);
        H21.a<com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> aVar2 = g12 == null ? null : g12.f372414b;
        DivAlignmentHorizontal.f371238c.getClass();
        Y41.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.f371239d;
        C38106b c38106b = C38107c.f370139a;
        this.f372414b = com.yandex.div.internal.parser.s.i(jSONObject, "alignment_horizontal", z12, aVar2, lVar, c38106b, f370579a, f372355Y);
        H21.a<com.yandex.div.json.expressions.b<DivAlignmentVertical>> aVar3 = g12 == null ? null : g12.f372415c;
        DivAlignmentVertical.f371246c.getClass();
        this.f372415c = com.yandex.div.internal.parser.s.i(jSONObject, "alignment_vertical", z12, aVar3, DivAlignmentVertical.f371247d, c38106b, f370579a, f372357Z);
        this.f372416d = com.yandex.div.internal.parser.s.i(jSONObject, "alpha", z12, g12 == null ? null : g12.f372416d, com.yandex.div.internal.parser.y.f370150d, f372367e0, f370579a, com.yandex.div.internal.parser.E.f370134d);
        H21.a<List<com.yandex.div2.G>> aVar4 = g12 == null ? null : g12.f372417e;
        com.yandex.div2.G.f372308a.getClass();
        this.f372417e = com.yandex.div.internal.parser.s.j(jSONObject, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, z12, aVar4, com.yandex.div2.G.f372309b, f372373h0, f370579a, eVar);
        H21.a<com.yandex.div2.L> aVar5 = g12 == null ? null : g12.f372418f;
        com.yandex.div2.L.f372728f.getClass();
        this.f372418f = com.yandex.div.internal.parser.s.g(jSONObject, "border", z12, aVar5, com.yandex.div2.L.f372737o, f370579a, eVar);
        H21.a<com.yandex.div.json.expressions.b<Long>> aVar6 = g12 == null ? null : g12.f372419g;
        Y41.l<Number, Long> lVar2 = com.yandex.div.internal.parser.y.f370151e;
        E.d dVar = com.yandex.div.internal.parser.E.f370132b;
        this.f372419g = com.yandex.div.internal.parser.s.i(jSONObject, "column_count", z12, aVar6, lVar2, f372375i0, f370579a, dVar);
        this.f372420h = com.yandex.div.internal.parser.s.i(jSONObject, "column_span", z12, g12 == null ? null : g12.f372420h, lVar2, f372379k0, f370579a, dVar);
        H21.a<com.yandex.div.json.expressions.b<DivGallery.CrossContentAlignment>> aVar7 = g12 == null ? null : g12.f372421i;
        DivGallery.CrossContentAlignment.f371529c.getClass();
        this.f372421i = com.yandex.div.internal.parser.s.i(jSONObject, "cross_content_alignment", z12, aVar7, DivGallery.CrossContentAlignment.f371530d, c38106b, f370579a, f372359a0);
        this.f372422j = com.yandex.div.internal.parser.s.i(jSONObject, "cross_spacing", z12, g12 == null ? null : g12.f372422j, lVar2, f372383m0, f370579a, dVar);
        this.f372423k = com.yandex.div.internal.parser.s.i(jSONObject, "default_item", z12, g12 == null ? null : g12.f372423k, lVar2, f372387o0, f370579a, dVar);
        H21.a<List<T0>> aVar8 = g12 == null ? null : g12.f372424l;
        T0.f373518i.getClass();
        this.f372424l = com.yandex.div.internal.parser.s.j(jSONObject, "disappear_actions", z12, aVar8, T0.f373517C, f372393r0, f370579a, eVar);
        H21.a<List<C38283d1>> aVar9 = g12 == null ? null : g12.f372425m;
        C38283d1.f374708c.getClass();
        this.f372425m = com.yandex.div.internal.parser.s.j(jSONObject, AttachMenuItem.File.EXTENSIONS, z12, aVar9, C38283d1.f374713h, f372397t0, f370579a, eVar);
        H21.a<C38585w1> aVar10 = g12 == null ? null : g12.f372426n;
        C38585w1.f376878f.getClass();
        this.f372426n = com.yandex.div.internal.parser.s.g(jSONObject, "focus", z12, aVar10, C38585w1.f376891s, f370579a, eVar);
        H21.a<L5> aVar11 = g12 == null ? null : g12.f372427o;
        L5.f372755a.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, L5> pVar = L5.f372756b;
        this.f372427o = com.yandex.div.internal.parser.s.g(jSONObject, "height", z12, aVar11, pVar, f370579a, eVar);
        this.f372428p = com.yandex.div.internal.parser.s.f(jSONObject, "id", z12, g12 == null ? null : g12.f372428p, C38107c.f370141c, f372398u0, f370579a);
        this.f372429q = com.yandex.div.internal.parser.s.i(jSONObject, "item_spacing", z12, g12 == null ? null : g12.f372429q, lVar2, f372400w0, f370579a, dVar);
        H21.a<List<AbstractC38259a7>> aVar12 = g12 == null ? null : g12.f372430r;
        AbstractC38259a7.f374357a.getClass();
        this.f372430r = com.yandex.div.internal.parser.s.e(jSONObject, "items", z12, aVar12, AbstractC38259a7.f374358b, f372403z0, f370579a, eVar);
        H21.a<C38233a1> aVar13 = g12 == null ? null : g12.f372431s;
        C38233a1.f374131f.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, C38233a1> pVar2 = C38233a1.f374151z;
        this.f372431s = com.yandex.div.internal.parser.s.g(jSONObject, "margins", z12, aVar13, pVar2, f370579a, eVar);
        H21.a<com.yandex.div.json.expressions.b<DivGallery.Orientation>> aVar14 = g12 == null ? null : g12.f372432t;
        DivGallery.Orientation.f371537c.getClass();
        this.f372432t = com.yandex.div.internal.parser.s.i(jSONObject, "orientation", z12, aVar14, DivGallery.Orientation.f371538d, c38106b, f370579a, f372361b0);
        this.f372433u = com.yandex.div.internal.parser.s.g(jSONObject, "paddings", z12, g12 == null ? null : g12.f372433u, pVar2, f370579a, eVar);
        this.f372434v = com.yandex.div.internal.parser.s.i(jSONObject, "restrict_parent_scroll", z12, g12 == null ? null : g12.f372434v, com.yandex.div.internal.parser.y.f370149c, c38106b, f370579a, com.yandex.div.internal.parser.E.f370131a);
        this.f372435w = com.yandex.div.internal.parser.s.i(jSONObject, "row_span", z12, g12 == null ? null : g12.f372435w, lVar2, f372316A0, f370579a, dVar);
        H21.a<com.yandex.div.json.expressions.b<DivGallery.ScrollMode>> aVar15 = g12 == null ? null : g12.f372436x;
        DivGallery.ScrollMode.f371544c.getClass();
        this.f372436x = com.yandex.div.internal.parser.s.i(jSONObject, "scroll_mode", z12, aVar15, DivGallery.ScrollMode.f371545d, c38106b, f370579a, f372363c0);
        H21.a<List<r>> aVar16 = g12 == null ? null : g12.f372437y;
        r.f376158i.getClass();
        this.f372437y = com.yandex.div.internal.parser.s.j(jSONObject, "selected_actions", z12, aVar16, r.f376172w, f372319D0, f370579a, eVar);
        H21.a<List<Y7>> aVar17 = g12 == null ? null : g12.f372438z;
        Y7.f374048h.getClass();
        this.f372438z = com.yandex.div.internal.parser.s.j(jSONObject, "tooltips", z12, aVar17, Y7.f374062v, f372321F0, f370579a, eVar);
        H21.a<C38270b8> aVar18 = g12 == null ? null : g12.f372404A;
        C38270b8.f374668d.getClass();
        this.f372404A = com.yandex.div.internal.parser.s.g(jSONObject, "transform", z12, aVar18, C38270b8.f374674j, f370579a, eVar);
        H21.a<U> aVar19 = g12 == null ? null : g12.f372405B;
        U.f373671a.getClass();
        this.f372405B = com.yandex.div.internal.parser.s.g(jSONObject, "transition_change", z12, aVar19, U.f373672b, f370579a, eVar);
        H21.a<com.yandex.div2.C> aVar20 = g12 == null ? null : g12.f372406C;
        com.yandex.div2.C.f371018a.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, com.yandex.div2.C> pVar3 = com.yandex.div2.C.f371019b;
        this.f372406C = com.yandex.div.internal.parser.s.g(jSONObject, "transition_in", z12, aVar20, pVar3, f370579a, eVar);
        this.f372407D = com.yandex.div.internal.parser.s.g(jSONObject, "transition_out", z12, g12 == null ? null : g12.f372407D, pVar3, f370579a, eVar);
        H21.a<List<DivTransitionTrigger>> aVar21 = g12 == null ? null : g12.f372408E;
        DivTransitionTrigger.f372167c.getClass();
        this.f372408E = com.yandex.div.internal.parser.s.k(jSONObject, z12, aVar21, DivTransitionTrigger.f372168d, f372323H0, f370579a);
        H21.a<com.yandex.div.json.expressions.b<DivVisibility>> aVar22 = g12 == null ? null : g12.f372409F;
        DivVisibility.f372192c.getClass();
        this.f372409F = com.yandex.div.internal.parser.s.i(jSONObject, "visibility", z12, aVar22, DivVisibility.f372193d, C38107c.f370139a, f370579a, f372365d0);
        H21.a<x8> aVar23 = g12 == null ? null : g12.f372410G;
        x8.f376980i.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, x8> pVar4 = x8.f376979C;
        this.f372410G = com.yandex.div.internal.parser.s.g(jSONObject, "visibility_action", z12, aVar23, pVar4, f370579a, eVar);
        this.f372411H = com.yandex.div.internal.parser.s.j(jSONObject, "visibility_actions", z12, g12 == null ? null : g12.f372411H, pVar4, f372326J0, f370579a, eVar);
        this.f372412I = com.yandex.div.internal.parser.s.g(jSONObject, "width", z12, g12 == null ? null : g12.f372412I, pVar, f370579a, eVar);
    }
}
