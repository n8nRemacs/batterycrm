package com.avito.android.app.task;

import android.net.Uri;
import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: LocalMessageSender.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/api/entity/ChatMessage;", "it", "Lkotlin/G0;", "accept", "(Lru/avito/messenger/api/entity/ChatMessage;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.o0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28581o0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28587q0 f91666b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PhotoUpload f91667c;

    public C28581o0(C28587q0 c28587q0, PhotoUpload photoUpload) {
        this.f91666b = c28587q0;
        this.f91667c = photoUpload;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C28587q0 c28587q0 = this.f91666b;
        PhotoUpload photoUpload = this.f91667c;
        try {
            c28587q0.f91696f.b(String.valueOf(photoUpload.f216300b));
            Uri uri = photoUpload.f216305g;
            if (uri != null) {
                c28587q0.f91697g.b(uri);
            }
        } catch (Throwable unused) {
            V2.f318762a.e("Failed to delete data for upload: (" + photoUpload.f216300b + ", " + photoUpload.f216305g + ") ", null);
        }
    }
}
