package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
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

/* compiled from: DivContainer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div2/DivContainer;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div2/H;", "i", "LayoutMode", "Orientation", "j", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class DivContainer implements com.yandex.div.json.b, H {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public static final i f371308N = new i(null);

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public static final DivAccessibility f371309O = new DivAccessibility(null, null, null, null, null, null, 63, null);

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public static final DivAnimation f371310P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f371311Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public static final K f371312R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivContentAlignmentHorizontal> f371313S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivContentAlignmentVertical> f371314T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public static final K5.e f371315U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<LayoutMode> f371316V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public static final Y0 f371317W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Orientation> f371318X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public static final Y0 f371319Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public static final C38260a8 f371320Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivVisibility> f371321a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public static final K5.d f371322b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371323c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371324d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371325e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371326f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371327g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371328h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371329i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public static final C38491p f371330j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public static final C38574v f371331k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final C38491p f371332l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final C38574v f371333m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final C38491p f371334n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final C38491p f371335o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public static final C38491p f371336p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public static final C38574v f371337q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final C38491p f371338r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final C38491p f371339s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final C38574v f371340t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final C38491p f371341u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final C38491p f371342v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final C38491p f371343w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final C38491p f371344x0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f371345A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final List<DivAction> f371346B;

    /* renamed from: C, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final j f371347C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public final List<DivTooltip> f371348D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final C38260a8 f371349E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final T f371350F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final B f371351G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final B f371352H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public final List<DivTransitionTrigger> f371353I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivVisibility> f371354J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public final w8 f371355K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public final List<w8> f371356L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final K5 f371357M;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DivAccessibility f371358a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final DivAction f371359b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final DivAnimation f371360c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f371361d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f371362e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> f371363f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> f371364g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final D f371365h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final List<F> f371366i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final K f371367j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f371368k;

    /* renamed from: l, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivContentAlignmentHorizontal> f371369l;

    /* renamed from: m, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivContentAlignmentVertical> f371370m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final List<S0> f371371n;

    /* renamed from: o, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f371372o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final List<C38273c1> f371373p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final C38567u1 f371374q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final K5 f371375r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final String f371376s;

    /* renamed from: t, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final List<AbstractC38330g> f371377t;

    /* renamed from: u, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<LayoutMode> f371378u;

    /* renamed from: v, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final j f371379v;

    /* renamed from: w, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f371380w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final Y0 f371381x;

    /* renamed from: y, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Orientation> f371382y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final Y0 f371383z;

    /* compiled from: DivContainer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivContainer$LayoutMode;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum LayoutMode {
        NO_WRAP("no_wrap"),
        WRAP("wrap");


        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f371384c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Y41.l<String, LayoutMode> f371385d = a.f371390l;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f371389b;

        /* compiled from: DivContainer.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivContainer$LayoutMode;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, LayoutMode> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f371390l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final LayoutMode invoke(String str) {
                String str2 = str;
                LayoutMode layoutMode = LayoutMode.NO_WRAP;
                if (str2.equals("no_wrap")) {
                    return layoutMode;
                }
                LayoutMode layoutMode2 = LayoutMode.WRAP;
                if (str2.equals("wrap")) {
                    return layoutMode2;
                }
                return null;
            }
        }

        /* compiled from: DivContainer.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivContainer$LayoutMode$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        LayoutMode(String str) {
            this.f371389b = str;
        }
    }

    /* compiled from: DivContainer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivContainer$Orientation;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Orientation {
        VERTICAL("vertical"),
        HORIZONTAL("horizontal"),
        OVERLAP("overlap");


        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f371391c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Y41.l<String, Orientation> f371392d = a.f371398l;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f371397b;

        /* compiled from: DivContainer.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivContainer$Orientation;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, Orientation> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f371398l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final Orientation invoke(String str) {
                String str2 = str;
                Orientation orientation = Orientation.VERTICAL;
                if (str2.equals("vertical")) {
                    return orientation;
                }
                Orientation orientation2 = Orientation.HORIZONTAL;
                if (str2.equals("horizontal")) {
                    return orientation2;
                }
                Orientation orientation3 = Orientation.OVERLAP;
                if (str2.equals("overlap")) {
                    return orientation3;
                }
                return null;
            }
        }

        /* compiled from: DivContainer.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivContainer$Orientation$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        Orientation(String str) {
            this.f371397b = str;
        }
    }

    /* compiled from: DivContainer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivContainer;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivContainer;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, DivContainer> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f371399l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final DivContainer invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            DivContainer.f371308N.getClass();
            return i.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivContainer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f371400l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivContainer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f371401l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivContainer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f371402l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivContentAlignmentHorizontal);
        }
    }

    /* compiled from: DivContainer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f371403l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivContentAlignmentVertical);
        }
    }

    /* compiled from: DivContainer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f371404l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof LayoutMode);
        }
    }

    /* compiled from: DivContainer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f371405l = new g();

        public g() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Orientation);
        }
    }

    /* compiled from: DivContainer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f371406l = new h();

        public h() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivContainer.kt */
    @Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\nR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\nR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\nR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0014R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0014R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\nR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0011R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\nR\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0011R\u0014\u00107\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0014R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0014R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\nR\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\nR\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\nR\u0014\u0010B\u001a\u00020*8\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020H0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001e0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010GR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020 0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010GR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020/0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010GR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u0002050D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010GR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020N0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010GR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010\nR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020N0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010\u0011R\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006V"}, d2 = {"Lcom/yandex/div2/DivContainer$i;", "", "<init>", "()V", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAnimation;", "ACTION_ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/expressions/b;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/F;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/K;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/K;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivContentAlignmentHorizontal;", "CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE", "Lcom/yandex/div2/DivContentAlignmentVertical;", "CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE", "Lcom/yandex/div2/S0;", "DISAPPEAR_ACTIONS_VALIDATOR", "DOUBLETAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/c1;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/K5$e;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/K5$e;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/g;", "ITEMS_VALIDATOR", "Lcom/yandex/div2/DivContainer$LayoutMode;", "LAYOUT_MODE_DEFAULT_VALUE", "LONGTAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/Y0;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/Y0;", "Lcom/yandex/div2/DivContainer$Orientation;", "ORIENTATION_DEFAULT_VALUE", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/a8;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/a8;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL", "TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL", "TYPE_HELPER_LAYOUT_MODE", "TYPE_HELPER_ORIENTATION", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/w8;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class i {
        public /* synthetic */ i(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static DivContainer a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            DivAccessibility.f371175f.getClass();
            DivAccessibility divAccessibility = (DivAccessibility) C38107c.g(jSONObject, "accessibility", DivAccessibility.f371182m, f370579a, eVar);
            if (divAccessibility == null) {
                divAccessibility = DivContainer.f371309O;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            DivAction.f371211f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, DivAction> pVar = DivAction.f371215j;
            DivAction divAction = (DivAction) C38107c.g(jSONObject, "action", pVar, f370579a, eVar);
            DivAnimation.f371255h.getClass();
            DivAnimation divAnimation = (DivAnimation) C38107c.g(jSONObject, "action_animation", DivAnimation.f371264q, f370579a, eVar);
            if (divAnimation == null) {
                divAnimation = DivContainer.f371310P;
            }
            DivAnimation divAnimation2 = divAnimation;
            List listK = C38107c.k(jSONObject, "actions", pVar, DivContainer.f371330j0, f370579a, eVar);
            DivAlignmentHorizontal.f371238c.getClass();
            Y41.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.f371239d;
            com.yandex.div.internal.parser.C c12 = DivContainer.f371323c0;
            C38106b c38106b = C38107c.f370139a;
            com.yandex.div.json.expressions.b bVarI = C38107c.i(jSONObject, "alignment_horizontal", lVar, c38106b, f370579a, null, c12);
            DivAlignmentVertical.f371246c.getClass();
            com.yandex.div.json.expressions.b bVarI2 = C38107c.i(jSONObject, "alignment_vertical", DivAlignmentVertical.f371247d, c38106b, f370579a, null, DivContainer.f371324d0);
            Y41.l<Number, Double> lVar2 = com.yandex.div.internal.parser.y.f370150d;
            C38574v c38574v = DivContainer.f371331k0;
            com.yandex.div.json.expressions.b<Double> bVar = DivContainer.f371311Q;
            com.yandex.div.json.expressions.b<Double> bVarI3 = C38107c.i(jSONObject, "alpha", lVar2, c38574v, f370579a, bVar, com.yandex.div.internal.parser.E.f370134d);
            com.yandex.div.json.expressions.b<Double> bVar2 = bVarI3 == null ? bVar : bVarI3;
            D.f371163b.getClass();
            D d12 = (D) C38107c.g(jSONObject, "aspect", D.f371165d, f370579a, eVar);
            F.f372262a.getClass();
            List listK2 = C38107c.k(jSONObject, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, F.f372263b, DivContainer.f371332l0, f370579a, eVar);
            K.f372635f.getClass();
            K k12 = (K) C38107c.g(jSONObject, "border", K.f372638i, f370579a, eVar);
            if (k12 == null) {
                k12 = DivContainer.f371312R;
            }
            K k13 = k12;
            Y41.l<Number, Long> lVar3 = com.yandex.div.internal.parser.y.f370151e;
            C38574v c38574v2 = DivContainer.f371333m0;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            com.yandex.div.json.expressions.b bVarI4 = C38107c.i(jSONObject, "column_span", lVar3, c38574v2, f370579a, null, dVar);
            DivContentAlignmentHorizontal.f371417c.getClass();
            Y41.l<String, DivContentAlignmentHorizontal> lVar4 = DivContentAlignmentHorizontal.f371418d;
            com.yandex.div.json.expressions.b<DivContentAlignmentHorizontal> bVar3 = DivContainer.f371313S;
            com.yandex.div.json.expressions.b<DivContentAlignmentHorizontal> bVarI5 = C38107c.i(jSONObject, "content_alignment_horizontal", lVar4, c38106b, f370579a, bVar3, DivContainer.f371325e0);
            com.yandex.div.json.expressions.b<DivContentAlignmentHorizontal> bVar4 = bVarI5 == null ? bVar3 : bVarI5;
            DivContentAlignmentVertical.f371428c.getClass();
            Y41.l<String, DivContentAlignmentVertical> lVar5 = DivContentAlignmentVertical.f371429d;
            com.yandex.div.json.expressions.b<DivContentAlignmentVertical> bVar5 = DivContainer.f371314T;
            com.yandex.div.json.expressions.b<DivContentAlignmentVertical> bVarI6 = C38107c.i(jSONObject, "content_alignment_vertical", lVar5, c38106b, f370579a, bVar5, DivContainer.f371326f0);
            com.yandex.div.json.expressions.b<DivContentAlignmentVertical> bVar6 = bVarI6 == null ? bVar5 : bVarI6;
            S0.f373492a.getClass();
            List listK3 = C38107c.k(jSONObject, "disappear_actions", S0.f373500i, DivContainer.f371334n0, f370579a, eVar);
            List listK4 = C38107c.k(jSONObject, "doubletap_actions", pVar, DivContainer.f371335o0, f370579a, eVar);
            C38273c1.f374687c.getClass();
            List listK5 = C38107c.k(jSONObject, AttachMenuItem.File.EXTENSIONS, C38273c1.f374689e, DivContainer.f371336p0, f370579a, eVar);
            C38567u1.f376619f.getClass();
            C38567u1 c38567u1 = (C38567u1) C38107c.g(jSONObject, "focus", C38567u1.f376624k, f370579a, eVar);
            K5.f372712a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, K5> pVar2 = K5.f372713b;
            K5 k52 = (K5) C38107c.g(jSONObject, "height", pVar2, f370579a, eVar);
            if (k52 == null) {
                k52 = DivContainer.f371315U;
            }
            K5 k53 = k52;
            String str = (String) C38107c.h(jSONObject, "id", C38107c.f370141c, DivContainer.f371337q0, f370579a);
            AbstractC38330g.f375012a.getClass();
            List listF = C38107c.f(jSONObject, "items", AbstractC38330g.f375013b, DivContainer.f371338r0, f370579a, eVar);
            LayoutMode.f371384c.getClass();
            Y41.l<String, LayoutMode> lVar6 = LayoutMode.f371385d;
            com.yandex.div.json.expressions.b<LayoutMode> bVar7 = DivContainer.f371316V;
            com.yandex.div.json.expressions.b<LayoutMode> bVarI7 = C38107c.i(jSONObject, "layout_mode", lVar6, c38106b, f370579a, bVar7, DivContainer.f371327g0);
            com.yandex.div.json.expressions.b<LayoutMode> bVar8 = bVarI7 == null ? bVar7 : bVarI7;
            j.f371407e.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, j> pVar3 = j.f371411i;
            j jVar = (j) C38107c.g(jSONObject, "line_separator", pVar3, f370579a, eVar);
            DivAction.f371211f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, DivAction> pVar4 = DivAction.f371215j;
            List listK6 = C38107c.k(jSONObject, "longtap_actions", pVar4, DivContainer.f371339s0, f370579a, eVar);
            Y0.f374024f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, Y0> pVar5 = Y0.f374035q;
            Y0 y02 = (Y0) C38107c.g(jSONObject, "margins", pVar5, f370579a, eVar);
            if (y02 == null) {
                y02 = DivContainer.f371317W;
            }
            Y0 y03 = y02;
            Orientation.f371391c.getClass();
            Y41.l<String, Orientation> lVar7 = Orientation.f371392d;
            com.yandex.div.json.expressions.b<Orientation> bVar9 = DivContainer.f371318X;
            com.yandex.div.internal.parser.C c13 = DivContainer.f371328h0;
            C38106b c38106b2 = C38107c.f370139a;
            com.yandex.div.json.expressions.b<Orientation> bVarI8 = C38107c.i(jSONObject, "orientation", lVar7, c38106b2, f370579a, bVar9, c13);
            com.yandex.div.json.expressions.b<Orientation> bVar10 = bVarI8 == null ? bVar9 : bVarI8;
            Y0 y04 = (Y0) C38107c.g(jSONObject, "paddings", pVar5, f370579a, eVar);
            if (y04 == null) {
                y04 = DivContainer.f371319Y;
            }
            Y0 y05 = y04;
            com.yandex.div.json.expressions.b bVarI9 = C38107c.i(jSONObject, "row_span", lVar3, DivContainer.f371340t0, f370579a, null, dVar);
            List listK7 = C38107c.k(jSONObject, "selected_actions", pVar4, DivContainer.f371341u0, f370579a, eVar);
            j jVar2 = (j) C38107c.g(jSONObject, "separator", pVar3, f370579a, eVar);
            DivTooltip.f372130h.getClass();
            List listK8 = C38107c.k(jSONObject, "tooltips", DivTooltip.f372135m, DivContainer.f371342v0, f370579a, eVar);
            C38260a8.f374376d.getClass();
            C38260a8 c38260a8 = (C38260a8) C38107c.g(jSONObject, "transform", C38260a8.f374379g, f370579a, eVar);
            if (c38260a8 == null) {
                c38260a8 = DivContainer.f371320Z;
            }
            C38260a8 c38260a82 = c38260a8;
            T.f373510a.getClass();
            T t12 = (T) C38107c.g(jSONObject, "transition_change", T.f373511b, f370579a, eVar);
            B.f370624a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, B> pVar6 = B.f370625b;
            B b12 = (B) C38107c.g(jSONObject, "transition_in", pVar6, f370579a, eVar);
            B b13 = (B) C38107c.g(jSONObject, "transition_out", pVar6, f370579a, eVar);
            DivTransitionTrigger.f372167c.getClass();
            List listJ = C38107c.j(jSONObject, "transition_triggers", DivTransitionTrigger.f372168d, DivContainer.f371343w0, f370579a);
            DivVisibility.f372192c.getClass();
            Y41.l<String, DivVisibility> lVar8 = DivVisibility.f372193d;
            com.yandex.div.json.expressions.b<DivVisibility> bVar11 = DivContainer.f371321a0;
            com.yandex.div.json.expressions.b<DivVisibility> bVarI10 = C38107c.i(jSONObject, "visibility", lVar8, c38106b2, f370579a, bVar11, DivContainer.f371329i0);
            com.yandex.div.json.expressions.b<DivVisibility> bVar12 = bVarI10 == null ? bVar11 : bVarI10;
            w8.f376942h.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, w8> pVar7 = w8.f376950p;
            w8 w8Var = (w8) C38107c.g(jSONObject, "visibility_action", pVar7, f370579a, eVar);
            List listK9 = C38107c.k(jSONObject, "visibility_actions", pVar7, DivContainer.f371344x0, f370579a, eVar);
            K5 k54 = (K5) C38107c.g(jSONObject, "width", pVar2, f370579a, eVar);
            if (k54 == null) {
                k54 = DivContainer.f371322b0;
            }
            return new DivContainer(divAccessibility2, divAction, divAnimation2, listK, bVarI, bVarI2, bVar2, d12, listK2, k13, bVarI4, bVar4, bVar6, listK3, listK4, listK5, c38567u1, k53, str, listF, bVar8, jVar, listK6, y03, bVar10, y05, bVarI9, listK7, jVar2, listK8, c38260a82, t12, b12, b13, listJ, bVar12, w8Var, listK9, k54);
        }

        public i() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        com.yandex.div.json.expressions.b bVarI = com.google.firebase.components.g.i(100L, com.yandex.div.json.expressions.b.f370552a);
        com.yandex.div.json.expressions.b bVarA = b.a.a(Double.valueOf(0.6d));
        com.yandex.div.json.expressions.b bVarA2 = b.a.a(DivAnimation.Name.FADE);
        Double dValueOf = Double.valueOf(1.0d);
        f371310P = new DivAnimation(bVarI, bVarA, null, null, bVarA2, null, null, b.a.a(dValueOf), 108, null);
        f371311Q = b.a.a(dValueOf);
        com.yandex.div.json.expressions.b bVar = null;
        C42822w c42822w = null;
        f371312R = new K(bVar, null, null, null, null, 31, c42822w);
        f371313S = b.a.a(DivContentAlignmentHorizontal.LEFT);
        f371314T = b.a.a(DivContentAlignmentVertical.TOP);
        Object[] objArr = 0 == true ? 1 : 0;
        f371315U = new K5.e(new y8(bVar, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, objArr));
        f371316V = b.a.a(LayoutMode.NO_WRAP);
        com.yandex.div.json.expressions.b bVar2 = null;
        int i12 = 31;
        f371317W = new Y0(bVar, 0 == true ? 1 : 0, 0 == true ? 1 : 0, bVar2, 0 == true ? 1 : 0, i12, c42822w);
        f371318X = b.a.a(Orientation.VERTICAL);
        f371319Y = new Y0(bVar, 0 == true ? 1 : 0, 0 == true ? 1 : 0, bVar2, 0 == true ? 1 : 0, i12, c42822w);
        f371320Z = new C38260a8(null, null, null, 7, 0 == true ? 1 : 0);
        f371321a0 = b.a.a(DivVisibility.VISIBLE);
        f371322b0 = new K5.d(new U3(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0));
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAlignmentHorizontal.values());
        b bVar3 = b.f371400l;
        aVar.getClass();
        f371323c0 = new com.yandex.div.internal.parser.C(bVar3, objC);
        f371324d0 = new com.yandex.div.internal.parser.C(c.f371401l, C42756l.C(DivAlignmentVertical.values()));
        f371325e0 = new com.yandex.div.internal.parser.C(d.f371402l, C42756l.C(DivContentAlignmentHorizontal.values()));
        f371326f0 = new com.yandex.div.internal.parser.C(e.f371403l, C42756l.C(DivContentAlignmentVertical.values()));
        f371327g0 = new com.yandex.div.internal.parser.C(f.f371404l, C42756l.C(LayoutMode.values()));
        f371328h0 = new com.yandex.div.internal.parser.C(g.f371405l, C42756l.C(Orientation.values()));
        f371329i0 = new com.yandex.div.internal.parser.C(h.f371406l, C42756l.C(DivVisibility.values()));
        f371330j0 = new C38491p(15);
        f371331k0 = new C38574v(19);
        f371332l0 = new C38491p(16);
        f371333m0 = new C38574v(16);
        f371334n0 = new C38491p(17);
        f371335o0 = new C38491p(18);
        f371336p0 = new C38491p(19);
        f371337q0 = new C38574v(17);
        f371338r0 = new C38491p(20);
        f371339s0 = new C38491p(21);
        f371340t0 = new C38574v(18);
        f371341u0 = new C38491p(22);
        f371342v0 = new C38491p(23);
        f371343w0 = new C38491p(24);
        f371344x0 = new C38491p(25);
        int i13 = a.f371399l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public DivContainer(@Y61.k DivAccessibility divAccessibility, @Y61.l DivAction divAction, @Y61.k DivAnimation divAnimation, @Y61.l List<? extends DivAction> list, @Y61.l com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar, @Y61.l com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar2, @Y61.k com.yandex.div.json.expressions.b<Double> bVar3, @Y61.l D d12, @Y61.l List<? extends F> list2, @Y61.k K k12, @Y61.l com.yandex.div.json.expressions.b<Long> bVar4, @Y61.k com.yandex.div.json.expressions.b<DivContentAlignmentHorizontal> bVar5, @Y61.k com.yandex.div.json.expressions.b<DivContentAlignmentVertical> bVar6, @Y61.l List<? extends S0> list3, @Y61.l List<? extends DivAction> list4, @Y61.l List<? extends C38273c1> list5, @Y61.l C38567u1 c38567u1, @Y61.k K5 k52, @Y61.l String str, @Y61.k List<? extends AbstractC38330g> list6, @Y61.k com.yandex.div.json.expressions.b<LayoutMode> bVar7, @Y61.l j jVar, @Y61.l List<? extends DivAction> list7, @Y61.k Y0 y02, @Y61.k com.yandex.div.json.expressions.b<Orientation> bVar8, @Y61.k Y0 y03, @Y61.l com.yandex.div.json.expressions.b<Long> bVar9, @Y61.l List<? extends DivAction> list8, @Y61.l j jVar2, @Y61.l List<? extends DivTooltip> list9, @Y61.k C38260a8 c38260a8, @Y61.l T t12, @Y61.l B b12, @Y61.l B b13, @Y61.l List<? extends DivTransitionTrigger> list10, @Y61.k com.yandex.div.json.expressions.b<DivVisibility> bVar10, @Y61.l w8 w8Var, @Y61.l List<? extends w8> list11, @Y61.k K5 k53) {
        this.f371358a = divAccessibility;
        this.f371359b = divAction;
        this.f371360c = divAnimation;
        this.f371361d = list;
        this.f371362e = bVar;
        this.f371363f = bVar2;
        this.f371364g = bVar3;
        this.f371365h = d12;
        this.f371366i = list2;
        this.f371367j = k12;
        this.f371368k = bVar4;
        this.f371369l = bVar5;
        this.f371370m = bVar6;
        this.f371371n = list3;
        this.f371372o = list4;
        this.f371373p = list5;
        this.f371374q = c38567u1;
        this.f371375r = k52;
        this.f371376s = str;
        this.f371377t = list6;
        this.f371378u = bVar7;
        this.f371379v = jVar;
        this.f371380w = list7;
        this.f371381x = y02;
        this.f371382y = bVar8;
        this.f371383z = y03;
        this.f371345A = bVar9;
        this.f371346B = list8;
        this.f371347C = jVar2;
        this.f371348D = list9;
        this.f371349E = c38260a8;
        this.f371350F = t12;
        this.f371351G = b12;
        this.f371352H = b13;
        this.f371353I = list10;
        this.f371354J = bVar10;
        this.f371355K = w8Var;
        this.f371356L = list11;
        this.f371357M = k53;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C38260a8 getF371702H() {
        return this.f371349E;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<F> e() {
        return this.f371366i;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> getAlpha() {
        return this.f371364g;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getBorder, reason: from getter */
    public final K getF371717f() {
        return this.f371367j;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getHeight, reason: from getter */
    public final K5 getF371726o() {
        return this.f371375r;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: getId, reason: from getter */
    public final String getF371730s() {
        return this.f371376s;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivVisibility> getVisibility() {
        return this.f371354J;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getWidth, reason: from getter */
    public final K5 getF371711Q() {
        return this.f371357M;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivTooltip> i() {
        return this.f371348D;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> j() {
        return this.f371368k;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final Y0 getF371734w() {
        return this.f371381x;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> l() {
        return this.f371345A;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> m() {
        return this.f371362e;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: n, reason: from getter */
    public final B getF371705K() {
        return this.f371352H;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivTransitionTrigger> o() {
        return this.f371353I;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<C38273c1> p() {
        return this.f371373p;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivAction> q() {
        return this.f371346B;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: r, reason: from getter */
    public final B getF371704J() {
        return this.f371351G;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<w8> s() {
        return this.f371356L;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: t, reason: from getter */
    public final T getF371703I() {
        return this.f371350F;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> u() {
        return this.f371363f;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: v, reason: from getter */
    public final C38567u1 getF371721j() {
        return this.f371374q;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: w, reason: from getter */
    public final DivAccessibility getF371712a() {
        return this.f371358a;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: x, reason: from getter */
    public final Y0 getF371695A() {
        return this.f371383z;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: y, reason: from getter */
    public final w8 getF371709O() {
        return this.f371355K;
    }

    /* compiled from: DivContainer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivContainer$j;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class j implements com.yandex.div.json.b {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final b f371407e = new b(null);

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<Boolean> f371408f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<Boolean> f371409g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<Boolean> f371410h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public static final Y41.p<com.yandex.div.json.e, JSONObject, j> f371411i;

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<Boolean> f371412a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<Boolean> f371413b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<Boolean> f371414c;

        /* renamed from: d, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final W0 f371415d;

        /* compiled from: DivContainer.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivContainer$j;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivContainer$j;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, j> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f371416l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final j invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
                com.yandex.div.json.e eVar2 = eVar;
                JSONObject jSONObject2 = jSONObject;
                j.f371407e.getClass();
                com.yandex.div.json.i f370579a = eVar2.getF370579a();
                Y0.f374024f.getClass();
                Y41.l<Object, Boolean> lVar = com.yandex.div.internal.parser.y.f370149c;
                com.yandex.div.json.expressions.b<Boolean> bVar = j.f371408f;
                E.a aVar = com.yandex.div.internal.parser.E.f370131a;
                C38106b c38106b = C38107c.f370139a;
                com.yandex.div.json.expressions.b<Boolean> bVarI = C38107c.i(jSONObject2, "show_at_end", lVar, c38106b, f370579a, bVar, aVar);
                if (bVarI != null) {
                    bVar = bVarI;
                }
                com.yandex.div.json.expressions.b<Boolean> bVar2 = j.f371409g;
                com.yandex.div.json.expressions.b<Boolean> bVarI2 = C38107c.i(jSONObject2, "show_at_start", lVar, c38106b, f370579a, bVar2, aVar);
                if (bVarI2 != null) {
                    bVar2 = bVarI2;
                }
                com.yandex.div.json.expressions.b<Boolean> bVar3 = j.f371410h;
                com.yandex.div.json.expressions.b<Boolean> bVarI3 = C38107c.i(jSONObject2, "show_between", lVar, c38106b, f370579a, bVar3, aVar);
                if (bVarI3 == null) {
                    bVarI3 = bVar3;
                }
                W0.f373775a.getClass();
                return new j(bVar, bVar2, bVarI3, (W0) C38107c.b(jSONObject2, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, W0.f373776b, eVar2));
            }
        }

        /* compiled from: DivContainer.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/yandex/div2/DivContainer$j$b;", "", "<init>", "()V", "Lcom/yandex/div2/Y0;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/Y0;", "Lcom/yandex/div/json/expressions/b;", "", "SHOW_AT_END_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "SHOW_AT_START_DEFAULT_VALUE", "SHOW_BETWEEN_DEFAULT_VALUE", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        static {
            new Y0(null, null, null, null, null, 31, null);
            b.a aVar = com.yandex.div.json.expressions.b.f370552a;
            Boolean bool = Boolean.FALSE;
            aVar.getClass();
            f371408f = b.a.a(bool);
            f371409g = b.a.a(bool);
            f371410h = b.a.a(Boolean.TRUE);
            f371411i = a.f371416l;
        }

        @C21.b
        public j(@Y61.k com.yandex.div.json.expressions.b bVar, @Y61.k com.yandex.div.json.expressions.b bVar2, @Y61.k com.yandex.div.json.expressions.b bVar3, @Y61.k W0 w02) {
            this.f371412a = bVar;
            this.f371413b = bVar2;
            this.f371414c = bVar3;
            this.f371415d = w02;
        }

        public /* synthetic */ j(Y0 y02, com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, W0 w02, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? f371408f : bVar, (i12 & 4) != 0 ? f371409g : bVar2, (i12 & 8) != 0 ? f371410h : bVar3, w02);
        }
    }

    public /* synthetic */ DivContainer(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, D d12, List list2, K k12, com.yandex.div.json.expressions.b bVar4, com.yandex.div.json.expressions.b bVar5, com.yandex.div.json.expressions.b bVar6, List list3, List list4, List list5, C38567u1 c38567u1, K5 k52, String str, List list6, com.yandex.div.json.expressions.b bVar7, j jVar, List list7, Y0 y02, com.yandex.div.json.expressions.b bVar8, Y0 y03, com.yandex.div.json.expressions.b bVar9, List list8, j jVar2, List list9, C38260a8 c38260a8, T t12, B b12, B b13, List list10, com.yandex.div.json.expressions.b bVar10, w8 w8Var, List list11, K5 k53, int i12, int i13, C42822w c42822w) {
        this((i12 & 1) != 0 ? f371309O : divAccessibility, (i12 & 2) != 0 ? null : divAction, (i12 & 4) != 0 ? f371310P : divAnimation, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : bVar, (i12 & 32) != 0 ? null : bVar2, (i12 & 64) != 0 ? f371311Q : bVar3, (i12 & 128) != 0 ? null : d12, (i12 & 256) != 0 ? null : list2, (i12 & 512) != 0 ? f371312R : k12, (i12 & 1024) != 0 ? null : bVar4, (i12 & 2048) != 0 ? f371313S : bVar5, (i12 & 4096) != 0 ? f371314T : bVar6, (i12 & 8192) != 0 ? null : list3, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list4, (32768 & i12) != 0 ? null : list5, (65536 & i12) != 0 ? null : c38567u1, (131072 & i12) != 0 ? f371315U : k52, (262144 & i12) != 0 ? null : str, list6, (1048576 & i12) != 0 ? f371316V : bVar7, (2097152 & i12) != 0 ? null : jVar, (4194304 & i12) != 0 ? null : list7, (8388608 & i12) != 0 ? f371317W : y02, (16777216 & i12) != 0 ? f371318X : bVar8, (33554432 & i12) != 0 ? f371319Y : y03, (67108864 & i12) != 0 ? null : bVar9, (134217728 & i12) != 0 ? null : list8, (268435456 & i12) != 0 ? null : jVar2, (536870912 & i12) != 0 ? null : list9, (1073741824 & i12) != 0 ? f371320Z : c38260a8, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : t12, (i13 & 1) != 0 ? null : b12, (i13 & 2) != 0 ? null : b13, (i13 & 4) != 0 ? null : list10, (i13 & 8) != 0 ? f371321a0 : bVar10, (i13 & 16) != 0 ? null : w8Var, (i13 & 32) != 0 ? null : list11, (i13 & 64) != 0 ? f371322b0 : k53);
    }
}
