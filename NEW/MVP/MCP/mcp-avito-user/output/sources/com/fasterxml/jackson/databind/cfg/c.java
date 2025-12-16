package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.Serializable;

/* compiled from: CoercionConfigs.java */
/* loaded from: classes4.dex */
public class c implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final CoercionAction f341484b;

    /* renamed from: c, reason: collision with root package name */
    public final n f341485c;

    /* compiled from: CoercionConfigs.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f341486a;

        static {
            int[] iArr = new int[CoercionInputShape.values().length];
            f341486a = iArr;
            try {
                iArr[7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f341486a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f341486a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        int length = LogicalType.values().length;
    }

    public c() {
        CoercionAction coercionAction = CoercionAction.f341461c;
        this.f341485c = new n();
        this.f341484b = coercionAction;
    }
}
