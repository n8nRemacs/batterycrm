package com.avito.android.gig_motivation_payment.ui.compose;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MotivationPaymentErrorContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.gig_motivation_payment.ui.compose.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30735f extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f160143l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30735f(int i12) {
        super(2);
        this.f160143l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f160143l | 1);
        androidx.compose.runtime.B bE2 = a12.E(1311808403);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            C30731b.f160131a.getClass();
            com.akita.compose.theme.re23.c.a(false, C30731b.f160132b, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C30735f(iA2);
        }
        return G0.f406611a;
    }
}
