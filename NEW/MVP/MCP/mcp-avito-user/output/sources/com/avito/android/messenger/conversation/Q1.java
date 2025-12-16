package com.avito.android.messenger.conversation;

import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class Q1 extends kotlin.jvm.internal.N implements Y41.p<a.b, DialogInterface, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final Q1 f189138l = new Q1();

    public Q1() {
        super(2);
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        bVar2.setCancelable(true);
        bVar2.setSubtitle(R.string.messenger_deleted_message_popup_text);
        bVar2.I3(new P1(dialogInterface));
        return kotlin.G0.f406611a;
    }
}
