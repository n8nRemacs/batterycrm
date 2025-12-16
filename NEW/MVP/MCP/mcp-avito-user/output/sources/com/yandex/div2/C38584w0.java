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
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;

/* compiled from: DivCustom.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/w0;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div2/H;", "e", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div2.w0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38584w0 implements com.yandex.div.json.b, H {

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public static final e f376820D = new e(null);

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public static final DivAccessibility f376821E = new DivAccessibility(null, null, null, null, null, null, 63, null);

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f376822F = C38492p0.a(1.0d, com.yandex.div.json.expressions.b.f370552a);

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public static final K f376823G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public static final K5.e f376824H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public static final Y0 f376825I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public static final Y0 f376826J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public static final C38260a8 f376827K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivVisibility> f376828L = b.a.a(DivVisibility.VISIBLE);

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public static final K5.d f376829M = new K5.d(new U3(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0));

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f376830N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f376831O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f376832P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public static final C38492p0 f376833Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public static final C38302f0 f376834R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public static final C38492p0 f376835S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public static final C38302f0 f376836T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public static final C38302f0 f376837U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public static final C38492p0 f376838V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public static final C38302f0 f376839W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public static final C38492p0 f376840X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public static final C38302f0 f376841Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public static final C38302f0 f376842Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public static final C38302f0 f376843a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public static final C38302f0 f376844b0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public final w8 f376845A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final List<w8> f376846B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final K5 f376847C;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DivAccessibility f376848a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f376849b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> f376850c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> f376851d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<F> f376852e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final K f376853f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f376854g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final JSONObject f376855h;

    /* renamed from: i, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final String f376856i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final List<S0> f376857j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final List<C38273c1> f376858k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final C38567u1 f376859l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final K5 f376860m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f376861n;

    /* renamed from: o, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<AbstractC38330g> f376862o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Y0 f376863p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Y0 f376864q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f376865r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final List<DivAction> f376866s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final List<DivTooltip> f376867t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final C38260a8 f376868u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final T f376869v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final B f376870w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final B f376871x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final List<DivTransitionTrigger> f376872y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivVisibility> f376873z;

    /* compiled from: DivCustom.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/w0;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/w0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div2.w0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, C38584w0> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f376874l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C38584w0 invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            C38584w0.f376820D.getClass();
            return e.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivCustom.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.w0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f376875l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivCustom.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.w0$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f376876l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivCustom.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.w0$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f376877l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivCustom.kt */
    @Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\rR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\rR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0012R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\rR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\rR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0012R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0012R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0012R\u0014\u00104\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00109R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0012R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020<0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\nR\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/yandex/div2/w0$e;", "", "<init>", "()V", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/b;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "ALPHA_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/F;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/K;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/K;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/S0;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/c1;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/K5$e;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/K5$e;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "Lcom/yandex/div2/g;", "ITEMS_VALIDATOR", "Lcom/yandex/div2/Y0;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/Y0;", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/a8;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/a8;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/w8;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div2.w0$e */
    public static final class e {
        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static C38584w0 a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            DivAccessibility.f371175f.getClass();
            DivAccessibility divAccessibility = (DivAccessibility) C38107c.g(jSONObject, "accessibility", DivAccessibility.f371182m, f370579a, eVar);
            if (divAccessibility == null) {
                divAccessibility = C38584w0.f376821E;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            DivAlignmentHorizontal.f371238c.getClass();
            Y41.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.f371239d;
            com.yandex.div.internal.parser.C c12 = C38584w0.f376830N;
            C38106b c38106b = C38107c.f370139a;
            com.yandex.div.json.expressions.b bVarI = C38107c.i(jSONObject, "alignment_horizontal", lVar, c38106b, f370579a, null, c12);
            DivAlignmentVertical.f371246c.getClass();
            com.yandex.div.json.expressions.b bVarI2 = C38107c.i(jSONObject, "alignment_vertical", DivAlignmentVertical.f371247d, c38106b, f370579a, null, C38584w0.f376831O);
            Y41.l<Number, Double> lVar2 = com.yandex.div.internal.parser.y.f370150d;
            C38492p0 c38492p0 = C38584w0.f376833Q;
            com.yandex.div.json.expressions.b<Double> bVar = C38584w0.f376822F;
            com.yandex.div.json.expressions.b<Double> bVarI3 = C38107c.i(jSONObject, "alpha", lVar2, c38492p0, f370579a, bVar, com.yandex.div.internal.parser.E.f370134d);
            com.yandex.div.json.expressions.b<Double> bVar2 = bVarI3 == null ? bVar : bVarI3;
            F.f372262a.getClass();
            List listK = C38107c.k(jSONObject, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, F.f372263b, C38584w0.f376834R, f370579a, eVar);
            K.f372635f.getClass();
            K k12 = (K) C38107c.g(jSONObject, "border", K.f372638i, f370579a, eVar);
            if (k12 == null) {
                k12 = C38584w0.f376823G;
            }
            K k13 = k12;
            Y41.l<Number, Long> lVar3 = com.yandex.div.internal.parser.y.f370151e;
            C38492p0 c38492p02 = C38584w0.f376835S;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            com.yandex.div.json.expressions.b bVarI4 = C38107c.i(jSONObject, "column_span", lVar3, c38492p02, f370579a, null, dVar);
            C38105a c38105a = C38107c.f370141c;
            JSONObject jSONObject2 = (JSONObject) C38107c.h(jSONObject, "custom_props", c38105a, c38106b, f370579a);
            String str = (String) C38107c.a(jSONObject, "custom_type", c38105a, c38106b);
            S0.f373492a.getClass();
            List listK2 = C38107c.k(jSONObject, "disappear_actions", S0.f373500i, C38584w0.f376836T, f370579a, eVar);
            C38273c1.f374687c.getClass();
            List listK3 = C38107c.k(jSONObject, AttachMenuItem.File.EXTENSIONS, C38273c1.f374689e, C38584w0.f376837U, f370579a, eVar);
            C38567u1.f376619f.getClass();
            C38567u1 c38567u1 = (C38567u1) C38107c.g(jSONObject, "focus", C38567u1.f376624k, f370579a, eVar);
            K5.f372712a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, K5> pVar = K5.f372713b;
            K5 k52 = (K5) C38107c.g(jSONObject, "height", pVar, f370579a, eVar);
            if (k52 == null) {
                k52 = C38584w0.f376824H;
            }
            K5 k53 = k52;
            String str2 = (String) C38107c.h(jSONObject, "id", c38105a, C38584w0.f376838V, f370579a);
            AbstractC38330g.f375012a.getClass();
            List listK4 = C38107c.k(jSONObject, "items", AbstractC38330g.f375013b, C38584w0.f376839W, f370579a, eVar);
            Y0.f374024f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, Y0> pVar2 = Y0.f374035q;
            Y0 y02 = (Y0) C38107c.g(jSONObject, "margins", pVar2, f370579a, eVar);
            if (y02 == null) {
                y02 = C38584w0.f376825I;
            }
            Y0 y03 = y02;
            Y0 y04 = (Y0) C38107c.g(jSONObject, "paddings", pVar2, f370579a, eVar);
            if (y04 == null) {
                y04 = C38584w0.f376826J;
            }
            Y0 y05 = y04;
            com.yandex.div.json.expressions.b bVarI5 = C38107c.i(jSONObject, "row_span", lVar3, C38584w0.f376840X, f370579a, null, dVar);
            DivAction.f371211f.getClass();
            List listK5 = C38107c.k(jSONObject, "selected_actions", DivAction.f371215j, C38584w0.f376841Y, f370579a, eVar);
            DivTooltip.f372130h.getClass();
            List listK6 = C38107c.k(jSONObject, "tooltips", DivTooltip.f372135m, C38584w0.f376842Z, f370579a, eVar);
            C38260a8.f374376d.getClass();
            C38260a8 c38260a8 = (C38260a8) C38107c.g(jSONObject, "transform", C38260a8.f374379g, f370579a, eVar);
            if (c38260a8 == null) {
                c38260a8 = C38584w0.f376827K;
            }
            C38260a8 c38260a82 = c38260a8;
            T.f373510a.getClass();
            T t12 = (T) C38107c.g(jSONObject, "transition_change", T.f373511b, f370579a, eVar);
            B.f370624a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, B> pVar3 = B.f370625b;
            B b12 = (B) C38107c.g(jSONObject, "transition_in", pVar3, f370579a, eVar);
            B b13 = (B) C38107c.g(jSONObject, "transition_out", pVar3, f370579a, eVar);
            DivTransitionTrigger.f372167c.getClass();
            List listJ = C38107c.j(jSONObject, "transition_triggers", DivTransitionTrigger.f372168d, C38584w0.f376843a0, f370579a);
            DivVisibility.f372192c.getClass();
            Y41.l<String, DivVisibility> lVar4 = DivVisibility.f372193d;
            com.yandex.div.json.expressions.b<DivVisibility> bVar3 = C38584w0.f376828L;
            com.yandex.div.json.expressions.b<DivVisibility> bVarI6 = C38107c.i(jSONObject, "visibility", lVar4, c38106b, f370579a, bVar3, C38584w0.f376832P);
            com.yandex.div.json.expressions.b<DivVisibility> bVar4 = bVarI6 == null ? bVar3 : bVarI6;
            w8.f376942h.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, w8> pVar4 = w8.f376950p;
            w8 w8Var = (w8) C38107c.g(jSONObject, "visibility_action", pVar4, f370579a, eVar);
            List listK7 = C38107c.k(jSONObject, "visibility_actions", pVar4, C38584w0.f376844b0, f370579a, eVar);
            K5 k54 = (K5) C38107c.g(jSONObject, "width", pVar, f370579a, eVar);
            if (k54 == null) {
                k54 = C38584w0.f376829M;
            }
            return new C38584w0(divAccessibility2, bVarI, bVarI2, bVar2, listK, k13, bVarI4, jSONObject2, str, listK2, listK3, c38567u1, k53, str2, listK4, y03, y05, bVarI5, listK5, listK6, c38260a82, t12, b12, b13, listJ, bVar4, w8Var, listK7, k54);
        }

        public e() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        com.yandex.div.json.expressions.b bVar = null;
        f376823G = new K(bVar, null, null, null, null, 31, null);
        f376824H = new K5.e(new y8(bVar, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        com.yandex.div.json.expressions.b bVar2 = null;
        f376825I = new Y0(null, null, null, bVar2, null, 31, null);
        f376826J = new Y0(bVar, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 31, null);
        f376827K = new C38260a8(0 == true ? 1 : 0, 0 == true ? 1 : 0, bVar2, 7, null);
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAlignmentHorizontal.values());
        b bVar3 = b.f376875l;
        aVar.getClass();
        f376830N = new com.yandex.div.internal.parser.C(bVar3, objC);
        f376831O = new com.yandex.div.internal.parser.C(c.f376876l, C42756l.C(DivAlignmentVertical.values()));
        f376832P = new com.yandex.div.internal.parser.C(d.f376877l, C42756l.C(DivVisibility.values()));
        f376833Q = new C38492p0(18);
        f376834R = new C38302f0(24);
        f376835S = new C38492p0(19);
        f376836T = new C38302f0(25);
        f376837U = new C38302f0(18);
        f376838V = new C38492p0(16);
        f376839W = new C38302f0(19);
        f376840X = new C38492p0(17);
        f376841Y = new C38302f0(20);
        f376842Z = new C38302f0(21);
        f376843a0 = new C38302f0(22);
        f376844b0 = new C38302f0(23);
        int i12 = a.f376874l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public C38584w0(@Y61.k DivAccessibility divAccessibility, @Y61.l com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar, @Y61.l com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar2, @Y61.k com.yandex.div.json.expressions.b<Double> bVar3, @Y61.l List<? extends F> list, @Y61.k K k12, @Y61.l com.yandex.div.json.expressions.b<Long> bVar4, @Y61.l JSONObject jSONObject, @Y61.k String str, @Y61.l List<? extends S0> list2, @Y61.l List<? extends C38273c1> list3, @Y61.l C38567u1 c38567u1, @Y61.k K5 k52, @Y61.l String str2, @Y61.l List<? extends AbstractC38330g> list4, @Y61.k Y0 y02, @Y61.k Y0 y03, @Y61.l com.yandex.div.json.expressions.b<Long> bVar5, @Y61.l List<? extends DivAction> list5, @Y61.l List<? extends DivTooltip> list6, @Y61.k C38260a8 c38260a8, @Y61.l T t12, @Y61.l B b12, @Y61.l B b13, @Y61.l List<? extends DivTransitionTrigger> list7, @Y61.k com.yandex.div.json.expressions.b<DivVisibility> bVar6, @Y61.l w8 w8Var, @Y61.l List<? extends w8> list8, @Y61.k K5 k53) {
        this.f376848a = divAccessibility;
        this.f376849b = bVar;
        this.f376850c = bVar2;
        this.f376851d = bVar3;
        this.f376852e = list;
        this.f376853f = k12;
        this.f376854g = bVar4;
        this.f376855h = jSONObject;
        this.f376856i = str;
        this.f376857j = list2;
        this.f376858k = list3;
        this.f376859l = c38567u1;
        this.f376860m = k52;
        this.f376861n = str2;
        this.f376862o = list4;
        this.f376863p = y02;
        this.f376864q = y03;
        this.f376865r = bVar5;
        this.f376866s = list5;
        this.f376867t = list6;
        this.f376868u = c38260a8;
        this.f376869v = t12;
        this.f376870w = b12;
        this.f376871x = b13;
        this.f376872y = list7;
        this.f376873z = bVar6;
        this.f376845A = w8Var;
        this.f376846B = list8;
        this.f376847C = k53;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C38260a8 getF373616D() {
        return this.f376868u;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<F> e() {
        return this.f376852e;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> getAlpha() {
        return this.f376851d;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getBorder, reason: from getter */
    public final K getF373630f() {
        return this.f376853f;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getHeight, reason: from getter */
    public final K5 getF373635k() {
        return this.f376860m;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: getId, reason: from getter */
    public final String getF373636l() {
        return this.f376861n;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivVisibility> getVisibility() {
        return this.f376873z;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getWidth, reason: from getter */
    public final K5 getF373624L() {
        return this.f376847C;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivTooltip> i() {
        return this.f376867t;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> j() {
        return this.f376854g;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final Y0 getF373637m() {
        return this.f376863p;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> l() {
        return this.f376865r;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> m() {
        return this.f376849b;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: n, reason: from getter */
    public final B getF373619G() {
        return this.f376871x;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivTransitionTrigger> o() {
        return this.f376872y;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<C38273c1> p() {
        return this.f376858k;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivAction> q() {
        return this.f376866s;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: r, reason: from getter */
    public final B getF373618F() {
        return this.f376870w;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<w8> s() {
        return this.f376846B;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: t, reason: from getter */
    public final T getF373617E() {
        return this.f376869v;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> u() {
        return this.f376850c;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: v, reason: from getter */
    public final C38567u1 getF373634j() {
        return this.f376859l;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: w, reason: from getter */
    public final DivAccessibility getF373625a() {
        return this.f376848a;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: x, reason: from getter */
    public final Y0 getF373640p() {
        return this.f376864q;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: y, reason: from getter */
    public final w8 getF373622J() {
        return this.f376845A;
    }

    public /* synthetic */ C38584w0(DivAccessibility divAccessibility, com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, List list, K k12, com.yandex.div.json.expressions.b bVar4, JSONObject jSONObject, String str, List list2, List list3, C38567u1 c38567u1, K5 k52, String str2, List list4, Y0 y02, Y0 y03, com.yandex.div.json.expressions.b bVar5, List list5, List list6, C38260a8 c38260a8, T t12, B b12, B b13, List list7, com.yandex.div.json.expressions.b bVar6, w8 w8Var, List list8, K5 k53, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? f376821E : divAccessibility, (i12 & 2) != 0 ? null : bVar, (i12 & 4) != 0 ? null : bVar2, (i12 & 8) != 0 ? f376822F : bVar3, (i12 & 16) != 0 ? null : list, (i12 & 32) != 0 ? f376823G : k12, (i12 & 64) != 0 ? null : bVar4, (i12 & 128) != 0 ? null : jSONObject, str, (i12 & 512) != 0 ? null : list2, (i12 & 1024) != 0 ? null : list3, (i12 & 2048) != 0 ? null : c38567u1, (i12 & 4096) != 0 ? f376824H : k52, (i12 & 8192) != 0 ? null : str2, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list4, (32768 & i12) != 0 ? f376825I : y02, (65536 & i12) != 0 ? f376826J : y03, (131072 & i12) != 0 ? null : bVar5, (262144 & i12) != 0 ? null : list5, (524288 & i12) != 0 ? null : list6, (1048576 & i12) != 0 ? f376827K : c38260a8, (2097152 & i12) != 0 ? null : t12, (4194304 & i12) != 0 ? null : b12, (8388608 & i12) != 0 ? null : b13, (16777216 & i12) != 0 ? null : list7, (33554432 & i12) != 0 ? f376828L : bVar6, (67108864 & i12) != 0 ? null : w8Var, (134217728 & i12) != 0 ? null : list8, (i12 & 268435456) != 0 ? f376829M : k53);
    }
}
