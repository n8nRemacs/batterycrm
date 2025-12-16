package com.avito.android.extended_profile_serp;

import com.avito.android.extended_profile_serp.ExtendedProfileSerpFragment;
import com.avito.android.extended_profile_serp.deep_linking.ExtendedProfileSerpStartMode;
import com.avito.android.remote.model.SearchParams;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSerpFragmentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_serp/g;", "Lcom/avito/android/extended_profile_serp/f;", "<init>", "()V", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile_serp.g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30544g implements InterfaceC30543f {
    @Inject
    public C30544g() {
    }

    @Override // com.avito.android.extended_profile_serp.InterfaceC30543f
    @Y61.k
    public final ExtendedProfileSerpFragment a(@Y61.k String str, @Y61.l String str2, @Y61.k SearchParams searchParams, @Y61.l String str3, boolean z12, @Y61.k ExtendedProfileSerpStartMode extendedProfileSerpStartMode) {
        ExtendedProfileSerpFragment.a aVar = ExtendedProfileSerpFragment.f152448e1;
        ExtendedProfileSerpConfig extendedProfileSerpConfig = new ExtendedProfileSerpConfig(str, str2, searchParams, str3, z12, extendedProfileSerpStartMode);
        aVar.getClass();
        return ExtendedProfileSerpFragment.a.a(extendedProfileSerpConfig);
    }
}
