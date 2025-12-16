package com.avito.android.publish.objects.blueprints;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.button.Button;
import com.avito.android.publish.objects.InterfaceC33886a;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DeleteObjectButtonItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/objects/blueprints/f;", "Lcom/avito/android/publish/objects/blueprints/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<InterfaceC33886a> f237584b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f237585c;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<InterfaceC33886a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f237584b = cVar;
        this.f237585c = new C41981q0(cVar);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        d dVar = new d(this, (InterfaceC33886a) aVar);
        Button button = hVar.f237588b;
        button.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(20, dVar));
        if (G0.f406611a == null) {
            button.setOnClickListener(null);
        }
        hVar.f237589c = new e(hVar);
    }

    @Override // com.avito.android.publish.objects.blueprints.c
    @k
    /* renamed from: R0, reason: from getter */
    public final C41981q0 getF237585c() {
        return this.f237585c;
    }
}
