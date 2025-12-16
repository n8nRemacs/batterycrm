package com.avito.android.messenger.conversation.mvi.file_attachment;

import android.net.Uri;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: FileAttachmentInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/file_attachment/z;", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f190710b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f190711c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f190712d;

    public g(boolean z12, j jVar, Uri uri) {
        this.f190710b = z12;
        this.f190711c = jVar;
        this.f190712d = uri;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        return this.f190710b ? this.f190711c.f190715a.v(this.f190712d).h(I.l(th2)) : I.l(th2);
    }
}
