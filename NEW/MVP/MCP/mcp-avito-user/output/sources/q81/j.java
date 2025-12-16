package Q81;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import hw.InterfaceC41177b;
import kotlin.Metadata;
import sK0.C48063a;

/* compiled from: HighlightDelegate.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ81/j;", "LQ81/f;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final TextView f13567a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f13568b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13569c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13570d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13571e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13572f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13573g;

    public j(@k TextView textView, boolean z12) {
        this.f13567a = textView;
        Context context = textView.getContext();
        this.f13568b = context;
        Resources resources = context.getResources();
        this.f13569c = C35835l0.d(R.attr.constantWhite, context);
        this.f13570d = C35835l0.d(R.attr.blue, context);
        this.f13571e = resources.getDimensionPixelOffset(R.dimen.rich_snippet_text_highlight_offset);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i12 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        this.f13572f = i12;
        this.f13573g = z12 ? resources.getDimensionPixelOffset(R.dimen.rich_snippet_text_highlight_margin) : i12;
    }

    public final void a(@l String str, boolean z12, @l UniversalColor universalColor) {
        int i12;
        TextView textView = this.f13567a;
        if (str == null) {
            textView.setText((CharSequence) null);
            D6.w(textView);
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        if (z12) {
            int iA2 = universalColor != null ? C48063a.f437606a.a(this.f13568b, universalColor) : this.f13570d;
            int i13 = this.f13571e;
            spannableString.setSpan(new i(iA2, i13), 0, str.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(this.f13569c), 0, str.length(), 33);
            i12 = i13;
        } else {
            i12 = 0;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(z12 ? this.f13573g : this.f13572f, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        D6.f(textView, i12, 0, i12, 0, 10);
        textView.setShadowLayer(i12, 0.0f, 0.0f, 0);
        I5.a(textView, spannableString, false);
    }
}
