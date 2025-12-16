package com.avito.android.select.bottom_sheet.di;

import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.content.res.Resources;
import aq0.InterfaceC23653b;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.select.Arguments;
import com.avito.android.select.SelectSignificantState;
import com.avito.android.select.bottom_sheet.SelectBottomSheetMviFragment;
import cv.InterfaceC39417a;
import dq0.InterfaceC39781c;
import h31.d;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectBottomSheetComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/bottom_sheet/di/b;", "", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: SelectBottomSheetComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/di/b$a;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        a a(@Y61.k InterfaceC39417a interfaceC39417a);

        @h31.b
        @Y61.k
        a b(@Y61.k Resources resources);

        @Y61.k
        b build();

        @h31.b
        @Y61.k
        a c(@Y61.k C28478k c28478k);

        @Y61.k
        a d(@Y61.k InterfaceC23653b interfaceC23653b);

        @h31.b
        @Y61.k
        a e(@Y61.l InterfaceC19588c<? super InterfaceC19587b> interfaceC19588c);

        @h31.b
        @Y61.k
        a f(@Y61.l Y41.l<? super InterfaceC39781c, G0> lVar);

        @h31.b
        @Y61.k
        a g(@Y61.l SelectSignificantState selectSignificantState);

        @h31.b
        @Y61.k
        a h(@Y61.k Arguments arguments);
    }

    void a(@Y61.k SelectBottomSheetMviFragment selectBottomSheetMviFragment);
}
