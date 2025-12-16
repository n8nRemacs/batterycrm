package com.avito.android.mortgage.document_requirements;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DocumentRequirementsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class t extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f199014l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f199015m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f199016n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f199017o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, AttributedText attributedText, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f199014l = str;
        this.f199015m = attributedText;
        this.f199016n = vVar;
        this.f199017o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f199017o | 1);
        androidx.compose.ui.v vVar = this.f199016n;
        n.c(this.f199014l, this.f199015m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
