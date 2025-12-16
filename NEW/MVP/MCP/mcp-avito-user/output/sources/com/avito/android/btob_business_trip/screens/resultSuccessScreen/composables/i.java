package com.avito.android.btob_business_trip.screens.resultSuccessScreen.composables;

import Y41.p;
import android.net.Uri;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuccessScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class i extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f108083l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i12) {
        super(2);
        this.f108083l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f108083l | 1);
        B bE2 = a12.E(1554059320);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            Image image = new Image(Collections.singletonMap(new Size(44, 44), Uri.parse("")));
            j.a("Командировки подключены", "Теперь жилье могут снять гости от партнёров. Такие объявления отмечены иконкой с чемоданчиком.", new UniversalImage(image, image), "Посмотреть", 0, 0, h.f108082l, v.f42878y1, bE2, 14380598);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(iA2);
        }
        return G0.f406611a;
    }
}
