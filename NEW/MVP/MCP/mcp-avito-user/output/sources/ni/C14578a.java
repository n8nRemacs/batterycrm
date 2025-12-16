package Ni;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Performance.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_beduin-v2-page_utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ni.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14578a {
    @k
    public static final J a(@l String str) {
        J.b bVar = J.b.f90385a;
        bVar.getClass();
        if (L.f(str, "success")) {
            return bVar;
        }
        J.a.f90383b.getClass();
        J.a.C2676a.d();
        return L.f(str, "failure") ? J.a.C2676a.d() : bVar;
    }
}
