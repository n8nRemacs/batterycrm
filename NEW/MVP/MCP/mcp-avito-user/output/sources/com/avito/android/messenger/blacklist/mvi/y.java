package com.avito.android.messenger.blacklist.mvi;

import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BlacklistInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class y extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C31686p f186530l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f186531m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C31686p c31686p, String str) {
        super(1);
        this.f186530l = c31686p;
        this.f186531m = str;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        V2.f318762a.a(this.f186530l.f207131E, this.f186531m.concat(" subscription encountered an error!"), th2);
        return G0.f406611a;
    }
}
