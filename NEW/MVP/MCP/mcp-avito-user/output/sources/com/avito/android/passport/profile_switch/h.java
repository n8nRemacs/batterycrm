package com.avito.android.passport.profile_switch;

import android.content.DialogInterface;
import com.avito.android.deep_linking.links.PassportSwitchProfileLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PassportSwitchProfileAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements Y41.l<DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f213682l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar) {
        super(1);
        this.f213682l = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(DialogInterface dialogInterface) {
        j jVar = this.f213682l;
        jVar.f213695p = null;
        jVar.j(PassportSwitchProfileLink.b.a.f133550b);
        return G0.f406611a;
    }
}
