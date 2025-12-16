package com.avito.android.sx_address.entry.mvi.builder;

import DA0.a;
import DA0.d;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.V2;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SxAddressViewStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/entry/mvi/builder/b;", "Lcom/avito/android/sx_address/entry/mvi/builder/a;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.sx_address.entry.mvi.builder.a
    @k
    public final d a(@k d dVar) {
        DA0.a aVar;
        DA0.a c0157a;
        if (dVar.f3090c) {
            aVar = a.c.f3081a;
        } else if (dVar.f3091d) {
            aVar = a.b.f3080a;
        } else {
            List<com.avito.android.sx_address.entry.domain.a> list = dVar.f3089b;
            if (list != null) {
                c0157a = new a.C0157a(list);
                return d.a(dVar, null, false, false, c0157a, 7);
            }
            V2.f318762a.d("SxAddressEntry", "error creating viewstate for " + dVar);
            aVar = a.b.f3080a;
        }
        c0157a = aVar;
        return d.a(dVar, null, false, false, c0157a, 7);
    }
}
