package com.avito.android.messenger.map.viewing;

import com.avito.android.messenger.map.viewing.view.d;
import com.avito.android.mvi.e;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PlatformMapFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/map/viewing/view/d$b;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/map/viewing/view/d$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlatformMapFragment f196852b;

    public n(PlatformMapFragment platformMapFragment) {
        this.f196852b = platformMapFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        d.b bVar = (d.b) obj;
        com.avito.android.messenger.map.viewing.view.f fVar = this.f196852b.f196794n0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.getClass();
        e.a.a(fVar, bVar);
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[" + Thread.currentThread().getName() + ']');
        sb2.append(" Rendered ");
        sb2.append(bVar);
        v22.g("PlatformMapFragment", sb2.toString());
    }
}
