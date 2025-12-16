package com.avito.android.messenger.service;

import com.avito.android.messenger.analytics.C31651g;
import kotlin.Metadata;

/* compiled from: OpenErrorTracker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "messageCount", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f197260b;

    public k(n nVar) {
        this.f197260b = nVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f197260b.f197297c.c(new C31651g(((Number) obj).longValue() > 0));
    }
}
