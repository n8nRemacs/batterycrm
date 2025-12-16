package com.avito.beduin.v2.avito.component.map.state;

import kotlin.Metadata;

/* compiled from: Pin.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/Pin;", "", "Anchor", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class Pin {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f334642a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x f334643b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C f334644c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f334645d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Anchor f334646e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Pin.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/Pin$Anchor;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Anchor {

        /* renamed from: c, reason: collision with root package name */
        public static final Anchor f334647c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Anchor[] f334648d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f334649e;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f334650b;

        static {
            Anchor anchor = new Anchor("Center", 0, "center");
            f334647c = anchor;
            Anchor[] anchorArr = {anchor, new Anchor("BottomCenter", 1, "bottomCenter"), new Anchor("PinCenter", 2, "pinCenter"), new Anchor("PinBottomCenter", 3, "pinBottomCenter")};
            f334648d = anchorArr;
            f334649e = kotlin.enums.c.a(anchorArr);
        }

        public Anchor(String str, int i12, String str2) {
            this.f334650b = str2;
        }

        public static Anchor valueOf(String str) {
            return (Anchor) Enum.valueOf(Anchor.class, str);
        }

        public static Anchor[] values() {
            return (Anchor[]) f334648d.clone();
        }
    }

    public Pin(@Y61.k String str, @Y61.k x xVar, @Y61.k C c12, @Y61.l Integer num, @Y61.k Anchor anchor) {
        this.f334642a = str;
        this.f334643b = xVar;
        this.f334644c = c12;
        this.f334645d = num;
        this.f334646e = anchor;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pin)) {
            return false;
        }
        Pin pin = (Pin) obj;
        return kotlin.jvm.internal.L.f(this.f334642a, pin.f334642a) && kotlin.jvm.internal.L.f(this.f334643b, pin.f334643b) && kotlin.jvm.internal.L.f(this.f334644c, pin.f334644c) && kotlin.jvm.internal.L.f(this.f334645d, pin.f334645d) && this.f334646e == pin.f334646e;
    }

    public final int hashCode() {
        int iHashCode = (this.f334644c.hashCode() + ((this.f334643b.hashCode() + (this.f334642a.hashCode() * 31)) * 31)) * 31;
        Integer num = this.f334645d;
        return this.f334646e.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        return "Pin(pinId=" + this.f334642a + ", point=" + this.f334643b + ", pinView=" + this.f334644c + ", zIndex=" + this.f334645d + ", anchor=" + this.f334646e + ')';
    }
}
