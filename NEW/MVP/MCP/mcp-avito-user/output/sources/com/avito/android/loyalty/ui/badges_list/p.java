package com.avito.android.loyalty.ui.badges_list;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BadgesListScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class p extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f183401l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f183402m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(UniversalImage universalImage, boolean z12, int i12) {
        super(2);
        this.f183401l = universalImage;
        this.f183402m = z12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        boolean z12 = this.f183402m;
        o.c(this.f183401l, z12, a12, iA2);
        return G0.f406611a;
    }
}
