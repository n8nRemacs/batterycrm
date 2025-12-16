package com.avito.android.language_selector.presentation;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.akita.compose.component.bottom_sheet.I;
import eR.C40040a;
import eR.InterfaceC40041b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LanguageSelectorScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class n extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C40040a f175000l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I f175001m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC40041b, G0> f175002n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f175003o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(C40040a c40040a, I i12, Y41.l<? super InterfaceC40041b, G0> lVar, int i13) {
        super(2);
        this.f175000l = c40040a;
        this.f175001m = i12;
        this.f175002n = lVar;
        this.f175003o = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f175003o | 1);
        I i12 = this.f175001m;
        Y41.l<InterfaceC40041b, G0> lVar = this.f175002n;
        o.b(this.f175000l, i12, lVar, a12, iA2);
        return G0.f406611a;
    }
}
