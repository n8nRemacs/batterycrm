package com.avito.android.messenger.conversation.mvi.send;

import android.content.DialogInterface;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import kotlin.Metadata;

/* compiled from: SendMessageView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h1 extends kotlin.jvm.internal.N implements Y41.p<a.b, DialogInterface, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q0 f194518l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Q0 q02) {
        super(2);
        this.f194518l = q02;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        Q0 q02 = this.f194518l;
        bVar2.setTitle(q02.f194372e.getString(R.string.messenger_video_source_chooser_title));
        bVar2.setButtonsOrientation(1);
        Resources resources = q02.f194372e;
        bVar2.L3(resources.getString(R.string.messenger_video_source_chooser_gallery_option), new c1(q02));
        bVar2.M3(resources.getString(R.string.messenger_video_source_chooser_camera_option), new d1(q02));
        bVar2.b(new e1(q02));
        bVar2.P3(new f1(q02));
        bVar2.H3(new g1(q02));
        return kotlin.G0.f406611a;
    }
}
