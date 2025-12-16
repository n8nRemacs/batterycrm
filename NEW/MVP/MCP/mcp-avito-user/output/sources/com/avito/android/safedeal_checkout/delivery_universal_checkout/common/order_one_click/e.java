package com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click;

import Ju.AbstractC14250d;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.util.InterfaceC35741a1;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: DeliveryOrderRealOneClickDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f256945b;

    public e(a aVar) {
        this.f256945b = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        a aVar = this.f256945b;
        PrintableText printableTextA = InterfaceC35741a1.a.a(aVar.f256936l, (Throwable) obj, null, null, 6);
        Resources resources = aVar.f256937m;
        aVar.f256935k.u1((7 & 1) != 0 ? 0 : R.style.Theme_DesignSystem_Re23, (7 & 4) == 0 ? R.style.Re23_Modal_Default : 0, new h(new UserDialog("", com.avito.android.printable_text.b.g(printableTextA, resources), C42784z0.f406748b, false, 8, null), resources.getString(R.string.ok), aVar));
        aVar.j(AbstractC14250d.b.f9170c);
    }
}
