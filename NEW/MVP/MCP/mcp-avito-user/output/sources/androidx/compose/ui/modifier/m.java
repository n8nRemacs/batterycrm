package androidx.compose.ui.modifier;

import androidx.compose.runtime.F3;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: ModifierLocalProvider.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/modifier/m;", "T", "Landroidx/compose/ui/v$c;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface m<T> extends v.c {

    /* compiled from: ModifierLocalProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    s<T> getKey();

    T getValue();
}
