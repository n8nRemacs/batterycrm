package com.avito.android.lib.deprecated_design.edit_text;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: ColoredHeadDecoratingFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/edit_text/b;", "Lcom/avito/android/lib/deprecated_design/edit_text/G;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.deprecated_design.edit_text.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31489b implements G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final F f177968a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f177969b;

    /* renamed from: c, reason: collision with root package name */
    public final int f177970c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f177971d;

    public C31489b(@Y61.k String str, char c12, @Y61.k F f12, @Y61.k E e12) {
        this.f177968a = f12;
        this.f177969b = e12;
        int iH2 = C43066x.H(c12, 0, 6, str);
        this.f177970c = iH2;
        this.f177971d = iH2 > 0;
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.G
    @Y61.k
    public final C31491d a(int i12, int i13, int i14, @Y61.k CharSequence charSequence) {
        C31491d c31491dA = this.f177969b.a(i12, i13, i14, charSequence);
        boolean z12 = this.f177971d;
        CharSequence charSequence2 = c31491dA.f177972a;
        if (z12) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f177968a.f177961a);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, this.f177970c, 0);
            charSequence2 = spannableStringBuilder;
        }
        return new C31491d(c31491dA.f177973b, charSequence2);
    }
}
