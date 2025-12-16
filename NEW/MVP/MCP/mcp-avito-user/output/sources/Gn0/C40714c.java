package gn0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ReviewGalleryState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lgn0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gn0.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C40714c extends q {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f396856m = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f396857b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f396858c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Float f396859d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f396860e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f396861f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Image f396862g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f396863h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f396864i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f396865j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final GalleryItem.GalleryButton f396866k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final GalleryItem.GalleryButton f396867l;

    /* compiled from: ReviewGalleryState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgn0/c$a;", "", "<init>", "()V", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C40714c(@l String str, @k String str2, @l Float f12, @l String str3, @l String str4, @l Image image, @k String str5, @l String str6, @l String str7, @l GalleryItem.GalleryButton galleryButton, @l GalleryItem.GalleryButton galleryButton2) {
        this.f396857b = str;
        this.f396858c = str2;
        this.f396859d = f12;
        this.f396860e = str3;
        this.f396861f = str4;
        this.f396862g = image;
        this.f396863h = str5;
        this.f396864i = str6;
        this.f396865j = str7;
        this.f396866k = galleryButton;
        this.f396867l = galleryButton2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40714c)) {
            return false;
        }
        C40714c c40714c = (C40714c) obj;
        return L.f(this.f396857b, c40714c.f396857b) && L.f(this.f396858c, c40714c.f396858c) && L.f(this.f396859d, c40714c.f396859d) && L.f(this.f396860e, c40714c.f396860e) && L.f(this.f396861f, c40714c.f396861f) && L.f(this.f396862g, c40714c.f396862g) && L.f(this.f396863h, c40714c.f396863h) && L.f(this.f396864i, c40714c.f396864i) && L.f(this.f396865j, c40714c.f396865j) && L.f(this.f396866k, c40714c.f396866k) && L.f(this.f396867l, c40714c.f396867l);
    }

    public final int hashCode() {
        String str = this.f396857b;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f396858c);
        Float f12 = this.f396859d;
        int iHashCode = (iD2 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str2 = this.f396860e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f396861f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Image image = this.f396862g;
        int iD3 = H.d((iHashCode3 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f396863h);
        String str4 = this.f396864i;
        int iHashCode4 = (iD3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f396865j;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        GalleryItem.GalleryButton galleryButton = this.f396866k;
        int iHashCode6 = (iHashCode5 + (galleryButton == null ? 0 : galleryButton.hashCode())) * 31;
        GalleryItem.GalleryButton galleryButton2 = this.f396867l;
        return iHashCode6 + (galleryButton2 != null ? galleryButton2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ReviewGalleryState(toolbarTitle=" + this.f396857b + ", name=" + this.f396858c + ", score=" + this.f396859d + ", date=" + this.f396860e + ", description=" + this.f396861f + ", contactBarAvatar=" + this.f396862g + ", contactBarName=" + this.f396863h + ", contactBarTitle=" + this.f396864i + ", contactBarPrice=" + this.f396865j + ", contactBarAction1=" + this.f396866k + ", contactBarAction2=" + this.f396867l + ')';
    }
}
