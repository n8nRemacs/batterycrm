package org.koin.android.ext.koin;

import Y41.p;
import android.content.Context;
import kotlin.C49177a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: KoinExt.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/a;", "Lv71/a;", "it", "Landroid/content/Context;", "invoke", "(Lorg/koin/core/scope/a;Lv71/a;)Landroid/content/Context;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class c extends N implements p<org.koin.core.scope.a, C49177a, Context> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f421398l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(2);
        this.f421398l = context;
    }

    @Override // Y41.p
    public final Context invoke(org.koin.core.scope.a aVar, C49177a c49177a) {
        return this.f421398l;
    }
}
