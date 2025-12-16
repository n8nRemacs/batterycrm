package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.AndroidComposeView;
import j.X;
import kotlin.Metadata;

/* compiled from: PlatformAutofillManager.android.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/autofill/y;", "Landroidx/compose/ui/autofill/x;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class y implements x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AutofillManager f38939a;

    public y(@Y61.k AutofillManager autofillManager) {
        this.f38939a = autofillManager;
    }

    public final void a(@Y61.k AndroidComposeView androidComposeView, int i12, @Y61.k Rect rect) {
        this.f38939a.notifyViewEntered(androidComposeView, i12, rect);
    }

    public final void b(@Y61.k AndroidComposeView androidComposeView, int i12) {
        this.f38939a.notifyViewExited(androidComposeView, i12);
    }

    public final void c(@Y61.k View view, int i12, boolean z12) {
        m.f38889a.getClass();
        this.f38939a.notifyViewVisibilityChanged(view, i12, z12);
    }
}
