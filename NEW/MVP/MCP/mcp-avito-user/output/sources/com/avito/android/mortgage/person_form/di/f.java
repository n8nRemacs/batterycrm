package com.avito.android.mortgage.person_form.di;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

/* compiled from: PersonFormModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/di/f;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.mortgage.util.f f200553e;

    public f(com.avito.android.mortgage.util.f fVar) {
        this.f200553e = fVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        return this.f200553e.d(i12);
    }
}
