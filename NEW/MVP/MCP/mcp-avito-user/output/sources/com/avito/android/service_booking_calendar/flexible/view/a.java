package com.avito.android.service_booking_calendar.flexible.view;

import L91.q;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceCalendarToolbar.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/view/a;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View$OnClickListener;", "onClickListener", "Lkotlin/G0;", "setOnBackButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "Lkotlin/Function1;", "Lcom/avito/android/deep_linking/links/DeepLink;", "deeplinkClickListener", "setOnDeepLinkClickListener", "(LY41/l;)V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends ConstraintLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f276104d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f276105b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public l<? super DeepLink, G0> f276106c;

    /* compiled from: ServiceCalendarToolbar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.service_booking_calendar.flexible.view.a$a, reason: collision with other inner class name */
    final class C8192a extends N implements l<DeepLink, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f276107l = 0;

        static {
            new C8192a();
        }

        public C8192a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(DeepLink deepLink) {
            return G0.f406611a;
        }
    }

    public a(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        new LinkedHashMap();
        int i14 = C8192a.f276107l;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_calendar_toolbar, (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(R.id.toolbar_back);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById;
        imageView.setOnClickListener(new q(11));
        this.f276105b = imageView;
        View viewFindViewById2 = viewInflate.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        View viewFindViewById3 = viewInflate.findViewById(R.id.menu_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    public final void setOnBackButtonClickListener(@k View.OnClickListener onClickListener) {
        this.f276105b.setOnClickListener(onClickListener);
    }

    public final void setOnDeepLinkClickListener(@k l<? super DeepLink, G0> deeplinkClickListener) {
        this.f276106c = deeplinkClickListener;
    }
}
