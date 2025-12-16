package com.avito.android.suggest_locations.deeplink;

import kotlin.Metadata;

/* compiled from: SuggestLocationsAddressLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_suggest-locations_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* compiled from: SuggestLocationsAddressLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f292293a;

        static {
            int[] iArr = new int[SuggestFlowType.values().length];
            try {
                iArr[SuggestFlowType.NOMAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuggestFlowType.HISTORICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuggestFlowType.REGION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f292293a = iArr;
        }
    }
}
