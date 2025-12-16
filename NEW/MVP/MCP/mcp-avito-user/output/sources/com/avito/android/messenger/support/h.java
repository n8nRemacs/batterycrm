package com.avito.android.messenger.support;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.i1;
import com.avito.android.util.InterfaceC35863o4;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.A;
import ru.avito.messenger.F0;

/* compiled from: SupportChatFormInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/support/h;", "Lcom/avito/android/messenger/support/c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i1 f197386a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F0 f197387b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A f197388c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f197389d;

    @Inject
    public h(@Y61.k i1 i1Var, @Y61.k F0 f02, @Y61.k A a12, @Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f197386a = i1Var;
        this.f197387b = f02;
        this.f197388c = a12;
        this.f197389d = interfaceC35863o4;
    }

    @Override // com.avito.android.messenger.support.c
    @Y61.k
    public final C42026y a(int i12, @Y61.k CharSequence charSequence) {
        return this.f197386a.a(i12).S().n(new e(this)).n(new g(this, charSequence));
    }
}
