package com.avito.android.service_booking_calendar.flexible.header.toolbar;

import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.service_booking_calendar.domain.ToolbarAction;
import com.avito.android.util.C35835l0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: CalendarHeaderActionItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/toolbar/e;", "Lcom/avito/android/service_booking_calendar/flexible/header/toolbar/c;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f276083b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f276084c;

    @Inject
    public e() {
        e2 e2VarB = f2.b(0, 1, BufferOverflow.f410778c, 1);
        this.f276083b = e2VarB;
        this.f276084c = e2VarB;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        ToolbarAction toolbarAction = (ToolbarAction) aVar;
        d dVar = new d(this, toolbarAction);
        ToolbarAction.ToolbarActionIcon toolbarActionIcon = toolbarAction.f275533c;
        int i13 = toolbarActionIcon.f275537b;
        Context context = hVar.f276090b;
        Drawable drawableH = C35835l0.h(i13, context);
        if (drawableH != null) {
            drawableH.setTint(C35835l0.d(R.attr.black, context));
        }
        ImageView imageView = hVar.f276091c;
        imageView.setImageDrawable(drawableH);
        imageView.setTag(toolbarActionIcon);
        imageView.setOnClickListener(new g(0, (Object) dVar, (Object) toolbarAction));
    }

    @Override // com.avito.android.service_booking_calendar.flexible.header.toolbar.c
    @k
    /* renamed from: o1, reason: from getter */
    public final e2 getF276084c() {
        return this.f276084c;
    }
}
