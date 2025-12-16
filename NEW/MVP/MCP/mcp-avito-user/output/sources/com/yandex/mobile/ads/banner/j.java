package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.yandex.mobile.ads.impl.b00;
import com.yandex.mobile.ads.impl.g7;
import com.yandex.mobile.ads.impl.rj1;
import j.N;

/* loaded from: classes8.dex */
final class j {
    @N
    public static i a(@N View view, @N f fVar) {
        return view.isInEditMode() ? new b() : new a(fVar);
    }

    public static final class b implements i {
        @Override // com.yandex.mobile.ads.banner.i
        public final void a(@N Context context, @N View view) {
            view.setVisibility(0);
            int i12 = rj1.f389556b;
            view.setMinimumHeight(Math.round(TypedValue.applyDimension(1, 50.0f, context.getResources().getDisplayMetrics())));
        }

        @Override // com.yandex.mobile.ads.banner.i
        public final void onAttachedToWindow() {
        }

        @Override // com.yandex.mobile.ads.banner.i
        public final void onDetachedFromWindow() {
        }
    }

    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final f f382534a;

        public a(@N f fVar) {
            this.f382534a = fVar;
        }

        @Override // com.yandex.mobile.ads.banner.i
        public final void onAttachedToWindow() {
            if (g7.a((b00) this.f382534a)) {
                return;
            }
            this.f382534a.q();
        }

        @Override // com.yandex.mobile.ads.banner.i
        public final void onDetachedFromWindow() {
            if (g7.a((b00) this.f382534a)) {
                return;
            }
            this.f382534a.r();
        }

        @Override // com.yandex.mobile.ads.banner.i
        public final void a(@N Context context, @N View view) {
        }
    }
}
