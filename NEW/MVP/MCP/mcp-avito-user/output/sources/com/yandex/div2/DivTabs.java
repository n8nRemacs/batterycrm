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
import shark.AndroidResourceIdNames;

/* compiled from: DivTabs.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div2/DivTabs;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div2/H;", "e", "f", "TabTitleStyle", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class DivTabs implements com.yandex.div.json.b, H {

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public static final e f371991K = new e(null);

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public static final DivAccessibility f371992L = new DivAccessibility(null, null, null, null, null, null, 63, null);

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f371993M = C38492p0.a(1.0d, com.yandex.div.json.expressions.b.f370552a);

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public static final K f371994N = new K(null, null, null, null, null, 31, null);

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Boolean> f371995O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Boolean> f371996P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public static final K5.e f371997Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public static final Y0 f371998R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public static final Y0 f371999S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Boolean> f372000T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Long> f372001U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Integer> f372002V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public static final Y0 f372003W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Boolean> f372004X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public static final TabTitleStyle f372005Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public static final Y0 f372006Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public static final C38260a8 f372007a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivVisibility> f372008b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public static final K5.d f372009c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f372010d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f372011e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f372012f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public static final C38507q6 f372013g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public static final C38498p6 f372014h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public static final C38507q6 f372015i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public static final C38498p6 f372016j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public static final C38498p6 f372017k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final C38507q6 f372018l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final C38498p6 f372019m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final C38507q6 f372020n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final C38498p6 f372021o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public static final C38507q6 f372022p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public static final C38498p6 f372023q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final C38498p6 f372024r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final C38498p6 f372025s0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public final List<DivTooltip> f372026A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final C38260a8 f372027B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public final T f372028C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public final B f372029D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final B f372030E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final List<DivTransitionTrigger> f372031F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivVisibility> f372032G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final w8 f372033H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public final List<w8> f372034I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final K5 f372035J;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DivAccessibility f372036a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f372037b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> f372038c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> f372039d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<F> f372040e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final K f372041f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f372042g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final List<S0> f372043h;

    /* renamed from: i, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Boolean> f372044i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final List<C38273c1> f372045j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final C38567u1 f372046k;

    /* renamed from: l, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Boolean> f372047l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final K5 f372048m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f372049n;

    /* renamed from: o, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final List<f> f372050o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Y0 f372051p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Y0 f372052q;

    /* renamed from: r, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Boolean> f372053r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f372054s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final List<DivAction> f372055t;

    /* renamed from: u, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Long> f372056u;

    /* renamed from: v, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Integer> f372057v;

    /* renamed from: w, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Y0 f372058w;

    /* renamed from: x, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Boolean> f372059x;

    /* renamed from: y, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final TabTitleStyle f372060y;

    /* renamed from: z, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Y0 f372061z;

    /* compiled from: DivTabs.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivTabs$TabTitleStyle;", "Lcom/yandex/div/json/b;", "AnimationType", "h", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class TabTitleStyle implements com.yandex.div.json.b {

        /* renamed from: A, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<Integer> f372062A;

        /* renamed from: B, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<Long> f372063B;

        /* renamed from: C, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<Double> f372064C;

        /* renamed from: D, reason: collision with root package name */
        @Y61.k
        public static final Y0 f372065D;

        /* renamed from: E, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.internal.parser.C f372066E;

        /* renamed from: F, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.internal.parser.C f372067F;

        /* renamed from: G, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.internal.parser.C f372068G;

        /* renamed from: H, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.internal.parser.C f372069H;

        /* renamed from: I, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.internal.parser.C f372070I;

        /* renamed from: J, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.internal.parser.C f372071J;

        /* renamed from: K, reason: collision with root package name */
        @Y61.k
        public static final C38507q6 f372072K;

        /* renamed from: L, reason: collision with root package name */
        @Y61.k
        public static final C38507q6 f372073L;

        /* renamed from: M, reason: collision with root package name */
        @Y61.k
        public static final C38507q6 f372074M;

        /* renamed from: N, reason: collision with root package name */
        @Y61.k
        public static final C38507q6 f372075N;

        /* renamed from: O, reason: collision with root package name */
        @Y61.k
        public static final C38507q6 f372076O;

        /* renamed from: P, reason: collision with root package name */
        @Y61.k
        public static final Y41.p<com.yandex.div.json.e, JSONObject, TabTitleStyle> f372077P;

        /* renamed from: r, reason: collision with root package name */
        @Y61.k
        public static final h f372078r = new h(null);

        /* renamed from: s, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<Integer> f372079s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<Integer> f372080t;

        /* renamed from: u, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<Long> f372081u;

        /* renamed from: v, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<AnimationType> f372082v;

        /* renamed from: w, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<DivFontFamily> f372083w;

        /* renamed from: x, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<Long> f372084x;

        /* renamed from: y, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<DivSizeUnit> f372085y;

        /* renamed from: z, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<DivFontWeight> f372086z;

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<Integer> f372087a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final com.yandex.div.json.expressions.b<DivFontWeight> f372088b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<Integer> f372089c;

        /* renamed from: d, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<Long> f372090d;

        /* renamed from: e, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<AnimationType> f372091e;

        /* renamed from: f, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final com.yandex.div.json.expressions.b<Long> f372092f;

        /* renamed from: g, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final C38501q0 f372093g;

        /* renamed from: h, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<Long> f372094h;

        /* renamed from: i, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<DivSizeUnit> f372095i;

        /* renamed from: j, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<DivFontWeight> f372096j;

        /* renamed from: k, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final com.yandex.div.json.expressions.b<Integer> f372097k;

        /* renamed from: l, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final com.yandex.div.json.expressions.b<DivFontWeight> f372098l;

        /* renamed from: m, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<Integer> f372099m;

        /* renamed from: n, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<Long> f372100n;

        /* renamed from: o, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<Double> f372101o;

        /* renamed from: p, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final com.yandex.div.json.expressions.b<Long> f372102p;

        /* renamed from: q, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final Y0 f372103q;

        /* compiled from: DivTabs.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivTabs$TabTitleStyle$AnimationType;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public enum AnimationType {
            SLIDE("slide"),
            FADE("fade"),
            NONE("none");


            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public static final b f372104c = new b(null);

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public static final Y41.l<String, AnimationType> f372105d = a.f372111l;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f372110b;

            /* compiled from: DivTabs.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivTabs$TabTitleStyle$AnimationType;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
            public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, AnimationType> {

                /* renamed from: l, reason: collision with root package name */
                public static final a f372111l = new a();

                public a() {
                    super(1);
                }

                @Override // Y41.l
                public final AnimationType invoke(String str) {
                    String str2 = str;
                    AnimationType animationType = AnimationType.SLIDE;
                    if (str2.equals("slide")) {
                        return animationType;
                    }
                    AnimationType animationType2 = AnimationType.FADE;
                    if (str2.equals("fade")) {
                        return animationType2;
                    }
                    AnimationType animationType3 = AnimationType.NONE;
                    if (str2.equals("none")) {
                        return animationType3;
                    }
                    return null;
                }
            }

            /* compiled from: DivTabs.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivTabs$TabTitleStyle$AnimationType$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class b {
                public /* synthetic */ b(C42822w c42822w) {
                    this();
                }

                public b() {
                }
            }

            AnimationType(String str) {
                this.f372110b = str;
            }
        }

        /* compiled from: DivTabs.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivTabs$TabTitleStyle;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivTabs$TabTitleStyle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, TabTitleStyle> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f372112l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final TabTitleStyle invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
                com.yandex.div.json.e eVar2 = eVar;
                JSONObject jSONObject2 = jSONObject;
                TabTitleStyle.f372078r.getClass();
                com.yandex.div.json.i f370579a = eVar2.getF370579a();
                Y41.l<Object, Integer> lVar = com.yandex.div.internal.parser.y.f370147a;
                com.yandex.div.json.expressions.b<Integer> bVar = TabTitleStyle.f372079s;
                E.b bVar2 = com.yandex.div.internal.parser.E.f370136f;
                C38106b c38106b = C38107c.f370139a;
                com.yandex.div.json.expressions.b<Integer> bVarI = C38107c.i(jSONObject2, "active_background_color", lVar, c38106b, f370579a, bVar, bVar2);
                if (bVarI != null) {
                    bVar = bVarI;
                }
                DivFontWeight.f371447c.getClass();
                Y41.l<String, DivFontWeight> lVar2 = DivFontWeight.f371448d;
                com.yandex.div.json.expressions.b bVarI2 = C38107c.i(jSONObject2, "active_font_weight", lVar2, c38106b, f370579a, null, TabTitleStyle.f372066E);
                com.yandex.div.json.expressions.b<Integer> bVar3 = TabTitleStyle.f372080t;
                com.yandex.div.json.expressions.b<Integer> bVarI3 = C38107c.i(jSONObject2, "active_text_color", lVar, c38106b, f370579a, bVar3, bVar2);
                if (bVarI3 != null) {
                    bVar3 = bVarI3;
                }
                Y41.l<Number, Long> lVar3 = com.yandex.div.internal.parser.y.f370151e;
                C38507q6 c38507q6 = TabTitleStyle.f372072K;
                com.yandex.div.json.expressions.b<Long> bVar4 = TabTitleStyle.f372081u;
                E.d dVar = com.yandex.div.internal.parser.E.f370132b;
                com.yandex.div.json.expressions.b<Long> bVarI4 = C38107c.i(jSONObject2, "animation_duration", lVar3, c38507q6, f370579a, bVar4, dVar);
                if (bVarI4 != null) {
                    bVar4 = bVarI4;
                }
                AnimationType.f372104c.getClass();
                Y41.l<String, AnimationType> lVar4 = AnimationType.f372105d;
                com.yandex.div.json.expressions.b<AnimationType> bVar5 = TabTitleStyle.f372082v;
                com.yandex.div.json.expressions.b<AnimationType> bVarI5 = C38107c.i(jSONObject2, "animation_type", lVar4, c38106b, f370579a, bVar5, TabTitleStyle.f372067F);
                if (bVarI5 != null) {
                    bVar5 = bVarI5;
                }
                com.yandex.div.json.expressions.b bVarI6 = C38107c.i(jSONObject2, "corner_radius", lVar3, TabTitleStyle.f372073L, f370579a, null, dVar);
                C38501q0.f376135e.getClass();
                C38501q0 c38501q0 = (C38501q0) C38107c.g(jSONObject2, "corners_radius", C38501q0.f376140j, f370579a, eVar2);
                DivFontFamily.f371440c.getClass();
                C38107c.i(jSONObject2, "font_family", DivFontFamily.f371441d, c38106b, f370579a, TabTitleStyle.f372083w, TabTitleStyle.f372068G);
                C38507q6 c38507q62 = TabTitleStyle.f372074M;
                com.yandex.div.json.expressions.b<Long> bVar6 = TabTitleStyle.f372084x;
                com.yandex.div.json.expressions.b<Long> bVarI7 = C38107c.i(jSONObject2, "font_size", lVar3, c38507q62, f370579a, bVar6, dVar);
                if (bVarI7 != null) {
                    bVar6 = bVarI7;
                }
                DivSizeUnit.f371957c.getClass();
                Y41.l<String, DivSizeUnit> lVar5 = DivSizeUnit.f371958d;
                com.yandex.div.json.expressions.b<DivSizeUnit> bVar7 = TabTitleStyle.f372085y;
                com.yandex.div.json.expressions.b<DivSizeUnit> bVarI8 = C38107c.i(jSONObject2, "font_size_unit", lVar5, c38106b, f370579a, bVar7, TabTitleStyle.f372069H);
                if (bVarI8 != null) {
                    bVar7 = bVarI8;
                }
                com.yandex.div.json.expressions.b<DivFontWeight> bVar8 = TabTitleStyle.f372086z;
                com.yandex.div.json.expressions.b<DivFontWeight> bVarI9 = C38107c.i(jSONObject2, "font_weight", lVar2, c38106b, f370579a, bVar8, TabTitleStyle.f372070I);
                if (bVarI9 != null) {
                    bVar8 = bVarI9;
                }
                com.yandex.div.json.expressions.b bVarI10 = C38107c.i(jSONObject2, "inactive_background_color", lVar, c38106b, f370579a, null, bVar2);
                com.yandex.div.json.expressions.b bVarI11 = C38107c.i(jSONObject2, "inactive_font_weight", lVar2, c38106b, f370579a, null, TabTitleStyle.f372071J);
                com.yandex.div.json.expressions.b<Integer> bVar9 = TabTitleStyle.f372062A;
                com.yandex.div.json.expressions.b<Integer> bVarI12 = C38107c.i(jSONObject2, "inactive_text_color", lVar, c38106b, f370579a, bVar9, bVar2);
                com.yandex.div.json.expressions.b<Integer> bVar10 = bVarI12 == null ? bVar9 : bVarI12;
                C38507q6 c38507q63 = TabTitleStyle.f372075N;
                com.yandex.div.json.expressions.b<Long> bVar11 = TabTitleStyle.f372063B;
                com.yandex.div.json.expressions.b<Long> bVarI13 = C38107c.i(jSONObject2, "item_spacing", lVar3, c38507q63, f370579a, bVar11, dVar);
                com.yandex.div.json.expressions.b<Long> bVar12 = bVarI13 == null ? bVar11 : bVarI13;
                Y41.l<Number, Double> lVar6 = com.yandex.div.internal.parser.y.f370150d;
                com.yandex.div.json.expressions.b<Double> bVar13 = TabTitleStyle.f372064C;
                com.yandex.div.json.expressions.b<Double> bVarI14 = C38107c.i(jSONObject2, "letter_spacing", lVar6, c38106b, f370579a, bVar13, com.yandex.div.internal.parser.E.f370134d);
                com.yandex.div.json.expressions.b<Double> bVar14 = bVarI14 == null ? bVar13 : bVarI14;
                com.yandex.div.json.expressions.b bVarI15 = C38107c.i(jSONObject2, "line_height", lVar3, TabTitleStyle.f372076O, f370579a, null, dVar);
                Y0.f374024f.getClass();
                Y0 y02 = (Y0) C38107c.g(jSONObject2, "paddings", Y0.f374035q, f370579a, eVar2);
                if (y02 == null) {
                    y02 = TabTitleStyle.f372065D;
                }
                return new TabTitleStyle(bVar, bVarI2, bVar3, bVar4, bVar5, bVarI6, c38501q0, bVar6, bVar7, bVar8, bVarI10, bVarI11, bVar10, bVar12, bVar14, bVarI15, y02);
            }
        }

        /* compiled from: DivTabs.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f372113l = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        }

        /* compiled from: DivTabs.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class c extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final c f372114l = new c();

            public c() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof AnimationType);
            }
        }

        /* compiled from: DivTabs.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class d extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final d f372115l = new d();

            public d() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivFontFamily);
            }
        }

        /* compiled from: DivTabs.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class e extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final e f372116l = new e();

            public e() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        }

        /* compiled from: DivTabs.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class f extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final f f372117l = new f();

            public f() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        }

        /* compiled from: DivTabs.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class g extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final g f372118l = new g();

            public g() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        }

        /* compiled from: DivTabs.kt */
        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0007R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0007R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\rR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0007R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\rR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\rR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00170'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001a0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)¨\u0006/"}, d2 = {"Lcom/yandex/div2/DivTabs$TabTitleStyle$h;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "ACTIVE_BACKGROUND_COLOR_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "ACTIVE_TEXT_COLOR_DEFAULT_VALUE", "", "ANIMATION_DURATION_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/F;", "ANIMATION_DURATION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "ANIMATION_DURATION_VALIDATOR", "Lcom/yandex/div2/DivTabs$TabTitleStyle$AnimationType;", "ANIMATION_TYPE_DEFAULT_VALUE", "CORNER_RADIUS_TEMPLATE_VALIDATOR", "CORNER_RADIUS_VALIDATOR", "Lcom/yandex/div2/DivFontFamily;", "FONT_FAMILY_DEFAULT_VALUE", "FONT_SIZE_DEFAULT_VALUE", "FONT_SIZE_TEMPLATE_VALIDATOR", "Lcom/yandex/div2/DivSizeUnit;", "FONT_SIZE_UNIT_DEFAULT_VALUE", "FONT_SIZE_VALIDATOR", "Lcom/yandex/div2/DivFontWeight;", "FONT_WEIGHT_DEFAULT_VALUE", "INACTIVE_TEXT_COLOR_DEFAULT_VALUE", "ITEM_SPACING_DEFAULT_VALUE", "ITEM_SPACING_TEMPLATE_VALIDATOR", "ITEM_SPACING_VALIDATOR", "", "LETTER_SPACING_DEFAULT_VALUE", "LINE_HEIGHT_TEMPLATE_VALIDATOR", "LINE_HEIGHT_VALIDATOR", "Lcom/yandex/div2/Y0;", "PADDINGS_DEFAULT_VALUE", "Lcom/yandex/div2/Y0;", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_ACTIVE_FONT_WEIGHT", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_ANIMATION_TYPE", "TYPE_HELPER_FONT_FAMILY", "TYPE_HELPER_FONT_SIZE_UNIT", "TYPE_HELPER_FONT_WEIGHT", "TYPE_HELPER_INACTIVE_FONT_WEIGHT", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class h {
            public /* synthetic */ h(C42822w c42822w) {
                this();
            }

            public h() {
            }
        }

        static {
            com.yandex.div.json.expressions.b.f370552a.getClass();
            f372079s = b.a.a(-9120);
            f372080t = b.a.a(-872415232);
            f372081u = b.a.a(300L);
            f372082v = b.a.a(AnimationType.SLIDE);
            f372083w = b.a.a(DivFontFamily.TEXT);
            f372084x = b.a.a(12L);
            f372085y = b.a.a(DivSizeUnit.SP);
            f372086z = b.a.a(DivFontWeight.REGULAR);
            f372062A = b.a.a(Integer.valueOf(BeduinInputModel.MIN_TEXT_VERSION));
            f372063B = b.a.a(0L);
            f372064C = b.a.a(Double.valueOf(0.0d));
            f372065D = new Y0(b.a.a(6L), b.a.a(8L), b.a.a(8L), b.a.a(6L), null, 16, null);
            D.a aVar = com.yandex.div.internal.parser.D.f370129a;
            Object objC = C42756l.C(DivFontWeight.values());
            b bVar = b.f372113l;
            aVar.getClass();
            f372066E = new com.yandex.div.internal.parser.C(bVar, objC);
            f372067F = new com.yandex.div.internal.parser.C(c.f372114l, C42756l.C(AnimationType.values()));
            f372068G = new com.yandex.div.internal.parser.C(d.f372115l, C42756l.C(DivFontFamily.values()));
            f372069H = new com.yandex.div.internal.parser.C(e.f372116l, C42756l.C(DivSizeUnit.values()));
            f372070I = new com.yandex.div.internal.parser.C(f.f372117l, C42756l.C(DivFontWeight.values()));
            f372071J = new com.yandex.div.internal.parser.C(g.f372118l, C42756l.C(DivFontWeight.values()));
            f372072K = new C38507q6(14);
            f372073L = new C38507q6(15);
            f372074M = new C38507q6(16);
            f372075N = new C38507q6(17);
            f372076O = new C38507q6(18);
            f372077P = a.f372112l;
        }

        @C21.b
        public TabTitleStyle() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
        }

        @C21.b
        public TabTitleStyle(@Y61.k com.yandex.div.json.expressions.b bVar, @Y61.l com.yandex.div.json.expressions.b bVar2, @Y61.k com.yandex.div.json.expressions.b bVar3, @Y61.k com.yandex.div.json.expressions.b bVar4, @Y61.k com.yandex.div.json.expressions.b bVar5, @Y61.l com.yandex.div.json.expressions.b bVar6, @Y61.l C38501q0 c38501q0, @Y61.k com.yandex.div.json.expressions.b bVar7, @Y61.k com.yandex.div.json.expressions.b bVar8, @Y61.k com.yandex.div.json.expressions.b bVar9, @Y61.l com.yandex.div.json.expressions.b bVar10, @Y61.l com.yandex.div.json.expressions.b bVar11, @Y61.k com.yandex.div.json.expressions.b bVar12, @Y61.k com.yandex.div.json.expressions.b bVar13, @Y61.k com.yandex.div.json.expressions.b bVar14, @Y61.l com.yandex.div.json.expressions.b bVar15, @Y61.k Y0 y02) {
            this.f372087a = bVar;
            this.f372088b = bVar2;
            this.f372089c = bVar3;
            this.f372090d = bVar4;
            this.f372091e = bVar5;
            this.f372092f = bVar6;
            this.f372093g = c38501q0;
            this.f372094h = bVar7;
            this.f372095i = bVar8;
            this.f372096j = bVar9;
            this.f372097k = bVar10;
            this.f372098l = bVar11;
            this.f372099m = bVar12;
            this.f372100n = bVar13;
            this.f372101o = bVar14;
            this.f372102p = bVar15;
            this.f372103q = y02;
        }

        public /* synthetic */ TabTitleStyle(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, com.yandex.div.json.expressions.b bVar4, com.yandex.div.json.expressions.b bVar5, com.yandex.div.json.expressions.b bVar6, C38501q0 c38501q0, com.yandex.div.json.expressions.b bVar7, com.yandex.div.json.expressions.b bVar8, com.yandex.div.json.expressions.b bVar9, com.yandex.div.json.expressions.b bVar10, com.yandex.div.json.expressions.b bVar11, com.yandex.div.json.expressions.b bVar12, com.yandex.div.json.expressions.b bVar13, com.yandex.div.json.expressions.b bVar14, com.yandex.div.json.expressions.b bVar15, com.yandex.div.json.expressions.b bVar16, Y0 y02, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? f372079s : bVar, (i12 & 2) != 0 ? null : bVar2, (i12 & 4) != 0 ? f372080t : bVar3, (i12 & 8) != 0 ? f372081u : bVar4, (i12 & 16) != 0 ? f372082v : bVar5, (i12 & 32) != 0 ? null : bVar6, (i12 & 64) != 0 ? null : c38501q0, (i12 & 256) != 0 ? f372084x : bVar8, (i12 & 512) != 0 ? f372085y : bVar9, (i12 & 1024) != 0 ? f372086z : bVar10, (i12 & 2048) != 0 ? null : bVar11, (i12 & 4096) != 0 ? null : bVar12, (i12 & 8192) != 0 ? f372062A : bVar13, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? f372063B : bVar14, (i12 & 32768) != 0 ? f372064C : bVar15, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) == 0 ? bVar16 : null, (i12 & 131072) != 0 ? f372065D : y02);
        }
    }

    /* compiled from: DivTabs.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivTabs;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivTabs;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, DivTabs> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f372119l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final DivTabs invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            DivTabs.f371991K.getClass();
            return e.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivTabs.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f372120l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivTabs.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f372121l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivTabs.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f372122l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivTabs.kt */
    @Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\rR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\rR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0012R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\nR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\rR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\rR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0012R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\nR\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\rR\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\rR\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\nR\u0014\u00106\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010*R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\nR\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010*R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0012R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0012R\u0014\u0010C\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010HR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0012R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020K0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\nR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Lcom/yandex/div2/DivTabs$e;", "", "<init>", "()V", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/b;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/F;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/K;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/K;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/S0;", "DISAPPEAR_ACTIONS_VALIDATOR", "", "DYNAMIC_HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/c1;", "EXTENSIONS_VALIDATOR", "HAS_SEPARATOR_DEFAULT_VALUE", "Lcom/yandex/div2/K5$e;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/K5$e;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/DivTabs$f;", "ITEMS_VALIDATOR", "Lcom/yandex/div2/Y0;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/Y0;", "PADDINGS_DEFAULT_VALUE", "RESTRICT_PARENT_SCROLL_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "SELECTED_TAB_DEFAULT_VALUE", "SELECTED_TAB_TEMPLATE_VALIDATOR", "SELECTED_TAB_VALIDATOR", "", "SEPARATOR_COLOR_DEFAULT_VALUE", "SEPARATOR_PADDINGS_DEFAULT_VALUE", "SWITCH_TABS_BY_CONTENT_SWIPE_ENABLED_DEFAULT_VALUE", "Lcom/yandex/div2/DivTabs$TabTitleStyle;", "TAB_TITLE_STYLE_DEFAULT_VALUE", "Lcom/yandex/div2/DivTabs$TabTitleStyle;", "TITLE_PADDINGS_DEFAULT_VALUE", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/a8;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/a8;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/w8;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e {
        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static DivTabs a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            DivAccessibility.f371175f.getClass();
            DivAccessibility divAccessibility = (DivAccessibility) C38107c.g(jSONObject, "accessibility", DivAccessibility.f371182m, f370579a, eVar);
            if (divAccessibility == null) {
                divAccessibility = DivTabs.f371992L;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            DivAlignmentHorizontal.f371238c.getClass();
            Y41.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.f371239d;
            com.yandex.div.internal.parser.C c12 = DivTabs.f372010d0;
            C38106b c38106b = C38107c.f370139a;
            com.yandex.div.json.expressions.b bVarI = C38107c.i(jSONObject, "alignment_horizontal", lVar, c38106b, f370579a, null, c12);
            DivAlignmentVertical.f371246c.getClass();
            com.yandex.div.json.expressions.b bVarI2 = C38107c.i(jSONObject, "alignment_vertical", DivAlignmentVertical.f371247d, c38106b, f370579a, null, DivTabs.f372011e0);
            Y41.l<Number, Double> lVar2 = com.yandex.div.internal.parser.y.f370150d;
            C38507q6 c38507q6 = DivTabs.f372013g0;
            com.yandex.div.json.expressions.b<Double> bVar = DivTabs.f371993M;
            com.yandex.div.json.expressions.b<Double> bVarI3 = C38107c.i(jSONObject, "alpha", lVar2, c38507q6, f370579a, bVar, com.yandex.div.internal.parser.E.f370134d);
            com.yandex.div.json.expressions.b<Double> bVar2 = bVarI3 == null ? bVar : bVarI3;
            F.f372262a.getClass();
            List listK = C38107c.k(jSONObject, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, F.f372263b, DivTabs.f372014h0, f370579a, eVar);
            K.f372635f.getClass();
            K k12 = (K) C38107c.g(jSONObject, "border", K.f372638i, f370579a, eVar);
            if (k12 == null) {
                k12 = DivTabs.f371994N;
            }
            K k13 = k12;
            Y41.l<Number, Long> lVar3 = com.yandex.div.internal.parser.y.f370151e;
            C38507q6 c38507q62 = DivTabs.f372015i0;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            com.yandex.div.json.expressions.b bVarI4 = C38107c.i(jSONObject, "column_span", lVar3, c38507q62, f370579a, null, dVar);
            S0.f373492a.getClass();
            List listK2 = C38107c.k(jSONObject, "disappear_actions", S0.f373500i, DivTabs.f372016j0, f370579a, eVar);
            Y41.l<Object, Boolean> lVar4 = com.yandex.div.internal.parser.y.f370149c;
            com.yandex.div.json.expressions.b<Boolean> bVar3 = DivTabs.f371995O;
            E.a aVar = com.yandex.div.internal.parser.E.f370131a;
            com.yandex.div.json.expressions.b<Boolean> bVarI5 = C38107c.i(jSONObject, "dynamic_height", lVar4, c38106b, f370579a, bVar3, aVar);
            com.yandex.div.json.expressions.b<Boolean> bVar4 = bVarI5 == null ? bVar3 : bVarI5;
            C38273c1.f374687c.getClass();
            List listK3 = C38107c.k(jSONObject, AttachMenuItem.File.EXTENSIONS, C38273c1.f374689e, DivTabs.f372017k0, f370579a, eVar);
            C38567u1.f376619f.getClass();
            C38567u1 c38567u1 = (C38567u1) C38107c.g(jSONObject, "focus", C38567u1.f376624k, f370579a, eVar);
            com.yandex.div.json.expressions.b<Boolean> bVar5 = DivTabs.f371996P;
            com.yandex.div.json.expressions.b<Boolean> bVarI6 = C38107c.i(jSONObject, "has_separator", lVar4, c38106b, f370579a, bVar5, aVar);
            com.yandex.div.json.expressions.b<Boolean> bVar6 = bVarI6 == null ? bVar5 : bVarI6;
            K5.f372712a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, K5> pVar = K5.f372713b;
            K5 k52 = (K5) C38107c.g(jSONObject, "height", pVar, f370579a, eVar);
            if (k52 == null) {
                k52 = DivTabs.f371997Q;
            }
            K5 k53 = k52;
            String str = (String) C38107c.h(jSONObject, "id", C38107c.f370141c, DivTabs.f372018l0, f370579a);
            f.f372123d.getClass();
            List listF = C38107c.f(jSONObject, "items", f.f372125f, DivTabs.f372019m0, f370579a, eVar);
            Y0.f374024f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, Y0> pVar2 = Y0.f374035q;
            Y0 y02 = (Y0) C38107c.g(jSONObject, "margins", pVar2, f370579a, eVar);
            if (y02 == null) {
                y02 = DivTabs.f371998R;
            }
            Y0 y03 = y02;
            Y0 y04 = (Y0) C38107c.g(jSONObject, "paddings", pVar2, f370579a, eVar);
            if (y04 == null) {
                y04 = DivTabs.f371999S;
            }
            Y0 y05 = y04;
            com.yandex.div.json.expressions.b<Boolean> bVar7 = DivTabs.f372000T;
            com.yandex.div.json.expressions.b<Boolean> bVarI7 = C38107c.i(jSONObject, "restrict_parent_scroll", lVar4, c38106b, f370579a, bVar7, aVar);
            com.yandex.div.json.expressions.b<Boolean> bVar8 = bVarI7 == null ? bVar7 : bVarI7;
            com.yandex.div.json.expressions.b bVarI8 = C38107c.i(jSONObject, "row_span", lVar3, DivTabs.f372020n0, f370579a, null, dVar);
            DivAction.f371211f.getClass();
            List listK4 = C38107c.k(jSONObject, "selected_actions", DivAction.f371215j, DivTabs.f372021o0, f370579a, eVar);
            C38507q6 c38507q63 = DivTabs.f372022p0;
            com.yandex.div.json.expressions.b<Long> bVar9 = DivTabs.f372001U;
            com.yandex.div.json.expressions.b<Long> bVarI9 = C38107c.i(jSONObject, "selected_tab", lVar3, c38507q63, f370579a, bVar9, dVar);
            com.yandex.div.json.expressions.b<Long> bVar10 = bVarI9 == null ? bVar9 : bVarI9;
            Y41.l<Object, Integer> lVar5 = com.yandex.div.internal.parser.y.f370147a;
            com.yandex.div.json.expressions.b<Integer> bVar11 = DivTabs.f372002V;
            com.yandex.div.json.expressions.b<Integer> bVarI10 = C38107c.i(jSONObject, "separator_color", lVar5, c38106b, f370579a, bVar11, com.yandex.div.internal.parser.E.f370136f);
            com.yandex.div.json.expressions.b<Integer> bVar12 = bVarI10 == null ? bVar11 : bVarI10;
            Y0 y06 = (Y0) C38107c.g(jSONObject, "separator_paddings", pVar2, f370579a, eVar);
            if (y06 == null) {
                y06 = DivTabs.f372003W;
            }
            Y0 y07 = y06;
            com.yandex.div.json.expressions.b<Boolean> bVar13 = DivTabs.f372004X;
            com.yandex.div.json.expressions.b<Boolean> bVarI11 = C38107c.i(jSONObject, "switch_tabs_by_content_swipe_enabled", lVar4, c38106b, f370579a, bVar13, aVar);
            com.yandex.div.json.expressions.b<Boolean> bVar14 = bVarI11 == null ? bVar13 : bVarI11;
            TabTitleStyle.f372078r.getClass();
            TabTitleStyle tabTitleStyle = (TabTitleStyle) C38107c.g(jSONObject, "tab_title_style", TabTitleStyle.f372077P, f370579a, eVar);
            if (tabTitleStyle == null) {
                tabTitleStyle = DivTabs.f372005Y;
            }
            TabTitleStyle tabTitleStyle2 = tabTitleStyle;
            Y0 y08 = (Y0) C38107c.g(jSONObject, "title_paddings", pVar2, f370579a, eVar);
            if (y08 == null) {
                y08 = DivTabs.f372006Z;
            }
            Y0 y09 = y08;
            DivTooltip.f372130h.getClass();
            List listK5 = C38107c.k(jSONObject, "tooltips", DivTooltip.f372135m, DivTabs.f372023q0, f370579a, eVar);
            C38260a8.f374376d.getClass();
            C38260a8 c38260a8 = (C38260a8) C38107c.g(jSONObject, "transform", C38260a8.f374379g, f370579a, eVar);
            if (c38260a8 == null) {
                c38260a8 = DivTabs.f372007a0;
            }
            C38260a8 c38260a82 = c38260a8;
            T.f373510a.getClass();
            T t12 = (T) C38107c.g(jSONObject, "transition_change", T.f373511b, f370579a, eVar);
            B.f370624a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, B> pVar3 = B.f370625b;
            B b12 = (B) C38107c.g(jSONObject, "transition_in", pVar3, f370579a, eVar);
            B b13 = (B) C38107c.g(jSONObject, "transition_out", pVar3, f370579a, eVar);
            DivTransitionTrigger.f372167c.getClass();
            Y41.l<String, DivTransitionTrigger> lVar6 = DivTransitionTrigger.f372168d;
            C38498p6 c38498p6 = DivTabs.f372024r0;
            C38106b c38106b2 = C38107c.f370139a;
            List listJ = C38107c.j(jSONObject, "transition_triggers", lVar6, c38498p6, f370579a);
            DivVisibility.f372192c.getClass();
            Y41.l<String, DivVisibility> lVar7 = DivVisibility.f372193d;
            com.yandex.div.json.expressions.b<DivVisibility> bVar15 = DivTabs.f372008b0;
            com.yandex.div.json.expressions.b<DivVisibility> bVarI12 = C38107c.i(jSONObject, "visibility", lVar7, c38106b2, f370579a, bVar15, DivTabs.f372012f0);
            com.yandex.div.json.expressions.b<DivVisibility> bVar16 = bVarI12 == null ? bVar15 : bVarI12;
            w8.f376942h.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, w8> pVar4 = w8.f376950p;
            w8 w8Var = (w8) C38107c.g(jSONObject, "visibility_action", pVar4, f370579a, eVar);
            List listK6 = C38107c.k(jSONObject, "visibility_actions", pVar4, DivTabs.f372025s0, f370579a, eVar);
            K5 k54 = (K5) C38107c.g(jSONObject, "width", pVar, f370579a, eVar);
            if (k54 == null) {
                k54 = DivTabs.f372009c0;
            }
            return new DivTabs(divAccessibility2, bVarI, bVarI2, bVar2, listK, k13, bVarI4, listK2, bVar4, listK3, c38567u1, bVar6, k53, str, listF, y03, y05, bVar8, bVarI8, listK4, bVar10, bVar12, y07, bVar14, tabTitleStyle2, y09, listK5, c38260a82, t12, b12, b13, listJ, bVar16, w8Var, listK6, k54);
        }

        public e() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Boolean bool = Boolean.FALSE;
        f371995O = b.a.a(bool);
        f371996P = b.a.a(bool);
        f371997Q = new K5.e(new y8(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        com.yandex.div.json.expressions.b bVar = null;
        com.yandex.div.json.expressions.b bVar2 = null;
        f371998R = new Y0(null, null, null, bVar, bVar2, 31, null);
        C42822w c42822w = null;
        f371999S = new Y0(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 31, c42822w);
        f372000T = b.a.a(bool);
        f372001U = b.a.a(0L);
        f372002V = b.a.a(335544320);
        int i12 = 16;
        f372003W = new Y0(b.a.a(0L), b.a.a(12L), b.a.a(12L), b.a.a(0L), null == true ? 1 : 0, i12, c42822w);
        f372004X = b.a.a(Boolean.TRUE);
        f372005Y = new TabTitleStyle(null == true ? 1 : 0, bVar, bVar2, null, null == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
        f372006Z = new Y0(b.a.a(8L), b.a.a(12L), b.a.a(12L), b.a.a(0L), null == true ? 1 : 0, i12, c42822w);
        f372007a0 = new C38260a8(null, null == true ? 1 : 0, bVar, 7, null == true ? 1 : 0);
        f372008b0 = b.a.a(DivVisibility.VISIBLE);
        f372009c0 = new K5.d(new U3(null == true ? 1 : 0, 1, null == true ? 1 : 0));
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAlignmentHorizontal.values());
        b bVar3 = b.f372120l;
        aVar.getClass();
        f372010d0 = new com.yandex.div.internal.parser.C(bVar3, objC);
        f372011e0 = new com.yandex.div.internal.parser.C(c.f372121l, C42756l.C(DivAlignmentVertical.values()));
        f372012f0 = new com.yandex.div.internal.parser.C(d.f372122l, C42756l.C(DivVisibility.values()));
        f372013g0 = new C38507q6(11);
        f372014h0 = new C38498p6(24);
        f372015i0 = new C38507q6(12);
        f372016j0 = new C38498p6(25);
        f372017k0 = new C38498p6(18);
        f372018l0 = new C38507q6(9);
        f372019m0 = new C38498p6(19);
        f372020n0 = new C38507q6(8);
        f372021o0 = new C38498p6(20);
        f372022p0 = new C38507q6(10);
        f372023q0 = new C38498p6(21);
        f372024r0 = new C38498p6(22);
        f372025s0 = new C38498p6(23);
        int i13 = a.f372119l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public DivTabs(@Y61.k DivAccessibility divAccessibility, @Y61.l com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar, @Y61.l com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar2, @Y61.k com.yandex.div.json.expressions.b<Double> bVar3, @Y61.l List<? extends F> list, @Y61.k K k12, @Y61.l com.yandex.div.json.expressions.b<Long> bVar4, @Y61.l List<? extends S0> list2, @Y61.k com.yandex.div.json.expressions.b<Boolean> bVar5, @Y61.l List<? extends C38273c1> list3, @Y61.l C38567u1 c38567u1, @Y61.k com.yandex.div.json.expressions.b<Boolean> bVar6, @Y61.k K5 k52, @Y61.l String str, @Y61.k List<? extends f> list4, @Y61.k Y0 y02, @Y61.k Y0 y03, @Y61.k com.yandex.div.json.expressions.b<Boolean> bVar7, @Y61.l com.yandex.div.json.expressions.b<Long> bVar8, @Y61.l List<? extends DivAction> list5, @Y61.k com.yandex.div.json.expressions.b<Long> bVar9, @Y61.k com.yandex.div.json.expressions.b<Integer> bVar10, @Y61.k Y0 y04, @Y61.k com.yandex.div.json.expressions.b<Boolean> bVar11, @Y61.k TabTitleStyle tabTitleStyle, @Y61.k Y0 y05, @Y61.l List<? extends DivTooltip> list6, @Y61.k C38260a8 c38260a8, @Y61.l T t12, @Y61.l B b12, @Y61.l B b13, @Y61.l List<? extends DivTransitionTrigger> list7, @Y61.k com.yandex.div.json.expressions.b<DivVisibility> bVar12, @Y61.l w8 w8Var, @Y61.l List<? extends w8> list8, @Y61.k K5 k53) {
        this.f372036a = divAccessibility;
        this.f372037b = bVar;
        this.f372038c = bVar2;
        this.f372039d = bVar3;
        this.f372040e = list;
        this.f372041f = k12;
        this.f372042g = bVar4;
        this.f372043h = list2;
        this.f372044i = bVar5;
        this.f372045j = list3;
        this.f372046k = c38567u1;
        this.f372047l = bVar6;
        this.f372048m = k52;
        this.f372049n = str;
        this.f372050o = list4;
        this.f372051p = y02;
        this.f372052q = y03;
        this.f372053r = bVar7;
        this.f372054s = bVar8;
        this.f372055t = list5;
        this.f372056u = bVar9;
        this.f372057v = bVar10;
        this.f372058w = y04;
        this.f372059x = bVar11;
        this.f372060y = tabTitleStyle;
        this.f372061z = y05;
        this.f372026A = list6;
        this.f372027B = c38260a8;
        this.f372028C = t12;
        this.f372029D = b12;
        this.f372030E = b13;
        this.f372031F = list7;
        this.f372032G = bVar12;
        this.f372033H = w8Var;
        this.f372034I = list8;
        this.f372035J = k53;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C38260a8 getF371934x() {
        return this.f372027B;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<F> e() {
        return this.f372040e;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> getAlpha() {
        return this.f372039d;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getBorder, reason: from getter */
    public final K getF371919i() {
        return this.f372041f;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getHeight, reason: from getter */
    public final K5 getF371926p() {
        return this.f372048m;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: getId, reason: from getter */
    public final String getF371927q() {
        return this.f372049n;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivVisibility> getVisibility() {
        return this.f372032G;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getWidth, reason: from getter */
    public final K5 getF371910F() {
        return this.f372035J;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivTooltip> i() {
        return this.f372026A;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> j() {
        return this.f372042g;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final Y0 getF371929s() {
        return this.f372051p;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> l() {
        return this.f372054s;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> m() {
        return this.f372037b;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: n, reason: from getter */
    public final B getF371905A() {
        return this.f372030E;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivTransitionTrigger> o() {
        return this.f372031F;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<C38273c1> p() {
        return this.f372045j;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivAction> q() {
        return this.f372055t;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: r, reason: from getter */
    public final B getF371830z() {
        return this.f372029D;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<w8> s() {
        return this.f372034I;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: t, reason: from getter */
    public final T getF371829y() {
        return this.f372028C;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> u() {
        return this.f372038c;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: v, reason: from getter */
    public final C38567u1 getF371815k() {
        return this.f372046k;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: w, reason: from getter */
    public final DivAccessibility getF371805a() {
        return this.f372036a;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: x, reason: from getter */
    public final Y0 getF371823s() {
        return this.f372052q;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: y, reason: from getter */
    public final w8 getF371802D() {
        return this.f372033H;
    }

    /* compiled from: DivTabs.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivTabs$f;", "Lcom/yandex/div/json/b;", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class f implements com.yandex.div.json.b {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final b f372123d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final C38507q6 f372124e = new C38507q6(13);

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public static final Y41.p<com.yandex.div.json.e, JSONObject, f> f372125f = a.f372129l;

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final AbstractC38330g f372126a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<String> f372127b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final DivAction f372128c;

        /* compiled from: DivTabs.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivTabs$f;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivTabs$f;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, f> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f372129l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final f invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
                com.yandex.div.json.e eVar2 = eVar;
                JSONObject jSONObject2 = jSONObject;
                f.f372123d.getClass();
                com.yandex.div.json.i f370579a = eVar2.getF370579a();
                AbstractC38330g.f375012a.getClass();
                AbstractC38330g abstractC38330g = (AbstractC38330g) C38107c.b(jSONObject2, "div", AbstractC38330g.f375013b, eVar2);
                com.yandex.div.json.expressions.b bVarC = C38107c.c(jSONObject2, "title", C38107c.f370141c, f.f372124e, f370579a, com.yandex.div.internal.parser.E.f370133c);
                DivAction.f371211f.getClass();
                return new f(abstractC38330g, bVarC, (DivAction) C38107c.g(jSONObject2, "title_click_action", DivAction.f371215j, f370579a, eVar2));
            }
        }

        /* compiled from: DivTabs.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div2/DivTabs$f$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/parser/F;", "", "TITLE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "TITLE_VALIDATOR", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        @C21.b
        public f(@Y61.k AbstractC38330g abstractC38330g, @Y61.k com.yandex.div.json.expressions.b<String> bVar, @Y61.l DivAction divAction) {
            this.f372126a = abstractC38330g;
            this.f372127b = bVar;
            this.f372128c = divAction;
        }

        public /* synthetic */ f(AbstractC38330g abstractC38330g, com.yandex.div.json.expressions.b bVar, DivAction divAction, int i12, C42822w c42822w) {
            this(abstractC38330g, bVar, (i12 & 4) != 0 ? null : divAction);
        }
    }

    public /* synthetic */ DivTabs(DivAccessibility divAccessibility, com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, List list, K k12, com.yandex.div.json.expressions.b bVar4, List list2, com.yandex.div.json.expressions.b bVar5, List list3, C38567u1 c38567u1, com.yandex.div.json.expressions.b bVar6, K5 k52, String str, List list4, Y0 y02, Y0 y03, com.yandex.div.json.expressions.b bVar7, com.yandex.div.json.expressions.b bVar8, List list5, com.yandex.div.json.expressions.b bVar9, com.yandex.div.json.expressions.b bVar10, Y0 y04, com.yandex.div.json.expressions.b bVar11, TabTitleStyle tabTitleStyle, Y0 y05, List list6, C38260a8 c38260a8, T t12, B b12, B b13, List list7, com.yandex.div.json.expressions.b bVar12, w8 w8Var, List list8, K5 k53, int i12, int i13, C42822w c42822w) {
        this((i12 & 1) != 0 ? f371992L : divAccessibility, (i12 & 2) != 0 ? null : bVar, (i12 & 4) != 0 ? null : bVar2, (i12 & 8) != 0 ? f371993M : bVar3, (i12 & 16) != 0 ? null : list, (i12 & 32) != 0 ? f371994N : k12, (i12 & 64) != 0 ? null : bVar4, (i12 & 128) != 0 ? null : list2, (i12 & 256) != 0 ? f371995O : bVar5, (i12 & 512) != 0 ? null : list3, (i12 & 1024) != 0 ? null : c38567u1, (i12 & 2048) != 0 ? f371996P : bVar6, (i12 & 4096) != 0 ? f371997Q : k52, (i12 & 8192) != 0 ? null : str, list4, (32768 & i12) != 0 ? f371998R : y02, (65536 & i12) != 0 ? f371999S : y03, (131072 & i12) != 0 ? f372000T : bVar7, (262144 & i12) != 0 ? null : bVar8, (524288 & i12) != 0 ? null : list5, (1048576 & i12) != 0 ? f372001U : bVar9, (2097152 & i12) != 0 ? f372002V : bVar10, (4194304 & i12) != 0 ? f372003W : y04, (8388608 & i12) != 0 ? f372004X : bVar11, (16777216 & i12) != 0 ? f372005Y : tabTitleStyle, (33554432 & i12) != 0 ? f372006Z : y05, (67108864 & i12) != 0 ? null : list6, (134217728 & i12) != 0 ? f372007a0 : c38260a8, (268435456 & i12) != 0 ? null : t12, (536870912 & i12) != 0 ? null : b12, (1073741824 & i12) != 0 ? null : b13, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : list7, (i13 & 1) != 0 ? f372008b0 : bVar12, (i13 & 2) != 0 ? null : w8Var, (i13 & 4) != 0 ? null : list8, (i13 & 8) != 0 ? f372009c0 : k53);
    }
}
