package B00;

import Y61.k;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PersonFormVerticalDecoration.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB00/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f775b;

    /* renamed from: c, reason: collision with root package name */
    public final int f776c;

    /* renamed from: d, reason: collision with root package name */
    public final int f777d;

    /* renamed from: e, reason: collision with root package name */
    public final int f778e;

    /* renamed from: f, reason: collision with root package name */
    public final int f779f;

    /* renamed from: g, reason: collision with root package name */
    public final int f780g;

    /* renamed from: h, reason: collision with root package name */
    public final int f781h;

    /* renamed from: i, reason: collision with root package name */
    public final int f782i;

    /* renamed from: j, reason: collision with root package name */
    public final int f783j;

    /* renamed from: k, reason: collision with root package name */
    public final int f784k;

    /* renamed from: l, reason: collision with root package name */
    public final int f785l;

    /* renamed from: m, reason: collision with root package name */
    public final int f786m;

    /* renamed from: n, reason: collision with root package name */
    public final int f787n;

    /* renamed from: o, reason: collision with root package name */
    public final int f788o;

    /* renamed from: p, reason: collision with root package name */
    public final int f789p;

    public c(@k Resources resources, @k com.avito.konveyor.a aVar) {
        this.f775b = resources.getDimensionPixelOffset(R.dimen.form_top_offset);
        this.f776c = resources.getDimensionPixelOffset(R.dimen.form_bottom_offset);
        this.f777d = resources.getDimensionPixelOffset(R.dimen.form_checkbox_top_offset);
        this.f778e = resources.getDimensionPixelOffset(R.dimen.form_after_checkbox_top_offset);
        this.f779f = resources.getDimensionPixelOffset(R.dimen.form_suggestion_banner_top_offset);
        this.f780g = resources.getDimensionPixelOffset(R.dimen.form_verification_banner_top_offset);
        this.f781h = resources.getDimensionPixelOffset(R.dimen.form_after_text_top_offset);
        this.f782i = resources.getDimensionPixelOffset(R.dimen.form_default_top_offset);
        this.f783j = resources.getDimensionPixelOffset(R.dimen.form_action_banner_bottom_offset);
        this.f784k = aVar.Y(com.avito.android.mortgage.person_form.list.items.action_banner.a.class);
        this.f785l = aVar.Y(com.avito.android.mortgage.person_form.list.items.checkbox.a.class);
        this.f786m = aVar.Y(com.avito.android.mortgage.person_form.list.items.suggestion_banner.a.class);
        this.f787n = aVar.Y(com.avito.android.mortgage.person_form.list.items.verification_banner.a.class);
        this.f788o = aVar.Y(com.avito.android.mortgage.person_form.list.items.text.a.class);
        this.f789p = aVar.Y(com.avito.android.mortgage.person_form.list.items.nav_button.a.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(@Y61.k android.graphics.Rect r5, @Y61.k android.view.View r6, @Y61.k androidx.recyclerview.widget.RecyclerView r7, @Y61.k androidx.recyclerview.widget.RecyclerView.z r8) {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r8 = r7.getAdapter()
            if (r8 != 0) goto L7
            return
        L7:
            androidx.recyclerview.widget.RecyclerView$C r7 = r7.W(r6)
            int r0 = androidx.recyclerview.widget.RecyclerView.U(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = -1
            if (r0 == r2) goto L17
            goto L18
        L17:
            r1 = 0
        L18:
            if (r1 != 0) goto L26
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            androidx.recyclerview.widget.RecyclerView.Y(r6, r7)
            r5.set(r7)
            return
        L26:
            int r6 = r1.intValue()
            if (r6 <= 0) goto L6a
            int r6 = r1.intValue()
            int r6 = r6 + (-1)
            int r6 = r8.getItemViewType(r6)
            int r7 = r7.getItemViewType()
            int r0 = r4.f784k
            if (r6 != r0) goto L41
            int r6 = r4.f783j
            goto L6c
        L41:
            int r0 = r4.f785l
            if (r7 != r0) goto L48
            int r6 = r4.f777d
            goto L6c
        L48:
            int r2 = r4.f789p
            int r3 = r4.f782i
            if (r7 != r2) goto L50
        L4e:
            r6 = r3
            goto L6c
        L50:
            int r2 = r4.f786m
            if (r7 != r2) goto L57
            int r6 = r4.f779f
            goto L6c
        L57:
            int r2 = r4.f787n
            if (r7 != r2) goto L5e
            int r6 = r4.f780g
            goto L6c
        L5e:
            if (r6 != r0) goto L63
            int r6 = r4.f778e
            goto L6c
        L63:
            int r7 = r4.f788o
            if (r6 != r7) goto L4e
            int r6 = r4.f781h
            goto L6c
        L6a:
            int r6 = r4.f775b
        L6c:
            int r7 = r8.getItemCount()
            int r7 = r7 + (-1)
            int r8 = r1.intValue()
            if (r8 != r7) goto L7b
            int r7 = r4.f776c
            goto L7c
        L7b:
            r7 = 0
        L7c:
            r5.top = r6
            r5.bottom = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B00.c.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
