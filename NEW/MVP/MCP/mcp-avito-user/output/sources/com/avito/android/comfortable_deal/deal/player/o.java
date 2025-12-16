package com.avito.android.comfortable_deal.deal.player;

import androidx.media3.common.H;
import androidx.media3.common.PlaybackException;
import kotlin.Metadata;
import kotlinx.coroutines.channels.I0;

/* compiled from: AudioPlayerInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/player/o;", "Landroidx/media3/common/H$g;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o implements H.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f121799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I0<PlaybackException> f121800c;

    /* JADX WARN: Multi-variable type inference failed */
    public o(m mVar, I0<? super PlaybackException> i02) {
        this.f121799b = mVar;
        this.f121800c = i02;
    }

    @Override // androidx.media3.common.H.g
    public final void g(@Y61.k PlaybackException playbackException) {
        this.f121799b.pause();
        this.f121800c.w(playbackException);
    }
}
