package com.avito.android.serp.adapter.vertical_main;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.search.WidgetSize;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.InterfaceC34866b;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.M;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalFilterItemGridConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/n;", "Lcom/avito/android/serp/adapter/vertical_main/m;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final M f273073a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g f273074b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34866b f273075c;

    /* compiled from: VerticalFilterItemGridConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f273076a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f273077b;

        static {
            int[] iArr = new int[WidgetType.values().length];
            try {
                iArr[WidgetType.Multiselect.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetType.Segmented.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetType.Checkbox.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WidgetType.AllFilters.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WidgetType.Group.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WidgetType.Boolean.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f273076a = iArr;
            int[] iArr2 = new int[WidgetSize.values().length];
            try {
                iArr2[WidgetSize.Large.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[WidgetSize.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f273077b = iArr2;
        }
    }

    @Inject
    public n(@Y61.k M m12, @Y61.k g gVar, @Y61.k InterfaceC34866b interfaceC34866b) {
        this.f273073a = m12;
        this.f273074b = gVar;
        this.f273075c = interfaceC34866b;
    }

    public static void b(ArrayList arrayList, int i12, int i13) {
        if (i12 < 0 || i12 > arrayList.size() - 1) {
            return;
        }
        arrayList.add(i12, ((com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e) arrayList.remove(i12)).a(i13));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8  */
    @Override // com.avito.android.serp.adapter.vertical_main.m
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(@Y61.k java.util.List r25, @Y61.l java.lang.Integer r26, boolean r27, boolean r28, @Y61.l com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem.ContentStyle r29) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.vertical_main.n.a(java.util.List, java.lang.Integer, boolean, boolean, com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem$ContentStyle):java.util.ArrayList");
    }
}
