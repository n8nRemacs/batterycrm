package com.avito.android.calendar_select.presentation.view.data;

import java.time.LocalDate;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CurrentDateProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/data/o;", "Lcom/avito/android/calendar_select/presentation/view/data/n;", "<init>", "()V", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o implements n {
    @Inject
    public o() {
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.n
    @Y61.k
    public final LocalDate a() {
        return LocalDate.now();
    }
}
