package ru.avito.component.serp.job;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.util.q;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: SerpAdvertRichJobLocationRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/serp/job/i;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f430526a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f430527b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f430528c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final TextView f430529d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ImageView f430530e;

    public i(@Y61.k View view) {
        this.f430526a = view;
        this.f430527b = (TextView) view.findViewById(R.id.location);
        this.f430528c = (ImageView) view.findViewById(R.id.metro_icon);
        this.f430529d = (TextView) view.findViewById(R.id.geo_distance);
        this.f430530e = (ImageView) view.findViewById(R.id.distance_icon);
    }

    public final void a(@Y61.k ru.avito.component.serp.job.geo.g gVar) {
        Drawable drawableH;
        Integer numA;
        Drawable drawableH2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = gVar.f430521a;
        boolean zK2 = C43066x.K(str);
        TextView textView = this.f430527b;
        if (!zK2) {
            spannableStringBuilder.append(str, new ForegroundColorSpan(C35835l0.d(R.attr.black, textView.getContext())), 17);
        }
        String str2 = gVar.f430522b;
        if (!C43066x.K(str2)) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append(str2, new ForegroundColorSpan(C35835l0.d(R.attr.gray54, textView.getContext())), 17);
        }
        ImageView imageView = this.f430530e;
        String str3 = gVar.f430523c;
        if (imageView == null && str3 != null && !C43066x.K(str3) && (numA = q.a(str3)) != null && (drawableH2 = C35835l0.h(numA.intValue(), textView.getContext())) != null) {
            spannableStringBuilder.append((CharSequence) " ");
            drawableH2.setBounds(0, 0, drawableH2.getIntrinsicWidth(), drawableH2.getIntrinsicHeight());
            drawableH2.setTint(C35835l0.d(R.attr.gray54, textView.getContext()));
            spannableStringBuilder.append(" ", new ImageSpan(drawableH2, 1), 33);
            spannableStringBuilder.append((char) 160);
        }
        ArrayList arrayList = gVar.f430524d;
        ArrayList arrayList2 = O2.a(arrayList) ? arrayList : null;
        ImageView imageView2 = this.f430528c;
        Q81.g gVar2 = arrayList2 != null ? new Q81.g(imageView2.getContext(), arrayList2, 4, 4.5f, 0) : null;
        D6.c(imageView2, null, Integer.valueOf(((int) textView.getTextSize()) / 2), null, null, 13);
        C35821j2.a(imageView2, gVar2);
        D6.c(textView, Integer.valueOf(y6.b(gVar2 == null ? 0 : 4)), null, null, null, 14);
        I5.a(textView, spannableStringBuilder, false);
        TextView textView2 = this.f430529d;
        if (textView2 != null) {
            com.avito.android.util.text.j.a(textView2, gVar.f430525e, null);
        }
        if (imageView != null) {
            if (str3 == null) {
                imageView.setVisibility(8);
                return;
            }
            Integer numA2 = q.a(str3);
            if (numA2 == null || (drawableH = C35835l0.h(numA2.intValue(), textView.getContext())) == null) {
                return;
            }
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawableH);
            imageView.setImageTintList(ColorStateList.valueOf(C35835l0.d(R.attr.gray54, textView.getContext())));
        }
    }
}
