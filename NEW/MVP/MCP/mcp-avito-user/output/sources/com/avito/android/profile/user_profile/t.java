package com.avito.android.profile.user_profile;

import com.avito.android.remote.model.user_profile.items.ProfileStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserProfileItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class t {

    /* compiled from: UserProfileItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f226588a;

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
            f226588a = iArr;
        }
    }
}
