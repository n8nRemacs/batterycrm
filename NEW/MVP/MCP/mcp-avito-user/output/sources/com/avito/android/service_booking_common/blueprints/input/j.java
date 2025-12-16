package com.avito.android.service_booking_common.blueprints.input;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.s;
import com.avito.android.service_booking_common.blueprints.SbInputItem;
import kotlin.Metadata;

/* compiled from: SbInputViewHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/input/j;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f276448e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Input f276449b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f276450c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public s f276451d;

    /* compiled from: SbInputViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f276452a;

        static {
            int[] iArr = new int[SbInputItem.Format.values().length];
            try {
                SbInputItem.Format format = SbInputItem.Format.f276233b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f276452a = iArr;
        }
    }

    public j(@Y61.k View view) {
        super(view);
        this.f276449b = (Input) this.itemView.findViewById(R.id.sb_input);
        this.f276450c = (ComponentContainer) this.itemView.findViewById(R.id.sb_input_container);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        s sVar = this.f276451d;
        Input input = this.f276449b;
        if (sVar != null) {
            input.h(sVar);
        }
        input.setClearButtonListener(null);
        input.setOnFocusChangeListener(null);
    }
}
