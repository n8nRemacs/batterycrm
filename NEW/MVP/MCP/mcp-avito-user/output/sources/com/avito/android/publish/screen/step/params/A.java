package com.avito.android.publish.screen.step.params;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishDetailsInternalRouter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/photo_permission/a;", "invoke", "()Lcom/avito/android/photo_permission/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class A extends N implements Y41.a<com.avito.android.photo_permission.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y f240401l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(y yVar) {
        super(0);
        this.f240401l = yVar;
    }

    @Override // Y41.a
    public final com.avito.android.photo_permission.a invoke() {
        y yVar = this.f240401l;
        com.avito.android.photo_permission.b bVar = yVar.f241662A;
        if (bVar == null) {
            bVar = null;
        }
        PublishDetailsFragment publishDetailsFragment = yVar.f241679b;
        bVar.getClass();
        return new com.avito.android.photo_permission.d(publishDetailsFragment, publishDetailsFragment.getChildFragmentManager(), bVar.f218725a);
    }
}
