package com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_permission_mic_ask;

import Y41.p;
import android.content.DialogInterface;
import com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_permission_mic_ask.a;
import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_permission_mic_ask.IacPermissionMicAskLink;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.Navigation;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacPermissionMicAskLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", Navigation.CONFIG, "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f168266l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IacPermissionMicAskLink f168267m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, IacPermissionMicAskLink iacPermissionMicAskLink) {
        super(2);
        this.f168266l = aVar;
        this.f168267m = iacPermissionMicAskLink;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        a.C4976a.f168253a.getClass();
        bVar2.setTitle(a.C4976a.f168254b);
        bVar2.setSubtitle(a.C4976a.f168255c);
        bVar2.setButtonsOrientation(1);
        int i12 = a.C4976a.f168256d;
        a aVar = this.f168266l;
        bVar2.O3(i12, new b(aVar, this.f168267m, dialogInterface2));
        bVar2.T3(a.C4976a.f168257e, new c(dialogInterface2));
        bVar2.b(new d(aVar));
        return G0.f406611a;
    }
}
