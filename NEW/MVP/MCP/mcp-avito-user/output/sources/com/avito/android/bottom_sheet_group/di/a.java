package com.avito.android.bottom_sheet_group.di;

import android.content.res.Resources;
import com.avito.android.bottom_sheet_group.BottomSheetGroupFragment;
import com.avito.android.bottom_sheet_group.BottomSheetGroupParameterWrapper;
import com.avito.android.di.B;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;
import h31.d;
import kotlin.Metadata;

/* compiled from: BottomSheetGroupComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bottom_sheet_group/di/a;", "", "a", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes11.dex */
public interface a {

    /* compiled from: BottomSheetGroupComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_sheet_group/di/a$a;", "", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bottom_sheet_group.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC3206a {
        @Y61.k
        InterfaceC3206a a(@Y61.k b bVar);

        @h31.b
        @Y61.k
        InterfaceC3206a b(@Y61.k Resources resources);

        @Y61.k
        a build();

        @h31.b
        @Y61.k
        InterfaceC3206a d(@Y61.k BottomSheetGroupParameter bottomSheetGroupParameter);

        @h31.b
        @Y61.k
        InterfaceC3206a e(@Y61.l BottomSheetGroupParameterWrapper.ParameterState parameterState);
    }

    void a(@Y61.k BottomSheetGroupFragment bottomSheetGroupFragment);
}
