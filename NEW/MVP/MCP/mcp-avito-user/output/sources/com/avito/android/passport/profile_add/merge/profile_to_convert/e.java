package com.avito.android.passport.profile_add.merge.profile_to_convert;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.passport.profile_add.merge.profile_to_convert.ProfileToConvertFragment;
import e60.InterfaceC39956a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileToConvertFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ProfileToConvertFragment f213129l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ProfileToConvertFragment profileToConvertFragment) {
        super(1);
        this.f213129l = profileToConvertFragment;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        ProfileToConvertFragment.a aVar = ProfileToConvertFragment.f213078w0;
        this.f213129l.q5().accept(new InterfaceC39956a.b(deepLink));
        return G0.f406611a;
    }
}
