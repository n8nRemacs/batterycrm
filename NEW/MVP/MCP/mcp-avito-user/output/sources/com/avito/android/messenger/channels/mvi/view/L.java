package com.avito.android.messenger.channels.mvi.view;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelsListView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class L implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f188698b;

    public L(H h12) {
        this.f188698b = h12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H h12 = this.f188698b;
        if (h12.f188663b.isAttachedToWindow()) {
            com.avito.android.lib.design.toast_bar.b bVar = h12.f188678q;
            if (bVar != null) {
                bVar.a();
            }
            h12.f188678q = null;
            com.avito.android.lib.design.toast_bar.k kVar = h12.f188679r;
            if (kVar != null) {
                kVar.f();
            }
            h12.f188679r = null;
        }
    }
}
