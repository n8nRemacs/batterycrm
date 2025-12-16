package com.avito.android.ai_assistant.adapter.answer_loading;

import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/E6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f88725b;

    public g(h hVar) {
        this.f88725b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.f88725b;
        D6.H(hVar.f88726b);
        hVar.f88726b.d();
    }
}
