package com.avito.android.advert.icebreakerseditor;

import androidx.compose.runtime.C22066f2;
import b4.C25408d;
import b4.InterfaceC25405a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IcebreakersEditorScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class u extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C25408d.c f71300l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC25405a, G0> f71301m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f71302n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(C25408d.c cVar, Y41.l<? super InterfaceC25405a, G0> lVar, int i12) {
        super(2);
        this.f71300l = cVar;
        this.f71301m = lVar;
        this.f71302n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f71302n | 1);
        r.d(this.f71300l, this.f71301m, a12, iA2);
        return G0.f406611a;
    }
}
