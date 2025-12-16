package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: Strings.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B9 {
    @InterfaceC22132o
    @Y61.k
    public static final String a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        a12.o(AndroidCompositionLocals_androidKt.f41068a);
        Resources resources = ((Context) a12.o(AndroidCompositionLocals_androidKt.f41069b)).getResources();
        A9.f32353b.getClass();
        return A9.a(i12, 0) ? resources.getString(R.string.navigation_menu) : A9.a(i12, A9.f32354c) ? resources.getString(R.string.close_drawer) : A9.a(i12, A9.f32355d) ? resources.getString(R.string.close_sheet) : A9.a(i12, A9.f32356e) ? resources.getString(R.string.default_error_message) : A9.a(i12, A9.f32357f) ? resources.getString(R.string.dropdown_menu) : A9.a(i12, A9.f32358g) ? resources.getString(R.string.range_start) : A9.a(i12, A9.f32359h) ? resources.getString(R.string.range_end) : A9.a(i12, A9.f32360i) ? resources.getString(R.string.mc2_snackbar_pane_title) : "";
    }
}
