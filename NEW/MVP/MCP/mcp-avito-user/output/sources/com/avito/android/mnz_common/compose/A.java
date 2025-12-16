package com.avito.android.mnz_common.compose;

import androidx.compose.runtime.C22066f2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MnzSegmentedControl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class A extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<String> f197809l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f197810m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Integer f197811n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f197812o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f197813p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(List list, Y41.l lVar, Integer num, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f197809l = list;
        this.f197810m = lVar;
        this.f197811n = num;
        this.f197812o = vVar;
        this.f197813p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f197813p | 1);
        Integer num2 = this.f197811n;
        B.a(this.f197809l, this.f197810m, num2, this.f197812o, a12, iA2);
        return G0.f406611a;
    }
}
