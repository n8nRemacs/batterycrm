package XU;

import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;

/* compiled from: BannerContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXU/a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public String f18890a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public String f18891b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public String f18892c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public View.OnClickListener f18893d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public TextView f18894e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public TextView f18895f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Button f18896g;

    public final void a(@l String str, @l View.OnClickListener onClickListener) {
        this.f18892c = str;
        this.f18893d = onClickListener;
        Button button = this.f18896g;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, str, false);
        }
        Button button2 = this.f18896g;
        if (button2 != null) {
            button2.setOnClickListener(onClickListener);
        }
    }
}
