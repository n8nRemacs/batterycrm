package com.avito.android.authorization.deep_linking;

import android.content.DialogInterface;
import com.avito.android.remote.model.Action;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PerformResetPasswordAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class O extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f93702l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S f93703m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Action f93704n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(DialogInterface dialogInterface, S s5, Action action) {
        super(0);
        this.f93702l = dialogInterface;
        this.f93703m = s5;
        this.f93704n = action;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f93702l.dismiss();
        this.f93703m.k(this.f93704n.getDeepLink());
        return G0.f406611a;
    }
}
