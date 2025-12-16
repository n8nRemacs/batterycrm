package com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.ui;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.v;
import com.akita.compose.component.list_item.s;
import com.akita.compose.component.toggle.ToggleState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacEnableBottomSheetContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22602e f227880l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f227881m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s f227882n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f227883o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ToggleState f227884p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v f227885q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f227886r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C22602e c22602e, boolean z12, s sVar, Y41.a aVar, ToggleState toggleState, v vVar, int i12) {
        super(2);
        this.f227880l = c22602e;
        this.f227881m = z12;
        this.f227882n = sVar;
        this.f227883o = aVar;
        this.f227884p = toggleState;
        this.f227885q = vVar;
        this.f227886r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f227886r | 1);
        C22602e c22602e = this.f227880l;
        ToggleState toggleState = this.f227884p;
        d.b(c22602e, this.f227881m, this.f227882n, this.f227883o, toggleState, this.f227885q, a12, iA2);
        return G0.f406611a;
    }
}
