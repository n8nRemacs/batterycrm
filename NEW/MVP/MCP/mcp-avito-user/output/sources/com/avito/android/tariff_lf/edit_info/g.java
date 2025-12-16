package com.avito.android.tariff_lf.edit_info;

import Y41.l;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.component.toast.f;
import com.avito.android.tariff_lf.edit_info.viewmodel.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditInfoFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/viewmodel/k$a;", "kotlin.jvm.PlatformType", "event", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/tariff_lf/edit_info/viewmodel/k$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements l<k.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EditInfoFragment f298873l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(EditInfoFragment editInfoFragment) {
        super(1);
        this.f298873l = editInfoFragment;
    }

    @Override // Y41.l
    public final G0 invoke(k.a aVar) {
        k.a aVar2 = aVar;
        com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, this.f298873l, com.avito.android.printable_text.b.f(aVar2.f299100a), null, null, new f.c(aVar2.f299101b), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
        return G0.f406611a;
    }
}
