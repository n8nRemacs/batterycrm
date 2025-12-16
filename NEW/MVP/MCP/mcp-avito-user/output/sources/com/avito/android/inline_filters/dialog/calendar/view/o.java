package com.avito.android.inline_filters.dialog.calendar.view;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FiltersCalendarPickerView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "enabled", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class o extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f171349l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(w wVar) {
        super(1);
        this.f171349l = wVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        Boolean bool2 = bool;
        w wVar = this.f171349l;
        wVar.f171367j.setClickable(bool2.booleanValue());
        wVar.f171367j.setEnabled(bool2.booleanValue());
        return G0.f406611a;
    }
}
