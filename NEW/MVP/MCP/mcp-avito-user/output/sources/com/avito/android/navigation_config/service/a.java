package com.avito.android.navigation_config.service;

import com.avito.android.navigation_config.generated.api.get_navigation_config.GetNavigationConfigResponse;
import kotlin.Metadata;

/* compiled from: NavigationConfigResponseMapper.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_navigation-config_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: NavigationConfigResponseMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.navigation_config.service.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C6179a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207243a;

        static {
            int[] iArr = new int[GetNavigationConfigResponse.AlternativeMain.values().length];
            try {
                iArr[GetNavigationConfigResponse.AlternativeMain.Avito.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetNavigationConfigResponse.AlternativeMain.Business360.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f207243a = iArr;
        }
    }
}
