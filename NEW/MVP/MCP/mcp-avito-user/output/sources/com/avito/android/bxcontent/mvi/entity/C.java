package com.avito.android.bxcontent.mvi.entity;

import com.avito.android.remote.model.additional_buttons.UniversalButton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BxContentState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/C;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class C {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f112030c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C f112031d = new C(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f112032a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final UniversalButton f112033b;

    /* compiled from: BxContentState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/C$a;", "", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static C a() {
            return C.f112031d;
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final UniversalButton getF112033b() {
        return this.f112033b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c12 = (C) obj;
        return this.f112032a == c12.f112032a && L.f(this.f112033b, c12.f112033b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f112032a) * 31;
        UniversalButton universalButton = this.f112033b;
        return iHashCode + (universalButton == null ? 0 : universalButton.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "UniversalButtonState(isVisible=" + this.f112032a + ", universalButton=" + this.f112033b + ')';
    }

    public C(boolean z12, @Y61.l UniversalButton universalButton) {
        this.f112032a = z12;
        this.f112033b = universalButton;
    }

    public /* synthetic */ C(boolean z12, UniversalButton universalButton, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : universalButton);
    }
}
