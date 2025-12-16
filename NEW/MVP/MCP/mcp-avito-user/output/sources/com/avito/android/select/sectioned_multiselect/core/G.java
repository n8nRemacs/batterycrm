package com.avito.android.select.sectioned_multiselect.core;

import com.avito.android.lib.design.input.Input;
import com.avito.android.util.K2;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectDialogPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class G<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34656f f266472b;

    public G(C34656f c34656f) {
        this.f266472b = c34656f;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Input input = this.f266472b.f266650k;
        if (input != null) {
            Input.t(input, "", false, 6);
            K2.d(input, true);
            input.clearFocus();
        }
    }
}
