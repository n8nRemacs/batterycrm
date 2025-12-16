package com.avito.android.mortgage.api.adapters;

import KZ.B;
import KZ.C14271a;
import KZ.C14277g;
import KZ.C14282l;
import KZ.C14283m;
import KZ.C14284n;
import KZ.C14285o;
import KZ.C14287q;
import KZ.C14288s;
import KZ.C14289t;
import KZ.D;
import KZ.E;
import KZ.F;
import KZ.G;
import KZ.InterfaceC14286p;
import KZ.J;
import KZ.r;
import KZ.u;
import KZ.v;
import KZ.y;
import KZ.z;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.application.ApplicationContentItemType;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: ApplicationContentItemDeserializer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/api/adapters/ApplicationContentItemDeserializer;", "Lcom/google/gson/h;", "LKZ/o;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ApplicationContentItemDeserializer implements h<C14285o> {

    /* compiled from: ApplicationContentItemDeserializer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f198199a;

        static {
            int[] iArr = new int[ApplicationContentItemType.values().length];
            try {
                iArr[ApplicationContentItemType.ISSUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApplicationContentItemType.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApplicationContentItemType.BORROWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApplicationContentItemType.ADD_CO_BORROWER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApplicationContentItemType.PROCESS_ACTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApplicationContentItemType.DISCLAIMER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApplicationContentItemType.PRIVACY_POLICY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApplicationContentItemType.APPLICATION_STATUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApplicationContentItemType.APPEALS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ApplicationContentItemType.APPEAL_BANNER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ApplicationContentItemType.CTA_BANNER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ApplicationContentItemType.IMMUTABLE_INFO.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ApplicationContentItemType.INFO_BANNER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ApplicationContentItemType.STATUS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ApplicationContentItemType.TEAM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ApplicationContentItemType.APPLICATION_COMMENT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ApplicationContentItemType.REALTY_OBJECT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ApplicationContentItemType.MORTGAGE_PROGRESS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ApplicationContentItemType.REALTY_OBJECT_DETAILS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ApplicationContentItemType.f198215b.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            f198199a = iArr;
        }
    }

    @Override // com.google.gson.h
    public final C14285o deserialize(i iVar, Type type, g gVar) {
        InterfaceC14286p interfaceC14286p;
        k kVarI = iVar.i();
        i iVarD = kVarI.D("type");
        String strS = iVarD.s();
        ApplicationContentItemType applicationContentItemType = (ApplicationContentItemType) gVar.b(iVarD, ApplicationContentItemType.class);
        if (applicationContentItemType == null) {
            applicationContentItemType = ApplicationContentItemType.f198215b;
        }
        i iVarD2 = kVarI.D(strS);
        if (iVarD2 == null) {
            iVarD2 = null;
        }
        switch (a.f198199a[applicationContentItemType.ordinal()]) {
            case 1:
                i iVar2 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar2 == null ? null : gVar.b(iVar2, u.class));
                break;
            case 2:
                i iVar3 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar3 == null ? null : gVar.b(iVar3, J.class));
                break;
            case 3:
                i iVar4 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar4 == null ? null : gVar.b(iVar4, C14283m.class));
                break;
            case 4:
                i iVar5 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar5 == null ? null : gVar.b(iVar5, C14271a.class));
                break;
            case 5:
                i iVar6 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar6 == null ? null : gVar.b(iVar6, B.class));
                break;
            case 6:
                i iVar7 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar7 == null ? null : gVar.b(iVar7, r.class));
                break;
            case 7:
                i iVar8 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar8 == null ? null : gVar.b(iVar8, z.class));
                break;
            case 8:
                i iVar9 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar9 == null ? null : gVar.b(iVar9, y.class));
                break;
            case 9:
                i iVar10 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar10 == null ? null : gVar.b(iVar10, C14282l.class));
                break;
            case 10:
                i iVar11 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar11 == null ? null : gVar.b(iVar11, C14277g.class));
                break;
            case 11:
                i iVar12 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar12 == null ? null : gVar.b(iVar12, C14287q.class));
                break;
            case 12:
                i iVar13 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar13 == null ? null : gVar.b(iVar13, C14288s.class));
                break;
            case 13:
                i iVar14 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar14 == null ? null : gVar.b(iVar14, C14289t.class));
                break;
            case 14:
                i iVar15 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar15 == null ? null : gVar.b(iVar15, F.class));
                break;
            case 15:
                i iVar16 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar16 == null ? null : gVar.b(iVar16, G.class));
                break;
            case 16:
                i iVar17 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar17 == null ? null : gVar.b(iVar17, C14284n.class));
                break;
            case 17:
                i iVar18 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar18 == null ? null : gVar.b(iVar18, E.class));
                break;
            case 18:
                i iVar19 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar19 == null ? null : gVar.b(iVar19, v.class));
                break;
            case 19:
                i iVar20 = new i[]{iVarD2}[0];
                interfaceC14286p = (InterfaceC14286p) (iVar20 == null ? null : gVar.b(iVar20, D.class));
                break;
            case 20:
                interfaceC14286p = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (interfaceC14286p != null) {
            return new C14285o(applicationContentItemType, interfaceC14286p);
        }
        return null;
    }
}
