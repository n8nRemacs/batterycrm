package com.avito.android.mortgage_invite.participant.mvi.builder;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import o20.C44572a;
import o20.d;
import p20.C46879d;
import p20.e;

/* compiled from: ParticipantViewStateBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/builder/b;", "Lcom/avito/android/mortgage_invite/participant/mvi/builder/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.mortgage_invite.participant.mvi.builder.a
    @k
    public final C46879d a(@k C46879d c46879d) {
        e eVar;
        e aVar;
        if (c46879d.f428148d) {
            eVar = e.d.f428152a;
        } else {
            o20.c cVar = c46879d.f428146b;
            if (cVar != null) {
                C44572a c44572a = cVar.f419325e;
                List<d> list = c44572a.f419315b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((d) obj).f419333f) {
                        arrayList.add(obj);
                    }
                }
                aVar = new e.a(o20.c.a(cVar, false, C44572a.a(c44572a, arrayList, 5), null, 111));
                return C46879d.a(c46879d, null, null, false, aVar, 15);
            }
            eVar = e.c.f428151a;
        }
        aVar = eVar;
        return C46879d.a(c46879d, null, null, false, aVar, 15);
    }
}
