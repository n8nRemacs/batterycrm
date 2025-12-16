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
import okhttp3.internal.http2.Http2Connection;
import org.json.JSONObject;
import shark.AndroidResourceIdNames;

/* compiled from: DivSeparator.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div2/DivSeparator;", "Lcom/yandex/div/json/b;", "Lcom/yandex/div2/H;", "e", "DelimiterStyle", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class DivSeparator implements com.yandex.div.json.b, H {

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public static final e f371876G = new e(null);

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public static final DivAccessibility f371877H = new DivAccessibility(null, null, null, null, null, null, 63, null);

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public static final DivAnimation f371878I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<Double> f371879J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public static final K f371880K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public static final DelimiterStyle f371881L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public static final K5.e f371882M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public static final Y0 f371883N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public static final Y0 f371884O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public static final C38260a8 f371885P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.json.expressions.b<DivVisibility> f371886Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public static final K5.d f371887R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371888S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371889T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public static final com.yandex.div.internal.parser.C f371890U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public static final C38553s5 f371891V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public static final C38403j5 f371892W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public static final C38553s5 f371893X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public static final C38403j5 f371894Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public static final C38553s5 f371895Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public static final C38553s5 f371896a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public static final C38553s5 f371897b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public static final C38403j5 f371898c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public static final C38553s5 f371899d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public static final C38403j5 f371900e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public static final C38553s5 f371901f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public static final C38553s5 f371902g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public static final C38553s5 f371903h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public static final C38553s5 f371904i0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public final B f371905A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final List<DivTransitionTrigger> f371906B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivVisibility> f371907C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public final w8 f371908D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final List<w8> f371909E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final K5 f371910F;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DivAccessibility f371911a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final DivAction f371912b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final DivAnimation f371913c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f371914d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> f371915e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> f371916f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> f371917g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final List<F> f371918h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final K f371919i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f371920j;

    /* renamed from: k, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final DelimiterStyle f371921k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final List<S0> f371922l;

    /* renamed from: m, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f371923m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final List<C38273c1> f371924n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final C38567u1 f371925o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final K5 f371926p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f371927q;

    /* renamed from: r, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final List<DivAction> f371928r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Y0 f371929s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final Y0 f371930t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> f371931u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final List<DivAction> f371932v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final List<DivTooltip> f371933w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final C38260a8 f371934x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final T f371935y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final B f371936z;

    /* compiled from: DivSeparator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivSeparator$DelimiterStyle;", "Lcom/yandex/div/json/b;", "c", "Orientation", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class DelimiterStyle implements com.yandex.div.json.b {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final c f371937c = new c(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<Integer> f371938d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.json.expressions.b<Orientation> f371939e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public static final com.yandex.div.internal.parser.C f371940f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public static final Y41.p<com.yandex.div.json.e, JSONObject, DelimiterStyle> f371941g;

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<Integer> f371942a;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final com.yandex.div.json.expressions.b<Orientation> f371943b;

        /* compiled from: DivSeparator.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div2/DivSeparator$DelimiterStyle$Orientation;", "", "b", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public enum Orientation {
            VERTICAL("vertical"),
            HORIZONTAL("horizontal");


            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public static final b f371944c = new b(null);

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public static final Y41.l<String, Orientation> f371945d = a.f371950l;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f371949b;

            /* compiled from: DivSeparator.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivSeparator$DelimiterStyle$Orientation;", "string", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
            public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, Orientation> {

                /* renamed from: l, reason: collision with root package name */
                public static final a f371950l = new a();

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
                    return null;
                }
            }

            /* compiled from: DivSeparator.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div2/DivSeparator$DelimiterStyle$Orientation$b;", "", "<init>", "()V", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            public static final class b {
                public /* synthetic */ b(C42822w c42822w) {
                    this();
                }

                public b() {
                }
            }

            Orientation(String str) {
                this.f371949b = str;
            }
        }

        /* compiled from: DivSeparator.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivSeparator$DelimiterStyle;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivSeparator$DelimiterStyle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, DelimiterStyle> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f371951l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final DelimiterStyle invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
                JSONObject jSONObject2 = jSONObject;
                DelimiterStyle.f371937c.getClass();
                com.yandex.div.json.i f370579a = eVar.getF370579a();
                Y41.l<Object, Integer> lVar = com.yandex.div.internal.parser.y.f370147a;
                com.yandex.div.json.expressions.b<Integer> bVar = DelimiterStyle.f371938d;
                E.b bVar2 = com.yandex.div.internal.parser.E.f370136f;
                C38106b c38106b = C38107c.f370139a;
                com.yandex.div.json.expressions.b<Integer> bVarI = C38107c.i(jSONObject2, "color", lVar, c38106b, f370579a, bVar, bVar2);
                if (bVarI != null) {
                    bVar = bVarI;
                }
                Orientation.f371944c.getClass();
                Y41.l<String, Orientation> lVar2 = Orientation.f371945d;
                com.yandex.div.json.expressions.b<Orientation> bVar3 = DelimiterStyle.f371939e;
                com.yandex.div.json.expressions.b<Orientation> bVarI2 = C38107c.i(jSONObject2, "orientation", lVar2, c38106b, f370579a, bVar3, DelimiterStyle.f371940f);
                if (bVarI2 != null) {
                    bVar3 = bVarI2;
                }
                return new DelimiterStyle(bVar, bVar3);
            }
        }

        /* compiled from: DivSeparator.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f371952l = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof Orientation);
            }
        }

        /* compiled from: DivSeparator.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/div2/DivSeparator$DelimiterStyle$c;", "", "<init>", "()V", "Lcom/yandex/div/json/expressions/b;", "", "COLOR_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div2/DivSeparator$DelimiterStyle$Orientation;", "ORIENTATION_DEFAULT_VALUE", "Lcom/yandex/div/internal/parser/D;", "TYPE_HELPER_ORIENTATION", "Lcom/yandex/div/internal/parser/D;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class c {
            public /* synthetic */ c(C42822w c42822w) {
                this();
            }

            public c() {
            }
        }

        static {
            com.yandex.div.json.expressions.b.f370552a.getClass();
            f371938d = b.a.a(335544320);
            f371939e = b.a.a(Orientation.HORIZONTAL);
            D.a aVar = com.yandex.div.internal.parser.D.f370129a;
            Object objC = C42756l.C(Orientation.values());
            b bVar = b.f371952l;
            aVar.getClass();
            f371940f = new com.yandex.div.internal.parser.C(bVar, objC);
            f371941g = a.f371951l;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @C21.b
        public DelimiterStyle() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @C21.b
        public DelimiterStyle(@Y61.k com.yandex.div.json.expressions.b<Integer> bVar, @Y61.k com.yandex.div.json.expressions.b<Orientation> bVar2) {
            this.f371942a = bVar;
            this.f371943b = bVar2;
        }

        public /* synthetic */ DelimiterStyle(com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? f371938d : bVar, (i12 & 2) != 0 ? f371939e : bVar2);
        }
    }

    /* compiled from: DivSeparator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/div/json/e;", "env", "Lorg/json/JSONObject;", "it", "Lcom/yandex/div2/DivSeparator;", "invoke", "(Lcom/yandex/div/json/e;Lorg/json/JSONObject;)Lcom/yandex/div2/DivSeparator;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<com.yandex.div.json.e, JSONObject, DivSeparator> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f371953l = 0;

        static {
            new a();
        }

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final DivSeparator invoke(com.yandex.div.json.e eVar, JSONObject jSONObject) {
            DivSeparator.f371876G.getClass();
            return e.a(eVar, jSONObject);
        }
    }

    /* compiled from: DivSeparator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f371954l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivSeparator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f371955l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivSeparator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f371956l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivSeparator.kt */
    @Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\nR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\nR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\nR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0014R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0014R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\nR\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0014R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0014R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\nR\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\nR\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\nR\u0014\u0010;\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020A0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010@R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\nR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020C0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0011R\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lcom/yandex/div2/DivSeparator$e;", "", "<init>", "()V", "Lcom/yandex/div2/DivAccessibility;", "ACCESSIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/x;", "Lcom/yandex/div2/DivAnimation;", "ACTION_ANIMATION_DEFAULT_VALUE", "Lcom/yandex/div2/DivAnimation;", "Lcom/yandex/div/json/expressions/b;", "", "ALPHA_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/b;", "Lcom/yandex/div/internal/parser/F;", "ALPHA_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/F;", "ALPHA_VALIDATOR", "Lcom/yandex/div2/F;", "BACKGROUND_VALIDATOR", "Lcom/yandex/div2/K;", "BORDER_DEFAULT_VALUE", "Lcom/yandex/div2/K;", "", "COLUMN_SPAN_TEMPLATE_VALIDATOR", "COLUMN_SPAN_VALIDATOR", "Lcom/yandex/div2/DivSeparator$DelimiterStyle;", "DELIMITER_STYLE_DEFAULT_VALUE", "Lcom/yandex/div2/DivSeparator$DelimiterStyle;", "Lcom/yandex/div2/S0;", "DISAPPEAR_ACTIONS_VALIDATOR", "DOUBLETAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/c1;", "EXTENSIONS_VALIDATOR", "Lcom/yandex/div2/K5$e;", "HEIGHT_DEFAULT_VALUE", "Lcom/yandex/div2/K5$e;", "", "ID_TEMPLATE_VALIDATOR", "ID_VALIDATOR", "LONGTAP_ACTIONS_VALIDATOR", "Lcom/yandex/div2/Y0;", "MARGINS_DEFAULT_VALUE", "Lcom/yandex/div2/Y0;", "PADDINGS_DEFAULT_VALUE", "ROW_SPAN_TEMPLATE_VALIDATOR", "ROW_SPAN_VALIDATOR", "SELECTED_ACTIONS_VALIDATOR", "Lcom/yandex/div2/DivTooltip;", "TOOLTIPS_VALIDATOR", "Lcom/yandex/div2/a8;", "TRANSFORM_DEFAULT_VALUE", "Lcom/yandex/div2/a8;", "Lcom/yandex/div2/DivTransitionTrigger;", "TRANSITION_TRIGGERS_VALIDATOR", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "TYPE_HELPER_ALIGNMENT_HORIZONTAL", "Lcom/yandex/div/internal/parser/D;", "Lcom/yandex/div2/DivAlignmentVertical;", "TYPE_HELPER_ALIGNMENT_VERTICAL", "Lcom/yandex/div2/DivVisibility;", "TYPE_HELPER_VISIBILITY", "Lcom/yandex/div2/w8;", "VISIBILITY_ACTIONS_VALIDATOR", "VISIBILITY_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "WIDTH_DEFAULT_VALUE", "Lcom/yandex/div2/K5$d;", "div-data_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e {
        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        @X41.n
        @X41.i
        @Y61.k
        public static DivSeparator a(@Y61.k com.yandex.div.json.e eVar, @Y61.k JSONObject jSONObject) {
            com.yandex.div.json.i f370579a = eVar.getF370579a();
            DivAccessibility.f371175f.getClass();
            DivAccessibility divAccessibility = (DivAccessibility) C38107c.g(jSONObject, "accessibility", DivAccessibility.f371182m, f370579a, eVar);
            if (divAccessibility == null) {
                divAccessibility = DivSeparator.f371877H;
            }
            DivAccessibility divAccessibility2 = divAccessibility;
            DivAction.f371211f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, DivAction> pVar = DivAction.f371215j;
            DivAction divAction = (DivAction) C38107c.g(jSONObject, "action", pVar, f370579a, eVar);
            DivAnimation.f371255h.getClass();
            DivAnimation divAnimation = (DivAnimation) C38107c.g(jSONObject, "action_animation", DivAnimation.f371264q, f370579a, eVar);
            if (divAnimation == null) {
                divAnimation = DivSeparator.f371878I;
            }
            DivAnimation divAnimation2 = divAnimation;
            List listK = C38107c.k(jSONObject, "actions", pVar, DivSeparator.f371891V, f370579a, eVar);
            DivAlignmentHorizontal.f371238c.getClass();
            Y41.l<String, DivAlignmentHorizontal> lVar = DivAlignmentHorizontal.f371239d;
            com.yandex.div.internal.parser.C c12 = DivSeparator.f371888S;
            C38106b c38106b = C38107c.f370139a;
            com.yandex.div.json.expressions.b bVarI = C38107c.i(jSONObject, "alignment_horizontal", lVar, c38106b, f370579a, null, c12);
            DivAlignmentVertical.f371246c.getClass();
            com.yandex.div.json.expressions.b bVarI2 = C38107c.i(jSONObject, "alignment_vertical", DivAlignmentVertical.f371247d, c38106b, f370579a, null, DivSeparator.f371889T);
            Y41.l<Number, Double> lVar2 = com.yandex.div.internal.parser.y.f370150d;
            C38403j5 c38403j5 = DivSeparator.f371892W;
            com.yandex.div.json.expressions.b<Double> bVar = DivSeparator.f371879J;
            com.yandex.div.json.expressions.b<Double> bVarI3 = C38107c.i(jSONObject, "alpha", lVar2, c38403j5, f370579a, bVar, com.yandex.div.internal.parser.E.f370134d);
            com.yandex.div.json.expressions.b<Double> bVar2 = bVarI3 == null ? bVar : bVarI3;
            F.f372262a.getClass();
            List listK2 = C38107c.k(jSONObject, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, F.f372263b, DivSeparator.f371893X, f370579a, eVar);
            K.f372635f.getClass();
            K k12 = (K) C38107c.g(jSONObject, "border", K.f372638i, f370579a, eVar);
            if (k12 == null) {
                k12 = DivSeparator.f371880K;
            }
            K k13 = k12;
            Y41.l<Number, Long> lVar3 = com.yandex.div.internal.parser.y.f370151e;
            C38403j5 c38403j52 = DivSeparator.f371894Y;
            E.d dVar = com.yandex.div.internal.parser.E.f370132b;
            com.yandex.div.json.expressions.b bVarI4 = C38107c.i(jSONObject, "column_span", lVar3, c38403j52, f370579a, null, dVar);
            DelimiterStyle.f371937c.getClass();
            DelimiterStyle delimiterStyle = (DelimiterStyle) C38107c.g(jSONObject, "delimiter_style", DelimiterStyle.f371941g, f370579a, eVar);
            if (delimiterStyle == null) {
                delimiterStyle = DivSeparator.f371881L;
            }
            DelimiterStyle delimiterStyle2 = delimiterStyle;
            S0.f373492a.getClass();
            List listK3 = C38107c.k(jSONObject, "disappear_actions", S0.f373500i, DivSeparator.f371895Z, f370579a, eVar);
            List listK4 = C38107c.k(jSONObject, "doubletap_actions", pVar, DivSeparator.f371896a0, f370579a, eVar);
            C38273c1.f374687c.getClass();
            List listK5 = C38107c.k(jSONObject, AttachMenuItem.File.EXTENSIONS, C38273c1.f374689e, DivSeparator.f371897b0, f370579a, eVar);
            C38567u1.f376619f.getClass();
            C38567u1 c38567u1 = (C38567u1) C38107c.g(jSONObject, "focus", C38567u1.f376624k, f370579a, eVar);
            K5.f372712a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, K5> pVar2 = K5.f372713b;
            K5 k52 = (K5) C38107c.g(jSONObject, "height", pVar2, f370579a, eVar);
            if (k52 == null) {
                k52 = DivSeparator.f371882M;
            }
            K5 k53 = k52;
            String str = (String) C38107c.h(jSONObject, "id", C38107c.f370141c, DivSeparator.f371898c0, f370579a);
            List listK6 = C38107c.k(jSONObject, "longtap_actions", pVar, DivSeparator.f371899d0, f370579a, eVar);
            Y0.f374024f.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, Y0> pVar3 = Y0.f374035q;
            Y0 y02 = (Y0) C38107c.g(jSONObject, "margins", pVar3, f370579a, eVar);
            if (y02 == null) {
                y02 = DivSeparator.f371883N;
            }
            Y0 y03 = y02;
            Y0 y04 = (Y0) C38107c.g(jSONObject, "paddings", pVar3, f370579a, eVar);
            if (y04 == null) {
                y04 = DivSeparator.f371884O;
            }
            Y0 y05 = y04;
            com.yandex.div.json.expressions.b bVarI5 = C38107c.i(jSONObject, "row_span", lVar3, DivSeparator.f371900e0, f370579a, null, dVar);
            List listK7 = C38107c.k(jSONObject, "selected_actions", pVar, DivSeparator.f371901f0, f370579a, eVar);
            DivTooltip.f372130h.getClass();
            List listK8 = C38107c.k(jSONObject, "tooltips", DivTooltip.f372135m, DivSeparator.f371902g0, f370579a, eVar);
            C38260a8.f374376d.getClass();
            C38260a8 c38260a8 = (C38260a8) C38107c.g(jSONObject, "transform", C38260a8.f374379g, f370579a, eVar);
            if (c38260a8 == null) {
                c38260a8 = DivSeparator.f371885P;
            }
            C38260a8 c38260a82 = c38260a8;
            T.f373510a.getClass();
            T t12 = (T) C38107c.g(jSONObject, "transition_change", T.f373511b, f370579a, eVar);
            B.f370624a.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, B> pVar4 = B.f370625b;
            B b12 = (B) C38107c.g(jSONObject, "transition_in", pVar4, f370579a, eVar);
            B b13 = (B) C38107c.g(jSONObject, "transition_out", pVar4, f370579a, eVar);
            DivTransitionTrigger.f372167c.getClass();
            List listJ = C38107c.j(jSONObject, "transition_triggers", DivTransitionTrigger.f372168d, DivSeparator.f371903h0, f370579a);
            DivVisibility.f372192c.getClass();
            Y41.l<String, DivVisibility> lVar4 = DivVisibility.f372193d;
            com.yandex.div.json.expressions.b<DivVisibility> bVar3 = DivSeparator.f371886Q;
            com.yandex.div.json.expressions.b<DivVisibility> bVarI6 = C38107c.i(jSONObject, "visibility", lVar4, c38106b, f370579a, bVar3, DivSeparator.f371890U);
            com.yandex.div.json.expressions.b<DivVisibility> bVar4 = bVarI6 == null ? bVar3 : bVarI6;
            w8.f376942h.getClass();
            Y41.p<com.yandex.div.json.e, JSONObject, w8> pVar5 = w8.f376950p;
            w8 w8Var = (w8) C38107c.g(jSONObject, "visibility_action", pVar5, f370579a, eVar);
            List listK9 = C38107c.k(jSONObject, "visibility_actions", pVar5, DivSeparator.f371904i0, f370579a, eVar);
            K5 k54 = (K5) C38107c.g(jSONObject, "width", pVar2, f370579a, eVar);
            if (k54 == null) {
                k54 = DivSeparator.f371887R;
            }
            return new DivSeparator(divAccessibility2, divAction, divAnimation2, listK, bVarI, bVarI2, bVar2, listK2, k13, bVarI4, delimiterStyle2, listK3, listK4, listK5, c38567u1, k53, str, listK6, y03, y05, bVarI5, listK7, listK8, c38260a82, t12, b12, b13, listJ, bVar4, w8Var, listK9, k54);
        }

        public e() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        com.yandex.div.json.expressions.b bVarI = com.google.firebase.components.g.i(100L, com.yandex.div.json.expressions.b.f370552a);
        com.yandex.div.json.expressions.b bVarA = b.a.a(Double.valueOf(0.6d));
        com.yandex.div.json.expressions.b bVarA2 = b.a.a(DivAnimation.Name.FADE);
        Double dValueOf = Double.valueOf(1.0d);
        com.yandex.div.json.expressions.b bVar = null;
        f371878I = new DivAnimation(bVarI, bVarA, bVar, null, bVarA2, null, null, b.a.a(dValueOf), 108, null);
        f371879J = b.a.a(dValueOf);
        f371880K = new K(null, null, null, null, null, 31, null);
        f371881L = new DelimiterStyle(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        f371882M = new K5.e(new y8(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null));
        f371883N = new Y0(null, null, null, bVar, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        f371884O = new Y0(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 31, null);
        f371885P = new C38260a8(0 == true ? 1 : 0, 0 == true ? 1 : 0, bVar, 7, null);
        f371886Q = b.a.a(DivVisibility.VISIBLE);
        f371887R = new K5.d(new U3(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0));
        D.a aVar = com.yandex.div.internal.parser.D.f370129a;
        Object objC = C42756l.C(DivAlignmentHorizontal.values());
        b bVar2 = b.f371954l;
        aVar.getClass();
        f371888S = new com.yandex.div.internal.parser.C(bVar2, objC);
        f371889T = new com.yandex.div.internal.parser.C(c.f371955l, C42756l.C(DivAlignmentVertical.values()));
        f371890U = new com.yandex.div.internal.parser.C(d.f371956l, C42756l.C(DivVisibility.values()));
        f371891V = new C38553s5(0);
        f371892W = new C38403j5(8);
        f371893X = new C38553s5(9);
        f371894Y = new C38403j5(5);
        f371895Z = new C38553s5(1);
        f371896a0 = new C38553s5(2);
        f371897b0 = new C38553s5(3);
        f371898c0 = new C38403j5(6);
        f371899d0 = new C38553s5(4);
        f371900e0 = new C38403j5(7);
        f371901f0 = new C38553s5(5);
        f371902g0 = new C38553s5(6);
        f371903h0 = new C38553s5(7);
        f371904i0 = new C38553s5(8);
        int i12 = a.f371953l;
    }

    @C21.b
    public DivSeparator() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, null);
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C38260a8 getF371494A() {
        return this.f371934x;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<F> e() {
        return this.f371918h;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    public final com.yandex.div.json.expressions.b<Double> getAlpha() {
        return this.f371917g;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getBorder, reason: from getter */
    public final K getF371508f() {
        return this.f371919i;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getHeight, reason: from getter */
    public final K5 getF371517o() {
        return this.f371926p;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: getId, reason: from getter */
    public final String getF371518p() {
        return this.f371927q;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    public final com.yandex.div.json.expressions.b<DivVisibility> getVisibility() {
        return this.f371907C;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: getWidth, reason: from getter */
    public final K5 getF371502I() {
        return this.f371910F;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivTooltip> i() {
        return this.f371933w;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> j() {
        return this.f371920j;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final Y0 getF371521s() {
        return this.f371929s;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<Long> l() {
        return this.f371931u;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentHorizontal> m() {
        return this.f371915e;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: n, reason: from getter */
    public final B getF371497D() {
        return this.f371905A;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivTransitionTrigger> o() {
        return this.f371906B;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<C38273c1> p() {
        return this.f371924n;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<DivAction> q() {
        return this.f371932v;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: r, reason: from getter */
    public final B getF371496C() {
        return this.f371936z;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final List<w8> s() {
        return this.f371909E;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: t, reason: from getter */
    public final T getF371495B() {
        return this.f371935y;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    public final com.yandex.div.json.expressions.b<DivAlignmentVertical> u() {
        return this.f371916f;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: v, reason: from getter */
    public final C38567u1 getF371516n() {
        return this.f371925o;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: w, reason: from getter */
    public final DivAccessibility getF371503a() {
        return this.f371911a;
    }

    @Override // com.yandex.div2.H
    @Y61.k
    /* renamed from: x, reason: from getter */
    public final Y0 getF371523u() {
        return this.f371930t;
    }

    @Override // com.yandex.div2.H
    @Y61.l
    /* renamed from: y, reason: from getter */
    public final w8 getF371500G() {
        return this.f371908D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C21.b
    public DivSeparator(@Y61.k DivAccessibility divAccessibility, @Y61.l DivAction divAction, @Y61.k DivAnimation divAnimation, @Y61.l List<? extends DivAction> list, @Y61.l com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar, @Y61.l com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar2, @Y61.k com.yandex.div.json.expressions.b<Double> bVar3, @Y61.l List<? extends F> list2, @Y61.k K k12, @Y61.l com.yandex.div.json.expressions.b<Long> bVar4, @Y61.k DelimiterStyle delimiterStyle, @Y61.l List<? extends S0> list3, @Y61.l List<? extends DivAction> list4, @Y61.l List<? extends C38273c1> list5, @Y61.l C38567u1 c38567u1, @Y61.k K5 k52, @Y61.l String str, @Y61.l List<? extends DivAction> list6, @Y61.k Y0 y02, @Y61.k Y0 y03, @Y61.l com.yandex.div.json.expressions.b<Long> bVar5, @Y61.l List<? extends DivAction> list7, @Y61.l List<? extends DivTooltip> list8, @Y61.k C38260a8 c38260a8, @Y61.l T t12, @Y61.l B b12, @Y61.l B b13, @Y61.l List<? extends DivTransitionTrigger> list9, @Y61.k com.yandex.div.json.expressions.b<DivVisibility> bVar6, @Y61.l w8 w8Var, @Y61.l List<? extends w8> list10, @Y61.k K5 k53) {
        this.f371911a = divAccessibility;
        this.f371912b = divAction;
        this.f371913c = divAnimation;
        this.f371914d = list;
        this.f371915e = bVar;
        this.f371916f = bVar2;
        this.f371917g = bVar3;
        this.f371918h = list2;
        this.f371919i = k12;
        this.f371920j = bVar4;
        this.f371921k = delimiterStyle;
        this.f371922l = list3;
        this.f371923m = list4;
        this.f371924n = list5;
        this.f371925o = c38567u1;
        this.f371926p = k52;
        this.f371927q = str;
        this.f371928r = list6;
        this.f371929s = y02;
        this.f371930t = y03;
        this.f371931u = bVar5;
        this.f371932v = list7;
        this.f371933w = list8;
        this.f371934x = c38260a8;
        this.f371935y = t12;
        this.f371936z = b12;
        this.f371905A = b13;
        this.f371906B = list9;
        this.f371907C = bVar6;
        this.f371908D = w8Var;
        this.f371909E = list10;
        this.f371910F = k53;
    }

    public /* synthetic */ DivSeparator(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List list, com.yandex.div.json.expressions.b bVar, com.yandex.div.json.expressions.b bVar2, com.yandex.div.json.expressions.b bVar3, List list2, K k12, com.yandex.div.json.expressions.b bVar4, DelimiterStyle delimiterStyle, List list3, List list4, List list5, C38567u1 c38567u1, K5 k52, String str, List list6, Y0 y02, Y0 y03, com.yandex.div.json.expressions.b bVar5, List list7, List list8, C38260a8 c38260a8, T t12, B b12, B b13, List list9, com.yandex.div.json.expressions.b bVar6, w8 w8Var, List list10, K5 k53, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? f371877H : divAccessibility, (i12 & 2) != 0 ? null : divAction, (i12 & 4) != 0 ? f371878I : divAnimation, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : bVar, (i12 & 32) != 0 ? null : bVar2, (i12 & 64) != 0 ? f371879J : bVar3, (i12 & 128) != 0 ? null : list2, (i12 & 256) != 0 ? f371880K : k12, (i12 & 512) != 0 ? null : bVar4, (i12 & 1024) != 0 ? f371881L : delimiterStyle, (i12 & 2048) != 0 ? null : list3, (i12 & 4096) != 0 ? null : list4, (i12 & 8192) != 0 ? null : list5, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : c38567u1, (i12 & 32768) != 0 ? f371882M : k52, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : str, (i12 & 131072) != 0 ? null : list6, (i12 & 262144) != 0 ? f371883N : y02, (i12 & 524288) != 0 ? f371884O : y03, (i12 & 1048576) != 0 ? null : bVar5, (i12 & 2097152) != 0 ? null : list7, (i12 & 4194304) != 0 ? null : list8, (i12 & 8388608) != 0 ? f371885P : c38260a8, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : t12, (i12 & 33554432) != 0 ? null : b12, (i12 & 67108864) != 0 ? null : b13, (i12 & 134217728) != 0 ? null : list9, (i12 & 268435456) != 0 ? f371886Q : bVar6, (i12 & 536870912) != 0 ? null : w8Var, (i12 & 1073741824) != 0 ? null : list10, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? f371887R : k53);
    }
}
