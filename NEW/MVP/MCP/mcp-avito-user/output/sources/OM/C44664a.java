package oM;

import Y61.k;
import com.avito.android.iac_problems.public_module.models.IacProblem;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: IacProblem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-problems_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: oM.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C44664a {

    /* compiled from: IacProblem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oM.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C12183a {
        static {
            int[] iArr = new int[IacProblem.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IacProblem iacProblem = IacProblem.f169089b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IacProblem iacProblem2 = IacProblem.f169089b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IacProblem iacProblem3 = IacProblem.f169089b;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                IacProblem iacProblem4 = IacProblem.f169089b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                IacProblem iacProblem5 = IacProblem.f169089b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                IacProblem iacProblem6 = IacProblem.f169089b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @k
    public static final LinkedHashMap a(@k List list) {
        String str;
        IacProblem[] iacProblemArrValues = IacProblem.values();
        int iF2 = P0.f(iacProblemArrValues.length);
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (IacProblem iacProblem : iacProblemArrValues) {
            linkedHashMap.put(iacProblem, Boolean.valueOf(list.contains(iacProblem)));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            switch (((IacProblem) entry.getKey()).ordinal()) {
                case 0:
                    str = "is_iac_enabled";
                    break;
                case 1:
                    str = "appcall_system_notifications";
                    break;
                case 2:
                    str = "android_avito_system_settings_notifications_channel_incoming_calls_v2";
                    break;
                case 3:
                    str = "mic_access";
                    break;
                case 4:
                    str = "android_avito_app_battery_optimization";
                    break;
                case 5:
                    str = "android_avito_system_settings_background_battery_usage_restriction";
                    break;
                case 6:
                    str = "android_avito_miui_notifications_disabled_on_locked_screen";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            linkedHashMap2.put(str, entry.getValue());
        }
        return new LinkedHashMap(linkedHashMap2);
    }
}
