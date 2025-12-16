package com.avito.android.profile.remove;

import K90.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.remove.confirm.ProfileRemoveConfirmDialogParams;
import com.avito.android.profile.remove.confirm.ProfileRemoveConfirmFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileRemoveActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ProfileRemoveActivity f223769l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K90.b f223770m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ProfileRemoveActivity profileRemoveActivity, K90.b bVar) {
        super(0);
        this.f223769l = profileRemoveActivity;
        this.f223770m = bVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ProfileRemoveConfirmFragment.a aVar = ProfileRemoveConfirmFragment.f223786x0;
        ProfileRemoveConfirmDialogParams profileRemoveConfirmDialogParams = ((b.c) this.f223770m).f9289a;
        DeepLink deepLink = profileRemoveConfirmDialogParams != null ? profileRemoveConfirmDialogParams.f223785f : null;
        aVar.getClass();
        ProfileRemoveConfirmFragment profileRemoveConfirmFragmentA = ProfileRemoveConfirmFragment.a.a(deepLink);
        int i12 = ProfileRemoveActivity.f223757s;
        this.f223769l.a2(profileRemoveConfirmFragmentA, null);
        return G0.f406611a;
    }
}
