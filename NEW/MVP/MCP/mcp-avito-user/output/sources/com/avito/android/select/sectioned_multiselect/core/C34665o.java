package com.avito.android.select.sectioned_multiselect.core;

import kotlin.Metadata;

/* compiled from: SectionedMultiselectDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.select.sectioned_multiselect.core.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34665o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f266677b;

    public C34665o(K k12) {
        this.f266677b = k12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        K k12 = this.f266677b;
        C34656f c34656f = k12.f266489n;
        if (c34656f != null) {
            c34656f.c(true);
        }
        C34656f c34656f2 = k12.f266489n;
        if (c34656f2 != null) {
            c34656f2.a(false);
        }
    }
}
