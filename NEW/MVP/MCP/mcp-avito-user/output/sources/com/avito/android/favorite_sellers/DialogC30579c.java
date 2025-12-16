package com.avito.android.favorite_sellers;

import android.view.View;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetMenu.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/c;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "Lcom/avito/android/favorite_sellers/b;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorite_sellers.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class DialogC30579c extends com.avito.android.lib.design.bottom_sheet.d implements InterfaceC30578b {
    @Override // com.avito.android.lib.design.bottom_sheet.d, android.app.Dialog
    public final void show() {
        int i12 = C35835l0.i(getContext()).heightPixels / 2;
        View.MeasureSpec.makeMeasureSpec(C35835l0.i(getContext()).widthPixels, BeduinInputModel.MIN_TEXT_VERSION);
        View.MeasureSpec.makeMeasureSpec(i12, BeduinInputModel.MIN_TEXT_VERSION);
        throw null;
    }
}
