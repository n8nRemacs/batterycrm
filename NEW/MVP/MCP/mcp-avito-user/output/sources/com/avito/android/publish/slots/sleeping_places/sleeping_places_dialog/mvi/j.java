package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesBedType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import wf0.C49618c;

/* compiled from: SleepingPlacesSelectorViewStateBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/j;", "Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/i;", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements i {

    /* compiled from: SleepingPlacesSelectorViewStateBuilder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/mvi/j$a;", "", "<init>", "()V", "", "SUBTITLE_ITEM_ID", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.mvi.i
    @k
    public final C49618c a(@k C49618c c49618c) {
        ArrayList arrayList = new ArrayList();
        String str = c49618c.f441728c;
        if (str != null) {
            arrayList.add(new com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.subtitle.a(str));
        }
        for (SleepingPlacesBedType sleepingPlacesBedType : c49618c.f441729d) {
            int id2 = sleepingPlacesBedType.getId();
            Integer num = c49618c.f441727b;
            boolean z12 = num != null && num.intValue() == id2;
            arrayList.add(new com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type.a(String.valueOf(sleepingPlacesBedType.getId()), sleepingPlacesBedType.getId(), sleepingPlacesBedType.getTitle(), sleepingPlacesBedType.getSubtitle(), z12 ? sleepingPlacesBedType.getActiveIcon() : sleepingPlacesBedType.getDefaultIcon(), z12));
        }
        List listM0 = C42745f0.M0(arrayList);
        c49618c.f441731f.getClass();
        return C49618c.a(c49618c, null, null, null, false, new wf0.d(listM0, c49618c.f441730e), 15);
    }
}
