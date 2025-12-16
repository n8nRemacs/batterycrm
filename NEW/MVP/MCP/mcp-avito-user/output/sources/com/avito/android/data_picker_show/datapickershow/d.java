package com.avito.android.data_picker_show.datapickershow;

import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.Picker;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DataPickerShowHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/data_picker_show/datapickershow/d;", "", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.bottom_sheet.d f132495a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f132496b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f132497c;

    /* compiled from: DataPickerShowHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/button/Button;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Button> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Button invoke() {
            return (Button) d.this.f132495a.findViewById(R.id.apply);
        }
    }

    /* compiled from: DataPickerShowHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/picker/Picker;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Picker> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Picker invoke() {
            return (Picker) d.this.f132495a.findViewById(R.id.data_picker);
        }
    }

    public d(@Y61.k com.avito.android.lib.design.bottom_sheet.d dVar) {
        this.f132495a = dVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f132496b = C42727D.b(lazyThreadSafetyMode, new b());
        this.f132497c = C42727D.b(lazyThreadSafetyMode, new a());
    }
}
