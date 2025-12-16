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
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f99558l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<DeepLink, G0> f99559m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f99560n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f99561o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AttributedText attributedText, l lVar, v vVar, int i12) {
        super(2);
        this.f99558l = attributedText;
        this.f99559m = lVar;
        this.f99560n = vVar;
        this.f99561o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f99561o | 1);
        v vVar = this.f99560n;
        h.a(this.f99558l, this.f99559m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
