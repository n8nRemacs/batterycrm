package com.avito.android.replace_main.onboarding.view;

import Cm0.InterfaceC13326c;
import androidx.compose.ui.platform.ComposeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReplaceMainOnboardingViewImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class z extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f254587l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ComposeView f254588m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13326c.a f254589n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(v vVar, ComposeView composeView, InterfaceC13326c.a aVar) {
        super(2);
        this.f254587l = vVar;
        this.f254588m = composeView;
        this.f254589n = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v vVar = this.f254587l;
            m.a(vVar.f254577a, vVar.f254579c, new w(vVar), new x(vVar, this.f254588m), new y(this.f254589n), a13, 72);
        }
        return G0.f406611a;
    }
}
