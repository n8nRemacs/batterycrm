package com.avito.android.comfortable_deal.deeplink;

import android.os.Bundle;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.comfortable_deal.deeplink.PpRecallDeeplink;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PpRecallDeeplinkDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/domain/g;", "result", "Lkotlin/G0;", "emit", "(Lcom/avito/android/comfortable_deal/domain/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class H<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f121865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PpRecallDeeplink f121866c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f121867d;

    public H(I i12, PpRecallDeeplink ppRecallDeeplink, Bundle bundle) {
        this.f121865b = i12;
        this.f121866c = ppRecallDeeplink;
        this.f121867d = bundle;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        com.avito.android.component.toast.f fVarB;
        String string;
        String string2;
        com.avito.android.comfortable_deal.domain.g gVar = (com.avito.android.comfortable_deal.domain.g) obj;
        I i12 = this.f121865b;
        String str = gVar.f122020a;
        boolean z12 = gVar.f122021b;
        if (z12) {
            f.c.f125255c.getClass();
            fVarB = f.c.a.b();
        } else {
            fVarB = f.a.f125253a;
        }
        a.i.C4057a.e(i12.f121868f, str, fVarB, 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
        Yo.p pVar = i12.f121870h;
        PpRecallDeeplink ppRecallDeeplink = this.f121866c;
        String strConcat = null;
        Bundle bundle = this.f121867d;
        if (z12) {
            String str2 = ppRecallDeeplink.f121881b;
            String string3 = bundle != null ? bundle.getString("recalldeeplink.pagetype") : null;
            if (bundle != null && (string2 = bundle.getString("recalldeeplink.banner_name")) != null) {
                strConcat = string2.concat("_error");
            }
            pVar.d(str2, string3, strConcat);
        } else {
            String str3 = ppRecallDeeplink.f121881b;
            String string4 = bundle != null ? bundle.getString("recalldeeplink.pagetype") : null;
            if (bundle != null && (string = bundle.getString("recalldeeplink.banner_name")) != null) {
                strConcat = string.concat("_success");
            }
            pVar.e(str3, string4, strConcat);
        }
        i12.l(false, !z12);
        i12.j(z12 ? PpRecallDeeplink.b.a.f121884b : PpRecallDeeplink.b.C3603b.f121885b);
        return G0.f406611a;
    }
}
