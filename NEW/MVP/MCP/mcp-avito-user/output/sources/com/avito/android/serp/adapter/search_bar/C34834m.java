package com.avito.android.serp.adapter.search_bar;

import android.view.View;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SearchBarItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.search_bar.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34834m extends kotlin.jvm.internal.N implements Y41.l<InterfaceC31171n, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34840t f271643l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34834m(C34840t c34840t) {
        super(1);
        this.f271643l = c34840t;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC31171n interfaceC31171n) {
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L l12;
        View viewB;
        InterfaceC31171n interfaceC31171n2 = interfaceC31171n;
        C34840t c34840t = this.f271643l;
        M m12 = c34840t.f271672m;
        if (m12 != null && (l12 = c34840t.f271674o) != null && (viewB = m12.f271603d.b()) != null) {
            com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.d.a(l12, viewB, interfaceC31171n2, new C34833l(m12));
        }
        return G0.f406611a;
    }
}
