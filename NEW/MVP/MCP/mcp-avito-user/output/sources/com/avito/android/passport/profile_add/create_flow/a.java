package com.avito.android.passport.profile_add.create_flow;

import android.os.Bundle;
import com.avito.android.deep_linking.links.ProfileCreateExtendedLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileCreateExtendedAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f211338l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ProfileCreateExtendedLink f211339m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Bundle f211340n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ProfileCreateExtendedLink profileCreateExtendedLink, Bundle bundle) {
        super(0);
        this.f211338l = bVar;
        this.f211339m = profileCreateExtendedLink;
        this.f211340n = bundle;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f211338l.k(this.f211339m, this.f211340n);
        return G0.f406611a;
    }
}
