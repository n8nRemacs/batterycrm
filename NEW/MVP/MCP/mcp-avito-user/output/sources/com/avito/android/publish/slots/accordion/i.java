package com.avito.android.publish.slots.accordion;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AccordionSlotView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/accordion/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/accordion/h;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f242805c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f242806b;

    public i(@Y61.k View view) {
        super(view);
        this.f242806b = (TextView) view;
    }

    @Override // com.avito.android.publish.slots.accordion.h
    public final void M9(@Y61.k Y41.a<G0> aVar) {
        this.f242806b.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(23, aVar));
    }

    @Override // com.avito.android.publish.slots.accordion.h
    public final void s2(boolean z12) {
        int i12 = z12 ? R.attr.ic_arrowUpBoldH3 : R.attr.ic_arrowDownBoldH3;
        TextView textView = this.f242806b;
        Drawable drawableH = C35835l0.h(i12, textView.getContext());
        ColorStateList colorStateList = androidx.core.content.d.getColorStateList(textView.getContext(), R.color.common_black);
        if (drawableH != null) {
            drawableH.setTintList(colorStateList);
        }
        I5.d(textView, null, new InsetDrawable(drawableH, y6.b(6), y6.b(-2), 0, 0), 11);
    }

    @Override // com.avito.android.publish.slots.accordion.h
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f242806b, str, false);
    }
}
