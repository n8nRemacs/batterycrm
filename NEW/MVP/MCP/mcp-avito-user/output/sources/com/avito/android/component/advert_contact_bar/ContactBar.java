package com.avito.android.component.advert_contact_bar;

import Ev.InterfaceC13531b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.contactbar.C28266e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.delivery_combined_buttons_public.CombinedButtonsData;
import com.avito.android.remote.model.SellerInfoAdvantage;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.credit_broker.InstallmentsImage;
import com.avito.android.remote.model.insights.Insight;
import com.avito.android.remote.model.text.AttributedText;
import hw.InterfaceC41178c;
import j.InterfaceC42150f;
import j.InterfaceC42158n;
import j.InterfaceC42165v;
import java.io.Serializable;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;

/* compiled from: ContactBar.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bg\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar;", "", "a", "Alignment", "b", "Button", "c", "ContainerClickType", "InfoStickyBlock", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ContactBar {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ContactBar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "a", "LEFT", "CENTER", "RIGHT", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Alignment {

        @com.google.gson.annotations.c("center")
        public static final Alignment CENTER;

        @com.google.gson.annotations.c("left")
        public static final Alignment LEFT;

        @com.google.gson.annotations.c("right")
        public static final Alignment RIGHT;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f125035b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Alignment[] f125036c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f125037d;

        /* compiled from: ContactBar.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Alignment$a;", "", "<init>", "()V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            Alignment alignment = new Alignment("LEFT", 0);
            LEFT = alignment;
            Alignment alignment2 = new Alignment("CENTER", 1);
            CENTER = alignment2;
            Alignment alignment3 = new Alignment("RIGHT", 2);
            RIGHT = alignment3;
            Alignment[] alignmentArr = {alignment, alignment2, alignment3};
            f125036c = alignmentArr;
            f125037d = kotlin.enums.c.a(alignmentArr);
            f125035b = new a(null);
        }

        private Alignment(String str, int i12) {
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) f125036c.clone();
        }
    }

    /* compiled from: ContactBar.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Button;", "Landroid/os/Parcelable;", "<init>", "()V", "Action", "Custom", "Target", "Width", "Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Action;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Custom;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC41178c
    public static abstract class Button implements Parcelable {

        /* compiled from: ContactBar.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Custom;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$Button;", "()V", "DeliveryCombinedButtons", "Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Custom$DeliveryCombinedButtons;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class Custom extends Button {

            /* compiled from: ContactBar.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Custom$DeliveryCombinedButtons;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Custom;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class DeliveryCombinedButtons extends Custom {

                @Y61.k
                public static final Parcelable.Creator<DeliveryCombinedButtons> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final CombinedButtonsData f125071b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.l
                public final String f125072c;

                /* renamed from: d, reason: collision with root package name */
                @Y61.k
                public final Width f125073d;

                /* compiled from: ContactBar.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<DeliveryCombinedButtons> {
                    @Override // android.os.Parcelable.Creator
                    public final DeliveryCombinedButtons createFromParcel(Parcel parcel) {
                        return new DeliveryCombinedButtons((CombinedButtonsData) parcel.readParcelable(DeliveryCombinedButtons.class.getClassLoader()), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final DeliveryCombinedButtons[] newArray(int i12) {
                        return new DeliveryCombinedButtons[i12];
                    }
                }

                public /* synthetic */ DeliveryCombinedButtons(CombinedButtonsData combinedButtonsData, String str, int i12, C42822w c42822w) {
                    this(combinedButtonsData, (i12 & 2) != 0 ? null : str);
                }

                @Override // com.avito.android.component.advert_contact_bar.ContactBar.Button
                @Y61.k
                /* renamed from: c, reason: from getter */
                public final Width getF125082j() {
                    return this.f125073d;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof DeliveryCombinedButtons)) {
                        return false;
                    }
                    DeliveryCombinedButtons deliveryCombinedButtons = (DeliveryCombinedButtons) obj;
                    return kotlin.jvm.internal.L.f(this.f125071b, deliveryCombinedButtons.f125071b) && kotlin.jvm.internal.L.f(this.f125072c, deliveryCombinedButtons.f125072c);
                }

                @Override // com.avito.android.component.advert_contact_bar.ContactBar.Button
                @Y61.l
                /* renamed from: getId, reason: from getter */
                public final String getF125084l() {
                    return this.f125072c;
                }

                public final int hashCode() {
                    int iHashCode = this.f125071b.hashCode() * 31;
                    String str = this.f125072c;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("DeliveryCombinedButtons(data=");
                    sb2.append(this.f125071b);
                    sb2.append(", id=");
                    return C22026a.c(sb2, this.f125072c, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeParcelable(this.f125071b, i12);
                    parcel.writeString(this.f125072c);
                }

                public DeliveryCombinedButtons(@Y61.k CombinedButtonsData combinedButtonsData, @Y61.l String str) {
                    super(null);
                    this.f125071b = combinedButtonsData;
                    this.f125072c = str;
                    this.f125073d = Width.f125097b;
                }
            }

            public /* synthetic */ Custom(C42822w c42822w) {
                this();
            }

            public Custom() {
                super(null);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ContactBar.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Width;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Width {

            /* renamed from: b, reason: collision with root package name */
            public static final Width f125097b;

            /* renamed from: c, reason: collision with root package name */
            public static final Width f125098c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Width[] f125099d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f125100e;

            static {
                Width width = new Width("FULL", 0);
                f125097b = width;
                Width width2 = new Width("HALF", 1);
                f125098c = width2;
                Width[] widthArr = {width, width2};
                f125099d = widthArr;
                f125100e = kotlin.enums.c.a(widthArr);
            }

            public Width() {
                throw null;
            }

            public static Width valueOf(String str) {
                return (Width) Enum.valueOf(Width.class, str);
            }

            public static Width[] values() {
                return (Width[]) f125099d.clone();
            }
        }

        public /* synthetic */ Button(C42822w c42822w) {
            this();
        }

        @Y61.k
        /* renamed from: c */
        public abstract Width getF125082j();

        @Y61.l
        /* renamed from: getId */
        public abstract String getF125084l();

        /* compiled from: ContactBar.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Action;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$Button;", "Type", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Action extends Button {

            @Y61.k
            public static final Parcelable.Creator<Action> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f125038b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final Integer f125039c;

            /* renamed from: d, reason: collision with root package name */
            public final int f125040d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final DeepLink f125041e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f125042f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final Type f125043g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f125044h;

            /* renamed from: i, reason: collision with root package name */
            @Y61.l
            public final Boolean f125045i;

            /* renamed from: j, reason: collision with root package name */
            public final boolean f125046j;

            /* renamed from: k, reason: collision with root package name */
            public final boolean f125047k;

            /* renamed from: l, reason: collision with root package name */
            public final boolean f125048l;

            /* renamed from: m, reason: collision with root package name */
            public final boolean f125049m;

            /* renamed from: n, reason: collision with root package name */
            @Y61.l
            public final String f125050n;

            /* renamed from: o, reason: collision with root package name */
            @Y61.l
            public final String f125051o;

            /* renamed from: p, reason: collision with root package name */
            @Y61.l
            public final String f125052p;

            /* renamed from: q, reason: collision with root package name */
            @Y61.l
            public final Long f125053q;

            /* renamed from: r, reason: collision with root package name */
            public final boolean f125054r;

            /* renamed from: s, reason: collision with root package name */
            @Y61.k
            public final Width f125055s;

            /* renamed from: t, reason: collision with root package name */
            public final boolean f125056t;

            /* renamed from: u, reason: collision with root package name */
            @Y61.l
            public final String f125057u;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ContactBar.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Action$Type;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Type {

                /* renamed from: b, reason: collision with root package name */
                public static final Type f125058b;

                /* renamed from: c, reason: collision with root package name */
                public static final Type f125059c;

                /* renamed from: d, reason: collision with root package name */
                public static final Type f125060d;

                /* renamed from: e, reason: collision with root package name */
                public static final Type f125061e;

                /* renamed from: f, reason: collision with root package name */
                public static final Type f125062f;

                /* renamed from: g, reason: collision with root package name */
                public static final Type f125063g;

                /* renamed from: h, reason: collision with root package name */
                public static final Type f125064h;

                /* renamed from: i, reason: collision with root package name */
                public static final Type f125065i;

                /* renamed from: j, reason: collision with root package name */
                public static final Type f125066j;

                /* renamed from: k, reason: collision with root package name */
                public static final Type f125067k;

                /* renamed from: l, reason: collision with root package name */
                public static final Type f125068l;

                /* renamed from: m, reason: collision with root package name */
                public static final /* synthetic */ Type[] f125069m;

                /* renamed from: n, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f125070n;

                static {
                    Type type = new Type("PHONE", 0);
                    f125058b = type;
                    Type type2 = new Type("MESSENGER", 1);
                    f125059c = type2;
                    Type type3 = new Type("ACCESS", 2);
                    f125060d = type3;
                    Type type4 = new Type("TEASER", 3);
                    Type type5 = new Type("TRADE", 4);
                    Type type6 = new Type("BOOKING", 5);
                    f125061e = type6;
                    Type type7 = new Type("ORDER_REQUEST", 6);
                    f125062f = type7;
                    Type type8 = new Type("IAC_VIDEO_CALL_REQUEST", 7);
                    f125063g = type8;
                    Type type9 = new Type("CALL_ORDER", 8);
                    f125064h = type9;
                    Type type10 = new Type("REALTY_LAYOUT", 9);
                    f125065i = type10;
                    Type type11 = new Type("GIG_APPLY", 10);
                    f125066j = type11;
                    Type type12 = new Type("SECONDARY_ACTION", 11);
                    f125067k = type12;
                    Type type13 = new Type("FIND_SHIFT", 12);
                    f125068l = type13;
                    Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13};
                    f125069m = typeArr;
                    f125070n = kotlin.enums.c.a(typeArr);
                }

                public Type() {
                    throw null;
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) f125069m.clone();
                }
            }

            /* compiled from: ContactBar.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Action> {
                @Override // android.os.Parcelable.Creator
                public final Action createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    String string = parcel.readString();
                    Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    int i12 = parcel.readInt();
                    DeepLink deepLink = (DeepLink) parcel.readParcelable(Action.class.getClassLoader());
                    boolean z12 = parcel.readInt() != 0;
                    Type typeValueOf = Type.valueOf(parcel.readString());
                    boolean z13 = parcel.readInt() != 0;
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Action(string, numValueOf, i12, deepLink, z12, typeValueOf, z13, boolValueOf, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, Width.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Action[] newArray(int i12) {
                    return new Action[i12];
                }
            }

            public /* synthetic */ Action(String str, Integer num, int i12, DeepLink deepLink, boolean z12, Type type, boolean z13, Boolean bool, boolean z14, boolean z15, boolean z16, boolean z17, String str2, String str3, String str4, Long l12, boolean z18, Width width, boolean z19, String str5, int i13, C42822w c42822w) {
                this(str, num, i12, deepLink, z12, type, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? null : bool, (i13 & 256) != 0 ? false : z14, (i13 & 512) != 0 ? true : z15, (i13 & 1024) != 0 ? false : z16, (i13 & 2048) != 0 ? false : z17, (i13 & 4096) != 0 ? null : str2, (i13 & 8192) != 0 ? null : str3, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str4, (32768 & i13) != 0 ? null : l12, (65536 & i13) != 0 ? false : z18, (131072 & i13) != 0 ? Width.f125098c : width, (262144 & i13) != 0 ? false : z19, (i13 & 524288) != 0 ? null : str5);
            }

            public static Action d(Action action, boolean z12, int i12) {
                Width width = Width.f125097b;
                String str = action.f125038b;
                Integer num = action.f125039c;
                int i13 = action.f125040d;
                DeepLink deepLink = action.f125041e;
                boolean z13 = action.f125042f;
                Type type = action.f125043g;
                boolean z14 = action.f125044h;
                Boolean bool = action.f125045i;
                boolean z15 = action.f125046j;
                boolean z16 = (i12 & 512) != 0 ? action.f125047k : z12;
                boolean z17 = action.f125048l;
                boolean z18 = action.f125049m;
                String str2 = action.f125050n;
                String str3 = action.f125051o;
                String str4 = action.f125052p;
                Long l12 = action.f125053q;
                boolean z19 = action.f125054r;
                Width width2 = (i12 & 131072) != 0 ? action.f125055s : width;
                boolean z22 = action.f125056t;
                String str5 = action.f125057u;
                action.getClass();
                return new Action(str, num, i13, deepLink, z13, type, z14, bool, z15, z16, z17, z18, str2, str3, str4, l12, z19, width2, z22, str5);
            }

            @Override // com.avito.android.component.advert_contact_bar.ContactBar.Button
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final Width getF125082j() {
                return this.f125055s;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Action)) {
                    return false;
                }
                Action action = (Action) obj;
                return kotlin.jvm.internal.L.f(this.f125038b, action.f125038b) && kotlin.jvm.internal.L.f(this.f125039c, action.f125039c) && this.f125040d == action.f125040d && kotlin.jvm.internal.L.f(this.f125041e, action.f125041e) && this.f125042f == action.f125042f && this.f125043g == action.f125043g && this.f125044h == action.f125044h && kotlin.jvm.internal.L.f(this.f125045i, action.f125045i) && this.f125046j == action.f125046j && this.f125047k == action.f125047k && this.f125048l == action.f125048l && this.f125049m == action.f125049m && kotlin.jvm.internal.L.f(this.f125050n, action.f125050n) && kotlin.jvm.internal.L.f(this.f125051o, action.f125051o) && kotlin.jvm.internal.L.f(this.f125052p, action.f125052p) && kotlin.jvm.internal.L.f(this.f125053q, action.f125053q) && this.f125054r == action.f125054r && this.f125055s == action.f125055s && this.f125056t == action.f125056t && kotlin.jvm.internal.L.f(this.f125057u, action.f125057u);
            }

            @Override // com.avito.android.component.advert_contact_bar.ContactBar.Button
            @Y61.l
            /* renamed from: getId, reason: from getter */
            public final String getF125084l() {
                return this.f125057u;
            }

            public final int hashCode() {
                int iHashCode = this.f125038b.hashCode() * 31;
                Integer num = this.f125039c;
                int i12 = androidx.appcompat.app.r.i((this.f125043g.hashCode() + androidx.appcompat.app.r.i(com.avito.android.actions_sheet.a.e(this.f125041e, androidx.appcompat.app.r.e(this.f125040d, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31, this.f125042f)) * 31, 31, this.f125044h);
                Boolean bool = this.f125045i;
                int i13 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((i12 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f125046j), 31, this.f125047k), 31, this.f125048l), 31, this.f125049m);
                String str = this.f125050n;
                int iHashCode2 = (i13 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f125051o;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f125052p;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Long l12 = this.f125053q;
                int i14 = androidx.appcompat.app.r.i((this.f125055s.hashCode() + androidx.appcompat.app.r.i((iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.f125054r)) * 31, 31, this.f125056t);
                String str4 = this.f125057u;
                return i14 + (str4 != null ? str4.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Action(text=");
                sb2.append(this.f125038b);
                sb2.append(", iconDrawableId=");
                sb2.append(this.f125039c);
                sb2.append(", iconTintColor=");
                sb2.append(this.f125040d);
                sb2.append(", deepLink=");
                sb2.append(this.f125041e);
                sb2.append(", needUnauthSendMessageAttemptEvent=");
                sb2.append(this.f125042f);
                sb2.append(", type=");
                sb2.append(this.f125043g);
                sb2.append(", isRe23=");
                sb2.append(this.f125044h);
                sb2.append(", isFullSize=");
                sb2.append(this.f125045i);
                sb2.append(", isDisabled=");
                sb2.append(this.f125046j);
                sb2.append(", isPrimary=");
                sb2.append(this.f125047k);
                sb2.append(", isSecondary=");
                sb2.append(this.f125048l);
                sb2.append(", isPriorityMethod=");
                sb2.append(this.f125049m);
                sb2.append(", style=");
                sb2.append(this.f125050n);
                sb2.append(", subtitle=");
                sb2.append(this.f125051o);
                sb2.append(", iconName=");
                sb2.append(this.f125052p);
                sb2.append(", startTime=");
                sb2.append(this.f125053q);
                sb2.append(", isBrandGlobal=");
                sb2.append(this.f125054r);
                sb2.append(", width=");
                sb2.append(this.f125055s);
                sb2.append(", isOnlyStickyButton=");
                sb2.append(this.f125056t);
                sb2.append(", id=");
                return C22026a.c(sb2, this.f125057u, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f125038b);
                Integer num = this.f125039c;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
                parcel.writeInt(this.f125040d);
                parcel.writeParcelable(this.f125041e, i12);
                parcel.writeInt(this.f125042f ? 1 : 0);
                parcel.writeString(this.f125043g.name());
                parcel.writeInt(this.f125044h ? 1 : 0);
                Boolean bool = this.f125045i;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
                parcel.writeInt(this.f125046j ? 1 : 0);
                parcel.writeInt(this.f125047k ? 1 : 0);
                parcel.writeInt(this.f125048l ? 1 : 0);
                parcel.writeInt(this.f125049m ? 1 : 0);
                parcel.writeString(this.f125050n);
                parcel.writeString(this.f125051o);
                parcel.writeString(this.f125052p);
                Long l12 = this.f125053q;
                if (l12 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l12);
                }
                parcel.writeInt(this.f125054r ? 1 : 0);
                parcel.writeString(this.f125055s.name());
                parcel.writeInt(this.f125056t ? 1 : 0);
                parcel.writeString(this.f125057u);
            }

            public Action(@Y61.k String str, @InterfaceC42165v @Y61.l Integer num, @InterfaceC42158n int i12, @Y61.k DeepLink deepLink, boolean z12, @Y61.k Type type, boolean z13, @Y61.l Boolean bool, boolean z14, boolean z15, boolean z16, boolean z17, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Long l12, boolean z18, @Y61.k Width width, boolean z19, @Y61.l String str5) {
                super(null);
                this.f125038b = str;
                this.f125039c = num;
                this.f125040d = i12;
                this.f125041e = deepLink;
                this.f125042f = z12;
                this.f125043g = type;
                this.f125044h = z13;
                this.f125045i = bool;
                this.f125046j = z14;
                this.f125047k = z15;
                this.f125048l = z16;
                this.f125049m = z17;
                this.f125050n = str2;
                this.f125051o = str3;
                this.f125052p = str4;
                this.f125053q = l12;
                this.f125054r = z18;
                this.f125055s = width;
                this.f125056t = z19;
                this.f125057u = str5;
            }
        }

        /* compiled from: ContactBar.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$Button;", "Type", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Target extends Button {

            @Y61.k
            public static final Parcelable.Creator<Target> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f125074b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f125075c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final DeepLink f125076d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f125077e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.l
            public final String f125078f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.l
            public final String f125079g;

            /* renamed from: h, reason: collision with root package name */
            @Y61.l
            public final Integer f125080h;

            /* renamed from: i, reason: collision with root package name */
            @Y61.k
            public final Type f125081i;

            /* renamed from: j, reason: collision with root package name */
            @Y61.k
            public final Width f125082j;

            /* renamed from: k, reason: collision with root package name */
            public final boolean f125083k;

            /* renamed from: l, reason: collision with root package name */
            @Y61.l
            public final String f125084l;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ContactBar.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target$Type;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Type {

                /* renamed from: b, reason: collision with root package name */
                public static final Type f125085b;

                /* renamed from: c, reason: collision with root package name */
                public static final Type f125086c;

                /* renamed from: d, reason: collision with root package name */
                public static final Type f125087d;

                /* renamed from: e, reason: collision with root package name */
                public static final Type f125088e;

                /* renamed from: f, reason: collision with root package name */
                public static final Type f125089f;

                /* renamed from: g, reason: collision with root package name */
                public static final Type f125090g;

                /* renamed from: h, reason: collision with root package name */
                public static final Type f125091h;

                /* renamed from: i, reason: collision with root package name */
                public static final Type f125092i;

                /* renamed from: j, reason: collision with root package name */
                public static final Type f125093j;

                /* renamed from: k, reason: collision with root package name */
                public static final Type f125094k;

                /* renamed from: l, reason: collision with root package name */
                public static final /* synthetic */ Type[] f125095l;

                /* renamed from: m, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f125096m;

                static {
                    Type type = new Type("CAR_RENT", 0);
                    Type type2 = new Type("DELIVERY", 1);
                    f125085b = type2;
                    Type type3 = new Type("BOOKING", 2);
                    f125086c = type3;
                    Type type4 = new Type("SERVICE_ORDER", 3);
                    f125087d = type4;
                    Type type5 = new Type("SELECT", 4);
                    f125088e = type5;
                    Type type6 = new Type("STR", 5);
                    f125089f = type6;
                    Type type7 = new Type("RECALL_ME", 6);
                    f125090g = type7;
                    Type type8 = new Type("CONSULTATION", 7);
                    f125091h = type8;
                    Type type9 = new Type("MORTGAGE_CALCULATION", 8);
                    f125092i = type9;
                    Type type10 = new Type("AUTOTEKA", 9);
                    f125093j = type10;
                    Type type11 = new Type("INSTALLMENTS_SUBMIT", 10);
                    f125094k = type11;
                    Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11};
                    f125095l = typeArr;
                    f125096m = kotlin.enums.c.a(typeArr);
                }

                public Type() {
                    throw null;
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) f125095l.clone();
                }
            }

            /* compiled from: ContactBar.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Target> {
                @Override // android.os.Parcelable.Creator
                public final Target createFromParcel(Parcel parcel) {
                    return new Target(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Target.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), Type.valueOf(parcel.readString()), Width.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Target[] newArray(int i12) {
                    return new Target[i12];
                }
            }

            public /* synthetic */ Target(String str, String str2, DeepLink deepLink, boolean z12, String str3, String str4, Integer num, Type type, Width width, boolean z13, String str5, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? null : str2, deepLink, z12, str3, str4, num, type, (i12 & 256) != 0 ? Width.f125097b : width, (i12 & 512) != 0 ? true : z13, (i12 & 1024) != 0 ? null : str5);
            }

            public static Target d(Target target, String str, DeepLink deepLink, boolean z12, int i12) {
                String str2 = target.f125075c;
                boolean z13 = (i12 & 8) != 0 ? target.f125077e : z12;
                String str3 = target.f125078f;
                String str4 = target.f125079g;
                Integer num = target.f125080h;
                Type type = target.f125081i;
                Width width = target.f125082j;
                boolean z14 = target.f125083k;
                String str5 = target.f125084l;
                target.getClass();
                return new Target(str, str2, deepLink, z13, str3, str4, num, type, width, z14, str5);
            }

            @Override // com.avito.android.component.advert_contact_bar.ContactBar.Button
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final Width getF125082j() {
                return this.f125082j;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Target)) {
                    return false;
                }
                Target target = (Target) obj;
                return kotlin.jvm.internal.L.f(this.f125074b, target.f125074b) && kotlin.jvm.internal.L.f(this.f125075c, target.f125075c) && kotlin.jvm.internal.L.f(this.f125076d, target.f125076d) && this.f125077e == target.f125077e && kotlin.jvm.internal.L.f(this.f125078f, target.f125078f) && kotlin.jvm.internal.L.f(this.f125079g, target.f125079g) && kotlin.jvm.internal.L.f(this.f125080h, target.f125080h) && this.f125081i == target.f125081i && this.f125082j == target.f125082j && this.f125083k == target.f125083k && kotlin.jvm.internal.L.f(this.f125084l, target.f125084l);
            }

            @Override // com.avito.android.component.advert_contact_bar.ContactBar.Button
            @Y61.l
            /* renamed from: getId, reason: from getter */
            public final String getF125084l() {
                return this.f125084l;
            }

            public final int hashCode() {
                int iHashCode = this.f125074b.hashCode() * 31;
                String str = this.f125075c;
                int i12 = androidx.appcompat.app.r.i(com.avito.android.actions_sheet.a.e(this.f125076d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f125077e);
                String str2 = this.f125078f;
                int iHashCode2 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f125079g;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num = this.f125080h;
                int i13 = androidx.appcompat.app.r.i((this.f125082j.hashCode() + ((this.f125081i.hashCode() + ((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31, 31, this.f125083k);
                String str4 = this.f125084l;
                return i13 + (str4 != null ? str4.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Target(title=");
                sb2.append(this.f125074b);
                sb2.append(", subtitle=");
                sb2.append(this.f125075c);
                sb2.append(", deepLink=");
                sb2.append(this.f125076d);
                sb2.append(", isLoading=");
                sb2.append(this.f125077e);
                sb2.append(", theme=");
                sb2.append(this.f125078f);
                sb2.append(", style=");
                sb2.append(this.f125079g);
                sb2.append(", leftIcon=");
                sb2.append(this.f125080h);
                sb2.append(", type=");
                sb2.append(this.f125081i);
                sb2.append(", width=");
                sb2.append(this.f125082j);
                sb2.append(", isOnlyStickyButton=");
                sb2.append(this.f125083k);
                sb2.append(", id=");
                return C22026a.c(sb2, this.f125084l, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f125074b);
                parcel.writeString(this.f125075c);
                parcel.writeParcelable(this.f125076d, i12);
                parcel.writeInt(this.f125077e ? 1 : 0);
                parcel.writeString(this.f125078f);
                parcel.writeString(this.f125079g);
                Integer num = this.f125080h;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
                parcel.writeString(this.f125081i.name());
                parcel.writeString(this.f125082j.name());
                parcel.writeInt(this.f125083k ? 1 : 0);
                parcel.writeString(this.f125084l);
            }

            public Target(@Y61.k String str, @Y61.l String str2, @Y61.k DeepLink deepLink, boolean z12, @Y61.l String str3, @Y61.l String str4, @InterfaceC42165v @Y61.l Integer num, @Y61.k Type type, @Y61.k Width width, boolean z13, @Y61.l String str5) {
                super(null);
                this.f125074b = str;
                this.f125075c = str2;
                this.f125076d = deepLink;
                this.f125077e = z12;
                this.f125078f = str3;
                this.f125079g = str4;
                this.f125080h = num;
                this.f125081i = type;
                this.f125082j = width;
                this.f125083k = z13;
                this.f125084l = str5;
            }
        }

        public Button() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ContactBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$ContainerClickType;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContainerClickType {

        /* renamed from: b, reason: collision with root package name */
        public static final ContainerClickType f125101b;

        /* renamed from: c, reason: collision with root package name */
        public static final ContainerClickType f125102c;

        /* renamed from: d, reason: collision with root package name */
        public static final ContainerClickType f125103d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ContainerClickType[] f125104e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f125105f;

        static {
            ContainerClickType containerClickType = new ContainerClickType("SELLER_INFO", 0);
            f125101b = containerClickType;
            ContainerClickType containerClickType2 = new ContainerClickType("RATING", 1);
            f125102c = containerClickType2;
            ContainerClickType containerClickType3 = new ContainerClickType("CONTACT_STATUS", 2);
            f125103d = containerClickType3;
            ContainerClickType[] containerClickTypeArr = {containerClickType, containerClickType2, containerClickType3};
            f125104e = containerClickTypeArr;
            f125105f = kotlin.enums.c.a(containerClickTypeArr);
        }

        public ContainerClickType() {
            throw null;
        }

        public static ContainerClickType valueOf(String str) {
            return (ContainerClickType) Enum.valueOf(ContainerClickType.class, str);
        }

        public static ContainerClickType[] values() {
            return (ContainerClickType[]) f125104e.clone();
        }
    }

    /* compiled from: ContactBar.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock;", "Landroid/os/Parcelable;", "<init>", "()V", "DeliveryInfoSpacing", "DeliveryInfoSplitText", "DeliveryInfoText", "DeliveryPriceInfo", "InstallmentsActionText", "InstallmentsActionToggle", "Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock$DeliveryInfoSpacing;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock$DeliveryInfoSplitText;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock$DeliveryInfoText;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock$DeliveryPriceInfo;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock$InstallmentsActionText;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock$InstallmentsActionToggle;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class InfoStickyBlock implements Parcelable {
        public /* synthetic */ InfoStickyBlock(C42822w c42822w) {
            this();
        }

        @Y61.k
        /* renamed from: getId */
        public abstract String getF125123b();

        /* compiled from: ContactBar.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock$DeliveryInfoSpacing;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DeliveryInfoSpacing extends InfoStickyBlock {

            @Y61.k
            public static final Parcelable.Creator<DeliveryInfoSpacing> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f125106b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final Float f125107c;

            /* compiled from: ContactBar.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<DeliveryInfoSpacing> {
                @Override // android.os.Parcelable.Creator
                public final DeliveryInfoSpacing createFromParcel(Parcel parcel) {
                    return new DeliveryInfoSpacing(parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
                }

                @Override // android.os.Parcelable.Creator
                public final DeliveryInfoSpacing[] newArray(int i12) {
                    return new DeliveryInfoSpacing[i12];
                }
            }

            public /* synthetic */ DeliveryInfoSpacing(String str, Float f12, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? "DELIVERY_INFO_SPACING" : str, f12);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DeliveryInfoSpacing)) {
                    return false;
                }
                DeliveryInfoSpacing deliveryInfoSpacing = (DeliveryInfoSpacing) obj;
                return kotlin.jvm.internal.L.f(this.f125106b, deliveryInfoSpacing.f125106b) && kotlin.jvm.internal.L.f(this.f125107c, deliveryInfoSpacing.f125107c);
            }

            @Override // com.avito.android.component.advert_contact_bar.ContactBar.InfoStickyBlock
            @Y61.k
            /* renamed from: getId, reason: from getter */
            public final String getF125123b() {
                return this.f125106b;
            }

            public final int hashCode() {
                int iHashCode = this.f125106b.hashCode() * 31;
                Float f12 = this.f125107c;
                return iHashCode + (f12 == null ? 0 : f12.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("DeliveryInfoSpacing(id=");
                sb2.append(this.f125106b);
                sb2.append(", height=");
                return org.webrtc.h.d(sb2, this.f125107c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f125106b);
                Float f12 = this.f125107c;
                if (f12 == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.B(parcel, 1, f12);
                }
            }

            public DeliveryInfoSpacing(@Y61.k String str, @Y61.l Float f12) {
                super(null);
                this.f125106b = str;
                this.f125107c = f12;
            }
        }

        /* compiled from: ContactBar.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock$DeliveryInfoSplitText;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DeliveryInfoSplitText extends InfoStickyBlock {

            @Y61.k
            public static final Parcelable.Creator<DeliveryInfoSplitText> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f125108b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final AttributedText f125109c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final AttributedText f125110d;

            /* compiled from: ContactBar.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<DeliveryInfoSplitText> {
                @Override // android.os.Parcelable.Creator
                public final DeliveryInfoSplitText createFromParcel(Parcel parcel) {
                    return new DeliveryInfoSplitText(parcel.readString(), (AttributedText) parcel.readParcelable(DeliveryInfoSplitText.class.getClassLoader()), (AttributedText) parcel.readParcelable(DeliveryInfoSplitText.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final DeliveryInfoSplitText[] newArray(int i12) {
                    return new DeliveryInfoSplitText[i12];
                }
            }

            public /* synthetic */ DeliveryInfoSplitText(String str, AttributedText attributedText, AttributedText attributedText2, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? "DELIVERY_INFO_SPLIT_TEXT" : str, attributedText, attributedText2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DeliveryInfoSplitText)) {
                    return false;
                }
                DeliveryInfoSplitText deliveryInfoSplitText = (DeliveryInfoSplitText) obj;
                return kotlin.jvm.internal.L.f(this.f125108b, deliveryInfoSplitText.f125108b) && kotlin.jvm.internal.L.f(this.f125109c, deliveryInfoSplitText.f125109c) && kotlin.jvm.internal.L.f(this.f125110d, deliveryInfoSplitText.f125110d);
            }

            @Override // com.avito.android.component.advert_contact_bar.ContactBar.InfoStickyBlock
            @Y61.k
            /* renamed from: getId, reason: from getter */
            public final String getF125123b() {
                return this.f125108b;
            }

            public final int hashCode() {
                int iHashCode = this.f125108b.hashCode() * 31;
                AttributedText attributedText = this.f125109c;
                int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
                AttributedText attributedText2 = this.f125110d;
                return iHashCode2 + (attributedText2 != null ? attributedText2.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("DeliveryInfoSplitText(id=");
                sb2.append(this.f125108b);
                sb2.append(", leftText=");
                sb2.append(this.f125109c);
                sb2.append(", rightText=");
                return com.avito.android.actions_sheet.a.w(sb2, this.f125110d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f125108b);
                parcel.writeParcelable(this.f125109c, i12);
                parcel.writeParcelable(this.f125110d, i12);
            }

            public DeliveryInfoSplitText(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2) {
                super(null);
                this.f125108b = str;
                this.f125109c = attributedText;
                this.f125110d = attributedText2;
            }
        }

        /* compiled from: ContactBar.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock$DeliveryInfoText;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DeliveryInfoText extends InfoStickyBlock {

            @Y61.k
            public static final Parcelable.Creator<DeliveryInfoText> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f125111b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final AttributedText f125112c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final Alignment f125113d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final Integer f125114e;

            /* compiled from: ContactBar.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<DeliveryInfoText> {
                @Override // android.os.Parcelable.Creator
                public final DeliveryInfoText createFromParcel(Parcel parcel) {
                    return new DeliveryInfoText(parcel.readString(), (AttributedText) parcel.readParcelable(DeliveryInfoText.class.getClassLoader()), parcel.readInt() == 0 ? null : Alignment.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final DeliveryInfoText[] newArray(int i12) {
                    return new DeliveryInfoText[i12];
                }
            }

            public /* synthetic */ DeliveryInfoText(String str, AttributedText attributedText, Alignment alignment, Integer num, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? "DELIVERY_INFO_TEXT" : str, attributedText, alignment, num);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DeliveryInfoText)) {
                    return false;
                }
                DeliveryInfoText deliveryInfoText = (DeliveryInfoText) obj;
                return kotlin.jvm.internal.L.f(this.f125111b, deliveryInfoText.f125111b) && kotlin.jvm.internal.L.f(this.f125112c, deliveryInfoText.f125112c) && this.f125113d == deliveryInfoText.f125113d && kotlin.jvm.internal.L.f(this.f125114e, deliveryInfoText.f125114e);
            }

            @Override // com.avito.android.component.advert_contact_bar.ContactBar.InfoStickyBlock
            @Y61.k
            /* renamed from: getId, reason: from getter */
            public final String getF125123b() {
                return this.f125111b;
            }

            public final int hashCode() {
                int iHashCode = this.f125111b.hashCode() * 31;
                AttributedText attributedText = this.f125112c;
                int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
                Alignment alignment = this.f125113d;
                int iHashCode3 = (iHashCode2 + (alignment == null ? 0 : alignment.hashCode())) * 31;
                Integer num = this.f125114e;
                return iHashCode3 + (num != null ? num.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("DeliveryInfoText(id=");
                sb2.append(this.f125111b);
                sb2.append(", attributedText=");
                sb2.append(this.f125112c);
                sb2.append(", alignment=");
                sb2.append(this.f125113d);
                sb2.append(", numberOfLines=");
                return com.akita.compose.component.accordion.s.j(sb2, this.f125114e, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f125111b);
                parcel.writeParcelable(this.f125112c, i12);
                Alignment alignment = this.f125113d;
                if (alignment == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(alignment.name());
                }
                Integer num = this.f125114e;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
            }

            public DeliveryInfoText(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.l Alignment alignment, @Y61.l Integer num) {
                super(null);
                this.f125111b = str;
                this.f125112c = attributedText;
                this.f125113d = alignment;
                this.f125114e = num;
            }
        }

        /* compiled from: ContactBar.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock$DeliveryPriceInfo;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DeliveryPriceInfo extends InfoStickyBlock {

            @Y61.k
            public static final Parcelable.Creator<DeliveryPriceInfo> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f125115b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final AttributedText f125116c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final AttributedText f125117d;

            /* compiled from: ContactBar.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<DeliveryPriceInfo> {
                @Override // android.os.Parcelable.Creator
                public final DeliveryPriceInfo createFromParcel(Parcel parcel) {
                    return new DeliveryPriceInfo(parcel.readString(), (AttributedText) parcel.readParcelable(DeliveryPriceInfo.class.getClassLoader()), (AttributedText) parcel.readParcelable(DeliveryPriceInfo.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final DeliveryPriceInfo[] newArray(int i12) {
                    return new DeliveryPriceInfo[i12];
                }
            }

            public /* synthetic */ DeliveryPriceInfo(String str, AttributedText attributedText, AttributedText attributedText2, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? "DELIVERY_PRICE_INFO" : str, attributedText, attributedText2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DeliveryPriceInfo)) {
                    return false;
                }
                DeliveryPriceInfo deliveryPriceInfo = (DeliveryPriceInfo) obj;
                return kotlin.jvm.internal.L.f(this.f125115b, deliveryPriceInfo.f125115b) && kotlin.jvm.internal.L.f(this.f125116c, deliveryPriceInfo.f125116c) && kotlin.jvm.internal.L.f(this.f125117d, deliveryPriceInfo.f125117d);
            }

            @Override // com.avito.android.component.advert_contact_bar.ContactBar.InfoStickyBlock
            @Y61.k
            /* renamed from: getId, reason: from getter */
            public final String getF125123b() {
                return this.f125115b;
            }

            public final int hashCode() {
                int iHashCode = this.f125115b.hashCode() * 31;
                AttributedText attributedText = this.f125116c;
                int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
                AttributedText attributedText2 = this.f125117d;
                return iHashCode2 + (attributedText2 != null ? attributedText2.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("DeliveryPriceInfo(id=");
                sb2.append(this.f125115b);
                sb2.append(", price=");
                sb2.append(this.f125116c);
                sb2.append(", title=");
                return com.avito.android.actions_sheet.a.w(sb2, this.f125117d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f125115b);
                parcel.writeParcelable(this.f125116c, i12);
                parcel.writeParcelable(this.f125117d, i12);
            }

            public DeliveryPriceInfo(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2) {
                super(null);
                this.f125115b = str;
                this.f125116c = attributedText;
                this.f125117d = attributedText2;
            }
        }

        /* compiled from: ContactBar.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock$InstallmentsActionText;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class InstallmentsActionText extends InfoStickyBlock {

            @Y61.k
            public static final Parcelable.Creator<InstallmentsActionText> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f125118b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final InstallmentsImage f125119c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final AttributedText f125120d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final AttributedText f125121e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.k
            public final Y41.a<G0> f125122f;

            /* compiled from: ContactBar.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<InstallmentsActionText> {
                @Override // android.os.Parcelable.Creator
                public final InstallmentsActionText createFromParcel(Parcel parcel) {
                    return new InstallmentsActionText(parcel.readString(), (InstallmentsImage) parcel.readParcelable(InstallmentsActionText.class.getClassLoader()), (AttributedText) parcel.readParcelable(InstallmentsActionText.class.getClassLoader()), (AttributedText) parcel.readParcelable(InstallmentsActionText.class.getClassLoader()), (Y41.a) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final InstallmentsActionText[] newArray(int i12) {
                    return new InstallmentsActionText[i12];
                }
            }

            public /* synthetic */ InstallmentsActionText(String str, InstallmentsImage installmentsImage, AttributedText attributedText, AttributedText attributedText2, Y41.a aVar, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? "INSTALLMENTS_ACTION_TEXT" : str, installmentsImage, attributedText, attributedText2, aVar);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InstallmentsActionText)) {
                    return false;
                }
                InstallmentsActionText installmentsActionText = (InstallmentsActionText) obj;
                return kotlin.jvm.internal.L.f(this.f125118b, installmentsActionText.f125118b) && kotlin.jvm.internal.L.f(this.f125119c, installmentsActionText.f125119c) && kotlin.jvm.internal.L.f(this.f125120d, installmentsActionText.f125120d) && kotlin.jvm.internal.L.f(this.f125121e, installmentsActionText.f125121e) && kotlin.jvm.internal.L.f(this.f125122f, installmentsActionText.f125122f);
            }

            @Override // com.avito.android.component.advert_contact_bar.ContactBar.InfoStickyBlock
            @Y61.k
            /* renamed from: getId, reason: from getter */
            public final String getF125123b() {
                return this.f125118b;
            }

            public final int hashCode() {
                int iHashCode = this.f125118b.hashCode() * 31;
                InstallmentsImage installmentsImage = this.f125119c;
                int iHashCode2 = (iHashCode + (installmentsImage == null ? 0 : installmentsImage.hashCode())) * 31;
                AttributedText attributedText = this.f125120d;
                int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
                AttributedText attributedText2 = this.f125121e;
                return this.f125122f.hashCode() + ((iHashCode3 + (attributedText2 != null ? attributedText2.hashCode() : 0)) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("InstallmentsActionText(id=");
                sb2.append(this.f125118b);
                sb2.append(", image=");
                sb2.append(this.f125119c);
                sb2.append(", title=");
                sb2.append(this.f125120d);
                sb2.append(", actionText=");
                sb2.append(this.f125121e);
                sb2.append(", onClick=");
                return androidx.appcompat.app.r.v(sb2, this.f125122f, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f125118b);
                parcel.writeParcelable(this.f125119c, i12);
                parcel.writeParcelable(this.f125120d, i12);
                parcel.writeParcelable(this.f125121e, i12);
                parcel.writeSerializable((Serializable) this.f125122f);
            }

            public InstallmentsActionText(@Y61.k String str, @Y61.l InstallmentsImage installmentsImage, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.k Y41.a<G0> aVar) {
                super(null);
                this.f125118b = str;
                this.f125119c = installmentsImage;
                this.f125120d = attributedText;
                this.f125121e = attributedText2;
                this.f125122f = aVar;
            }
        }

        /* compiled from: ContactBar.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock$InstallmentsActionToggle;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class InstallmentsActionToggle extends InfoStickyBlock {

            @Y61.k
            public static final Parcelable.Creator<InstallmentsActionToggle> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f125123b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final InstallmentsImage f125124c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final AttributedText f125125d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f125126e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.l
            public final String f125127f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.l
            public final DeepLink f125128g;

            /* renamed from: h, reason: collision with root package name */
            @Y61.k
            public final Y41.l<Boolean, G0> f125129h;

            /* compiled from: ContactBar.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<InstallmentsActionToggle> {
                @Override // android.os.Parcelable.Creator
                public final InstallmentsActionToggle createFromParcel(Parcel parcel) {
                    return new InstallmentsActionToggle(parcel.readString(), (InstallmentsImage) parcel.readParcelable(InstallmentsActionToggle.class.getClassLoader()), (AttributedText) parcel.readParcelable(InstallmentsActionToggle.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), (DeepLink) parcel.readParcelable(InstallmentsActionToggle.class.getClassLoader()), (Y41.l) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final InstallmentsActionToggle[] newArray(int i12) {
                    return new InstallmentsActionToggle[i12];
                }
            }

            public /* synthetic */ InstallmentsActionToggle(String str, InstallmentsImage installmentsImage, AttributedText attributedText, boolean z12, String str2, DeepLink deepLink, Y41.l lVar, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? "INSTALMENTS_ACTION_TOGGLE" : str, installmentsImage, attributedText, z12, str2, deepLink, lVar);
            }

            public static InstallmentsActionToggle a(InstallmentsActionToggle installmentsActionToggle, boolean z12) {
                String str = installmentsActionToggle.f125123b;
                InstallmentsImage installmentsImage = installmentsActionToggle.f125124c;
                AttributedText attributedText = installmentsActionToggle.f125125d;
                String str2 = installmentsActionToggle.f125127f;
                DeepLink deepLink = installmentsActionToggle.f125128g;
                Y41.l<Boolean, G0> lVar = installmentsActionToggle.f125129h;
                installmentsActionToggle.getClass();
                return new InstallmentsActionToggle(str, installmentsImage, attributedText, z12, str2, deepLink, lVar);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InstallmentsActionToggle)) {
                    return false;
                }
                InstallmentsActionToggle installmentsActionToggle = (InstallmentsActionToggle) obj;
                return kotlin.jvm.internal.L.f(this.f125123b, installmentsActionToggle.f125123b) && kotlin.jvm.internal.L.f(this.f125124c, installmentsActionToggle.f125124c) && kotlin.jvm.internal.L.f(this.f125125d, installmentsActionToggle.f125125d) && this.f125126e == installmentsActionToggle.f125126e && kotlin.jvm.internal.L.f(this.f125127f, installmentsActionToggle.f125127f) && kotlin.jvm.internal.L.f(this.f125128g, installmentsActionToggle.f125128g) && kotlin.jvm.internal.L.f(this.f125129h, installmentsActionToggle.f125129h);
            }

            @Override // com.avito.android.component.advert_contact_bar.ContactBar.InfoStickyBlock
            @Y61.k
            /* renamed from: getId, reason: from getter */
            public final String getF125123b() {
                return this.f125123b;
            }

            public final int hashCode() {
                int iHashCode = this.f125123b.hashCode() * 31;
                InstallmentsImage installmentsImage = this.f125124c;
                int iHashCode2 = (iHashCode + (installmentsImage == null ? 0 : installmentsImage.hashCode())) * 31;
                AttributedText attributedText = this.f125125d;
                int i12 = androidx.appcompat.app.r.i((iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f125126e);
                String str = this.f125127f;
                int iHashCode3 = (i12 + (str == null ? 0 : str.hashCode())) * 31;
                DeepLink deepLink = this.f125128g;
                return this.f125129h.hashCode() + ((iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("InstallmentsActionToggle(id=");
                sb2.append(this.f125123b);
                sb2.append(", image=");
                sb2.append(this.f125124c);
                sb2.append(", title=");
                sb2.append(this.f125125d);
                sb2.append(", isChecked=");
                sb2.append(this.f125126e);
                sb2.append(", submitButtonText=");
                sb2.append(this.f125127f);
                sb2.append(", submitButtonDeeplink=");
                sb2.append(this.f125128g);
                sb2.append(", onToggle=");
                return androidx.compose.foundation.H.l(sb2, this.f125129h, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f125123b);
                parcel.writeParcelable(this.f125124c, i12);
                parcel.writeParcelable(this.f125125d, i12);
                parcel.writeInt(this.f125126e ? 1 : 0);
                parcel.writeString(this.f125127f);
                parcel.writeParcelable(this.f125128g, i12);
                parcel.writeSerializable((Serializable) this.f125129h);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public InstallmentsActionToggle(@Y61.k String str, @Y61.l InstallmentsImage installmentsImage, @Y61.l AttributedText attributedText, boolean z12, @Y61.l String str2, @Y61.l DeepLink deepLink, @Y61.k Y41.l<? super Boolean, G0> lVar) {
                super(null);
                this.f125123b = str;
                this.f125124c = installmentsImage;
                this.f125125d = attributedText;
                this.f125126e = z12;
                this.f125127f = str2;
                this.f125128g = deepLink;
                this.f125129h = lVar;
            }
        }

        public InfoStickyBlock() {
        }
    }

    /* compiled from: ContactBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$a;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f125130a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f125131b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f125132c;

        public a(boolean z12, boolean z13, boolean z14) {
            this.f125130a = z12;
            this.f125131b = z13;
            this.f125132c = z14;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f125130a == aVar.f125130a && this.f125131b == aVar.f125131b && this.f125132c == aVar.f125132c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f125132c) + androidx.appcompat.app.r.i(Boolean.hashCode(this.f125130a) * 31, 31, this.f125131b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionsParams(isSimpleContactBar=");
            sb2.append(this.f125130a);
            sb2.append(", isSellerOnline=");
            sb2.append(this.f125131b);
            sb2.append(", hideTopStatusContainer=");
            return androidx.appcompat.app.r.x(sb2, this.f125132c, ')');
        }
    }

    /* compiled from: ContactBar.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$b;", "", "a", "b", "Lcom/avito/android/component/advert_contact_bar/ContactBar$b$a;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$b$b;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ContactBar.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$b$a;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$b;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final List<Insight> f125133a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final AttributedText f125134b;

            /* renamed from: c, reason: collision with root package name */
            public final long f125135c;

            public a(long j12, @Y61.l List list, @Y61.k AttributedText attributedText) {
                this.f125133a = list;
                this.f125134b = attributedText;
                this.f125135c = j12;
            }

            @Override // com.avito.android.component.advert_contact_bar.ContactBar.b
            @Y61.l
            public final List<Insight> a() {
                return this.f125133a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.L.f(this.f125133a, aVar.f125133a) && kotlin.jvm.internal.L.f(this.f125134b, aVar.f125134b) && this.f125135c == aVar.f125135c;
            }

            public final int hashCode() {
                List<Insight> list = this.f125133a;
                return Long.hashCode(400L) + androidx.appcompat.app.r.g(com.avito.android.actions_sheet.a.b((list == null ? 0 : list.hashCode()) * 31, 31, this.f125134b), 31, this.f125135c);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AnimatedAttributedText(insights=");
                sb2.append(this.f125133a);
                sb2.append(", text=");
                sb2.append(this.f125134b);
                sb2.append(", delayMs=");
                return AK.c.j(this.f125135c, ", durationMs=400)", sb2);
            }
        }

        /* compiled from: ContactBar.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$b$b;", "Lcom/avito/android/component/advert_contact_bar/ContactBar$b;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.component.advert_contact_bar.ContactBar$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3717b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final List<Insight> f125136a;

            public C3717b(@Y61.l List<Insight> list) {
                this.f125136a = list;
            }

            @Override // com.avito.android.component.advert_contact_bar.ContactBar.b
            @Y61.l
            public final List<Insight> a() {
                return this.f125136a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3717b) && kotlin.jvm.internal.L.f(this.f125136a, ((C3717b) obj).f125136a);
            }

            public final int hashCode() {
                List<Insight> list = this.f125136a;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            @Y61.k
            public final String toString() {
                return androidx.compose.foundation.H.p(new StringBuilder("OnlyInsights(insights="), this.f125136a, ')');
            }
        }

        @Y61.l
        List<Insight> a();
    }

    /* compiled from: ContactBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$c;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: ContactBar.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }

        void a(@Y61.k InterfaceC13531b interfaceC13531b);

        void b(@Y61.k Button.Action action);

        void c(@Y61.k Button.Target target);
    }

    /* compiled from: ContactBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d {
    }

    void S2(@Y61.l String str, @Y61.l Float f12);

    void T2(boolean z12);

    void W6(boolean z12, boolean z13, boolean z14);

    void fb(@Y61.l String str);

    void gb(@Y61.l String str, @Y61.l String str2, @Y61.l UniversalColor universalColor);

    void hb(@Y61.l Y41.l<? super Integer, G0> lVar);

    void hide();

    @Y61.k
    io.reactivex.rxjava3.core.z<G0> ib(@Y61.k List<? extends ContainerClickType> list);

    void jb();

    void kb(@InterfaceC42150f int i12);

    void lb(@Y61.l List<SellerInfoAdvantage> list);

    void mb(@Y61.k List list, @Y61.k a aVar, @Y61.k C28266e.h hVar);

    @Y61.l
    io.reactivex.rxjava3.core.z<G0> nb(boolean z12);

    void ob(@Y61.l String str);

    void pb();

    void qb(@Y61.k List list, @Y61.k a aVar, @Y61.k C28266e.h hVar, @Y61.k List list2, @Y61.l b bVar);

    void rb(@Y61.l com.avito.android.image_loader.a aVar);

    void sb(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, boolean z12, boolean z13, boolean z14);

    void show();

    int va();

    void w(@Y61.l AttributedText attributedText);
}
