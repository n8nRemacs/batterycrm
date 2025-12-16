package com.avito.android.section.placeholder;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.section.placeholder.e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SectionPlaceholderPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/placeholder/g;", "Lcom/avito/android/section/placeholder/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e.a f264862b;

    @Inject
    public g(@k e.a aVar) {
        this.f264862b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        SectionPlaceholderItem sectionPlaceholderItem = (SectionPlaceholderItem) aVar;
        ((c) eVar).Ho(sectionPlaceholderItem.f264854d, sectionPlaceholderItem.f264855e ? new f(0, this.f264862b, e.a.class, "onReloadButtonClick", "onReloadButtonClick()V", 0) : null);
    }
}
