package com.yandex.div2;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* compiled from: DivImage.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/v2;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div2/H;", "i", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.v2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38577v2 implements com.yandex.div.json.b, H {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final C38450m2 f376672A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final C38459n2 f376673B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final C38459n2 f376674C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final C38450m2 f376675D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public static final C38450m2 f376676E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public static final C38450m2 f376677F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public static final C38450m2 f376678G0;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public static final i f376679S = new i(null);

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public static final DivAccessibility f376680T = new DivAccessibility(null, null, null, null, null, null, 63, null);

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public static final DivAnimation f376681U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f376682V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public static final K f376683W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f376684X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivAlignmentVertical> f376685Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public static final K5.e f376686Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Boolean> f376687a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public static final Y0 f376688b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public static final Y0 f376689c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Integer> f376690d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Boolean> f376691e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivImageScale> f376692f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivBlendMode> f376693g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public static final C38260a8 f376694h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivVisibility> f376695i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public static final K5.d f376696j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f376697k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f376698l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f376699m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f376700n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f376701o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f376702p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f376703q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final C38450m2 f376704r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final C38459n2 f376705s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final C38450m2 f376706t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final C38459n2 f376707u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final C38450m2 f376708v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final C38450m2 f376709w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final C38450m2 f376710x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final C38450m2 f376711y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public static final C38459n2 f376712z0;

    /* renamed from: A, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Integer> f376713A;

    /* renamed from: B, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Boolean> f376714B;

    /* renamed from: C, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<String> f376715C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f376716D;

    /* renamed from: E, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivImageScale> f376717E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final List<DivAction> f376718F;

    /* renamed from: G, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Integer> f376719G;

    /* renamed from: H, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivBlendMode> f376720H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public final List<DivTooltip> f376721I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final C38260a8 f376722J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public final T f376723K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public final B f376724L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public final B f376725M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public final List<DivTransitionTrigger> f376726N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivVisibility> f376727O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public final w8 f376728P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public final List<w8> f376729Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final K5 f376730R;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DivAccessibility f376731a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final DivAction f376732b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final DivAnimation f376733c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f376734d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f376735e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> f376736f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> f376737g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final C38303f1 f376738h;

    /* renamed from: i, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final D f376739i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final List<F> f376740j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final K f376741k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f376742l;

    /* renamed from: m, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f376743m;

    /* renamed from: n, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> f376744n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final List<S0> f376745o;

    /* renamed from: p, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f376746p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final List<C38273c1> f376747q;

    /* renamed from: r, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<AbstractC38386j1> f376748r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final C38567u1 f376749s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final K5 f376750t;

    /* renamed from: u, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Boolean> f376751u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final String f376752v;

    /* renamed from: w, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Uri> f376753w;

    /* renamed from: x, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f376754x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final Y0 f376755y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final Y0 f376756z;

    /* compiled from: DivImage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/v2;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/v2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.v2$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38577v2> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f376757l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38577v2 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            C38577v2.f376679S.getClass();
            return i.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivImage.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.v2$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f376758l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivImage.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.v2$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f376759l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivImage.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.v2$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f376760l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivImage.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.v2$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f376761l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivImage.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.v2$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f376762l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivImageScale);
        }
    }

    /* compiled from: DivImage.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.v2$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f376763l = new g();

        public g() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivBlendMode);
        }
    }

    /* compiled from: DivImage.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.v2$h */
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f376764l = new h();

        public h() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivImage.kt */
    @Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\nR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\nR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\nR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\nR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0011R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0014R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0014R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\nR\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0011R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020,0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0011R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020.0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0014R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020.0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0014R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0014R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0014R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0011R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\nR\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0011R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\nR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\nR\u0014\u0010I\u001a\u00020.8\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001e0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020 0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010MR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001e0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010MR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020 0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010MR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020=0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010MR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020@0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010MR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020S0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010MR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020U0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010\nR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020S0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010\u0011R\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006["}, d2 = {"Lcom/yandex/div2/v2$i;", "", "<init>", "()V", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAnimation;", "ACTION_ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/expressions/b;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/F;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/K;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/K;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAlignmentHorizontal;", "CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivAlignmentVertical;", "CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE", "Lcom/yandex/div2/S0;", "DISAPPEAR_ACTIONS_VALIDATOR", "DOUBLETAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/c1;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/j1;", "FILTERS_VALIDATOR", "Lcom/yandex/div2/K5$e;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/K5$e;", "", "HIGH_PRIORITY_PREVIEW_SHOW_DEFAULT_VALUE", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "LONGTAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/Y0;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/Y0;", "PADDINGS_DEFAULT_VALUE", "", "PLACEHOLDER_COLOR_DEFAULT_VALUE", "PRELOAD_REQUIRED_DEFAULT_VALUE", "PREVIEW_TEMPLATE_VALIDATOR", "PREVIEW_VALIDATOR", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivImageScale;", "SCALE_DEFAULT_VALUE", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivBlendMode;", "TINT_MODE_DEFAULT_VALUE", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/a8;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/a8;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL", "TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL", "TYPE_HELPER_SCALE", "TYPE_HELPER_TINT_MODE", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/w8;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.v2$i */
    public static final class i {
        public /* synthetic */ i(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static C38577v2 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            DivAccessibility.f371175f.getClass();
            DivAccessibility divAccessibility = (DivAccessibility) C38107c.g(jSONObject, "accessibility", DivAccessibility.f371182m, f370579a, eVar);
            if (divAccessibility == null) {
                divAccessibility = C38577v2.f376680T;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            DivAction.f371211f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, DivAction> pVar = DivAction.f371215j;
            DivAction divAction = (DivAction) C38107c.g(jSONObject, "action", pVar, f370579a, eVar);
            DivAnimation.f371255h.getClass();
            DivAnimation divAnimation = (DivAnimation) C38107c.g(jSONObject, "action_animation", DivAnimation.f371264q, f370579a, eVar);
            if (divAnimation == null) {
                divAnimation = C38577v2.f376681U;
            }
            DivAnimation divAnimation2 = divAnimation;
            List listK = C38107c.k(jSONObject, "actions", pVar, C38577v2.f376704r0, f370579a, eVar);
            DivAlignmentHorizontal.f371238c.getClass();
            Y41.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.f371239d;
            com.yandex.div.internal.parser.C c12 = C38577v2.f376697k0;
            C38106b c38106b = C38107c.f370139a;
            com.yandex.div.json.expressions.b bVarI = C38107c.i(jSONObject, "alignment_horizontal", lVar, c38106b, f370579a, null, c12);
            DivAlignmentVertical.f371246c.getClass();
            Y41.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.f371247d;
            com.yandex.div.json.expressions.b bVarI2 = C38107c.i(jSONObject, "alignment_vertical", lVar2, c38106b, f370579a, null, C38577v2.f376698l0);
            Y41.l<Number, Double> lVar3 = com.yandex.div.internal.parser.y.f370150d;
            C38459n2 c38459n2 = C38577v2.f376705s0;
            com.yandex.div.json.expressions.b<Double> bVar = C38577v2.f376682V;
            com.yandex.div.json.expressions.b<Double> bVarI3 = C38107c.i(jSONObject, "alpha", lVar3, c38459n2, f370579a, bVar, com.yandex.div.internal.parser.E.f370134d);
            com.yandex.div.json.expressions.b<Double> bVar2 = bVarI3 == null ? bVar : bVarI3;
            C38303f1.f374755e.getClass();
            C38303f1 c38303f1 = (C38303f1) C38107c.g(jSONObject, "appearance_animation", C38303f1.f374764n, f370579a, eVar);
            D.f371163b.getClass();
            D d12 = (D) C38107c.g(jSONObject, "aspect", D.f371165d, f370579a, eVar);
            F.f372262a.getClass();
            List listK2 = C38107c.k(jSONObject, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, F.f372263b, C38577v2.f376706t0, f370579a, eVar);
            K.f372635f.getClass();
            K k12 = (K) C38107c.g(jSONObject, "border", K.f372638i, f370579a, eVar);
            if (k12 == null) {
                k12 = C38577v2.f376683W;
            }
            K k13 = k12;
            Y41.l<Number, Long> lVar4 = com.yandex.div.internal.parser.y.f370151e;
            C38459n2 c38459n22 = C38577v2.f376707u0;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            com.yandex.div.json.expressions.b bVarI4 = C38107c.i(jSONObject, "column_span", lVar4, c38459n22, f370579a, null, dVar);
            com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar3 = C38577v2.f376684X;
            com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVarI5 = C38107c.i(jSONObject, "content_alignment_horizontal", lVar, c38106b, f370579a, bVar3, C38577v2.f376699m0);
            com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar4 = bVarI5 == null ? bVar3 : bVarI5;
            com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar5 = C38577v2.f376685Y;
            com.yandex.div.json.expressions.b<DivAlignmentVertical> bVarI6 = C38107c.i(jSONObject, "content_alignment_vertical", lVar2, c38106b, f370579a, bVar5, C38577v2.f376700n0);
            com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar6 = bVarI6 == null ? bVar5 : bVarI6;
            S0.f373492a.getClass();
            List listK3 = C38107c.k(jSONObject, "disappear_actions", S0.f373500i, C38577v2.f376708v0, f370579a, eVar);
            List listK4 = C38107c.k(jSONObject, "doubletap_actions", pVar, C38577v2.f376709w0, f370579a, eVar);
            C38273c1.f374687c.getClass();
            List listK5 = C38107c.k(jSONObject, AttachMenuItem.File.EXTENSIONS, C38273c1.f374689e, C38577v2.f376710x0, f370579a, eVar);
            AbstractC38386j1.f375414a.getClass();
            List listK6 = C38107c.k(jSONObject, "filters", AbstractC38386j1.f375415b, C38577v2.f376711y0, f370579a, eVar);
            C38567u1.f376619f.getClass();
            C38567u1 c38567u1 = (C38567u1) C38107c.g(jSONObject, "focus", C38567u1.f376624k, f370579a, eVar);
            K5.f372712a.getClass();
            K5 k52 = (K5) C38107c.g(jSONObject, "height", K5.f372713b, f370579a, eVar);
            if (k52 == null) {
                k52 = C38577v2.f376686Z;
            }
            K5 k53 = k52;
            Y41.l<Object, Boolean> lVar5 = com.yandex.div.internal.parser.y.f370149c;
            com.yandex.div.json.expressions.b<Boolean> bVar7 = C38577v2.f376687a0;
            E.a aVar = com.yandex.div.internal.parser.E.f370131a;
            com.yandex.div.json.expressions.b<Boolean> bVarI7 = C38107c.i(jSONObject, "high_priority_preview_show", lVar5, c38106b, f370579a, bVar7, aVar);
            com.yandex.div.json.expressions.b<Boolean> bVar8 = bVarI7 == null ? bVar7 : bVarI7;
            C38459n2 c38459n23 = C38577v2.f376712z0;
            C38105a c38105a = C38107c.f370141c;
            String str = (String) C38107c.h(jSONObject, "id", c38105a, c38459n23, f370579a);
            com.yandex.div.json.expressions.b bVarC = C38107c.c(jSONObject, "image_url", com.yandex.div.internal.parser.y.f370148b, c38106b, f370579a, com.yandex.div.internal.parser.E.f370135e);
            DivAction.f371211f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, DivAction> pVar2 = DivAction.f371215j;
            List listK7 = C38107c.k(jSONObject, "longtap_actions", pVar2, C38577v2.f376672A0, f370579a, eVar);
            Y0.f374024f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, Y0> pVar3 = Y0.f374035q;
            Y0 y02 = (Y0) C38107c.g(jSONObject, "margins", pVar3, f370579a, eVar);
            if (y02 == null) {
                y02 = C38577v2.f376688b0;
            }
            Y0 y03 = y02;
            Y0 y04 = (Y0) C38107c.g(jSONObject, "paddings", pVar3, f370579a, eVar);
            if (y04 == null) {
                y04 = C38577v2.f376689c0;
            }
            Y0 y05 = y04;
            Y41.l<Object, Integer> lVar6 = com.yandex.div.internal.parser.y.f370147a;
            com.yandex.div.json.expressions.b<Integer> bVar9 = C38577v2.f376690d0;
            E.b bVar10 = com.yandex.div.internal.parser.E.f370136f;
            C38106b c38106b2 = C38107c.f370139a;
            com.yandex.div.json.expressions.b<Integer> bVarI8 = C38107c.i(jSONObject, "placeholder_color", lVar6, c38106b2, f370579a, bVar9, bVar10);
            com.yandex.div.json.expressions.b<Integer> bVar11 = bVarI8 == null ? bVar9 : bVarI8;
            com.yandex.div.json.expressions.b<Boolean> bVar12 = C38577v2.f376691e0;
            com.yandex.div.json.expressions.b<Boolean> bVarI9 = C38107c.i(jSONObject, "preload_required", lVar5, c38106b2, f370579a, bVar12, aVar);
            com.yandex.div.json.expressions.b<Boolean> bVar13 = bVarI9 == null ? bVar12 : bVarI9;
            com.yandex.div.json.expressions.b bVarI10 = C38107c.i(jSONObject, MessageSuggest.PREVIEW, c38105a, C38577v2.f376673B0, f370579a, null, com.yandex.div.internal.parser.E.f370133c);
            com.yandex.div.json.expressions.b bVarI11 = C38107c.i(jSONObject, "row_span", lVar4, C38577v2.f376674C0, f370579a, null, dVar);
            DivImageScale.f371558c.getClass();
            Y41.l<String, DivImageScale> lVar7 = DivImageScale.f371559d;
            com.yandex.div.json.expressions.b<DivImageScale> bVar14 = C38577v2.f376692f0;
            com.yandex.div.json.expressions.b<DivImageScale> bVarI12 = C38107c.i(jSONObject, "scale", lVar7, c38106b2, f370579a, bVar14, C38577v2.f376701o0);
            com.yandex.div.json.expressions.b<DivImageScale> bVar15 = bVarI12 == null ? bVar14 : bVarI12;
            List listK8 = C38107c.k(jSONObject, "selected_actions", pVar2, C38577v2.f376675D0, f370579a, eVar);
            com.yandex.div.json.expressions.b bVarI13 = C38107c.i(jSONObject, "tint_color", lVar6, c38106b2, f370579a, null, bVar10);
            DivBlendMode.f371297c.getClass();
            Y41.l<String, DivBlendMode> lVar8 = DivBlendMode.f371298d;
            com.yandex.div.json.expressions.b<DivBlendMode> bVar16 = C38577v2.f376693g0;
            com.yandex.div.json.expressions.b<DivBlendMode> bVarI14 = C38107c.i(jSONObject, "tint_mode", lVar8, c38106b2, f370579a, bVar16, C38577v2.f376702p0);
            com.yandex.div.json.expressions.b<DivBlendMode> bVar17 = bVarI14 == null ? bVar16 : bVarI14;
            DivTooltip.f372130h.getClass();
            List listK9 = C38107c.k(jSONObject, "tooltips", DivTooltip.f372135m, C38577v2.f376676E0, f370579a, eVar);
            C38260a8.f374376d.getClass();
            C38260a8 c38260a8 = (C38260a8) C38107c.g(jSONObject, "transform", C38260a8.f374379g, f370579a, eVar);
            if (c38260a8 == null) {
                c38260a8 = C38577v2.f376694h0;
            }
            C38260a8 c38260a82 = c38260a8;
            T.f373510a.getClass();
            T t12 = (T) C38107c.g(jSONObject, "transition_change", T.f373511b, f370579a, eVar);
            B.f370624a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, B> pVar4 = B.f370625b;
            B b12 = (B) C38107c.g(jSONObject, "transition_in", pVar4, f370579a, eVar);
            B b13 = (B) C38107c.g(jSONObject, "transition_out", pVar4, f370579a, eVar);
            DivTransitionTrigger.f372167c.getClass();
            List listJ = C38107c.j(jSONObject, "transition_triggers", DivTransitionTrigger.f372168d, C38577v2.f376677F0, f370579a);
            DivVisibility.f372192c.getClass();
            Y41.l<String, DivVisibility> lVar9 = DivVisibility.f372193d;
            com.yandex.div.json.expressions.b<DivVisibility> bVar18 = C38577v2.f376695i0;
            com.yandex.div.json.expressions.b<DivVisibility> bVarI15 = C38107c.i(jSONObject, "visibility", lVar9, c38106b2, f370579a, bVar18, C38577v2.f376703q0);
            com.yandex.div.json.expressions.b<DivVisibility> bVar19 = bVarI15 == null ? bVar18 : bVarI15;
            w8.f376942h.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, w8> pVar5 = w8.f376950p;
            w8 w8Var = (w8) C38107c.g(jSONObject, "visibility_action", pVar5, f370579a, eVar);
            List listK10 = C38107c.k(jSONObject, "visibility_actions", pVar5, C38577v2.f376678G0, f370579a, eVar);
            K5.f372712a.getClass();
            K5 k54 = (K5) C38107c.g(jSONObject, "width", K5.f372713b, f370579a, eVar);
            if (k54 == null) {
                k54 = C38577v2.f376696j0;
            }
            return new C38577v2(divAccessibility2, divAction, divAnimation2, listK, bVarI, bVarI2, bVar2, c38303f1, d12, listK2, k13, bVarI4, bVar4, bVar6, listK3, listK4, listK5, listK6, c38567u1, k53, bVar8, str, bVarC, listK7, y03, y05, bVar11, bVar13, bVarI10, bVarI11, bVar15, listK8, bVarI13, bVar17, listK9, c38260a82, t12, b12, b13, listJ, bVar19, w8Var, listK10, k54);
        }

        public i() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i12 = 9;
        com.yandex.div.json.expressions.b bVarI = com.google.firebase.components.g.i(100L, com.yandex.div.json.expressions.b.f370552a);
        com.yandex.div.json.expressions.b bVarA = b.a.a(Double.valueOf(0.6d));
        com.yandex.div.json.expressions.b bVarA2 = b.a.a(DivAnimation.Name.FADE);
        Double dValueOf = Double.valueOf(1.0d);
        com.yandex.div.json.expressions.b bVar = null;
        f376681U = new DivAnimation(bVarI, bVarA, bVar, null, bVarA2, null, null, b.a.a(dValueOf), 108, null);
        f376682V = b.a.a(dValueOf);
        com.yandex.div.json.expressions.b bVar2 = null;
        f376683W = new K(bVar2, null, null, null, null, 31, null);
        f376684X = b.a.a(DivAlignmentHorizontal.CENTER);
        f376685Y = b.a.a(DivAlignmentVertical.CENTER);
        Object[] objArr = null == true ? 1 : 0;
        f376686Z = new K5.e(new y8(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, 7, objArr));
        Boolean bool = Boolean.FALSE;
        f376687a0 = b.a.a(bool);
        Object[] objArr2 = null == true ? 1 : 0;
        Object[] objArr3 = null == true ? 1 : 0;
        Object[] objArr4 = null == true ? 1 : 0;
        f376688b0 = new Y0(objArr4, objArr3, null, objArr2, null, 31, null);
        f376689c0 = new Y0(null, null, bVar, null == true ? 1 : 0, null, 31, null == true ? 1 : 0);
        f376690d0 = b.a.a(335544320);
        f376691e0 = b.a.a(bool);
        f376692f0 = b.a.a(DivImageScale.FILL);
        f376693g0 = b.a.a(DivBlendMode.SOURCE_IN);
        Object[] objArr5 = null == true ? 1 : 0;
        f376694h0 = new C38260a8(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, objArr5);
        f376695i0 = b.a.a(DivVisibility.VISIBLE);
        f376696j0 = new K5.d(new U3(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAlignmentHorizontal.values());
        b bVar3 = b.f376758l;
        aVar.getClass();
        f376697k0 = new com.yandex.div.internal.parser.C(bVar3, objC);
        f376698l0 = new com.yandex.div.internal.parser.C(c.f376759l, C42756l.C(DivAlignmentVertical.values()));
        f376699m0 = new com.yandex.div.internal.parser.C(d.f376760l, C42756l.C(DivAlignmentHorizontal.values()));
        f376700n0 = new com.yandex.div.internal.parser.C(e.f376761l, C42756l.C(DivAlignmentVertical.values()));
        f376701o0 = new com.yandex.div.internal.parser.C(f.f376762l, C42756l.C(DivImageScale.values()));
        f376702p0 = new com.yandex.div.internal.parser.C(g.f376763l, C42756l.C(DivBlendMode.values()));
        f376703q0 = new com.yandex.div.internal.parser.C(h.f376764l, C42756l.C(DivVisibility.values()));
        f376704r0 = new C38450m2(i12);
        f376705s0 = new C38459n2(i12);
        f376706t0 = new C38450m2(10);
        f376707u0 = new C38459n2(5);
        f376708v0 = new C38450m2(11);
        f376709w0 = new C38450m2(12);
        f376710x0 = new C38450m2(13);
        f376711y0 = new C38450m2(14);
        f376712z0 = new C38459n2(6);
        f376672A0 = new C38450m2(15);
        f376673B0 = new C38459n2(7);
        f376674C0 = new C38459n2(8);
        f376675D0 = new C38450m2(16);
        f376676E0 = new C38450m2(17);
        f376677F0 = new C38450m2(18);
        f376678G0 = new C38450m2(19);
        int i13 = a.f376757l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public C38577v2(@Y61.k DivAccessibility divAccessibility, @Y61.l DivAction divAction, @Y61.k DivAnimation divAnimation, @Y61.l List<? extends DivAction> list, @Y61.l com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar, @Y61.l com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar2, @Y61.k com.yandex.div.json.expressions.b<Double> bVar3, @Y61.l C38303f1 c38303f1, @Y61.l D d12, @Y61.l List<? extends F> list2, @Y61.k K k12, @Y61.l com.yandex.div.json.expressions.b<Long> bVar4, @Y61.k com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar5, @Y61.k com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar6, @Y61.l List<? extends S0> list3, @Y61.l List<? extends DivAction> list4, @Y61.l List<? extends C38273c1> list5, @Y61.l List<? extends AbstractC38386j1> list6, @Y61.l C38567u1 c38567u1, @Y61.k K5 k52, @Y61.k com.yandex.div.json.expressions.b<Boolean> bVar7, @Y61.l String str, @Y61.k com.yandex.div.json.expressions.b<Uri> bVar8, @Y61.l List<? extends DivAction> list7, @Y61.k Y0 y02, @Y61.k Y0 y03, @Y61.k com.yandex.div.json.expressions.b<Integer> bVar9, @Y61.k com.yandex.div.json.expressions.b<Boolean> bVar10, @Y61.l com.yandex.div.json.expressions.b<String> bVar11, @Y61.l com.yandex.div.json.expressions.b<Long> bVar12, @Y61.k com.yandex.div.json.expressions.b<DivImageScale> bVar13, @Y61.l List<? extends DivAction> list8, @Y61.l com.yandex.div.json.expressions.b<Integer> bVar14, @Y61.k com.yandex.div.json.expressions.b<DivBlendMode> bVar15, @Y61.l List<? extends DivTooltip> list9, @Y61.k C38260a8 c38260a8, @Y61.l T t12, @Y61.l B b12, @Y61.l B b13, @Y61.l List<? extends DivTransitionTrigger> list10, @Y61.k com.yandex.div.json.expressions.b<DivVisibility> bVar16, @Y61.l w8 w8Var, @Y61.l List<? extends w8> list11, @Y61.k K5 k53) {
        this.f376731a = divAccessibility;
        this.f376732b = divAction;
        this.f376733c = divAnimation;
        this.f376734d = list;
        this.f376735e = bVar;
        this.f376736f = bVar2;
        this.f376737g = bVar3;
        this.f376738h = c38303f1;
        this.f376739i = d12;
        this.f376740j = list2;
        this.f376741k = k12;
        this.f376742l = bVar4;
        this.f376743m = bVar5;
        this.f376744n = bVar6;
        this.f376745o = list3;
        this.f376746p = list4;
        this.f376747q = list5;
        this.f376748r = list6;
        this.f376749s = c38567u1;
        this.f376750t = k52;
        this.f376751u = bVar7;
        this.f376752v = str;
        this.f376753w = bVar8;
        this.f376754x = list7;
        this.f376755y = y02;
        this.f376756z = y03;
        this.f376713A = bVar9;
        this.f376714B = bVar10;
        this.f376715C = bVar11;
        this.f376716D = bVar12;
        this.f376717E = bVar13;
        this.f376718F = list8;
        this.f376719G = bVar14;
        this.f376720H = bVar15;
        this.f376721I = list9;
        this.f376722J = c38260a8;
        this.f376723K = t12;
        this.f376724L = b12;
        this.f376725M = b13;
        this.f376726N = list10;
        this.f376727O = bVar16;
        this.f376728P = w8Var;
        this.f376729Q = list11;
        this.f376730R = k53;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C38260a8 getF375347A() {
        return this.f376722J;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<F> e() {
        return this.f376740j;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> getAlpha() {
        return this.f376737g;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getBorder, reason: from getter */
    public final K getF375363g() {
        return this.f376741k;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getHeight, reason: from getter */
    public final K5 getF375372p() {
        return this.f376750t;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: getId, reason: from getter */
    public final String getF375373q() {
        return this.f376752v;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivVisibility> getVisibility() {
        return this.f376727O;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getWidth, reason: from getter */
    public final K5 getF375356J() {
        return this.f376730R;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivTooltip> i() {
        return this.f376721I;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> j() {
        return this.f376742l;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final Y0 getF375374r() {
        return this.f376755y;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> l() {
        return this.f376716D;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> m() {
        return this.f376735e;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: n, reason: from getter */
    public final B getF375350D() {
        return this.f376725M;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivTransitionTrigger> o() {
        return this.f376726N;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<C38273c1> p() {
        return this.f376747q;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivAction> q() {
        return this.f376718F;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: r, reason: from getter */
    public final B getF375349C() {
        return this.f376724L;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<w8> s() {
        return this.f376729Q;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: t, reason: from getter */
    public final T getF375348B() {
        return this.f376723K;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> u() {
        return this.f376736f;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: v, reason: from getter */
    public final C38567u1 getF375371o() {
        return this.f376749s;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: w, reason: from getter */
    public final DivAccessibility getF375357a() {
        return this.f376731a;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: x, reason: from getter */
    public final Y0 getF375376t() {
        return this.f376756z;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: y, reason: from getter */
    public final w8 getF375354H() {
        return this.f376728P;
    }

    public /* synthetic */ C38577v2(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, C38303f1 c38303f1, D d12, List list2, K k12, com.yandex.div.json.expressions.b bVar4, com.yandex.div.json.expressions.b bVar5, com.yandex.div.json.expressions.b bVar6, List list3, List list4, List list5, List list6, C38567u1 c38567u1, K5 k52, com.yandex.div.json.expressions.b bVar7, String str, com.yandex.div.json.expressions.b bVar8, List list7, Y0 y02, Y0 y03, com.yandex.div.json.expressions.b bVar9, com.yandex.div.json.expressions.b bVar10, com.yandex.div.json.expressions.b bVar11, com.yandex.div.json.expressions.b bVar12, com.yandex.div.json.expressions.b bVar13, List list8, com.yandex.div.json.expressions.b bVar14, com.yandex.div.json.expressions.b bVar15, List list9, C38260a8 c38260a8, T t12, B b12, B b13, List list10, com.yandex.div.json.expressions.b bVar16, w8 w8Var, List list11, K5 k53, int i12, int i13, C42822w c42822w) {
        this((i12 & 1) != 0 ? f376680T : divAccessibility, (i12 & 2) != 0 ? null : divAction, (i12 & 4) != 0 ? f376681U : divAnimation, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : bVar, (i12 & 32) != 0 ? null : bVar2, (i12 & 64) != 0 ? f376682V : bVar3, (i12 & 128) != 0 ? null : c38303f1, (i12 & 256) != 0 ? null : d12, (i12 & 512) != 0 ? null : list2, (i12 & 1024) != 0 ? f376683W : k12, (i12 & 2048) != 0 ? null : bVar4, (i12 & 4096) != 0 ? f376684X : bVar5, (i12 & 8192) != 0 ? f376685Y : bVar6, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list3, (32768 & i12) != 0 ? null : list4, (65536 & i12) != 0 ? null : list5, (131072 & i12) != 0 ? null : list6, (262144 & i12) != 0 ? null : c38567u1, (524288 & i12) != 0 ? f376686Z : k52, (1048576 & i12) != 0 ? f376687a0 : bVar7, (2097152 & i12) != 0 ? null : str, bVar8, (8388608 & i12) != 0 ? null : list7, (16777216 & i12) != 0 ? f376688b0 : y02, (33554432 & i12) != 0 ? f376689c0 : y03, (67108864 & i12) != 0 ? f376690d0 : bVar9, (134217728 & i12) != 0 ? f376691e0 : bVar10, (268435456 & i12) != 0 ? null : bVar11, (536870912 & i12) != 0 ? null : bVar12, (1073741824 & i12) != 0 ? f376692f0 : bVar13, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : list8, (i13 & 1) != 0 ? null : bVar14, (i13 & 2) != 0 ? f376693g0 : bVar15, (i13 & 4) != 0 ? null : list9, (i13 & 8) != 0 ? f376694h0 : c38260a8, (i13 & 16) != 0 ? null : t12, (i13 & 32) != 0 ? null : b12, (i13 & 64) != 0 ? null : b13, (i13 & 128) != 0 ? null : list10, (i13 & 256) != 0 ? f376695i0 : bVar16, (i13 & 512) != 0 ? null : w8Var, (i13 & 1024) != 0 ? null : list11, (i13 & 2048) != 0 ? f376696j0 : k53);
    }
}
