package com.avito.android.advert.navbar;

import android.content.Context;
import com.avito.android.advert.navbar.r;
import com.avito.android.util.C35835l0;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import sK0.C48063a;

/* compiled from: ResovableColor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class s {
    @InterfaceC42156l
    public static final int a(@Y61.k r rVar, @Y61.k Context context) {
        if (rVar instanceof r.a) {
            return C35835l0.d(((r.a) rVar).f80875a, context);
        }
        if (rVar instanceof r.b) {
            return androidx.core.content.d.getColor(context, 0);
        }
        if (rVar instanceof r.c) {
            return C48063a.f437606a.a(context, ((r.c) rVar).f80876a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
