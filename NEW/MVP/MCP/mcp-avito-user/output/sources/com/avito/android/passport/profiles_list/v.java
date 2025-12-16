package com.avito.android.passport.profiles_list;

import com.avito.android.passport.network.model.ProfileStatus;
import kotlin.Metadata;

/* compiled from: ProfilesListResult.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_passport_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class v {

    /* compiled from: ProfilesListResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ProfileStatus.values().length];
            try {
                iArr[ProfileStatus.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileStatus.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfileStatus.FINALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
