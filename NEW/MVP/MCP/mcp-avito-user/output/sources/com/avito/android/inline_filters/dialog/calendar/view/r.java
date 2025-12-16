package com.avito.android.inline_filters.dialog.calendar.view;

import com.avito.android.R;
import com.avito.android.inline_filters.dialog.calendar.models.FlexDatesState;
import com.avito.android.lib.design.chips.state.ChipsState;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.lib.design.chips.ui.Chips;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: FiltersCalendarPickerView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/models/FlexDatesState;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/inline_filters/dialog/calendar/models/FlexDatesState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class r extends N implements Y41.l<FlexDatesState, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f171352l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l41.g<Integer> f171353m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w wVar, l41.g<Integer> gVar) {
        super(1);
        this.f171352l = wVar;
        this.f171353m = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(FlexDatesState flexDatesState) {
        ItemChipable itemChipable;
        FlexDatesState flexDatesState2 = flexDatesState;
        if (flexDatesState2 != null) {
            w wVar = this.f171352l;
            Chips chips = wVar.f171369l;
            chips.setState(new ChipsState(chips.getContext().getResources().getDimensionPixelSize(R.dimen.inline_filters_calendar_chips_horizontal_padding), ChipsState.DisplayType.f178758d, null, flexDatesState2.f171271b, new q(this.f171353m)));
            Integer num = flexDatesState2.f171274e;
            if (num != null && (itemChipable = (ItemChipable) C42745f0.K(num.intValue(), flexDatesState2.f171271b)) != null) {
                wVar.f171369l.N0(itemChipable);
            }
        }
        return G0.f406611a;
    }
}
