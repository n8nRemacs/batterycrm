package kd0;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.view.d;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.I;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ProgressOverlay.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkd0/a;", "", "_avito_progress-overlay2_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kd0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C42670a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ViewGroup f406516a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Y41.a<View> f406517b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public ContentPlaceholder f406518c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f406519d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final TextView f406520e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public View.OnClickListener f406521f;

    /* JADX WARN: Multi-variable type inference failed */
    public C42670a(@k ViewGroup viewGroup, @l Y41.a<? extends View> aVar, @I int i12) {
        this.f406516a = viewGroup;
        this.f406517b = aVar;
        View viewB = C0.b(viewGroup, i12, viewGroup, false);
        this.f406519d = viewB;
        this.f406520e = (TextView) viewB.findViewById(R.id.progress_message);
        D6.w(viewB);
        viewGroup.addView(viewB);
    }

    public static void d(C42670a c42670a) {
        View view = c42670a.f406519d;
        view.setMinimumHeight(0);
        TextView textView = c42670a.f406520e;
        if (textView != null) {
            I5.a(textView, null, false);
        }
        D6.H(view);
        D6.w(c42670a.f406518c);
        Y41.a<View> aVar = c42670a.f406517b;
        View viewInvoke = aVar != null ? aVar.invoke() : null;
        if (viewInvoke != null) {
            D6.w(viewInvoke);
        }
    }

    public final void a(@l View.OnClickListener onClickListener) {
        ContentPlaceholder contentPlaceholder = this.f406518c;
        if (contentPlaceholder != null) {
            contentPlaceholder.setButtonOnClickListener(onClickListener);
        }
        this.f406521f = onClickListener;
    }

    public final void b() {
        Y41.a<View> aVar = this.f406517b;
        View viewInvoke = aVar != null ? aVar.invoke() : null;
        if (viewInvoke != null) {
            D6.H(viewInvoke);
        }
        D6.w(this.f406519d);
        D6.w(this.f406518c);
    }

    public final void c(@l Integer num, @k Y41.l<? super ContentPlaceholder, G0> lVar) {
        ContentPlaceholder contentPlaceholder = this.f406518c;
        Y41.a<View> aVar = this.f406517b;
        if (contentPlaceholder == null) {
            ViewGroup viewGroup = this.f406516a;
            Context dVar = num != null ? new d(viewGroup.getContext(), num.intValue()) : viewGroup.getContext();
            ContentPlaceholder contentPlaceholder2 = new ContentPlaceholder(dVar, null, 0, 0, 14, null);
            if (aVar == null) {
                contentPlaceholder2.setBackgroundColor(C35835l0.d(R.attr.white, dVar));
                contentPlaceholder2.setClickable(true);
            }
            this.f406518c = contentPlaceholder2;
            D6.w(contentPlaceholder2);
            viewGroup.addView(this.f406518c);
            ContentPlaceholder contentPlaceholder3 = this.f406518c;
            if (contentPlaceholder3 != null) {
                contentPlaceholder3.setButtonOnClickListener(this.f406521f);
            }
        }
        ContentPlaceholder contentPlaceholder4 = this.f406518c;
        if (contentPlaceholder4 != null) {
            lVar.invoke(contentPlaceholder4);
            D6.H(contentPlaceholder4);
        }
        D6.w(this.f406519d);
        View viewInvoke = aVar != null ? aVar.invoke() : null;
        if (viewInvoke != null) {
            D6.w(viewInvoke);
        }
    }

    public /* synthetic */ C42670a(ViewGroup viewGroup, Y41.a aVar, int i12, int i13, C42822w c42822w) {
        this(viewGroup, (i13 & 2) != 0 ? null : aVar, (i13 & 4) != 0 ? R.layout.progress_overlay_loader : i12);
    }
}
