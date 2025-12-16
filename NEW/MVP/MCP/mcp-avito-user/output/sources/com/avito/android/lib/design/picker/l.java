package com.avito.android.lib.design.picker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WheelImageDivider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/avito/android/lib/design/picker/l;", "Landroid/widget/FrameLayout;", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "drawable", "", "c", "I", "getResource", "()I", "resource", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l extends FrameLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public final Drawable drawable;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int resource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, Drawable drawable, int i12, int i13, C42822w c42822w) {
        super(context);
        drawable = (i13 & 2) != 0 ? null : drawable;
        i12 = (i13 & 4) != 0 ? 0 : i12;
        this.drawable = drawable;
        this.resource = i12;
        LayoutInflater.from(context).inflate(R.layout.design_picker_wheel_image_divider, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id.wheelDividerImage);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i12);
        }
    }

    @Y61.l
    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final int getResource() {
        return this.resource;
    }
}
