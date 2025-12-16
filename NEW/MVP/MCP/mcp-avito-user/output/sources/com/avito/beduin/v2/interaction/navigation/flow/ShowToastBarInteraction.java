package com.avito.beduin.v2.interaction.navigation.flow;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShowToastBarInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/ShowToastBarInteraction;", "LdU0/b;", "a", "Type", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ShowToastBarInteraction implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f337503a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Type f337504b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f337505c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final a f337506d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f337507e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShowToastBarInteraction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/ShowToastBarInteraction$Type;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f337508b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Type[] f337509c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f337510d;

        static {
            Type type = new Type("error", 0);
            Type type2 = new Type("default", 1);
            f337508b = type2;
            Type[] typeArr = {type, type2, new Type("defaultInverse", 2)};
            f337509c = typeArr;
            f337510d = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f337509c.clone();
        }
    }

    /* compiled from: ShowToastBarInteraction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/ShowToastBarInteraction$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f337511a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Y41.a<G0> f337512b;

        public a(@Y61.k String str, @Y61.l Y41.a<G0> aVar) {
            this.f337511a = str;
            this.f337512b = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f337511a, aVar.f337511a) && L.f(this.f337512b, aVar.f337512b);
        }

        public final int hashCode() {
            int iHashCode = this.f337511a.hashCode() * 31;
            Y41.a<G0> aVar = this.f337512b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(text=");
            sb2.append(this.f337511a);
            sb2.append(", onClick=");
            return androidx.appcompat.app.r.v(sb2, this.f337512b, ')');
        }
    }

    public ShowToastBarInteraction(@Y61.k String str, @Y61.k Type type, @Y61.l Integer num, @Y61.l a aVar, @Y61.l Y41.a<G0> aVar2) {
        this.f337503a = str;
        this.f337504b = type;
        this.f337505c = num;
        this.f337506d = aVar;
        this.f337507e = aVar2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowToastBarInteraction)) {
            return false;
        }
        ShowToastBarInteraction showToastBarInteraction = (ShowToastBarInteraction) obj;
        return L.f(this.f337503a, showToastBarInteraction.f337503a) && this.f337504b == showToastBarInteraction.f337504b && L.f(this.f337505c, showToastBarInteraction.f337505c) && L.f(this.f337506d, showToastBarInteraction.f337506d) && L.f(this.f337507e, showToastBarInteraction.f337507e);
    }

    public final int hashCode() {
        int iHashCode = (this.f337504b.hashCode() + (this.f337503a.hashCode() * 31)) * 31;
        Integer num = this.f337505c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        a aVar = this.f337506d;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f337507e;
        return iHashCode3 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowToastBarInteraction(text=");
        sb2.append(this.f337503a);
        sb2.append(", type=");
        sb2.append(this.f337504b);
        sb2.append(", timeout=");
        sb2.append(this.f337505c);
        sb2.append(", rightButton=");
        sb2.append(this.f337506d);
        sb2.append(", onDismiss=");
        return androidx.appcompat.app.r.v(sb2, this.f337507e, ')');
    }
}
