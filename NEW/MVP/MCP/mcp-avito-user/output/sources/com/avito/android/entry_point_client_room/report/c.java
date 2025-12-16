package com.avito.android.entry_point_client_room.report;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SendReportFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SendReportFragment f147670l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f147671m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SendReportFragment sendReportFragment, int i12) {
        super(2);
        this.f147670l = sendReportFragment;
        this.f147671m = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f147671m | 1);
        SendReportFragment.q5(this.f147670l, a12, iA2);
        return G0.f406611a;
    }
}
