package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: GalleryPreview.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class X1 {

    /* compiled from: GalleryPreview.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.gallery.u> f65560l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<String> f65561m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.Q<String, com.akita.compose.component.gallery.u> q12, List<String> list) {
            super(3);
            this.f65560l = q12;
            this.f65561m = list;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.component.gallery.o.a(null, this.f65560l.f406620c, null, null, new W1(this.f65561m), a13, 0, 13);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: GalleryPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.gallery.u> f65562l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f65563m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, kotlin.Q q12) {
            super(2);
            this.f65562l = q12;
            this.f65563m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f65563m | 1);
            X1.a(this.f65562l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kotlin.Q<String, com.akita.compose.component.gallery.u> q12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(152761440);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(q12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            List listU = C42745f0.U("https://avito.st/static/ims/33a7cced-26e5-4d0b-b065-1ecb9e81f84f_gallery_example_1_common_1000x1249.webp", "https://avito.st/static/ims/6157df93-9c7a-40fe-9e56-a3f689dfbdb6_gallery_example_2_common_1620x1080.webp", "https://avito.st/static/ims/53d6ac47-e4eb-43f7-bb2f-50f551e9c21e_gallery_example_3_common_1200x568.webp", "https://avito.st/static/ims/5f783a74-e5d2-465c-b749-56bd96d34c62_gallery_example_4_common_1210x486.webp", "https://avito.st/static/ims/df91f1b8-39f3-413b-9ffc-c53dd0de941f_gallery_example_5_common_1425x1425.webp", "https://avito.st/static/ims/236cff9e-0464-4934-9830-a769fe9dfb9c_gallery_example_6_common_807x529.webp", "https://avito.st/static/ims/feff4bdd-4743-4e54-b6e2-435a8248fe81_gallery_example_7_common_683x1024.webp");
            String str = q12.f406619b;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            C27452s0.a(str, null, com.akita.compose.theme.re23.b.f63984b.f63851H1, 0.0f, null, androidx.compose.runtime.internal.r.c(-1354507062, new a(q12, listU), bE2), bE2, 196608, 26);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12, q12);
        }
    }
}
