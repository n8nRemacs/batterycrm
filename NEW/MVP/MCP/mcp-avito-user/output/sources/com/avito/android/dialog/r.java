package com.avito.android.dialog;

import android.net.Uri;
import gw.InterfaceC40743a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DialogWithDeeplinkActions.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgw/a;", "it", "Lkotlin/G0;", "invoke", "(Lgw/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class r extends N implements Y41.l<InterfaceC40743a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Uri f144795l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Uri uri) {
        super(1);
        this.f144795l = uri;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC40743a interfaceC40743a) {
        InterfaceC40743a interfaceC40743a2 = interfaceC40743a;
        com.avito.android.image_loader.fresco.s.c(interfaceC40743a2, this.f144795l, true, new p(interfaceC40743a2), new q(interfaceC40743a2));
        return G0.f406611a;
    }
}
