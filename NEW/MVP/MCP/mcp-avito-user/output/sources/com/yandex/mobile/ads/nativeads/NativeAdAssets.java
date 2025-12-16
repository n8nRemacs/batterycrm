package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.b30;
import com.yandex.mobile.ads.impl.w20;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public abstract class NativeAdAssets {

    /* renamed from: a, reason: collision with root package name */
    @P
    private NativeAdMedia f392533a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private String f392534b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private String f392535c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private String f392536d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private String f392537e;

    /* renamed from: f, reason: collision with root package name */
    @P
    private NativeAdImage f392538f;

    /* renamed from: g, reason: collision with root package name */
    @P
    private NativeAdImage f392539g;

    /* renamed from: h, reason: collision with root package name */
    @P
    private NativeAdImage f392540h;

    /* renamed from: i, reason: collision with root package name */
    @P
    private String f392541i;

    /* renamed from: j, reason: collision with root package name */
    @P
    private Float f392542j;

    /* renamed from: k, reason: collision with root package name */
    @P
    private String f392543k;

    /* renamed from: l, reason: collision with root package name */
    @P
    private String f392544l;

    /* renamed from: m, reason: collision with root package name */
    @P
    private String f392545m;

    /* renamed from: n, reason: collision with root package name */
    @P
    private String f392546n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f392547o;

    public final void a(@P String str) {
        this.f392534b = str;
    }

    public final void b(@P String str) {
        this.f392535c = str;
    }

    public final void c(@P String str) {
        this.f392536d = str;
    }

    public final void d(@P String str) {
        this.f392537e = str;
    }

    public final void e(@P String str) {
        this.f392541i = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NativeAdAssets nativeAdAssets = (NativeAdAssets) obj;
        NativeAdMedia nativeAdMedia = this.f392533a;
        if (nativeAdMedia == null ? nativeAdAssets.f392533a != null : !nativeAdMedia.equals(nativeAdAssets.f392533a)) {
            return false;
        }
        String str = this.f392534b;
        if (str == null ? nativeAdAssets.f392534b != null : !str.equals(nativeAdAssets.f392534b)) {
            return false;
        }
        String str2 = this.f392535c;
        if (str2 == null ? nativeAdAssets.f392535c != null : !str2.equals(nativeAdAssets.f392535c)) {
            return false;
        }
        String str3 = this.f392536d;
        if (str3 == null ? nativeAdAssets.f392536d != null : !str3.equals(nativeAdAssets.f392536d)) {
            return false;
        }
        String str4 = this.f392537e;
        if (str4 == null ? nativeAdAssets.f392537e != null : !str4.equals(nativeAdAssets.f392537e)) {
            return false;
        }
        NativeAdImage nativeAdImage = this.f392538f;
        if (nativeAdImage == null ? nativeAdAssets.f392538f != null : !nativeAdImage.equals(nativeAdAssets.f392538f)) {
            return false;
        }
        NativeAdImage nativeAdImage2 = this.f392539g;
        if (nativeAdImage2 == null ? nativeAdAssets.f392539g != null : !nativeAdImage2.equals(nativeAdAssets.f392539g)) {
            return false;
        }
        NativeAdImage nativeAdImage3 = this.f392540h;
        if (nativeAdImage3 == null ? nativeAdAssets.f392540h != null : !nativeAdImage3.equals(nativeAdAssets.f392540h)) {
            return false;
        }
        String str5 = this.f392541i;
        if (str5 == null ? nativeAdAssets.f392541i != null : !str5.equals(nativeAdAssets.f392541i)) {
            return false;
        }
        Float f12 = this.f392542j;
        if (f12 == null ? nativeAdAssets.f392542j != null : !f12.equals(nativeAdAssets.f392542j)) {
            return false;
        }
        String str6 = this.f392543k;
        if (str6 == null ? nativeAdAssets.f392543k != null : !str6.equals(nativeAdAssets.f392543k)) {
            return false;
        }
        String str7 = this.f392544l;
        if (str7 == null ? nativeAdAssets.f392544l != null : !str7.equals(nativeAdAssets.f392544l)) {
            return false;
        }
        String str8 = this.f392545m;
        if (str8 == null ? nativeAdAssets.f392545m != null : !str8.equals(nativeAdAssets.f392545m)) {
            return false;
        }
        String str9 = this.f392546n;
        String str10 = nativeAdAssets.f392546n;
        return str9 != null ? str9.equals(str10) : str10 == null;
    }

    public final void f(@P String str) {
        if (str != null) {
            try {
                this.f392542j = Float.valueOf(Float.parseFloat(str));
            } catch (NumberFormatException unused) {
            }
        }
    }

    public final void g(@P String str) {
        this.f392543k = str;
    }

    @P
    public String getAge() {
        return this.f392534b;
    }

    @P
    public String getBody() {
        return this.f392535c;
    }

    @P
    public String getCallToAction() {
        return this.f392536d;
    }

    @P
    public String getDomain() {
        return this.f392537e;
    }

    @P
    public NativeAdImage getFavicon() {
        return this.f392538f;
    }

    @P
    public NativeAdImage getIcon() {
        return this.f392539g;
    }

    @P
    public NativeAdImage getImage() {
        return this.f392540h;
    }

    @P
    public NativeAdMedia getMedia() {
        return this.f392533a;
    }

    @P
    public String getPrice() {
        return this.f392541i;
    }

    @P
    public Float getRating() {
        return this.f392542j;
    }

    @P
    public String getReviewCount() {
        return this.f392543k;
    }

    @P
    public String getSponsored() {
        return this.f392544l;
    }

    @P
    public String getTitle() {
        return this.f392545m;
    }

    @P
    public String getWarning() {
        return this.f392546n;
    }

    public final void h(@P String str) {
        this.f392544l = str;
    }

    public int hashCode() {
        NativeAdMedia nativeAdMedia = this.f392533a;
        int iHashCode = (nativeAdMedia != null ? nativeAdMedia.hashCode() : 0) * 31;
        String str = this.f392534b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f392535c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f392536d;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f392537e;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        NativeAdImage nativeAdImage = this.f392538f;
        int iHashCode6 = (iHashCode5 + (nativeAdImage != null ? nativeAdImage.hashCode() : 0)) * 31;
        NativeAdImage nativeAdImage2 = this.f392539g;
        int iHashCode7 = (iHashCode6 + (nativeAdImage2 != null ? nativeAdImage2.hashCode() : 0)) * 31;
        NativeAdImage nativeAdImage3 = this.f392540h;
        int iHashCode8 = (iHashCode7 + (nativeAdImage3 != null ? nativeAdImage3.hashCode() : 0)) * 31;
        String str5 = this.f392541i;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Float f12 = this.f392542j;
        int iHashCode10 = (iHashCode9 + (f12 != null ? f12.hashCode() : 0)) * 31;
        String str6 = this.f392543k;
        int iHashCode11 = (iHashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f392544l;
        int iHashCode12 = (iHashCode11 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f392545m;
        int iHashCode13 = (iHashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f392546n;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void i(@P String str) {
        this.f392545m = str;
    }

    public boolean isFeedbackAvailable() {
        return this.f392547o;
    }

    public final void j(@P String str) {
        this.f392546n = str;
    }

    public final void a(boolean z12) {
        this.f392547o = z12;
    }

    public final void b(@P b30 b30Var, @N w20 w20Var) {
        NativeAdImage nativeAdImage;
        if (b30Var != null) {
            nativeAdImage = new NativeAdImage();
            nativeAdImage.a(b30Var.a());
            nativeAdImage.b(b30Var.e());
            nativeAdImage.a(b30Var.b());
            nativeAdImage.a(w20Var.a(b30Var));
        } else {
            nativeAdImage = null;
        }
        this.f392539g = nativeAdImage;
    }

    public final void c(@P b30 b30Var, @N w20 w20Var) {
        NativeAdImage nativeAdImage;
        if (b30Var != null) {
            nativeAdImage = new NativeAdImage();
            nativeAdImage.a(b30Var.a());
            nativeAdImage.b(b30Var.e());
            nativeAdImage.a(b30Var.b());
            nativeAdImage.a(w20Var.a(b30Var));
        } else {
            nativeAdImage = null;
        }
        this.f392540h = nativeAdImage;
    }

    public final void a(@P NativeAdMedia nativeAdMedia) {
        this.f392533a = nativeAdMedia;
    }

    public final void a(@P b30 b30Var, @N w20 w20Var) {
        NativeAdImage nativeAdImage;
        if (b30Var != null) {
            nativeAdImage = new NativeAdImage();
            nativeAdImage.a(b30Var.a());
            nativeAdImage.b(b30Var.e());
            nativeAdImage.a(b30Var.b());
            nativeAdImage.a(w20Var.a(b30Var));
        } else {
            nativeAdImage = null;
        }
        this.f392538f = nativeAdImage;
    }
}
