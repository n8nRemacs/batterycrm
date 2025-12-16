package com.avito.beduin.v2.avito.component.map.state;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import kotlin.Metadata;

/* compiled from: PinView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/RemotePinView;", "Lcom/avito/beduin/v2/avito/component/map/state/C;", "a", "RemotePinText", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class RemotePinView extends C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f334651a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f334652b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final RemotePinText f334653c;

    /* compiled from: PinView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/RemotePinView$RemotePinText;", "", "a", "Position", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class RemotePinText {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f334654a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> f334655b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Position f334656c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final a f334657d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final ET0.b f334658e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Integer f334659f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PinView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/RemotePinView$RemotePinText$Position;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Position {

            /* renamed from: c, reason: collision with root package name */
            public static final Position f334660c;

            /* renamed from: d, reason: collision with root package name */
            public static final Position f334661d;

            /* renamed from: e, reason: collision with root package name */
            public static final Position f334662e;

            /* renamed from: f, reason: collision with root package name */
            public static final Position f334663f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ Position[] f334664g;

            /* renamed from: h, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f334665h;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f334666b;

            static {
                Position position = new Position("Left", 0, "left");
                f334660c = position;
                Position position2 = new Position("Right", 1, "right");
                f334661d = position2;
                Position position3 = new Position("Bottom", 2, "bottom");
                f334662e = position3;
                Position position4 = new Position("Top", 3, "top");
                f334663f = position4;
                Position[] positionArr = {position, position2, position3, position4, new Position("Center", 4, "center")};
                f334664g = positionArr;
                f334665h = kotlin.enums.c.a(positionArr);
            }

            public Position(String str, int i12, String str2) {
                this.f334666b = str2;
            }

            public static Position valueOf(String str) {
                return (Position) Enum.valueOf(Position.class, str);
            }

            public static Position[] values() {
                return (Position[]) f334664g.clone();
            }
        }

        /* compiled from: PinView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/RemotePinView$RemotePinText$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @w
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final com.avito.beduin.v2.theme.r f334667a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final com.avito.beduin.v2.avito.component.common.a f334668b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final com.avito.beduin.v2.avito.component.common.n f334669c;

            public a(@Y61.k com.avito.beduin.v2.theme.r rVar, @Y61.l com.avito.beduin.v2.avito.component.common.a aVar, @Y61.l com.avito.beduin.v2.avito.component.common.n nVar) {
                this.f334667a = rVar;
                this.f334668b = aVar;
                this.f334669c = nVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.L.f(this.f334667a, aVar.f334667a) && kotlin.jvm.internal.L.f(this.f334668b, aVar.f334668b) && kotlin.jvm.internal.L.f(this.f334669c, aVar.f334669c);
            }

            public final int hashCode() {
                int iHashCode = this.f334667a.hashCode() * 31;
                com.avito.beduin.v2.avito.component.common.a aVar = this.f334668b;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                com.avito.beduin.v2.avito.component.common.n nVar = this.f334669c;
                return iHashCode2 + (nVar != null ? nVar.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                return "Background(color=" + this.f334667a + ", border=" + this.f334668b + ", shape=" + this.f334669c + ')';
            }
        }

        public RemotePinText(@Y61.k String str, @Y61.k com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> lVar, @Y61.k Position position, @Y61.l a aVar, @Y61.l ET0.b bVar, @Y61.l Integer num) {
            this.f334654a = str;
            this.f334655b = lVar;
            this.f334656c = position;
            this.f334657d = aVar;
            this.f334658e = bVar;
            this.f334659f = num;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemotePinText)) {
                return false;
            }
            RemotePinText remotePinText = (RemotePinText) obj;
            return kotlin.jvm.internal.L.f(this.f334654a, remotePinText.f334654a) && kotlin.jvm.internal.L.f(this.f334655b, remotePinText.f334655b) && this.f334656c == remotePinText.f334656c && kotlin.jvm.internal.L.f(this.f334657d, remotePinText.f334657d) && kotlin.jvm.internal.L.f(this.f334658e, remotePinText.f334658e) && kotlin.jvm.internal.L.f(this.f334659f, remotePinText.f334659f);
        }

        public final int hashCode() {
            int iHashCode = (this.f334656c.hashCode() + C31685o.g(this.f334655b, this.f334654a.hashCode() * 31, 31)) * 31;
            a aVar = this.f334657d;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            ET0.b bVar = this.f334658e;
            int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Integer num = this.f334659f;
            return iHashCode3 + (num != null ? num.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RemotePinText(text=");
            sb2.append(this.f334654a);
            sb2.append(", style=");
            sb2.append(this.f334655b);
            sb2.append(", position=");
            sb2.append(this.f334656c);
            sb2.append(", background=");
            sb2.append(this.f334657d);
            sb2.append(", padding=");
            sb2.append(this.f334658e);
            sb2.append(", marginToImage=");
            return com.akita.compose.component.accordion.s.j(sb2, this.f334659f, ')');
        }
    }

    /* compiled from: PinView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/RemotePinView$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f334670a;

        /* renamed from: b, reason: collision with root package name */
        public final int f334671b;

        /* renamed from: c, reason: collision with root package name */
        public final int f334672c;

        public a(@Y61.k String str, int i12, int i13) {
            this.f334670a = str;
            this.f334671b = i12;
            this.f334672c = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f334670a, aVar.f334670a) && this.f334671b == aVar.f334671b && this.f334672c == aVar.f334672c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f334672c) + androidx.appcompat.app.r.e(this.f334671b, this.f334670a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Image(url=");
            sb2.append(this.f334670a);
            sb2.append(", width=");
            sb2.append(this.f334671b);
            sb2.append(", height=");
            return androidx.appcompat.app.r.t(sb2, this.f334672c, ')');
        }
    }

    public RemotePinView(@Y61.k a aVar, @Y61.k a aVar2, @Y61.l RemotePinText remotePinText) {
        super(null);
        this.f334651a = aVar;
        this.f334652b = aVar2;
        this.f334653c = remotePinText;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemotePinView)) {
            return false;
        }
        RemotePinView remotePinView = (RemotePinView) obj;
        return kotlin.jvm.internal.L.f(this.f334651a, remotePinView.f334651a) && kotlin.jvm.internal.L.f(this.f334652b, remotePinView.f334652b) && kotlin.jvm.internal.L.f(this.f334653c, remotePinView.f334653c);
    }

    public final int hashCode() {
        int iHashCode = (this.f334652b.hashCode() + (this.f334651a.hashCode() * 31)) * 31;
        RemotePinText remotePinText = this.f334653c;
        return iHashCode + (remotePinText == null ? 0 : remotePinText.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "RemotePinView(image=" + this.f334651a + ", imageDark=" + this.f334652b + ", text=" + this.f334653c + ')';
    }
}
