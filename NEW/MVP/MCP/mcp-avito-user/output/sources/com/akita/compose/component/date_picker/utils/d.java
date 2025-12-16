package com.akita.compose.component.date_picker.utils;

import Y41.p;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.saveable.x;
import com.akita.compose.component.date_picker.utils.f;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: DatePickerDatesValidator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Lcom/akita/compose/component/date_picker/utils/f;", VoiceInfo.STATE, "", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Lcom/akita/compose/component/date_picker/utils/f;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements p<x, f, List<? extends Object>> {
    static {
        new d();
    }

    public d() {
        super(2);
    }

    @Override // Y41.p
    public final List<? extends Object> invoke(x xVar, f fVar) {
        f fVar2 = fVar;
        f.a aVar = f.f61416g;
        Set set = (Set) ((C22082i3) fVar2.f61418b).getF42167b();
        Set set2 = (Set) ((C22082i3) fVar2.f61419c).getF42167b();
        Long l12 = (Long) ((C22082i3) fVar2.f61422f).getF42167b();
        Long l13 = (Long) ((C22082i3) fVar2.f61421e).getF42167b();
        DisableDatesOption disableDatesOption = fVar2.f61417a;
        return C42745f0.U(set, set2, l12, l13, disableDatesOption != null ? disableDatesOption.name() : null);
    }
}
