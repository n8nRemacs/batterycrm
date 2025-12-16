package com.avito.android.credits.calculator;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/E6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.a f128692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f128693c;

    public n(l0.a aVar, q qVar) {
        this.f128692b = aVar;
        this.f128693c = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f128692b.f406838b) {
            return;
        }
        this.f128693c.f40();
    }
}
