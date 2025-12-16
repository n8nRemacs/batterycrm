package com.avito.android.messenger.conversation.confirmation_dialog;

import android.content.DialogInterface;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConfirmationDialogView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f189493l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f189494m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DialogInterface dialogInterface, a aVar) {
        super(0);
        this.f189493l = dialogInterface;
        this.f189494m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f189493l.dismiss();
        this.f189494m.f189484b = null;
        return G0.f406611a;
    }
}
