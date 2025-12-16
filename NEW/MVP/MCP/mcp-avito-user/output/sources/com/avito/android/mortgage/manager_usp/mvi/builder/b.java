package com.avito.android.mortgage.manager_usp.mvi.builder;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;
import z00.C50335d;
import z00.InterfaceC50336e;
import z00.f;

/* compiled from: ManagerUspViewStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/manager_usp/mvi/builder/b;", "Lcom/avito/android/mortgage/manager_usp/mvi/builder/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.mortgage.manager_usp.mvi.builder.a
    @k
    public final C50335d a(@k C50335d c50335d) {
        InterfaceC50336e bVar;
        InterfaceC50336e aVar;
        InterfaceC50336e interfaceC50336e;
        if (!c50335d.f443689c) {
            ApiError apiError = c50335d.f443690d;
            if (apiError != null) {
                aVar = new InterfaceC50336e.b(apiError);
            } else {
                f fVar = c50335d.f443688b;
                if (fVar != null) {
                    aVar = new InterfaceC50336e.a(fVar);
                } else {
                    V2.f318762a.d("ManagerUsp", "unknown view state: " + c50335d);
                    bVar = new InterfaceC50336e.b(new ApiError.UnknownError("", null, null, 6, null));
                }
            }
            interfaceC50336e = aVar;
            return C50335d.a(c50335d, null, false, null, interfaceC50336e, 7);
        }
        bVar = InterfaceC50336e.c.f443694a;
        interfaceC50336e = bVar;
        return C50335d.a(c50335d, null, false, null, interfaceC50336e, 7);
    }
}
