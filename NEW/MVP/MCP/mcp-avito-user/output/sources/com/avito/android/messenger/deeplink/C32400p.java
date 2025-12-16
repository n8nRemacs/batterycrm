package com.avito.android.messenger.deeplink;

import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.Navigation;
import com.avito.android.util.InterfaceC35945t1;
import kotlin.Metadata;

/* compiled from: ChannelCallDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", Navigation.CONFIG, "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.deeplink.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32400p extends kotlin.jvm.internal.N implements Y41.p<a.b, DialogInterface, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C32402q f195538l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f195539m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32400p(C32402q c32402q, String str) {
        super(2);
        this.f195538l = c32402q;
        this.f195539m = str;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        bVar2.setTitle(R.string.messenger_call_action);
        C32402q c32402q = this.f195538l;
        InterfaceC35945t1<String> interfaceC35945t1 = c32402q.f195547k;
        String str = this.f195539m;
        bVar2.setSubtitle(interfaceC35945t1.a(str));
        bVar2.O3(R.string.messenger_call_action, new C32392l(c32402q, str, dialogInterface2));
        bVar2.T3(R.string.cancel, new C32396n(c32402q, dialogInterface2));
        bVar2.b(new C32398o(c32402q));
        return kotlin.G0.f406611a;
    }
}
