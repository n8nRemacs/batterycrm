package com.avito.android.extended_profile_phone_dialog.deep_linking;

import android.os.Bundle;
import com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedProfilePhoneRequestLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f151588l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfilePhoneRequestLink f151589m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Bundle f151590n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, ExtendedProfilePhoneRequestLink extendedProfilePhoneRequestLink, Bundle bundle) {
        super(0);
        this.f151588l = dVar;
        this.f151589m = extendedProfilePhoneRequestLink;
        this.f151590n = bundle;
    }

    @Override // Y41.a
    public final G0 invoke() {
        int i12 = d.f151566n;
        this.f151588l.k(this.f151589m, this.f151590n);
        return G0.f406611a;
    }
}
