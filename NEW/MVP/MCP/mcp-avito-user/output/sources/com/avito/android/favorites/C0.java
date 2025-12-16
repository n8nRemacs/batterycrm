package com.avito.android.favorites;

import kotlin.Metadata;

/* compiled from: FavoritesListPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/favorites/CategoryChipable;", "invoke", "(Lcom/avito/android/favorites/CategoryChipable;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class C0 extends kotlin.jvm.internal.N implements Y41.l<CategoryChipable, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C30684r0 f156198l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(C30684r0 c30684r0) {
        super(1);
        this.f156198l = c30684r0;
    }

    @Override // Y41.l
    public final Boolean invoke(CategoryChipable categoryChipable) {
        return Boolean.valueOf(categoryChipable.f156200b == this.f156198l.f157458b0.f156207c);
    }
}
