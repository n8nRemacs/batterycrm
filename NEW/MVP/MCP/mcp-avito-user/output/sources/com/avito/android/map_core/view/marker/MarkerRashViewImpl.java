package com.avito.android.map_core.view.marker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.R;
import com.avito.android.avito_map.marker.MarkerItem;
import com.avito.android.remote.model.search.map.Highlight;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: MarkerRashView.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/map_core/view/marker/MarkerRashViewImpl;", "Landroid/view/View;", "Lcom/avito/android/map_core/view/marker/j;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/avito/android/avito_map/marker/MarkerItem$Rash;", "item", "Lkotlin/G0;", "setStyleByItemParams", "(Lcom/avito/android/avito_map/marker/MarkerItem$Rash;)V", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MarkerRashViewImpl extends View implements j {
    public MarkerRashViewImpl(@Y61.k Context context, @Y61.k AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setStyleByItemParams(@Y61.k MarkerItem.Rash item) {
        if (item.isViewed() && item.getHighlight() == Highlight.Violet) {
            D6.D(this, R.drawable.search_map_rash_background_violet_viewed);
            return;
        }
        if (item.isViewed() && item.getHighlight() == Highlight.Green) {
            D6.D(this, R.drawable.search_map_rash_background_green_viewed);
            return;
        }
        if (item.getSelected()) {
            D6.D(this, R.drawable.search_map_rash_background_selected);
            return;
        }
        if (item.isViewed()) {
            D6.D(this, R.drawable.search_map_rash_background_viewed);
            return;
        }
        if (item.getHighlight() == Highlight.Violet) {
            D6.D(this, R.drawable.search_map_rash_background_violet_default);
        } else if (item.getHighlight() == Highlight.Green) {
            D6.D(this, R.drawable.search_map_rash_background_green_default);
        } else {
            D6.D(this, R.drawable.search_map_rash_background_default);
        }
    }
}
