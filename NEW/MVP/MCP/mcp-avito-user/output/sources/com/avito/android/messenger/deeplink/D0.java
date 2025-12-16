package com.avito.android.messenger.deeplink;

import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.Navigation;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.PinUnpinChannelResponse;

/* compiled from: PinChannelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", Navigation.CONFIG, "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class D0 extends kotlin.jvm.internal.N implements Y41.p<a.b, DialogInterface, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PinUnpinChannelResponse f195321l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(PinUnpinChannelResponse pinUnpinChannelResponse) {
        super(2);
        this.f195321l = pinUnpinChannelResponse;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        bVar2.setSubtitle(this.f195321l.getError());
        bVar2.T3(R.string.messenger_pin_count_exceeded_dialog_confirmation, new C0(dialogInterface));
        bVar2.setCancelable(true);
        return kotlin.G0.f406611a;
    }
}
