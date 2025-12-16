package com.avito.android.service_booking_settings.work_hours.item.content_description;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingContentDescriptionItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/item/content_description/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/service_booking_settings/work_hours/item/content_description/f;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f277964b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f277965c;

    /* compiled from: ServiceBookingContentDescriptionItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<TextView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f277966l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(0);
            this.f277966l = view;
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = this.f277966l.findViewById(R.id.content_description);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* compiled from: ServiceBookingContentDescriptionItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<TextView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f277967l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.f277967l = view;
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = this.f277967l.findViewById(R.id.content_title);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    public g(@k View view) {
        super(view);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f277964b = C42727D.b(lazyThreadSafetyMode, new b(view));
        this.f277965c = C42727D.b(lazyThreadSafetyMode, new a(view));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.service_booking_settings.work_hours.item.content_description.f
    public final void h(@k String str) {
        I5.a((TextView) this.f277965c.getValue(), str, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.service_booking_settings.work_hours.item.content_description.f
    public final void setTitle(@k String str) {
        I5.a((TextView) this.f277964b.getValue(), str, false);
    }
}
