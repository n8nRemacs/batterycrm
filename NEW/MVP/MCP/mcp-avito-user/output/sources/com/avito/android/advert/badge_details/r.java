package com.avito.android.advert.badge_details;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BadgeDetailsView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "v", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class r extends N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f68811l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f68812m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, s sVar) {
        super(1);
        this.f68811l = str;
        this.f68812m = sVar;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        Button button = (Button) view.findViewById(R.id.button_badge_details);
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, this.f68811l, false);
            button.setOnClickListener(new A91.p(this.f68812m, 27));
        }
        return G0.f406611a;
    }
}
