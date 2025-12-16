package com.avito.android.photo_gallery.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PageIndicatorView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/ui/g;", "Lcom/avito/android/photo_gallery/ui/h;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public int f217714a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f217715b;

    public g(@Y61.k ViewGroup viewGroup, @Y61.l Integer num) {
        this.f217714a = R.string.current_page_indicator;
        TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(num != null ? num.intValue() : R.layout.page_indicator_text, viewGroup, false);
        this.f217715b = textView;
        viewGroup.addView(textView);
    }

    @Override // com.avito.android.photo_gallery.ui.h
    public final void a(int i12, @Y61.l Integer num) {
        TextView textView = this.f217715b;
        textView.setText(textView.getResources().getString(this.f217714a, Integer.valueOf(i12 + 1), num));
        textView.requestLayout();
    }

    @Override // com.avito.android.photo_gallery.ui.h
    public final void b(boolean z12) {
        this.f217714a = z12 ? R.string.rds_current_page_indicator : R.string.current_page_indicator;
    }

    @Override // com.avito.android.photo_gallery.ui.h
    public final View getView() {
        return this.f217715b;
    }

    public /* synthetic */ g(ViewGroup viewGroup, Integer num, int i12, C42822w c42822w) {
        this(viewGroup, (i12 & 2) != 0 ? null : num);
    }
}
