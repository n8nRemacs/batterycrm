package com.avito.android.advert.item.teaser;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AutotekaSelectTeaserView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<TextView> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutotekaSelectTeaserView f80545l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AutotekaSelectTeaserView autotekaSelectTeaserView) {
        super(0);
        this.f80545l = autotekaSelectTeaserView;
    }

    @Override // Y41.a
    public final TextView invoke() {
        View viewFindViewById = this.f80545l.findViewById(R.id.description_select);
        if (viewFindViewById != null) {
            return (TextView) viewFindViewById;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }
}
