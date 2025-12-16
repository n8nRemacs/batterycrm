package com.avito.android.authorization.select_social.adapter;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TextItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/select_social/adapter/r;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/authorization/select_social/adapter/q;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r extends com.avito.konveyor.adapter.b implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f94494b;

    public r(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f94494b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.authorization.select_social.adapter.q
    public final void setText(@Y61.k String str) {
        this.f94494b.setText(str);
    }
}
