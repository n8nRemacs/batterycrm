package com.avito.android.beduin.common.utils;

import com.avito.android.beduin.common.action.BeduinScrollToComponentAction;
import kotlin.Metadata;

/* compiled from: BeduinScrollToComponentActions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l {

    /* compiled from: BeduinScrollToComponentActions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103528a;

        static {
            int[] iArr = new int[BeduinScrollToComponentAction.ScrollPosition.values().length];
            try {
                iArr[BeduinScrollToComponentAction.ScrollPosition.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinScrollToComponentAction.ScrollPosition.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinScrollToComponentAction.ScrollPosition.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BeduinScrollToComponentAction.ScrollPosition.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BeduinScrollToComponentAction.ScrollPosition.CENTERED_VERTICALLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BeduinScrollToComponentAction.ScrollPosition.CENTERED_HORIZONTALLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f103528a = iArr;
        }
    }
}
