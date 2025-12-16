package androidx.view;

import Y41.l;
import Y61.k;
import androidx.view.C23280B0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NavOptionsBuilder.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.F0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23288F0 {
    @k
    public static final C23280B0 a(@k l<? super C23286E0, G0> lVar) {
        C23286E0 c23286e0 = new C23286E0();
        lVar.invoke(c23286e0);
        boolean z12 = c23286e0.f52770b;
        C23280B0.a aVar = c23286e0.f52769a;
        aVar.f52752a = z12;
        aVar.f52753b = c23286e0.f52771c;
        String str = c23286e0.f52773e;
        if (str != null) {
            boolean z13 = c23286e0.f52774f;
            boolean z14 = c23286e0.f52775g;
            aVar.f52755d = str;
            aVar.f52754c = -1;
            aVar.f52756e = z13;
            aVar.f52757f = z14;
        } else {
            int i12 = c23286e0.f52772d;
            boolean z15 = c23286e0.f52774f;
            boolean z16 = c23286e0.f52775g;
            aVar.f52754c = i12;
            aVar.f52755d = null;
            aVar.f52756e = z15;
            aVar.f52757f = z16;
        }
        return aVar.a();
    }
}
