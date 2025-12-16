package com.avito.android.comfortable_deal_info;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.comfortable_deal_info.ComfortableDealInfoDialogFragment;
import com.avito.android.comfortable_deal_info.dto.Screen;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import uq.C49096b;

/* compiled from: ComfortableDealInfoDialogFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ComfortableDealInfoDialogFragment f123464l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ComfortableDealInfoDialogFragment comfortableDealInfoDialogFragment) {
        super(0);
        this.f123464l = comfortableDealInfoDialogFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ComfortableDealInfoDialogFragment.a aVar = ComfortableDealInfoDialogFragment.f123435o0;
        ComfortableDealInfoDialogFragment comfortableDealInfoDialogFragment = this.f123464l;
        Screen screen = (Screen) C42745f0.K(comfortableDealInfoDialogFragment.f123443n0, comfortableDealInfoDialogFragment.f5().f123450b);
        String str = screen != null ? screen.f123488e : null;
        Screen screen2 = (Screen) C42745f0.K(comfortableDealInfoDialogFragment.f123443n0 + 1, comfortableDealInfoDialogFragment.f5().f123450b);
        String str2 = screen2 != null ? screen2.f123488e : null;
        C49096b c49096b = comfortableDealInfoDialogFragment.f123438i0;
        if (c49096b == null) {
            c49096b = null;
        }
        if (str == null) {
            c49096b.getClass();
        } else {
            InterfaceC28373a interfaceC28373a = c49096b.f440300a;
            if (str2 != null) {
                interfaceC28373a.c(new uq.f(str, str2));
            } else {
                interfaceC28373a.c(new uq.g(str));
            }
        }
        f fVar = comfortableDealInfoDialogFragment.f123437h0;
        (fVar != null ? fVar : null).a(comfortableDealInfoDialogFragment.f123443n0 + 1);
        return G0.f406611a;
    }
}
