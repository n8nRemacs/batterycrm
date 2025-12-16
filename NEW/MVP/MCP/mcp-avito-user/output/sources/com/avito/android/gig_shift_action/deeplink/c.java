package com.avito.android.gig_shift_action.deeplink;

import Y41.l;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.gig_apply.GigSlotDeeplink;
import com.avito.android.gig_shift_action.GigShiftActionDeeplink;
import com.avito.android.screen_flow.link.ScreenFlowLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GigShiftActionDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LuG/c;", "it", "Lkotlin/G0;", "invoke", "(LuG/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class c extends N implements l<uG.c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f160405l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ GigShiftActionDeeplink f160406m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, GigShiftActionDeeplink gigShiftActionDeeplink) {
        super(1);
        this.f160405l = aVar;
        this.f160406m = gigShiftActionDeeplink;
    }

    @Override // Y41.l
    public final G0 invoke(uG.c cVar) {
        a aVar = this.f160405l;
        aVar.getClass();
        b.a.a(aVar.f160394h, new ScreenFlowLink(new GigSlotDeeplink(cVar.getSlotId()), this.f160406m), null, null, 6);
        return G0.f406611a;
    }
}
