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

/* compiled from: DivGifImage.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/O1;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div2/H;", "h", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class O1 implements com.yandex.div.json.b, H {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public static final h f373047N = new h(null);

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public static final DivAccessibility f373048O = new DivAccessibility(null, null, null, null, null, null, 63, null);

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public static final DivAnimation f373049P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f373050Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public static final K f373051R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f373052S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivAlignmentVertical> f373053T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public static final K5.e f373054U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public static final Y0 f373055V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public static final Y0 f373056W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Integer> f373057X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Boolean> f373058Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivImageScale> f373059Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public static final C38260a8 f373060a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivVisibility> f373061b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public static final K5.d f373062c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f373063d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f373064e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f373065f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f373066g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f373067h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f373068i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373069j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public static final F1 f373070k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373071l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final F1 f373072m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373073n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373074o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373075p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public static final F1 f373076q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373077r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final F1 f373078s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final F1 f373079t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373080u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373081v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373082w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final E1 f373083x0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f373084A;

    /* renamed from: B, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivImageScale> f373085B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public final List<DivAction> f373086C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public final List<DivTooltip> f373087D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final C38260a8 f373088E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final T f373089F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final B f373090G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final B f373091H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public final List<DivTransitionTrigger> f373092I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivVisibility> f373093J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public final w8 f373094K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public final List<w8> f373095L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final K5 f373096M;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DivAccessibility f373097a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final DivAction f373098b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final DivAnimation f373099c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f373100d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f373101e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> f373102f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> f373103g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final D f373104h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final List<F> f373105i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final K f373106j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f373107k;

    /* renamed from: l, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f373108l;

    /* renamed from: m, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> f373109m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final List<S0> f373110n;

    /* renamed from: o, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f373111o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final List<C38273c1> f373112p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final C38567u1 f373113q;

    /* renamed from: r, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Uri> f373114r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final K5 f373115s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final String f373116t;

    /* renamed from: u, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f373117u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final Y0 f373118v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final Y0 f373119w;

    /* renamed from: x, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Integer> f373120x;

    /* renamed from: y, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Boolean> f373121y;

    /* renamed from: z, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<String> f373122z;

    /* compiled from: DivGifImage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/O1;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/O1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, O1> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f373123l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final O1 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            O1.f373047N.getClass();
            return h.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivGifImage.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f373124l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivGifImage.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f373125l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivGifImage.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f373126l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivGifImage.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f373127l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivGifImage.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f373128l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivImageScale);
        }
    }

    /* compiled from: DivGifImage.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f373129l = new g();

        public g() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivGifImage.kt */
    @Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\nR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\nR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\nR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0014R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0014R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\nR\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0011R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0011R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020*0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0014R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020*0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0014R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0014R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0014R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0011R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\nR\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\nR\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\nR\u0014\u0010D\u001a\u00020*8\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001e0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020 0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010HR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001e0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020 0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010HR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020:0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010HR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010HR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010\nR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020M0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u0011R\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lcom/yandex/div2/O1$h;", "", "<init>", "()V", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAnimation;", "ACTION_ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/expressions/b;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/F;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/K;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/K;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAlignmentHorizontal;", "CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivAlignmentVertical;", "CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE", "Lcom/yandex/div2/S0;", "DISAPPEAR_ACTIONS_VALIDATOR", "DOUBLETAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/c1;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/K5$e;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/K5$e;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "LONGTAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/Y0;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/Y0;", "PADDINGS_DEFAULT_VALUE", "", "PLACEHOLDER_COLOR_DEFAULT_VALUE", "", "PRELOAD_REQUIRED_DEFAULT_VALUE", "PREVIEW_TEMPLATE_VALIDATOR", "PREVIEW_VALIDATOR", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivImageScale;", "SCALE_DEFAULT_VALUE", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/a8;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/a8;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL", "TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL", "TYPE_HELPER_SCALE", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/w8;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class h {
        public /* synthetic */ h(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static O1 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            DivAccessibility.f371175f.getClass();
            DivAccessibility divAccessibility = (DivAccessibility) C38107c.g(jSONObject, "accessibility", DivAccessibility.f371182m, f370579a, eVar);
            if (divAccessibility == null) {
                divAccessibility = O1.f373048O;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            DivAction.f371211f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, DivAction> pVar = DivAction.f371215j;
            DivAction divAction = (DivAction) C38107c.g(jSONObject, "action", pVar, f370579a, eVar);
            DivAnimation.f371255h.getClass();
            DivAnimation divAnimation = (DivAnimation) C38107c.g(jSONObject, "action_animation", DivAnimation.f371264q, f370579a, eVar);
            if (divAnimation == null) {
                divAnimation = O1.f373049P;
            }
            DivAnimation divAnimation2 = divAnimation;
            List listK = C38107c.k(jSONObject, "actions", pVar, O1.f373069j0, f370579a, eVar);
            DivAlignmentHorizontal.f371238c.getClass();
            Y41.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.f371239d;
            com.yandex.div.internal.parser.C c12 = O1.f373063d0;
            C38106b c38106b = C38107c.f370139a;
            com.yandex.div.json.expressions.b bVarI = C38107c.i(jSONObject, "alignment_horizontal", lVar, c38106b, f370579a, null, c12);
            DivAlignmentVertical.f371246c.getClass();
            Y41.l<String, DivAlignmentVertical> lVar2 = DivAlignmentVertical.f371247d;
            com.yandex.div.json.expressions.b bVarI2 = C38107c.i(jSONObject, "alignment_vertical", lVar2, c38106b, f370579a, null, O1.f373064e0);
            Y41.l<Number, Double> lVar3 = com.yandex.div.internal.parser.y.f370150d;
            F1 f12 = O1.f373070k0;
            com.yandex.div.json.expressions.b<Double> bVar = O1.f373050Q;
            com.yandex.div.json.expressions.b<Double> bVarI3 = C38107c.i(jSONObject, "alpha", lVar3, f12, f370579a, bVar, com.yandex.div.internal.parser.E.f370134d);
            com.yandex.div.json.expressions.b<Double> bVar2 = bVarI3 == null ? bVar : bVarI3;
            D.f371163b.getClass();
            D d12 = (D) C38107c.g(jSONObject, "aspect", D.f371165d, f370579a, eVar);
            F.f372262a.getClass();
            List listK2 = C38107c.k(jSONObject, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, F.f372263b, O1.f373071l0, f370579a, eVar);
            K.f372635f.getClass();
            K k12 = (K) C38107c.g(jSONObject, "border", K.f372638i, f370579a, eVar);
            if (k12 == null) {
                k12 = O1.f373051R;
            }
            K k13 = k12;
            Y41.l<Number, Long> lVar4 = com.yandex.div.internal.parser.y.f370151e;
            F1 f13 = O1.f373072m0;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            com.yandex.div.json.expressions.b bVarI4 = C38107c.i(jSONObject, "column_span", lVar4, f13, f370579a, null, dVar);
            com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar3 = O1.f373052S;
            com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVarI5 = C38107c.i(jSONObject, "content_alignment_horizontal", lVar, c38106b, f370579a, bVar3, O1.f373065f0);
            com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar4 = bVarI5 == null ? bVar3 : bVarI5;
            com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar5 = O1.f373053T;
            com.yandex.div.json.expressions.b<DivAlignmentVertical> bVarI6 = C38107c.i(jSONObject, "content_alignment_vertical", lVar2, c38106b, f370579a, bVar5, O1.f373066g0);
            com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar6 = bVarI6 == null ? bVar5 : bVarI6;
            S0.f373492a.getClass();
            List listK3 = C38107c.k(jSONObject, "disappear_actions", S0.f373500i, O1.f373073n0, f370579a, eVar);
            List listK4 = C38107c.k(jSONObject, "doubletap_actions", pVar, O1.f373074o0, f370579a, eVar);
            C38273c1.f374687c.getClass();
            List listK5 = C38107c.k(jSONObject, AttachMenuItem.File.EXTENSIONS, C38273c1.f374689e, O1.f373075p0, f370579a, eVar);
            C38567u1.f376619f.getClass();
            C38567u1 c38567u1 = (C38567u1) C38107c.g(jSONObject, "focus", C38567u1.f376624k, f370579a, eVar);
            com.yandex.div.json.expressions.b bVarC = C38107c.c(jSONObject, "gif_url", com.yandex.div.internal.parser.y.f370148b, c38106b, f370579a, com.yandex.div.internal.parser.E.f370135e);
            K5.f372712a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, K5> pVar2 = K5.f372713b;
            K5 k52 = (K5) C38107c.g(jSONObject, "height", pVar2, f370579a, eVar);
            if (k52 == null) {
                k52 = O1.f373054U;
            }
            K5 k53 = k52;
            F1 f14 = O1.f373076q0;
            C38105a c38105a = C38107c.f370141c;
            String str = (String) C38107c.h(jSONObject, "id", c38105a, f14, f370579a);
            List listK6 = C38107c.k(jSONObject, "longtap_actions", pVar, O1.f373077r0, f370579a, eVar);
            Y0.f374024f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, Y0> pVar3 = Y0.f374035q;
            Y0 y02 = (Y0) C38107c.g(jSONObject, "margins", pVar3, f370579a, eVar);
            if (y02 == null) {
                y02 = O1.f373055V;
            }
            Y0 y03 = y02;
            Y0 y04 = (Y0) C38107c.g(jSONObject, "paddings", pVar3, f370579a, eVar);
            if (y04 == null) {
                y04 = O1.f373056W;
            }
            Y0 y05 = y04;
            Y41.l<Object, Integer> lVar5 = com.yandex.div.internal.parser.y.f370147a;
            com.yandex.div.json.expressions.b<Integer> bVar7 = O1.f373057X;
            com.yandex.div.json.expressions.b<Integer> bVarI7 = C38107c.i(jSONObject, "placeholder_color", lVar5, c38106b, f370579a, bVar7, com.yandex.div.internal.parser.E.f370136f);
            com.yandex.div.json.expressions.b<Integer> bVar8 = bVarI7 == null ? bVar7 : bVarI7;
            Y41.l<Object, Boolean> lVar6 = com.yandex.div.internal.parser.y.f370149c;
            com.yandex.div.json.expressions.b<Boolean> bVar9 = O1.f373058Y;
            com.yandex.div.json.expressions.b<Boolean> bVarI8 = C38107c.i(jSONObject, "preload_required", lVar6, c38106b, f370579a, bVar9, com.yandex.div.internal.parser.E.f370131a);
            com.yandex.div.json.expressions.b<Boolean> bVar10 = bVarI8 == null ? bVar9 : bVarI8;
            com.yandex.div.json.expressions.b bVarI9 = C38107c.i(jSONObject, MessageSuggest.PREVIEW, c38105a, O1.f373078s0, f370579a, null, com.yandex.div.internal.parser.E.f370133c);
            com.yandex.div.json.expressions.b bVarI10 = C38107c.i(jSONObject, "row_span", lVar4, O1.f373079t0, f370579a, null, dVar);
            DivImageScale.f371558c.getClass();
            Y41.l<String, DivImageScale> lVar7 = DivImageScale.f371559d;
            com.yandex.div.json.expressions.b<DivImageScale> bVar11 = O1.f373059Z;
            com.yandex.div.json.expressions.b<DivImageScale> bVarI11 = C38107c.i(jSONObject, "scale", lVar7, c38106b, f370579a, bVar11, O1.f373067h0);
            com.yandex.div.json.expressions.b<DivImageScale> bVar12 = bVarI11 == null ? bVar11 : bVarI11;
            DivAction.f371211f.getClass();
            List listK7 = C38107c.k(jSONObject, "selected_actions", DivAction.f371215j, O1.f373080u0, f370579a, eVar);
            DivTooltip.f372130h.getClass();
            List listK8 = C38107c.k(jSONObject, "tooltips", DivTooltip.f372135m, O1.f373081v0, f370579a, eVar);
            C38260a8.f374376d.getClass();
            C38260a8 c38260a8 = (C38260a8) C38107c.g(jSONObject, "transform", C38260a8.f374379g, f370579a, eVar);
            if (c38260a8 == null) {
                c38260a8 = O1.f373060a0;
            }
            C38260a8 c38260a82 = c38260a8;
            T.f373510a.getClass();
            T t12 = (T) C38107c.g(jSONObject, "transition_change", T.f373511b, f370579a, eVar);
            B.f370624a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, B> pVar4 = B.f370625b;
            B b12 = (B) C38107c.g(jSONObject, "transition_in", pVar4, f370579a, eVar);
            B b13 = (B) C38107c.g(jSONObject, "transition_out", pVar4, f370579a, eVar);
            DivTransitionTrigger.f372167c.getClass();
            List listJ = C38107c.j(jSONObject, "transition_triggers", DivTransitionTrigger.f372168d, O1.f373082w0, f370579a);
            DivVisibility.f372192c.getClass();
            Y41.l<String, DivVisibility> lVar8 = DivVisibility.f372193d;
            com.yandex.div.json.expressions.b<DivVisibility> bVar13 = O1.f373061b0;
            com.yandex.div.json.expressions.b<DivVisibility> bVarI12 = C38107c.i(jSONObject, "visibility", lVar8, c38106b, f370579a, bVar13, O1.f373068i0);
            com.yandex.div.json.expressions.b<DivVisibility> bVar14 = bVarI12 == null ? bVar13 : bVarI12;
            w8.f376942h.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, w8> pVar5 = w8.f376950p;
            w8 w8Var = (w8) C38107c.g(jSONObject, "visibility_action", pVar5, f370579a, eVar);
            List listK9 = C38107c.k(jSONObject, "visibility_actions", pVar5, O1.f373083x0, f370579a, eVar);
            K5 k54 = (K5) C38107c.g(jSONObject, "width", pVar2, f370579a, eVar);
            if (k54 == null) {
                k54 = O1.f373062c0;
            }
            return new O1(divAccessibility2, divAction, divAnimation2, listK, bVarI, bVarI2, bVar2, d12, listK2, k13, bVarI4, bVar4, bVar6, listK3, listK4, listK5, c38567u1, bVarC, k53, str, listK6, y03, y05, bVar8, bVar10, bVarI9, bVarI10, bVar12, listK7, listK8, c38260a82, t12, b12, b13, listJ, bVar14, w8Var, listK9, k54);
        }

        public h() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        com.yandex.div.json.expressions.b bVarI = com.google.firebase.components.g.i(100L, com.yandex.div.json.expressions.b.f370552a);
        com.yandex.div.json.expressions.b bVarA = b.a.a(Double.valueOf(0.6d));
        com.yandex.div.json.expressions.b bVarA2 = b.a.a(DivAnimation.Name.FADE);
        Double dValueOf = Double.valueOf(1.0d);
        com.yandex.div.json.expressions.b bVar = null;
        f373049P = new DivAnimation(bVarI, bVarA, bVar, null, bVarA2, null, null, b.a.a(dValueOf), 108, null);
        f373050Q = b.a.a(dValueOf);
        f373051R = new K(null, null, null, null, null, 31, null);
        f373052S = b.a.a(DivAlignmentHorizontal.CENTER);
        f373053T = b.a.a(DivAlignmentVertical.CENTER);
        Object[] objArr = null == true ? 1 : 0;
        f373054U = new K5.e(new y8(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, objArr));
        f373055V = new Y0(null, null, null, null, bVar, 31, null);
        Object[] objArr2 = null == true ? 1 : 0;
        f373056W = new Y0(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null, objArr2, 31, null);
        f373057X = b.a.a(335544320);
        f373058Y = b.a.a(Boolean.FALSE);
        f373059Z = b.a.a(DivImageScale.FILL);
        Object[] objArr3 = null == true ? 1 : 0;
        f373060a0 = new C38260a8(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, objArr3);
        f373061b0 = b.a.a(DivVisibility.VISIBLE);
        f373062c0 = new K5.d(new U3(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAlignmentHorizontal.values());
        b bVar2 = b.f373124l;
        aVar.getClass();
        f373063d0 = new com.yandex.div.internal.parser.C(bVar2, objC);
        f373064e0 = new com.yandex.div.internal.parser.C(c.f373125l, C42756l.C(DivAlignmentVertical.values()));
        f373065f0 = new com.yandex.div.internal.parser.C(d.f373126l, C42756l.C(DivAlignmentHorizontal.values()));
        f373066g0 = new com.yandex.div.internal.parser.C(e.f373127l, C42756l.C(DivAlignmentVertical.values()));
        f373067h0 = new com.yandex.div.internal.parser.C(f.f373128l, C42756l.C(DivImageScale.values()));
        f373068i0 = new com.yandex.div.internal.parser.C(g.f373129l, C42756l.C(DivVisibility.values()));
        f373069j0 = new E1(6);
        f373070k0 = new F1(9);
        f373071l0 = new E1(7);
        f373072m0 = new F1(5);
        f373073n0 = new E1(8);
        f373074o0 = new E1(9);
        f373075p0 = new E1(10);
        f373076q0 = new F1(6);
        f373077r0 = new E1(11);
        f373078s0 = new F1(7);
        f373079t0 = new F1(8);
        f373080u0 = new E1(12);
        f373081v0 = new E1(13);
        f373082w0 = new E1(14);
        f373083x0 = new E1(15);
        int i12 = a.f373123l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public O1(@Y61.k DivAccessibility divAccessibility, @Y61.l DivAction divAction, @Y61.k DivAnimation divAnimation, @Y61.l List<? extends DivAction> list, @Y61.l com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar, @Y61.l com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar2, @Y61.k com.yandex.div.json.expressions.b<Double> bVar3, @Y61.l D d12, @Y61.l List<? extends F> list2, @Y61.k K k12, @Y61.l com.yandex.div.json.expressions.b<Long> bVar4, @Y61.k com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar5, @Y61.k com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar6, @Y61.l List<? extends S0> list3, @Y61.l List<? extends DivAction> list4, @Y61.l List<? extends C38273c1> list5, @Y61.l C38567u1 c38567u1, @Y61.k com.yandex.div.json.expressions.b<Uri> bVar7, @Y61.k K5 k52, @Y61.l String str, @Y61.l List<? extends DivAction> list6, @Y61.k Y0 y02, @Y61.k Y0 y03, @Y61.k com.yandex.div.json.expressions.b<Integer> bVar8, @Y61.k com.yandex.div.json.expressions.b<Boolean> bVar9, @Y61.l com.yandex.div.json.expressions.b<String> bVar10, @Y61.l com.yandex.div.json.expressions.b<Long> bVar11, @Y61.k com.yandex.div.json.expressions.b<DivImageScale> bVar12, @Y61.l List<? extends DivAction> list7, @Y61.l List<? extends DivTooltip> list8, @Y61.k C38260a8 c38260a8, @Y61.l T t12, @Y61.l B b12, @Y61.l B b13, @Y61.l List<? extends DivTransitionTrigger> list9, @Y61.k com.yandex.div.json.expressions.b<DivVisibility> bVar13, @Y61.l w8 w8Var, @Y61.l List<? extends w8> list10, @Y61.k K5 k53) {
        this.f373097a = divAccessibility;
        this.f373098b = divAction;
        this.f373099c = divAnimation;
        this.f373100d = list;
        this.f373101e = bVar;
        this.f373102f = bVar2;
        this.f373103g = bVar3;
        this.f373104h = d12;
        this.f373105i = list2;
        this.f373106j = k12;
        this.f373107k = bVar4;
        this.f373108l = bVar5;
        this.f373109m = bVar6;
        this.f373110n = list3;
        this.f373111o = list4;
        this.f373112p = list5;
        this.f373113q = c38567u1;
        this.f373114r = bVar7;
        this.f373115s = k52;
        this.f373116t = str;
        this.f373117u = list6;
        this.f373118v = y02;
        this.f373119w = y03;
        this.f373120x = bVar8;
        this.f373121y = bVar9;
        this.f373122z = bVar10;
        this.f373084A = bVar11;
        this.f373085B = bVar12;
        this.f373086C = list7;
        this.f373087D = list8;
        this.f373088E = c38260a8;
        this.f373089F = t12;
        this.f373090G = b12;
        this.f373091H = b13;
        this.f373092I = list9;
        this.f373093J = bVar13;
        this.f373094K = w8Var;
        this.f373095L = list10;
        this.f373096M = k53;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C38260a8 getF374805A() {
        return this.f373088E;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<F> e() {
        return this.f373105i;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> getAlpha() {
        return this.f373103g;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getBorder, reason: from getter */
    public final K getF374822i() {
        return this.f373106j;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getHeight, reason: from getter */
    public final K5 getF374831r() {
        return this.f373115s;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: getId, reason: from getter */
    public final String getF374832s() {
        return this.f373116t;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivVisibility> getVisibility() {
        return this.f373093J;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getWidth, reason: from getter */
    public final K5 getF374813I() {
        return this.f373096M;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivTooltip> i() {
        return this.f373087D;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> j() {
        return this.f373107k;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final Y0 getF374835v() {
        return this.f373118v;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> l() {
        return this.f373084A;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> m() {
        return this.f373101e;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: n, reason: from getter */
    public final B getF374808D() {
        return this.f373091H;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivTransitionTrigger> o() {
        return this.f373092I;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<C38273c1> p() {
        return this.f373112p;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivAction> q() {
        return this.f373086C;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: r, reason: from getter */
    public final B getF374807C() {
        return this.f373090G;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<w8> s() {
        return this.f373095L;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: t, reason: from getter */
    public final T getF374806B() {
        return this.f373089F;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> u() {
        return this.f373102f;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: v, reason: from getter */
    public final C38567u1 getF374830q() {
        return this.f373113q;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: w, reason: from getter */
    public final DivAccessibility getF374814a() {
        return this.f373097a;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: x, reason: from getter */
    public final Y0 getF374836w() {
        return this.f373119w;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: y, reason: from getter */
    public final w8 getF374811G() {
        return this.f373094K;
    }

    public /* synthetic */ O1(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, D d12, List list2, K k12, com.yandex.div.json.expressions.b bVar4, com.yandex.div.json.expressions.b bVar5, com.yandex.div.json.expressions.b bVar6, List list3, List list4, List list5, C38567u1 c38567u1, com.yandex.div.json.expressions.b bVar7, K5 k52, String str, List list6, Y0 y02, Y0 y03, com.yandex.div.json.expressions.b bVar8, com.yandex.div.json.expressions.b bVar9, com.yandex.div.json.expressions.b bVar10, com.yandex.div.json.expressions.b bVar11, com.yandex.div.json.expressions.b bVar12, List list7, List list8, C38260a8 c38260a8, T t12, B b12, B b13, List list9, com.yandex.div.json.expressions.b bVar13, w8 w8Var, List list10, K5 k53, int i12, int i13, C42822w c42822w) {
        this((i12 & 1) != 0 ? f373048O : divAccessibility, (i12 & 2) != 0 ? null : divAction, (i12 & 4) != 0 ? f373049P : divAnimation, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : bVar, (i12 & 32) != 0 ? null : bVar2, (i12 & 64) != 0 ? f373050Q : bVar3, (i12 & 128) != 0 ? null : d12, (i12 & 256) != 0 ? null : list2, (i12 & 512) != 0 ? f373051R : k12, (i12 & 1024) != 0 ? null : bVar4, (i12 & 2048) != 0 ? f373052S : bVar5, (i12 & 4096) != 0 ? f373053T : bVar6, (i12 & 8192) != 0 ? null : list3, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list4, (32768 & i12) != 0 ? null : list5, (65536 & i12) != 0 ? null : c38567u1, bVar7, (262144 & i12) != 0 ? f373054U : k52, (524288 & i12) != 0 ? null : str, (1048576 & i12) != 0 ? null : list6, (2097152 & i12) != 0 ? f373055V : y02, (4194304 & i12) != 0 ? f373056W : y03, (8388608 & i12) != 0 ? f373057X : bVar8, (16777216 & i12) != 0 ? f373058Y : bVar9, (33554432 & i12) != 0 ? null : bVar10, (67108864 & i12) != 0 ? null : bVar11, (134217728 & i12) != 0 ? f373059Z : bVar12, (268435456 & i12) != 0 ? null : list7, (536870912 & i12) != 0 ? null : list8, (1073741824 & i12) != 0 ? f373060a0 : c38260a8, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : t12, (i13 & 1) != 0 ? null : b12, (i13 & 2) != 0 ? null : b13, (i13 & 4) != 0 ? null : list9, (i13 & 8) != 0 ? f373061b0 : bVar13, (i13 & 16) != 0 ? null : w8Var, (i13 & 32) != 0 ? null : list10, (i13 & 64) != 0 ? f373062c0 : k53);
    }
}
