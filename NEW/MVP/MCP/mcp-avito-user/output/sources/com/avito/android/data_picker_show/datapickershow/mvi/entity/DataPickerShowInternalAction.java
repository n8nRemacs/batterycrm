package com.avito.android.data_picker_show.datapickershow.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.data_picker_show.DataPickerArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DataPickerShowInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/data_picker_show/datapickershow/mvi/entity/DataPickerShowInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Content", "WheelValueSelected", "Lcom/avito/android/data_picker_show/datapickershow/mvi/entity/DataPickerShowInternalAction$Close;", "Lcom/avito/android/data_picker_show/datapickershow/mvi/entity/DataPickerShowInternalAction$Content;", "Lcom/avito/android/data_picker_show/datapickershow/mvi/entity/DataPickerShowInternalAction$WheelValueSelected;", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DataPickerShowInternalAction extends n {

    /* compiled from: DataPickerShowInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/data_picker_show/datapickershow/mvi/entity/DataPickerShowInternalAction$Close;", "Lcom/avito/android/data_picker_show/datapickershow/mvi/entity/DataPickerShowInternalAction;", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements DataPickerShowInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final List<String> f132517b;

        public Close(@l List<String> list) {
            this.f132517b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Close) && L.f(this.f132517b, ((Close) obj).f132517b);
        }

        public final int hashCode() {
            List<String> list = this.f132517b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Close(preselected="), this.f132517b, ')');
        }
    }

    /* compiled from: DataPickerShowInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/data_picker_show/datapickershow/mvi/entity/DataPickerShowInternalAction$Content;", "Lcom/avito/android/data_picker_show/datapickershow/mvi/entity/DataPickerShowInternalAction;", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements DataPickerShowInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DataPickerArgs f132518b;

        public Content(@k DataPickerArgs dataPickerArgs) {
            this.f132518b = dataPickerArgs;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && L.f(this.f132518b, ((Content) obj).f132518b);
        }

        public final int hashCode() {
            return this.f132518b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(dataPickerArgs=" + this.f132518b + ')';
        }
    }

    /* compiled from: DataPickerShowInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/data_picker_show/datapickershow/mvi/entity/DataPickerShowInternalAction$WheelValueSelected;", "Lcom/avito/android/data_picker_show/datapickershow/mvi/entity/DataPickerShowInternalAction;", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WheelValueSelected implements DataPickerShowInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f132519b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f132520c;

        public WheelValueSelected(int i12, @k String str) {
            this.f132519b = i12;
            this.f132520c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WheelValueSelected)) {
                return false;
            }
            WheelValueSelected wheelValueSelected = (WheelValueSelected) obj;
            return this.f132519b == wheelValueSelected.f132519b && L.f(this.f132520c, wheelValueSelected.f132520c);
        }

        public final int hashCode() {
            return this.f132520c.hashCode() + (Integer.hashCode(this.f132519b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WheelValueSelected(wheelIndex=");
            sb2.append(this.f132519b);
            sb2.append(", selectedValue=");
            return C22026a.c(sb2, this.f132520c, ')');
        }
    }
}
