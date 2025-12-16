package com.avito.android.advert.advert_details_popup;

import Y61.k;
import com.avito.android.advert.advert_details_popup.f;
import com.avito.android.remote.model.AdvertNavBarActionType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PopupUIItemInfo.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h {

    /* compiled from: PopupUIItemInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68631a;

        static {
            int[] iArr = new int[AdvertNavBarActionType.values().length];
            try {
                iArr[AdvertNavBarActionType.FAVORITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertNavBarActionType.SHARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvertNavBarActionType.COMPARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvertNavBarActionType.DOWNLOAD_PDF_FILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvertNavBarActionType.DOWNLOAD_DOCX_FILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdvertNavBarActionType.OTHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f68631a = iArr;
        }
    }

    @k
    public static final f a(@k AdvertNavBarActionType advertNavBarActionType) {
        switch (a.f68631a[advertNavBarActionType.ordinal()]) {
            case 1:
                return f.c.f68623a;
            case 2:
                return f.e.f68625a;
            case 3:
                return f.a.f68621a;
            case 4:
                return new f.b("pdf");
            case 5:
                return new f.b("docx");
            case 6:
                return f.d.f68624a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
