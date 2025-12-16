package com.avito.android.verification.verification_finish;

import com.avito.android.remote.model.common.VerificationAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationFinishConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_finish/d;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.common.a f325244a;

    /* compiled from: VerificationFinishConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f325245a;

        static {
            int[] iArr = new int[VerificationAction.Style.values().length];
            try {
                iArr[VerificationAction.Style.SECONDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationAction.Style.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f325245a = iArr;
        }
    }

    @Inject
    public d(@Y61.k com.avito.android.verification.common.a aVar) {
        this.f325244a = aVar;
    }
}
