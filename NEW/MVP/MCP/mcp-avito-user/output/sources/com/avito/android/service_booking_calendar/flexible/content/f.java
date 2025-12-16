package com.avito.android.service_booking_calendar.flexible.content;

import Y41.l;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.avito.android.service_booking_calendar.flexible.content.b;
import kotlin.G0;

/* compiled from: CalendarContentStateRenderer_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class f implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final e f275643a;

    public f(e eVar) {
        this.f275643a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.service_booking_calendar.flexible.content.b.a
    public final b a(View view, l<? super com.avito.android.service_booking_calendar.flexible.d, G0> lVar) {
        return new b(lVar, view, (FragmentManager) this.f275643a.f275642a.f393949a);
    }
}
