package com.avito.android.favorites.adapter.interactive_title;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FavoriteInteractiveTitleView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/adapter/interactive_title/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/favorites/adapter/interactive_title/h;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f156601e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f156602b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f156603c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f156604d;

    public i(@k View view) {
        super(view);
        this.f156602b = view;
        View viewFindViewById = view.findViewById(R.id.interactive_title_header);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156603c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.interactive_title_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f156604d = (ImageView) viewFindViewById2;
    }

    @Override // com.avito.android.favorites.adapter.interactive_title.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f156602b.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(26, aVar));
    }

    @Override // com.avito.android.favorites.adapter.interactive_title.h
    public final void k80(@k FavoriteInteractiveTitleListItem favoriteInteractiveTitleListItem) {
        this.f156603c.setText(favoriteInteractiveTitleListItem.f156590c);
        D6.G(this.f156604d, favoriteInteractiveTitleListItem.f156591d != null);
        int i12 = favoriteInteractiveTitleListItem.f156593f;
        int i13 = favoriteInteractiveTitleListItem.f156592e;
        if (i13 == 0 && i12 == 0) {
            return;
        }
        View view = this.f156602b;
        view.setPadding(view.getPaddingLeft(), D6.i(i13, view.getContext()), view.getPaddingRight(), D6.i(i12, view.getContext()));
    }
}
