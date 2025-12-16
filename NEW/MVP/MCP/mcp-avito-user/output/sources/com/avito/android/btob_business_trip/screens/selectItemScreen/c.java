package com.avito.android.btob_business_trip.screens.selectItemScreen;

import Bk.c;
import android.net.Uri;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.btob_business_trip.models.SelectItemInfo;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.LinkAttribute;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43207v;

/* compiled from: B2bBusinessSelectItemsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class c extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f108163l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i12) {
        super(2);
        this.f108163l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f108163l | 1);
        androidx.compose.runtime.B bE2 = a12.E(-1692823733);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            AttributedText attributedText = new AttributedText(" text text text {{link}}", Collections.singletonList(new LinkAttribute("link", "link text", "", null, 8, null)), 0, 4, null);
            Image image = new Image(Collections.singletonMap(new Size(44, 44), Uri.parse("")));
            C28901a.c(new c.b.C0071b("Где хотите принимать командированных?", "Все гости смогут бронировать это жильё, не ожидая вашего подтверждения.", "Подключить командировки", C42745f0.U(new SelectItemInfo("1-к. квартира, 54м², 1 кровать", 0L, new UniversalImage(image, image), "Лесная ул., 7"), new SelectItemInfo("1-к. квартира, 54м², 1 кровать", 1L, new UniversalImage(image, image), "Лесная ул., 7"), new SelectItemInfo("1-к. квартира, 54м², 1 кровать", 2L, new UniversalImage(image, image), "Лесная ул., 7")), attributedText, C42745f0.U(0L, 1L, 2L), false), new C43207v(new Bk.b[0]), C28902b.f108162l, 2, bE2, 3528);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(iA2);
        }
        return G0.f406611a;
    }
}
