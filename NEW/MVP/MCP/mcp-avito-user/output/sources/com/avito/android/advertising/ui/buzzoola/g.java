package com.avito.android.advertising.ui.buzzoola;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BuzzoolaInfoMenuBottomSheetDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f88588l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f88589m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, String str) {
        super(0);
        this.f88588l = hVar;
        this.f88589m = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        h hVar = this.f88588l;
        com.avito.android.lib.design.bottom_sheet.d.M(hVar, this.f88589m, false, true, 6);
        LinearLayout linearLayout = hVar.f88591E;
        if (linearLayout != null) {
            D6.H(linearLayout);
        }
        TextView textView = hVar.f88592F;
        if (textView != null) {
            D6.w(textView);
        }
        return G0.f406611a;
    }
}
