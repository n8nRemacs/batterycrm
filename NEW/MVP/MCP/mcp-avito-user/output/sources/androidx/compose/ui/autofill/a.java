package androidx.compose.ui.autofill;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.AndroidComposeView;
import j.X;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidAutofill.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/autofill/a;", "Landroidx/compose/ui/autofill/k;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AndroidComposeView f38866a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final s f38867b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AutofillManager f38868c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AutofillId f38869d;

    public a(@Y61.k AndroidComposeView androidComposeView, @Y61.k s sVar) {
        this.f38866a = androidComposeView;
        this.f38867b = sVar;
        AutofillManager autofillManager = (AutofillManager) androidComposeView.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f38868c = autofillManager;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw H.s("Required value was null.");
        }
        this.f38869d = autofillId;
    }
}
