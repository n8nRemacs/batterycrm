package com.avito.android.extended_profile_adverts.mvi;

import com.avito.android.serp.adapter.i1;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ProfileAdvertsReducer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/i1;", "it", "", "invoke", "(Lcom/avito/android/serp/adapter/i1;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class m extends N implements Y41.l<i1, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final m f150948l = new m();

    public m() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(i1 i1Var) {
        i1 i1Var2 = i1Var;
        return Boolean.valueOf(L.f(i1Var2.getF150574d(), "error_snippet") || L.f(i1Var2.getF150574d(), "loading_item"));
    }
}
