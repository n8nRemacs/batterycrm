package com.yandex.mobile.ads.instream.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.gj0;
import com.yandex.mobile.ads.impl.vk1;
import j.N;
import j.P;
import j.X;

/* loaded from: classes8.dex */
public class InstreamMuteView extends ImageView implements gj0 {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final vk1 f392513a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f392514b;

    public InstreamMuteView(@N Context context) {
        this(context, null);
    }

    @N
    @SuppressLint({"CustomViewStyleable"})
    private static vk1 a(@N Context context, @P AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalInstreamMuteView);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MonetizationAdsInternalInstreamMuteView_monetization_internal_sound_on, R.drawable.monetization_ads_internal_ic_sound_on_default);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MonetizationAdsInternalInstreamMuteView_monetization_internal_sound_off, R.drawable.monetization_ads_internal_ic_sound_off_default);
        typedArrayObtainStyledAttributes.recycle();
        return new vk1(resourceId2, resourceId);
    }

    @Override // com.yandex.mobile.ads.impl.gj0
    public void setMuted(boolean z12) {
        this.f392514b = z12;
        this.f392513a.a(this, z12);
    }

    public InstreamMuteView(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InstreamMuteView(@N Context context, @P AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f392513a = a(context, attributeSet);
        a();
    }

    @X
    public InstreamMuteView(@N Context context, @P AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.f392513a = a(context, attributeSet);
        a();
    }

    private void a() {
        setMuted(this.f392514b);
    }
}
