package com.avito.android.str_calendar.seller.warning_dialog;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrCalendarWarningDialogFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f288078l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ StrCalendarWarningDialogFragment f288079m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, StrCalendarWarningDialogFragment strCalendarWarningDialogFragment) {
        super(0);
        this.f288078l = fVar;
        this.f288079m = strCalendarWarningDialogFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f288078l.Y2();
        this.f288079m.dismiss();
        return G0.f406611a;
    }
}
