package com.avito.android.passport.profile_switch;

import android.content.DialogInterface;
import com.avito.android.deep_linking.links.PassportSwitchProfileLink;
import com.avito.android.remote.model.Action;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PassportSwitchProfileAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f213679l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Action f213680m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f213681n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, Action action, DialogInterface dialogInterface) {
        super(0);
        this.f213679l = jVar;
        this.f213680m = action;
        this.f213681n = dialogInterface;
    }

    @Override // Y41.a
    public final G0 invoke() {
        PassportSwitchProfileLink.b.C4012b c4012b = PassportSwitchProfileLink.b.C4012b.f133551b;
        j jVar = this.f213679l;
        jVar.i(c4012b, jVar.f213685f, this.f213680m.getDeepLink());
        this.f213681n.dismiss();
        return G0.f406611a;
    }
}
