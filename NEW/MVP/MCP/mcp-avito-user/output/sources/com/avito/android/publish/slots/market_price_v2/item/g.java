package com.avito.android.publish.slots.market_price_v2.item;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceBadge;
import java.text.NumberFormat;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: MarketPriceV2Formatter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/market_price_v2/item/g;", "Lcom/avito/android/publish/slots/market_price_v2/item/f;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements f {
    @Inject
    public g() {
    }

    @Override // com.avito.android.publish.slots.market_price_v2.item.f
    @Y61.k
    public final String a(@Y61.l Long l12, @Y61.l Long l13, @Y61.k String str) {
        if (l12 == null) {
            return str;
        }
        long jAbs = Math.abs(l13.longValue() - l12.longValue());
        String str2 = NumberFormat.getInstance(new Locale("ru", "RU")).format(l13.longValue());
        return C43066x.a0(C43066x.a0(str, "${marketPrice}", str2, false), "${diffWithMarketPrice}", NumberFormat.getInstance(new Locale("ru", "RU")).format(jAbs), false);
    }

    @Override // com.avito.android.publish.slots.market_price_v2.item.f
    @Y61.k
    @SuppressLint({"HardcodeStringDetector"})
    public final CharSequence b(@Y61.k Context context, @Y61.k String str, @Y61.l MarketPriceBadge marketPriceBadge) {
        if (marketPriceBadge == null) {
            return str;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.market_price_badge, (ViewGroup) null);
        Q81.c.b((TextView) linearLayout.findViewById(R.id.badge), marketPriceBadge);
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        linearLayout.layout(0, 0, linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        linearLayout.draw(new Canvas(bitmapCreateBitmap));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "\u2060").append((CharSequence) " ");
        spannableStringBuilder.setSpan(new ImageSpan(context, bitmapCreateBitmap), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 18);
        return spannableStringBuilder;
    }
}
