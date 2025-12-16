package com.avito.android.vas_planning_calendar.view.konveyor.items.month;

import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;

/* compiled from: MonthItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_planning_calendar/view/konveyor/items/month/d;", "LTV0/d;", "Lcom/avito/android/vas_planning_calendar/view/konveyor/items/month/f;", "Lcom/avito/android/vas_planning_calendar/view/konveyor/items/month/a;", "<init>", "()V", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements TV0.d<f, a> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        String string = ((a) aVar).f322726c;
        if (string.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char cCharAt = string.charAt(0);
            sb2.append((Object) (Character.isLowerCase(cCharAt) ? C43044a.f(cCharAt, Locale.getDefault()) : String.valueOf(cCharAt)));
            sb2.append(string.substring(1));
            string = sb2.toString();
        }
        fVar.setText(string);
    }
}
