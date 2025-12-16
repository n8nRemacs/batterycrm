package com.avito.android.util.bottom_gap;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.di.B;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: BottomGapProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/bottom_gap/h;", "Lcom/avito/android/util/bottom_gap/d;", "Lcom/avito/android/util/bottom_gap/c;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@B
/* loaded from: classes5.dex */
public final class h implements d, c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Z1<j> f318841a = p2.a(new j(96));

    @Inject
    public h() {
    }

    @Override // com.avito.android.util.bottom_gap.d
    @k
    public final j a() {
        int i12 = this.f318841a.getValue().f318843a;
        if (i12 < 96) {
            i12 = 96;
        }
        return new j(i12);
    }

    @Override // com.avito.android.util.bottom_gap.c
    public final void b(@k j jVar) {
        this.f318841a.setValue(jVar);
    }

    @Override // com.avito.android.util.bottom_gap.d
    @k
    public final g c() {
        return new g(this.f318841a);
    }
}
