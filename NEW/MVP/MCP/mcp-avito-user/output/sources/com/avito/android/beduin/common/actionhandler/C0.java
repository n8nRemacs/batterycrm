package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import androidx.collection.C20199a;
import com.avito.android.beduin.common.action.BeduinPixelAction;
import com.avito.android.beduin.common.action.BeduinPixelActionScreenPosition;
import com.avito.android.beduin.common.component.pixel.PixelScreenPositionCondition;
import com.avito.android.beduin.common.component.pixel.PixelScreenPositionEdge;
import com.avito.android.beduin_models.BeduinAction;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinPixelActionHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0006²\u0006 \u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00018\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/C0;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinPixelAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "kotlin.jvm.PlatformType", "handler", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class C0 implements InterfaceC15523b<BeduinPixelAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100055a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, E0> f100056b;

    /* compiled from: BeduinPixelActionHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100057a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f100058b;

        static {
            int[] iArr = new int[PixelScreenPositionEdge.values().length];
            try {
                iArr[PixelScreenPositionEdge.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PixelScreenPositionEdge.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f100057a = iArr;
            int[] iArr2 = new int[PixelScreenPositionCondition.values().length];
            try {
                iArr2[PixelScreenPositionCondition.MORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PixelScreenPositionCondition.LESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f100058b = iArr2;
            int[] iArr3 = new int[EnumC28734a0.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                EnumC28734a0 enumC28734a0 = EnumC28734a0.f100156b;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                EnumC28734a0 enumC28734a02 = EnumC28734a0.f100156b;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public C0() {
        throw null;
    }

    public C0(h31.e eVar, Map map, int i12, C42822w c42822w) {
        map = (i12 & 2) != 0 ? new C20199a() : map;
        this.f100055a = eVar;
        this.f100056b = map;
    }

    public static int l(BeduinPixelActionScreenPosition beduinPixelActionScreenPosition, BeduinPixelActionScreenPosition beduinPixelActionScreenPosition2) {
        EnumC28734a0 enumC28734a0;
        int i12;
        if (beduinPixelActionScreenPosition2 != null) {
            int i13 = beduinPixelActionScreenPosition.f99992b;
            int i14 = beduinPixelActionScreenPosition2.f99992b;
            enumC28734a0 = i13 > i14 ? EnumC28734a0.f100157c : i13 < i14 ? EnumC28734a0.f100156b : EnumC28734a0.f100158d;
        } else {
            enumC28734a0 = EnumC28734a0.f100158d;
        }
        int iOrdinal = enumC28734a0.ordinal();
        if (iOrdinal == 0) {
            return -1;
        }
        if (iOrdinal == 1) {
            i12 = beduinPixelActionScreenPosition.f99994d;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i15 = beduinPixelActionScreenPosition.f99992b;
            int iF2 = androidx.appcompat.app.r.f(beduinPixelActionScreenPosition.f99993c, i15, 2, i15);
            i12 = beduinPixelActionScreenPosition.f99994d;
            if (iF2 <= i12 / 2) {
                return -1;
            }
        }
        return i12 + 1;
    }

    public static boolean m(PixelScreenPositionCondition pixelScreenPositionCondition, int i12, int i13) {
        int i14 = a.f100058b[pixelScreenPositionCondition.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (i12 >= i13) {
                return false;
            }
        } else if (i12 <= i13) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    @Override // Ui.InterfaceC15523b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(com.avito.android.beduin_models.BeduinAction r18) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.actionhandler.C0.o(com.avito.android.beduin_models.BeduinAction):void");
    }
}
