package com.avito.android.messenger.conversation.mvi.send;

import androidx.work.impl.CallableC23587q;
import com.avito.android.photo_cache.PhotoUpload;
import kotlin.Metadata;

/* compiled from: PhotoPickerResultHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/photo_cache/PhotoUpload;", "photoUpload", "Lio/reactivex/rxjava3/core/O;", "Larrow/core/Y0;", "Lcom/avito/android/messenger/conversation/mvi/send/j$a;", "apply", "(Lcom/avito/android/photo_cache/PhotoUpload;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.send.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32226n<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32228o f194531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f194532c;

    public C32226n(C32228o c32228o, String str) {
        this.f194531b = c32228o;
        this.f194532c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C32228o c32228o = this.f194531b;
        c32228o.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.G(new CallableC23587q((PhotoUpload) obj, c32228o, this.f194532c, 13)).z(c32228o.f194537d.a());
    }
}
