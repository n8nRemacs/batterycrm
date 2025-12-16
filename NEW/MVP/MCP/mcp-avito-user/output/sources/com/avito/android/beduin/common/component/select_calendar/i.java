package com.avito.android.beduin.common.component.select_calendar;

import Y61.k;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.utils.x;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.ComponentType;
import com.avito.android.lib.design.input.Input;
import ej.InterfaceC40116e;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectCalendarViewContainer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/select_calendar/i;", "Lej/e;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements InterfaceC40116e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ComponentContainer f102462b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f102463c;

    /* compiled from: SelectCalendarViewContainer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/select_calendar/i$a;", "", "<init>", "()V", "", "CALENDAR_COMPONENT_MAX_LINES", "I", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public i(@k ContextThemeWrapper contextThemeWrapper, @k ViewGroup.LayoutParams layoutParams, @k BeduinSelectCalendarModel beduinSelectCalendarModel) {
        ComponentContainer componentContainer = new ComponentContainer(contextThemeWrapper);
        componentContainer.setId(View.generateViewId());
        componentContainer.setLayoutParams(layoutParams);
        Input input = new Input(contextThemeWrapper, null, 0, 0, 14, null);
        this.f102463c = input;
        input.setId(R.id.beduin_select_calendar_input);
        input.setTag(beduinSelectCalendarModel.getF100853b());
        input.setComponentType(ComponentType.f179284e);
        x.a(input, 1);
        input.setHint(R.string.beduin_calendar_select_placeholder_text);
        componentContainer.addView(input, componentContainer.getLayoutParams());
        this.f102462b = componentContainer;
    }

    @Override // ej.InterfaceC40116e
    /* renamed from: getRoot */
    public final View getF103243b() {
        return this.f102462b;
    }
}
