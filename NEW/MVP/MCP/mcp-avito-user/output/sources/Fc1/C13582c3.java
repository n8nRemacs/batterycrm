package Fc1;

import feedback.shared.sdk.api.network.entities.RequestType;

/* renamed from: Fc1.c3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C13582c3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5437a;

    static {
        int[] iArr = new int[RequestType.values().length];
        try {
            iArr[RequestType.GET_CAMPAIGNS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RequestType.POST_VISITS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RequestType.POST_ANSWERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f5437a = iArr;
    }
}
