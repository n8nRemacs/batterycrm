package com.facebook.common.util;

import com.facebook.infer.annotation.Nullsafe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Nullsafe
/* loaded from: classes5.dex */
public final class TriState {

    /* renamed from: b, reason: collision with root package name */
    public static final TriState f339860b;

    /* renamed from: c, reason: collision with root package name */
    public static final TriState f339861c;

    /* renamed from: d, reason: collision with root package name */
    public static final TriState f339862d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TriState[] f339863e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f339864a;

        static {
            int[] iArr = new int[TriState.values().length];
            f339864a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339864a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f339864a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        TriState triState = new TriState("YES", 0);
        f339860b = triState;
        TriState triState2 = new TriState("NO", 1);
        f339861c = triState2;
        TriState triState3 = new TriState("UNSET", 2);
        f339862d = triState3;
        f339863e = new TriState[]{triState, triState2, triState3};
    }

    public TriState() {
        throw null;
    }

    public static TriState valueOf(String str) {
        return (TriState) Enum.valueOf(TriState.class, str);
    }

    public static TriState[] values() {
        return (TriState[]) f339863e.clone();
    }
}
