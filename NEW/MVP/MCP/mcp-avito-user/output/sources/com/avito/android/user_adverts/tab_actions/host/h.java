package com.avito.android.user_adverts.tab_actions.host;

import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserAdvertsActionsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class h extends N implements Y41.a<Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f314300l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar) {
        super(0);
        this.f314300l = fVar;
    }

    @Override // Y41.a
    public final Integer invoke() {
        return Integer.valueOf(C35835l0.d(R.attr.backdrop_fill, this.f314300l.f314286d));
    }
}
