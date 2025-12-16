package com.avito.android.important_addresses.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.important_addresses.presentation.ImportantAddressesState;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.jakewharton.rxbinding4.view.C37722i;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: ImportantAddressesItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses/presentation/g;", "Lcom/avito/android/important_addresses/presentation/f;", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f169628a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f169629b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f169630c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ShimmerFrameLayout f169631d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f169632e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageView f169633f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Badge f169634g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f169635h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f169636i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.button.Button f169637j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<ClickType> f169638k;

    /* renamed from: l, reason: collision with root package name */
    public final int f169639l;

    /* compiled from: ImportantAddressesItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "Lcom/avito/android/important_addresses/presentation/ClickType;", "apply", "(Lkotlin/G0;)Lcom/avito/android/important_addresses/presentation/ClickType;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f169640b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ClickType.f169582b;
        }
    }

    /* compiled from: ImportantAddressesItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "Lcom/avito/android/important_addresses/presentation/ClickType;", "apply", "(Lkotlin/G0;)Lcom/avito/android/important_addresses/presentation/ClickType;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f169641b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ClickType.f169583c;
        }
    }

    public g(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        this.f169628a = aVar;
        this.f169629b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.important_addresses_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f169630c = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.important_addresses_root_skeleton);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout");
        }
        this.f169631d = (ShimmerFrameLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f169632e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.hint);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById4;
        this.f169633f = imageView;
        View viewFindViewById5 = view.findViewById(R.id.badge);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f169634g = (Badge) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.subtitle);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f169635h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.addresses);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f169636i = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        com.avito.android.lib.design.button.Button button = (com.avito.android.lib.design.button.Button) viewFindViewById8;
        this.f169637j = button;
        this.f169638k = com.avito.android.arch.mvi.utils.h.d(C43175k.N(y.a(C37722i.a(button).d0(a.f169640b)), y.a(C37722i.a(imageView).d0(b.f169641b))), 1000L);
        this.f169639l = y6.b(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.View] */
    public final void a(@Y61.k ImportantAddressesState importantAddressesState) {
        boolean z12;
        boolean z13 = importantAddressesState instanceof ImportantAddressesState.Initial;
        ConstraintLayout constraintLayout = this.f169630c;
        com.avito.android.lib.design.button.Button button = this.f169637j;
        LinearLayout linearLayout = this.f169636i;
        TextView textView = this.f169635h;
        Badge badge = this.f169634g;
        ImageView imageView = this.f169633f;
        TextView textView2 = this.f169632e;
        boolean z14 = false;
        ShimmerFrameLayout shimmerFrameLayout = this.f169631d;
        Context context = this.f169629b;
        if (z13) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            D6.w(textView2);
            D6.w(imageView);
            D6.w(badge);
            D6.w(textView);
            D6.w(linearLayout);
            D6.w(button);
            D6.H(shimmerFrameLayout);
            shimmerFrameLayout.b();
            constraintLayout.requestLayout();
            View viewFindViewById = shimmerFrameLayout.findViewById(R.id.subtitle_skeleton);
            LinearLayout linearLayout2 = (LinearLayout) shimmerFrameLayout.findViewById(R.id.addresses_skeleton);
            View viewFindViewById2 = shimmerFrameLayout.findViewById(R.id.button_skeleton);
            int i12 = ((ImportantAddressesState.Initial) importantAddressesState).f169614d;
            viewFindViewById.setVisibility(i12 <= 0 ? 0 : 8);
            linearLayout2.removeAllViews();
            for (int i13 = 0; i13 < i12; i13++) {
                layoutInflaterFrom.inflate(R.layout.important_addresses_address_item_skeleton, (ViewGroup) linearLayout2, true);
            }
            if (i12 <= 0) {
                D6.c(viewFindViewById2, null, Integer.valueOf(y6.b(78)), null, null, 13);
                return;
            } else {
                linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                D6.c(viewFindViewById2, null, Integer.valueOf(linearLayout2.getMeasuredHeight() + y6.b(28)), null, null, 13);
                return;
            }
        }
        if (importantAddressesState instanceof ImportantAddressesState.ContentWithoutAddresses) {
            ImportantAddressesState.ContentWithoutAddresses contentWithoutAddresses = (ImportantAddressesState.ContentWithoutAddresses) importantAddressesState;
            I5.a(textView2, contentWithoutAddresses.f169604d, false);
            I5.a(textView, this.f169628a.c(context, contentWithoutAddresses.f169606f), false);
            if (contentWithoutAddresses.f169607g) {
                D6.H(badge);
                badge.setTitleText(context.getString(R.string.important_addresses_badge));
                D6.w(imageView);
            } else {
                D6.w(badge);
                imageView.setVisibility(contentWithoutAddresses.f169605e != null ? 0 : 8);
            }
            D6.c(this.f169637j, null, Integer.valueOf(y6.b(12)), null, null, 13);
            Button button2 = contentWithoutAddresses.f169608h;
            com.avito.android.lib.design.button.b.a(button, button2.f169579b, false);
            String str = button2.f169580c;
            if (str != null) {
                button.setAppearanceFromAttr(com.avito.android.lib.util.f.d(str));
            }
            shimmerFrameLayout.c();
            D6.w(shimmerFrameLayout);
            D6.w(linearLayout);
            return;
        }
        if (!(importantAddressesState instanceof ImportantAddressesState.ContentWithAddresses)) {
            if (importantAddressesState instanceof ImportantAddressesState.Error) {
                ImportantAddressesState.Error error = (ImportantAddressesState.Error) importantAddressesState;
                shimmerFrameLayout.c();
                constraintLayout.removeAllViews();
                D6.c(this.f169630c, null, 0, null, null, 13);
                D6.w(constraintLayout);
                constraintLayout.requestLayout();
                ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                Context baseContext = contextWrapper != null ? contextWrapper.getBaseContext() : null;
                Activity activity = baseContext instanceof Activity ? (Activity) baseContext : null;
                ?? FindViewById = activity != null ? activity.findViewById(R.id.tab_container) : 0;
                ConstraintLayout constraintLayout2 = FindViewById == 0 ? constraintLayout : FindViewById;
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextF = com.avito.android.printable_text.b.f(error.f169611d);
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.b(cVar, constraintLayout2, printableTextF, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
                return;
            }
            return;
        }
        ImportantAddressesState.ContentWithAddresses contentWithAddresses = (ImportantAddressesState.ContentWithAddresses) importantAddressesState;
        I5.a(textView2, contentWithAddresses.f169597d, false);
        imageView.setVisibility(contentWithAddresses.f169598e != null ? 0 : 8);
        LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(context);
        linearLayout.removeAllViews();
        Iterator it = contentWithAddresses.f169599f.iterator();
        while (it.hasNext()) {
            DestinationInfo destinationInfo = (DestinationInfo) it.next();
            View viewInflate = layoutInflaterFrom2.inflate(R.layout.important_addresses_address_item, linearLayout, z14);
            View viewFindViewById3 = viewInflate.findViewById(R.id.destinationIcon);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ImageView imageView2 = (ImageView) viewFindViewById3;
            View viewFindViewById4 = viewInflate.findViewById(R.id.destinationName);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView3 = (TextView) viewFindViewById4;
            View viewFindViewById5 = viewInflate.findViewById(R.id.travel_time_skeletons);
            if (viewFindViewById5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout");
            }
            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) viewFindViewById5;
            View viewFindViewById6 = viewInflate.findViewById(R.id.masstransit_travel_time);
            if (viewFindViewById6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView4 = (TextView) viewFindViewById6;
            Iterator it2 = it;
            View viewFindViewById7 = viewInflate.findViewById(R.id.pedestrian_travel_time);
            if (viewFindViewById7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView5 = (TextView) viewFindViewById7;
            TextView textView6 = textView;
            View viewFindViewById8 = viewInflate.findViewById(R.id.auto_travel_time);
            if (viewFindViewById8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView7 = (TextView) viewFindViewById8;
            LayoutInflater layoutInflater = layoutInflaterFrom2;
            Badge badge2 = badge;
            imageView2.setImageDrawable(C35835l0.m(layoutInflaterFrom2.getContext(), destinationInfo.f169588d, R.attr.black));
            I5.a(textView3, destinationInfo.f169589e, false);
            if (!contentWithAddresses.f169601h) {
                shimmerFrameLayout2.c();
                D6.w(shimmerFrameLayout2);
                int i14 = this.f169639l;
                String str2 = destinationInfo.f169590f;
                if (str2 == null) {
                    D6.w(textView4);
                    z12 = false;
                } else {
                    z12 = false;
                    I5.a(textView4, str2, false);
                    FV.a.f4720a.getClass();
                    FV.a.j(textView4, R.attr.textIconBus, i14);
                }
                String str3 = destinationInfo.f169591g;
                if (str3 == null) {
                    D6.w(textView5);
                } else {
                    I5.a(textView5, str3, z12);
                    FV.a.f4720a.getClass();
                    FV.a.j(textView5, R.attr.textIconFootPassenger, i14);
                }
                String str4 = destinationInfo.f169592h;
                if (str4 == null) {
                    D6.w(textView7);
                } else {
                    I5.a(textView7, str4, z12);
                    FV.a.f4720a.getClass();
                    FV.a.j(textView7, R.attr.textIconCar, i14);
                }
            }
            linearLayout.addView(viewInflate);
            it = it2;
            textView = textView6;
            layoutInflaterFrom2 = layoutInflater;
            badge = badge2;
            z14 = false;
        }
        TextView textView8 = textView;
        Badge badge3 = badge;
        D6.H(linearLayout);
        D6.c(this.f169637j, null, Integer.valueOf(y6.b(6)), null, null, 13);
        Button button3 = contentWithAddresses.f169600g;
        com.avito.android.lib.design.button.b.a(button, button3.f169579b, false);
        String str5 = button3.f169580c;
        if (str5 != null) {
            button.setAppearanceFromAttr(com.avito.android.lib.util.f.d(str5));
        }
        shimmerFrameLayout.c();
        D6.w(shimmerFrameLayout);
        D6.w(badge3);
        D6.w(textView8);
    }
}
