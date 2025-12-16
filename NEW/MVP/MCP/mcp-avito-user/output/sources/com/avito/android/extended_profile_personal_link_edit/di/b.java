package com.avito.android.extended_profile_personal_link_edit.di;

import Y41.l;
import Y61.k;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditConfig;
import com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditFragment;
import com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditScreen;
import h31.d;
import kotlin.Metadata;

/* compiled from: PersonalLinkEditComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/di/b;", "", "a", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: PersonalLinkEditComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/di/b$a;", "", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k PersonalLinkEditConfig personalLinkEditConfig, @k c cVar, @h31.b @k r rVar, @h31.b @k PersonalLinkEditScreen personalLinkEditScreen, @h31.b @k l lVar, @h31.b boolean z12);
    }

    void a(@k PersonalLinkEditFragment personalLinkEditFragment);
}
