package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_settings_extended.adapter.gallery.appending.ImageAppendingItem;
import com.avito.android.profile_settings_extended.adapter.gallery.gallery_header.GalleryHeaderItem;
import com.avito.android.profile_settings_extended.entity.GalleryWidgetItemsGroup;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileSettingsReducer.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/mvi/Q;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lcom/avito/android/profile_settings_extended/mvi/entity/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Q implements com.avito.android.arch.mvi.u<ExtendedProfileSettingsInternalAction, com.avito.android.profile_settings_extended.mvi.entity.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_settings_extended.carousel.a f230495b;

    /* compiled from: ExtendedProfileSettingsReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[UploadImage.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UploadImage.Type type = UploadImage.Type.f226690b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UploadImage.Type type2 = UploadImage.Type.f226690b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                UploadImage.Type type3 = UploadImage.Type.f226690b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                UploadImage.Type type4 = UploadImage.Type.f226690b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                UploadImage.Type type5 = UploadImage.Type.f226690b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Inject
    public Q(@Y61.k com.avito.android.profile_settings_extended.carousel.a aVar) {
        this.f230495b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.profile_settings_extended.mvi.entity.a b(com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction.ImagesInternalAction r18, com.avito.android.profile_settings_extended.mvi.entity.a r19) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.Q.b(com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$ImagesInternalAction, com.avito.android.profile_settings_extended.mvi.entity.a):com.avito.android.profile_settings_extended.mvi.entity.a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.profile_settings_extended.mvi.entity.a c(com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction.UniversalWidgetInternalAction r14, com.avito.android.profile_settings_extended.mvi.entity.a r15) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.Q.c(com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$UniversalWidgetInternalAction, com.avito.android.profile_settings_extended.mvi.entity.a):com.avito.android.profile_settings_extended.mvi.entity.a");
    }

    public static com.avito.android.profile_settings_extended.mvi.entity.a d(com.avito.android.profile_settings_extended.mvi.entity.a aVar, com.avito.android.profile_settings_extended.entity.u uVar) {
        return uVar != null ? com.avito.android.profile_settings_extended.mvi.entity.a.a(aVar, g(uVar), null, false, null, null, null, null, null, null, null, null, 2046) : aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.profile_settings_extended.mvi.entity.a e(com.avito.android.profile_settings_extended.mvi.entity.a r16, com.avito.android.profile_management_core.images.entity.UploadImage.ImageFromPhotoPicker r17) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.Q.e(com.avito.android.profile_settings_extended.mvi.entity.a, com.avito.android.profile_management_core.images.entity.UploadImage$ImageFromPhotoPicker):com.avito.android.profile_settings_extended.mvi.entity.a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.profile_settings_extended.mvi.entity.a f(com.avito.android.profile_settings_extended.mvi.entity.a r7, java.lang.String r8, java.lang.String r9, Y41.l r10) {
        /*
            r0 = 0
            com.avito.android.profile_settings_extended.entity.u r1 = r7.f230661b
            if (r1 == 0) goto L3f
            java.util.List<com.avito.android.profile_settings_extended.entity.v> r1 = r1.f230357b
            if (r1 == 0) goto L3f
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
        Le:
            boolean r4 = r2.hasNext()
            r5 = -1
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r2.next()
            com.avito.android.profile_settings_extended.entity.v r4 = (com.avito.android.profile_settings_extended.entity.v) r4
            boolean r6 = r4 instanceof com.avito.android.profile_settings_extended.entity.t
            if (r6 == 0) goto L2c
            com.avito.android.profile_settings_extended.entity.t r4 = (com.avito.android.profile_settings_extended.entity.t) r4
            com.avito.android.profile_settings_extended.adapter.item_selections.SelectionsItem r4 = r4.f230354b
            java.lang.String r4 = r4.f229521c
            boolean r4 = kotlin.jvm.internal.L.f(r4, r8)
            if (r4 == 0) goto L2c
            goto L30
        L2c:
            int r3 = r3 + 1
            goto Le
        L2f:
            r3 = r5
        L30:
            if (r3 == r5) goto L3f
            java.lang.Object r8 = r1.get(r3)
            boolean r1 = r8 instanceof com.avito.android.profile_settings_extended.entity.t
            if (r1 != 0) goto L3b
            r8 = r0
        L3b:
            com.avito.android.profile_settings_extended.entity.t r8 = (com.avito.android.profile_settings_extended.entity.t) r8
            if (r8 != 0) goto L41
        L3f:
            r1 = r0
            goto L46
        L41:
            kotlin.collections.H0 r1 = new kotlin.collections.H0
            r1.<init>(r3, r8)
        L46:
            if (r1 != 0) goto L49
            return r7
        L49:
            T r8 = r1.f406644b
            com.avito.android.profile_settings_extended.entity.t r8 = (com.avito.android.profile_settings_extended.entity.t) r8
            com.avito.android.profile_settings_extended.adapter.item_selections.SelectionsItem r2 = r8.f230354b
            java.util.List<com.avito.android.profile_settings_extended.adapter.item_selections.adapter.SelectionsRecyclerItem> r3 = r2.f229524f
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L5c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L83
            java.lang.Object r5 = r3.next()
            com.avito.android.profile_settings_extended.adapter.item_selections.adapter.SelectionsRecyclerItem r5 = (com.avito.android.profile_settings_extended.adapter.item_selections.adapter.SelectionsRecyclerItem) r5
            boolean r6 = r5 instanceof com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.SelectionItem
            if (r6 == 0) goto L7d
            r6 = r5
            com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.SelectionItem r6 = (com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.SelectionItem) r6
            java.lang.String r6 = r6.f229561g
            boolean r6 = kotlin.jvm.internal.L.f(r6, r9)
            if (r6 == 0) goto L7d
            java.lang.Object r5 = r10.invoke(r5)
            com.avito.android.profile_settings_extended.adapter.item_selections.adapter.SelectionsRecyclerItem r5 = (com.avito.android.profile_settings_extended.adapter.item_selections.adapter.SelectionsRecyclerItem) r5
        L7d:
            if (r5 == 0) goto L5c
            r4.add(r5)
            goto L5c
        L83:
            r9 = 111(0x6f, float:1.56E-43)
            com.avito.android.profile_settings_extended.adapter.item_selections.SelectionsItem r9 = com.avito.android.profile_settings_extended.adapter.item_selections.SelectionsItem.a(r2, r4, r0, r9)
            java.lang.String r8 = r8.f230353a
            com.avito.android.profile_settings_extended.entity.t r10 = new com.avito.android.profile_settings_extended.entity.t
            r10.<init>(r8, r9)
            int r8 = r1.f406643a
            com.avito.android.profile_settings_extended.mvi.entity.a r7 = h(r7, r8, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.Q.f(com.avito.android.profile_settings_extended.mvi.entity.a, java.lang.String, java.lang.String, Y41.l):com.avito.android.profile_settings_extended.mvi.entity.a");
    }

    public static com.avito.android.profile_settings_extended.entity.u g(com.avito.android.profile_settings_extended.entity.u uVar) {
        List<com.avito.android.profile_settings_extended.entity.v> list = uVar.f230357b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t tVarA : list) {
            if (tVarA instanceof GalleryWidgetItemsGroup) {
                GalleryWidgetItemsGroup galleryWidgetItemsGroup = (GalleryWidgetItemsGroup) tVarA;
                ArrayList arrayList2 = new ArrayList();
                int size = galleryWidgetItemsGroup.f230286f.size();
                arrayList2.add(new GalleryHeaderItem(null, galleryWidgetItemsGroup.f230283c, size == 0 ? galleryWidgetItemsGroup.f230284d : galleryWidgetItemsGroup.f230285e, galleryWidgetItemsGroup.f230290j, 1, null));
                int i12 = galleryWidgetItemsGroup.f230287g - size;
                if (i12 > 0) {
                    arrayList2.add(new ImageAppendingItem(null, galleryWidgetItemsGroup.f230282b, i12, galleryWidgetItemsGroup.f230288h, galleryWidgetItemsGroup.f230290j, 1, null));
                }
                arrayList2.addAll(galleryWidgetItemsGroup.f230286f);
                tVarA = GalleryWidgetItemsGroup.a(galleryWidgetItemsGroup, null, arrayList2, 1023);
            }
            arrayList.add(tVarA);
        }
        return com.avito.android.profile_settings_extended.entity.u.a(uVar, arrayList);
    }

    public static com.avito.android.profile_settings_extended.mvi.entity.a h(com.avito.android.profile_settings_extended.mvi.entity.a aVar, int i12, com.avito.android.profile_settings_extended.entity.v vVar) {
        com.avito.android.profile_settings_extended.entity.u uVarA;
        com.avito.android.profile_settings_extended.entity.u uVar = aVar.f230661b;
        if (uVar != null) {
            ArrayList arrayList = new ArrayList(uVar.f230357b);
            arrayList.set(i12, vVar);
            G0 g02 = G0.f406611a;
            uVarA = com.avito.android.profile_settings_extended.entity.u.a(uVar, arrayList);
        } else {
            uVarA = null;
        }
        return d(aVar, uVarA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:621:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:623:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:628:? A[RETURN, SYNTHETIC] */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.profile_settings_extended.mvi.entity.a a(com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction r24, com.avito.android.profile_settings_extended.mvi.entity.a r25) {
        /*
            Method dump skipped, instructions count: 2492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.Q.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
