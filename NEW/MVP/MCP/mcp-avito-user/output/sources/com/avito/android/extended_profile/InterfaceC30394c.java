package com.avito.android.extended_profile;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile.C30395d;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ExtendedProfileDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/c;", "", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC30394c {

    /* compiled from: ExtendedProfileDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.extended_profile.c$a */
    public static final class a {
        public static /* synthetic */ InterfaceC43160i a(InterfaceC30394c interfaceC30394c, com.avito.android.extended_profile.mvi.entity.a aVar, DeepLink deepLink, int i12) {
            if ((i12 & 1) != 0) {
                aVar = null;
            }
            return interfaceC30394c.c(aVar, deepLink, null);
        }
    }

    @Y61.k
    /* renamed from: a */
    C30395d.c getF149445k();

    @Y61.k
    InterfaceC43160i<ExtendedProfileInternalAction> b(@Y61.k AdvertItem advertItem);

    @Y61.k
    InterfaceC43160i<ExtendedProfileInternalAction> c(@Y61.l com.avito.android.extended_profile.mvi.entity.a aVar, @Y61.k DeepLink deepLink, @Y61.l Bundle bundle);

    void h(@Y61.k String str);
}
