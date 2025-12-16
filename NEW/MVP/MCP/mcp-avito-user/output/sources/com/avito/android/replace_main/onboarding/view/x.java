package com.avito.android.replace_main.onboarding.view;

import androidx.compose.ui.platform.ComposeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReplaceMainOnboardingViewImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class x extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f254584l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ComposeView f254585m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(v vVar, ComposeView composeView) {
        super(0);
        this.f254584l = vVar;
        this.f254585m = composeView;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f254585m.getContext().startActivity(this.f254584l.f254577a.f254569d.get().b());
        return G0.f406611a;
    }
}
