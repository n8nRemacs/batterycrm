package com.avito.android.advert_details_items.address;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert_details_items.address.f;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsAddressView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f84466l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f84467m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f.b f84468n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, String str, f.b bVar) {
        super(0);
        this.f84466l = gVar;
        this.f84467m = str;
        this.f84468n = bVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        TextView textView = this.f84466l.f84447d;
        String str = this.f84467m;
        I5.a(textView, str, false);
        textView.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(18, this.f84468n, str));
        Drawable drawableH = C35835l0.h(R.attr.ic_copyM, textView.getContext());
        if (drawableH != null) {
            drawableH.setTint(C35835l0.d(R.attr.black, textView.getContext()));
            drawableH.setBounds(0, 0, drawableH.getIntrinsicWidth(), drawableH.getIntrinsicHeight());
        } else {
            drawableH = null;
        }
        if (drawableH != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((Object) textView.getText()) + "  ");
            spannableStringBuilder.setSpan(new ImageSpan(drawableH, 0), textView.getText().length() + 1, spannableStringBuilder.length(), 33);
            I5.a(textView, spannableStringBuilder, false);
        }
        textView.setCompoundDrawablePadding(y6.b(4));
        return G0.f406611a;
    }
}
