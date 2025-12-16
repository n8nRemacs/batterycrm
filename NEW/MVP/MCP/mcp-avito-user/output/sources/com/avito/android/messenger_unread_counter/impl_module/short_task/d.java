package com.avito.android.messenger_unread_counter.impl_module.short_task;

import kotlin.Metadata;
import pZ.C47037b;

/* compiled from: UpdateUnreadMessagesCounterShortTask.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LpZ/b;", "counters", "Lkotlin/G0;", "accept", "(LpZ/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f197739b;

    public d(a aVar) {
        this.f197739b = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f197739b.f197735e.b(((C47037b) obj).getChannelsCount());
    }
}
