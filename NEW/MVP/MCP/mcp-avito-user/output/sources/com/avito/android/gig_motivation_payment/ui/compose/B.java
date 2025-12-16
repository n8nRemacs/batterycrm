package com.avito.android.gig_motivation_payment.ui.compose;

import android.net.Uri;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MotivationPaymentScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class B extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f160123l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(int i12) {
        super(2);
        this.f160123l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f160123l | 1);
        androidx.compose.runtime.B bE2 = a12.E(-689339856);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-981809995, new A(new Image(Collections.singletonMap(new Size(88, 88), Uri.EMPTY))), bE2), bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new B(iA2);
        }
        return G0.f406611a;
    }
}
