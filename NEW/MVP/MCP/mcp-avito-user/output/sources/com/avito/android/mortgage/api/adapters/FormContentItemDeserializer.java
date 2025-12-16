package com.avito.android.mortgage.api.adapters;

import LZ.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.form.FormContentItemType;
import com.avito.android.mortgage.api.model.items.form.InputFormContentItemValue;
import com.avito.android.mortgage.api.model.items.form.SuggestFormContentItemValue;
import com.avito.android.mortgage.api.model.items.form.b;
import com.avito.android.mortgage.api.model.items.form.d;
import com.avito.android.mortgage.api.model.items.form.e;
import com.avito.android.mortgage.api.model.items.form.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: FormContentItemDeserializer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/api/adapters/FormContentItemDeserializer;", "Lcom/google/gson/h;", "LLZ/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FormContentItemDeserializer implements h<c> {

    /* compiled from: FormContentItemDeserializer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f198200a;

        static {
            int[] iArr = new int[FormContentItemType.values().length];
            try {
                iArr[FormContentItemType.SELECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormContentItemType.INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormContentItemType.CHIPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FormContentItemType.CHECKBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FormContentItemType.BANNER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FormContentItemType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FormContentItemType.SUGGEST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FormContentItemType.CHILDREN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FormContentItemType.f198224b.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f198200a = iArr;
        }
    }

    @Override // com.google.gson.h
    public final c deserialize(i iVar, Type type, g gVar) {
        d dVar;
        k kVarI = iVar.i();
        i iVarD = kVarI.D("type");
        String strS = iVarD.s();
        FormContentItemType formContentItemType = (FormContentItemType) gVar.b(iVarD, FormContentItemType.class);
        if (formContentItemType == null) {
            formContentItemType = FormContentItemType.f198224b;
        }
        i iVarD2 = kVarI.D(strS);
        if (iVarD2 == null) {
            iVarD2 = null;
        }
        switch (a.f198200a[formContentItemType.ordinal()]) {
            case 1:
                i iVar2 = new i[]{iVarD2}[0];
                dVar = (d) (iVar2 == null ? null : gVar.b(iVar2, e.class));
                break;
            case 2:
                i iVar3 = new i[]{iVarD2}[0];
                dVar = (d) (iVar3 == null ? null : gVar.b(iVar3, InputFormContentItemValue.class));
                break;
            case 3:
                i iVar4 = new i[]{iVarD2}[0];
                dVar = (d) (iVar4 == null ? null : gVar.b(iVar4, com.avito.android.mortgage.api.model.items.form.c.class));
                break;
            case 4:
                i iVar5 = new i[]{iVarD2}[0];
                dVar = (d) (iVar5 == null ? null : gVar.b(iVar5, b.class));
                break;
            case 5:
                i iVar6 = new i[]{iVarD2}[0];
                dVar = (d) (iVar6 == null ? null : gVar.b(iVar6, com.avito.android.mortgage.api.model.items.form.a.class));
                break;
            case 6:
                i iVar7 = new i[]{iVarD2}[0];
                dVar = (d) (iVar7 == null ? null : gVar.b(iVar7, f.class));
                break;
            case 7:
                i iVar8 = new i[]{iVarD2}[0];
                dVar = (d) (iVar8 == null ? null : gVar.b(iVar8, SuggestFormContentItemValue.class));
                break;
            case 8:
                i iVar9 = new i[]{iVarD2}[0];
                dVar = (d) (iVar9 == null ? null : gVar.b(iVar9, LZ.b.class));
                break;
            case 9:
                dVar = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (dVar != null) {
            return new c(formContentItemType, dVar);
        }
        return null;
    }
}
