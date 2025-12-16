package com.avito.android.calltracking.item;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.avito.android.calltracking.F;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CallItemTextFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calltracking/item/b;", "Lcom/avito/android/calltracking/item/a;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final F f113717a;

    @Inject
    public b(@Y61.k F f12) {
        this.f113717a = f12;
    }

    @Override // com.avito.android.calltracking.item.a
    @Y61.k
    public final SpannableStringBuilder a(@Y61.k String str, @Y61.k String str2, boolean z12) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str).append((char) 160).append((char) 183).append((CharSequence) " ").append((CharSequence) str2);
        F f12 = this.f113717a;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(z12 ? f12.a() : f12.b()), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }
}
