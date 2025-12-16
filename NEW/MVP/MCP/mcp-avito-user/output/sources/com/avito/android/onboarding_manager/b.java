package com.avito.android.onboarding_manager;

import kotlin.Metadata;
import l41.o;

/* compiled from: InlineFiltersTooltipShowsInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "apply", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class b<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f209424b;

    public b(int i12) {
        this.f209424b = i12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return Boolean.valueOf(((Number) obj).intValue() >= this.f209424b);
    }
}
