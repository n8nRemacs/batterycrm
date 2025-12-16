package com.avito.android.profile.user_profile.cards.simple_item;

import Y61.k;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SimpleCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/simple_item/h;", "Lcom/avito/android/profile/user_profile/cards/simple_item/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f225551f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f225552b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FrameLayout f225553c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f225554d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f225555e;

    public h(@k View view) {
        super(view);
        this.f225552b = view;
        View viewFindViewById = view.findViewById(R.id.item_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f225553c = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225554d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225555e = (TextView) viewFindViewById3;
    }

    @Override // com.avito.android.profile.user_profile.cards.simple_item.g
    public final void G3(@k Y41.a<G0> aVar) {
        this.f225553c.setOnClickListener(new com.avito.android.profile.edit.adapter.c(26, aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.simple_item.g
    public final void f(@k String str) {
        this.f225555e.setText(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.simple_item.g
    public final void setTitle(@k String str) {
        this.f225554d.setText(str);
    }
}
