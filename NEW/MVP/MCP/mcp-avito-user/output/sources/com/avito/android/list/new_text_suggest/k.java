package com.avito.android.list.new_text_suggest;

import android.graphics.drawable.Drawable;
import com.avito.android.image_loader.o;
import kotlin.Metadata;

/* compiled from: NewTextSuggestItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/list/new_text_suggest/k;", "Lcom/avito/android/image_loader/o;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f181633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Drawable f181634c;

    public k(j jVar, Drawable drawable) {
        this.f181633b = jVar;
        this.f181634c = drawable;
    }

    @Override // com.avito.android.image_loader.o, com.avito.android.image_loader.i
    public final void H(int i12, int i13) {
        this.f181633b.f181630f.setBackground(null);
    }

    @Override // com.avito.android.image_loader.o, com.avito.android.image_loader.i
    public final void S2() {
        this.f181633b.f181630f.setBackground(this.f181634c);
    }
}
