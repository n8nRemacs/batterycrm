package com.avito.android.serp.adapter.skeleton;

import com.avito.android.remote.model.PresentationType;
import com.avito.android.serp.adapter.l1;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: SkeletonGenerator.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_serp-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* compiled from: SkeletonGenerator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f272236a;

        static {
            int[] iArr = new int[PresentationType.values().length];
            try {
                iArr[PresentationType.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PresentationType.SERP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PresentationType.FULL_MAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PresentationType.PUSH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PresentationType.SIMPLE_MAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PresentationType.REGULAR_MAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f272236a = iArr;
        }
    }

    @Y61.k
    public static final List<l1> a(@Y61.k c cVar, @Y61.k PresentationType presentationType, int i12) {
        switch (a.f272236a[presentationType.ordinal()]) {
            case 1:
                return C42745f0.h0(cVar.d(i12), Collections.singletonList(cVar.b()));
            case 2:
                return cVar.d(i12);
            case 3:
                return cVar.d(i12);
            case 4:
                return C42784z0.f406748b;
            case 5:
                return cVar.d(i12);
            case 6:
                return cVar.d(i12);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Y61.k
    public static final List<l1> b(@Y61.k c cVar, @Y61.k PresentationType presentationType, int i12) {
        return a.f272236a[presentationType.ordinal()] == 1 ? C42745f0.h0(cVar.d(i12), C42745f0.U(cVar.a(), cVar.e())) : C42784z0.f406748b;
    }

    @Y61.l
    public static final List<ShortcutNavigationItem> c(@Y61.k c cVar, @Y61.k PresentationType presentationType) {
        switch (a.f272236a[presentationType.ordinal()]) {
            case 1:
                return cVar.f();
            case 2:
                return cVar.c();
            case 3:
                return cVar.c();
            case 4:
                return null;
            case 5:
                return cVar.c();
            case 6:
                return cVar.c();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
