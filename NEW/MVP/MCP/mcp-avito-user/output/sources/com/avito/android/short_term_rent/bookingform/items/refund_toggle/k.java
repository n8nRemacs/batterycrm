package com.avito.android.short_term_rent.bookingform.items.refund_toggle;

import Y41.p;
import android.os.Parcelable;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.short_term_rent.bookingform.items.refund_toggle.RefundToggleItem;
import kotlin.InterfaceC43072x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f281612b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43072x f281613c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Parcelable f281614d;

    public /* synthetic */ k(InterfaceC43072x interfaceC43072x, Parcelable parcelable, int i12) {
        this.f281612b = i12;
        this.f281613c = interfaceC43072x;
        this.f281614d = parcelable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Parcelable parcelable = this.f281614d;
        InterfaceC43072x interfaceC43072x = this.f281613c;
        switch (this.f281612b) {
            case 0:
                int i12 = l.f281615e;
                RefundToggleItem.RefundToggleButton refundToggleButton = (RefundToggleItem.RefundToggleButton) parcelable;
                ((f) ((p) interfaceC43072x)).invoke(refundToggleButton.getF281583b(), Boolean.valueOf(refundToggleButton.getF281587f()));
                break;
            default:
                int i13 = l.f281615e;
                ((Y41.l) interfaceC43072x).invoke((DeepLink) parcelable);
                break;
        }
    }
}
