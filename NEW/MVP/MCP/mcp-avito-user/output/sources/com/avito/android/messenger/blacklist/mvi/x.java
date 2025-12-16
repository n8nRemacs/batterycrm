package com.avito.android.messenger.blacklist.mvi;

import com.avito.android.messenger.blacklist.mvi.C31686p;
import com.avito.android.messenger.blacklist.mvi.InterfaceC31683m;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;

/* compiled from: BlacklistInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "apply", "(Z)Lcom/avito/android/messenger/blacklist/mvi/m$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class x<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC31683m.a f186528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C31686p.h f186529c;

    public x(InterfaceC31683m.a aVar, C31686p.h hVar) {
        this.f186528b = aVar;
        this.f186529c = hVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ((Boolean) obj).getClass();
        InterfaceC31683m.a aVar = this.f186528b;
        ArrayList arrayList = new ArrayList(aVar.f186474d);
        C31686p.h hVar = this.f186529c;
        C42745f0.l0(new w(hVar), arrayList);
        return InterfaceC31683m.a.a(aVar, null, null, null, arrayList, false, P0.i(aVar.f186476f, hVar.f186507d), 23);
    }
}
