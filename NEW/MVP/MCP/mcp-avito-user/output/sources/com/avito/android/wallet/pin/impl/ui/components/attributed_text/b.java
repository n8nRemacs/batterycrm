package com.avito.android.wallet.pin.impl.ui.components.attributed_text;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AttributedTextView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f328898l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f328899m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f328900n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AttributedText attributedText, v vVar, int i12) {
        super(2);
        this.f328898l = attributedText;
        this.f328899m = vVar;
        this.f328900n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f328900n | 1);
        c.a(this.f328898l, this.f328899m, a12, iA2);
        return G0.f406611a;
    }
}
