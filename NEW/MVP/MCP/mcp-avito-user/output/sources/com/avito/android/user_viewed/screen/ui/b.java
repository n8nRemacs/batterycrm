package com.avito.android.user_viewed.screen.ui;

import com.avito.android.user_viewed.screen.ui.UserViewedFragment;
import kotlin.Metadata;
import lK0.InterfaceC43650a;

/* compiled from: UserViewedFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserViewedFragment f318485b;

    public b(UserViewedFragment userViewedFragment) {
        this.f318485b = userViewedFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserViewedFragment.a aVar = UserViewedFragment.f318464B0;
        ((e) this.f318485b.f318467u0.getValue()).accept(InterfaceC43650a.C11783a.f413710a);
    }
}
