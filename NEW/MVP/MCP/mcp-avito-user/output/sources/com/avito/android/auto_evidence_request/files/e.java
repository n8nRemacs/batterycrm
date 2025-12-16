package com.avito.android.auto_evidence_request.files;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;

/* compiled from: AutoEvidenceRequestFileUtils.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_evidence_request/files/e;", "", "<init>", "()V", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final e f95121a = new e();

    public static String a(Long l12) {
        float f12;
        String str;
        if (l12 == null || l12.longValue() == 0) {
            return "";
        }
        float fLongValue = l12.longValue();
        if (l12.longValue() > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            f12 = fLongValue / 1048576;
            str = "мб";
        } else {
            f12 = fLongValue / 1024;
            str = "кб";
        }
        u0 u0Var = u0.f406856a;
        return String.format("%.1f ".concat(str), Arrays.copyOf(new Object[]{Float.valueOf(f12)}, 1));
    }
}
