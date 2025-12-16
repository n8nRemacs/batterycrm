package com.avito.android.mortgage_invite.contact_info.mvi.builder;

import Y61.k;
import a20.C19669a;
import androidx.compose.runtime.internal.P;
import b20.d;
import b20.e;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ApplicationContactInfoViewStateBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/builder/b;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/builder/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.mortgage_invite.contact_info.mvi.builder.a
    @k
    public final d a(@k d dVar) {
        e eVar;
        e aVar;
        if (dVar.f56847e) {
            eVar = e.d.f56851a;
        } else {
            C19669a c19669a = dVar.f56844b;
            if (c19669a != null) {
                Y10.a aVar2 = c19669a.f20714f;
                List<Y10.b> list = aVar2.f19259b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((Y10.b) obj).f19267g) {
                        arrayList.add(obj);
                    }
                }
                aVar = new e.a(C19669a.a(c19669a, false, Y10.a.a(aVar2, arrayList, 5), null, 95));
                return d.a(dVar, null, null, null, false, aVar, 15);
            }
            eVar = e.c.f56850a;
        }
        aVar = eVar;
        return d.a(dVar, null, null, null, false, aVar, 15);
    }
}
