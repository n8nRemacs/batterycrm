package com.avito.android.select;

import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.SortDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectParameterLocalSorter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "o1", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "kotlin.jvm.PlatformType", "o2", "invoke", "(Lcom/avito/android/remote/model/ParcelableEntity;Lcom/avito/android/remote/model/ParcelableEntity;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class r extends N implements Y41.p<ParcelableEntity<String>, ParcelableEntity<String>, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SortDirection f266317l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(SortDirection sortDirection) {
        super(2);
        this.f266317l = sortDirection;
    }

    @Override // Y41.p
    public final Integer invoke(ParcelableEntity<String> parcelableEntity, ParcelableEntity<String> parcelableEntity2) {
        String str;
        String sortParam;
        int iCompareTo;
        String sortParam2;
        SelectParameter.Value.Widget.Config config;
        SelectParameter.Value.Widget.Config.Displaying displaying;
        SelectParameter.Value.Widget.Config config2;
        SelectParameter.Value.Widget.Config.Displaying displaying2;
        String sortParam3;
        ParcelableEntity<String> parcelableEntity3 = parcelableEntity;
        ParcelableEntity<String> parcelableEntity4 = parcelableEntity2;
        String sortParam4 = null;
        if ((parcelableEntity3 instanceof SelectParameter.Value) && (parcelableEntity4 instanceof SelectParameter.Value)) {
            SelectParameter.Value value = (SelectParameter.Value) parcelableEntity3;
            SelectParameter.Value.Display display = value.getDisplay();
            if (display == null || (sortParam2 = display.getSortParam()) == null) {
                SelectParameter.Value.Widget widget = value.getWidget();
                sortParam2 = (widget == null || (config = widget.getConfig()) == null || (displaying = config.getDisplaying()) == null) ? null : displaying.getSortParam();
            }
            SelectParameter.Value value2 = (SelectParameter.Value) parcelableEntity4;
            SelectParameter.Value.Display display2 = value2.getDisplay();
            if (display2 == null || (sortParam3 = display2.getSortParam()) == null) {
                SelectParameter.Value.Widget widget2 = value2.getWidget();
                if (widget2 != null && (config2 = widget2.getConfig()) != null && (displaying2 = config2.getDisplaying()) != null) {
                    sortParam4 = displaying2.getSortParam();
                }
            } else {
                sortParam4 = sortParam3;
            }
            str = sortParam4;
            sortParam4 = sortParam2;
        } else {
            if ((parcelableEntity3 instanceof MultiselectParameter.Value) && (parcelableEntity4 instanceof MultiselectParameter.Value)) {
                MultiselectParameter.Value.Display display3 = ((MultiselectParameter.Value) parcelableEntity3).getDisplay();
                sortParam = display3 != null ? display3.getSortParam() : null;
                MultiselectParameter.Value.Display display4 = ((MultiselectParameter.Value) parcelableEntity4).getDisplay();
                if (display4 != null) {
                    sortParam4 = display4.getSortParam();
                }
            } else if ((parcelableEntity3 instanceof SectionedMultiselectParameter.Value) && (parcelableEntity4 instanceof SectionedMultiselectParameter.Value)) {
                SectionedMultiselectParameter.Display display5 = ((SectionedMultiselectParameter.Value) parcelableEntity3).getDisplay();
                sortParam = display5 != null ? display5.getSortParam() : null;
                SectionedMultiselectParameter.Display display6 = ((SectionedMultiselectParameter.Value) parcelableEntity4).getDisplay();
                if (display6 != null) {
                    sortParam4 = display6.getSortParam();
                }
            } else {
                str = null;
            }
            String str2 = sortParam4;
            sortParam4 = sortParam;
            str = str2;
        }
        if (sortParam4 == null || sortParam4.length() == 0 || str == null || str.length() == 0) {
            iCompareTo = 0;
        } else {
            iCompareTo = sortParam4.compareTo(str);
            if (this.f266317l == SortDirection.Descending) {
                iCompareTo *= -1;
            }
        }
        return Integer.valueOf(iCompareTo);
    }
}
