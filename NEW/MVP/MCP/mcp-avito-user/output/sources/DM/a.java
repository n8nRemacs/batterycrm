package DM;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.util.C35835l0;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.t;
import com.bumptech.glide.request.transition.c;
import jW0.C42313a;
import jW0.C42314b;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: GlideImageLoader.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDM/a;", "Lcom/avito/android/image_loader/h;", "_common_image-loader-glide_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.image_loader.h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImageView f3159b;

    /* compiled from: GlideImageLoader.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"DM/a$a", "Lcom/bumptech/glide/request/target/h;", "_common_image-loader-glide_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: DM.a$a, reason: collision with other inner class name */
    public static final class C0170a extends com.bumptech.glide.request.target.h {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.image_loader.i f3160f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ImageRequest f3161g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0170a(com.avito.android.image_loader.i iVar, ImageRequest imageRequest, ImageView imageView) {
            super(imageView);
            this.f3160f = iVar;
            this.f3161g = imageRequest;
        }

        @Override // com.bumptech.glide.request.target.k, com.bumptech.glide.request.target.q
        public final void c(Object obj, com.bumptech.glide.request.transition.f fVar) {
            Drawable drawable = (Drawable) obj;
            super.c(drawable, fVar);
            this.f3160f.H(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            Y41.l<Drawable, G0> lVar = this.f3161g.f169467u;
            if (lVar != null) {
                lVar.invoke(drawable);
            }
        }

        @Override // com.bumptech.glide.request.target.k, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.q
        public final void g(@Y61.l Drawable drawable) {
            super.g(drawable);
            this.f3160f.b2(null);
        }

        @Override // com.bumptech.glide.request.target.k, com.bumptech.glide.request.target.t, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.q
        public final void k(@Y61.l Drawable drawable) {
            super.k(drawable);
            this.f3160f.S2();
        }
    }

    public a(@Y61.k ImageView imageView) {
        this.f3159b = imageView;
    }

    @Override // com.avito.android.image_loader.h
    public final void a(@Y61.k ImageRequest imageRequest) throws PackageManager.NameNotFoundException {
        com.bumptech.glide.i<Drawable> iVarL;
        PackageInfo packageInfo;
        com.bumptech.glide.i iVarN;
        ImageView imageView = this.f3159b;
        Activity activityA = C35835l0.a(imageView.getContext());
        if (activityA == null || !activityA.isDestroyed()) {
            Context context = imageView.getContext();
            com.bumptech.glide.util.k.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
            com.bumptech.glide.j jVarD = com.bumptech.glide.b.b(context).f338687g.d(context);
            ImageRequest.d dVar = imageRequest.f169447a;
            if (dVar instanceof ImageRequest.d.a) {
                Drawable drawable = ((ImageRequest.d.a) dVar).f169512a;
                com.bumptech.glide.i iVarD = jVarD.d(Drawable.class);
                iVarD.f338801A = drawable;
                iVarD.f338803C = true;
                iVarL = iVarD.a(new com.bumptech.glide.request.g().g(com.bumptech.glide.load.engine.l.f339088b));
            } else if (dVar instanceof ImageRequest.d.b) {
                iVarL = jVarD.l(((ImageRequest.d.b) dVar).f169514a.a(imageView));
            } else if (dVar instanceof ImageRequest.d.c) {
                Integer numValueOf = Integer.valueOf(((ImageRequest.d.c) dVar).f169515a);
                com.bumptech.glide.i iVarD2 = jVarD.d(Drawable.class);
                iVarD2.f338801A = numValueOf;
                iVarD2.f338803C = true;
                ConcurrentHashMap concurrentHashMap = C42314b.f405622a;
                Context context2 = iVarD2.f338804v;
                String packageName = context2.getPackageName();
                ConcurrentHashMap concurrentHashMap2 = C42314b.f405622a;
                com.bumptech.glide.load.h hVar = (com.bumptech.glide.load.h) concurrentHashMap2.get(packageName);
                if (hVar == null) {
                    try {
                        packageInfo = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                        context2.getPackageName();
                        packageInfo = null;
                    }
                    jW0.e eVar = new jW0.e(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
                    hVar = (com.bumptech.glide.load.h) concurrentHashMap2.putIfAbsent(packageName, eVar);
                    if (hVar == null) {
                        hVar = eVar;
                    }
                }
                iVarL = iVarD2.a(new com.bumptech.glide.request.g().s(new C42313a(context2.getResources().getConfiguration().uiMode & 48, hVar)));
            } else {
                if (!(dVar instanceof ImageRequest.d.C5013d)) {
                    throw new NoWhenBranchMatchedException();
                }
                iVarL = jVarD.l(((ImageRequest.d.C5013d) dVar).f169516a);
            }
            com.bumptech.glide.request.a aVarU = (com.bumptech.glide.i) iVarL.o(imageRequest.f169452f);
            Integer num = imageRequest.f169448b;
            if (num != null) {
                int iIntValue = num.intValue();
                com.bumptech.glide.i iVarK = ((com.bumptech.glide.i) aVarU.i(iIntValue)).k(iIntValue);
                if (iVarK != null) {
                    aVarU = iVarK;
                }
            }
            kotlin.collections.builders.b bVarT = C42745f0.t();
            if (imageRequest.f169449c) {
                bVarT.add(new com.bumptech.glide.load.resource.bitmap.l());
            }
            if (imageRequest.f169451e != null) {
                bVarT.add(new t(r4.f169506a, r4.f169507b, r4.f169508c, r4.f169509d));
            }
            Integer num2 = imageRequest.f169457k;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                FE0.a aVar = new FE0.a();
                aVar.f4652b = iIntValue2;
                bVarT.add(aVar);
            }
            com.bumptech.glide.load.n[] nVarArr = (com.bumptech.glide.load.n[]) C42745f0.p(bVarT).toArray(new com.bumptech.glide.load.n[0]);
            com.bumptech.glide.load.n<Bitmap>[] nVarArr2 = (com.bumptech.glide.load.n[]) Arrays.copyOf(nVarArr, nVarArr.length);
            aVarU.getClass();
            if (nVarArr2.length > 1) {
                aVarU = aVarU.u(new com.bumptech.glide.load.i(nVarArr2), true);
            } else if (nVarArr2.length == 1) {
                aVarU = aVarU.u(nVarArr2[0], true);
            } else {
                aVarU.q();
            }
            com.bumptech.glide.i iVar = (com.bumptech.glide.i) aVarU;
            new c.a();
            com.bumptech.glide.request.transition.c cVar = new com.bumptech.glide.request.transition.c();
            com.bumptech.glide.load.resource.drawable.c cVar2 = new com.bumptech.glide.load.resource.drawable.c();
            cVar2.f338826b = cVar;
            iVar.getClass();
            iVar.f338808z = cVar2;
            ImageRequest.c cVar3 = imageRequest.f169465s;
            if (cVar3 != null && (iVarN = iVar.n(cVar3.f169510a, cVar3.f169511b)) != null) {
                iVar = iVarN;
            }
            if (imageRequest.f169466t) {
                iVar = (com.bumptech.glide.i) iVar.v(DownsampleStrategy.f339333b, new com.bumptech.glide.load.resource.bitmap.n());
            }
            com.avito.android.image_loader.i iVar2 = imageRequest.f169454h;
            if (iVar2 != null) {
                iVar.B(new C0170a(iVar2, imageRequest, imageView));
            } else {
                iVar.A(imageView);
            }
        }
    }
}
