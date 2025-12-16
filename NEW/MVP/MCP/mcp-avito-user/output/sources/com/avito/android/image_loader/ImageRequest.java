package com.avito.android.image_loader;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.util.K4;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import j.InterfaceC42165v;
import j.U;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ImageRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/image_loader/ImageRequest;", "", "a", "CacheChoice", "b", "ScaleType", "c", "d", "SourcePlace", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ImageRequest {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f169447a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f169448b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f169449c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.tns_gallery.p f169450d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final b f169451e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Drawable f169452f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final K4 f169453g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final i f169454h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f169455i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f169456j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Integer f169457k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final SourcePlace f169458l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final N f169459m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f169460n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final CacheChoice f169461o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final ScaleType f169462p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f169463q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final Drawable f169464r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final c f169465s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f169466t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Drawable, G0> f169467u;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageRequest.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_loader/ImageRequest$CacheChoice;", "", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CacheChoice {

        /* renamed from: b, reason: collision with root package name */
        public static final CacheChoice f169468b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ CacheChoice[] f169469c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f169470d;

        static {
            CacheChoice cacheChoice = new CacheChoice("DEFAULT", 0);
            CacheChoice cacheChoice2 = new CacheChoice("SMALL", 1);
            f169468b = cacheChoice2;
            CacheChoice[] cacheChoiceArr = {cacheChoice, cacheChoice2};
            f169469c = cacheChoiceArr;
            f169470d = kotlin.enums.c.a(cacheChoiceArr);
        }

        public CacheChoice() {
            throw null;
        }

        public static CacheChoice valueOf(String str) {
            return (CacheChoice) Enum.valueOf(CacheChoice.class, str);
        }

        public static CacheChoice[] values() {
            return (CacheChoice[]) f169469c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageRequest.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_loader/ImageRequest$ScaleType;", "", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScaleType {

        /* renamed from: b, reason: collision with root package name */
        public static final ScaleType f169471b;

        /* renamed from: c, reason: collision with root package name */
        public static final ScaleType f169472c;

        /* renamed from: d, reason: collision with root package name */
        public static final ScaleType f169473d;

        /* renamed from: e, reason: collision with root package name */
        public static final ScaleType f169474e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ScaleType[] f169475f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f169476g;

        static {
            ScaleType scaleType = new ScaleType("SCALE", 0);
            f169471b = scaleType;
            ScaleType scaleType2 = new ScaleType("FILL", 1);
            f169472c = scaleType2;
            ScaleType scaleType3 = new ScaleType("FIT", 2);
            f169473d = scaleType3;
            ScaleType scaleType4 = new ScaleType("CENTER", 3);
            f169474e = scaleType4;
            ScaleType[] scaleTypeArr = {scaleType, scaleType2, scaleType3, scaleType4};
            f169475f = scaleTypeArr;
            f169476g = kotlin.enums.c.a(scaleTypeArr);
        }

        public ScaleType() {
            throw null;
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) Enum.valueOf(ScaleType.class, str);
        }

        public static ScaleType[] values() {
            return (ScaleType[]) f169475f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageRequest.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_loader/ImageRequest$SourcePlace;", "", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SourcePlace {

        /* renamed from: b, reason: collision with root package name */
        public static final SourcePlace f169477b;

        /* renamed from: c, reason: collision with root package name */
        public static final SourcePlace f169478c;

        /* renamed from: d, reason: collision with root package name */
        public static final SourcePlace f169479d;

        /* renamed from: e, reason: collision with root package name */
        public static final SourcePlace f169480e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ SourcePlace[] f169481f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f169482g;

        static {
            SourcePlace sourcePlace = new SourcePlace("SNIPPET", 0);
            f169477b = sourcePlace;
            SourcePlace sourcePlace2 = new SourcePlace("ADVERT_DETAILS_GALLERY", 1);
            f169478c = sourcePlace2;
            SourcePlace sourcePlace3 = new SourcePlace("FULLSCREEN_GALLERY", 2);
            f169479d = sourcePlace3;
            SourcePlace sourcePlace4 = new SourcePlace("CAR_DEAL", 3);
            SourcePlace sourcePlace5 = new SourcePlace(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
            f169480e = sourcePlace5;
            SourcePlace[] sourcePlaceArr = {sourcePlace, sourcePlace2, sourcePlace3, sourcePlace4, sourcePlace5};
            f169481f = sourcePlaceArr;
            f169482g = kotlin.enums.c.a(sourcePlaceArr);
        }

        public SourcePlace() {
            throw null;
        }

        public static SourcePlace valueOf(String str) {
            return (SourcePlace) Enum.valueOf(SourcePlace.class, str);
        }

        public static SourcePlace[] values() {
            return (SourcePlace[]) f169481f.clone();
        }
    }

    /* compiled from: ImageRequest.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_loader/ImageRequest$a;", "", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final h f169483a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public d f169484b;

        /* renamed from: c, reason: collision with root package name */
        @InterfaceC42165v
        @Y61.l
        public Integer f169485c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f169486d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public com.avito.android.tns_gallery.p f169487e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public b f169488f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public K4 f169489g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public i f169490h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f169491i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public Drawable f169492j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public ScaleType f169493k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f169494l;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public Integer f169496n;

        /* renamed from: p, reason: collision with root package name */
        @Y61.l
        public String f169498p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.l
        public CacheChoice f169499q;

        /* renamed from: s, reason: collision with root package name */
        @Y61.l
        public Drawable f169501s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.l
        public c f169502t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f169503u;

        /* renamed from: v, reason: collision with root package name */
        @Y61.l
        public Y41.l<? super Drawable, G0> f169504v;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public SourcePlace f169495m = SourcePlace.f169480e;

        /* renamed from: o, reason: collision with root package name */
        @Y61.k
        public N f169497o = C5012a.f169505l;

        /* renamed from: r, reason: collision with root package name */
        public boolean f169500r = true;

        /* compiled from: ImageRequest.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.image_loader.ImageRequest$a$a, reason: collision with other inner class name */
        public static final class C5012a extends N implements Y41.a<Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final C5012a f169505l = new C5012a();

            public C5012a() {
                super(0);
            }

            @Override // Y41.a
            public final /* bridge */ /* synthetic */ Boolean invoke() {
                return Boolean.TRUE;
            }
        }

        public a(@Y61.k h hVar) {
            this.f169483a = hVar;
        }

        /* JADX WARN: Type inference failed for: r14v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Y61.k
        public final ImageRequest a() {
            d dVar = this.f169484b;
            if (dVar != null) {
                return new ImageRequest(dVar, this.f169485c, this.f169486d, this.f169487e, this.f169488f, this.f169492j, this.f169489g, this.f169490h, this.f169494l, this.f169491i, this.f169496n, this.f169495m, this.f169497o, this.f169498p, this.f169499q, this.f169493k, this.f169500r, this.f169501s, this.f169502t, this.f169503u, this.f169504v);
            }
            throw new IllegalArgumentException("Image source required to build image request");
        }

        public final void b() {
            f(Uri.EMPTY);
            this.f169483a.a(a());
        }

        public final void c() {
            this.f169483a.a(a());
        }

        @Y61.k
        public final void d(@Y61.k k kVar) {
            this.f169484b = new d.b(kVar);
        }

        @Y61.k
        public final void e(int i12) {
            this.f169488f = new b(i12, i12, i12, i12);
        }

        @Y61.k
        public final void f(@Y61.k Uri uri) {
            this.f169484b = new d.C5013d(uri);
        }
    }

    /* compiled from: ImageRequest.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_loader/ImageRequest$b;", "", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f169506a;

        /* renamed from: b, reason: collision with root package name */
        public final int f169507b;

        /* renamed from: c, reason: collision with root package name */
        public final int f169508c;

        /* renamed from: d, reason: collision with root package name */
        public final int f169509d;

        public b(@U int i12, @U int i13, @U int i14, @U int i15) {
            this.f169506a = i12;
            this.f169507b = i13;
            this.f169508c = i14;
            this.f169509d = i15;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f169506a == bVar.f169506a && this.f169507b == bVar.f169507b && this.f169508c == bVar.f169508c && this.f169509d == bVar.f169509d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f169509d) + r.e(this.f169508c, r.e(this.f169507b, Integer.hashCode(this.f169506a) * 31, 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CornersRadii(topLeft=");
            sb2.append(this.f169506a);
            sb2.append(", topRight=");
            sb2.append(this.f169507b);
            sb2.append(", bottomRight=");
            sb2.append(this.f169508c);
            sb2.append(", bottomLeft=");
            return r.t(sb2, this.f169509d, ')');
        }
    }

    /* compiled from: ImageRequest.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_loader/ImageRequest$c;", "", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f169510a;

        /* renamed from: b, reason: collision with root package name */
        public final int f169511b;

        public c(@U int i12, @U int i13) {
            this.f169510a = i12;
            this.f169511b = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f169510a == cVar.f169510a && this.f169511b == cVar.f169511b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f169511b) + (Integer.hashCode(this.f169510a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Size(width=");
            sb2.append(this.f169510a);
            sb2.append(", height=");
            return r.t(sb2, this.f169511b, ')');
        }
    }

    /* compiled from: ImageRequest.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/image_loader/ImageRequest$d;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/image_loader/ImageRequest$d$a;", "Lcom/avito/android/image_loader/ImageRequest$d$b;", "Lcom/avito/android/image_loader/ImageRequest$d$c;", "Lcom/avito/android/image_loader/ImageRequest$d$d;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d {

        /* compiled from: ImageRequest.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_loader/ImageRequest$d$a;", "Lcom/avito/android/image_loader/ImageRequest$d;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Drawable f169512a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final ScaleType f169513b;

            public a(@Y61.k Drawable drawable, @Y61.l ScaleType scaleType) {
                super(null);
                this.f169512a = drawable;
                this.f169513b = scaleType;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f169512a, aVar.f169512a) && this.f169513b == aVar.f169513b;
            }

            public final int hashCode() {
                int iHashCode = this.f169512a.hashCode() * 31;
                ScaleType scaleType = this.f169513b;
                return iHashCode + (scaleType == null ? 0 : scaleType.hashCode());
            }

            @Y61.k
            public final String toString() {
                return "DrawableSource(drawable=" + this.f169512a + ", scaleType=" + this.f169513b + ')';
            }

            public /* synthetic */ a(Drawable drawable, ScaleType scaleType, int i12, C42822w c42822w) {
                this(drawable, (i12 & 2) != 0 ? null : scaleType);
            }
        }

        /* compiled from: ImageRequest.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_loader/ImageRequest$d$b;", "Lcom/avito/android/image_loader/ImageRequest$d;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final k f169514a;

            public b(@Y61.k k kVar) {
                super(null);
                this.f169514a = kVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f169514a, ((b) obj).f169514a);
            }

            public final int hashCode() {
                return this.f169514a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ImageSource(picture=" + this.f169514a + ')';
            }
        }

        /* compiled from: ImageRequest.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_loader/ImageRequest$d$c;", "Lcom/avito/android/image_loader/ImageRequest$d;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends d {

            /* renamed from: a, reason: collision with root package name */
            public final int f169515a;

            public c(@InterfaceC42165v int i12) {
                super(null);
                this.f169515a = i12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f169515a == ((c) obj).f169515a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f169515a);
            }

            @Y61.k
            public final String toString() {
                return r.t(new StringBuilder("ResourceDrawableSource(drawable="), this.f169515a, ')');
            }
        }

        /* compiled from: ImageRequest.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_loader/ImageRequest$d$d;", "Lcom/avito/android/image_loader/ImageRequest$d;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.image_loader.ImageRequest$d$d, reason: collision with other inner class name */
        public static final /* data */ class C5013d extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Uri f169516a;

            public C5013d(@Y61.k Uri uri) {
                super(null);
                this.f169516a = uri;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5013d) && L.f(this.f169516a, ((C5013d) obj).f169516a);
            }

            public final int hashCode() {
                return this.f169516a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.actions_sheet.a.t(new StringBuilder("UriSource(uri="), this.f169516a, ')');
            }
        }

        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImageRequest(@Y61.k d dVar, @InterfaceC42165v @Y61.l Integer num, boolean z12, @Y61.l com.avito.android.tns_gallery.p pVar, @Y61.l b bVar, @Y61.l Drawable drawable, @Y61.l K4 k42, @Y61.l i iVar, boolean z13, boolean z14, @Y61.l Integer num2, @Y61.k SourcePlace sourcePlace, @Y61.k Y41.a aVar, @Y61.l String str, @Y61.l CacheChoice cacheChoice, @Y61.l ScaleType scaleType, boolean z15, @Y61.l Drawable drawable2, @Y61.l c cVar, boolean z16, @Y61.l Y41.l lVar) {
        this.f169447a = dVar;
        this.f169448b = num;
        this.f169449c = z12;
        this.f169450d = pVar;
        this.f169451e = bVar;
        this.f169452f = drawable;
        this.f169453g = k42;
        this.f169454h = iVar;
        this.f169455i = z13;
        this.f169456j = z14;
        this.f169457k = num2;
        this.f169458l = sourcePlace;
        this.f169459m = (N) aVar;
        this.f169460n = str;
        this.f169461o = cacheChoice;
        this.f169462p = scaleType;
        this.f169463q = z15;
        this.f169464r = drawable2;
        this.f169465s = cVar;
        this.f169466t = z16;
        this.f169467u = lVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        return L.f(this.f169447a, imageRequest.f169447a) && L.f(this.f169448b, imageRequest.f169448b) && this.f169449c == imageRequest.f169449c && L.f(this.f169450d, imageRequest.f169450d) && L.f(this.f169451e, imageRequest.f169451e) && L.f(this.f169452f, imageRequest.f169452f) && L.f(this.f169453g, imageRequest.f169453g) && L.f(null, null) && L.f(this.f169454h, imageRequest.f169454h) && L.f(null, null) && this.f169455i == imageRequest.f169455i && L.f(null, null) && this.f169456j == imageRequest.f169456j && L.f(this.f169457k, imageRequest.f169457k) && this.f169458l == imageRequest.f169458l && L.f(this.f169459m, imageRequest.f169459m) && L.f(this.f169460n, imageRequest.f169460n) && this.f169461o == imageRequest.f169461o && this.f169462p == imageRequest.f169462p && this.f169463q == imageRequest.f169463q && L.f(this.f169464r, imageRequest.f169464r) && L.f(this.f169465s, imageRequest.f169465s) && this.f169466t == imageRequest.f169466t && L.f(this.f169467u, imageRequest.f169467u);
    }

    public final int hashCode() {
        int iHashCode = this.f169447a.hashCode() * 31;
        Integer num = this.f169448b;
        int i12 = r.i((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f169449c);
        com.avito.android.tns_gallery.p pVar = this.f169450d;
        int iHashCode2 = (i12 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        b bVar = this.f169451e;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Drawable drawable = this.f169452f;
        int iHashCode4 = (iHashCode3 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        K4 k42 = this.f169453g;
        int i13 = (iHashCode4 + (k42 == null ? 0 : k42.f318644a)) * 961;
        i iVar = this.f169454h;
        int i14 = r.i(r.i(r.i((i13 + (iVar == null ? 0 : iVar.hashCode())) * 961, 31, false), 961, this.f169455i), 31, this.f169456j);
        Integer num2 = this.f169457k;
        int iHashCode5 = (this.f169459m.hashCode() + ((this.f169458l.hashCode() + ((i14 + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31)) * 31;
        String str = this.f169460n;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        CacheChoice cacheChoice = this.f169461o;
        int iHashCode7 = (iHashCode6 + (cacheChoice == null ? 0 : cacheChoice.hashCode())) * 31;
        ScaleType scaleType = this.f169462p;
        int i15 = r.i((iHashCode7 + (scaleType == null ? 0 : scaleType.hashCode())) * 31, 31, this.f169463q);
        Drawable drawable2 = this.f169464r;
        int iHashCode8 = (i15 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        c cVar = this.f169465s;
        int i16 = r.i((iHashCode8 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f169466t);
        Y41.l<Drawable, G0> lVar = this.f169467u;
        return i16 + (lVar != null ? lVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageRequest(source=");
        sb2.append(this.f169447a);
        sb2.append(", failureImage=");
        sb2.append(this.f169448b);
        sb2.append(", centerCrop=");
        sb2.append(this.f169449c);
        sb2.append(", backgroundColorReceiver=");
        sb2.append(this.f169450d);
        sb2.append(", cornersRadii=");
        sb2.append(this.f169451e);
        sb2.append(", placeholder=");
        sb2.append(this.f169452f);
        sb2.append(", rotation=");
        sb2.append(this.f169453g);
        sb2.append(", dominantColorEdgeFallbackColor=null, listener=");
        sb2.append(this.f169454h);
        sb2.append(", lowResRequest=null, autoPlayAnimations=false, noFadeAnimation=");
        sb2.append(this.f169455i);
        sb2.append(", aspectRatio=null, retain=");
        sb2.append(this.f169456j);
        sb2.append(", blur=");
        sb2.append(this.f169457k);
        sb2.append(", sourcePlace=");
        sb2.append(this.f169458l);
        sb2.append(", isConnectionAvailable=");
        sb2.append(this.f169459m);
        sb2.append(", advertId=");
        sb2.append(this.f169460n);
        sb2.append(", cacheChoice=");
        sb2.append(this.f169461o);
        sb2.append(", placeholderScaleType=");
        sb2.append(this.f169462p);
        sb2.append(", cancelOnDetach=");
        sb2.append(this.f169463q);
        sb2.append(", foreground=");
        sb2.append(this.f169464r);
        sb2.append(", overrideSize=");
        sb2.append(this.f169465s);
        sb2.append(", circleCrop=");
        sb2.append(this.f169466t);
        sb2.append(", glideOnResourceReady=");
        return H.l(sb2, this.f169467u, ')');
    }
}
