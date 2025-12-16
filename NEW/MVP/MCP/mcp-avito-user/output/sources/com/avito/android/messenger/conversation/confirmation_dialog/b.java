package com.avito.android.messenger.conversation.confirmation_dialog;

import android.content.DialogInterface;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConfirmationDialogView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f189490l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f189491m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a f189492n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Y41.a<G0> aVar, DialogInterface dialogInterface, a aVar2) {
        super(0);
        this.f189490l = (N) aVar;
        this.f189491m = dialogInterface;
        this.f189492n = aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final G0 invoke() {
        this.f189490l.invoke();
        this.f189491m.dismiss();
        this.f189492n.f189484b = null;
        return G0.f406611a;
    }
}
