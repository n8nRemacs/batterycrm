package com.avito.android.extended_profile.search;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile.mvi.entity.a;
import com.avito.android.extended_profile_serp.deep_linking.ExtendedProfileSerpStartMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ExtendedProfileSearchInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/search/d;", "", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface d {

    /* compiled from: ExtendedProfileSearchInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ InterfaceC43160i a(d dVar, DeepLink deepLink, String str, String str2, ExtendedProfileSerpStartMode extendedProfileSerpStartMode, int i12) {
            if ((i12 & 4) != 0) {
                str2 = null;
            }
            if ((i12 & 8) != 0) {
                extendedProfileSerpStartMode = ExtendedProfileSerpStartMode.f152656b;
            }
            return dVar.b(deepLink, str, str2, extendedProfileSerpStartMode);
        }
    }

    @Y61.k
    C43152f0 a(@Y61.k a.C4397a c4397a);

    @Y61.k
    InterfaceC43160i<ExtendedProfileInternalAction> b(@Y61.k DeepLink deepLink, @Y61.k String str, @Y61.l String str2, @Y61.k ExtendedProfileSerpStartMode extendedProfileSerpStartMode);

    @Y61.k
    C43152f0 c(@Y61.k a.C4397a c4397a, boolean z12);
}
