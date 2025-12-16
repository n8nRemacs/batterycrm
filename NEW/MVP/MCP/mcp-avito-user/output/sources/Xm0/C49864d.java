package xM0;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.deep_linking.links.HelpCenterUrlShowLink;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationProgressOverlay.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LxM0/d;", "", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xM0.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49864d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ViewGroup f442443a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Y41.a<View> f442444b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public C49861a f442445c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f442446d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final TextView f442447e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public View.OnClickListener f442448f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public View.OnClickListener f442449g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public HelpCenterUrlShowLink f442450h;

    /* compiled from: VerificationProgressOverlay.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LxM0/d$a;", "", "<init>", "()V", "", "DEFAULT_SUPPORT_URL", "Ljava/lang/String;", "SUPPORT_BASE_URL", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xM0.d$a */
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

    public C49864d() {
        throw null;
    }

    public C49864d(ViewGroup viewGroup, Y41.a aVar, int i12, int i13, C42822w c42822w) {
        aVar = (i13 & 2) != 0 ? null : aVar;
        i12 = (i13 & 4) != 0 ? R.layout.progress_overlay_loader : i12;
        this.f442443a = viewGroup;
        this.f442444b = aVar;
        View viewB = C0.b(viewGroup, i12, viewGroup, false);
        this.f442446d = viewB;
        this.f442447e = (TextView) viewB.findViewById(R.id.progress_message);
        this.f442450h = new HelpCenterUrlShowLink("request/722");
        D6.w(viewB);
        viewGroup.addView(viewB);
    }

    public static void c(C49864d c49864d, Y41.l lVar) {
        C49861a c49861a = c49864d.f442445c;
        Y41.a<View> aVar = c49864d.f442444b;
        if (c49861a == null) {
            ViewGroup viewGroup = c49864d.f442443a;
            Context context = viewGroup.getContext();
            C49861a c49861a2 = new C49861a(context, null, 0, 0, 14, null);
            if (aVar == null) {
                c49861a2.setBackgroundColor(C35835l0.d(R.attr.white, context));
                c49861a2.setClickable(true);
            }
            c49864d.f442445c = c49861a2;
            D6.w(c49861a2);
            viewGroup.addView(c49864d.f442445c);
            C49861a c49861a3 = c49864d.f442445c;
            if (c49861a3 != null) {
                c49861a3.setFirstButtonOnClickListener(c49864d.f442448f);
            }
            C49861a c49861a4 = c49864d.f442445c;
            if (c49861a4 != null) {
                c49861a4.setSecondButtonOnClickListener(c49864d.f442449g);
            }
        }
        C49861a c49861a5 = c49864d.f442445c;
        if (c49861a5 != null) {
            lVar.invoke(c49861a5);
            D6.H(c49861a5);
        }
        D6.w(c49864d.f442446d);
        View viewInvoke = aVar != null ? aVar.invoke() : null;
        if (viewInvoke != null) {
            D6.w(viewInvoke);
        }
    }

    public static void d(C49864d c49864d) {
        View view = c49864d.f442446d;
        view.setMinimumHeight(0);
        TextView textView = c49864d.f442447e;
        if (textView != null) {
            I5.a(textView, null, false);
        }
        D6.H(view);
        D6.w(c49864d.f442445c);
        Y41.a<View> aVar = c49864d.f442444b;
        View viewInvoke = aVar != null ? aVar.invoke() : null;
        if (viewInvoke != null) {
            D6.w(viewInvoke);
        }
    }

    public final void a(@l View.OnClickListener onClickListener, @l View.OnClickListener onClickListener2) {
        C49861a c49861a = this.f442445c;
        if (c49861a != null) {
            c49861a.setFirstButtonOnClickListener(onClickListener);
        }
        C49861a c49861a2 = this.f442445c;
        if (c49861a2 != null) {
            c49861a2.setSecondButtonOnClickListener(onClickListener2);
        }
        this.f442448f = onClickListener;
        this.f442449g = onClickListener2;
    }

    public final void b() {
        Y41.a<View> aVar = this.f442444b;
        View viewInvoke = aVar != null ? aVar.invoke() : null;
        if (viewInvoke != null) {
            D6.H(viewInvoke);
        }
        D6.w(this.f442446d);
        D6.w(this.f442445c);
    }
}
