package com.avito.android.authorization.auth;

import android.os.Bundle;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AuthFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.authorization.auth.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28624c extends kotlin.jvm.internal.N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AuthArguments f92928l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28624c(AuthArguments authArguments) {
        super(1);
        this.f92928l = authArguments;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        bundle.putParcelable("key_arguments", this.f92928l);
        return G0.f406611a;
    }
}
