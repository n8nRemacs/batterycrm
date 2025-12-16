package com.avito.android.advert_details_items.rich_geo_block;

import android.net.Uri;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.advert_details_items.rich_geo_block.c;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsRichGeoBlockView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class u extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f85486l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i12) {
        super(2);
        this.f85486l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f85486l | 1);
        B bE2 = a12.E(-355462968);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            o.c(new c("Квартира-студия, 25,6 м², 5/13 эт.", "Москва, 1-й Красногвардейский пр., 21с2", C42745f0.U(new c.a(C42745f0.U("#E42313", "#4FB04F", "#0072BA"), "Охотный ряд", "walkingRoute16", "до 5 мин."), new c.a(Collections.singletonList("#4FB04F"), "Театральная", "walkingRoute16", "до 5 мин."), new c.a(Collections.singletonList("#0072BA"), "Площадь революции", "walkingRoute16", "до 5 мин.")), new UniversalImage(new Image(Collections.singletonMap(new Size(52, 52), Uri.parse("resUri"))), null), false), q.f85482l, r.f85483l, s.f85484l, t.f85485l, bE2, 28080);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new u(iA2);
        }
        return G0.f406611a;
    }
}
