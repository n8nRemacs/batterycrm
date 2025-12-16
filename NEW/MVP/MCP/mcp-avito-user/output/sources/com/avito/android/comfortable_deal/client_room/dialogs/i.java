package com.avito.android.comfortable_deal.client_room.dialogs;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContractDialog.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class i extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ContractDialog f119850l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f119851m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f119852n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ContractDialog contractDialog, String str, int i12) {
        super(2);
        this.f119850l = contractDialog;
        this.f119851m = str;
        this.f119852n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f119852n | 1);
        ContractDialog.g5(this.f119850l, this.f119851m, a12, iA2);
        return G0.f406611a;
    }
}
