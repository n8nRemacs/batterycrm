package com.avito.android.lib.design.bottom_sheet;

import android.view.View;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: ModalBottomSheetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/w;", "Landroid/view/View$OnLayoutChangeListener;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class w implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f178607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f178608c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f178609d;

    public w(View view, boolean z12, u uVar) {
        this.f178607b = view;
        this.f178608c = z12;
        this.f178609d = uVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        View view2 = this.f178607b;
        int i22 = C35835l0.i(view2.getContext()).heightPixels;
        int i23 = BeduinInputModel.MIN_TEXT_VERSION;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i22, BeduinInputModel.MIN_TEXT_VERSION);
        int width = view2.getWidth();
        if (this.f178608c) {
            i23 = 1073741824;
        }
        view2.measure(View.MeasureSpec.makeMeasureSpec(width, i23), iMakeMeasureSpec);
        this.f178609d.b(view2.getMeasuredHeight());
        view2.removeOnLayoutChangeListener(this);
    }
}
