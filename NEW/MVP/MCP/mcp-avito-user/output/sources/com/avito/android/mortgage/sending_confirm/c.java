package com.avito.android.mortgage.sending_confirm;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SendingConfirmContentScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class c extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f203512l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f203513m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f203514n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Boolean, G0> f203515o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f203516p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AttributedText attributedText, boolean z12, boolean z13, Y41.l lVar, v vVar, int i12) {
        super(2);
        this.f203512l = attributedText;
        this.f203513m = z12;
        this.f203514n = z13;
        this.f203515o = lVar;
        this.f203516p = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(24585);
        boolean z12 = this.f203513m;
        boolean z13 = this.f203514n;
        g.a(this.f203512l, z12, z13, this.f203515o, this.f203516p, a12, iA2);
        return G0.f406611a;
    }
}
