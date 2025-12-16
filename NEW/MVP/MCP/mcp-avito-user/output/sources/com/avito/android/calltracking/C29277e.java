package com.avito.android.calltracking;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CalltrackingBottomSheetView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calltracking/e;", "Lcom/avito/android/calltracking/d;", "Lcom/avito/android/calltracking/item/l;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.calltracking.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29277e implements InterfaceC29276d, com.avito.android.calltracking.item.l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f113709b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.calltracking.item.n f113710c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f113711d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f113712e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f113713f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f113714g;

    public C29277e(@Y61.k View view) {
        this.f113709b = view;
        View viewFindViewById = view.findViewById(R.id.calltracking_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f113710c = new com.avito.android.calltracking.item.n(viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.calltracking_sheet_content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f113711d = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.subtitle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById4;
        this.f113712e = textView;
        View viewFindViewById5 = viewGroup.findViewById(R.id.button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById5;
        this.f113713f = button;
        this.f113714g = new com.jakewharton.rxrelay3.c<>();
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        button.setOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 23));
    }

    @Override // com.avito.android.calltracking.item.l
    public final void BR(@Y61.l String str) {
        this.f113710c.BR(str);
    }

    @Override // com.avito.android.calltracking.item.l
    public final void c(@Y61.l Y41.a<G0> aVar) {
        this.f113710c.c(aVar);
    }

    public final void e0(boolean z12) {
        Button button = this.f113713f;
        button.setLoading(z12);
        button.setClickable(!z12);
    }

    @Override // com.avito.android.calltracking.item.l
    public final void l(@Y61.l Image image) {
        this.f113710c.l(image);
    }

    @Override // com.avito.android.calltracking.item.l
    public final void sr(boolean z12) {
        this.f113710c.sr(z12);
    }

    @Override // com.avito.android.calltracking.item.l
    public final void t9(@Y61.l String str) {
        this.f113710c.t9(str);
    }

    @Override // com.avito.android.calltracking.item.l
    public final void u30(@Y61.k CharSequence charSequence) {
        this.f113710c.u30(charSequence);
    }

    @Override // com.avito.android.calltracking.item.l
    public final void z4(@Y61.k String str) {
        this.f113710c.z4(str);
    }
}
