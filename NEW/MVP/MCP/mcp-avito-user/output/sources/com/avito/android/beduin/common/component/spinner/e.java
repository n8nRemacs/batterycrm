package com.avito.android.beduin.common.component.spinner;

import Y61.k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.lib.design.spinner.Spinner;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSpinnerLayout.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/common/component/spinner/e;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/lib/design/spinner/Spinner;", "b", "Lcom/avito/android/lib/design/spinner/Spinner;", "getSpinner", "()Lcom/avito/android/lib/design/spinner/Spinner;", "spinner", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends FrameLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public final Spinner spinner;

    public e(@k Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.beduin_component_spinner, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.beduin_spinner);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.spinner = (Spinner) viewFindViewById;
    }

    @k
    public final Spinner getSpinner() {
        return this.spinner;
    }
}
