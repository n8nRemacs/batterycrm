package com.avito.android.extended_profile_serp;

import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpInternalAction;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ExtendedProfileSerpInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/o;", "", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile_serp.o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC30552o {

    /* compiled from: ExtendedProfileSerpInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.extended_profile_serp.o$a */
    public static final class a {
        public static /* synthetic */ InterfaceC43160i a(InterfaceC30552o interfaceC30552o, int i12, SearchParams searchParams, C30558v c30558v, int i13) {
            if ((i13 & 1) != 0) {
                i12 = 1;
            }
            return interfaceC30552o.a(i12, searchParams, (i13 & 4) == 0, c30558v);
        }
    }

    @Y61.k
    InterfaceC43160i<ExtendedProfileSerpInternalAction> a(int i12, @Y61.k SearchParams searchParams, boolean z12, @Y61.l C30558v c30558v);
}
