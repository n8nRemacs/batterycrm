package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.remote.model.TfaSource;
import kotlin.Metadata;

/* compiled from: CodeConfirmationSourceUtils.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_code-confirmation_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Z {

    /* compiled from: CodeConfirmationSourceUtils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f119484a;

        static {
            int[] iArr = new int[TfaSource.values().length];
            try {
                iArr[TfaSource.ANTIHACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TfaSource.TFA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f119484a = iArr;
        }
    }
}
