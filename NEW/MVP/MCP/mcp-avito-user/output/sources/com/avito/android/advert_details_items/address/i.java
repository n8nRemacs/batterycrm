package com.avito.android.advert_details_items.address;

import Ca1.ViewOnClickListenerC13236c;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.TextView;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.R;
import com.avito.android.advert_details_items.address.f;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: AdvertDetailsAddressView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f84461l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f84462m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f84463n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f84464o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f.b f84465p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, g gVar, String str2, int i12, f.b bVar) {
        super(0);
        this.f84461l = str;
        this.f84462m = gVar;
        this.f84463n = str2;
        this.f84464o = i12;
        this.f84465p = bVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, android.text.SpannableStringBuilder] */
    @Override // Y41.a
    public final G0 invoke() {
        l0.h hVar = new l0.h();
        hVar.f406842b = C22026a.c(new StringBuilder(", "), this.f84461l, (char) 160);
        TextView textView = this.f84462m.f84447d;
        StringBuilder sb2 = new StringBuilder();
        String str = this.f84463n;
        sb2.append(str);
        sb2.append(hVar.f406842b);
        I5.a(textView, sb2.toString(), false);
        textView.setOnClickListener(new ViewOnClickListenerC13236c(this.f84465p, str, hVar, 13));
        Drawable drawableH = C35835l0.h(R.attr.ic_copyM, textView.getContext());
        if (drawableH != null) {
            drawableH.setTint(C35835l0.d(R.attr.black, textView.getContext()));
            drawableH.setBounds(0, 0, drawableH.getIntrinsicWidth(), drawableH.getIntrinsicHeight());
        } else {
            drawableH = null;
        }
        if (drawableH != null) {
            ImageSpan imageSpan = new ImageSpan(drawableH, 0);
            ?? spannableStringBuilder = new SpannableStringBuilder(H.n(new StringBuilder(), hVar.f406842b, ' '));
            spannableStringBuilder.setSpan(imageSpan, ((CharSequence) hVar.f406842b).length(), spannableStringBuilder.length(), 33);
            hVar.f406842b = spannableStringBuilder;
            StringBuilder sb3 = new StringBuilder();
            sb3.append((Object) textView.getText());
            sb3.append(' ');
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb3.toString());
            spannableStringBuilder2.setSpan(imageSpan, textView.getText().length(), spannableStringBuilder2.length(), 33);
            I5.a(textView, spannableStringBuilder2, false);
        }
        D6.C(new h(textView, this.f84464o, (CharSequence) hVar.f406842b), textView);
        textView.setCompoundDrawablePadding(y6.b(4));
        return G0.f406611a;
    }
}
