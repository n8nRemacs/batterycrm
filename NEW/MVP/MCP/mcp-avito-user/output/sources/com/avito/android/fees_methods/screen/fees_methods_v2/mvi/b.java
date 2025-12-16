package com.avito.android.fees_methods.screen.fees_methods_v2.mvi;

import GE.a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FeesMethodsV2Actor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGE/a;", "action", "", "invoke", "(LGE/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class b extends N implements Y41.l<GE.a, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final b f158274l = new b();

    public b() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(GE.a aVar) {
        GE.a aVar2 = aVar;
        return Boolean.valueOf(aVar2 instanceof a.d ? true : aVar2 instanceof a.b ? true : aVar2 instanceof a.c);
    }
}
