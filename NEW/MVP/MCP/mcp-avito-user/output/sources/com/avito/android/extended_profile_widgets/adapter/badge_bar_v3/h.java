package com.avito.android.extended_profile_widgets.adapter.badge_bar_v3;

import Y61.k;
import Y61.l;
import android.content.ContentResolver;
import android.net.Uri;
import android.view.View;
import cX0.C27123f;
import com.avito.android.extended_profile_ui_components.BadgeBarV3View;
import com.avito.android.extended_profile_ui_components.i;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import com.facebook.common.internal.o;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.cache.B;
import com.facebook.imagepipeline.cache.C36378k;
import com.facebook.imagepipeline.cache.D;
import com.facebook.imagepipeline.cache.L;
import com.facebook.imagepipeline.core.A;
import com.facebook.imagepipeline.core.p;
import com.facebook.imagepipeline.core.r;
import com.facebook.imagepipeline.core.t;
import com.facebook.imagepipeline.core.u;
import com.facebook.imagepipeline.core.z;
import com.facebook.imagepipeline.memory.E;
import com.facebook.imagepipeline.memory.F;
import com.facebook.imagepipeline.producers.y0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.l0;

/* compiled from: BadgeBarV3ItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/badge_bar_v3/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/badge_bar_v3/g;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f154232c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BadgeBarV3View f154233b;

    public h(@k View view) {
        super(view);
        this.f154233b = (BadgeBarV3View) view;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.badge_bar_v3.g
    public final void A00(@l String str, @k ArrayList arrayList) {
        BadgeBarV3View badgeBarV3View;
        List list;
        ArrayList arrayList2;
        l0.f fVar;
        t tVar;
        L l12;
        L l13;
        com.facebook.imagepipeline.decoder.b bVarC;
        com.facebook.imagepipeline.decoder.b bVarB;
        BadgeBarV3View badgeBarV3View2 = this.f154233b;
        badgeBarV3View2.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            Uri uriD = null;
            if (!it.hasNext()) {
                break;
            }
            Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault((UniversalImage) it.next(), com.avito.android.lib.util.darkTheme.c.b(badgeBarV3View2.getContext()));
            if (imageDependsOnThemeOrDefault != null) {
                int i12 = BadgeBarV3View.f153279n;
                uriD = C35829k2.b(imageDependsOnThemeOrDefault, i12, i12, 0.0f, 2, 44).d();
            }
            if (uriD != null) {
                arrayList3.add(uriD);
            }
        }
        badgeBarV3View2.f153282b = arrayList3;
        badgeBarV3View2.f153284d = str;
        List listE0 = C42745f0.E0(arrayList3, 5);
        int size = listE0.size();
        ArrayList arrayList4 = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            arrayList4.add(null);
        }
        l0.f fVar2 = new l0.f();
        u uVar = u.f340344t;
        o.c(uVar, "ImagePipelineFactory was not initialized!");
        if (uVar.f340355k == null) {
            r rVar = uVar.f340346b;
            rVar.f340322u.getClass();
            A a12 = uVar.f340358n;
            y0 y0Var = uVar.f340345a;
            L l14 = rVar.f340310i;
            t tVar2 = rVar.f340322u;
            if (a12 == null) {
                ContentResolver contentResolver = rVar.f340305d.getApplicationContext().getContentResolver();
                if (uVar.f340357m == null) {
                    t.c cVar = tVar2.f340335a;
                    F f12 = rVar.f340316o;
                    if (f12.f340442h == null) {
                        E e12 = f12.f340435a;
                        fVar = fVar2;
                        arrayList2 = arrayList4;
                        f12.f340442h = new com.facebook.imagepipeline.memory.t(e12.f340428d, e12.f340431g, e12.f340432h);
                    } else {
                        arrayList2 = arrayList4;
                        fVar = fVar2;
                    }
                    com.facebook.imagepipeline.memory.t tVar3 = f12.f340442h;
                    if (uVar.f340354j == null) {
                        TW0.a aVarA = uVar.a();
                        if (aVarA != null) {
                            bVarB = aVarA.b();
                            bVarC = aVarA.c();
                        } else {
                            bVarC = null;
                            bVarB = null;
                        }
                        badgeBarV3View = badgeBarV3View2;
                        uVar.f340354j = new com.facebook.imagepipeline.decoder.a(bVarB, bVarC, uVar.e());
                    } else {
                        badgeBarV3View = badgeBarV3View2;
                    }
                    com.facebook.imagepipeline.decoder.b bVar = uVar.f340354j;
                    com.facebook.imagepipeline.decoder.f fVar3 = rVar.f340317p;
                    com.facebook.imagepipeline.core.b bVar2 = rVar.f340309h;
                    wW0.g gVarB = f12.b(rVar.f340314m);
                    f12.c();
                    if (uVar.f340349e == null) {
                        uVar.f340349e = D.a(uVar.b(), l14);
                    }
                    B<com.facebook.cache.common.c, YW0.b> b12 = uVar.f340349e;
                    B<com.facebook.cache.common.c, PooledByteBuffer> bC2 = uVar.c();
                    C36378k c36378kD = uVar.d();
                    C36378k c36378kF = uVar.f();
                    l13 = l14;
                    if (uVar.f340361q == null) {
                        uVar.e();
                        list = listE0;
                        uVar.f340361q = new com.facebook.imagepipeline.bitmaps.a(f12.a(), uVar.f340347c);
                    } else {
                        list = listE0;
                    }
                    com.facebook.imagepipeline.bitmaps.a aVar = uVar.f340361q;
                    cVar.getClass();
                    uVar.f340357m = new z(rVar.f340305d, tVar3, bVar, fVar3, rVar.f340306e, rVar.f340320s, bVar2, gVarB, b12, bC2, c36378kD, c36378kF, rVar.f340304c, aVar, uVar.f340347c, tVar2.f340339e);
                } else {
                    badgeBarV3View = badgeBarV3View2;
                    list = listE0;
                    arrayList2 = arrayList4;
                    fVar = fVar2;
                    l13 = l14;
                }
                z zVar = uVar.f340357m;
                tVar2.getClass();
                if (uVar.f340356l == null) {
                    uVar.f340356l = new C27123f(null, null, tVar2.f340338d);
                }
                tVar = tVar2;
                l12 = l13;
                uVar.f340358n = new A(contentResolver, zVar, rVar.f340315n, rVar.f340320s, y0Var, rVar.f340306e, rVar.f340323v, uVar.f340356l);
            } else {
                badgeBarV3View = badgeBarV3View2;
                list = listE0;
                arrayList2 = arrayList4;
                fVar = fVar2;
                tVar = tVar2;
                l12 = l14;
            }
            A a13 = uVar.f340358n;
            Set setUnmodifiableSet = Collections.unmodifiableSet(rVar.f340318q);
            Set setUnmodifiableSet2 = Collections.unmodifiableSet(rVar.f340319r);
            com.facebook.common.internal.r<Boolean> rVar2 = rVar.f340311j;
            if (uVar.f340349e == null) {
                uVar.f340349e = D.a(uVar.b(), l12);
            }
            B<com.facebook.cache.common.c, YW0.b> b13 = uVar.f340349e;
            B<com.facebook.cache.common.c, PooledByteBuffer> bC3 = uVar.c();
            uVar.d();
            uVar.f340355k = new p(a13, setUnmodifiableSet, setUnmodifiableSet2, rVar2, b13, bC3, uVar.f(), rVar.f340304c, y0Var, tVar.f340336b, null, rVar);
        } else {
            badgeBarV3View = badgeBarV3View2;
            list = listE0;
            arrayList2 = arrayList4;
            fVar = fVar2;
        }
        p pVar = uVar.f340355k;
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            ImageRequestBuilder imageRequestBuilderB = ImageRequestBuilder.b((Uri) obj);
            int i16 = BadgeBarV3View.f153279n;
            imageRequestBuilderB.f340805c = new UW0.d(i16, i16);
            BadgeBarV3View badgeBarV3View3 = badgeBarV3View;
            imageRequestBuilderB.f340811i = badgeBarV3View3.f153293m;
            pVar.a(imageRequestBuilderB.a(), null).d(new i(arrayList2, i14, fVar, list, badgeBarV3View3), com.facebook.common.executors.a.f339811b);
            i14 = i15;
            badgeBarV3View = badgeBarV3View3;
        }
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.badge_bar_v3.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f154233b.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(22, aVar));
    }
}
