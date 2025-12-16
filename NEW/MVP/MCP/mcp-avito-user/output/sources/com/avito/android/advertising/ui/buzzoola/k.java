package com.avito.android.advertising.ui.buzzoola;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.video_snippets.g;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import kotlin.Metadata;

/* compiled from: CommercialVideoViewHolder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advertising/ui/buzzoola/k;", "Lcom/avito/android/advertising/ui/e;", "Lcom/avito/android/advertising/ui/buzzoola/j;", "", "cornerRadiusRes", "Lkotlin/G0;", "applyVideoStyle", "(I)V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface k extends com.avito.android.advertising.ui.e, j {

    /* compiled from: CommercialVideoViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void E8(@Y61.l String str);

    @Y61.k
    StyledPlayerView PJ();

    void S3(@Y61.l View.OnClickListener onClickListener);

    @Y61.k
    TextView V6();

    void cT(@Y61.k g.c cVar);

    void j1(@Y61.l Uri uri);

    void pw(@Y61.l com.avito.android.advertising.adapter.items.buzzoola.video.m mVar);

    @Y61.l
    Button zZ();
}
