package com.avito.android.photo_camera_view;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CameraItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class r extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33174e f216418l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C33174e c33174e) {
        super(1);
        this.f216418l = c33174e;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        C33174e c33174e = this.f216418l;
        C c12 = c33174e.f216381j;
        if (zBooleanValue) {
            x xVar = c33174e.f216384m;
            if (xVar != null) {
                xVar.yu(c12.d());
            }
        } else {
            x xVar2 = c33174e.f216384m;
            if (xVar2 != null) {
                xVar2.yu(c12.b());
            }
        }
        return G0.f406611a;
    }
}
