package com.avito.android.service_booking.error_titled_view;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.util.p6;
import com.avito.android.util.q6;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingTitledErrorView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class d extends N implements Y41.a<LinearLayout> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f274286l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view) {
        super(0);
        this.f274286l = view;
    }

    @Override // Y41.a
    public final LinearLayout invoke() {
        Object next;
        View viewFindViewById = this.f274286l.findViewById(R.id.sb_titled_error);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        Iterator<View> it = new q6(linearLayout).iterator();
        while (true) {
            p6 p6Var = (p6) it;
            if (!p6Var.hasNext()) {
                next = null;
                break;
            }
            next = p6Var.next();
            if (((View) next).getId() == R.id.error_icon) {
                break;
            }
        }
        ImageView imageView = (ImageView) next;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.img_unknown_error_216_160);
        }
        return linearLayout;
    }
}
