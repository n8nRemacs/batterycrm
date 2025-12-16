package com.avito.android.categories_global.compose;

import android.net.Uri;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoriesItemUi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class d extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Uri f116326l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f116327m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Uri uri, v vVar, int i12) {
        super(2);
        this.f116326l = uri;
        this.f116327m = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(57);
        v vVar = this.f116327m;
        f.c(this.f116326l, vVar, a12, iA2);
        return G0.f406611a;
    }
}
