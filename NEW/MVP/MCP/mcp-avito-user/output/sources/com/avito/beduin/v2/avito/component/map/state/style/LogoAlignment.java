package com.avito.beduin.v2.avito.component.map.state.style;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LogoAlignment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/style/LogoAlignment;", "", "Horizontal", "Vertical", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LogoAlignment {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Vertical> f334713a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Horizontal> f334714b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Integer> f334715c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Integer> f334716d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LogoAlignment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/style/LogoAlignment$Horizontal;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Horizontal {

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Horizontal[] f334717c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f334718d;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f334719b;

        static {
            Horizontal[] horizontalArr = {new Horizontal("Left", 0, "left"), new Horizontal("Right", 1, "right")};
            f334717c = horizontalArr;
            f334718d = kotlin.enums.c.a(horizontalArr);
        }

        public Horizontal(String str, int i12, String str2) {
            this.f334719b = str2;
        }

        public static Horizontal valueOf(String str) {
            return (Horizontal) Enum.valueOf(Horizontal.class, str);
        }

        public static Horizontal[] values() {
            return (Horizontal[]) f334717c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LogoAlignment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/style/LogoAlignment$Vertical;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Vertical {

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Vertical[] f334720c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f334721d;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f334722b;

        static {
            Vertical[] verticalArr = {new Vertical("Top", 0, "top"), new Vertical("Bottom", 1, "bottom")};
            f334720c = verticalArr;
            f334721d = kotlin.enums.c.a(verticalArr);
        }

        public Vertical(String str, int i12, String str2) {
            this.f334722b = str2;
        }

        public static Vertical valueOf(String str) {
            return (Vertical) Enum.valueOf(Vertical.class, str);
        }

        public static Vertical[] values() {
            return (Vertical[]) f334720c.clone();
        }
    }

    public LogoAlignment(@Y61.k com.avito.beduin.v2.theme.f<Vertical> fVar, @Y61.k com.avito.beduin.v2.theme.f<Horizontal> fVar2, @Y61.k com.avito.beduin.v2.theme.f<Integer> fVar3, @Y61.k com.avito.beduin.v2.theme.f<Integer> fVar4) {
        this.f334713a = fVar;
        this.f334714b = fVar2;
        this.f334715c = fVar3;
        this.f334716d = fVar4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogoAlignment)) {
            return false;
        }
        LogoAlignment logoAlignment = (LogoAlignment) obj;
        return L.f(this.f334713a, logoAlignment.f334713a) && L.f(this.f334714b, logoAlignment.f334714b) && L.f(this.f334715c, logoAlignment.f334715c) && L.f(this.f334716d, logoAlignment.f334716d);
    }

    public final int hashCode() {
        return this.f334716d.hashCode() + C31685o.f(this.f334715c, C31685o.f(this.f334714b, this.f334713a.hashCode() * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LogoAlignment(verticalAlignment=");
        sb2.append(this.f334713a);
        sb2.append(", horizontalAlignment=");
        sb2.append(this.f334714b);
        sb2.append(", verticalPadding=");
        sb2.append(this.f334715c);
        sb2.append(", horizontalPadding=");
        return C31685o.o(sb2, this.f334716d, ')');
    }
}
