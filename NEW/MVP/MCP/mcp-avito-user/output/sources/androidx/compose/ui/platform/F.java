package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.Metadata;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/F;", "Landroid/view/translation/ViewTranslationCallback;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
final class F implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final F f41110a = new F();

    public final boolean onClearTranslation(@Y61.k View view) {
        ((AndroidComposeView) view).getContentCaptureManager().g();
        return true;
    }

    public final boolean onHideTranslation(@Y61.k View view) {
        ((AndroidComposeView) view).getContentCaptureManager().i();
        return true;
    }

    public final boolean onShowTranslation(@Y61.k View view) {
        ((AndroidComposeView) view).getContentCaptureManager().j();
        return true;
    }
}
