package com.avito.android.rating_ui.reviews_options;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.d;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RatingOptionsBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews_options/c;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends d {

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f250403G = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final TextView f250404E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final LinearLayout f250405F;

    public c(@k Context context) {
        super(context, 0, 2, null);
        setContentView(R.layout.reviews_options_bottom_sheet);
        d.M(this, null, false, true, 7);
        this.f250404E = (TextView) findViewById(R.id.reviews_options_title);
        this.f250405F = (LinearLayout) findViewById(R.id.reviews_options_container);
    }

    public final View V(String str, boolean z12) {
        View viewInflate = getLayoutInflater().inflate(R.layout.reviews_option, (ViewGroup) this.f250405F, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.reviews_option_title);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.reviews_option_selected);
        textView.setText(str);
        imageView.setVisibility(z12 ? 0 : 8);
        return viewInflate;
    }
}
