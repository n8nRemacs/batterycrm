package Ze0;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.toggle.Checkmark;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CardSelectView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LZe0/h;", "LZe0/a;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements InterfaceC19547a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f20339h = 0;

    /* renamed from: a, reason: collision with root package name */
    @l
    public final UniversalColor f20340a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final UniversalColor f20341b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f20342c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f20343d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f20344e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Checkmark f20345f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ConstraintLayout f20346g;

    /* compiled from: CardSelectView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LZe0/h$a;", "", "<init>", "()V", "", "CORNER_RADIUS", "I", "PADDING", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public h(@k View view, @l UniversalColor universalColor, @l UniversalColor universalColor2) {
        this.f20340a = universalColor;
        this.f20341b = universalColor2;
        View viewFindViewById = view.findViewById(R.id.card_select_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f20342c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.card_select_paragraph_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f20343d = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.card_select_link_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f20344e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.card_select_checkmark);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkmark");
        }
        this.f20345f = (Checkmark) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.card_select);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f20346g = (ConstraintLayout) viewFindViewById5;
    }
}
