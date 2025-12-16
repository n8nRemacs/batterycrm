package com.avito.android.referral_program.di;

import android.content.Context;
import android.content.res.Resources;
import com.avito.android.util.A5;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReferralBeduinOkHttpModule.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class b extends N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f252660l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(0);
        this.f252660l = context;
    }

    @Override // Y41.a
    public final String invoke() {
        A5 a52 = A5.f318519a;
        Resources resources = this.f252660l.getResources();
        a52.getClass();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        return String.valueOf(y6.e(identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0));
    }
}
