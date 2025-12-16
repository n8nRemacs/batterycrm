package com.avito.android.mortgage.root.list.items.issue;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: IssueView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/issue/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/issue/h;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f202651e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f202652b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f202653c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f202654d;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.banner);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        this.f202652b = (Banner) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202653c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.action);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f202654d = (Button) viewFindViewById3;
    }

    @Override // com.avito.android.mortgage.root.list.items.issue.h
    public final void Fb(@l String str) {
        com.avito.android.lib.design.button.b.a(this.f202654d, str, false);
    }

    @Override // com.avito.android.mortgage.root.list.items.issue.h
    public final void U(@k Y41.a<G0> aVar) {
        this.f202654d.setOnClickListener(new C(14, aVar));
    }

    @Override // com.avito.android.mortgage.root.list.items.issue.h
    public final void n(@l String str) {
        I5.a(this.f202653c, str, false);
    }

    @Override // com.avito.android.mortgage.root.list.items.issue.h
    public final void setEnabled(boolean z12) {
        Banner banner = this.f202652b;
        Button button = this.f202654d;
        if (z12) {
            button.setEnabled(true);
            banner.setAlpha(1.0f);
        } else {
            banner.setAlpha(0.4f);
            button.setEnabled(false);
        }
    }

    @Override // com.avito.android.mortgage.root.list.items.issue.h
    public final void setTitle(@k String str) {
        this.f202652b.setTitle(str);
    }
}
