package com.avito.android.profile_settings_extended.adapter.phones;

import com.avito.android.remote.model.extended.PhoneEditValue;
import kotlin.Metadata;

/* compiled from: PhoneVerificationStatus.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-management_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o {

    /* compiled from: PhoneVerificationStatus.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f229735a;

        static {
            int[] iArr = new int[PhoneEditValue.Status.Type.values().length];
            try {
                iArr[PhoneEditValue.Status.Type.CONFIRMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhoneEditValue.Status.Type.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhoneEditValue.Status.Type.NOT_CONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f229735a = iArr;
        }
    }
}
