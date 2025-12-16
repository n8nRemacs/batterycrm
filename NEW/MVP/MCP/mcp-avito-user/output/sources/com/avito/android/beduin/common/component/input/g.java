package com.avito.android.beduin.common.component.input;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import ej.InterfaceC40117f;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InputViewContainer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/input/g;", "Lej/f;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements InterfaceC40117f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f101548b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f101549c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f101550d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f101551e;

    /* compiled from: InputViewContainer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101552a;

        static {
            int[] iArr = new int[InputLayoutMode.values().length];
            try {
                iArr[InputLayoutMode.FILL_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputLayoutMode.BY_CONTENT_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f101552a = iArr;
        }
    }

    public g(@Y61.k androidx.appcompat.view.d dVar, @Y61.k ViewGroup.LayoutParams layoutParams, boolean z12) {
        Input input = new Input(dVar, null, 0, 0, 14, null);
        this.f101549c = input;
        this.f101550d = new io.reactivex.rxjava3.disposables.c();
        this.f101551e = new io.reactivex.rxjava3.disposables.c();
        ComponentContainer componentContainer = new ComponentContainer(dVar);
        componentContainer.setId(R.id.beduin_input_container);
        componentContainer.setLayoutParams(layoutParams);
        input.setId(R.id.beduin_input);
        if (z12) {
            input.r();
        }
        componentContainer.addView(input, componentContainer.getLayoutParams());
        this.f101548b = componentContainer;
    }

    @Override // ej.InterfaceC40117f
    public final void e() {
        this.f101549c.v();
    }

    @Override // ej.InterfaceC40116e
    /* renamed from: getRoot */
    public final View getF103243b() {
        return this.f101548b;
    }
}
