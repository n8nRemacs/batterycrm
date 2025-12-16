package com.avito.android.lib.beduin_v2.component.input.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InnerInput.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class d extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f175681l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f175682m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f175683n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i12, androidx.compose.ui.v vVar, String str) {
        super(2);
        this.f175681l = str;
        this.f175682m = vVar;
        this.f175683n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f175683n | 1);
        q.b(this.f175681l, this.f175682m, a12, iA2);
        return G0.f406611a;
    }
}
