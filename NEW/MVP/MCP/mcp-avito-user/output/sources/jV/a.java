package JV;

import Y61.k;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.design.toggle.State;
import kotlin.Metadata;

/* compiled from: Checkbox.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: JV.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0528a {
        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                State state = State.f181147b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                State state2 = State.f181147b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(@k Checkbox checkbox, @k State state) {
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            checkbox.setChecked(true);
            checkbox.setIndeterminate(false);
        } else if (iOrdinal == 1) {
            checkbox.setChecked(false);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            checkbox.setChecked(true);
            checkbox.setIndeterminate(true);
        }
    }
}
