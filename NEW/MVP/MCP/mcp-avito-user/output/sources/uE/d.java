package ue;

import Y61.k;
import Y61.l;
import android.text.Editable;
import android.text.Selection;
import com.avito.android.util.AbstractC35956u5;
import com.avito.android.util.C35843m0;
import kotlin.Metadata;

/* compiled from: MasksFormatterTextWatcher.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lue/d;", "Lcom/avito/android/util/u5;", "_avito_formatters-provider_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends AbstractC35956u5 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C49042c f440197b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f440198c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f440199d;

    /* renamed from: e, reason: collision with root package name */
    public int f440200e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public String f440201f;

    public d(@k C49042c c49042c) {
        this.f440197b = c49042c;
    }

    @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
    public final void afterTextChanged(@k Editable editable) {
        if (this.f440198c) {
            return;
        }
        this.f440198c = true;
        if (this.f440199d) {
            editable.clear();
            editable.append((CharSequence) this.f440201f);
        } else {
            String string = editable.toString();
            C35843m0 c35843m0C = this.f440197b.c(this.f440200e, string);
            editable.clear();
            editable.append((CharSequence) c35843m0C.f318924a);
            Selection.setSelection(editable, Math.max(0, Math.min(c35843m0C.f318925b, editable.length())));
        }
        this.f440198c = false;
    }

    @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
    public final void beforeTextChanged(@k CharSequence charSequence, int i12, int i13, int i14) {
        if (this.f440198c) {
            return;
        }
        this.f440199d = i13 > i14 && i13 + i12 != charSequence.length();
        this.f440201f = charSequence.toString();
    }

    @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
    public final void onTextChanged(@k CharSequence charSequence, int i12, int i13, int i14) {
        if (this.f440198c) {
            return;
        }
        this.f440200e = i12 + i14;
    }
}
