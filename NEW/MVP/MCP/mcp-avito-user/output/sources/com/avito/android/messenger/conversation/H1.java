package com.avito.android.messenger.conversation;

import android.content.Context;
import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class H1 extends kotlin.jvm.internal.N implements Y41.p<a.b, DialogInterface, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f189096l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f189097m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189098n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(boolean z12, Context context, ChannelFragment channelFragment) {
        super(2);
        this.f189096l = z12;
        this.f189097m = context;
        this.f189098n = channelFragment;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        bVar2.setTitle(R.string.messenger_camera_permission_dialog_title);
        bVar2.setSubtitle(R.string.messenger_camera_permission_dialog_subtitle);
        bVar2.setButtonsOrientation(1);
        ChannelFragment channelFragment = this.f189098n;
        if (this.f189096l) {
            bVar2.O3(R.string.messenger_camera_permission_dialog_settings_button, new E1(this.f189097m, channelFragment, dialogInterface2));
        } else {
            bVar2.O3(R.string.messenger_camera_permission_dialog_grant_button, new F1(channelFragment, dialogInterface2));
        }
        bVar2.T3(R.string.messenger_camera_permission_dialog_deny_button, new G1(dialogInterface2));
        return kotlin.G0.f406611a;
    }
}
