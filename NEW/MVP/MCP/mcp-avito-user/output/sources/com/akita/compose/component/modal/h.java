package com.akita.compose.component.modal;

import androidx.compose.runtime.internal.C22096n;
import com.akita.compose.foundation.modifier.e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Modal.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f62057l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f62058m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f62059n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f62060o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f62061p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f62062q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f62063r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C22096n f62064s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(C c12, Y41.a aVar, boolean z12, boolean z13, C22096n c22096n, C22096n c22096n2, androidx.compose.ui.v vVar, C22096n c22096n3) {
        super(2);
        this.f62057l = c12;
        this.f62058m = (N) aVar;
        this.f62059n = z12;
        this.f62060o = z13;
        this.f62061p = c22096n;
        this.f62062q = c22096n2;
        this.f62063r = vVar;
        this.f62064s = c22096n3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            e.a aVar = com.akita.compose.foundation.modifier.e.f63615e;
            B.f(this.f62057l, this.f62058m, this.f62059n, this.f62060o, this.f62061p, this.f62062q, this.f62063r, this.f62064s, a13, 8);
        }
        return G0.f406611a;
    }
}
