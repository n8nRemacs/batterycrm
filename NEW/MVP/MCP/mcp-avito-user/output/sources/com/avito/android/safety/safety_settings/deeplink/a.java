package com.avito.android.safety.safety_settings.deeplink;

import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.auth.PasswordChangeLink;
import fo0.InterfaceC40455a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import nI0.InterfaceC44261b;
import po0.InterfaceC47119a;
import sv.C48421d;

/* compiled from: PasswordChangeAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Bundle f257543l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f257544m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ PasswordChangeLink f257545n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Bundle bundle, b bVar, PasswordChangeLink passwordChangeLink) {
        super(0);
        this.f257543l = bundle;
        this.f257544m = bVar;
        this.f257545n = passwordChangeLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Bundle bundle = this.f257543l;
        boolean zF2 = L.f(bundle != null ? bundle.getString("deeplink_handling_source") : null, "safety_settings");
        b bVar = this.f257544m;
        InterfaceC40455a interfaceC40455a = bVar.f257546f;
        PasswordChangeLink passwordChangeLink = this.f257545n;
        Intent intentA = interfaceC40455a.a(passwordChangeLink);
        if (passwordChangeLink.f133925g == PasswordChangeLink.Mode.f133927c && !zF2) {
            Intent intentA2 = InterfaceC44261b.a.a(bVar.f257547g, null, null, null, null, 31);
            Intent intentA3 = InterfaceC47119a.C12288a.a(bVar.f257548h, null, 3);
            intentA3.putExtra("up_intent", intentA2);
            intentA.putExtra("up_intent", intentA3);
        }
        bVar.f257549i.J(intentA, C48421d.a(bVar), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }
}
