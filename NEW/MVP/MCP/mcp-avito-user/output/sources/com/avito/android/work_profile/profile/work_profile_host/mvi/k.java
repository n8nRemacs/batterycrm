package com.avito.android.work_profile.profile.work_profile_host.mvi;

import com.avito.android.work_profile.api.profile_tabs.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WorkProfileTabMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/profile/work_profile_host/mvi/k;", "", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k {

    /* compiled from: WorkProfileTabMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f331289a;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.ABOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.GIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.CVS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.APPLIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f331289a = iArr;
        }
    }

    @Inject
    public k() {
    }
}
