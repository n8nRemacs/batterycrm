package com.avito.android.messenger.map.sharing;

import com.avito.android.messenger.map.sharing.K;
import com.avito.android.mvi.e;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SharingMapFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$d;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/map/sharing/K$d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharingMapFragment f196747b;

    public n(SharingMapFragment sharingMapFragment) {
        this.f196747b = sharingMapFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        K.d dVar = (K.d) obj;
        L l12 = this.f196747b.f196706z0;
        if (l12 == null) {
            l12 = null;
        }
        l12.getClass();
        e.a.a(l12, dVar);
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[" + Thread.currentThread().getName() + ']');
        sb2.append(" Rendered ");
        sb2.append(dVar);
        v22.g("SharingMapFragment", sb2.toString());
    }
}
