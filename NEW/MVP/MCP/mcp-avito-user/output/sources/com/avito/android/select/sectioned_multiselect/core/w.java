package com.avito.android.select.sectioned_multiselect.core;

import java.util.Set;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "selectedItems", "Lkotlin/G0;", "accept", "(Ljava/util/Set;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class w<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f266685b;

    public w(K k12) {
        this.f266685b = k12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Set set = (Set) obj;
        K k12 = this.f266685b;
        K.i(k12, set);
        K.f(k12, set.size());
        C34656f c34656f = k12.f266489n;
        if (c34656f != null) {
            com.avito.konveyor.util.a.a(c34656f.f266641b, k12.j());
        }
    }
}
