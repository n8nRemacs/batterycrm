package com.avito.android.select.sectioned_multiselect.core;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: SectionedMultiselectDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZp0/e;", "result", "Lkotlin/G0;", "accept", "(LZp0/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.select.sectioned_multiselect.core.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34661k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f266672b;

    public C34661k(K k12) {
        this.f266672b = k12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Zp0.e eVar = (Zp0.e) obj;
        K k12 = this.f266672b;
        Collection collection = k12.f266498w;
        if (collection == null) {
            collection = C42784z0.f406748b;
        }
        K.g(k12, Zp0.e.a(eVar, C42745f0.h0(eVar.f20507a, collection)));
    }
}
