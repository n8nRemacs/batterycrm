package androidx.compose.ui.platform;

import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.u;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;

/* compiled from: WindowInfo.kt */
@F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/F2;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface F2 {
    boolean a();

    default long b() {
        long j12 = BeduinInputModel.MIN_TEXT_VERSION;
        long j13 = (j12 & 4294967295L) | (j12 << 32);
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        return j13;
    }
}
