package com.avito.android.messenger.service;

import com.avito.android.messenger.analytics.C31652h;
import kotlin.Metadata;

/* compiled from: OpenErrorTracker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "messageCount", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f197263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f197264c;

    public m(n nVar, String str) {
        this.f197263b = nVar;
        this.f197264c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f197263b.f197297c.c(new C31652h(((Number) obj).longValue() > 0, this.f197264c));
    }
}
