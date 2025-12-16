package com.avito.android.user_stats.extended_user_stats;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/G6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class v implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f318261b;

    public v(r rVar) {
        this.f318261b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar = this.f318261b;
        rVar.f317316f.a(new y(rVar));
    }
}
