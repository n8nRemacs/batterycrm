package androidx.compose.ui.text.android;

import android.text.Layout;
import kotlin.Metadata;

/* compiled from: TextLayout.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/android/K;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final K f41979a = new K();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Layout.Alignment f41980b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Layout.Alignment f41981c;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (kotlin.jvm.internal.L.f(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (kotlin.jvm.internal.L.f(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f41980b = alignment;
        f41981c = alignment2;
    }
}
