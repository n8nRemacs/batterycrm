package com.avito.android.cyclic_gallery_widget.image_carousel;

import com.avito.android.R;
import j.InterfaceC42165v;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CarouselActions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/ActionType;", "", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActionType {

    /* renamed from: d, reason: collision with root package name */
    public static final ActionType f131985d;

    /* renamed from: e, reason: collision with root package name */
    public static final ActionType f131986e;

    /* renamed from: f, reason: collision with root package name */
    public static final ActionType f131987f;

    /* renamed from: g, reason: collision with root package name */
    public static final ActionType f131988g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ActionType[] f131989h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f131990i;

    /* renamed from: b, reason: collision with root package name */
    public final int f131991b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f131992c;

    static {
        Integer numValueOf = Integer.valueOf(R.drawable.gallery_call_action_item_circle);
        ActionType actionType = new ActionType("CALL", 0, R.drawable.call_white, numValueOf);
        f131985d = actionType;
        ActionType actionType2 = new ActionType("CALL_ORDER", 1, R.drawable.call_white, numValueOf);
        f131986e = actionType2;
        ActionType actionType3 = new ActionType("WRITE", 2, R.drawable.message_white, Integer.valueOf(R.drawable.gallery_write_action_item_circle));
        f131987f = actionType3;
        ActionType actionType4 = new ActionType("ADD", 3, R.drawable.add_round_36x36, null);
        f131988g = actionType4;
        ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4, new ActionType("PRESENTATION", 4, R.drawable.presentation_36x36, null)};
        f131989h = actionTypeArr;
        f131990i = kotlin.enums.c.a(actionTypeArr);
    }

    public ActionType(@InterfaceC42165v String str, @InterfaceC42165v int i12, int i13, Integer num) {
        this.f131991b = i13;
        this.f131992c = num;
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) f131989h.clone();
    }
}
