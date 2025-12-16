package com.avito.android.image.enhancement;

import android.net.Uri;
import com.avito.android.photo_cache.PhotoUpload;
import kotlin.Metadata;

/* compiled from: ImageEnhanceViewModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/photo_cache/PhotoUpload;", "photo", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/Q;", "Landroid/net/Uri;", "", "apply", "(Lcom/avito/android/photo_cache/PhotoUpload;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class M<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f169344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C30979j f169345c;

    public M(boolean z12, C30979j c30979j) {
        this.f169344b = z12;
        this.f169345c = c30979j;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        PhotoUpload photoUpload = (PhotoUpload) obj;
        Uri uri = photoUpload.f216305g;
        if (this.f169344b) {
            String str = photoUpload.f216304f;
            if (str == null) {
                str = "";
            }
            if (uri == null) {
                uri = Uri.EMPTY;
            }
            C30979j c30979j = this.f169345c;
            return c30979j.f169380c.d(uri, str).r(new K(uri)).k(new L(c30979j));
        }
        Uri uri2 = photoUpload.f216310l;
        if (uri2 != null) {
            uri = uri2;
        } else if (uri == null && (uri = photoUpload.f216308j) == null) {
            uri = Uri.EMPTY;
        }
        return io.reactivex.rxjava3.core.I.q(uri).r(J.f169341b);
    }
}
