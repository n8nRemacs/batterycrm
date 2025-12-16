package com.avito.android.extended_profile_selection_create.image.di;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageConfig;
import com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageFragment;
import com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageScreen;
import h31.d;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Z1;

/* compiled from: ExtendedProfileSetSelectionImageComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/di/b;", "", "a", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: ExtendedProfileSetSelectionImageComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/di/b$a;", "", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment, @h31.b @k Resources resources, @h31.b @k ExtendedProfileSetSelectionImageConfig extendedProfileSetSelectionImageConfig, @h31.b @k Z1 z12, @k com.avito.android.extended_profile_selection_create.select.di.c cVar, @h31.b @k r rVar, @h31.b @k ExtendedProfileSetSelectionImageScreen extendedProfileSetSelectionImageScreen, @h31.b @k ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment2, @h31.b @k l lVar);
    }

    void a(@k ExtendedProfileSetSelectionImageFragment extendedProfileSetSelectionImageFragment);
}
