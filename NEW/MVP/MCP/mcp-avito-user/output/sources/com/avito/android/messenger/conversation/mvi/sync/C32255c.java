package com.avito.android.messenger.conversation.mvi.sync;

import java.util.List;
import kotlin.Metadata;

/* compiled from: IncompleteMessageBodyLoader.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "kotlin.jvm.PlatformType", "messages", "Lio/reactivex/rxjava3/core/w;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32255c<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32263g f194754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hu.akarnokd.rxjava3.schedulers.c f194755c;

    public C32255c(C32263g c32263g, hu.akarnokd.rxjava3.schedulers.c cVar) {
        this.f194754b = c32263g;
        this.f194755c = cVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f194754b.f194777b.b((List) obj).z(this.f194755c).E();
    }
}
