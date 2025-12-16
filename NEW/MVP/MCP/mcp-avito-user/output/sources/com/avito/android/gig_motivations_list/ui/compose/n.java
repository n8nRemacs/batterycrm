package com.avito.android.gig_motivations_list.ui.compose;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import wH.C49505a;
import wH.C49506b;

/* compiled from: MotivationsListEmptyContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class n extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f160325l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i12) {
        super(2);
        this.f160325l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f160325l | 1);
        androidx.compose.runtime.B bE2 = a12.E(-1387552220);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            r.a(new C49505a(new C49506b("Title", new NoMatchLink()), new UniversalImage(new Image(P0.c()), new Image(P0.c())), "subtitle", "title"), m.f160324l, bE2, 56);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new n(iA2);
        }
        return G0.f406611a;
    }
}
