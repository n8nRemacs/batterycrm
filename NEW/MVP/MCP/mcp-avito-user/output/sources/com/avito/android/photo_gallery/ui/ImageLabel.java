package com.avito.android.photo_gallery.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ImageLabel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/ui/ImageLabel;", "Landroid/widget/LinearLayout;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImageLabel extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f217667e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f217668b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f217669c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f217670d;

    @X41.j
    public ImageLabel(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void a(@Y61.l String str, @Y61.l String str2) {
        TextView textView = this.f217669c;
        textView.setText(str);
        TextView textView2 = this.f217670d;
        textView2.setText(str2);
        if (str != null) {
            D6.H(textView);
        } else {
            D6.w(textView);
        }
        if (str2 != null) {
            D6.H(textView2);
        } else {
            D6.w(textView2);
        }
        if (str == null && str2 == null) {
            D6.w(this);
        } else {
            D6.H(this);
        }
    }

    public ImageLabel(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.image_label, (ViewGroup) this, true);
        this.f217668b = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.label);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f217669c = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.postfix);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f217670d = (TextView) viewFindViewById2;
    }
}
