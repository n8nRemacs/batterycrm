package com.avito.android.advert_core.map;

import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/E6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f83765b;

    public h(i iVar) {
        this.f83765b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f83765b;
        D6.w(iVar.f83772h);
        iVar.f83772h.c();
        D6.o(iVar.f83773i, 500L);
    }
}
