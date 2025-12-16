package com.avito.android.lib.deprecated_design.edit_text;

import kotlin.Metadata;

/* compiled from: FocusableCharSequencePositionFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/edit_text/t;", "Lcom/avito/android/lib/deprecated_design/edit_text/G;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class t implements G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C31489b f177987a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final H f177988b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f177989c;

    public t(@Y61.k C31489b c31489b, @Y61.k H h12) {
        this.f177987a = c31489b;
        this.f177988b = h12;
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.G
    @Y61.k
    public final C31491d a(int i12, int i13, int i14, @Y61.k CharSequence charSequence) {
        return this.f177989c ? this.f177987a.a(i12, i13, i14, charSequence) : this.f177988b.a(i12, i13, i14, charSequence);
    }
}
