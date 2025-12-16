package os0;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.AfterWithIcon;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.util.C35787f0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.V0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import os0.f;

/* compiled from: GeoReferenceViewBinder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Los0/g;", "Los0/f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ViewGroup f422316a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f422317b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f422318c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f422319d;

    /* renamed from: e, reason: collision with root package name */
    public final int f422320e;

    public g(ViewGroup viewGroup, boolean z12, int i12, C42822w c42822w) {
        z12 = (i12 & 2) != 0 ? false : z12;
        this.f422316a = viewGroup;
        this.f422317b = z12;
        Context context = viewGroup.getContext();
        this.f422318c = context;
        this.f422319d = LayoutInflater.from(context);
        this.f422320e = viewGroup.getResources().getDimensionPixelSize(R.dimen.metro_geo_reference_text_padding);
    }

    public void a(int i12, @k String str, @l String str2, boolean z12) {
        TextView textViewH = h(z12);
        textViewH.setText(str);
        ViewGroup viewGroup = this.f422316a;
        viewGroup.addView(textViewH);
        if (str2 == null || str2.length() == 0) {
            return;
        }
        LayoutInflater layoutInflater = this.f422319d;
        ImageView imageView = (ImageView) layoutInflater.inflate(R.layout.advert_details_geo_icon, viewGroup, false);
        Context context = this.f422318c;
        Drawable drawableH = C35835l0.h(i12, context);
        if (drawableH != null) {
            V0.a(drawableH, C35835l0.d(R.attr.black, context));
        } else {
            drawableH = null;
        }
        imageView.setImageDrawable(drawableH);
        viewGroup.addView(imageView);
        TextView textView = (TextView) layoutInflater.inflate(R.layout.advert_details_geo_after_text, viewGroup, false);
        textView.setText(str2);
        viewGroup.addView(textView);
    }

    public final void b(@k GeoReference geoReference) {
        String after;
        List<String> colors = geoReference.getColors();
        if (colors == null) {
            colors = C42784z0.f406748b;
        }
        List<String> list = colors;
        String content = geoReference.getContent();
        AfterWithIcon afterWithIcon = geoReference.getAfterWithIcon();
        if (afterWithIcon == null || (after = afterWithIcon.getText()) == null) {
            after = geoReference.getAfter();
        }
        String str = after;
        AfterWithIcon afterWithIcon2 = geoReference.getAfterWithIcon();
        f.a.a(this, list, content, str, afterWithIcon2 != null ? afterWithIcon2.getIconName() : null, 16);
    }

    public final void c(@l String str, @l String str2, @l String str3, @k List list, boolean z12) {
        ViewGroup viewGroup = this.f422316a;
        if (z12) {
            viewGroup.removeAllViews();
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Integer numA = C35787f0.a((String) it.next());
            if (numA != null) {
                int iIntValue = numA.intValue();
                View viewInflate = this.f422319d.inflate(d(), viewGroup, false);
                Drawable drawable = viewInflate.getContext().getDrawable(R.drawable.advert_details_metro_reference);
                viewInflate.setBackground(drawable != null ? drawable.mutate() : null);
                viewInflate.setBackgroundTintList(ColorStateList.valueOf(iIntValue));
                viewGroup.addView(viewInflate);
            }
        }
        if (str != null) {
            Integer numA2 = str3 != null ? q.a(str3) : null;
            if (numA2 != null) {
                a(numA2.intValue(), str, str2, !list.isEmpty());
                return;
            }
            TextView textViewH = h(!list.isEmpty());
            if (str2 == null || str2.length() == 0) {
                textViewH.setText(str);
            } else {
                String strF = f(str, str2);
                SpannableString spannableString = new SpannableString(strF);
                spannableString.setSpan(new ForegroundColorSpan(C35835l0.d(e(), this.f422318c)), str.length(), strF.length(), 34);
                textViewH.setText(spannableString);
            }
            viewGroup.addView(textViewH);
        }
    }

    public int d() {
        return R.layout.advert_details_geo_circle;
    }

    public int e() {
        return R.attr.gray48;
    }

    @k
    public String f(@k String str, @l String str2) {
        return r.q(str, str2);
    }

    public int g() {
        return R.layout.advert_details_geo_content_text;
    }

    @k
    public final TextView h(boolean z12) {
        TextView textView = (TextView) this.f422319d.inflate(g(), this.f422316a, false);
        if (this.f422317b) {
            textView.setTextAppearance(C35835l0.j(R.attr.textM20, this.f422318c));
        }
        D6.f(textView, z12 ? this.f422320e : 0, 0, 0, 0, 14);
        return textView;
    }
}
