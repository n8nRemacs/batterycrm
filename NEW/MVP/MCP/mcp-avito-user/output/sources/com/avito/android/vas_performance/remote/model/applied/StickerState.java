package com.avito.android.vas_performance.remote.model.applied;

import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppliedSticker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/remote/model/applied/StickerState;", "", "(Ljava/lang/String;I)V", "SELECTED", "DISABLED", "NONE", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StickerState {

    @c(BeduinCartItemModel.DISABLED_STRING)
    public static final StickerState DISABLED;

    @c("")
    public static final StickerState NONE;

    @c("selected")
    public static final StickerState SELECTED;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ StickerState[] f320220b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f320221c;

    static {
        StickerState stickerState = new StickerState("SELECTED", 0);
        SELECTED = stickerState;
        StickerState stickerState2 = new StickerState("DISABLED", 1);
        DISABLED = stickerState2;
        StickerState stickerState3 = new StickerState("NONE", 2);
        NONE = stickerState3;
        StickerState[] stickerStateArr = {stickerState, stickerState2, stickerState3};
        f320220b = stickerStateArr;
        f320221c = kotlin.enums.c.a(stickerStateArr);
    }

    private StickerState(String str, int i12) {
    }

    public static StickerState valueOf(String str) {
        return (StickerState) Enum.valueOf(StickerState.class, str);
    }

    public static StickerState[] values() {
        return (StickerState[]) f320220b.clone();
    }
}
