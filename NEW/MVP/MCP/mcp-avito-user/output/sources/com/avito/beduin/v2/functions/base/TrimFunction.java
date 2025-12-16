package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;

/* compiled from: TrimFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/functions/base/TrimFunction;", "LcU0/a;", "<init>", "()V", "Position", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TrimFunction extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final TrimFunction f337006a = new TrimFunction();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337007b = "Trim";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TrimFunction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/functions/base/TrimFunction$Position;", "", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Position {

        /* renamed from: b, reason: collision with root package name */
        public static final Position f337008b;

        /* renamed from: c, reason: collision with root package name */
        public static final Position f337009c;

        /* renamed from: d, reason: collision with root package name */
        public static final Position f337010d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Position[] f337011e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f337012f;

        static {
            Position position = new Position("Start", 0);
            f337008b = position;
            Position position2 = new Position("End", 1);
            f337009c = position2;
            Position position3 = new Position("All", 2);
            f337010d = position3;
            Position[] positionArr = {position, position2, position3};
            f337011e = positionArr;
            f337012f = kotlin.enums.c.a(positionArr);
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) f337011e.clone();
        }
    }

    /* compiled from: TrimFunction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Position.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Position position = Position.f337008b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Position position2 = Position.f337008b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        String string;
        String strW = mVar.w(zVar, "value");
        if (strW == null) {
            strW = "";
        }
        try {
            com.avito.beduin.v2.engine.field.d dVarC = mVar.c("position");
            Position position = null;
            if (dVarC != null) {
                com.avito.beduin.v2.engine.field.entity.v vVarQ = dVarC.q(zVar);
                String f336843b = vVarQ != null ? vVarQ.getF336843b() : null;
                if (f336843b != null) {
                    position = Position.f337008b;
                    if (!f336843b.equals("start")) {
                        position = Position.f337009c;
                        if (!f336843b.equals("end")) {
                            position = Position.f337010d;
                        }
                    }
                }
            }
            if (position == null) {
                position = Position.f337010d;
            }
            int iOrdinal = position.ordinal();
            if (iOrdinal == 0) {
                string = C43066x.G0(strW).toString();
            } else if (iOrdinal == 1) {
                string = C43066x.C0(strW).toString();
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                string = C43066x.A0(strW).toString();
            }
            return C36273j.e(zVar, string);
        } catch (Exception e12) {
            throw new BeduinPropertyException("position", e12);
        }
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414534b() {
        return f337007b;
    }
}
