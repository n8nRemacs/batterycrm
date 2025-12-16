package com.avito.android.comfortable_deal.end_deal;

import androidx.compose.ui.platform.ComposeView;
import com.avito.android.comfortable_deal.end_deal.EndDealDialogFragment;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EndDealDialogFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.comfortable_deal.end_deal.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29476f extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EndDealDialogFragment f122189l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ComposeView f122190m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ EndDealDialogFragment.d f122191n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29476f(EndDealDialogFragment endDealDialogFragment, ComposeView composeView, EndDealDialogFragment.d dVar) {
        super(2);
        this.f122189l = endDealDialogFragment;
        this.f122190m = composeView;
        this.f122191n = dVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            EndDealDialogFragment endDealDialogFragment = this.f122189l;
            com.avito.android.analytics.screens.compose.q.b((com.avito.android.analytics.screens.compose.a) endDealDialogFragment.f122041o0.getValue(), androidx.compose.runtime.internal.r.c(7830302, new C29475e(endDealDialogFragment, this.f122190m, this.f122191n), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
