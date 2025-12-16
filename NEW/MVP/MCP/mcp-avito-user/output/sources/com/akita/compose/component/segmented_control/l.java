package com.akita.compose.component.segmented_control;

import androidx.compose.runtime.A;
import androidx.compose.runtime.I3;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SegmentedControl.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I3<s> f62573l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f62574m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f62575n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f62576o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(I3<s> i32, z zVar, boolean z12, int i12) {
        super(2);
        this.f62573l = i32;
        this.f62574m = zVar;
        this.f62575n = z12;
        this.f62576o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            ArrayList arrayList = this.f62573l.getF42167b().f62590a;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                ((Y41.s) arrayList.get(i12)).invoke(this.f62574m, Boolean.valueOf(this.f62575n), Boolean.valueOf(i12 == this.f62576o), a13, 0);
                i12++;
            }
        }
        return G0.f406611a;
    }
}
