package com.avito.android.early_access.adapter.banner;

import Y41.p;
import android.net.Uri;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessBannerPreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f145093l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i12) {
        super(2);
        this.f145093l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f145093l | 1);
        B bE2 = a12.E(94833);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            EarlyAccessBannerItem earlyAccessBannerItem = new EarlyAccessBannerItem(null, "Это объявление от собственника, такое жильё уходит быстро", new Image(Collections.singletonMap(new Size(192, 192), Uri.parse("https://avito.st/static/ims/c15b7d76-7f6b-4ac7-a203-2f7c3d1316af_prodazha_ot_sobstvennika_re_day_common_192x192.png"))), null, 9, null);
            v.a aVar = v.f42878y1;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            h.a aVar2 = h.f42849c;
            a.b(earlyAccessBannerItem, R1.i(androidx.compose.foundation.A.b(aVar, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(bE2), Y0.f39346a), 16), bE2, 8);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(iA2);
        }
        return G0.f406611a;
    }
}
