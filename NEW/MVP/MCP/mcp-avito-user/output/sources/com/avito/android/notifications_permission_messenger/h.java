package com.avito.android.notifications_permission_messenger;

import Y41.p;
import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NotificationPermissionMessengerDialogViewFactoryImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f207990l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f207991m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Y41.a aVar, Y41.a aVar2) {
        super(2);
        this.f207990l = aVar;
        this.f207991m = aVar2;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        bVar2.setImage(R.drawable.notification_permission_messenger_dialog_image);
        bVar2.setTitle(R.string.notification_permission_messenger_dialog_title);
        bVar2.setSubtitle(R.string.notification_permission_messenger_dialog_body);
        bVar2.setButtonsOrientation(1);
        bVar2.setCancelable(false);
        bVar2.G3();
        bVar2.O3(R.string.notification_permission_messenger_dialog_enable_btn, new f(this.f207990l, dialogInterface2));
        bVar2.T3(R.string.notification_permission_messenger_dialog_later_btn, new g(this.f207991m, dialogInterface2));
        return G0.f406611a;
    }
}
