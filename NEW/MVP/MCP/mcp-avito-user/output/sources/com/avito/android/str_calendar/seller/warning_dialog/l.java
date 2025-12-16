package com.avito.android.str_calendar.seller.warning_dialog;

import androidx.compose.runtime.A;
import com.avito.android.str_calendar.seller.warning_dialog.models.WarningDialogData;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrCalendarWarningDialogFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WarningDialogData f288084l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f288085m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ StrCalendarWarningDialogFragment f288086n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(WarningDialogData warningDialogData, f fVar, StrCalendarWarningDialogFragment strCalendarWarningDialogFragment) {
        super(2);
        this.f288084l = warningDialogData;
        this.f288085m = fVar;
        this.f288086n = strCalendarWarningDialogFragment;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            StrCalendarWarningDialogFragment strCalendarWarningDialogFragment = this.f288086n;
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-1402161632, new k(this.f288084l, this.f288085m, strCalendarWarningDialogFragment), a13), a13, 48, 1);
        }
        return G0.f406611a;
    }
}
