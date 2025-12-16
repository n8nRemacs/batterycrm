package com.avito.android.comfortable_deal.phone_call.mvi.builder;

import Y61.k;
import Zp.C19585c;
import Zp.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhoneCallViewStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/phone_call/mvi/builder/b;", "Lcom/avito/android/comfortable_deal/phone_call/mvi/builder/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.comfortable_deal.phone_call.mvi.builder.a
    @k
    public final C19585c a(@k C19585c c19585c) {
        d dVar;
        d aVar;
        if (c19585c.f20500f) {
            dVar = d.c.f20506a;
        } else if (c19585c.f20501g) {
            dVar = d.b.f20505a;
        } else {
            String str = c19585c.f20498d;
            if (str != null) {
                aVar = new d.a(str, c19585c.f20499e);
                return C19585c.a(c19585c, null, false, false, false, aVar, 63);
            }
            V2.f318762a.j("PhoneCallDialog", "Wrong view state, state = " + c19585c, null);
            dVar = d.b.f20505a;
        }
        aVar = dVar;
        return C19585c.a(c19585c, null, false, false, false, aVar, 63);
    }
}
