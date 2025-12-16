package com.avito.android.loyalty.ui.badges_list;

import Y41.q;
import android.content.Context;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.grid.X;
import androidx.compose.runtime.A;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.navbar.t;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BadgesListScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/X;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/grid/X;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements q<X, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f183380l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Y41.a<G0> aVar) {
        super(3);
        this.f183380l = aVar;
    }

    @Override // Y41.q
    public final G0 invoke(X x12, A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            t.d(((Context) a13.o(AndroidCompositionLocals_androidKt.f41069b)).getString(R.string.badges_list_screen_title), R1.m(v.f42878y1, 0.0f, 0.0f, 0.0f, 16, 7), null, 0, this.f183380l, null, a13, 48, 44);
        }
        return G0.f406611a;
    }
}
