package com.avito.android.photo_gallery.adapter;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.beduin_teaser.BeduinItemTeaser;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GalleryItem.kt */
@P
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/q;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "Lcom/avito/android/photo_gallery/adapter/q$a;", "Lcom/avito/android/photo_gallery/adapter/q$b;", "Lcom/avito/android/photo_gallery/adapter/q$c;", "Lcom/avito/android/photo_gallery/adapter/q$d;", "Lcom/avito/android/photo_gallery/adapter/q$e;", "Lcom/avito/android/photo_gallery/adapter/q$f;", "Lcom/avito/android/photo_gallery/adapter/q$g;", "Lcom/avito/android/photo_gallery/adapter/q$h;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class q {

    /* compiled from: GalleryItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/q$a;", "Lcom/avito/android/photo_gallery/adapter/q;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Image f216762a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Image f216763b;

        public a(@Y61.k Image image, @Y61.k Image image2) {
            super(null);
            this.f216762a = image;
            this.f216763b = image2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f216762a, aVar.f216762a) && L.f(this.f216763b, aVar.f216763b);
        }

        public final int hashCode() {
            return this.f216763b.hashCode() + (this.f216762a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GalleryAiDesignImage(image=");
            sb2.append(this.f216762a);
            sb2.append(", divideImage=");
            return AK.c.o(sb2, this.f216763b, ')');
        }
    }

    /* compiled from: GalleryItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/q$b;", "Lcom/avito/android/photo_gallery/adapter/q;", "Lcom/avito/android/photo_gallery/adapter/s;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends q implements s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BeduinItemTeaser f216764a;

        public b(@Y61.k BeduinItemTeaser beduinItemTeaser) {
            super(null);
            this.f216764a = beduinItemTeaser;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f216764a, ((b) obj).f216764a);
        }

        public final int hashCode() {
            return this.f216764a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "GalleryBeduinTeaser(beduinTeaser=" + this.f216764a + ')';
        }
    }

    /* compiled from: GalleryItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/q$c;", "Lcom/avito/android/photo_gallery/adapter/q;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Image f216765a;

        public c(@Y61.k Image image) {
            super(null);
            this.f216765a = image;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f216765a, ((c) obj).f216765a);
        }

        public final int hashCode() {
            return this.f216765a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.o(new StringBuilder("GalleryImage(image="), this.f216765a, ')');
        }
    }

    /* compiled from: GalleryItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/q$d;", "Lcom/avito/android/photo_gallery/adapter/q;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final NativeVideo f216766a;

        public d(@Y61.k NativeVideo nativeVideo) {
            super(null);
            this.f216766a = nativeVideo;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f216766a, ((d) obj).f216766a);
        }

        public final int hashCode() {
            return this.f216766a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "GalleryNativeVideo(nativeVideo=" + this.f216766a + ')';
        }
    }

    /* compiled from: GalleryItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/q$e;", "Lcom/avito/android/photo_gallery/adapter/q;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Image f216767a;

        public e(@Y61.k Image image) {
            super(null);
            this.f216767a = image;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f216767a, ((e) obj).f216767a);
        }

        public final int hashCode() {
            return this.f216767a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.o(new StringBuilder("GalleryRealtyLayoutImage(image="), this.f216767a, ')');
        }
    }

    /* compiled from: GalleryItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/q$f;", "Lcom/avito/android/photo_gallery/adapter/q;", "Lcom/avito/android/photo_gallery/adapter/s;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends q implements s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final GalleryTeaser f216768a;

        public f(@Y61.k GalleryTeaser galleryTeaser) {
            super(null);
            this.f216768a = galleryTeaser;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f216768a, ((f) obj).f216768a);
        }

        public final int hashCode() {
            return this.f216768a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "GalleryTeaser(galleryTeaser=" + this.f216768a + ')';
        }
    }

    /* compiled from: GalleryItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/q$g;", "Lcom/avito/android/photo_gallery/adapter/q;", "Lcom/avito/android/photo_gallery/adapter/s;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g extends q implements s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AutotekaTeaserResult f216769a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f216770b;

        public g(@Y61.k AutotekaTeaserResult autotekaTeaserResult, boolean z12) {
            super(null);
            this.f216769a = autotekaTeaserResult;
            this.f216770b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f216769a, gVar.f216769a) && this.f216770b == gVar.f216770b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f216770b) + (this.f216769a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GalleryTeaserAutoteka(autotekaTeaser=");
            sb2.append(this.f216769a);
            sb2.append(", isFullScreen=");
            return androidx.appcompat.app.r.x(sb2, this.f216770b, ')');
        }
    }

    /* compiled from: GalleryItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/q$h;", "Lcom/avito/android/photo_gallery/adapter/q;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Video f216771a;

        public h(@Y61.k Video video) {
            super(null);
            this.f216771a = video;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f216771a, ((h) obj).f216771a);
        }

        public final int hashCode() {
            return this.f216771a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "GalleryVideo(video=" + this.f216771a + ')';
        }
    }

    public /* synthetic */ q(C42822w c42822w) {
        this();
    }

    public q() {
    }
}
