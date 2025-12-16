package com.avito.android.update.mvi_screen;

import Y41.p;
import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UpdateApplicationMviActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UpdateApplicationMviActivity f306670l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UpdateApplicationMviActivity updateApplicationMviActivity) {
        super(2);
        this.f306670l = updateApplicationMviActivity;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            UpdateApplicationMviActivity updateApplicationMviActivity = this.f306670l;
            f.a(((h) updateApplicationMviActivity.f306659o.getValue()).getEvents(), new a(updateApplicationMviActivity), new b(updateApplicationMviActivity), a13, 8);
        }
        return G0.f406611a;
    }
}
