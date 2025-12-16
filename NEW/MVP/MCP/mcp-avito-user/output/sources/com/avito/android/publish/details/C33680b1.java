package com.avito.android.publish.details;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: PublishDetailsPhotoSyncInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.details.b1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33680b1 extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final C33680b1 f233553l = new C33680b1();

    public C33680b1() {
        super(1);
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Throwable th2) {
        Throwable th3 = th2;
        V2.f318762a.a("DEFAULT_TAG", "Failed to update upload info with message " + th3.getMessage(), th3);
        return kotlin.G0.f406611a;
    }
}
