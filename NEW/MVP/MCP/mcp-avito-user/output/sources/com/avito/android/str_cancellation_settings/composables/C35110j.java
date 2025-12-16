package com.avito.android.str_cancellation_settings.composables;

import com.adjust.sdk.network.ErrorCodes;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CancellationDiscountSwitcher.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.str_cancellation_settings.composables.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35110j extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f288225l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f288226m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35110j(String str, boolean z12) {
        super(2);
        this.f288225l = str;
        this.f288226m = z12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        long jC2;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65245p;
            if (this.f288226m) {
                a13.C(620983627);
                jC2 = com.akita.compose.theme.re23.b.f63984b.f63938l.c(a13);
                a13.h();
            } else {
                a13.C(621056074);
                jC2 = com.akita.compose.theme.re23.b.f63984b.f63903Z.c(a13);
                a13.h();
            }
            com.akita.compose.foundation.ui.p.b(this.f288225l, rVar, null, false, jC2, null, 0, 0, false, null, a13, 0, ErrorCodes.PROTOCOL_EXCEPTION);
        }
        return G0.f406611a;
    }
}
