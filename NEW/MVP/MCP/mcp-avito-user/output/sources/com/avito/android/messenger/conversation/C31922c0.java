package com.avito.android.messenger.conversation;

import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.c0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31922c0 extends kotlin.jvm.internal.N implements Y41.p<a.b, DialogInterface, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f189349l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189350m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31922c0(String str, ChannelFragment channelFragment) {
        super(2);
        this.f189349l = str;
        this.f189350m = channelFragment;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        bVar2.setSubtitle(this.f189349l);
        bVar2.M3(this.f189350m.getString(R.string.messenger_quick_replies_add_error_dialog_confirmation), new C31919b0(dialogInterface));
        bVar2.setCancelable(true);
        return kotlin.G0.f406611a;
    }
}
