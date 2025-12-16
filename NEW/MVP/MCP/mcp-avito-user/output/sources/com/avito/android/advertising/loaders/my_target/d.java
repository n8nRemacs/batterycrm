package com.avito.android.advertising.loaders.my_target;

import android.view.View;
import j.InterfaceC42156l;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MyTargetBanner.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/my_target/d;", "Lcom/avito/android/advertising/b;", "a", "Lcom/avito/android/advertising/loaders/my_target/d$a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class d implements com.avito.android.advertising.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.my.target.nativeads.b f88403b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public WeakReference<View> f88404c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    @InterfaceC42156l
    public Integer f88405d;

    /* compiled from: MyTargetBanner.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/my_target/d$a;", "Lcom/avito/android/advertising/loaders/my_target/d;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends d {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final com.my.target.nativeads.d f88406e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f88407f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final b f88408g;

        public a(@Y61.k com.my.target.nativeads.d dVar, boolean z12, @Y61.k b bVar) {
            super(dVar, null);
            this.f88406e = dVar;
            this.f88407f = z12;
            this.f88408g = bVar;
        }

        @Override // com.avito.android.advertising.loaders.my_target.d, com.avito.android.advertising.b
        @Y61.l
        public final Integer T() {
            return null;
        }

        @Override // com.avito.android.advertising.loaders.my_target.d, com.avito.android.advertising.b
        @Y61.l
        public final String W() {
            k11.c cVarA = this.f88406e.a();
            if (cVarA != null) {
                return cVarA.f406012i;
            }
            return null;
        }

        @Override // com.avito.android.advertising.loaders.my_target.d, com.avito.android.advertising.b
        @Y61.l
        /* renamed from: g0 */
        public final String getF88260e() {
            k11.c cVarA = this.f88406e.a();
            if (cVarA != null) {
                return cVarA.f406010g;
            }
            return null;
        }

        @Override // com.avito.android.advertising.loaders.my_target.d, com.avito.android.advertising.b
        @Y61.l
        /* renamed from: h0 */
        public final String getF88258c() {
            k11.c cVarA = this.f88406e.a();
            if (cVarA != null) {
                return cVarA.f406009f;
            }
            return null;
        }

        @Override // com.avito.android.advertising.loaders.my_target.d, com.avito.android.advertising.b
        @Y61.l
        /* renamed from: j0 */
        public final String getF88257b() {
            k11.c cVarA = this.f88406e.a();
            if (cVarA != null) {
                return cVarA.f406007d;
            }
            return null;
        }
    }

    public d(com.my.target.nativeads.b bVar, C42822w c42822w) {
        this.f88403b = bVar;
    }

    @Override // com.avito.android.advertising.b
    @Y61.l
    public Integer T() {
        return null;
    }

    @Override // com.avito.android.advertising.b
    @Y61.l
    public String W() {
        return null;
    }

    @Override // com.avito.android.advertising.b
    @Y61.l
    /* renamed from: g0 */
    public String getF88260e() {
        return null;
    }

    @Override // com.avito.android.advertising.b
    @Y61.l
    /* renamed from: h0 */
    public String getF88258c() {
        return null;
    }

    @Override // com.avito.android.advertising.b
    @Y61.l
    /* renamed from: j0 */
    public String getF88257b() {
        return null;
    }
}
