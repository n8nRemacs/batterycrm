package com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_inactive;

import Y61.k;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.avito.android.R;
import dt0.C39802a;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: InactiveTimeSlotItemViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/recycler/timeslot_inactive/f;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "Ldt0/a$a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b implements TV0.e, C39802a.InterfaceC11044a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f275452b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f275453c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f275454d;

    /* renamed from: e, reason: collision with root package name */
    public final int f275455e;

    /* renamed from: f, reason: collision with root package name */
    public int f275456f;

    /* renamed from: g, reason: collision with root package name */
    public long f275457g;

    /* compiled from: InactiveTimeSlotItemViewHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/BitmapDrawable;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<BitmapDrawable> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final BitmapDrawable invoke() {
            Bitmap bitmapB;
            f fVar = f.this;
            Drawable drawableA = C43852a.a(fVar.f275452b.getContext(), R.drawable.timeslot_inactive_pattern);
            if (drawableA == null || (bitmapB = androidx.core.graphics.drawable.d.b(0, 0, 7, drawableA)) == null) {
                return null;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(fVar.f275452b.getResources(), bitmapB);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        }
    }

    public f(@k View view) {
        super(view);
        this.f275452b = view;
        InterfaceC42726C interfaceC42726CC = C42727D.c(new a());
        this.f275453c = interfaceC42726CC;
        View viewFindViewById = view.findViewById(R.id.timeslot_card);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f275454d = viewFindViewById;
        this.f275455e = view.getResources().getDimensionPixelSize(R.dimen.day_schedule_timeslot_height);
        viewFindViewById.setBackground((BitmapDrawable) interfaceC42726CC.getValue());
    }

    @Override // dt0.C39802a.InterfaceC11044a
    /* renamed from: JB, reason: from getter */
    public final int getF275435d() {
        return this.f275456f;
    }

    @Override // dt0.C39802a.InterfaceC11044a
    /* renamed from: vQ, reason: from getter */
    public final long getF275436e() {
        return this.f275457g;
    }
}
