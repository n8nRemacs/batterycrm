package com.avito.android.inline_filters.dialog.calendar;

import kotlin.Metadata;
import kotlin.Q;

/* compiled from: FiltersCalendarPickerViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class C<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f171166b;

    public C(p pVar) {
        this.f171166b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        Q q12 = (Q) obj;
        boolean z12 = ((Boolean) q12.f406619b).booleanValue() || ((Boolean) q12.f406620c).booleanValue();
        p pVar = this.f171166b;
        pVar.f171291b0.setValue(Boolean.valueOf(pVar.f171306q0 && z12));
    }
}
