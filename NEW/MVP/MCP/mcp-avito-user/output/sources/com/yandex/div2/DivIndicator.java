package com.yandex.div2;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.yandex.div.internal.parser.C38105a;
import com.yandex.div.internal.parser.C38106b;
import com.yandex.div.internal.parser.C38107c;
import com.yandex.div.internal.parser.D;
import com.yandex.div.internal.parser.E;
import com.yandex.div.json.expressions.b;
import com.yandex.div2.G5;
import com.yandex.div2.K5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import org.json.JSONObject;
import shark.AndroidResourceIdNames;

/* compiled from: DivIndicator.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/DivIndicator;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div2/H;", "Animation", "f", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class DivIndicator implements com.yandex.div.json.b, H {

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public static final f f371567M = new f(null);

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public static final DivAccessibility f371568N = new DivAccessibility(null, null, null, null, null, null, 63, null);

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Integer> f371569O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f371570P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f371571Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Animation> f371572R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public static final K f371573S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public static final K5.e f371574T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Integer> f371575U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public static final Y0 f371576V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f371577W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public static final Y0 f371578X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public static final G5.d f371579Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public static final C38502q1 f371580Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public static final C38260a8 f371581a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivVisibility> f371582b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public static final K5.d f371583c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371584d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371585e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371586f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371587g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public static final C38459n2 f371588h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public static final C38459n2 f371589i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public static final M2 f371590j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public static final C38459n2 f371591k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final M2 f371592l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final M2 f371593m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final C38459n2 f371594n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final C38459n2 f371595o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public static final C38459n2 f371596p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public static final M2 f371597q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public static final M2 f371598r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final M2 f371599s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final M2 f371600t0;

    /* renamed from: A, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final G5 f371601A;

    /* renamed from: B, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final C38502q1 f371602B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public final List<DivTooltip> f371603C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final C38260a8 f371604D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final T f371605E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final B f371606F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final B f371607G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final List<DivTransitionTrigger> f371608H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivVisibility> f371609I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public final w8 f371610J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public final List<w8> f371611K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final K5 f371612L;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DivAccessibility f371613a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Integer> f371614b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> f371615c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final U4 f371616d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f371617e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> f371618f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> f371619g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Animation> f371620h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final List<F> f371621i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final K f371622j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f371623k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final List<S0> f371624l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final List<C38273c1> f371625m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final C38567u1 f371626n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final K5 f371627o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final String f371628p;

    /* renamed from: q, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Integer> f371629q;

    /* renamed from: r, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final U4 f371630r;

    /* renamed from: s, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final U4 f371631s;

    /* renamed from: t, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final AbstractC38265b3 f371632t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Y0 f371633u;

    /* renamed from: v, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> f371634v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final Y0 f371635w;

    /* renamed from: x, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final String f371636x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f371637y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final List<DivAction> f371638z;

    /* compiled from: DivIndicator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivIndicator$Animation;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Animation {
        SCALE("scale"),
        WORM("worm"),
        SLIDER("slider");


        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f371639c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final Y41.l<String, Animation> f371640d = a.f371646l;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f371645b;

        /* compiled from: DivIndicator.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivIndicator$Animation;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, Animation> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f371646l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final Animation invoke(String str) {
                String str2 = str;
                Animation animation = Animation.SCALE;
                if (str2.equals("scale")) {
                    return animation;
                }
                Animation animation2 = Animation.WORM;
                if (str2.equals("worm")) {
                    return animation2;
                }
                Animation animation3 = Animation.SLIDER;
                if (str2.equals("slider")) {
                    return animation3;
                }
                return null;
            }
        }

        /* compiled from: DivIndicator.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivIndicator$Animation$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        Animation(String str) {
            this.f371645b = str;
        }
    }

    /* compiled from: DivIndicator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivIndicator;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivIndicator;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, DivIndicator> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f371647l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final DivIndicator invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            DivIndicator.f371567M.getClass();
            return f.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivIndicator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f371648l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivIndicator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f371649l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivIndicator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f371650l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Animation);
        }
    }

    /* compiled from: DivIndicator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f371651l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivIndicator.kt */
    @Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u000fR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u000fR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\nR\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\nR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u000fR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u000fR\u0014\u00101\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001d0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u000fR\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u001d0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u000fR\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0019R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0019R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0019R\u0014\u0010C\u001a\u00020'8\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00140E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010HR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010HR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0019R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020L0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010\nR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006T"}, d2 = {"Lcom/yandex/div2/DivIndicator$f;", "", "<init>", "()V", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/expressions/b;", "", "ACTIVE_ITEM_COLOR_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "", "ACTIVE_ITEM_SIZE_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/F;", "ACTIVE_ITEM_SIZE_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "ACTIVE_ITEM_SIZE_VALIDATOR", "ALPHA_DEFAULT_VALUE", "ALPHA_TEMPLATE_VALIDATOR", "ALPHA_VALIDATOR", "Lcom/yandex/div2/DivIndicator$Animation;", "ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/F;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/K;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/K;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/S0;", "DISAPPEAR_ACTIONS_VALIDATOR", "Lcom/yandex/div2/c1;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/K5$e;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/K5$e;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "INACTIVE_ITEM_COLOR_DEFAULT_VALUE", "Lcom/yandex/div2/Y0;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/Y0;", "MINIMUM_ITEM_SIZE_DEFAULT_VALUE", "MINIMUM_ITEM_SIZE_TEMPLATE_VALIDATOR", "MINIMUM_ITEM_SIZE_VALIDATOR", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "Lcom/yandex/div2/DivAction;", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/G5$d;", "SHAPE_DEFAULT_VALUE", "Lcom/yandex/div2/G5$d;", "Lcom/yandex/div2/q1;", "SPACE_BETWEEN_CENTERS_DEFAULT_VALUE", "Lcom/yandex/div2/q1;", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/a8;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/a8;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "TYPE_HELPER_ANIMATION", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/w8;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class f {
        public /* synthetic */ f(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static DivIndicator a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            DivAccessibility.f371175f.getClass();
            DivAccessibility divAccessibility = (DivAccessibility) C38107c.g(jSONObject, "accessibility", DivAccessibility.f371182m, f370579a, eVar);
            if (divAccessibility == null) {
                divAccessibility = DivIndicator.f371568N;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            Y41.l<Object, Integer> lVar = com.yandex.div.internal.parser.y.f370147a;
            com.yandex.div.json.expressions.b<Integer> bVar = DivIndicator.f371569O;
            E.b bVar2 = com.yandex.div.internal.parser.E.f370136f;
            C38106b c38106b = C38107c.f370139a;
            com.yandex.div.json.expressions.b<Integer> bVarI = C38107c.i(jSONObject, "active_item_color", lVar, c38106b, f370579a, bVar, bVar2);
            com.yandex.div.json.expressions.b<Integer> bVar3 = bVarI == null ? bVar : bVarI;
            Y41.l<Number, Double> lVar2 = com.yandex.div.internal.parser.y.f370150d;
            C38459n2 c38459n2 = DivIndicator.f371588h0;
            com.yandex.div.json.expressions.b<Double> bVar4 = DivIndicator.f371570P;
            E.c cVar = com.yandex.div.internal.parser.E.f370134d;
            com.yandex.div.json.expressions.b<Double> bVarI2 = C38107c.i(jSONObject, "active_item_size", lVar2, c38459n2, f370579a, bVar4, cVar);
            com.yandex.div.json.expressions.b<Double> bVar5 = bVarI2 == null ? bVar4 : bVarI2;
            U4.f373687f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, U4> pVar = U4.f373691j;
            U4 u42 = (U4) C38107c.g(jSONObject, "active_shape", pVar, f370579a, eVar);
            DivAlignmentHorizontal.f371238c.getClass();
            com.yandex.div.json.expressions.b bVarI3 = C38107c.i(jSONObject, "alignment_horizontal", DivAlignmentHorizontal.f371239d, c38106b, f370579a, null, DivIndicator.f371584d0);
            DivAlignmentVertical.f371246c.getClass();
            com.yandex.div.json.expressions.b bVarI4 = C38107c.i(jSONObject, "alignment_vertical", DivAlignmentVertical.f371247d, c38106b, f370579a, null, DivIndicator.f371585e0);
            C38459n2 c38459n22 = DivIndicator.f371589i0;
            com.yandex.div.json.expressions.b<Double> bVar6 = DivIndicator.f371571Q;
            com.yandex.div.json.expressions.b<Double> bVarI5 = C38107c.i(jSONObject, "alpha", lVar2, c38459n22, f370579a, bVar6, cVar);
            com.yandex.div.json.expressions.b<Double> bVar7 = bVarI5 == null ? bVar6 : bVarI5;
            Animation.f371639c.getClass();
            Y41.l<String, Animation> lVar3 = Animation.f371640d;
            com.yandex.div.json.expressions.b<Animation> bVar8 = DivIndicator.f371572R;
            com.yandex.div.json.expressions.b<Animation> bVarI6 = C38107c.i(jSONObject, "animation", lVar3, c38106b, f370579a, bVar8, DivIndicator.f371586f0);
            com.yandex.div.json.expressions.b<Animation> bVar9 = bVarI6 == null ? bVar8 : bVarI6;
            F.f372262a.getClass();
            List listK = C38107c.k(jSONObject, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, F.f372263b, DivIndicator.f371590j0, f370579a, eVar);
            K.f372635f.getClass();
            K k12 = (K) C38107c.g(jSONObject, "border", K.f372638i, f370579a, eVar);
            if (k12 == null) {
                k12 = DivIndicator.f371573S;
            }
            K k13 = k12;
            Y41.l<Number, Long> lVar4 = com.yandex.div.internal.parser.y.f370151e;
            C38459n2 c38459n23 = DivIndicator.f371591k0;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            com.yandex.div.json.expressions.b bVarI7 = C38107c.i(jSONObject, "column_span", lVar4, c38459n23, f370579a, null, dVar);
            S0.f373492a.getClass();
            List listK2 = C38107c.k(jSONObject, "disappear_actions", S0.f373500i, DivIndicator.f371592l0, f370579a, eVar);
            C38273c1.f374687c.getClass();
            List listK3 = C38107c.k(jSONObject, AttachMenuItem.File.EXTENSIONS, C38273c1.f374689e, DivIndicator.f371593m0, f370579a, eVar);
            C38567u1.f376619f.getClass();
            C38567u1 c38567u1 = (C38567u1) C38107c.g(jSONObject, "focus", C38567u1.f376624k, f370579a, eVar);
            K5.f372712a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, K5> pVar2 = K5.f372713b;
            K5 k52 = (K5) C38107c.g(jSONObject, "height", pVar2, f370579a, eVar);
            if (k52 == null) {
                k52 = DivIndicator.f371574T;
            }
            K5 k53 = k52;
            C38459n2 c38459n24 = DivIndicator.f371594n0;
            C38105a c38105a = C38107c.f370141c;
            String str = (String) C38107c.h(jSONObject, "id", c38105a, c38459n24, f370579a);
            com.yandex.div.json.expressions.b<Integer> bVar10 = DivIndicator.f371575U;
            com.yandex.div.json.expressions.b<Integer> bVarI8 = C38107c.i(jSONObject, "inactive_item_color", lVar, c38106b, f370579a, bVar10, bVar2);
            com.yandex.div.json.expressions.b<Integer> bVar11 = bVarI8 == null ? bVar10 : bVarI8;
            U4 u43 = (U4) C38107c.g(jSONObject, "inactive_minimum_shape", pVar, f370579a, eVar);
            U4 u44 = (U4) C38107c.g(jSONObject, "inactive_shape", pVar, f370579a, eVar);
            AbstractC38265b3.f374394a.getClass();
            AbstractC38265b3 abstractC38265b3 = (AbstractC38265b3) C38107c.g(jSONObject, "items_placement", AbstractC38265b3.f374395b, f370579a, eVar);
            Y0.f374024f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, Y0> pVar3 = Y0.f374035q;
            Y0 y02 = (Y0) C38107c.g(jSONObject, "margins", pVar3, f370579a, eVar);
            if (y02 == null) {
                y02 = DivIndicator.f371576V;
            }
            Y0 y03 = y02;
            C38459n2 c38459n25 = DivIndicator.f371595o0;
            com.yandex.div.json.expressions.b<Double> bVar12 = DivIndicator.f371577W;
            com.yandex.div.json.expressions.b<Double> bVarI9 = C38107c.i(jSONObject, "minimum_item_size", lVar2, c38459n25, f370579a, bVar12, cVar);
            com.yandex.div.json.expressions.b<Double> bVar13 = bVarI9 == null ? bVar12 : bVarI9;
            Y0 y04 = (Y0) C38107c.g(jSONObject, "paddings", pVar3, f370579a, eVar);
            if (y04 == null) {
                y04 = DivIndicator.f371578X;
            }
            Y0 y05 = y04;
            String str2 = (String) C38107c.h(jSONObject, "pager_id", c38105a, c38106b, f370579a);
            com.yandex.div.json.expressions.b bVarI10 = C38107c.i(jSONObject, "row_span", lVar4, DivIndicator.f371596p0, f370579a, null, dVar);
            DivAction.f371211f.getClass();
            List listK4 = C38107c.k(jSONObject, "selected_actions", DivAction.f371215j, DivIndicator.f371597q0, f370579a, eVar);
            G5.f372487a.getClass();
            G5 g52 = (G5) C38107c.g(jSONObject, "shape", G5.f372488b, f370579a, eVar);
            if (g52 == null) {
                g52 = DivIndicator.f371579Y;
            }
            G5 g53 = g52;
            C38502q1.f376146c.getClass();
            C38502q1 c38502q1 = (C38502q1) C38107c.g(jSONObject, "space_between_centers", C38502q1.f376150g, f370579a, eVar);
            if (c38502q1 == null) {
                c38502q1 = DivIndicator.f371580Z;
            }
            C38502q1 c38502q12 = c38502q1;
            DivTooltip.f372130h.getClass();
            List listK5 = C38107c.k(jSONObject, "tooltips", DivTooltip.f372135m, DivIndicator.f371598r0, f370579a, eVar);
            C38260a8.f374376d.getClass();
            C38260a8 c38260a8 = (C38260a8) C38107c.g(jSONObject, "transform", C38260a8.f374379g, f370579a, eVar);
            if (c38260a8 == null) {
                c38260a8 = DivIndicator.f371581a0;
            }
            C38260a8 c38260a82 = c38260a8;
            T.f373510a.getClass();
            T t12 = (T) C38107c.g(jSONObject, "transition_change", T.f373511b, f370579a, eVar);
            B.f370624a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, B> pVar4 = B.f370625b;
            B b12 = (B) C38107c.g(jSONObject, "transition_in", pVar4, f370579a, eVar);
            B b13 = (B) C38107c.g(jSONObject, "transition_out", pVar4, f370579a, eVar);
            DivTransitionTrigger.f372167c.getClass();
            Y41.l<String, DivTransitionTrigger> lVar5 = DivTransitionTrigger.f372168d;
            M2 m22 = DivIndicator.f371599s0;
            C38106b c38106b2 = C38107c.f370139a;
            List listJ = C38107c.j(jSONObject, "transition_triggers", lVar5, m22, f370579a);
            DivVisibility.f372192c.getClass();
            Y41.l<String, DivVisibility> lVar6 = DivVisibility.f372193d;
            com.yandex.div.json.expressions.b<DivVisibility> bVar14 = DivIndicator.f371582b0;
            com.yandex.div.json.expressions.b<DivVisibility> bVarI11 = C38107c.i(jSONObject, "visibility", lVar6, c38106b2, f370579a, bVar14, DivIndicator.f371587g0);
            com.yandex.div.json.expressions.b<DivVisibility> bVar15 = bVarI11 == null ? bVar14 : bVarI11;
            w8.f376942h.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, w8> pVar5 = w8.f376950p;
            w8 w8Var = (w8) C38107c.g(jSONObject, "visibility_action", pVar5, f370579a, eVar);
            List listK6 = C38107c.k(jSONObject, "visibility_actions", pVar5, DivIndicator.f371600t0, f370579a, eVar);
            K5 k54 = (K5) C38107c.g(jSONObject, "width", pVar2, f370579a, eVar);
            if (k54 == null) {
                k54 = DivIndicator.f371583c0;
            }
            return new DivIndicator(divAccessibility2, bVar3, bVar5, u42, bVarI3, bVarI4, bVar7, bVar9, listK, k13, bVarI7, listK2, listK3, c38567u1, k53, str, bVar11, u43, u44, abstractC38265b3, y03, bVar13, y05, str2, bVarI10, listK4, g53, c38502q12, listK5, c38260a82, t12, b12, b13, listJ, bVar15, w8Var, listK6, k54);
        }

        public f() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        com.yandex.div.json.expressions.b.f370552a.getClass();
        f371569O = b.a.a(16768096);
        f371570P = b.a.a(Double.valueOf(1.3d));
        f371571Q = b.a.a(Double.valueOf(1.0d));
        f371572R = b.a.a(Animation.SCALE);
        com.yandex.div.json.expressions.b bVar = null;
        C42822w c42822w = null;
        f371573S = new K(bVar, null, null, null, null, 31, c42822w);
        f371574T = new K5.e(new y8(bVar, null == true ? 1 : 0, null == true ? 1 : 0, 7, null == true ? 1 : 0));
        f371575U = b.a.a(865180853);
        int i12 = 31;
        f371576V = new Y0(bVar, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, i12, c42822w);
        f371577W = b.a.a(Double.valueOf(0.5d));
        com.yandex.div.json.expressions.b bVar2 = null;
        f371578X = new Y0(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i12, c42822w);
        f371579Y = new G5.d(new U4(bVar2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i12, c42822w));
        int i13 = 1;
        f371580Z = new C38502q1(null == true ? 1 : 0, b.a.a(15L), i13, null == true ? 1 : 0);
        f371581a0 = new C38260a8(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 7, c42822w);
        f371582b0 = b.a.a(DivVisibility.VISIBLE);
        f371583c0 = new K5.d(new U3(null == true ? 1 : 0, i13, null == true ? 1 : 0));
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAlignmentHorizontal.values());
        b bVar3 = b.f371648l;
        aVar.getClass();
        f371584d0 = new com.yandex.div.internal.parser.C(bVar3, objC);
        f371585e0 = new com.yandex.div.internal.parser.C(c.f371649l, C42756l.C(DivAlignmentVertical.values()));
        f371586f0 = new com.yandex.div.internal.parser.C(d.f371650l, C42756l.C(Animation.values()));
        f371587g0 = new com.yandex.div.internal.parser.C(e.f371651l, C42756l.C(DivVisibility.values()));
        f371588h0 = new C38459n2(27);
        f371589i0 = new C38459n2(28);
        f371590j0 = new M2(21);
        f371591k0 = new C38459n2(24);
        f371592l0 = new M2(15);
        f371593m0 = new M2(16);
        f371594n0 = new C38459n2(23);
        f371595o0 = new C38459n2(25);
        f371596p0 = new C38459n2(26);
        f371597q0 = new M2(17);
        f371598r0 = new M2(18);
        f371599s0 = new M2(19);
        f371600t0 = new M2(20);
        int i14 = a.f371647l;
    }

    @C21.b
    public DivIndicator() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 63, null);
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C38260a8 getF372027B() {
        return this.f371604D;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<F> e() {
        return this.f371621i;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> getAlpha() {
        return this.f371619g;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getBorder, reason: from getter */
    public final K getF372041f() {
        return this.f371622j;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getHeight, reason: from getter */
    public final K5 getF372048m() {
        return this.f371627o;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: getId, reason: from getter */
    public final String getF372049n() {
        return this.f371628p;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivVisibility> getVisibility() {
        return this.f371609I;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getWidth, reason: from getter */
    public final K5 getF372035J() {
        return this.f371612L;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivTooltip> i() {
        return this.f371603C;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> j() {
        return this.f371623k;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final Y0 getF372051p() {
        return this.f371633u;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> l() {
        return this.f371637y;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> m() {
        return this.f371617e;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: n, reason: from getter */
    public final B getF372030E() {
        return this.f371607G;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivTransitionTrigger> o() {
        return this.f371608H;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<C38273c1> p() {
        return this.f371625m;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivAction> q() {
        return this.f371638z;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: r, reason: from getter */
    public final B getF372029D() {
        return this.f371606F;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<w8> s() {
        return this.f371611K;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: t, reason: from getter */
    public final T getF372028C() {
        return this.f371605E;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> u() {
        return this.f371618f;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: v, reason: from getter */
    public final C38567u1 getF372046k() {
        return this.f371626n;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: w, reason: from getter */
    public final DivAccessibility getF372036a() {
        return this.f371613a;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: x, reason: from getter */
    public final Y0 getF372052q() {
        return this.f371635w;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: y, reason: from getter */
    public final w8 getF372033H() {
        return this.f371610J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public DivIndicator(@Y61.k DivAccessibility divAccessibility, @Y61.k com.yandex.div.json.expressions.b<Integer> bVar, @Y61.k com.yandex.div.json.expressions.b<Double> bVar2, @Y61.l U4 u42, @Y61.l com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar3, @Y61.l com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar4, @Y61.k com.yandex.div.json.expressions.b<Double> bVar5, @Y61.k com.yandex.div.json.expressions.b<Animation> bVar6, @Y61.l List<? extends F> list, @Y61.k K k12, @Y61.l com.yandex.div.json.expressions.b<Long> bVar7, @Y61.l List<? extends S0> list2, @Y61.l List<? extends C38273c1> list3, @Y61.l C38567u1 c38567u1, @Y61.k K5 k52, @Y61.l String str, @Y61.k com.yandex.div.json.expressions.b<Integer> bVar8, @Y61.l U4 u43, @Y61.l U4 u44, @Y61.l AbstractC38265b3 abstractC38265b3, @Y61.k Y0 y02, @Y61.k com.yandex.div.json.expressions.b<Double> bVar9, @Y61.k Y0 y03, @Y61.l String str2, @Y61.l com.yandex.div.json.expressions.b<Long> bVar10, @Y61.l List<? extends DivAction> list4, @Y61.k G5 g52, @Y61.k C38502q1 c38502q1, @Y61.l List<? extends DivTooltip> list5, @Y61.k C38260a8 c38260a8, @Y61.l T t12, @Y61.l B b12, @Y61.l B b13, @Y61.l List<? extends DivTransitionTrigger> list6, @Y61.k com.yandex.div.json.expressions.b<DivVisibility> bVar11, @Y61.l w8 w8Var, @Y61.l List<? extends w8> list7, @Y61.k K5 k53) {
        this.f371613a = divAccessibility;
        this.f371614b = bVar;
        this.f371615c = bVar2;
        this.f371616d = u42;
        this.f371617e = bVar3;
        this.f371618f = bVar4;
        this.f371619g = bVar5;
        this.f371620h = bVar6;
        this.f371621i = list;
        this.f371622j = k12;
        this.f371623k = bVar7;
        this.f371624l = list2;
        this.f371625m = list3;
        this.f371626n = c38567u1;
        this.f371627o = k52;
        this.f371628p = str;
        this.f371629q = bVar8;
        this.f371630r = u43;
        this.f371631s = u44;
        this.f371632t = abstractC38265b3;
        this.f371633u = y02;
        this.f371634v = bVar9;
        this.f371635w = y03;
        this.f371636x = str2;
        this.f371637y = bVar10;
        this.f371638z = list4;
        this.f371601A = g52;
        this.f371602B = c38502q1;
        this.f371603C = list5;
        this.f371604D = c38260a8;
        this.f371605E = t12;
        this.f371606F = b12;
        this.f371607G = b13;
        this.f371608H = list6;
        this.f371609I = bVar11;
        this.f371610J = w8Var;
        this.f371611K = list7;
        this.f371612L = k53;
    }

    public /* synthetic */ DivIndicator(DivAccessibility divAccessibility, com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, U4 u42, com.yandex.div.json.expressions.b bVar3, com.yandex.div.json.expressions.b bVar4, com.yandex.div.json.expressions.b bVar5, com.yandex.div.json.expressions.b bVar6, List list, K k12, com.yandex.div.json.expressions.b bVar7, List list2, List list3, C38567u1 c38567u1, K5 k52, String str, com.yandex.div.json.expressions.b bVar8, U4 u43, U4 u44, AbstractC38265b3 abstractC38265b3, Y0 y02, com.yandex.div.json.expressions.b bVar9, Y0 y03, String str2, com.yandex.div.json.expressions.b bVar10, List list4, G5 g52, C38502q1 c38502q1, List list5, C38260a8 c38260a8, T t12, B b12, B b13, List list6, com.yandex.div.json.expressions.b bVar11, w8 w8Var, List list7, K5 k53, int i12, int i13, C42822w c42822w) {
        this((i12 & 1) != 0 ? f371568N : divAccessibility, (i12 & 2) != 0 ? f371569O : bVar, (i12 & 4) != 0 ? f371570P : bVar2, (i12 & 8) != 0 ? null : u42, (i12 & 16) != 0 ? null : bVar3, (i12 & 32) != 0 ? null : bVar4, (i12 & 64) != 0 ? f371571Q : bVar5, (i12 & 128) != 0 ? f371572R : bVar6, (i12 & 256) != 0 ? null : list, (i12 & 512) != 0 ? f371573S : k12, (i12 & 1024) != 0 ? null : bVar7, (i12 & 2048) != 0 ? null : list2, (i12 & 4096) != 0 ? null : list3, (i12 & 8192) != 0 ? null : c38567u1, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? f371574T : k52, (i12 & 32768) != 0 ? null : str, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? f371575U : bVar8, (i12 & 131072) != 0 ? null : u43, (i12 & 262144) != 0 ? null : u44, (i12 & 524288) != 0 ? null : abstractC38265b3, (i12 & 1048576) != 0 ? f371576V : y02, (i12 & 2097152) != 0 ? f371577W : bVar9, (i12 & 4194304) != 0 ? f371578X : y03, (i12 & 8388608) != 0 ? null : str2, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : bVar10, (i12 & 33554432) != 0 ? null : list4, (i12 & 67108864) != 0 ? f371579Y : g52, (i12 & 134217728) != 0 ? f371580Z : c38502q1, (i12 & 268435456) != 0 ? null : list5, (i12 & 536870912) != 0 ? f371581a0 : c38260a8, (i12 & 1073741824) != 0 ? null : t12, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : b12, (i13 & 1) != 0 ? null : b13, (i13 & 2) != 0 ? null : list6, (i13 & 4) != 0 ? f371582b0 : bVar11, (i13 & 8) != 0 ? null : w8Var, (i13 & 16) != 0 ? null : list7, (i13 & 32) != 0 ? f371583c0 : k53);
    }
}
