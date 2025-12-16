package com.avito.android.remote.parse.adapter;

import com.avito.android.Q1;
import com.avito.android.remote.model.category_parameters.slot.BaseSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.SlotWithValue;
import com.avito.android.remote.model.category_parameters.slot.UnknownTypeSlot;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.s0;

/* compiled from: SlotAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/SlotAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/category_parameters/slot/BaseSlot;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SlotAdapter implements com.google.gson.h<BaseSlot> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Q1 f254244a;

    /* compiled from: SlotAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f254245a;

        static {
            int[] iArr = new int[SlotType.values().length];
            try {
                iArr[SlotType.VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SlotType.IMAGES_ENHANCEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f254245a = iArr;
        }
    }

    public SlotAdapter(@Y61.k Q1 q12) {
        this.f254244a = q12;
    }

    @Override // com.google.gson.h
    public final BaseSlot deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        SlotType slotTypeValueOfStr = SlotType.INSTANCE.valueOfStr(kVarI.I("widget").D("type").s());
        int i12 = a.f254245a[slotTypeValueOfStr.ordinal()];
        Q1 q12 = this.f254244a;
        boolean zBooleanValue = true;
        if (i12 == 1) {
            q12.getClass();
            kotlin.reflect.n<Object> nVar = Q1.f67448x0[4];
            zBooleanValue = ((Boolean) q12.f67484f.a().invoke()).booleanValue();
        } else if (i12 == 2) {
            q12.getClass();
            kotlin.reflect.n<Object> nVar2 = Q1.f67448x0[48];
            zBooleanValue = ((Boolean) q12.f67470V.a().invoke()).booleanValue();
        }
        if (!zBooleanValue) {
            slotTypeValueOfStr = null;
        }
        if (slotTypeValueOfStr == null || slotTypeValueOfStr == SlotType.OTHER) {
            String strS = kVarI.D("id").s();
            if (strS == null) {
                strS = "";
            }
            return new UnknownTypeSlot(strS);
        }
        BaseSlot baseSlot = (BaseSlot) gVar.b(kVarI, ((InterfaceC42819t) slotTypeValueOfStr.getSlotClass()).f());
        if (!(baseSlot instanceof SlotWithValue)) {
            return baseSlot;
        }
        ((SlotWithValue) baseSlot).initWidget$_avito_discouraged_avito_api_publish();
        return baseSlot;
    }
}
