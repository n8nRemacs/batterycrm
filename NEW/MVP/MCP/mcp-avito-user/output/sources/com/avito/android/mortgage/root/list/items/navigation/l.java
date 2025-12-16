package com.avito.android.mortgage.root.list.items.navigation;

import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: NavigationView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/navigation/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/navigation/k;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f202721g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f202722b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Button f202723c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f202724d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Boolean f202725e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Boolean, G0> f202726f;

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.next);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f202722b = (Button) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.previous);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f202723c = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.legal_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById3;
        this.f202724d = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        view.getViewTreeObserver().addOnScrollChangedListener(new U9.f(this, 5));
    }

    public final void B80() {
        int[] iArr = new int[2];
        this.itemView.getLocationOnScreen(iArr);
        boolean z12 = true;
        int i12 = iArr[1];
        int i13 = Resources.getSystem().getDisplayMetrics().heightPixels;
        if (L.f(this.f202725e, Boolean.valueOf(i12 == 0 || i12 > i13))) {
            return;
        }
        if (i12 != 0 && i12 <= i13) {
            z12 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z12);
        this.f202725e = boolValueOf;
        Y41.l<? super Boolean, G0> lVar = this.f202726f;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(boolValueOf.booleanValue()));
        }
    }

    @Override // com.avito.android.mortgage.root.list.items.navigation.k
    public final void DJ(boolean z12) {
        this.f202723c.setLoading(z12);
    }

    @Override // com.avito.android.mortgage.root.list.items.navigation.k
    public final void Jf(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f202724d, attributedText, null);
    }

    @Override // com.avito.android.mortgage.root.list.items.navigation.k
    public final void SI(@Y61.l String str) {
        com.avito.android.lib.design.button.b.a(this.f202722b, str, false);
    }

    @Override // com.avito.android.mortgage.root.list.items.navigation.k
    public final void W60(@Y61.k Y41.a<G0> aVar) {
        this.f202723c.setOnClickListener(new C(16, aVar));
    }

    @Override // com.avito.android.mortgage.root.list.items.navigation.k
    public final void a30(@Y61.l String str) {
        com.avito.android.lib.design.button.b.a(this.f202723c, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f202726f = null;
    }

    @Override // com.avito.android.mortgage.root.list.items.navigation.k
    public final void ky(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f202726f = lVar;
    }

    @Override // com.avito.android.mortgage.root.list.items.navigation.k
    public final void nH(@Y61.k Y41.a<G0> aVar) {
        this.f202722b.setOnClickListener(new C(15, aVar));
    }

    @Override // com.avito.android.mortgage.root.list.items.navigation.k
    public final void sF(boolean z12) {
        this.f202722b.setLoading(z12);
    }

    @Override // com.avito.android.mortgage.root.list.items.navigation.k
    public final void setEnabled(boolean z12) {
        this.f202722b.setEnabled(z12);
        this.f202723c.setEnabled(z12);
        this.itemView.postDelayed(new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 14), 400L);
    }
}
