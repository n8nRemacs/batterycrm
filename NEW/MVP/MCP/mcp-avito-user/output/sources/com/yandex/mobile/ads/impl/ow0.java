package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* loaded from: classes8.dex */
public final class ow0<V extends ViewGroup> implements up<V> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final NativeAdAssets f388653a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final pw0 f388654b = new pw0();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final oj0 f388655c = new oj0();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final zj0 f388656d = new zj0();

    public ow0(@j.N NativeAdAssets nativeAdAssets) {
        this.f388653a = nativeAdAssets;
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N V v12) {
        String strValueOf;
        this.f388656d.getClass();
        ViewGroup viewGroup = (ViewGroup) v12.findViewById(R.id.rating_container);
        Float rating = this.f388653a.getRating();
        if (rating == null) {
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            }
            return;
        }
        this.f388655c.getClass();
        TextView textView = (TextView) v12.findViewById(R.id.rating_text);
        if (textView != null) {
            pw0 pw0Var = this.f388654b;
            float fFloatValue = rating.floatValue();
            pw0Var.getClass();
            try {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator(',');
                strValueOf = new DecimalFormat("0.0", decimalFormatSymbols).format(fFloatValue);
            } catch (RuntimeException unused) {
                strValueOf = String.valueOf(fFloatValue);
            }
            textView.setText(strValueOf);
        }
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
    }
}
