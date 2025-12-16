package com.avito.android.messenger.conversation.mvi.file_attachment;

import android.net.Uri;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: FileAttachmentInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/file_attachment/m;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f190703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f190704c;

    public c(j jVar, Uri uri) {
        this.f190703b = jVar;
        this.f190704c = uri;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f190703b.f190715a.v(this.f190704c).h(I.l((Throwable) obj));
    }
}
