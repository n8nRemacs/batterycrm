package com.avito.android.lib.compose.design.shared.segment_control;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SegmentedControlCompose.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f177686l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f177687m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p<Integer, String, G0> f177688n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f177689o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p<Integer, String, G0> f177690p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Integer f177691q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ArrayList arrayList, int i12, p pVar, v vVar, p pVar2, Integer num, int i13) {
        super(2);
        this.f177686l = arrayList;
        this.f177687m = i12;
        this.f177688n = pVar;
        this.f177689o = vVar;
        this.f177690p = pVar2;
        this.f177691q = num;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(3081);
        Integer num2 = this.f177691q;
        ArrayList arrayList = this.f177686l;
        p<Integer, String, G0> pVar = this.f177688n;
        v vVar = this.f177689o;
        f.a(arrayList, this.f177687m, pVar, vVar, this.f177690p, num2, a12, iA2);
        return G0.f406611a;
    }
}
