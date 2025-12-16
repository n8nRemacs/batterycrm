package androidx.compose.ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NullableInputConnectionWrapper.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K {
    @Y61.k
    public static final F a(@Y61.k InputConnection inputConnection, @Y61.k Y41.l<? super F, G0> lVar) {
        return Build.VERSION.SDK_INT >= 34 ? new J(inputConnection, lVar) : new I(inputConnection, lVar);
    }
}
