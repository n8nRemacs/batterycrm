package com.avito.android.lib.deprecated_design.edit_text;

import android.text.Editable;
import android.text.Selection;
import com.avito.android.util.AbstractC35956u5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CharSequencePositionFormatterTextWatcher.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/edit_text/a;", "Lcom/avito/android/util/u5;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.deprecated_design.edit_text.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31488a extends AbstractC35956u5 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final G f177964b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final N f177965c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f177966d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public C31491d f177967e;

    /* JADX WARN: Multi-variable type inference failed */
    public C31488a(@Y61.k G g12, @Y61.k Y41.l<? super String, G0> lVar) {
        this.f177964b = g12;
        this.f177965c = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
    public final void afterTextChanged(@Y61.k Editable editable) {
        C31491d c31491d;
        if (this.f177966d || (c31491d = this.f177967e) == null) {
            return;
        }
        CharSequence charSequence = c31491d.f177972a;
        this.f177965c.invoke(charSequence.toString());
        this.f177966d = true;
        editable.replace(0, editable.length(), charSequence);
        Selection.setSelection(editable, Math.max(0, Math.min(c31491d.f177973b, editable.length())));
        this.f177966d = false;
    }

    @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
    public final void onTextChanged(@Y61.k CharSequence charSequence, int i12, int i13, int i14) {
        if (this.f177966d) {
            return;
        }
        this.f177967e = this.f177964b.a(i12, i13, i14, charSequence);
    }
}
