package com.avito.android.comfortable_deal.deal.player;

import androidx.media3.exoplayer.InterfaceC23144m;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AudioPlayerInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/media3/exoplayer/m;", "Lkotlin/G0;", "invoke", "(Landroidx/media3/exoplayer/m;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class n extends N implements Y41.l<InterfaceC23144m, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f121798l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(float f12) {
        super(1);
        this.f121798l = f12;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC23144m interfaceC23144m) {
        interfaceC23144m.setVolume(this.f121798l);
        return G0.f406611a;
    }
}
