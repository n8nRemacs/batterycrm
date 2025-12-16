package coil.request;

import M2.c;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import coil.decode.h;
import coil.fetch.h;
import coil.memory.MemoryCache;
import coil.request.u;
import coil.util.l;
import coil.view.C27250d;
import coil.view.C27251e;
import coil.view.C27252f;
import coil.view.C27253g;
import coil.view.InterfaceC27254h;
import coil.view.InterfaceC27256j;
import coil.view.Precision;
import coil.view.Scale;
import j.InterfaceC42165v;
import j.K;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.M;
import okhttp3.Headers;

/* compiled from: ImageRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcoil/request/p;", "", "a", "b", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final Lifecycle f58646A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27254h f58647B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final Scale f58648C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final u f58649D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final MemoryCache.Key f58650E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final Integer f58651F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final Drawable f58652G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final Integer f58653H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public final Drawable f58654I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public final Integer f58655J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public final Drawable f58656K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final C27246c f58657L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final C27245b f58658M;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f58659a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f58660b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final K2.c f58661c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final b f58662d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final MemoryCache.Key f58663e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f58664f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Bitmap.Config f58665g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final ColorSpace f58666h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Precision f58667i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Q<h.a<?>, Class<?>> f58668j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final h.a f58669k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final List<L2.c> f58670l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final c.a f58671m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Headers f58672n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final y f58673o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f58674p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f58675q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f58676r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f58677s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final CachePolicy f58678t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final CachePolicy f58679u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final CachePolicy f58680v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final M f58681w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final M f58682x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final M f58683y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final M f58684z;

    public p() {
        throw null;
    }

    public p(Context context, Object obj, K2.c cVar, b bVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Q q12, h.a aVar, List list, c.a aVar2, Headers headers, y yVar, boolean z12, boolean z13, boolean z14, boolean z15, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, M m12, M m13, M m14, M m15, Lifecycle lifecycle, InterfaceC27254h interfaceC27254h, Scale scale, u uVar, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, C27246c c27246c, C27245b c27245b, C42822w c42822w) {
        this.f58659a = context;
        this.f58660b = obj;
        this.f58661c = cVar;
        this.f58662d = bVar;
        this.f58663e = key;
        this.f58664f = str;
        this.f58665g = config;
        this.f58666h = colorSpace;
        this.f58667i = precision;
        this.f58668j = q12;
        this.f58669k = aVar;
        this.f58670l = list;
        this.f58671m = aVar2;
        this.f58672n = headers;
        this.f58673o = yVar;
        this.f58674p = z12;
        this.f58675q = z13;
        this.f58676r = z14;
        this.f58677s = z15;
        this.f58678t = cachePolicy;
        this.f58679u = cachePolicy2;
        this.f58680v = cachePolicy3;
        this.f58681w = m12;
        this.f58682x = m13;
        this.f58683y = m14;
        this.f58684z = m15;
        this.f58646A = lifecycle;
        this.f58647B = interfaceC27254h;
        this.f58648C = scale;
        this.f58649D = uVar;
        this.f58650E = key2;
        this.f58651F = num;
        this.f58652G = drawable;
        this.f58653H = num2;
        this.f58654I = drawable2;
        this.f58655J = num3;
        this.f58656K = drawable3;
        this.f58657L = c27246c;
        this.f58658M = c27245b;
    }

    public static a a(p pVar) {
        Context context = pVar.f58659a;
        pVar.getClass();
        return new a(pVar, context);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (L.f(this.f58659a, pVar.f58659a) && L.f(this.f58660b, pVar.f58660b) && L.f(this.f58661c, pVar.f58661c) && L.f(this.f58662d, pVar.f58662d) && L.f(this.f58663e, pVar.f58663e) && L.f(this.f58664f, pVar.f58664f) && this.f58665g == pVar.f58665g && L.f(this.f58666h, pVar.f58666h) && this.f58667i == pVar.f58667i && L.f(this.f58668j, pVar.f58668j) && L.f(this.f58669k, pVar.f58669k) && L.f(this.f58670l, pVar.f58670l) && L.f(this.f58671m, pVar.f58671m) && L.f(this.f58672n, pVar.f58672n) && L.f(this.f58673o, pVar.f58673o) && this.f58674p == pVar.f58674p && this.f58675q == pVar.f58675q && this.f58676r == pVar.f58676r && this.f58677s == pVar.f58677s && this.f58678t == pVar.f58678t && this.f58679u == pVar.f58679u && this.f58680v == pVar.f58680v && L.f(this.f58681w, pVar.f58681w) && L.f(this.f58682x, pVar.f58682x) && L.f(this.f58683y, pVar.f58683y) && L.f(this.f58684z, pVar.f58684z) && L.f(this.f58650E, pVar.f58650E) && L.f(this.f58651F, pVar.f58651F) && L.f(this.f58652G, pVar.f58652G) && L.f(this.f58653H, pVar.f58653H) && L.f(this.f58654I, pVar.f58654I) && L.f(this.f58655J, pVar.f58655J) && L.f(this.f58656K, pVar.f58656K) && L.f(this.f58646A, pVar.f58646A) && L.f(this.f58647B, pVar.f58647B) && this.f58648C == pVar.f58648C && L.f(this.f58649D, pVar.f58649D) && L.f(this.f58657L, pVar.f58657L) && L.f(this.f58658M, pVar.f58658M)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA2 = C23088b.a(this.f58659a.hashCode() * 31, 31, this.f58660b);
        K2.c cVar = this.f58661c;
        int iHashCode = (iA2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        b bVar = this.f58662d;
        int iHashCode2 = (iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        MemoryCache.Key key = this.f58663e;
        int iHashCode3 = (iHashCode2 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f58664f;
        int iHashCode4 = (this.f58665g.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        ColorSpace colorSpace = this.f58666h;
        int iHashCode5 = (this.f58667i.hashCode() + ((iHashCode4 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31;
        Q<h.a<?>, Class<?>> q12 = this.f58668j;
        int iHashCode6 = (iHashCode5 + (q12 != null ? q12.hashCode() : 0)) * 31;
        h.a aVar = this.f58669k;
        int iC2 = AK.c.c((this.f58648C.hashCode() + ((this.f58647B.hashCode() + ((this.f58646A.hashCode() + ((this.f58684z.hashCode() + ((this.f58683y.hashCode() + ((this.f58682x.hashCode() + ((this.f58681w.hashCode() + ((this.f58680v.hashCode() + ((this.f58679u.hashCode() + ((this.f58678t.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(AK.c.c((this.f58672n.hashCode() + ((this.f58671m.hashCode() + H.e((iHashCode6 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.f58670l)) * 31)) * 31, 31, this.f58673o.f58747a), 31, this.f58674p), 31, this.f58675q), 31, this.f58676r), 31, this.f58677s)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f58649D.f58733b);
        MemoryCache.Key key2 = this.f58650E;
        int iHashCode7 = (iC2 + (key2 != null ? key2.hashCode() : 0)) * 31;
        Integer num = this.f58651F;
        int iHashCode8 = (iHashCode7 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.f58652G;
        int iHashCode9 = (iHashCode8 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.f58653H;
        int iHashCode10 = (iHashCode9 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f58654I;
        int iHashCode11 = (iHashCode10 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.f58655J;
        int iHashCode12 = (iHashCode11 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f58656K;
        return this.f58658M.hashCode() + ((this.f58657L.hashCode() + ((iHashCode12 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31);
    }

    /* compiled from: ImageRequest.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/p$a;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        @Y61.l
        public Scale f58685A;

        /* renamed from: B, reason: collision with root package name */
        @Y61.l
        public Lifecycle f58686B;

        /* renamed from: C, reason: collision with root package name */
        @Y61.l
        public InterfaceC27254h f58687C;

        /* renamed from: D, reason: collision with root package name */
        @Y61.l
        public Scale f58688D;

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Context f58689a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public C27245b f58690b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public Object f58691c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public K2.c f58692d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public b f58693e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final MemoryCache.Key f58694f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f58695g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final ColorSpace f58696h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public Precision f58697i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final Q<? extends h.a<?>, ? extends Class<?>> f58698j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final h.a f58699k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public List<? extends L2.c> f58700l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public c.a f58701m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final Headers.Builder f58702n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public final LinkedHashMap f58703o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f58704p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f58705q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.l
        public final u.a f58706r;

        /* renamed from: s, reason: collision with root package name */
        @Y61.l
        public final MemoryCache.Key f58707s;

        /* renamed from: t, reason: collision with root package name */
        @InterfaceC42165v
        @Y61.l
        public final Integer f58708t;

        /* renamed from: u, reason: collision with root package name */
        @Y61.l
        public final Drawable f58709u;

        /* renamed from: v, reason: collision with root package name */
        @InterfaceC42165v
        @Y61.l
        public final Integer f58710v;

        /* renamed from: w, reason: collision with root package name */
        @Y61.l
        public final Drawable f58711w;

        /* renamed from: x, reason: collision with root package name */
        @InterfaceC42165v
        @Y61.l
        public final Integer f58712x;

        /* renamed from: y, reason: collision with root package name */
        @Y61.l
        public final Drawable f58713y;

        /* renamed from: z, reason: collision with root package name */
        @Y61.l
        public InterfaceC27254h f58714z;

        public a(p pVar, Context context, int i12, C42822w c42822w) {
            this(pVar, (i12 & 2) != 0 ? pVar.f58659a : context);
        }

        @Y61.k
        public final p a() {
            y yVar;
            M m12;
            InterfaceC27254h interfaceC27254h;
            View view;
            InterfaceC27254h c27250d;
            ImageView.ScaleType scaleType;
            Object obj = this.f58691c;
            if (obj == null) {
                obj = r.f58715a;
            }
            Object obj2 = obj;
            K2.c cVar = this.f58692d;
            b bVar = this.f58693e;
            C27245b c27245b = this.f58690b;
            Bitmap.Config config = c27245b.f58628g;
            Precision precision = this.f58697i;
            if (precision == null) {
                precision = c27245b.f58627f;
            }
            Precision precision2 = precision;
            List<? extends L2.c> list = this.f58700l;
            c.a aVar = this.f58701m;
            c.a aVar2 = aVar == null ? c27245b.f58626e : aVar;
            Headers.Builder builder = this.f58702n;
            C42822w c42822w = null;
            Headers headersBuild = builder != null ? builder.build() : null;
            if (headersBuild == null) {
                headersBuild = coil.util.l.f58783c;
            } else {
                Bitmap.Config[] configArr = coil.util.l.f58781a;
            }
            Headers headers = headersBuild;
            LinkedHashMap linkedHashMap = this.f58703o;
            if (linkedHashMap != null) {
                y.f58745b.getClass();
                yVar = new y(coil.util.c.b(linkedHashMap), c42822w);
            } else {
                yVar = null;
            }
            y yVar2 = yVar == null ? y.f58746c : yVar;
            C27245b c27245b2 = this.f58690b;
            boolean z12 = c27245b2.f58629h;
            boolean z13 = c27245b2.f58630i;
            CachePolicy cachePolicy = c27245b2.f58634m;
            CachePolicy cachePolicy2 = c27245b2.f58635n;
            CachePolicy cachePolicy3 = c27245b2.f58636o;
            M m13 = c27245b2.f58622a;
            M m14 = c27245b2.f58623b;
            c.a aVar3 = aVar2;
            M m15 = c27245b2.f58624c;
            M m16 = c27245b2.f58625d;
            Lifecycle lifecycle = this.f58686B;
            Context context = this.f58689a;
            if (lifecycle == null) {
                K2.c cVar2 = this.f58692d;
                m12 = m13;
                Object context2 = cVar2 instanceof K2.d ? ((K2.d) cVar2).getView().getContext() : context;
                while (true) {
                    if (context2 instanceof InterfaceC22983P) {
                        lifecycle = ((InterfaceC22983P) context2).getLifecycle();
                        break;
                    }
                    if (!(context2 instanceof ContextWrapper)) {
                        lifecycle = null;
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
                if (lifecycle == null) {
                    lifecycle = f.f58644b;
                }
            } else {
                m12 = m13;
            }
            Lifecycle lifecycle2 = lifecycle;
            InterfaceC27254h interfaceC27254h2 = this.f58714z;
            if (interfaceC27254h2 == null && (interfaceC27254h2 = this.f58687C) == null) {
                K2.c cVar3 = this.f58692d;
                if (cVar3 instanceof K2.d) {
                    View view2 = ((K2.d) cVar3).getView();
                    c27250d = ((view2 instanceof ImageView) && ((scaleType = ((ImageView) view2).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? new C27251e(C27253g.f58764c) : new C27252f(view2);
                } else {
                    c27250d = new C27250d(context);
                }
                interfaceC27254h = c27250d;
            } else {
                interfaceC27254h = interfaceC27254h2;
            }
            Scale scale = this.f58685A;
            if (scale == null && (scale = this.f58688D) == null) {
                InterfaceC27254h interfaceC27254h3 = this.f58714z;
                InterfaceC27256j interfaceC27256j = interfaceC27254h3 instanceof InterfaceC27256j ? (InterfaceC27256j) interfaceC27254h3 : null;
                if (interfaceC27256j == null || (view = interfaceC27256j.getView()) == null) {
                    K2.c cVar4 = this.f58692d;
                    K2.d dVar = cVar4 instanceof K2.d ? (K2.d) cVar4 : null;
                    view = dVar != null ? dVar.getView() : null;
                }
                if (view instanceof ImageView) {
                    Bitmap.Config[] configArr2 = coil.util.l.f58781a;
                    ImageView.ScaleType scaleType2 = ((ImageView) view).getScaleType();
                    int i12 = scaleType2 == null ? -1 : l.a.f58784a[scaleType2.ordinal()];
                    scale = (i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4) ? Scale.f58756c : Scale.f58755b;
                } else {
                    scale = Scale.f58756c;
                }
            }
            Scale scale2 = scale;
            u.a aVar4 = this.f58706r;
            u uVar = aVar4 != null ? new u(coil.util.c.b(aVar4.f58734a), null) : null;
            if (uVar == null) {
                uVar = u.f58732c;
            }
            return new p(this.f58689a, obj2, cVar, bVar, this.f58694f, this.f58695g, config, this.f58696h, precision2, this.f58698j, this.f58699k, list, aVar3, headers, yVar2, this.f58704p, z12, z13, this.f58705q, cachePolicy, cachePolicy2, cachePolicy3, m12, m14, m15, m16, lifecycle2, interfaceC27254h, scale2, uVar, this.f58707s, this.f58708t, this.f58709u, this.f58710v, this.f58711w, this.f58712x, this.f58713y, new C27246c(this.f58714z, this.f58685A, this.f58701m, this.f58697i), this.f58690b, null);
        }

        public final void b() {
            this.f58686B = null;
            this.f58687C = null;
            this.f58688D = null;
        }

        public a(@Y61.k Context context) {
            this.f58689a = context;
            this.f58690b = coil.util.k.f58780a;
            this.f58691c = null;
            this.f58692d = null;
            this.f58693e = null;
            this.f58694f = null;
            this.f58695g = null;
            this.f58696h = null;
            this.f58697i = null;
            this.f58698j = null;
            this.f58699k = null;
            this.f58700l = C42784z0.f406748b;
            this.f58701m = null;
            this.f58702n = null;
            this.f58703o = null;
            this.f58704p = true;
            this.f58705q = true;
            this.f58706r = null;
            this.f58707s = null;
            this.f58708t = null;
            this.f58709u = null;
            this.f58710v = null;
            this.f58711w = null;
            this.f58712x = null;
            this.f58713y = null;
            this.f58714z = null;
            this.f58685A = null;
            this.f58686B = null;
            this.f58687C = null;
            this.f58688D = null;
        }

        @X41.j
        public a(@Y61.k p pVar, @Y61.k Context context) {
            this.f58689a = context;
            this.f58690b = pVar.f58658M;
            this.f58691c = pVar.f58660b;
            this.f58692d = pVar.f58661c;
            this.f58693e = pVar.f58662d;
            this.f58694f = pVar.f58663e;
            this.f58695g = pVar.f58664f;
            C27246c c27246c = pVar.f58657L;
            c27246c.getClass();
            this.f58696h = pVar.f58666h;
            this.f58697i = c27246c.f58640d;
            this.f58698j = pVar.f58668j;
            this.f58699k = pVar.f58669k;
            this.f58700l = pVar.f58670l;
            this.f58701m = c27246c.f58639c;
            this.f58702n = pVar.f58672n.newBuilder();
            this.f58703o = new LinkedHashMap(pVar.f58673o.f58747a);
            this.f58704p = pVar.f58674p;
            this.f58705q = pVar.f58677s;
            u uVar = pVar.f58649D;
            uVar.getClass();
            this.f58706r = new u.a(uVar);
            this.f58707s = pVar.f58650E;
            this.f58708t = pVar.f58651F;
            this.f58709u = pVar.f58652G;
            this.f58710v = pVar.f58653H;
            this.f58711w = pVar.f58654I;
            this.f58712x = pVar.f58655J;
            this.f58713y = pVar.f58656K;
            this.f58714z = c27246c.f58637a;
            this.f58685A = c27246c.f58638b;
            if (pVar.f58659a == context) {
                this.f58686B = pVar.f58646A;
                this.f58687C = pVar.f58647B;
                this.f58688D = pVar.f58648C;
            } else {
                this.f58686B = null;
                this.f58687C = null;
                this.f58688D = null;
            }
        }
    }

    /* compiled from: ImageRequest.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcoil/request/p$b;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ImageRequest.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }

        @K
        default void onCancel() {
        }

        @K
        default void a(@Y61.k p pVar) {
        }

        @K
        default void b(@Y61.k p pVar, @Y61.k e eVar) {
        }

        @K
        default void c(@Y61.k p pVar, @Y61.k x xVar) {
        }
    }
}
