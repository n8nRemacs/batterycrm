package com.avito.android.installmentsblock.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.installments_block.entity.InstallmentsIcon;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsBlock.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class f extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InstallmentsIcon f172927l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f172928m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InstallmentsIcon installmentsIcon, v vVar, int i12) {
        super(2);
        this.f172927l = installmentsIcon;
        this.f172928m = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        b.c(this.f172927l, a12, iA2);
        return G0.f406611a;
    }
}
