package com.avito.android.btob_business_trip.screens.infoScreen;

import android.net.Uri;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.btob_business_trip.models.AdvantageInfo;
import com.avito.android.btob_business_trip.models.ConditionItemInfo;
import com.avito.android.btob_business_trip.models.ConditionsInfo;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import zk.C50579c;

/* compiled from: B2bBusinessTripInfoScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class h extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f107969l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i12) {
        super(2);
        this.f107969l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f107969l | 1);
        B bE2 = a12.E(-1679007768);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            Image image = new Image(Collections.singletonMap(new Size(44, 44), Uri.parse("")));
            i.b(new C50579c.b.C12973c("Подключите командировки", "Дальше", C42745f0.U(new AdvantageInfo(new UniversalImage(image, image), "Гости от партнёров. Компании ищут жильё  сотрудникам круглый год", "Больше броней — даже в не сезон"), new AdvantageInfo(new UniversalImage(image, image), "Гости от партнёров. Компании ищут жильё  сотрудникам круглый год", "Больше броней — даже в несезон")), new ConditionsInfo(Collections.singletonList(new ConditionItemInfo("flash", "Нужна мгновенная бронь, чтобы гости бронировали, не ожидая подтверждения. Вы сами выбираете жильё для командировок", "title2")), "title")), g.f107968l, null, bE2, 440);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(iA2);
        }
        return G0.f406611a;
    }
}
