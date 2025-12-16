package com.avito.android.safety.safety_settings.deeplink;

import android.os.Bundle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import po0.InterfaceC47119a;
import sv.C48421d;

/* compiled from: SafetySettingsAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Bundle f257570l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f257571m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Bundle bundle, h hVar) {
        super(0);
        this.f257570l = bundle;
        this.f257571m = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Bundle bundle = this.f257570l;
        String string = bundle != null ? bundle.getString("safety_settings_deeplink_source_param") : null;
        h hVar = this.f257571m;
        hVar.f257573g.J(InterfaceC47119a.C12288a.a(hVar.f257572f, string, 1), C48421d.a(hVar), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }
}
