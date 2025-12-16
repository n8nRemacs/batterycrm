package com.avito.android.iac_dialer_models.abstract_module;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacPii.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/b;", "", "<init>", "()V", "", "toStringUnmasked", "()Ljava/lang/String;", "toStringMasked", "toString", "Companion", "a", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);
    private static boolean shouldMask = true;

    /* compiled from: IacPii.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/b$a;", "", "<init>", "()V", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer_models.abstract_module.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    @k
    public final String toString() {
        return shouldMask ? toStringMasked() : toStringUnmasked();
    }

    @k
    public String toStringMasked() {
        return "***";
    }

    @k
    public abstract String toStringUnmasked();
}
