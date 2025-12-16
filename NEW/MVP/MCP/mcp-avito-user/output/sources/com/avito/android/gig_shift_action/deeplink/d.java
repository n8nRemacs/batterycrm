package com.avito.android.gig_shift_action.deeplink;

import Y41.l;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.gig_shift_action.GigShiftActionDeeplink;
import com.avito.android.screen_flow.link.ScreenFlowLink;
import com.avito.android.shift_list.ShiftListDeeplink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GigShiftActionDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f160407l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ GigShiftActionDeeplink f160408m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, GigShiftActionDeeplink gigShiftActionDeeplink) {
        super(1);
        this.f160407l = aVar;
        this.f160408m = gigShiftActionDeeplink;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        a aVar = this.f160407l;
        aVar.getClass();
        b.a.a(aVar.f160394h, new ScreenFlowLink(new ShiftListDeeplink(), this.f160408m), null, null, 6);
        return G0.f406611a;
    }
}
