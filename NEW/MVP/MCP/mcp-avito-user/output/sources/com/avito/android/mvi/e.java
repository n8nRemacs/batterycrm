package com.avito.android.mvi;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: Renderer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mvi/e;", "", "StateT", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface e<StateT> {

    /* compiled from: Renderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static <StateT> void a(@k e<StateT> eVar, @k StateT statet) {
            eVar.d(eVar, eVar.a(eVar), statet);
            eVar.b(statet);
        }
    }

    @l
    StateT a(@k e<StateT> eVar);

    void b(@l Object obj);

    void d(@k e<StateT> eVar, @l StateT statet, @k StateT statet2);
}
