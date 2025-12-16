package com.avito.android.service_booking_utils.save_schedule_modal;

import android.content.DialogInterface;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingSaveScheduleDialogBuilder.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f278389l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f278390m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, DialogInterface dialogInterface) {
        super(0);
        this.f278389l = fVar;
        this.f278390m = dialogInterface;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f278389l.f278396f.f278384c.invoke();
        this.f278390m.dismiss();
        return G0.f406611a;
    }
}
