package com.avito.android.select.sectioned_multiselect.core;

import Xp0.AbstractC17036a;
import Yp0.AbstractC18314a;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.select.sectioned_multiselect.core.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34660j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC17036a f266670b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f266671c;

    public C34660j(AbstractC17036a abstractC17036a, K k12) {
        this.f266670b = abstractC17036a;
        this.f266671c = k12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AbstractC17036a.c cVar = AbstractC17036a.c.f19077a;
        AbstractC17036a abstractC17036a = this.f266670b;
        boolean zF2 = kotlin.jvm.internal.L.f(abstractC17036a, cVar);
        K k12 = this.f266671c;
        if (!zF2) {
            if (kotlin.jvm.internal.L.f(abstractC17036a, AbstractC17036a.b.f19076a)) {
                k12.k(AbstractC18314a.b.f19694b);
                return;
            } else {
                kotlin.jvm.internal.L.f(abstractC17036a, AbstractC17036a.C1350a.f19075a);
                return;
            }
        }
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
