package com.avito.android.category_parameters;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/category_parameters/f;", "", "a", "b", "c", "Lcom/avito/android/category_parameters/f$a;", "Lcom/avito/android/category_parameters/f$b;", "Lcom/avito/android/category_parameters/f$c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SlotType f117642a;

    /* compiled from: SlotWrapper.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/f$a;", "Lcom/avito/android/category_parameters/f;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends f {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ParameterSlot f117643b;

        public a(@Y61.k SlotType slotType, @Y61.k ParameterSlot parameterSlot) {
            super(slotType, null);
            this.f117643b = parameterSlot;
        }
    }

    /* compiled from: SlotWrapper.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_parameters/f$b;", "Lcom/avito/android/category_parameters/f;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends f {
    }

    /* compiled from: SlotWrapper.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_parameters/f$c;", "Lcom/avito/android/category_parameters/f;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends f {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final c f117644b = new c();

        public c() {
            super(SlotType.OTHER, null);
        }
    }

    public f(SlotType slotType, C42822w c42822w) {
        this.f117642a = slotType;
    }
}
