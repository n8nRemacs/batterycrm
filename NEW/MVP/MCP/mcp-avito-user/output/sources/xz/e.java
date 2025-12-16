package xZ;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MnzProgressOverlay.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxZ/e;", "", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ViewGroup f442544a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View.OnClickListener f442545b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final View f442546c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public C49900b f442547d;

    public e(@k ViewGroup viewGroup, @k View.OnClickListener onClickListener, @l View view) {
        this.f442544a = viewGroup;
        this.f442545b = onClickListener;
        this.f442546c = view;
    }

    public final void a() {
        if (this.f442547d == null) {
            ViewGroup viewGroup = this.f442544a;
            this.f442547d = new C49900b(viewGroup.getContext(), this.f442546c, this.f442545b);
            viewGroup.addView(this.f442547d, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public final void b() {
        C49900b c49900b = this.f442547d;
        if (c49900b != null) {
            this.f442544a.removeView(c49900b);
            this.f442547d = null;
        }
        D6.w(this.f442546c);
    }

    public final void c() {
        a();
        C49900b c49900b = this.f442547d;
        if (c49900b != null) {
            D6.w(c49900b.f442533b);
            D6.H(c49900b.f442536e);
        }
    }

    public final void d(@l String str) {
        a();
        if (str != null && str.length() != 0) {
            C49900b c49900b = this.f442547d;
            if (c49900b != null) {
                TextView textView = c49900b.f442534c;
                if (textView != null) {
                    textView.setText(R.string.mnz_network_problem_error_title_text);
                }
                TextView textView2 = c49900b.f442535d;
                if (textView2 != null) {
                    textView2.setText(str);
                }
                D6.H(c49900b.f442533b);
                D6.w(c49900b.f442536e);
                return;
            }
            return;
        }
        C49900b c49900b2 = this.f442547d;
        if (c49900b2 != null) {
            String string = c49900b2.getContext().getString(R.string.error_layout_try_refresh_or_return_later);
            TextView textView3 = c49900b2.f442534c;
            if (textView3 != null) {
                textView3.setText(R.string.error_layout_unknown_error);
            }
            TextView textView4 = c49900b2.f442535d;
            if (textView4 != null) {
                textView4.setText(string);
            }
            D6.H(c49900b2.f442533b);
            D6.w(c49900b2.f442536e);
        }
    }

    public /* synthetic */ e(ViewGroup viewGroup, View.OnClickListener onClickListener, View view, int i12, C42822w c42822w) {
        this(viewGroup, onClickListener, (i12 & 4) != 0 ? null : view);
    }
}
