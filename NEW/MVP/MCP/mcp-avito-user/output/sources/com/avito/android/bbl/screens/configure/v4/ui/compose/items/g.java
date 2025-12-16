package com.avito.android.bbl.screens.configure.v4.ui.compose.items;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BblConfigureV4Title.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f99564l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<DeepLink, G0> f99565m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f99566n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f99567o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AttributedText attributedText, l lVar, v vVar, int i12) {
        super(2);
        this.f99564l = attributedText;
        this.f99565m = lVar;
        this.f99566n = vVar;
        this.f99567o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f99567o | 1);
        v vVar = this.f99566n;
        h.a(this.f99564l, this.f99565m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
