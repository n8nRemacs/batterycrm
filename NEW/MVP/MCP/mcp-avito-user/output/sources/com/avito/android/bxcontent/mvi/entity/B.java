package com.avito.android.bxcontent.mvi.entity;

import Ip0.C14142a;
import com.avito.android.search_bar.utils.UdfToolbarStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BxContentState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/B;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class B {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f111800c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C14142a f111801a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final UdfToolbarStyle f111802b;

    /* compiled from: BxContentState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/B$a;", "", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public B(@Y61.k C14142a c14142a, @Y61.k UdfToolbarStyle udfToolbarStyle) {
        this.f111801a = c14142a;
        this.f111802b = udfToolbarStyle;
    }

    @Y61.k
    public static B a(@Y61.k C14142a c14142a, @Y61.k UdfToolbarStyle udfToolbarStyle) {
        return new B(c14142a, udfToolbarStyle);
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C14142a getF111801a() {
        return this.f111801a;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final UdfToolbarStyle getF111802b() {
        return this.f111802b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b12 = (B) obj;
        return L.f(this.f111801a, b12.f111801a) && L.f(this.f111802b, b12.f111802b);
    }

    public final int hashCode() {
        return this.f111802b.hashCode() + (this.f111801a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "UdfToolbar(udfToolbarState=" + this.f111801a + ", udfToolbarStyle=" + this.f111802b + ')';
    }
}
