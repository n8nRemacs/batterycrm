package com.avito.android.lib.design.toggle;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ToggleState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/toggle/ToggleState;", "", "ToggleValue", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ToggleState {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Y41.l<Boolean, G0> f181163a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f181164b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f181165c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f181166d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ToggleValue f181167e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ToggleState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/toggle/ToggleState$ToggleValue;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ToggleValue {

        /* renamed from: b, reason: collision with root package name */
        public static final ToggleValue f181168b;

        /* renamed from: c, reason: collision with root package name */
        public static final ToggleValue f181169c;

        /* renamed from: d, reason: collision with root package name */
        public static final ToggleValue f181170d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ToggleValue[] f181171e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f181172f;

        static {
            ToggleValue toggleValue = new ToggleValue("Unchecked", 0);
            f181168b = toggleValue;
            ToggleValue toggleValue2 = new ToggleValue("Indeterminate", 1);
            f181169c = toggleValue2;
            ToggleValue toggleValue3 = new ToggleValue("Checked", 2);
            f181170d = toggleValue3;
            ToggleValue[] toggleValueArr = {toggleValue, toggleValue2, toggleValue3};
            f181171e = toggleValueArr;
            f181172f = c.a(toggleValueArr);
        }

        public ToggleValue() {
            throw null;
        }

        public static ToggleValue valueOf(String str) {
            return (ToggleValue) Enum.valueOf(ToggleValue.class, str);
        }

        public static ToggleValue[] values() {
            return (ToggleValue[]) f181171e.clone();
        }
    }

    public ToggleState() {
        this(null, false, false, false, null, 31, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToggleState)) {
            return false;
        }
        ToggleState toggleState = (ToggleState) obj;
        return L.f(this.f181163a, toggleState.f181163a) && this.f181164b == toggleState.f181164b && this.f181165c == toggleState.f181165c && this.f181166d == toggleState.f181166d && this.f181167e == toggleState.f181167e;
    }

    public final int hashCode() {
        Y41.l<Boolean, G0> lVar = this.f181163a;
        return this.f181167e.hashCode() + r.i(r.i(r.i((lVar == null ? 0 : lVar.hashCode()) * 31, 31, this.f181164b), 31, this.f181165c), 31, this.f181166d);
    }

    @k
    public final String toString() {
        return "ToggleState(onCheckedChange=" + this.f181163a + ", enabled=" + this.f181164b + ", error=" + this.f181165c + ", isClickable=" + this.f181166d + ", value=" + this.f181167e + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToggleState(@l Y41.l<? super Boolean, G0> lVar, boolean z12, boolean z13, boolean z14, @k ToggleValue toggleValue) {
        this.f181163a = lVar;
        this.f181164b = z12;
        this.f181165c = z13;
        this.f181166d = z14;
        this.f181167e = toggleValue;
    }

    public /* synthetic */ ToggleState(Y41.l lVar, boolean z12, boolean z13, boolean z14, ToggleValue toggleValue, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : lVar, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) == 0 ? z14 : true, (i12 & 16) != 0 ? ToggleValue.f181168b : toggleValue);
    }
}
