package com.avito.android.messenger.conversation.mvi.platform_actions;

import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PlatformActionsView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class t<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f194046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f194047c;

    public t(int i12, z zVar) {
        this.f194046b = zVar;
        this.f194047c = i12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return io.reactivex.rxjava3.core.z.c0(G0.f406611a).z(this.f194046b.f194070q ? 0L : this.f194047c, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b);
    }
}
