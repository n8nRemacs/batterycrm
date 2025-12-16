package com.avito.android.employee_bug_reporter_impl.domain;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PositionOnScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/domain/PositionOnScreen;", "", "a", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PositionOnScreen {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f147289b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final PositionOnScreen f147290c;

    /* renamed from: d, reason: collision with root package name */
    public static final PositionOnScreen f147291d;

    /* renamed from: e, reason: collision with root package name */
    public static final PositionOnScreen f147292e;

    /* renamed from: f, reason: collision with root package name */
    public static final PositionOnScreen f147293f;

    /* renamed from: g, reason: collision with root package name */
    public static final PositionOnScreen f147294g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ PositionOnScreen[] f147295h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f147296i;

    /* compiled from: PositionOnScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/domain/PositionOnScreen$a;", "", "<init>", "()V", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        PositionOnScreen positionOnScreen = new PositionOnScreen("TOP_RIGHT", 0);
        f147291d = positionOnScreen;
        PositionOnScreen positionOnScreen2 = new PositionOnScreen("TOP_LEFT", 1);
        f147292e = positionOnScreen2;
        PositionOnScreen positionOnScreen3 = new PositionOnScreen("BOTTOM_RIGHT", 2);
        f147293f = positionOnScreen3;
        PositionOnScreen positionOnScreen4 = new PositionOnScreen("BOTTOM_LEFT", 3);
        f147294g = positionOnScreen4;
        PositionOnScreen[] positionOnScreenArr = {positionOnScreen, positionOnScreen2, positionOnScreen3, positionOnScreen4};
        f147295h = positionOnScreenArr;
        f147296i = c.a(positionOnScreenArr);
        f147289b = new a(null);
        f147290c = positionOnScreen3;
    }

    public PositionOnScreen() {
        throw null;
    }

    public static PositionOnScreen valueOf(String str) {
        return (PositionOnScreen) Enum.valueOf(PositionOnScreen.class, str);
    }

    public static PositionOnScreen[] values() {
        return (PositionOnScreen[]) f147295h.clone();
    }
}
