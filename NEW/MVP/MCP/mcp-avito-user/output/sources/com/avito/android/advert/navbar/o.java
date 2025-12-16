package com.avito.android.advert.navbar;

import com.avito.android.remote.model.AdvertNavBarActionType;
import kotlin.Metadata;

/* compiled from: AdvertDetailsNavBarDelegate.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o {

    /* compiled from: AdvertDetailsNavBarDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80861a;

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
                iArr[AdvertNavBarActionType.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvertNavBarActionType.DOWNLOAD_PDF_FILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdvertNavBarActionType.DOWNLOAD_DOCX_FILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f80861a = iArr;
        }
    }
}
