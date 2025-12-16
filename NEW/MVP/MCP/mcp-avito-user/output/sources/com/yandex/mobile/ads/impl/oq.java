package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.mobile.ads.impl.u20;
import kotlin.jvm.internal.l0;
import v21.C49153a;

/* loaded from: classes8.dex */
public final class oq implements v21.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final u20 f388610a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ma0 f388611b = new ma0();

    public static final class a implements u20.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f388612a;

        public a(ImageView imageView) {
            this.f388612a = imageView;
        }

        @Override // com.yandex.mobile.ads.impl.kz0.a
        public final void a(@Y61.l ok1 ok1Var) {
        }

        @Override // com.yandex.mobile.ads.impl.u20.d
        public final void a(@Y61.l u20.c cVar, boolean z12) {
            Bitmap bitmapB = cVar.b();
            if (bitmapB != null) {
                this.f388612a.setImageBitmap(bitmapB);
            }
        }
    }

    public static final class b implements u20.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v21.b f388613a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f388614b;

        public b(String str, v21.b bVar) {
            this.f388613a = bVar;
            this.f388614b = str;
        }

        @Override // com.yandex.mobile.ads.impl.kz0.a
        public final void a(@Y61.l ok1 ok1Var) {
            this.f388613a.a();
        }

        @Override // com.yandex.mobile.ads.impl.u20.d
        public final void a(@Y61.l u20.c cVar, boolean z12) {
            Bitmap bitmapB = cVar.b();
            if (bitmapB != null) {
                this.f388613a.b(new C49153a(bitmapB, Uri.parse(this.f388614b), z12 ? BitmapSource.f367561c : BitmapSource.f367560b));
            }
        }
    }

    public oq(@Y61.k Context context) {
        this.f388610a = kp0.c(context).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.yandex.mobile.ads.impl.u20$c] */
    public static final void a(l0.h hVar, oq oqVar, String str, ImageView imageView) {
        hVar.f406842b = oqVar.f388610a.a(str, new a(imageView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(l0.h hVar) {
        u20.c cVar = (u20.c) hVar.f406842b;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // v21.c
    @Y61.k
    public final v21.e loadImage(@Y61.k String str, @Y61.k v21.b bVar) {
        return a(str, bVar);
    }

    @Override // v21.c
    @Y61.k
    public final v21.e loadImageBytes(@Y61.k String str, @Y61.k v21.b bVar) {
        return a(str, bVar);
    }

    @Y61.k
    public final v21.e loadImage(@Y61.k String str, @Y61.k ImageView imageView) {
        l0.h hVar = new l0.h();
        this.f388611b.a(new T0(hVar, this, str, imageView, 3));
        return new D1(hVar, 1);
    }

    @Override // v21.c
    @j.N
    public v21.e loadImageBytes(@j.N String str, @j.N v21.b bVar, int i12) {
        return loadImageBytes(str, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(l0.h hVar) {
        u20.c cVar = (u20.c) hVar.f406842b;
        if (cVar != null) {
            cVar.a();
        }
    }

    private final v21.e a(String str, v21.b bVar) {
        l0.h hVar = new l0.h();
        this.f388611b.a(new T0(hVar, this, str, bVar, 2));
        return new D1(hVar, 0);
    }

    @Override // v21.c
    @j.N
    public v21.e loadImage(@j.N String str, @j.N v21.b bVar, int i12) {
        return loadImage(str, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.yandex.mobile.ads.impl.u20$c] */
    public static final void a(l0.h hVar, oq oqVar, String str, v21.b bVar) {
        hVar.f406842b = oqVar.f388610a.a(str, new b(str, bVar));
    }
}
