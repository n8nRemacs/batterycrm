package androidx.compose.material;

import kotlin.Metadata;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/material/U8;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface U8 {
    @Y61.l
    String a();

    void b();

    void dismiss();

    @Y61.k
    SnackbarDuration getDuration();

    @Y61.k
    String getMessage();
}
