package KY;

import KY.a;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.transition.J;
import androidx.transition.Q;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.circular_progress.CircularProgressBar;
import com.avito.android.mvi.e;
import com.avito.android.util.C35971x;
import com.avito.android.util.D6;
import com.avito.android.util.Q5;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: ConnectionErrorIndicatorView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKY/b;", "LKY/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f9516h = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/connection_indicator/ConnectionErrorIndicatorView$State;", b.class))};

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f9517b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C35971x f9518c = new C35971x();

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ViewGroup f9519d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f9520e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f9521f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final CircularProgressBar f9522g;

    public b(@k View view) {
        this.f9517b = view;
        ViewParent parent = view.getParent();
        this.f9519d = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        View viewFindViewById = view.findViewById(R.id.connection_error_action);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f9520e = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.connection_error_message);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f9521f = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.connection_progress);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.deprecated_design.circular_progress.CircularProgressBar");
        }
        this.f9522g = (CircularProgressBar) viewFindViewById3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mvi.e
    public final a.c a(e<a.c> eVar) {
        C35971x c35971x = this.f9518c;
        n<Object> nVar = f9516h[0];
        return (a.c) c35971x.f319122b;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [KY.a$c, T] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        C35971x c35971x = this.f9518c;
        n<Object> nVar = f9516h[0];
        c35971x.f319122b = (a.c) obj;
    }

    @Override // com.avito.android.mvi.e
    public final void d(e<a.c> eVar, a.c cVar, a.c cVar2) {
        a.c cVar3 = cVar;
        a.c cVar4 = cVar2;
        if (cVar3 == null || !cVar4.equals(cVar3)) {
            boolean z12 = cVar4 instanceof a.c.C0577a;
            View view = this.f9517b;
            ViewGroup viewGroup = this.f9519d;
            if (z12) {
                if (viewGroup != null) {
                    Q5 q52 = new Q5(new J());
                    q52.b(view);
                    Q.a(viewGroup, q52.c());
                }
                D6.w(view);
                return;
            }
            if (cVar4 instanceof a.c.b) {
                a.c.b bVar = (a.c.b) cVar4;
                this.f9521f.setText(bVar.f9513a);
                boolean z13 = bVar instanceof a.c.b.C0578a;
                CircularProgressBar circularProgressBar = this.f9522g;
                TextView textView = this.f9520e;
                if (z13) {
                    a.c.b.C0578a c0578a = (a.c.b.C0578a) cVar4;
                    textView.setText(c0578a.f9514b);
                    textView.setOnClickListener(c0578a.f9515c);
                    D6.g(circularProgressBar);
                    D6.H(textView);
                } else if (bVar instanceof a.c.b.C0579b) {
                    D6.g(textView);
                    D6.H(circularProgressBar);
                }
                if (viewGroup != null) {
                    Q5 q53 = new Q5(new J());
                    q53.b(view);
                    Q.a(viewGroup, q53.c());
                }
                D6.H(view);
            }
        }
    }
}
