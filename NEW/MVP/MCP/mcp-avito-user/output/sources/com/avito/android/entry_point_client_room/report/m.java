package com.avito.android.entry_point_client_room.report;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sz.AbstractC48438c;

/* compiled from: SendReportScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class m extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ sz.e f147693l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<AbstractC48438c, G0> f147694m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f147695n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(sz.e eVar, Y41.l<? super AbstractC48438c, G0> lVar, int i12) {
        super(2);
        this.f147693l = eVar;
        this.f147694m = lVar;
        this.f147695n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f147695n | 1);
        n.b(this.f147693l, this.f147694m, a12, iA2);
        return G0.f406611a;
    }
}
