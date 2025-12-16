package com.jakewharton.rxbinding4.widget;

import android.database.DataSetObserver;
import com.jakewharton.rxbinding4.widget.C37745d;
import kotlin.Metadata;

/* compiled from: AdapterDataChangeObservable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/c;", "Landroid/database/DataSetObserver;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.jakewharton.rxbinding4.widget.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37743c extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37745d.a f364217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.G f364218b;

    public C37743c(C37745d.a aVar, io.reactivex.rxjava3.core.G g12) {
        this.f364217a = aVar;
        this.f364218b = g12;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (this.f364217a.f396996b.get()) {
            return;
        }
        this.f364218b.onNext(null);
    }
}
