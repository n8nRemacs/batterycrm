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
import com.yandex.div2.K5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* compiled from: DivGallery.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div2/DivGallery;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div2/H;", "h", "CrossContentAlignment", "Orientation", "ScrollMode", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class DivGallery implements com.yandex.div.json.b, H {

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public static final K f371459M;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public static final Y0 f371464R;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public static final Y0 f371466T;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public static final C38260a8 f371469W = new C38260a8(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0);

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivVisibility> f371470X = b.a.a(DivVisibility.VISIBLE);

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public static final K5.d f371471Y = new K5.d(new U3(null == true ? 1 : 0, 1, null == true ? 1 : 0));

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371472Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371473a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371474b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371475c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371476d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371477e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f371478f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f371479g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f371480h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f371481i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f371482j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f371483k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f371484l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f371485m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f371486n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f371487o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f371488p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public static final C38576v1 f371489q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f371490r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f371491s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f371492t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final C38458n1 f371493u0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final C38260a8 f371494A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final T f371495B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public final B f371496C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public final B f371497D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final List<DivTransitionTrigger> f371498E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivVisibility> f371499F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final w8 f371500G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final List<w8> f371501H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final K5 f371502I;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DivAccessibility f371503a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f371504b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> f371505c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> f371506d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<F> f371507e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final K f371508f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f371509g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f371510h;

    /* renamed from: i, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<CrossContentAlignment> f371511i;

    /* renamed from: j, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f371512j;

    /* renamed from: k, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f371513k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final List<S0> f371514l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final List<C38273c1> f371515m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final C38567u1 f371516n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final K5 f371517o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final String f371518p;

    /* renamed from: q, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f371519q;

    /* renamed from: r, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final List<AbstractC38330g> f371520r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Y0 f371521s;

    /* renamed from: t, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Orientation> f371522t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Y0 f371523u;

    /* renamed from: v, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Boolean> f371524v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f371525w;

    /* renamed from: x, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<ScrollMode> f371526x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final List<DivAction> f371527y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final List<DivTooltip> f371528z;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public static final h f371456J = new h(null);

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public static final DivAccessibility f371457K = new DivAccessibility(null, null, null, null, null, null, 63, null);

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f371458L = C38492p0.a(1.0d, com.yandex.div.json.expressions.b.f370552a);

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<CrossContentAlignment> f371460N = b.a.a(CrossContentAlignment.START);

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f371461O = b.a.a(0L);

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public static final K5.e f371462P = new K5.e(new y8(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f371463Q = b.a.a(8L);

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Orientation> f371465S = b.a.a(Orientation.HORIZONTAL);

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Boolean> f371467U = b.a.a(Boolean.FALSE);

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<ScrollMode> f371468V = b.a.a(ScrollMode.DEFAULT);

    /* compiled from: DivGallery.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivGallery$CrossContentAlignment;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum CrossContentAlignment {
        START("start"),
        CENTER("center"),
        END("end");


        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f371529c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Y41.l<String, CrossContentAlignment> f371530d = a.f371536l;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f371535b;

        /* compiled from: DivGallery.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivGallery$CrossContentAlignment;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, CrossContentAlignment> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f371536l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final CrossContentAlignment invoke(String str) {
                String str2 = str;
                CrossContentAlignment crossContentAlignment = CrossContentAlignment.START;
                if (str2.equals("start")) {
                    return crossContentAlignment;
                }
                CrossContentAlignment crossContentAlignment2 = CrossContentAlignment.CENTER;
                if (str2.equals("center")) {
                    return crossContentAlignment2;
                }
                CrossContentAlignment crossContentAlignment3 = CrossContentAlignment.END;
                if (str2.equals("end")) {
                    return crossContentAlignment3;
                }
                return null;
            }
        }

        /* compiled from: DivGallery.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivGallery$CrossContentAlignment$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        CrossContentAlignment(String str) {
            this.f371535b = str;
        }
    }

    /* compiled from: DivGallery.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivGallery$Orientation;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Orientation {
        HORIZONTAL("horizontal"),
        VERTICAL("vertical");


        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f371537c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Y41.l<String, Orientation> f371538d = a.f371543l;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f371542b;

        /* compiled from: DivGallery.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivGallery$Orientation;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, Orientation> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f371543l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final Orientation invoke(String str) {
                String str2 = str;
                Orientation orientation = Orientation.HORIZONTAL;
                if (str2.equals("horizontal")) {
                    return orientation;
                }
                Orientation orientation2 = Orientation.VERTICAL;
                if (str2.equals("vertical")) {
                    return orientation2;
                }
                return null;
            }
        }

        /* compiled from: DivGallery.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivGallery$Orientation$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        Orientation(String str) {
            this.f371542b = str;
        }
    }

    /* compiled from: DivGallery.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivGallery$ScrollMode;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum ScrollMode {
        PAGING("paging"),
        DEFAULT("default");


        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f371544c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Y41.l<String, ScrollMode> f371545d = a.f371550l;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f371549b;

        /* compiled from: DivGallery.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivGallery$ScrollMode;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, ScrollMode> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f371550l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final ScrollMode invoke(String str) {
                String str2 = str;
                ScrollMode scrollMode = ScrollMode.PAGING;
                if (str2.equals("paging")) {
                    return scrollMode;
                }
                ScrollMode scrollMode2 = ScrollMode.DEFAULT;
                if (str2.equals("default")) {
                    return scrollMode2;
                }
                return null;
            }
        }

        /* compiled from: DivGallery.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivGallery$ScrollMode$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        ScrollMode(String str) {
            this.f371549b = str;
        }
    }

    /* compiled from: DivGallery.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivGallery;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivGallery;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, DivGallery> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f371551l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final DivGallery invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            DivGallery.f371456J.getClass();
            return h.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivGallery.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f371552l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivGallery.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f371553l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivGallery.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f371554l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof CrossContentAlignment);
        }
    }

    /* compiled from: DivGallery.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f371555l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Orientation);
        }
    }

    /* compiled from: DivGallery.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f371556l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ScrollMode);
        }
    }

    /* compiled from: DivGallery.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f371557l = new g();

        public g() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivGallery.kt */
    @Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\rR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\rR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\rR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\rR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0012R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0012R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\rR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\rR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0012R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\nR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\rR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\rR\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\nR\u0014\u00106\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\nR\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\rR\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\rR\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\nR\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0012R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0012R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0012R\u0014\u0010F\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010KR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001b0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010KR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u0002040H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010KR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020;0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010KR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010KR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010\u0012R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020Q0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010\nR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006Y"}, d2 = {"Lcom/yandex/div2/DivGallery$h;", "", "<init>", "()V", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/b;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/F;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/K;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/K;", "", "COLUMN_COUNT_TEMPLATE_VALIDATOR", "COLUMN_COUNT_VALIDATOR", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivGallery$CrossContentAlignment;", "CROSS_CONTENT_ALIGNMENT_DEFAULT_VALUE", "CROSS_SPACING_TEMPLATE_VALIDATOR", "CROSS_SPACING_VALIDATOR", "DEFAULT_ITEM_DEFAULT_VALUE", "DEFAULT_ITEM_TEMPLATE_VALIDATOR", "DEFAULT_ITEM_VALIDATOR", "Lcom/yandex/div2/S0;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/c1;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/K5$e;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/K5$e;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/g;", "ITEMS_VALIDATOR", "ITEM_SPACING_DEFAULT_VALUE", "ITEM_SPACING_TEMPLATE_VALIDATOR", "ITEM_SPACING_VALIDATOR", "Lcom/yandex/div2/Y0;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/Y0;", "Lcom/yandex/div2/DivGallery$Orientation;", "ORIENTATION_DEFAULT_VALUE", "PADDINGS_DEFAULT_VALUE", "", "RESTRICT_PARENT_SCROLL_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivGallery$ScrollMode;", "SCROLL_MODE_DEFAULT_VALUE", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/a8;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/a8;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_CROSS_CONTENT_ALIGNMENT", "TYPE_HELPER_ORIENTATION", "TYPE_HELPER_SCROLL_MODE", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/w8;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class h {
        public /* synthetic */ h(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static DivGallery a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            DivAccessibility.f371175f.getClass();
            DivAccessibility divAccessibility = (DivAccessibility) C38107c.g(jSONObject, "accessibility", DivAccessibility.f371182m, f370579a, eVar);
            if (divAccessibility == null) {
                divAccessibility = DivGallery.f371457K;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            DivAlignmentHorizontal.f371238c.getClass();
            Y41.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.f371239d;
            com.yandex.div.internal.parser.C c12 = DivGallery.f371472Z;
            C38106b c38106b = C38107c.f370139a;
            com.yandex.div.json.expressions.b bVarI = C38107c.i(jSONObject, "alignment_horizontal", lVar, c38106b, f370579a, null, c12);
            DivAlignmentVertical.f371246c.getClass();
            com.yandex.div.json.expressions.b bVarI2 = C38107c.i(jSONObject, "alignment_vertical", DivAlignmentVertical.f371247d, c38106b, f370579a, null, DivGallery.f371473a0);
            Y41.l<Number, Double> lVar2 = com.yandex.div.internal.parser.y.f370150d;
            C38576v1 c38576v1 = DivGallery.f371478f0;
            com.yandex.div.json.expressions.b<Double> bVar = DivGallery.f371458L;
            com.yandex.div.json.expressions.b<Double> bVarI3 = C38107c.i(jSONObject, "alpha", lVar2, c38576v1, f370579a, bVar, com.yandex.div.internal.parser.E.f370134d);
            com.yandex.div.json.expressions.b<Double> bVar2 = bVarI3 == null ? bVar : bVarI3;
            F.f372262a.getClass();
            List listK = C38107c.k(jSONObject, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, F.f372263b, DivGallery.f371479g0, f370579a, eVar);
            K.f372635f.getClass();
            K k12 = (K) C38107c.g(jSONObject, "border", K.f372638i, f370579a, eVar);
            if (k12 == null) {
                k12 = DivGallery.f371459M;
            }
            K k13 = k12;
            Y41.l<Number, Long> lVar3 = com.yandex.div.internal.parser.y.f370151e;
            C38576v1 c38576v12 = DivGallery.f371480h0;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            com.yandex.div.json.expressions.b bVarI4 = C38107c.i(jSONObject, "column_count", lVar3, c38576v12, f370579a, null, dVar);
            com.yandex.div.json.expressions.b bVarI5 = C38107c.i(jSONObject, "column_span", lVar3, DivGallery.f371481i0, f370579a, null, dVar);
            CrossContentAlignment.f371529c.getClass();
            Y41.l<String, CrossContentAlignment> lVar4 = CrossContentAlignment.f371530d;
            com.yandex.div.json.expressions.b<CrossContentAlignment> bVar3 = DivGallery.f371460N;
            com.yandex.div.json.expressions.b<CrossContentAlignment> bVarI6 = C38107c.i(jSONObject, "cross_content_alignment", lVar4, c38106b, f370579a, bVar3, DivGallery.f371474b0);
            com.yandex.div.json.expressions.b<CrossContentAlignment> bVar4 = bVarI6 == null ? bVar3 : bVarI6;
            com.yandex.div.json.expressions.b bVarI7 = C38107c.i(jSONObject, "cross_spacing", lVar3, DivGallery.f371482j0, f370579a, null, dVar);
            C38576v1 c38576v13 = DivGallery.f371483k0;
            com.yandex.div.json.expressions.b<Long> bVar5 = DivGallery.f371461O;
            com.yandex.div.json.expressions.b<Long> bVarI8 = C38107c.i(jSONObject, "default_item", lVar3, c38576v13, f370579a, bVar5, dVar);
            com.yandex.div.json.expressions.b<Long> bVar6 = bVarI8 == null ? bVar5 : bVarI8;
            S0.f373492a.getClass();
            List listK2 = C38107c.k(jSONObject, "disappear_actions", S0.f373500i, DivGallery.f371484l0, f370579a, eVar);
            C38273c1.f374687c.getClass();
            List listK3 = C38107c.k(jSONObject, AttachMenuItem.File.EXTENSIONS, C38273c1.f374689e, DivGallery.f371485m0, f370579a, eVar);
            C38567u1.f376619f.getClass();
            C38567u1 c38567u1 = (C38567u1) C38107c.g(jSONObject, "focus", C38567u1.f376624k, f370579a, eVar);
            K5.f372712a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, K5> pVar = K5.f372713b;
            K5 k52 = (K5) C38107c.g(jSONObject, "height", pVar, f370579a, eVar);
            if (k52 == null) {
                k52 = DivGallery.f371462P;
            }
            K5 k53 = k52;
            String str = (String) C38107c.h(jSONObject, "id", C38107c.f370141c, DivGallery.f371486n0, f370579a);
            C38576v1 c38576v14 = DivGallery.f371487o0;
            com.yandex.div.json.expressions.b<Long> bVar7 = DivGallery.f371463Q;
            com.yandex.div.json.expressions.b<Long> bVarI9 = C38107c.i(jSONObject, "item_spacing", lVar3, c38576v14, f370579a, bVar7, dVar);
            com.yandex.div.json.expressions.b<Long> bVar8 = bVarI9 == null ? bVar7 : bVarI9;
            AbstractC38330g.f375012a.getClass();
            List listF = C38107c.f(jSONObject, "items", AbstractC38330g.f375013b, DivGallery.f371488p0, f370579a, eVar);
            Y0.f374024f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, Y0> pVar2 = Y0.f374035q;
            Y0 y02 = (Y0) C38107c.g(jSONObject, "margins", pVar2, f370579a, eVar);
            if (y02 == null) {
                y02 = DivGallery.f371464R;
            }
            Y0 y03 = y02;
            Orientation.f371537c.getClass();
            Y41.l<String, Orientation> lVar5 = Orientation.f371538d;
            com.yandex.div.json.expressions.b<Orientation> bVar9 = DivGallery.f371465S;
            com.yandex.div.json.expressions.b<Orientation> bVarI10 = C38107c.i(jSONObject, "orientation", lVar5, c38106b, f370579a, bVar9, DivGallery.f371475c0);
            com.yandex.div.json.expressions.b<Orientation> bVar10 = bVarI10 == null ? bVar9 : bVarI10;
            Y0 y04 = (Y0) C38107c.g(jSONObject, "paddings", pVar2, f370579a, eVar);
            if (y04 == null) {
                y04 = DivGallery.f371466T;
            }
            Y0 y05 = y04;
            Y41.l<Object, Boolean> lVar6 = com.yandex.div.internal.parser.y.f370149c;
            com.yandex.div.json.expressions.b<Boolean> bVar11 = DivGallery.f371467U;
            com.yandex.div.json.expressions.b<Boolean> bVarI11 = C38107c.i(jSONObject, "restrict_parent_scroll", lVar6, c38106b, f370579a, bVar11, com.yandex.div.internal.parser.E.f370131a);
            com.yandex.div.json.expressions.b<Boolean> bVar12 = bVarI11 == null ? bVar11 : bVarI11;
            com.yandex.div.json.expressions.b bVarI12 = C38107c.i(jSONObject, "row_span", lVar3, DivGallery.f371489q0, f370579a, null, dVar);
            ScrollMode.f371544c.getClass();
            Y41.l<String, ScrollMode> lVar7 = ScrollMode.f371545d;
            com.yandex.div.json.expressions.b<ScrollMode> bVar13 = DivGallery.f371468V;
            com.yandex.div.json.expressions.b<ScrollMode> bVarI13 = C38107c.i(jSONObject, "scroll_mode", lVar7, c38106b, f370579a, bVar13, DivGallery.f371476d0);
            com.yandex.div.json.expressions.b<ScrollMode> bVar14 = bVarI13 == null ? bVar13 : bVarI13;
            DivAction.f371211f.getClass();
            List listK4 = C38107c.k(jSONObject, "selected_actions", DivAction.f371215j, DivGallery.f371490r0, f370579a, eVar);
            DivTooltip.f372130h.getClass();
            List listK5 = C38107c.k(jSONObject, "tooltips", DivTooltip.f372135m, DivGallery.f371491s0, f370579a, eVar);
            C38260a8.f374376d.getClass();
            C38260a8 c38260a8 = (C38260a8) C38107c.g(jSONObject, "transform", C38260a8.f374379g, f370579a, eVar);
            if (c38260a8 == null) {
                c38260a8 = DivGallery.f371469W;
            }
            C38260a8 c38260a82 = c38260a8;
            T.f373510a.getClass();
            T t12 = (T) C38107c.g(jSONObject, "transition_change", T.f373511b, f370579a, eVar);
            B.f370624a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, B> pVar3 = B.f370625b;
            B b12 = (B) C38107c.g(jSONObject, "transition_in", pVar3, f370579a, eVar);
            B b13 = (B) C38107c.g(jSONObject, "transition_out", pVar3, f370579a, eVar);
            DivTransitionTrigger.f372167c.getClass();
            List listJ = C38107c.j(jSONObject, "transition_triggers", DivTransitionTrigger.f372168d, DivGallery.f371492t0, f370579a);
            DivVisibility.f372192c.getClass();
            Y41.l<String, DivVisibility> lVar8 = DivVisibility.f372193d;
            com.yandex.div.json.expressions.b<DivVisibility> bVar15 = DivGallery.f371470X;
            com.yandex.div.json.expressions.b<DivVisibility> bVarI14 = C38107c.i(jSONObject, "visibility", lVar8, c38106b, f370579a, bVar15, DivGallery.f371477e0);
            com.yandex.div.json.expressions.b<DivVisibility> bVar16 = bVarI14 == null ? bVar15 : bVarI14;
            w8.f376942h.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, w8> pVar4 = w8.f376950p;
            w8 w8Var = (w8) C38107c.g(jSONObject, "visibility_action", pVar4, f370579a, eVar);
            List listK6 = C38107c.k(jSONObject, "visibility_actions", pVar4, DivGallery.f371493u0, f370579a, eVar);
            K5 k54 = (K5) C38107c.g(jSONObject, "width", pVar, f370579a, eVar);
            if (k54 == null) {
                k54 = DivGallery.f371471Y;
            }
            return new DivGallery(divAccessibility2, bVarI, bVarI2, bVar2, listK, k13, bVarI4, bVarI5, bVar4, bVarI7, bVar6, listK2, listK3, c38567u1, k53, str, bVar8, listF, y03, bVar10, y05, bVar12, bVarI12, bVar14, listK4, listK5, c38260a82, t12, b12, b13, listJ, bVar16, w8Var, listK6, k54);
        }

        public h() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C42822w c42822w = null;
        f371459M = new K(null, null, null, null, null, 31, c42822w);
        com.yandex.div.json.expressions.b bVar = null;
        int i12 = 31;
        f371464R = new Y0(null, null == true ? 1 : 0, null == true ? 1 : 0, bVar, null == true ? 1 : 0, i12, c42822w);
        f371466T = new Y0(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, bVar, null == true ? 1 : 0, i12, c42822w);
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAlignmentHorizontal.values());
        b bVar2 = b.f371552l;
        aVar.getClass();
        f371472Z = new com.yandex.div.internal.parser.C(bVar2, objC);
        f371473a0 = new com.yandex.div.internal.parser.C(c.f371553l, C42756l.C(DivAlignmentVertical.values()));
        f371474b0 = new com.yandex.div.internal.parser.C(d.f371554l, C42756l.C(CrossContentAlignment.values()));
        f371475c0 = new com.yandex.div.internal.parser.C(e.f371555l, C42756l.C(Orientation.values()));
        f371476d0 = new com.yandex.div.internal.parser.C(f.f371556l, C42756l.C(ScrollMode.values()));
        f371477e0 = new com.yandex.div.internal.parser.C(g.f371557l, C42756l.C(DivVisibility.values()));
        f371478f0 = new C38576v1(18);
        f371479g0 = new C38458n1(14);
        f371480h0 = new C38576v1(12);
        f371481i0 = new C38576v1(13);
        f371482j0 = new C38576v1(14);
        f371483k0 = new C38576v1(11);
        f371484l0 = new C38458n1(15);
        f371485m0 = new C38458n1(16);
        f371486n0 = new C38576v1(15);
        f371487o0 = new C38576v1(16);
        f371488p0 = new C38458n1(17);
        f371489q0 = new C38576v1(17);
        f371490r0 = new C38458n1(18);
        f371491s0 = new C38458n1(19);
        f371492t0 = new C38458n1(12);
        f371493u0 = new C38458n1(13);
        int i13 = a.f371551l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public DivGallery(@Y61.k DivAccessibility divAccessibility, @Y61.l com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar, @Y61.l com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar2, @Y61.k com.yandex.div.json.expressions.b<Double> bVar3, @Y61.l List<? extends F> list, @Y61.k K k12, @Y61.l com.yandex.div.json.expressions.b<Long> bVar4, @Y61.l com.yandex.div.json.expressions.b<Long> bVar5, @Y61.k com.yandex.div.json.expressions.b<CrossContentAlignment> bVar6, @Y61.l com.yandex.div.json.expressions.b<Long> bVar7, @Y61.k com.yandex.div.json.expressions.b<Long> bVar8, @Y61.l List<? extends S0> list2, @Y61.l List<? extends C38273c1> list3, @Y61.l C38567u1 c38567u1, @Y61.k K5 k52, @Y61.l String str, @Y61.k com.yandex.div.json.expressions.b<Long> bVar9, @Y61.k List<? extends AbstractC38330g> list4, @Y61.k Y0 y02, @Y61.k com.yandex.div.json.expressions.b<Orientation> bVar10, @Y61.k Y0 y03, @Y61.k com.yandex.div.json.expressions.b<Boolean> bVar11, @Y61.l com.yandex.div.json.expressions.b<Long> bVar12, @Y61.k com.yandex.div.json.expressions.b<ScrollMode> bVar13, @Y61.l List<? extends DivAction> list5, @Y61.l List<? extends DivTooltip> list6, @Y61.k C38260a8 c38260a8, @Y61.l T t12, @Y61.l B b12, @Y61.l B b13, @Y61.l List<? extends DivTransitionTrigger> list7, @Y61.k com.yandex.div.json.expressions.b<DivVisibility> bVar14, @Y61.l w8 w8Var, @Y61.l List<? extends w8> list8, @Y61.k K5 k53) {
        this.f371503a = divAccessibility;
        this.f371504b = bVar;
        this.f371505c = bVar2;
        this.f371506d = bVar3;
        this.f371507e = list;
        this.f371508f = k12;
        this.f371509g = bVar4;
        this.f371510h = bVar5;
        this.f371511i = bVar6;
        this.f371512j = bVar7;
        this.f371513k = bVar8;
        this.f371514l = list2;
        this.f371515m = list3;
        this.f371516n = c38567u1;
        this.f371517o = k52;
        this.f371518p = str;
        this.f371519q = bVar9;
        this.f371520r = list4;
        this.f371521s = y02;
        this.f371522t = bVar10;
        this.f371523u = y03;
        this.f371524v = bVar11;
        this.f371525w = bVar12;
        this.f371526x = bVar13;
        this.f371527y = list5;
        this.f371528z = list6;
        this.f371494A = c38260a8;
        this.f371495B = t12;
        this.f371496C = b12;
        this.f371497D = b13;
        this.f371498E = list7;
        this.f371499F = bVar14;
        this.f371500G = w8Var;
        this.f371501H = list8;
        this.f371502I = k53;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C38260a8 getF376722J() {
        return this.f371494A;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<F> e() {
        return this.f371507e;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> getAlpha() {
        return this.f371506d;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getBorder, reason: from getter */
    public final K getF376741k() {
        return this.f371508f;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getHeight, reason: from getter */
    public final K5 getF376750t() {
        return this.f371517o;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: getId, reason: from getter */
    public final String getF376752v() {
        return this.f371518p;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivVisibility> getVisibility() {
        return this.f371499F;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getWidth, reason: from getter */
    public final K5 getF376730R() {
        return this.f371502I;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivTooltip> i() {
        return this.f371528z;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> j() {
        return this.f371510h;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final Y0 getF376755y() {
        return this.f371521s;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> l() {
        return this.f371525w;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> m() {
        return this.f371504b;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: n, reason: from getter */
    public final B getF376725M() {
        return this.f371497D;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivTransitionTrigger> o() {
        return this.f371498E;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<C38273c1> p() {
        return this.f371515m;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivAction> q() {
        return this.f371527y;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: r, reason: from getter */
    public final B getF376724L() {
        return this.f371496C;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<w8> s() {
        return this.f371501H;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: t, reason: from getter */
    public final T getF376723K() {
        return this.f371495B;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> u() {
        return this.f371505c;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: v, reason: from getter */
    public final C38567u1 getF376749s() {
        return this.f371516n;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: w, reason: from getter */
    public final DivAccessibility getF376731a() {
        return this.f371503a;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: x, reason: from getter */
    public final Y0 getF376756z() {
        return this.f371523u;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: y, reason: from getter */
    public final w8 getF376728P() {
        return this.f371500G;
    }

    public /* synthetic */ DivGallery(DivAccessibility divAccessibility, com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, List list, K k12, com.yandex.div.json.expressions.b bVar4, com.yandex.div.json.expressions.b bVar5, com.yandex.div.json.expressions.b bVar6, com.yandex.div.json.expressions.b bVar7, com.yandex.div.json.expressions.b bVar8, List list2, List list3, C38567u1 c38567u1, K5 k52, String str, com.yandex.div.json.expressions.b bVar9, List list4, Y0 y02, com.yandex.div.json.expressions.b bVar10, Y0 y03, com.yandex.div.json.expressions.b bVar11, com.yandex.div.json.expressions.b bVar12, com.yandex.div.json.expressions.b bVar13, List list5, List list6, C38260a8 c38260a8, T t12, B b12, B b13, List list7, com.yandex.div.json.expressions.b bVar14, w8 w8Var, List list8, K5 k53, int i12, int i13, C42822w c42822w) {
        this((i12 & 1) != 0 ? f371457K : divAccessibility, (i12 & 2) != 0 ? null : bVar, (i12 & 4) != 0 ? null : bVar2, (i12 & 8) != 0 ? f371458L : bVar3, (i12 & 16) != 0 ? null : list, (i12 & 32) != 0 ? f371459M : k12, (i12 & 64) != 0 ? null : bVar4, (i12 & 128) != 0 ? null : bVar5, (i12 & 256) != 0 ? f371460N : bVar6, (i12 & 512) != 0 ? null : bVar7, (i12 & 1024) != 0 ? f371461O : bVar8, (i12 & 2048) != 0 ? null : list2, (i12 & 4096) != 0 ? null : list3, (i12 & 8192) != 0 ? null : c38567u1, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? f371462P : k52, (32768 & i12) != 0 ? null : str, (65536 & i12) != 0 ? f371463Q : bVar9, list4, (262144 & i12) != 0 ? f371464R : y02, (524288 & i12) != 0 ? f371465S : bVar10, (1048576 & i12) != 0 ? f371466T : y03, (2097152 & i12) != 0 ? f371467U : bVar11, (4194304 & i12) != 0 ? null : bVar12, (8388608 & i12) != 0 ? f371468V : bVar13, (16777216 & i12) != 0 ? null : list5, (33554432 & i12) != 0 ? null : list6, (67108864 & i12) != 0 ? f371469W : c38260a8, (134217728 & i12) != 0 ? null : t12, (268435456 & i12) != 0 ? null : b12, (536870912 & i12) != 0 ? null : b13, (1073741824 & i12) != 0 ? null : list7, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? f371470X : bVar14, (i13 & 1) != 0 ? null : w8Var, (i13 & 2) != 0 ? null : list8, (i13 & 4) != 0 ? f371471Y : k53);
    }
}
