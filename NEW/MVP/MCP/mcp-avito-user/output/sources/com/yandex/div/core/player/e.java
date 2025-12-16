package com.yandex.div.core.player;

import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivPlayerView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/player/e;", "Landroid/widget/FrameLayout;", "Lcom/yandex/div/core/player/h;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class e extends FrameLayout implements h {
    public e(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.divImageStyle : i12);
    }

    @l
    public /* bridge */ /* synthetic */ a getAttachedPlayer() {
        return null;
    }
}
