package com.yandex.mobile.ads.impl;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import com.yandex.div.core.h0;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.C38584w0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class kq implements com.yandex.div.core.U {
    @Override // com.yandex.div.core.U
    @Y61.k
    public final View createView(@Y61.k C38584w0 c38584w0, @Y61.k C38029k c38029k) throws JSONException {
        String string = null;
        ProgressBar progressBar = new ProgressBar(c38029k.getContext(), null, R.attr.progressBarStyleHorizontal);
        JSONObject jSONObject = c38584w0.f376855h;
        if (jSONObject == null || !jSONObject.has("progress_color")) {
            string = "#000000";
        } else if (jSONObject != null) {
            string = jSONObject.getString("progress_color");
        }
        int iA2 = mk.a(string);
        Drawable drawable = progressBar.getContext().getDrawable(com.yandex.mobile.ads.R.drawable.monetization_ads_internal_circular_close_progress);
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(iA2, PorterDuff.Mode.SRC_IN));
        }
        progressBar.setProgressDrawable(drawable);
        return progressBar;
    }

    @Override // com.yandex.div.core.U
    public final boolean isCustomTypeSupported(@Y61.k String str) {
        return str.equals("close_progress_view");
    }

    @Override // com.yandex.div.core.U
    @Y61.k
    public /* bridge */ /* synthetic */ h0.d preload(@Y61.k C38584w0 c38584w0, @Y61.k h0.a aVar) {
        return super.preload(c38584w0, aVar);
    }

    @Override // com.yandex.div.core.U
    public final void release(@Y61.k View view, @Y61.k C38584w0 c38584w0) {
    }

    @Override // com.yandex.div.core.U
    public final void bindView(@Y61.k View view, @Y61.k C38584w0 c38584w0, @Y61.k C38029k c38029k) {
    }
}
