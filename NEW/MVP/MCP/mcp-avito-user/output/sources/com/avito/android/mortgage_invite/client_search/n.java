package com.avito.android.mortgage_invite.client_search;

import androidx.compose.runtime.C22066f2;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MortgageClientSearchScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class n extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MortgageClient f205463l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f205464m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f205465n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(MortgageClient mortgageClient, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f205463l = mortgageClient;
        this.f205464m = vVar;
        this.f205465n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f205465n | 1);
        I.d(this.f205463l, this.f205464m, a12, iA2);
        return G0.f406611a;
    }
}
