package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.yandex.div.internal.parser.C38105a;
import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import com.yandex.div2.K5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

/* compiled from: DivCustomTemplate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/C0;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div/json/c;", "Lcom/yandex/div2/w0;", "I", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class C0 implements com.yandex.div.json.b, com.yandex.div.json.c<C38584w0> {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, String> f371025A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<AbstractC38330g>> f371026B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, Y0> f371027C0;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public static final DivAccessibility f371028D;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, Y0> f371029D0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f371030E;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f371031E0;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public static final K f371032F;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> f371033F0;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public static final K5.e f371034G;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivTooltip>> f371035G0;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public static final Y0 f371036H;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, C38260a8> f371037H0;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public static final Y0 f371038I;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, T> f371039I0;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public static final C38260a8 f371040J;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.B> f371041J0;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivVisibility> f371042K;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.B> f371043K0;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public static final K5.d f371044L;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivTransitionTrigger>> f371045L0;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371046M;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivVisibility>> f371047M0;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371048N;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, w8> f371049N0;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371050O;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<w8>> f371051O0;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public static final C38492p0 f371052P;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, K5> f371053P0;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public static final C38492p0 f371054Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public static final B0 f371055R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public static final B0 f371056S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public static final C38492p0 f371057T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public static final C38492p0 f371058U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public static final B0 f371059V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public static final B0 f371060W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public static final B0 f371061X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public static final B0 f371062Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public static final C38492p0 f371063Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public static final C38492p0 f371064a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public static final B0 f371065b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public static final B0 f371066c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public static final C38492p0 f371067d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public static final C38492p0 f371068e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public static final B0 f371069f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public static final B0 f371070g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public static final B0 f371071h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public static final C38302f0 f371072i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public static final C38302f0 f371073j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public static final C38302f0 f371074k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final C38302f0 f371075l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final B0 f371076m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, DivAccessibility> f371077n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> f371078o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentVertical>> f371079p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> f371080q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<com.yandex.div2.F>> f371081r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, K> f371082s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> f371083t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, JSONObject> f371084u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, String> f371085v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<S0>> f371086w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, List<C38273c1>> f371087x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, C38567u1> f371088y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<String, JSONObject, com.yandex.div.json.e, K5> f371089z0;

    /* renamed from: A, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<x8> f371090A;

    /* renamed from: B, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<x8>> f371091B;

    /* renamed from: C, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<L5> f371092C;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38447m> f371093a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> f371094b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivAlignmentVertical>> f371095c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Double>> f371096d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<com.yandex.div2.G>> f371097e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<L> f371098f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f371099g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<JSONObject> f371100h;

    /* renamed from: i, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<String> f371101i;

    /* renamed from: j, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<T0>> f371102j;

    /* renamed from: k, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<C38283d1>> f371103k;

    /* renamed from: l, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38585w1> f371104l;

    /* renamed from: m, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<L5> f371105m;

    /* renamed from: n, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<String> f371106n;

    /* renamed from: o, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<AbstractC38259a7>> f371107o;

    /* renamed from: p, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38233a1> f371108p;

    /* renamed from: q, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38233a1> f371109q;

    /* renamed from: r, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<Long>> f371110r;

    /* renamed from: s, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<com.yandex.div2.r>> f371111s;

    /* renamed from: t, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<Y7>> f371112t;

    /* renamed from: u, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<C38270b8> f371113u;

    /* renamed from: v, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<U> f371114v;

    /* renamed from: w, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div2.C> f371115w;

    /* renamed from: x, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div2.C> f371116x;

    /* renamed from: y, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<List<DivTransitionTrigger>> f371117y;

    /* renamed from: z, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final H21.a<com.yandex.div.json.expressions.b<DivVisibility>> f371118z;

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class A extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final A f371119l = new A();

        public A() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class B extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final B f371120l = new B();

        public B() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class C extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final C f371121l = new C();

        public C() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class D extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f371122l = 0;

        static {
            new D();
        }

        public D() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            eVar.getClass();
            return (String) C38107c.a(jSONObject2, str, C38107c.f370141c, C38107c.f370139a);
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/w8;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class E extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<w8>> {

        /* renamed from: l, reason: collision with root package name */
        public static final E f371123l = new E();

        public E() {
            super(3);
        }

        @Override // Y41.q
        public final List<w8> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            w8.f376942h.getClass();
            return C38107c.k(jSONObject, str2, w8.f376950p, C0.f371075l0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/w8;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/w8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class F extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, w8> {

        /* renamed from: l, reason: collision with root package name */
        public static final F f371124l = new F();

        public F() {
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

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivVisibility;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class G extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivVisibility>> {

        /* renamed from: l, reason: collision with root package name */
        public static final G f371125l = new G();

        public G() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivVisibility> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivVisibility.f372192c.getClass();
            Y41.l<String, DivVisibility> lVar = DivVisibility.f372193d;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<DivVisibility> bVar = C0.f371042K;
            com.yandex.div.json.expressions.b<DivVisibility> bVarI = C38107c.i(jSONObject, str2, lVar, C38107c.f370139a, f370579a, bVar, C0.f371050O);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/K5;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/K5;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class H extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, K5> {

        /* renamed from: l, reason: collision with root package name */
        public static final H f371126l = new H();

        public H() {
            super(3);
        }

        @Override // Y41.q
        public final K5 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            K5.f372712a.getClass();
            K5 k52 = (K5) C38107c.g(jSONObject, str, K5.f372713b, eVar2.getF370579a(), eVar2);
            return k52 == null ? C0.f371044L : k52;
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\rR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0012R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\rR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\rR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0012R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0012R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\rR\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\rR\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0012R\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002050\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0012R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0012R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0012R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0012R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020>0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0012R\u0014\u0010A\u001a\u00020&8\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010FR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0012R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0012R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020I0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\nR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Lcom/yandex/div2/C0$I;", "", "<init>", "()V", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/b;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/G;", "BACKGROUND_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/F;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/K;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/K;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/T0;", "DISAPPEAR_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/S0;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/d1;", "EXTENSIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/c1;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/K5$e;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/K5$e;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/a7;", "ITEMS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/g;", "ITEMS_VALIDATOR", "Lcom/yandex/div2/Y0;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/Y0;", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/r;", "SELECTED_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/Y7;", "TOOLTIPS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/a8;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/a8;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_TEMPLATE_VALIDATOR", "TRANSITION_TRIGGERS_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/x8;", "VISIBILITY_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/w8;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class I {
        public /* synthetic */ I(C42822w c42822w) {
            this();
        }

        public I() {
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/DivAccessibility;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/DivAccessibility;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.C0$a, reason: case insensitive filesystem */
    public static final class C38138a extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, DivAccessibility> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38138a f371127l = new C38138a();

        public C38138a() {
            super(3);
        }

        @Override // Y41.q
        public final DivAccessibility invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            DivAccessibility.f371175f.getClass();
            DivAccessibility divAccessibility = (DivAccessibility) C38107c.g(jSONObject, str, DivAccessibility.f371182m, eVar2.getF370579a(), eVar2);
            return divAccessibility == null ? C0.f371028D : divAccessibility;
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.C0$b, reason: case insensitive filesystem */
    public static final class C38139b extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38139b f371128l = new C38139b();

        public C38139b() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivAlignmentHorizontal.f371238c.getClass();
            return C38107c.i(jSONObject, str2, DivAlignmentHorizontal.f371239d, C38107c.f370139a, eVar.getF370579a(), null, C0.f371046M);
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivAlignmentVertical;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.C0$c, reason: case insensitive filesystem */
    public static final class C38140c extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<DivAlignmentVertical>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38140c f371129l = new C38140c();

        public C38140c() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<DivAlignmentVertical> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            DivAlignmentVertical.f371246c.getClass();
            return C38107c.i(jSONObject, str2, DivAlignmentVertical.f371247d, C38107c.f370139a, eVar.getF370579a(), null, C0.f371048N);
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.C0$d, reason: case insensitive filesystem */
    public static final class C38141d extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Double>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38141d f371130l = new C38141d();

        public C38141d() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Double> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            Y41.l<Number, Double> lVar = com.yandex.div.internal.parser.y.f370150d;
            C38492p0 c38492p0 = C0.f371054Q;
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            com.yandex.div.json.expressions.b<Double> bVar = C0.f371030E;
            com.yandex.div.json.expressions.b<Double> bVarI = C38107c.i(jSONObject, str2, lVar, c38492p0, f370579a, bVar, com.yandex.div.internal.parser.E.f370134d);
            return bVarI == null ? bVar : bVarI;
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/F;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.C0$e, reason: case insensitive filesystem */
    public static final class C38142e extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<com.yandex.div2.F>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38142e f371131l = new C38142e();

        public C38142e() {
            super(3);
        }

        @Override // Y41.q
        public final List<com.yandex.div2.F> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            com.yandex.div2.F.f372262a.getClass();
            return C38107c.k(jSONObject, str2, com.yandex.div2.F.f372263b, C0.f371055R, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/K;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/K;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.C0$f, reason: case insensitive filesystem */
    public static final class C38143f extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, K> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38143f f371132l = new C38143f();

        public C38143f() {
            super(3);
        }

        @Override // Y41.q
        public final K invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            K.f372635f.getClass();
            K k12 = (K) C38107c.g(jSONObject, str, K.f372638i, eVar2.getF370579a(), eVar2);
            return k12 == null ? C0.f371032F : k12;
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.C0$g, reason: case insensitive filesystem */
    public static final class C38144g extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38144g f371133l = new C38144g();

        public C38144g() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370151e, C0.f371058U, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370132b);
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/C0;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/C0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.C0$h, reason: case insensitive filesystem */
    public static final class C38145h extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C0> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f371134l = 0;

        static {
            new C38145h();
        }

        public C38145h() {
            super(2);
        }

        @Override // Y41.p
        public final C0 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            return new C0(eVar, null, false, jSONObject, 6, null);
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lorg/json/JSONObject;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.C0$i, reason: case insensitive filesystem */
    public static final class C38146i extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, JSONObject> {

        /* renamed from: l, reason: collision with root package name */
        public static final C38146i f371135l = new C38146i();

        public C38146i() {
            super(3);
        }

        @Override // Y41.q
        public final JSONObject invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return (JSONObject) C38107c.h(jSONObject, str, C38107c.f370141c, C38107c.f370139a, eVar.getF370579a());
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final j f371136l = new j();

        public j() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            eVar.getClass();
            return (String) C38107c.a(jSONObject2, str, C38107c.f370141c, C38107c.f370139a);
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/S0;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<S0>> {

        /* renamed from: l, reason: collision with root package name */
        public static final k f371137l = new k();

        public k() {
            super(3);
        }

        @Override // Y41.q
        public final List<S0> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            S0.f373492a.getClass();
            return C38107c.k(jSONObject, str2, S0.f373500i, C0.f371059V, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/c1;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<C38273c1>> {

        /* renamed from: l, reason: collision with root package name */
        public static final l f371138l = new l();

        public l() {
            super(3);
        }

        @Override // Y41.q
        public final List<C38273c1> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            C38273c1.f374687c.getClass();
            return C38107c.k(jSONObject, str2, C38273c1.f374689e, C0.f371061X, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/u1;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/u1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, C38567u1> {

        /* renamed from: l, reason: collision with root package name */
        public static final m f371139l = new m();

        public m() {
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

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/K5;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/K5;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, K5> {

        /* renamed from: l, reason: collision with root package name */
        public static final n f371140l = new n();

        public n() {
            super(3);
        }

        @Override // Y41.q
        public final K5 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            K5.f372712a.getClass();
            K5 k52 = (K5) C38107c.g(jSONObject, str, K5.f372713b, eVar2.getF370579a(), eVar2);
            return k52 == null ? C0.f371034G : k52;
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final o f371141l = new o();

        public o() {
            super(3);
        }

        @Override // Y41.q
        public final String invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return (String) C38107c.h(jSONObject, str, C38107c.f370141c, C0.f371064a0, eVar.getF370579a());
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/g;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<AbstractC38330g>> {

        /* renamed from: l, reason: collision with root package name */
        public static final p f371142l = new p();

        public p() {
            super(3);
        }

        @Override // Y41.q
        public final List<AbstractC38330g> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            AbstractC38330g.f375012a.getClass();
            return C38107c.k(jSONObject, str2, AbstractC38330g.f375013b, C0.f371065b0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/Y0;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/Y0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, Y0> {

        /* renamed from: l, reason: collision with root package name */
        public static final q f371143l = new q();

        public q() {
            super(3);
        }

        @Override // Y41.q
        public final Y0 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            Y0.f374024f.getClass();
            Y0 y02 = (Y0) C38107c.g(jSONObject, str, Y0.f374035q, eVar2.getF370579a(), eVar2);
            return y02 == null ? C0.f371036H : y02;
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/Y0;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/Y0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, Y0> {

        /* renamed from: l, reason: collision with root package name */
        public static final r f371144l = new r();

        public r() {
            super(3);
        }

        @Override // Y41.q
        public final Y0 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            Y0.f374024f.getClass();
            Y0 y02 = (Y0) C38107c.g(jSONObject, str, Y0.f374035q, eVar2.getF370579a(), eVar2);
            return y02 == null ? C0.f371038I : y02;
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u000b\u001a\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div/json/expressions/b;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div/json/expressions/b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div.json.expressions.b<Long>> {

        /* renamed from: l, reason: collision with root package name */
        public static final s f371145l = new s();

        public s() {
            super(3);
        }

        @Override // Y41.q
        public final com.yandex.div.json.expressions.b<Long> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            return C38107c.i(jSONObject, str, com.yandex.div.internal.parser.y.f370151e, C0.f371068e0, eVar.getF370579a(), null, com.yandex.div.internal.parser.E.f370132b);
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivAction;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivAction>> {

        /* renamed from: l, reason: collision with root package name */
        public static final t f371146l = new t();

        public t() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivAction> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            DivAction.f371211f.getClass();
            return C38107c.k(jSONObject, str2, DivAction.f371215j, C0.f371069f0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivTooltip;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivTooltip>> {

        /* renamed from: l, reason: collision with root package name */
        public static final u f371147l = new u();

        public u() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivTooltip> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            String str2 = str;
            com.yandex.div.json.e eVar2 = eVar;
            DivTooltip.f372130h.getClass();
            return C38107c.k(jSONObject, str2, DivTooltip.f372135m, C0.f371071h0, eVar2.getF370579a(), eVar2);
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/a8;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/a8;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, C38260a8> {

        /* renamed from: l, reason: collision with root package name */
        public static final v f371148l = new v();

        public v() {
            super(3);
        }

        @Override // Y41.q
        public final C38260a8 invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            com.yandex.div.json.e eVar2 = eVar;
            C38260a8.f374376d.getClass();
            C38260a8 c38260a8 = (C38260a8) C38107c.g(jSONObject, str, C38260a8.f374379g, eVar2.getF370579a(), eVar2);
            return c38260a8 == null ? C0.f371040J : c38260a8;
        }
    }

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/T;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/T;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, T> {

        /* renamed from: l, reason: collision with root package name */
        public static final w f371149l = new w();

        public w() {
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

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/B;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/B;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.B> {

        /* renamed from: l, reason: collision with root package name */
        public static final x f371150l = new x();

        public x() {
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

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "Lcom/yandex/div2/B;", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Lcom/yandex/div2/B;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, com.yandex.div2.B> {

        /* renamed from: l, reason: collision with root package name */
        public static final y f371151l = new y();

        public y() {
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

    /* compiled from: DivCustomTemplate.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\f\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "key", "Lorg/json/JSONObject;", "json", "Lcom/yandex/div/json/e;", "env", "", "Lcom/yandex/div2/DivTransitionTrigger;", "kotlin.jvm.PlatformType", "", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/yandex/div/json/e;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z extends kotlin.jvm.internal.N implements Y41.q<String, JSONObject, com.yandex.div.json.e, List<DivTransitionTrigger>> {

        /* renamed from: l, reason: collision with root package name */
        public static final z f371152l = new z();

        public z() {
            super(3);
        }

        @Override // Y41.q
        public final List<DivTransitionTrigger> invoke(String str, JSONObject jSONObject, com.yandex.div.json.e eVar) {
            JSONObject jSONObject2 = jSONObject;
            DivTransitionTrigger.f372167c.getClass();
            return C38107c.j(jSONObject2, str, DivTransitionTrigger.f372168d, C0.f371073j0, eVar.getF370579a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new I(null);
        f371028D = new DivAccessibility(null, null, null, null, null, null, 63, null);
        f371030E = C38492p0.a(1.0d, com.yandex.div.json.expressions.b.f370552a);
        com.yandex.div.json.expressions.b bVar = null;
        f371032F = new K(null, null, null, null, null, 31, null);
        f371034G = new K5.e(new y8(bVar, null, null, 7, null));
        com.yandex.div.json.expressions.b bVar2 = null;
        f371036H = new Y0(null, null, null, bVar2, null, 31, null);
        Object[] objArr = 0 == true ? 1 : 0;
        f371038I = new Y0(bVar, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, objArr, 31, null);
        f371040J = new C38260a8(0 == true ? 1 : 0, 0 == true ? 1 : 0, bVar2, 7, null);
        f371042K = b.a.a(DivVisibility.VISIBLE);
        f371044L = new K5.d(new U3(null, 1, null));
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAlignmentHorizontal.values());
        A a12 = A.f371119l;
        aVar.getClass();
        f371046M = new com.yandex.div.internal.parser.C(a12, objC);
        f371048N = new com.yandex.div.internal.parser.C(B.f371120l, C42756l.C(DivAlignmentVertical.values()));
        f371050O = new com.yandex.div.internal.parser.C(C.f371121l, C42756l.C(DivVisibility.values()));
        f371052P = new C38492p0(21);
        f371054Q = new C38492p0(22);
        f371055R = new B0(1);
        f371056S = new B0(2);
        f371057T = new C38492p0(23);
        f371058U = new C38492p0(24);
        f371059V = new B0(3);
        f371060W = new B0(4);
        f371061X = new B0(5);
        f371062Y = new B0(6);
        f371063Z = new C38492p0(25);
        f371064a0 = new C38492p0(26);
        f371065b0 = new B0(7);
        f371066c0 = new B0(8);
        f371067d0 = new C38492p0(27);
        f371068e0 = new C38492p0(28);
        f371069f0 = new B0(9);
        f371070g0 = new B0(10);
        f371071h0 = new B0(11);
        f371072i0 = new C38302f0(26);
        f371073j0 = new C38302f0(27);
        f371074k0 = new C38302f0(28);
        f371075l0 = new C38302f0(29);
        f371076m0 = new B0(0);
        f371077n0 = C38138a.f371127l;
        f371078o0 = C38139b.f371128l;
        f371079p0 = C38140c.f371129l;
        f371080q0 = C38141d.f371130l;
        f371081r0 = C38142e.f371131l;
        f371082s0 = C38143f.f371132l;
        f371083t0 = C38144g.f371133l;
        f371084u0 = C38146i.f371135l;
        f371085v0 = j.f371136l;
        f371086w0 = k.f371137l;
        f371087x0 = l.f371138l;
        f371088y0 = m.f371139l;
        f371089z0 = n.f371140l;
        f371025A0 = o.f371141l;
        f371026B0 = p.f371142l;
        f371027C0 = q.f371143l;
        f371029D0 = r.f371144l;
        f371031E0 = s.f371145l;
        f371033F0 = t.f371146l;
        f371035G0 = u.f371147l;
        f371037H0 = v.f371148l;
        f371039I0 = w.f371149l;
        f371041J0 = x.f371150l;
        f371043K0 = y.f371151l;
        f371045L0 = z.f371152l;
        int i12 = D.f371122l;
        f371047M0 = G.f371125l;
        f371049N0 = F.f371124l;
        f371051O0 = E.f371123l;
        f371053P0 = H.f371126l;
        int i13 = C38145h.f371134l;
    }

    public /* synthetic */ C0(com.yandex.div.json.e eVar, C0 c02, boolean z12, JSONObject jSONObject, int i12, C42822w c42822w) {
        this(eVar, (i12 & 2) != 0 ? null : c02, (i12 & 4) != 0 ? false : z12, jSONObject);
    }

    @Override // com.yandex.div.json.c
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C38584w0 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
        DivAccessibility divAccessibility = (DivAccessibility) H21.b.f(this.f371093a, eVar, "accessibility", jSONObject, f371077n0);
        if (divAccessibility == null) {
            divAccessibility = f371028D;
        }
        DivAccessibility divAccessibility2 = divAccessibility;
        com.yandex.div.json.expressions.b bVar = (com.yandex.div.json.expressions.b) H21.b.d(this.f371094b, eVar, "alignment_horizontal", jSONObject, f371078o0);
        com.yandex.div.json.expressions.b bVar2 = (com.yandex.div.json.expressions.b) H21.b.d(this.f371095c, eVar, "alignment_vertical", jSONObject, f371079p0);
        com.yandex.div.json.expressions.b<Double> bVar3 = (com.yandex.div.json.expressions.b) H21.b.d(this.f371096d, eVar, "alpha", jSONObject, f371080q0);
        if (bVar3 == null) {
            bVar3 = f371030E;
        }
        com.yandex.div.json.expressions.b<Double> bVar4 = bVar3;
        List listG = H21.b.g(this.f371097e, eVar, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, jSONObject, f371055R, f371081r0);
        K k12 = (K) H21.b.f(this.f371098f, eVar, "border", jSONObject, f371082s0);
        if (k12 == null) {
            k12 = f371032F;
        }
        K k13 = k12;
        com.yandex.div.json.expressions.b bVar5 = (com.yandex.div.json.expressions.b) H21.b.d(this.f371099g, eVar, "column_span", jSONObject, f371083t0);
        JSONObject jSONObject2 = (JSONObject) H21.b.d(this.f371100h, eVar, "custom_props", jSONObject, f371084u0);
        String str = (String) H21.b.b(this.f371101i, eVar, "custom_type", jSONObject, f371085v0);
        List listG2 = H21.b.g(this.f371102j, eVar, "disappear_actions", jSONObject, f371059V, f371086w0);
        List listG3 = H21.b.g(this.f371103k, eVar, AttachMenuItem.File.EXTENSIONS, jSONObject, f371061X, f371087x0);
        C38567u1 c38567u1 = (C38567u1) H21.b.f(this.f371104l, eVar, "focus", jSONObject, f371088y0);
        K5 k52 = (K5) H21.b.f(this.f371105m, eVar, "height", jSONObject, f371089z0);
        if (k52 == null) {
            k52 = f371034G;
        }
        K5 k53 = k52;
        String str2 = (String) H21.b.d(this.f371106n, eVar, "id", jSONObject, f371025A0);
        List listG4 = H21.b.g(this.f371107o, eVar, "items", jSONObject, f371065b0, f371026B0);
        Y0 y02 = (Y0) H21.b.f(this.f371108p, eVar, "margins", jSONObject, f371027C0);
        if (y02 == null) {
            y02 = f371036H;
        }
        Y0 y03 = y02;
        Y0 y04 = (Y0) H21.b.f(this.f371109q, eVar, "paddings", jSONObject, f371029D0);
        if (y04 == null) {
            y04 = f371038I;
        }
        Y0 y05 = y04;
        com.yandex.div.json.expressions.b bVar6 = (com.yandex.div.json.expressions.b) H21.b.d(this.f371110r, eVar, "row_span", jSONObject, f371031E0);
        List listG5 = H21.b.g(this.f371111s, eVar, "selected_actions", jSONObject, f371069f0, f371033F0);
        List listG6 = H21.b.g(this.f371112t, eVar, "tooltips", jSONObject, f371071h0, f371035G0);
        C38260a8 c38260a8 = (C38260a8) H21.b.f(this.f371113u, eVar, "transform", jSONObject, f371037H0);
        if (c38260a8 == null) {
            c38260a8 = f371040J;
        }
        C38260a8 c38260a82 = c38260a8;
        T t12 = (T) H21.b.f(this.f371114v, eVar, "transition_change", jSONObject, f371039I0);
        com.yandex.div2.B b12 = (com.yandex.div2.B) H21.b.f(this.f371115w, eVar, "transition_in", jSONObject, f371041J0);
        com.yandex.div2.B b13 = (com.yandex.div2.B) H21.b.f(this.f371116x, eVar, "transition_out", jSONObject, f371043K0);
        List listE = H21.b.e(this.f371117y, eVar, jSONObject, f371073j0, f371045L0);
        com.yandex.div.json.expressions.b<DivVisibility> bVar7 = (com.yandex.div.json.expressions.b) H21.b.d(this.f371118z, eVar, "visibility", jSONObject, f371047M0);
        if (bVar7 == null) {
            bVar7 = f371042K;
        }
        com.yandex.div.json.expressions.b<DivVisibility> bVar8 = bVar7;
        w8 w8Var = (w8) H21.b.f(this.f371090A, eVar, "visibility_action", jSONObject, f371049N0);
        List listG7 = H21.b.g(this.f371091B, eVar, "visibility_actions", jSONObject, f371075l0, f371051O0);
        K5 k54 = (K5) H21.b.f(this.f371092C, eVar, "width", jSONObject, f371053P0);
        if (k54 == null) {
            k54 = f371044L;
        }
        return new C38584w0(divAccessibility2, bVar, bVar2, bVar4, listG, k13, bVar5, jSONObject2, str, listG2, listG3, c38567u1, k53, str2, listG4, y03, y05, bVar6, listG5, listG6, c38260a82, t12, b12, b13, listE, bVar8, w8Var, listG7, k54);
    }

    public C0(@Y61.k com.yandex.div.json.e eVar, @Y61.l C0 c02, boolean z12, @Y61.k JSONObject jSONObject) {
        com.yandex.div.json.i f370579a = eVar.getF370579a();
        H21.a<C38447m> aVar = c02 == null ? null : c02.f371093a;
        C38447m.f375826g.getClass();
        this.f371093a = com.yandex.div.internal.parser.s.g(jSONObject, "accessibility", z12, aVar, C38447m.f375842w, f370579a, eVar);
        H21.a<com.yandex.div.json.expressions.b<DivAlignmentHorizontal>> aVar2 = c02 == null ? null : c02.f371094b;
        DivAlignmentHorizontal.f371238c.getClass();
        Y41.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.f371239d;
        C38106b c38106b = C38107c.f370139a;
        this.f371094b = com.yandex.div.internal.parser.s.i(jSONObject, "alignment_horizontal", z12, aVar2, lVar, c38106b, f370579a, f371046M);
        H21.a<com.yandex.div.json.expressions.b<DivAlignmentVertical>> aVar3 = c02 == null ? null : c02.f371095c;
        DivAlignmentVertical.f371246c.getClass();
        this.f371095c = com.yandex.div.internal.parser.s.i(jSONObject, "alignment_vertical", z12, aVar3, DivAlignmentVertical.f371247d, c38106b, f370579a, f371048N);
        this.f371096d = com.yandex.div.internal.parser.s.i(jSONObject, "alpha", z12, c02 == null ? null : c02.f371096d, com.yandex.div.internal.parser.y.f370150d, f371052P, f370579a, com.yandex.div.internal.parser.E.f370134d);
        H21.a<List<com.yandex.div2.G>> aVar4 = c02 == null ? null : c02.f371097e;
        com.yandex.div2.G.f372308a.getClass();
        this.f371097e = com.yandex.div.internal.parser.s.j(jSONObject, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, z12, aVar4, com.yandex.div2.G.f372309b, f371056S, f370579a, eVar);
        H21.a<L> aVar5 = c02 == null ? null : c02.f371098f;
        L.f372728f.getClass();
        this.f371098f = com.yandex.div.internal.parser.s.g(jSONObject, "border", z12, aVar5, L.f372737o, f370579a, eVar);
        H21.a<com.yandex.div.json.expressions.b<Long>> aVar6 = c02 == null ? null : c02.f371099g;
        Y41.l<Number, Long> lVar2 = com.yandex.div.internal.parser.y.f370151e;
        E.d dVar = com.yandex.div.internal.parser.E.f370132b;
        this.f371099g = com.yandex.div.internal.parser.s.i(jSONObject, "column_span", z12, aVar6, lVar2, f371057T, f370579a, dVar);
        this.f371100h = com.yandex.div.internal.parser.s.h(jSONObject, "custom_props", z12, c02 == null ? null : c02.f371100h, f370579a);
        H21.a<String> aVar7 = c02 == null ? null : c02.f371101i;
        C38105a c38105a = C38107c.f370141c;
        this.f371101i = com.yandex.div.internal.parser.s.b(jSONObject, "custom_type", z12, aVar7, c38105a, c38106b, f370579a);
        H21.a<List<T0>> aVar8 = c02 == null ? null : c02.f371102j;
        T0.f373518i.getClass();
        this.f371102j = com.yandex.div.internal.parser.s.j(jSONObject, "disappear_actions", z12, aVar8, T0.f373517C, f371060W, f370579a, eVar);
        H21.a<List<C38283d1>> aVar9 = c02 == null ? null : c02.f371103k;
        C38283d1.f374708c.getClass();
        this.f371103k = com.yandex.div.internal.parser.s.j(jSONObject, AttachMenuItem.File.EXTENSIONS, z12, aVar9, C38283d1.f374713h, f371062Y, f370579a, eVar);
        H21.a<C38585w1> aVar10 = c02 == null ? null : c02.f371104l;
        C38585w1.f376878f.getClass();
        this.f371104l = com.yandex.div.internal.parser.s.g(jSONObject, "focus", z12, aVar10, C38585w1.f376891s, f370579a, eVar);
        H21.a<L5> aVar11 = c02 == null ? null : c02.f371105m;
        L5.f372755a.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, L5> pVar = L5.f372756b;
        this.f371105m = com.yandex.div.internal.parser.s.g(jSONObject, "height", z12, aVar11, pVar, f370579a, eVar);
        this.f371106n = com.yandex.div.internal.parser.s.f(jSONObject, "id", z12, c02 == null ? null : c02.f371106n, c38105a, f371063Z, f370579a);
        H21.a<List<AbstractC38259a7>> aVar12 = c02 == null ? null : c02.f371107o;
        AbstractC38259a7.f374357a.getClass();
        this.f371107o = com.yandex.div.internal.parser.s.j(jSONObject, "items", z12, aVar12, AbstractC38259a7.f374358b, f371066c0, f370579a, eVar);
        H21.a<C38233a1> aVar13 = c02 == null ? null : c02.f371108p;
        C38233a1.f374131f.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, C38233a1> pVar2 = C38233a1.f374151z;
        this.f371108p = com.yandex.div.internal.parser.s.g(jSONObject, "margins", z12, aVar13, pVar2, f370579a, eVar);
        this.f371109q = com.yandex.div.internal.parser.s.g(jSONObject, "paddings", z12, c02 == null ? null : c02.f371109q, pVar2, f370579a, eVar);
        this.f371110r = com.yandex.div.internal.parser.s.i(jSONObject, "row_span", z12, c02 == null ? null : c02.f371110r, lVar2, f371067d0, f370579a, dVar);
        H21.a<List<com.yandex.div2.r>> aVar14 = c02 == null ? null : c02.f371111s;
        com.yandex.div2.r.f376158i.getClass();
        this.f371111s = com.yandex.div.internal.parser.s.j(jSONObject, "selected_actions", z12, aVar14, com.yandex.div2.r.f376172w, f371070g0, f370579a, eVar);
        H21.a<List<Y7>> aVar15 = c02 == null ? null : c02.f371112t;
        Y7.f374048h.getClass();
        this.f371112t = com.yandex.div.internal.parser.s.j(jSONObject, "tooltips", z12, aVar15, Y7.f374062v, f371072i0, f370579a, eVar);
        H21.a<C38270b8> aVar16 = c02 == null ? null : c02.f371113u;
        C38270b8.f374668d.getClass();
        this.f371113u = com.yandex.div.internal.parser.s.g(jSONObject, "transform", z12, aVar16, C38270b8.f374674j, f370579a, eVar);
        H21.a<U> aVar17 = c02 == null ? null : c02.f371114v;
        U.f373671a.getClass();
        this.f371114v = com.yandex.div.internal.parser.s.g(jSONObject, "transition_change", z12, aVar17, U.f373672b, f370579a, eVar);
        H21.a<com.yandex.div2.C> aVar18 = c02 == null ? null : c02.f371115w;
        com.yandex.div2.C.f371018a.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, com.yandex.div2.C> pVar3 = com.yandex.div2.C.f371019b;
        this.f371115w = com.yandex.div.internal.parser.s.g(jSONObject, "transition_in", z12, aVar18, pVar3, f370579a, eVar);
        this.f371116x = com.yandex.div.internal.parser.s.g(jSONObject, "transition_out", z12, c02 == null ? null : c02.f371116x, pVar3, f370579a, eVar);
        H21.a<List<DivTransitionTrigger>> aVar19 = c02 == null ? null : c02.f371117y;
        DivTransitionTrigger.f372167c.getClass();
        this.f371117y = com.yandex.div.internal.parser.s.k(jSONObject, z12, aVar19, DivTransitionTrigger.f372168d, f371074k0, f370579a);
        H21.a<com.yandex.div.json.expressions.b<DivVisibility>> aVar20 = c02 == null ? null : c02.f371118z;
        DivVisibility.f372192c.getClass();
        this.f371118z = com.yandex.div.internal.parser.s.i(jSONObject, "visibility", z12, aVar20, DivVisibility.f372193d, c38106b, f370579a, f371050O);
        H21.a<x8> aVar21 = c02 == null ? null : c02.f371090A;
        x8.f376980i.getClass();
        Y41.p<com.yandex.div.json.e, JSONObject, x8> pVar4 = x8.f376979C;
        this.f371090A = com.yandex.div.internal.parser.s.g(jSONObject, "visibility_action", z12, aVar21, pVar4, f370579a, eVar);
        this.f371091B = com.yandex.div.internal.parser.s.j(jSONObject, "visibility_actions", z12, c02 == null ? null : c02.f371091B, pVar4, f371076m0, f370579a, eVar);
        this.f371092C = com.yandex.div.internal.parser.s.g(jSONObject, "width", z12, c02 == null ? null : c02.f371092C, pVar, f370579a, eVar);
    }
}
