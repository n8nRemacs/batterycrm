package androidx.compose.material3;

import androidx.compose.ui.unit.h;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: TimePicker.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0007²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"", "touchExplorationServicesEnabled", "Landroidx/compose/ui/text/input/W;", "hourValue", "minuteValue", "Ll0/g;", "center", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Ok {

    /* renamed from: a, reason: collision with root package name */
    public static final float f35270a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f35271b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f35272c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<Integer> f35273d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final List<Integer> f35274e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final ArrayList f35275f;

    static {
        float f12 = UpdateStatusCode.DialogButton.CONFIRM;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f35270a = f12;
        f35271b = 69;
        f35272c = 74;
        f35273d = C42745f0.U(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
        List<Integer> listU = C42745f0.U(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        f35274e = listU;
        ArrayList arrayList = new ArrayList(listU.size());
        int size = listU.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(Integer.valueOf((listU.get(i12).intValue() % 12) + 12));
        }
        f35275f = arrayList;
    }

    public static final kotlin.Q a(float f12, float f13) {
        if (Math.abs(f12 - f13) <= 3.141592653589793d) {
            return new kotlin.Q(Float.valueOf(f12), Float.valueOf(f13));
        }
        double d12 = f12;
        if (d12 > 3.141592653589793d && f13 < 3.141592653589793d) {
            f13 += 6.2831855f;
        } else if (d12 < 3.141592653589793d && f13 > 3.141592653589793d) {
            f12 += 6.2831855f;
        }
        return new kotlin.Q(Float.valueOf(f12), Float.valueOf(f13));
    }
}
