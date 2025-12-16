package ue;

import Y61.k;
import android.text.Editable;
import android.text.Selection;
import com.avito.android.util.AbstractC35956u5;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: VehicleRegNumberRegionTextWatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lue/e;", "Lcom/avito/android/util/u5;", "<init>", "()V", "_avito_formatters-provider_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends AbstractC35956u5 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f440202b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f440203c;

    @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
    public final void afterTextChanged(@k Editable editable) {
        this.f440202b = true;
        int length = editable.length();
        if (length != 0) {
            if (length != 1) {
                if (length != 2 && C43066x.i0(editable, "0")) {
                    CharSequence charSequenceT = C43066x.T(editable, "0");
                    editable.clear();
                    editable.append(charSequenceT);
                }
            } else if (!L.f(editable.toString(), "0")) {
                editable.insert(0, "0");
                if (this.f440203c) {
                    Selection.setSelection(editable, 2);
                }
            } else if (this.f440203c) {
                editable.clear();
            }
        }
        this.f440202b = false;
    }

    @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
    public final void beforeTextChanged(@k CharSequence charSequence, int i12, int i13, int i14) {
        if (this.f440202b) {
            return;
        }
        this.f440203c = i13 > i14;
    }
}
