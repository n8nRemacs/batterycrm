package com.avito.android.recall_me_v2.presentation.recallme;

import Di0.AbstractC13405c;
import Di0.InterfaceC13403a;
import Di0.InterfaceC13404b;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RecallMeScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class u extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC13405c f252223l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC13404b> f252224m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC13403a, G0> f252225n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f252226o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(AbstractC13405c abstractC13405c, InterfaceC43160i interfaceC43160i, Y41.l lVar, com.avito.android.analytics.screens.mvi.r rVar, int i12) {
        super(2);
        this.f252223l = abstractC13405c;
        this.f252224m = interfaceC43160i;
        this.f252225n = lVar;
        this.f252226o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f252226o | 1);
        k.c(this.f252223l, this.f252224m, this.f252225n, a12, iA2);
        return G0.f406611a;
    }
}
