package com.avito.android.bottom_sheet_group.di;

import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.bottom_sheet_group.bottomsheetgroup.BottomSheetGroupMviFragment;
import com.avito.android.di.B;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;
import h31.d;
import kotlin.Metadata;

/* compiled from: BottomSheetGroupMviComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bottom_sheet_group/di/p;", "", "a", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes11.dex */
public interface p {

    /* compiled from: BottomSheetGroupMviComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_sheet_group/di/p$a;", "", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        a a(@Y61.k b bVar);

        @h31.b
        @Y61.k
        a b(@Y61.k Resources resources);

        @Y61.k
        p build();

        @h31.b
        @Y61.k
        a c(@Y61.k C28478k c28478k);

        @h31.b
        @Y61.k
        a d(@Y61.k BottomSheetGroupParameter bottomSheetGroupParameter);
    }

    void a(@Y61.k BottomSheetGroupMviFragment bottomSheetGroupMviFragment);
}
