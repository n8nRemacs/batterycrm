package com.avito.android.preloading.coroutines;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.preloading.coroutines.AbstractC33302a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;

/* compiled from: PreloadingPromiseViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/preloading/coroutines/x;", "Landroidx/lifecycle/M0;", "<init>", "()V", "a", "_common_preloading-promise"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class x extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f221848E = new LinkedHashMap();

    /* compiled from: PreloadingPromiseViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/preloading/coroutines/x$a;", "Landroidx/lifecycle/P0$c;", "<init>", "()V", "_common_preloading-promise"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements P0.c {
        @Override // androidx.lifecycle.P0.c
        @Y61.k
        public final <T extends M0> T create(@Y61.k Class<T> cls) {
            return new x();
        }
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.f221848E;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC33302a abstractC33302a = (AbstractC33302a) ((Map.Entry) it.next()).getValue();
            AbstractC33302a.C6710a c6710a = AbstractC33302a.f221798g;
            U.b(abstractC33302a.f221800b, null);
        }
        linkedHashMap.clear();
    }
}
