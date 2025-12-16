package com.avito.android.str_booking.ui.payment_details;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.j;
import com.avito.android.lib.util.g;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.O2;
import com.avito.konveyor.adapter.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingPaymentDetailsBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/ui/payment_details/b;", "", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f286119a = new b();

    /* compiled from: StrBookingPaymentDetailsBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "targetView", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<View, MotionEvent, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f286120l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RecyclerView recyclerView) {
            super(2);
            this.f286120l = recyclerView;
        }

        @Override // Y41.p
        public final Boolean invoke(View view, MotionEvent motionEvent) {
            View view2 = view;
            MotionEvent motionEvent2 = motionEvent;
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            int left = view2.getLeft();
            int right = view2.getRight();
            int iB2 = kotlin.math.b.b(motionEvent2.getX());
            boolean z12 = left <= iB2 && iB2 <= right;
            int top = view2.getTop() + iArr[1];
            int bottom = view2.getBottom() + iArr[1];
            int iB3 = kotlin.math.b.b(motionEvent2.getY());
            return Boolean.valueOf((z12 && (top <= iB3 && iB3 <= bottom) && this.f286120l.canScrollVertically(-1)) ? false : true);
        }
    }

    public static void a(@k Context context, @k d dVar, @l String str, @k List list, @l List list2) {
        com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
        j.c(dVar2, str, true, 0, 0, 0, 120);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar2, true);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        View viewInflate = layoutInflaterFrom.inflate(R.layout.str_booking_dialog_payment_content, (ViewGroup) null);
        dVar2.G(viewInflate, true);
        View viewFindViewById = viewInflate.findViewById(R.id.items);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.header);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.str_booking.ui.payment_details.PaymentRowDetailsLayout");
        }
        ViewGroup viewGroup = (PaymentRowDetailsLayout) viewFindViewById2;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(dVar);
        recyclerView.l(new com.avito.android.str_booking.ui.payment_details.a(context.getResources()), -1);
        dVar2.O(RecyclerView.class, new a(recyclerView));
        viewGroup.setVisibility(O2.a(list2) ? 0 : 8);
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                AttributedText attributedText = (AttributedText) it.next();
                TextView textView = (TextView) layoutInflaterFrom.inflate(R.layout.str_booking_table_column, viewGroup, false);
                com.avito.android.util.text.j.c(textView, attributedText, null);
                viewGroup.addView(textView);
            }
        }
        dVar.l(list, null);
        g.a(dVar2);
    }
}
