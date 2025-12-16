package com.avito.android.installmentsblock.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.installments_block.entity.InstallmentsIcon;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsBlock.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f172921l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f172922m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InstallmentsIcon f172923n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f172924o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f172925p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f172926q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, AttributedText attributedText, InstallmentsIcon installmentsIcon, Y41.l lVar, v vVar, int i12) {
        super(2);
        this.f172921l = str;
        this.f172922m = attributedText;
        this.f172923n = installmentsIcon;
        this.f172924o = lVar;
        this.f172925p = vVar;
        this.f172926q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f172926q | 1);
        v vVar = this.f172925p;
        AttributedText attributedText = this.f172922m;
        InstallmentsIcon installmentsIcon = this.f172923n;
        b.b(this.f172921l, attributedText, installmentsIcon, this.f172924o, vVar, a12, iA2);
        return G0.f406611a;
    }
}
