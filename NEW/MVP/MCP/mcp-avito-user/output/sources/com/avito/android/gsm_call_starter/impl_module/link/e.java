package com.avito.android.gsm_call_starter.impl_module.link;

import com.avito.android.gsm_call_starter.public_module.link.GsmCallStartLink;
import com.avito.android.util.V2;
import kotlin.Metadata;
import rv.C47920c;

/* compiled from: GsmCallStartLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/c;", "permissionResult", "Lkotlin/G0;", "accept", "(Lrv/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f161234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GsmCallStartLink f161235c;

    public e(a aVar, GsmCallStartLink gsmCallStartLink) {
        this.f161234b = aVar;
        this.f161235c = gsmCallStartLink;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean z12 = ((C47920c) obj).f437161a;
        a aVar = this.f161234b;
        GsmCallStartLink gsmCallStartLink = this.f161235c;
        if (!z12) {
            V2.f318762a.c("GsmCallStartLink", "CALL_PHONE permission was just denied -> openDialerIfPossible()", null);
            int i12 = a.f161219q;
            aVar.k(gsmCallStartLink);
        } else {
            V2.f318762a.c("GsmCallStartLink", "CALL_PHONE permission was just granted -> startCallInDialerIfPossible()", null);
            aVar.f161223i.c(new SH.a());
            aVar.l(gsmCallStartLink);
        }
    }
}
