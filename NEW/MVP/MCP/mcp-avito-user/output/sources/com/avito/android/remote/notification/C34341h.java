package com.avito.android.remote.notification;

import kotlin.Metadata;

/* compiled from: NotificationBitmapInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.remote.notification.h, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
final class C34341h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.facebook.datasource.c f254052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C34342i f254053c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.audio.o f254054d;

    public C34341h(com.facebook.datasource.c cVar, C34342i c34342i, androidx.media3.exoplayer.audio.o oVar) {
        this.f254052b = cVar;
        this.f254053c = c34342i;
        this.f254054d = oVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f254052b.d(this.f254053c, this.f254054d);
    }
}
