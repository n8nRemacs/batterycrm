package com.avito.android.app.task;

import android.net.Uri;
import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.remote.model.ErrorType;
import java.io.IOException;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: LocalMessageSender.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/photo_cache/PhotoUpload;", "finishedUpload", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lcom/avito/android/photo_cache/PhotoUpload;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.p0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28584p0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28587q0 f91683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f91684c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f91685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f91686e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f91687f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.H f91688g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ PhotoUpload f91689h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f91690i;

    public C28584p0(C28587q0 c28587q0, String str, String str2, String str3, Integer num, io.reactivex.rxjava3.core.H h12, PhotoUpload photoUpload, String str4) {
        this.f91683b = c28587q0;
        this.f91684c = str;
        this.f91685d = str2;
        this.f91686e = str3;
        this.f91687f = num;
        this.f91688g = h12;
        this.f91689h = photoUpload;
        this.f91690i = str4;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        PhotoUpload photoUpload = (PhotoUpload) obj;
        String str = photoUpload.f216304f;
        C28587q0 c28587q0 = this.f91683b;
        if (str != null) {
            io.reactivex.rxjava3.core.I<ChatMessage> iSendImageMessage = c28587q0.f91691a.sendImageMessage(this.f91684c, this.f91685d, str, this.f91686e, this.f91687f);
            io.reactivex.rxjava3.core.H h12 = this.f91688g;
            return iSendImageMessage.z(h12).s(h12).k(new C28581o0(c28587q0, photoUpload));
        }
        ErrorType errorType = photoUpload.f216307i;
        if (errorType instanceof ErrorType.NonRestorableError) {
            return io.reactivex.rxjava3.core.I.l(new NoRetryException("Image upload failed", null, 2, null));
        }
        Uri uri = this.f91689h.f216305g;
        if (!(uri != null ? true ^ c28587q0.f91697g.c(uri) : true)) {
            return errorType instanceof ErrorType.RestorableError ? io.reactivex.rxjava3.core.I.l(new IOException("Image upload failed")) : io.reactivex.rxjava3.core.I.l(new IllegalStateException("Unexpected case"));
        }
        StringBuilder sb2 = new StringBuilder("Photo upload file does not exist: (");
        sb2.append(this.f91690i);
        sb2.append(", ");
        return io.reactivex.rxjava3.core.I.l(new NoRetryException(androidx.appcompat.app.r.u(sb2, photoUpload.f216300b, ')'), null, 2, null));
    }
}
