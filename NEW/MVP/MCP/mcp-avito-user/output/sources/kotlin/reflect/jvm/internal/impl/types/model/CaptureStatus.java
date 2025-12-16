package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TypeSystemContext.kt */
/* loaded from: classes8.dex */
public final class CaptureStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final CaptureStatus f410226b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ CaptureStatus[] f410227c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f410228d;

    static {
        CaptureStatus captureStatus = new CaptureStatus("FOR_SUBTYPING", 0);
        f410226b = captureStatus;
        CaptureStatus[] captureStatusArr = {captureStatus, new CaptureStatus("FOR_INCORPORATION", 1), new CaptureStatus("FROM_EXPRESSION", 2)};
        f410227c = captureStatusArr;
        f410228d = c.a(captureStatusArr);
    }

    public CaptureStatus() {
        throw null;
    }

    public static CaptureStatus valueOf(String str) {
        return (CaptureStatus) Enum.valueOf(CaptureStatus.class, str);
    }

    public static CaptureStatus[] values() {
        return (CaptureStatus[]) f410227c.clone();
    }
}
