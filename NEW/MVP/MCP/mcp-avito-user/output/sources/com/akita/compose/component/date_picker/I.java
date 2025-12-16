package com.akita.compose.component.date_picker;

import androidx.compose.runtime.C22082i3;
import com.akita.compose.component.date_picker.data.DatePickerSelectionType;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: StateData.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Lcom/akita/compose/component/date_picker/K;", VoiceInfo.STATE, "", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Lcom/akita/compose/component/date_picker/K;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class I extends N implements Y41.p<androidx.compose.runtime.saveable.x, K, List<? extends Object>> {

    /* renamed from: l, reason: collision with root package name */
    public static final I f61167l = new I();

    public I() {
        super(2);
    }

    @Override // Y41.p
    public final List<? extends Object> invoke(androidx.compose.runtime.saveable.x xVar, K k12) {
        K k13 = k12;
        List<kotlin.ranges.o> listC = k13.c();
        Long lValueOf = Long.valueOf(((P2.b) ((C22082i3) k13.f61184o).getF42167b()).f12791f);
        Boolean boolValueOf = Boolean.valueOf(k13.f61171b);
        Boolean boolValueOf2 = Boolean.valueOf(k13.f61172c);
        Boolean bool = (Boolean) ((C22082i3) k13.f61178i).getF42167b();
        bool.booleanValue();
        DatePickerSelectionType datePickerSelectionType = k13.f61173d;
        String strName = datePickerSelectionType.getF61208b().name();
        DatePickerSelectionType.a aVar = datePickerSelectionType instanceof DatePickerSelectionType.a ? (DatePickerSelectionType.a) datePickerSelectionType : null;
        return C42745f0.U(listC, lValueOf, boolValueOf, boolValueOf2, bool, strName, aVar != null ? aVar.f61207a : null, k13.f61174e, Integer.valueOf(k13.f61175f), Boolean.valueOf(k13.f61176g));
    }
}
