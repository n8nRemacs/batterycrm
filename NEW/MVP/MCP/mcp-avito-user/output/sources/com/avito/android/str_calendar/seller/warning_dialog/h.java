package com.avito.android.str_calendar.seller.warning_dialog;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrCalendarWarningDialogFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f288076l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ StrCalendarWarningDialogFragment f288077m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, StrCalendarWarningDialogFragment strCalendarWarningDialogFragment) {
        super(1);
        this.f288076l = fVar;
        this.f288077m = strCalendarWarningDialogFragment;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        this.f288076l.hd(str);
        this.f288077m.dismiss();
        return G0.f406611a;
    }
}
