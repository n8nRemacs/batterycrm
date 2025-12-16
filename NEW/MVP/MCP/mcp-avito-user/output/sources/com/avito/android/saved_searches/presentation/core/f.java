package com.avito.android.saved_searches.presentation.core;

import android.content.Context;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SavedSearchResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/core/f;", "", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f258403a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f258404b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f258405c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f258406d;

    /* renamed from: e, reason: collision with root package name */
    public final int f258407e;

    @Inject
    public f(@Y61.k Context context) {
        this.f258403a = context.getString(R.string.saved_search_refresh_button_title);
        this.f258404b = context.getString(R.string.saved_search_add_button_title);
        this.f258405c = context.getString(R.string.saved_search_save_button_title);
        this.f258406d = context.getString(R.string.saved_search_delete_button_title);
        context.getString(R.string.saved_search_unknown_error_message);
        this.f258407e = context.getResources().getDimensionPixelSize(R.dimen.bottomsheet_peek_height);
    }
}
