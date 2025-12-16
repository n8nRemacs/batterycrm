package ob;

import android.content.res.Resources;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: BannerExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advertising_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: ob.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44743g {
    @Y61.k
    public static final void a(@Y61.k View view) throws Resources.NotFoundException {
        int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.rich_snippet_padding_left);
        D6.f(view, dimensionPixelOffset, view.getResources().getDimensionPixelSize(R.dimen.rich_snippet_commercial_padding_top), dimensionPixelOffset, 0, 8);
        if (view.getResources().getConfiguration().orientation == 2) {
            view.getLayoutParams().width = (int) ((((view.getResources().getDisplayMetrics().widthPixels - view.getPaddingLeft()) - view.getPaddingRight()) - (view.getResources().getDimensionPixelSize(R.dimen.serp_horizontal_padding) * 2)) * 0.42857143f);
        }
    }

    @Y61.k
    public static final String b(@Y61.k String str) {
        return C43066x.h0(str, "https://www.", false) ? str.substring(12) : C43066x.h0(str, "http://www.", false) ? str.substring(11) : C43066x.h0(str, "https://", false) ? str.substring(8) : C43066x.h0(str, "http://", false) ? str.substring(7) : C43066x.h0(str, "www.", false) ? str.substring(4) : str;
    }
}
