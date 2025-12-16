package os0;

import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GeoReferenceViewBinder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Los0/a;", "Los0/g;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: os0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44933a extends g {
    @Override // os0.g
    public final void a(int i12, @k String str, @l String str2, boolean z12) {
        TextView textViewH = h(z12);
        textViewH.setText(str);
        ViewGroup viewGroup = this.f422316a;
        viewGroup.addView(textViewH);
        if (str2 == null || str2.length() == 0) {
            return;
        }
        LayoutInflater layoutInflater = this.f422319d;
        ImageView imageView = (ImageView) layoutInflater.inflate(R.layout.advert_details_geo_icon_restyle, viewGroup, false);
        D6.f(imageView, y6.b(4), 0, 0, 0, 14);
        viewGroup.addView(imageView);
        TextView textView = (TextView) layoutInflater.inflate(R.layout.advert_details_geo_after_text_re23, viewGroup, false);
        textView.setText(str2);
        viewGroup.addView(textView);
    }

    @Override // os0.g
    public final int d() {
        return R.layout.advert_details_geo_circle_restyle;
    }

    @Override // os0.g
    public final int g() {
        return R.layout.advert_details_geo_content_text_re23;
    }
}
