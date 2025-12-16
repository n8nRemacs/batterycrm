package com.avito.android.image.enhancement;

import android.net.Uri;
import com.avito.android.photo_cache.EnhanceState;
import com.avito.android.photo_cache.PhotoUpload;
import kotlin.Metadata;

/* compiled from: ImageEnhanceViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Landroid/net/Uri;", "", "<name for destructuring parameter 0>", "Lcom/avito/android/photo_cache/PhotoUpload;", "apply", "(Lkotlin/Q;)Lcom/avito/android/photo_cache/PhotoUpload;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class x<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f169436b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C30979j f169437c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PhotoUpload f169438d;

    public x(String str, C30979j c30979j, PhotoUpload photoUpload) {
        this.f169436b = str;
        this.f169437c = c30979j;
        this.f169438d = photoUpload;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        Uri uri = (Uri) q12.f406619b;
        String str = (String) q12.f406620c;
        boolean zF2 = kotlin.jvm.internal.L.f(str, this.f169436b);
        if (zF2) {
            C30979j.a(this.f169437c);
        }
        EnhanceState enhanceState = !zF2 ? EnhanceState.f216288d : EnhanceState.f216287c;
        PhotoUpload photoUpload = this.f169438d;
        return PhotoUpload.a(photoUpload, str, uri, null, photoUpload.f216304f, photoUpload.f216305g, enhanceState, 463);
    }
}
