package com.avito.android.passport.profile_add.merge.deeplinking;

import android.content.Intent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sv.C48421d;

/* compiled from: PassportMergeAccountsAsyncDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f212926l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Intent f212927m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Intent intent) {
        super(0);
        this.f212926l = gVar;
        this.f212927m = intent;
    }

    @Override // Y41.a
    public final G0 invoke() {
        g gVar = this.f212926l;
        int iA2 = C48421d.a(gVar);
        gVar.f212929g.J(this.f212927m, iA2, com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }
}
