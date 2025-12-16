package com.avito.android.ui;

import android.content.Context;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TooltipWithCloseCause.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ui/TooltipWithCloseCause;", "Lcom/avito/android/lib/design/tooltip/k;", "CloseCause", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TooltipWithCloseCause extends com.avito.android.lib.design.tooltip.k {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TooltipWithCloseCause.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/TooltipWithCloseCause$CloseCause;", "", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseCause {

        /* renamed from: b, reason: collision with root package name */
        public static final CloseCause f304530b;

        /* renamed from: c, reason: collision with root package name */
        public static final CloseCause f304531c;

        /* renamed from: d, reason: collision with root package name */
        public static final CloseCause f304532d;

        /* renamed from: e, reason: collision with root package name */
        public static final CloseCause f304533e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ CloseCause[] f304534f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f304535g;

        static {
            CloseCause closeCause = new CloseCause("CROSS", 0);
            f304530b = closeCause;
            CloseCause closeCause2 = new CloseCause("CONTENT", 1);
            f304531c = closeCause2;
            CloseCause closeCause3 = new CloseCause("BUTTON", 2);
            f304532d = closeCause3;
            CloseCause closeCause4 = new CloseCause("HIDE", 3);
            f304533e = closeCause4;
            CloseCause[] closeCauseArr = {closeCause, closeCause2, closeCause3, closeCause4};
            f304534f = closeCauseArr;
            f304535g = kotlin.enums.c.a(closeCauseArr);
        }

        public CloseCause() {
            throw null;
        }

        public static CloseCause valueOf(String str) {
            return (CloseCause) Enum.valueOf(CloseCause.class, str);
        }

        public static CloseCause[] values() {
            return (CloseCause[]) f304534f.clone();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TooltipWithCloseCause(Context context, int i12, int i13, CloseCause closeCause, int i14, C42822w c42822w) {
        i12 = (i14 & 2) != 0 ? R.attr.tooltip : i12;
        i13 = (i14 & 4) != 0 ? R.style.Design_Widget_Tooltip : i13;
        if ((i14 & 8) != 0) {
            CloseCause closeCause2 = CloseCause.f304533e;
        }
        super(context, i12, i13);
    }
}
