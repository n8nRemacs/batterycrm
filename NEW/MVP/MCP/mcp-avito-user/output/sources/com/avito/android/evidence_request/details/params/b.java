package com.avito.android.evidence_request.details.params;

import Y41.l;
import Y61.k;
import com.avito.android.evidence_request.details.params.disclaimer.f;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.BaseSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.information.InformationSlot;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;

/* compiled from: EvidenceParametersConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/details/params/b;", "Lcom/avito/android/evidence_request/details/params/a;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.evidence_request.details.params.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.category_parameters.a f148542a;

    /* compiled from: EvidenceParametersConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f148543a;

        static {
            int[] iArr = new int[SlotType.values().length];
            try {
                iArr[SlotType.INFORMATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f148543a = iArr;
        }
    }

    /* compiled from: _Sequences.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "kotlin/sequences/L", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.evidence_request.details.params.b$b, reason: collision with other inner class name */
    public static final class C4351b extends N implements l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4351b f148544l = new C4351b();

        public C4351b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Slot);
        }
    }

    /* compiled from: EvidenceParametersConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<BaseSlot, com.avito.android.category_parameters.k<?>> {
        @Override // Y41.l
        public final com.avito.android.category_parameters.k<?> invoke(BaseSlot baseSlot) {
            BaseSlot baseSlot2 = baseSlot;
            ((b) this.receiver).getClass();
            SlotType slotType = baseSlot2.getSlotType();
            if (a.f148543a[slotType.ordinal()] == 1) {
                return new f((InformationSlot) baseSlot2);
            }
            throw new UnsupportedOperationException(slotType.getStrValue());
        }
    }

    public b(@k com.avito.android.category_parameters.a aVar) {
        this.f148542a = aVar;
    }

    @Override // com.avito.android.evidence_request.details.params.a
    @k
    public final List<com.avito.conveyor_item.a> a(@k List<? extends ParameterSlot> list) {
        Set setF = C43033p.F(new o0(C43033p.i(new C42770s0(list), C4351b.f148544l), new c(1, this, b.class, "createSlot", "createSlot(Lcom/avito/android/remote/model/category_parameters/slot/BaseSlot;)Lcom/avito/android/category_parameters/SlotWrapperWithElements;", 0)));
        return com.avito.android.category_parameters.a.c(this.f148542a, new UV0.c(list), null, setF, null, 26);
    }
}
