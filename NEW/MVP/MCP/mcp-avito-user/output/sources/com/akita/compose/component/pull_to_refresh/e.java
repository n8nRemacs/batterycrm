package com.akita.compose.component.pull_to_refresh;

import Y41.q;
import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PullToRefresh.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "refreshing", "Lkotlin/G0;", "invoke", "(ZLandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements q<Boolean, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f62421l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f62422m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, l lVar) {
        super(3);
        this.f62421l = lVar;
        this.f62422m = jVar;
    }

    @Override // Y41.q
    public final G0 invoke(Boolean bool, A a12, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.j(zBooleanValue) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.component.spinner.h hVar = this.f62421l.f62476b;
            if (zBooleanValue) {
                a13.C(-947276141);
                com.akita.compose.component.spinner.b.a(hVar, null, a13, 0, 2);
                a13.h();
            } else {
                a13.C(-947208623);
                i.c(this.f62422m, hVar, null, a13, 8);
                a13.h();
            }
        }
        return G0.f406611a;
    }
}
