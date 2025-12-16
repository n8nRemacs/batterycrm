package com.avito.android.str_calendar.seller.calandar_parameters.items.doubleselect;

import Y61.k;
import Y61.l;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DoubleSelectItemView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/doubleselect/DoubleSelectItemView;", "LTV0/e;", "InputState", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DoubleSelectItemView extends TV0.e {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DoubleSelectItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/doubleselect/DoubleSelectItemView$InputState;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InputState {

        /* renamed from: c, reason: collision with root package name */
        public static final InputState f287136c;

        /* renamed from: d, reason: collision with root package name */
        public static final InputState f287137d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ InputState[] f287138e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f287139f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final int[] f287140b;

        static {
            Input.f179303W.getClass();
            InputState inputState = new InputState(0, "NORMAL", Input.f179304a0);
            f287136c = inputState;
            InputState inputState2 = new InputState(1, "ERROR", Input.f179305b0);
            f287137d = inputState2;
            InputState[] inputStateArr = {inputState, inputState2, new InputState(2, "WARNING", Input.f179306c0)};
            f287138e = inputStateArr;
            f287139f = kotlin.enums.c.a(inputStateArr);
        }

        public InputState(int i12, String str, int[] iArr) {
            this.f287140b = iArr;
        }

        public static InputState valueOf(String str) {
            return (InputState) Enum.valueOf(InputState.class, str);
        }

        public static InputState[] values() {
            return (InputState[]) f287138e.clone();
        }
    }

    /* compiled from: DoubleSelectItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Ak(@k Y41.a<G0> aVar);

    void F20(@l String str);

    void ID(@k Y41.a<G0> aVar);

    void Vp(@k InputState inputState);

    void Zg(@l String str);

    void dt(@k String str);

    void pN(@k String str);

    void q40(@k InputState inputState);
}
