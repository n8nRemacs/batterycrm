package com.akita.compose.component.chips.internal;

import Y41.l;
import androidx.compose.ui.layout.K0;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SingleLineStretchedLayout.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class j extends N implements l<K0.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f60939l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f60940m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f60941n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ArrayList arrayList, int i12, int i13) {
        super(1);
        this.f60939l = i12;
        this.f60940m = arrayList;
        this.f60941n = i13;
    }

    @Override // Y41.l
    public final G0 invoke(K0.a aVar) {
        K0.a aVar2 = aVar;
        ArrayList arrayList = this.f60940m;
        int size = arrayList.size();
        int i12 = this.f60939l;
        for (int i13 = 0; i13 < size; i13++) {
            K0 k02 = (K0) arrayList.get(i13);
            aVar2.h(k02, i12, 0, 0.0f);
            i12 += k02.f40345b + this.f60941n;
        }
        return G0.f406611a;
    }
}
