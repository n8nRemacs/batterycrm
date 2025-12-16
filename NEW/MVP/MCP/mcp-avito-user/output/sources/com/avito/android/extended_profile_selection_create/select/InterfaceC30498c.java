package com.avito.android.extended_profile_selection_create.select;

import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateInternalAction;
import com.avito.android.remote.model.SearchParams;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ExtendedProfileSelectionCreateInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/c;", "", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile_selection_create.select.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC30498c {

    /* compiled from: ExtendedProfileSelectionCreateInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.extended_profile_selection_create.select.c$a */
    public static final class a {
        public static /* synthetic */ InterfaceC43160i a(InterfaceC30498c interfaceC30498c, int i12, SearchParams searchParams, int i13) {
            if ((i13 & 1) != 0) {
                i12 = 1;
            }
            return interfaceC30498c.c(i12, searchParams, (i13 & 4) == 0);
        }
    }

    @Y61.k
    InterfaceC43160i<ExtendedProfileSelectionCreateInternalAction> a(@Y61.k Set<Long> set, @Y61.l Long l12, @Y61.l String str);

    @Y61.k
    InterfaceC43160i<ExtendedProfileSelectionCreateInternalAction> b(@Y61.l Long l12);

    @Y61.k
    InterfaceC43160i<ExtendedProfileSelectionCreateInternalAction> c(int i12, @Y61.k SearchParams searchParams, boolean z12);
}
