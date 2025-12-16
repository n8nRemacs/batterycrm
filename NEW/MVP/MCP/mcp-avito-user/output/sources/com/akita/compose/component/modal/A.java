package com.akita.compose.component.modal;

import androidx.compose.runtime.C22066f2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Modal.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class A extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f61977l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<C27348b> f61978m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ModalButtonsOrientation f61979n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f61980o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C c12, List list, ModalButtonsOrientation modalButtonsOrientation, int i12) {
        super(2);
        this.f61977l = c12;
        this.f61978m = list;
        this.f61979n = modalButtonsOrientation;
        this.f61980o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61980o | 1);
        List<C27348b> list = this.f61978m;
        ModalButtonsOrientation modalButtonsOrientation = this.f61979n;
        B.g(this.f61977l, list, modalButtonsOrientation, a12, iA2);
        return G0.f406611a;
    }
}
