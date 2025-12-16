package com.avito.android.publish.free_delivery.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.ui.v;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ErrorScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class a extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f235872l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Y41.a<G0> aVar) {
        super(2);
        this.f235872l = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.component.button.m.c(u0.i.c(a13, R.string.error_screen_continue_button), this.f235872l, com.avito.android.actions_sheet.a.o(com.akita.compose.theme.re23.b.f63983a, a13), C20588k2.d(v.f42878y1, 1.0f), null, null, null, false, false, null, a13, 3584, 1008);
        }
        return G0.f406611a;
    }
}
