package com.avito.android.saved_searches.presentation.main;

import Y41.l;
import android.content.Context;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.saved_searches.presentation.main.mvi.entity.SavedSearchMainViewState;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SavedSearchMainView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SavedSearchMainViewState f258603l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f258604m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SavedSearchMainViewState savedSearchMainViewState, h hVar) {
        super(1);
        this.f258603l = savedSearchMainViewState;
        this.f258604m = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        Context context = contentPlaceholder2.getContext();
        SavedSearchMainViewState.Error error = (SavedSearchMainViewState.Error) this.f258603l;
        contentPlaceholder2.setImageDrawable(C35835l0.h(error.f258675b, context));
        contentPlaceholder2.setTitle(contentPlaceholder2.getContext().getString(error.f258676c));
        contentPlaceholder2.setSubtitle(contentPlaceholder2.getContext().getString(error.f258677d));
        h hVar = this.f258604m;
        contentPlaceholder2.setButtonTitle(hVar.f258608d.f258403a);
        contentPlaceholder2.setButtonOnClickListener(new c(hVar, 2));
        return G0.f406611a;
    }
}
