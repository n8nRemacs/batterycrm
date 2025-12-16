package com.avito.android.app.task;

import com.avito.android.util.V2;
import com.avito.android.util.rx3.C35907l;
import kotlin.Metadata;

/* compiled from: PublishDraftsSyncTask.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/rx3/l;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/rx3/l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.u1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28599u1 extends kotlin.jvm.internal.N implements Y41.l<C35907l, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final C28599u1 f91738l = new C28599u1();

    public C28599u1() {
        super(1);
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(C35907l c35907l) {
        V2.f318762a.c("PublishDraftsSyncTask", "Sync draft failed, retrying", null);
        return kotlin.G0.f406611a;
    }
}
