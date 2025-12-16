package com.avito.android.publish.start_publish.blueprint;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.start_publish.StartPublishSheet;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoryShortcutItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/start_publish/blueprint/f;", "Lcom/avito/android/publish/start_publish/blueprint/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<StartPublishSheet.SheetData.CategoryShortcutItem> f245353b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f245354c;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<StartPublishSheet.SheetData.CategoryShortcutItem> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f245353b = cVar;
        this.f245354c = new C41981q0(cVar);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        StartPublishSheet.SheetData.CategoryShortcutItem categoryShortcutItem = (StartPublishSheet.SheetData.CategoryShortcutItem) aVar;
        hVar.setTitle(categoryShortcutItem.f245310b);
        hVar.i(categoryShortcutItem.f245313e);
        hVar.J0(new e(this, categoryShortcutItem));
    }

    @Override // com.avito.android.publish.start_publish.blueprint.d
    @k
    public final z<StartPublishSheet.SheetData.CategoryShortcutItem> d() {
        return this.f245354c;
    }
}
