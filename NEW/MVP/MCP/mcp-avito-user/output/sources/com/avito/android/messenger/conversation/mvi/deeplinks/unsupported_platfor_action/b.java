package com.avito.android.messenger.conversation.mvi.deeplinks.unsupported_platfor_action;

import android.content.DialogInterface;
import com.avito.android.deep_linking.links.Store;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UnsupportedPlatformActionDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f190670l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f190671m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DialogInterface dialogInterface, e eVar) {
        super(0);
        this.f190670l = dialogInterface;
        this.f190671m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f190670l.dismiss();
        e eVar = this.f190671m;
        eVar.f190676f.R(eVar.f190674d.b(Store.f133676d), a.f190669l);
        return G0.f406611a;
    }
}
