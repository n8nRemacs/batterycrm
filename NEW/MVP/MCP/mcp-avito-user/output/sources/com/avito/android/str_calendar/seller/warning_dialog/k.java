package com.avito.android.str_calendar.seller.warning_dialog;

import androidx.compose.runtime.A;
import com.avito.android.str_calendar.seller.warning_dialog.models.WarningDialogData;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrCalendarWarningDialogFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class k extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WarningDialogData f288081l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f288082m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ StrCalendarWarningDialogFragment f288083n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(WarningDialogData warningDialogData, f fVar, StrCalendarWarningDialogFragment strCalendarWarningDialogFragment) {
        super(2);
        this.f288081l = warningDialogData;
        this.f288082m = fVar;
        this.f288083n = strCalendarWarningDialogFragment;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            f fVar = this.f288082m;
            StrCalendarWarningDialogFragment strCalendarWarningDialogFragment = this.f288083n;
            q.a(this.f288081l, new h(fVar, strCalendarWarningDialogFragment), new i(fVar, strCalendarWarningDialogFragment), new j(fVar), a13, 8);
        }
        return G0.f406611a;
    }
}
