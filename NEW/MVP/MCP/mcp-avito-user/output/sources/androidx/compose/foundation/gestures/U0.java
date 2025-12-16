package androidx.compose.foundation.gestures;

import com.akita.compose.component.bottom_sheet.SheetValue;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: AnchoredDraggable.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/U0;", "T", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U0<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f27497a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public float[] f27498b;

    public U0() {
        float[] fArr = new float[5];
        for (int i12 = 0; i12 < 5; i12++) {
            fArr[i12] = Float.NaN;
        }
        this.f27498b = fArr;
    }

    public final void a(SheetValue sheetValue, float f12) {
        ArrayList arrayList = this.f27497a;
        arrayList.add(sheetValue);
        if (this.f27498b.length < arrayList.size()) {
            this.f27498b = Arrays.copyOf(this.f27498b, arrayList.size() + 2);
        }
        this.f27498b[arrayList.size() - 1] = f12;
    }
}
