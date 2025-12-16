package com.avito.android.str_calendar.seller.calandar_parameters.bottom_picker;

import Gy0.InterfaceC13931a;
import Y41.l;
import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.util.g;
import com.avito.android.publish.screen.objects.view.actions.h;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BottomPickerView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/bottom_picker/c;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f286737a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13931a, G0> f286738b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public e f286739c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h f286740d = new h(this, 19);

    public c(@k l lVar, @k com.avito.konveyor.adapter.d dVar) {
        this.f286737a = dVar;
        this.f286738b = lVar;
    }

    public final void a(@k Context context, @k String str, @Y61.l Integer num) {
        e eVar = new e(context, str, this.f286737a, num);
        eVar.Q(new a(this));
        eVar.R(new b(this));
        this.f286739c = eVar;
        g.a(eVar);
    }
}
