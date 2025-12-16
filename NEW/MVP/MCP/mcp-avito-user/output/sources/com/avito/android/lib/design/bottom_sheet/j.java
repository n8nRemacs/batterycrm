package com.avito.android.lib.design.bottom_sheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetHeaders.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j {
    public static final void a(@Y61.k d dVar, boolean z12, boolean z13, @Y61.l Integer num) {
        View viewInflate = ((LayoutInflater) dVar.getContext().getSystemService("layout_inflater")).inflate(R.layout.design_bottom_sheet_overlay_header, (ViewGroup) null);
        dVar.f178524r = viewInflate;
        q qVar = dVar.f178530x;
        if (qVar != null) {
            qVar.B(viewInflate);
        }
        View viewFindViewById = viewInflate.findViewById(R.id.bottom_sheet_close_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.overlay_header_thumb);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView2 = (ImageView) viewFindViewById2;
        D6.G(imageView2, z13 && !dVar.getContext().getResources().getBoolean(R.bool.is_tablet));
        if (num != null) {
            imageView2.setImageTintList(ColorStateList.valueOf(num.intValue()));
        }
        D6.G(imageView, z12);
        imageView.setOnClickListener(new i(dVar, 1));
    }

    public static /* synthetic */ void b(d dVar, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            z12 = true;
        }
        a(dVar, z12, true, null);
    }

    public static void c(d dVar, CharSequence charSequence, boolean z12, int i12, int i13, int i14, int i15) {
        CharSequence charSequence2 = (i15 & 1) != 0 ? null : charSequence;
        boolean z13 = (i15 & 2) != 0 ? true : z12;
        int i16 = (i15 & 8) != 0 ? 0 : i12;
        int i17 = (i15 & 16) != 0 ? 0 : i13;
        int i18 = (i15 & 32) != 0 ? 0 : i14;
        boolean z14 = (i15 & 64) == 0;
        View viewInflate = ((LayoutInflater) dVar.getContext().getSystemService("layout_inflater")).inflate(R.layout.design_bottom_sheet_right_cross_header, (ViewGroup) null);
        d.M(dVar, null, false, true, 7);
        dVar.H(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.bottom_sheet_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.bottom_sheet_close_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById2;
        if (charSequence2 != null) {
            textView.setText(charSequence2);
            if (i16 > 0) {
                D6.c(textView, Integer.valueOf(i16), null, null, null, 14);
            }
            if (i17 > 0) {
                D6.c(textView, null, null, Integer.valueOf(i17), null, 11);
            }
            if (i18 > 0) {
                D6.c(textView, null, null, null, Integer.valueOf(i18), 7);
            }
            if (z14) {
                textView.setGravity(17);
            }
        } else {
            D6.w(textView);
        }
        D6.G(imageView, z13);
        imageView.setOnClickListener(new i(dVar, 0));
        Context context = dVar.getContext();
        TypedValue typedValue = new TypedValue();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(dVar.getContext().getTheme().resolveAttribute(R.attr.bottomSheetDialog, typedValue, true) ? typedValue.resourceId : R.style.Design_Widget_BottomSheetDialog, new int[]{R.attr.bottomSheet_rightCrossLayoutTopMargin});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        D6.c(viewInflate, null, Integer.valueOf(dimensionPixelSize), null, null, 13);
    }
}
