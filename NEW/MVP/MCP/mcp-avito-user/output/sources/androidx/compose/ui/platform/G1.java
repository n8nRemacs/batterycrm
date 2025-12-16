package androidx.compose.ui.platform;

import android.view.MotionEvent;
import j.InterfaceC42164u;
import kotlin.Metadata;

/* compiled from: AndroidComposeView.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/G1;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "", "index", "", "a", "(Landroid/view/MotionEvent;I)Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
final class G1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final G1 f41117a = new G1();

    @InterfaceC42164u
    public final boolean a(@Y61.k MotionEvent event, int index) {
        return (Float.floatToRawIntBits(event.getRawX(index)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(event.getRawY(index)) & Integer.MAX_VALUE) < 2139095040;
    }
}
