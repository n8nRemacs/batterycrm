package com.avito.android.replace_main.onboarding.view;

import Cm0.C13324a;
import Dm0.C13417a;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.analytics.InterfaceC28373a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: ReplaceMainOnboardingContent.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f254541l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C13324a f254542m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T f254543n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f254544o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f254545p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N f254546q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N f254547r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(C13324a c13324a, Y41.a aVar, Y41.a aVar2, Y41.l lVar, InterfaceC22204y1 interfaceC22204y1, p pVar, T t12) {
        super(0);
        this.f254541l = pVar;
        this.f254542m = c13324a;
        this.f254543n = t12;
        this.f254544o = interfaceC22204y1;
        this.f254545p = (N) lVar;
        this.f254546q = (N) aVar;
        this.f254547r = (N) aVar2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r7v0, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r8v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f254544o;
        if (!interfaceC22204y1.getF42167b().booleanValue()) {
            Boolean bool = Boolean.TRUE;
            interfaceC22204y1.setValue(bool);
            InterfaceC28373a interfaceC28373a = this.f254541l.f254566a.get();
            C13324a c13324a = this.f254542m;
            interfaceC28373a.c(new C13417a("b360_main", c13324a.f2656c.f2663a, bool));
            ?? r72 = this.f254546q;
            C43259k.d(this.f254543n, null, null, new h(this.f254541l, this.f254545p, c13324a, r72, this.f254547r, null), 3);
        }
        return G0.f406611a;
    }
}
