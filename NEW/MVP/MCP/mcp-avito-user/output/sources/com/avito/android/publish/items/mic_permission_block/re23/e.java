package com.avito.android.publish.items.mic_permission_block.re23;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.items.mic_permission_block.MicPermissionBlockItem;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishMicPermissionBlockItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/mic_permission_block/re23/e;", "Lcom/avito/android/publish/items/mic_permission_block/re23/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<MicPermissionBlockItem.Action> f237056b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f237057c;

    @Inject
    public e() {
        com.jakewharton.rxrelay3.c<MicPermissionBlockItem.Action> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f237056b = cVar;
        this.f237057c = new C41981q0(cVar);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        MicPermissionBlockItem micPermissionBlockItem = (MicPermissionBlockItem) aVar;
        gVar.u1(new d(this, micPermissionBlockItem));
        gVar.H8(micPermissionBlockItem.f237029d);
    }

    @Override // com.avito.android.publish.items.mic_permission_block.re23.c
    @k
    /* renamed from: S, reason: from getter */
    public final C41981q0 getF237057c() {
        return this.f237057c;
    }
}
