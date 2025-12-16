package com.avito.android.remote;

import com.avito.android.remote.config.generated.api.api_4_config_by_config_get.Api4ConfigByConfigGetResponse;
import kotlin.Metadata;

/* compiled from: ConfigApiRepository.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-api_config"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.w, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34394w {

    /* compiled from: ConfigApiRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.w$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f254402a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f254403b;

        static {
            int[] iArr = new int[Api4ConfigByConfigGetResponse.UpdateSource.values().length];
            try {
                iArr[Api4ConfigByConfigGetResponse.UpdateSource.Official.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Api4ConfigByConfigGetResponse.UpdateSource.Custom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Api4ConfigByConfigGetResponse.UpdateSource.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f254402a = iArr;
            int[] iArr2 = new int[Api4ConfigByConfigGetResponse.UpdateSourceType.values().length];
            try {
                iArr2[Api4ConfigByConfigGetResponse.UpdateSourceType.Official.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Api4ConfigByConfigGetResponse.UpdateSourceType.Custom.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Api4ConfigByConfigGetResponse.UpdateSourceType.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Api4ConfigByConfigGetResponse.UpdateSourceType.SelfUpdate.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f254403b = iArr2;
        }
    }
}
