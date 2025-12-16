package com.avito.android.service_booking_utils.events;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* compiled from: WorkHoursSaveClickEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_utils/events/WorkHoursSaveClickEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "SaveDialogActionType", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkHoursSaveClickEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f278370b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WorkHoursSaveClickEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_utils/events/WorkHoursSaveClickEvent$SaveDialogActionType;", "", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SaveDialogActionType {

        /* renamed from: c, reason: collision with root package name */
        public static final SaveDialogActionType f278371c;

        /* renamed from: d, reason: collision with root package name */
        public static final SaveDialogActionType f278372d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ SaveDialogActionType[] f278373e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f278374f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278375b;

        static {
            SaveDialogActionType saveDialogActionType = new SaveDialogActionType("YES", 0, "yes");
            f278371c = saveDialogActionType;
            SaveDialogActionType saveDialogActionType2 = new SaveDialogActionType("NO", 1, "no");
            f278372d = saveDialogActionType2;
            SaveDialogActionType[] saveDialogActionTypeArr = {saveDialogActionType, saveDialogActionType2};
            f278373e = saveDialogActionTypeArr;
            f278374f = c.a(saveDialogActionTypeArr);
        }

        public SaveDialogActionType(String str, int i12, String str2) {
            this.f278375b = str2;
        }

        public static SaveDialogActionType valueOf(String str) {
            return (SaveDialogActionType) Enum.valueOf(SaveDialogActionType.class, str);
        }

        public static SaveDialogActionType[] values() {
            return (SaveDialogActionType[]) f278373e.clone();
        }
    }

    public WorkHoursSaveClickEvent(@k String str, @k String str2) {
        this.f278370b = new ParametrizedClickStreamEvent(7347, 2, P0.g(new Q("from_page", str), new Q("action_type", str2)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f278370b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f278370b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f278370b.f90248c;
    }

    public /* synthetic */ WorkHoursSaveClickEvent(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? "Выбрать" : str2);
    }
}
