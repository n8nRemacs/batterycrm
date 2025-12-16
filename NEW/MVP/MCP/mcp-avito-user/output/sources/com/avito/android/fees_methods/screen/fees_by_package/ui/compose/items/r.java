package com.avito.android.fees_methods.screen.fees_by_package.ui.compose.items;

import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FeesByPackageSnippetItem.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class r extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FeesByPackageState.e f158149l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(FeesByPackageState.e eVar) {
        super(2);
        this.f158149l = eVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            float f12 = 10;
            t.a(this.f158149l, R1.m(v.f42878y1, f12, 20, f12, 0.0f, 8), a13, 6);
        }
        return G0.f406611a;
    }
}
