package com.avito.android.util;

import android.annotation.SuppressLint;
import android.app.Application;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: PublishTitleGenerator.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/i4;", "Lcom/avito/android/util/h4;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.i4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35815i4 implements InterfaceC35807h4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f318902a;

    @Inject
    public C35815i4(@Y61.k Application application) {
        this.f318902a = application;
    }

    @Override // com.avito.android.util.InterfaceC35807h4
    @Y61.k
    @SuppressLint({"HardcodeStringDetector"})
    public final SpannableString a(@Y61.l String str, boolean z12, boolean z13) {
        if (z12 || str == null || str.length() == 0) {
            return new SpannableString("");
        }
        if (!z13) {
            return new SpannableString(str);
        }
        String strQ = androidx.appcompat.app.r.q(str, "  ");
        SpannableString spannableString = new SpannableString(strQ);
        spannableString.setSpan(new ImageSpan(this.f318902a.getApplicationContext(), R.drawable.title_dot, 1), C43066x.F(strQ), strQ.length(), 33);
        return spannableString;
    }
}
