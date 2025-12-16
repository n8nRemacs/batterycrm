package com.avito.android.beduin.common.container.layered;

import kotlin.Metadata;

/* compiled from: ForegroundChildLayoutParamsMapper.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j {

    /* compiled from: ForegroundChildLayoutParamsMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103152a;

        static {
            int[] iArr = new int[LayeredContainerLayoutMode.values().length];
            try {
                iArr[LayeredContainerLayoutMode.BY_CONTENT_SIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayeredContainerLayoutMode.FILL_HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f103152a = iArr;
        }
    }
}
