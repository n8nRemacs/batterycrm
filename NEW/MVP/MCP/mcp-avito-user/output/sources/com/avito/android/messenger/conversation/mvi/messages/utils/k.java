package com.avito.android.messenger.conversation.mvi.messages.utils;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Preview.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class k extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T1 f193600l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<h0, G0> f193601m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f193602n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(T1 t12, Y41.l lVar, float f12) {
        super(2);
        this.f193600l = t12;
        this.f193601m = lVar;
        this.f193602n = f12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.avito.android.messenger.conversation.mvi.messages.renderers.a aVar = this.f193600l.getF189216f().f189048b.f189223a;
            v vVarK = v.f42878y1;
            v vVarD = C20588k2.d(vVarK, 1.0f);
            vVarK.getClass();
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            float f12 = this.f193602n;
            if (Float.compare(f12, 0) > 0) {
                vVarK = R1.k(f12, 0.0f, 2, vVarK);
            }
            aVar.a(this.f193600l, this.f193601m, vVarD.d0(vVarK), a13, 0);
        }
        return G0.f406611a;
    }
}
