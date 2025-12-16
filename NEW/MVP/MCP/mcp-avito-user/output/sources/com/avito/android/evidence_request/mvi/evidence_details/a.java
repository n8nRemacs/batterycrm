package com.avito.android.evidence_request.mvi.evidence_details;

import Xz.InterfaceC17066a;
import android.net.Uri;
import com.avito.android.evidence_request.mvi.evidence_details.EvidenceDetailsFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: EvidenceDetailsFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.a f148758l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ EvidenceDetailsFragment f148759m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Uri f148760n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l0.a aVar, EvidenceDetailsFragment evidenceDetailsFragment, Uri uri) {
        super(0);
        this.f148758l = aVar;
        this.f148759m = evidenceDetailsFragment;
        this.f148760n = uri;
    }

    @Override // Y41.a
    public final G0 invoke() {
        l0.a aVar = this.f148758l;
        if (!aVar.f406838b) {
            EvidenceDetailsFragment.a aVar2 = EvidenceDetailsFragment.f148738w0;
            this.f148759m.q5().accept(new InterfaceC17066a.e(this.f148760n));
            aVar.f406838b = true;
        }
        return G0.f406611a;
    }
}
