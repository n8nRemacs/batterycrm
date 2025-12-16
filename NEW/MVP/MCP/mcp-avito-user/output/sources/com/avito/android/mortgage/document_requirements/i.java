package com.avito.android.mortgage.document_requirements;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.mortgage.document_requirements.model.Document;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DocumentRequirementsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class i extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Document f198957l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f198958m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Document, G0> f198959n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f198960o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(Document document, boolean z12, Y41.l<? super Document, G0> lVar, int i12) {
        super(2);
        this.f198957l = document;
        this.f198958m = z12;
        this.f198959n = lVar;
        this.f198960o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f198960o | 1);
        boolean z12 = this.f198958m;
        Y41.l<Document, G0> lVar = this.f198959n;
        n.b(this.f198957l, z12, lVar, a12, iA2);
        return G0.f406611a;
    }
}
