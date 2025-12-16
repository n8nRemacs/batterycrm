package com.avito.android.replace_main.onboarding.view;

import Cm0.InterfaceC13326c;
import androidx.compose.ui.platform.ComposeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReplaceMainOnboardingViewImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class A extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f254519l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ComposeView f254520m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13326c.a f254521n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(v vVar, ComposeView composeView, InterfaceC13326c.a aVar) {
        super(2);
        this.f254519l = vVar;
        this.f254520m = composeView;
        this.f254521n = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            InterfaceC13326c.a aVar = this.f254521n;
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(1930098884, new z(this.f254519l, this.f254520m, aVar), a13), a13, 48, 1);
        }
        return G0.f406611a;
    }
}
