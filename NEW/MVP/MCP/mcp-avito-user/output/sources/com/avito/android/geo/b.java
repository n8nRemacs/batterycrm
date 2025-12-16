package com.avito.android.geo;

import android.location.Location;
import android.os.Message;
import com.avito.android.util.L6;
import j.InterfaceC42153i;
import j.N;
import j.P;
import java.lang.ref.WeakReference;

/* compiled from: BaseGeoProvider.java */
/* loaded from: classes13.dex */
abstract class b implements g {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final GeoService f159293a;

    /* renamed from: b, reason: collision with root package name */
    public final L6 f159294b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.server_time.a f159295c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public Location f159296d;

    /* renamed from: e, reason: collision with root package name */
    public int f159297e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final L6.a f159298f;

    /* compiled from: BaseGeoProvider.java */
    public class a implements L6.a {
        public a() {
        }

        @Override // com.avito.android.util.L6.a
        public final void handleMessage(@N Message message) {
            if (message.what != 1) {
                return;
            }
            b.this.a();
        }
    }

    public b(@P GeoService geoService, L6 l62, com.avito.android.server_time.a aVar) {
        a aVar2 = new a();
        this.f159293a = geoService;
        this.f159294b = l62;
        l62.f318653a = new WeakReference<>(aVar2);
        this.f159295c = aVar;
    }

    @InterfaceC42153i
    public final void a() {
        GeoService geoService = this.f159293a;
        try {
            this.f159294b.removeCallbacksAndMessages(null);
            b();
        } finally {
            geoService.b(this.f159296d);
        }
    }

    public abstract void b();

    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(@j.P android.location.Location r13) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.geo.b.c(android.location.Location):void");
    }

    public abstract void d();

    public abstract void e(@N String str);
}
