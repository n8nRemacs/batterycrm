package com.avito.android.beduin.ui.screen;

import com.avito.android.beduin.di.InterfaceC28862y;
import com.avito.android.beduin.di.screen.o;
import com.avito.android.di.C29972i;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinScreenRootFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/beduin/di/screen/a;", "invoke", "()Lcom/avito/android/beduin/di/screen/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.a<com.avito.android.beduin.di.screen.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinScreenRootFragment f104096l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BeduinScreenRootFragment beduinScreenRootFragment) {
        super(0);
        this.f104096l = beduinScreenRootFragment;
    }

    @Override // Y41.a
    public final com.avito.android.beduin.di.screen.a invoke() {
        return o.a().a((InterfaceC28862y) C29972i.a(C29972i.b(this.f104096l), InterfaceC28862y.class));
    }
}
