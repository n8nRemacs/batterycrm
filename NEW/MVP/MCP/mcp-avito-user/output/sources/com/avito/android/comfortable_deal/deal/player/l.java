package com.avito.android.comfortable_deal.deal.player;

import android.net.Uri;
import androidx.media3.common.PlaybackException;
import com.avito.android.comfortable_deal.deal.item.callrecord.PlaySpeed;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AudioPlayerInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/player/l;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface l {
    @Y61.k
    InterfaceC43160i<PlaybackException> a();

    void b(int i12);

    void c(@Y61.k Uri uri);

    void d(@Y61.k PlaySpeed playSpeed);

    void e();

    void pause();
}
