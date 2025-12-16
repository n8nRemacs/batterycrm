package com.yandex.mobile.ads.nativeads;

import android.view.View;
import com.yandex.mobile.ads.impl.d31;
import com.yandex.mobile.ads.impl.eb;
import com.yandex.mobile.ads.impl.h90;
import com.yandex.mobile.ads.impl.j2;
import com.yandex.mobile.ads.impl.l31;
import com.yandex.mobile.ads.impl.lk0;
import com.yandex.mobile.ads.impl.tw;
import com.yandex.mobile.ads.impl.tx0;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    @j.k0
    static final c f392603a = new a();

    /* renamed from: b, reason: collision with root package name */
    @j.k0
    static final c f392604b = new b();

    public class a extends c {
        @Override // com.yandex.mobile.ads.nativeads.c
        @N
        public final View.OnClickListener a(@N tw twVar, @N tx0 tx0Var, @N j2 j2Var, @N w wVar, @N eb ebVar, @P h90 h90Var) {
            return new lk0(twVar, tx0Var, j2Var, wVar, ebVar, h90Var);
        }
    }

    public class b extends c {
        @Override // com.yandex.mobile.ads.nativeads.c
        @N
        public final View.OnClickListener a(@N tw twVar, @N tx0 tx0Var, @N j2 j2Var, @N w wVar, @N eb ebVar, @P h90 h90Var) {
            return ("call_to_action".equals(ebVar.b()) || "feedback".equals(ebVar.b())) ? new lk0(twVar, tx0Var, j2Var, wVar, ebVar, h90Var) : new d31(wVar.g().d());
        }
    }

    @N
    public static c a(@P l31 l31Var) {
        return (l31Var == null || !"button_click_only".equals(l31Var.b())) ? f392603a : f392604b;
    }

    @N
    public abstract View.OnClickListener a(@N tw twVar, @N tx0 tx0Var, @N j2 j2Var, @N w wVar, @N eb ebVar, @P h90 h90Var);
}
