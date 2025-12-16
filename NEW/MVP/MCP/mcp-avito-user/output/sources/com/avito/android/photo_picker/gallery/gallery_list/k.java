package com.avito.android.photo_picker.gallery.gallery_list;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GalleryUriPhotoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/gallery/gallery_list/k;", "Lcom/avito/android/photo_picker/legacy/thumbnail_list/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k extends com.avito.android.photo_picker.legacy.thumbnail_list.a {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Uri f219545e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f219546f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f219547g;

    /* renamed from: h, reason: collision with root package name */
    public int f219548h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f219549i;

    /* renamed from: j, reason: collision with root package name */
    public final long f219550j;

    /* renamed from: k, reason: collision with root package name */
    public final long f219551k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f219552l;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(String str, Uri uri, String str2, String str3, int i12, boolean z12, String str4, long j12, long j13, boolean z13, int i13, C42822w c42822w) {
        i12 = (i13 & 16) != 0 ? 0 : i12;
        z12 = (i13 & 32) != 0 ? false : z12;
        z13 = (i13 & 512) != 0 ? false : z13;
        super(str, i12 > 0, z12);
        this.f219545e = uri;
        this.f219546f = str2;
        this.f219547g = str3;
        this.f219548h = i12;
        this.f219549i = str4;
        this.f219550j = j12;
        this.f219551k = j13;
        this.f219552l = z13;
    }
}
