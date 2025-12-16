package com.avito.android.interior_photos_block;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InteriorPhotoBlockViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f173043l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar) {
        super(2);
        this.f173043l = kVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            k kVar = this.f173043l;
            com.akita.compose.theme.re23.c.a(false, r.c(-1073452712, new d(kVar, C22126m3.b(((com.avito.android.interior_photos_block.mvi.k) kVar.f173055d.getValue()).getState(), a13)), a13), a13, 48, 1);
        }
        return G0.f406611a;
    }
}
