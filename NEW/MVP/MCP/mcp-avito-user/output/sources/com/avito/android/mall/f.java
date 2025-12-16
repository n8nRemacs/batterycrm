package com.avito.android.mall;

import android.view.View;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MallView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements Y41.l<InterfaceC31171n, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f184332l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar) {
        super(1);
        this.f184332l = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC31171n interfaceC31171n) {
        InterfaceC31171n interfaceC31171n2 = interfaceC31171n;
        d dVar = this.f184332l;
        View viewB = dVar.f184253g.b();
        if (viewB != null && dVar.f184254h != null) {
            L.f(viewB, interfaceC31171n2);
        }
        return G0.f406611a;
    }
}
