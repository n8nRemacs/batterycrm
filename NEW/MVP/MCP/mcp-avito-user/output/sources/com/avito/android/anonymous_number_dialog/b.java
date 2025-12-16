package com.avito.android.anonymous_number_dialog;

import android.os.Bundle;
import kotlin.Metadata;

/* compiled from: AnonymousNumberDialogFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/anonymous_number_dialog/b;", "Lcom/avito/android/anonymous_number_dialog/a;", "<init>", "()V", "_avito_anonymous-number-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements a {
    @Override // com.avito.android.anonymous_number_dialog.a
    @Y61.k
    public final AnonymousNumberDialogFragment a(@Y61.k AnonymousNumberDialogArguments anonymousNumberDialogArguments) {
        AnonymousNumberDialogFragment.f91267f0.getClass();
        AnonymousNumberDialogFragment anonymousNumberDialogFragment = new AnonymousNumberDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("anonymous_number_arguments", anonymousNumberDialogArguments);
        anonymousNumberDialogFragment.setArguments(bundle);
        return anonymousNumberDialogFragment;
    }
}
