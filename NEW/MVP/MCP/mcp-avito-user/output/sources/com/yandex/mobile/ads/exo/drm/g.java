package com.yandex.mobile.ads.exo.drm;

import android.os.Looper;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.yandex.div2.D8;
import com.yandex.mobile.ads.exo.drm.e;
import com.yandex.mobile.ads.exo.drm.f;
import com.yandex.mobile.ads.impl.jt0;
import com.yandex.mobile.ads.impl.vw;
import com.yandex.mobile.ads.impl.xb1;
import j.P;

/* loaded from: classes8.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f382916a = new a();

    public class a implements g {
        @Override // com.yandex.mobile.ads.exo.drm.g
        public final void a(Looper looper, jt0 jt0Var) {
        }

        @Override // com.yandex.mobile.ads.exo.drm.g
        @P
        public final e a(@P f.a aVar, vw vwVar) {
            if (vwVar.f391184o == null) {
                return null;
            }
            return new l(new e.a(new xb1(), AuthCode.StatusCode.WAITING_CONNECT));
        }

        @Override // com.yandex.mobile.ads.exo.drm.g
        public final int a(vw vwVar) {
            return vwVar.f391184o != null ? 1 : 0;
        }
    }

    int a(vw vwVar);

    @P
    e a(@P f.a aVar, vw vwVar);

    void a(Looper looper, jt0 jt0Var);

    default b b(@P f.a aVar, vw vwVar) {
        return b.f382917a;
    }

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f382917a = new D8(11);

        void release();

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$static$0() {
        }
    }

    default void prepare() {
    }

    default void release() {
    }
}
