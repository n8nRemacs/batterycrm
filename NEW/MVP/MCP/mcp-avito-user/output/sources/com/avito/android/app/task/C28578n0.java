package com.avito.android.app.task;

import com.avito.android.photo_cache.PhotoUpload;
import kotlin.Metadata;

/* compiled from: LocalMessageSender.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/photo_cache/PhotoUpload;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.n0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28578n0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f91663b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PhotoUpload f91664c;

    public C28578n0(String str, PhotoUpload photoUpload) {
        this.f91663b = str;
        this.f91664c = photoUpload;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        StringBuilder sb2 = new StringBuilder("Failed to find photo upload: (");
        sb2.append(this.f91663b);
        sb2.append(", ");
        return io.reactivex.rxjava3.core.I.l(new NoRetryException(androidx.appcompat.app.r.u(sb2, this.f91664c.f216300b, ')'), (Throwable) obj));
    }
}
