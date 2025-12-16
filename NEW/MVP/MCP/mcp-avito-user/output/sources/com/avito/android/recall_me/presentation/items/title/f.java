package com.avito.android.recall_me.presentation.items.title;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RecallMeTitleView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recall_me/presentation/items/title/f;", "Lcom/avito/android/recall_me/presentation/items/title/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f251984b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f251985c;

    public f(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.recall_me_form_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f251984b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.recall_me_form_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f251985c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.recall_me.presentation.items.title.e
    public final void b(@k String str) {
        I5.a(this.f251984b, str, false);
    }

    @Override // com.avito.android.recall_me.presentation.items.title.e
    public final void n(@l String str) {
        I5.a(this.f251985c, str, false);
    }
}
