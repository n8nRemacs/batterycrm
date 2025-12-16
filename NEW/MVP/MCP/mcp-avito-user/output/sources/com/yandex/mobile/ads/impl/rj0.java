package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;

/* loaded from: classes8.dex */
public final class rj0 implements qj0 {
    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final View a(@j.N View view, @j.N String str) {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final CustomizableMediaView b(@j.N View view) {
        return (CustomizableMediaView) view.findViewById(R.id.media);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView c(@j.N View view) {
        return (TextView) view.findViewById(R.id.price);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView d(@j.N View view) {
        return (TextView) view.findViewById(R.id.call_to_action);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView e(@j.N View view) {
        return (TextView) view.findViewById(R.id.warning);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final ImageView f(@j.N View view) {
        return (ImageView) view.findViewById(R.id.favicon);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView g(@j.N View view) {
        return (TextView) view.findViewById(R.id.age);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final View h(@j.N View view) {
        return view.findViewById(R.id.rating);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView i(@j.N View view) {
        return (TextView) view.findViewById(R.id.title);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final ImageView j(@j.N View view) {
        return (ImageView) view.findViewById(R.id.f382503feedback);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView k(@j.N View view) {
        return (TextView) view.findViewById(R.id.sponsored);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView l(@j.N View view) {
        return (TextView) view.findViewById(R.id.domain);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final ImageView m(@j.N View view) {
        return (ImageView) view.findViewById(R.id.icon);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView n(@j.N View view) {
        return (TextView) view.findViewById(R.id.review_count);
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @j.P
    public final TextView a(@j.N View view) {
        return (TextView) view.findViewById(R.id.body);
    }
}
