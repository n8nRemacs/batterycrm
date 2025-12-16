package com.avito.android.messenger.deeplink;

import android.content.DialogInterface;
import kotlin.Metadata;

/* compiled from: ChannelCallDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.deeplink.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32394m extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f195528l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32394m(DialogInterface dialogInterface) {
        super(0);
        this.f195528l = dialogInterface;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        this.f195528l.dismiss();
        return kotlin.G0.f406611a;
    }
}
