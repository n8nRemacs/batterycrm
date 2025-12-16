package com.avito.android.vas_performance.screens.applied_services.ui.compose;

import Y41.p;
import android.net.Uri;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.akita.compose.component.chips.C27332a;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesState;
import java.util.Collections;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: AppliedServicesScreenPreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class j extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f320373l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i12) {
        super(2);
        this.f320373l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f320373l | 1);
        B bE2 = a12.E(1492835729);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            Iterator<T> it = new AppliedServicesState(null, false, Collections.singletonList(new AppliedServicesState.Section("Section", new AppliedServicesState.Section.a("Banner", null, new wZ.k(AvitoMapMarkerKt.AMENITY_TYPE_BLACK, null, null)), "Description", new AppliedServicesState.a("Action", new NoMatchLink(), null), Collections.singletonList(new AppliedServicesState.Section.Item("Item", "Description", new Image(Collections.singletonMap(new Size(20, 20), Uri.parse("https://staging-www.k.avito.ru/s/common/components/monetization/icons/png/icon-vas-vip-20.png"))), null, new AppliedServicesState.a("Action", new NoMatchLink(), new wZ.l(new Image(Collections.singletonMap(new Size(20, 20), Uri.parse("https://staging-www.k.avito.ru/s/common/components/monetization/icons/png/icon-vas-vip-20.png"))), null)), null, new AppliedServicesState.a("Item Action", new NoMatchLink(), null), C42745f0.U(new C27332a("Chip #1", true, false, null, null, 28, null), new C27332a("Chip #2", false, false, null, null, 28, null)), 40, null)))), null, null).f320283d.iterator();
            while (it.hasNext()) {
                l.a((AppliedServicesState.Section) it.next(), i.f320372l, bE2, 48);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(iA2);
        }
        return G0.f406611a;
    }
}
