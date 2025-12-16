package com.avito.android.publish.drafts;

import android.net.Uri;
import com.avito.android.photo_cache.PhotoUpload;
import java.io.File;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DraftPhotosWiper.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_cache/PhotoUpload;", "photosList", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.drafts.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33837c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33840f f235337b;

    public C33837c(C33840f c33840f) {
        this.f235337b = c33840f;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String path;
        C33840f c33840f = this.f235337b;
        c33840f.getClass();
        for (PhotoUpload photoUpload : (List) obj) {
            Uri uri = photoUpload.f216305g;
            if (uri != null) {
                com.avito.android.photo_storage.i iVar = c33840f.f235370b;
                if (iVar.d(uri) && (path = uri.getPath()) != null) {
                    iVar.c(new File(path));
                }
            }
            c33840f.f235369a.b(String.valueOf(photoUpload.f216300b));
        }
    }
}
