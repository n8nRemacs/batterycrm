package com.avito.android.inline_filters;

import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;

/* compiled from: InlineFiltersPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/inline_filters/w$b;", "invoke", "()Lcom/avito/android/inline_filters/w$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class I extends kotlin.jvm.internal.N implements Y41.a<InterfaceC31062w.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SearchParams f170988l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PresentationType f170989m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f170990n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(PresentationType presentationType, SearchParams searchParams, String str) {
        super(0);
        this.f170988l = searchParams;
        this.f170989m = presentationType;
        this.f170990n = str;
    }

    @Override // Y41.a
    public final InterfaceC31062w.b invoke() {
        return new InterfaceC31062w.b(this.f170988l, this.f170989m, this.f170990n, true);
    }
}
