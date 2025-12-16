package com.avito.android.comfortable_deal.end_deal.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.akita.compose.component.chips.InterfaceC27333b;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42165v;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: EndDealField.kt */
@F3
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/model/EndDealField;", "Landroid/os/Parcelable;", "ChipDateInput", "ChipGroup", "Comment", "RoubleInput", "Lcom/avito/android/comfortable_deal/end_deal/model/EndDealField$ChipDateInput;", "Lcom/avito/android/comfortable_deal/end_deal/model/EndDealField$ChipGroup;", "Lcom/avito/android/comfortable_deal/end_deal/model/EndDealField$Comment;", "Lcom/avito/android/comfortable_deal/end_deal/model/EndDealField$RoubleInput;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface EndDealField extends Parcelable {
    boolean X();

    /* renamed from: getHasError */
    boolean getF122253f();

    /* compiled from: EndDealField.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/model/EndDealField$ChipDateInput;", "Lcom/avito/android/comfortable_deal/end_deal/model/EndDealField;", "Chip", "b", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @F3
    @d
    public static final /* data */ class ChipDateInput implements EndDealField {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final LocalDate f122249b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f122250c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<Chip> f122251d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f122252e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f122253f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public static final b f122247g = new b(null);

        @k
        public static final Parcelable.Creator<ChipDateInput> CREATOR = new c();

        /* renamed from: h, reason: collision with root package name */
        @k
        public static final InterfaceC42726C<DateTimeFormatter> f122248h = C42727D.c(a.f122258l);

        /* compiled from: EndDealField.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a extends N implements Y41.a<DateTimeFormatter> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f122258l = new a();

            public a() {
                super(0);
            }

            @Override // Y41.a
            public final DateTimeFormatter invoke() {
                return DateTimeFormatter.ofPattern("dd MMMM");
            }
        }

        /* compiled from: EndDealField.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/model/EndDealField$ChipDateInput$b;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            @k
            public static String a(@l LocalDate localDate) {
                String str;
                if (localDate != null) {
                    ChipDateInput.f122247g.getClass();
                    str = localDate.format(ChipDateInput.f122248h.getValue());
                } else {
                    str = null;
                }
                return str == null ? "Выбрать день" : str;
            }

            public b() {
            }
        }

        /* compiled from: EndDealField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<ChipDateInput> {
            @Override // android.os.Parcelable.Creator
            public final ChipDateInput createFromParcel(Parcel parcel) {
                LocalDate localDate = (LocalDate) parcel.readSerializable();
                AttributedText attributedText = (AttributedText) parcel.readParcelable(ChipDateInput.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Chip.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new ChipDateInput(localDate, attributedText, arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ChipDateInput[] newArray(int i12) {
                return new ChipDateInput[i12];
            }
        }

        public ChipDateInput(@l LocalDate localDate, @k AttributedText attributedText, @k List<Chip> list, boolean z12, boolean z13) {
            this.f122249b = localDate;
            this.f122250c = attributedText;
            this.f122251d = list;
            this.f122252e = z12;
            this.f122253f = z13;
        }

        public static ChipDateInput a(ChipDateInput chipDateInput, LocalDate localDate, List list, boolean z12, int i12) {
            if ((i12 & 1) != 0) {
                localDate = chipDateInput.f122249b;
            }
            AttributedText attributedText = chipDateInput.f122250c;
            boolean z13 = chipDateInput.f122252e;
            chipDateInput.getClass();
            return new ChipDateInput(localDate, attributedText, list, z13, z12);
        }

        @Override // com.avito.android.comfortable_deal.end_deal.model.EndDealField
        public final boolean X() {
            return this.f122249b != null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChipDateInput)) {
                return false;
            }
            ChipDateInput chipDateInput = (ChipDateInput) obj;
            return L.f(this.f122249b, chipDateInput.f122249b) && L.f(this.f122250c, chipDateInput.f122250c) && L.f(this.f122251d, chipDateInput.f122251d) && this.f122252e == chipDateInput.f122252e && this.f122253f == chipDateInput.f122253f;
        }

        @Override // com.avito.android.comfortable_deal.end_deal.model.EndDealField
        /* renamed from: getHasError, reason: from getter */
        public final boolean getF122253f() {
            return this.f122253f;
        }

        public final int hashCode() {
            LocalDate localDate = this.f122249b;
            return Boolean.hashCode(this.f122253f) + r.i(H.e(com.avito.android.actions_sheet.a.b((localDate == null ? 0 : localDate.hashCode()) * 31, 31, this.f122250c), 31, this.f122251d), 31, this.f122252e);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChipDateInput(date=");
            sb2.append(this.f122249b);
            sb2.append(", title=");
            sb2.append(this.f122250c);
            sb2.append(", chips=");
            sb2.append(this.f122251d);
            sb2.append(", required=");
            sb2.append(this.f122252e);
            sb2.append(", isError=");
            return r.x(sb2, this.f122253f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeSerializable(this.f122249b);
            parcel.writeParcelable(this.f122250c, i12);
            Iterator itJ = C0.j(this.f122251d, parcel);
            while (itJ.hasNext()) {
                ((Chip) itJ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeInt(this.f122252e ? 1 : 0);
            parcel.writeInt(this.f122253f ? 1 : 0);
        }

        /* compiled from: EndDealField.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/model/EndDealField$ChipDateInput$Chip;", "Lcom/akita/compose/component/chips/b;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @F3
        @d
        public static final /* data */ class Chip implements InterfaceC27333b, Parcelable {

            @k
            public static final Parcelable.Creator<Chip> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f122254b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final LocalDate f122255c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f122256d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f122257e;

            /* compiled from: EndDealField.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Chip> {
                @Override // android.os.Parcelable.Creator
                public final Chip createFromParcel(Parcel parcel) {
                    return new Chip(parcel.readString(), (LocalDate) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Chip[] newArray(int i12) {
                    return new Chip[i12];
                }
            }

            public Chip(@k String str, @l LocalDate localDate, @k String str2, boolean z12) {
                this.f122254b = str;
                this.f122255c = localDate;
                this.f122256d = str2;
                this.f122257e = z12;
            }

            public static Chip a(Chip chip, LocalDate localDate, String str, boolean z12, int i12) {
                String str2 = chip.f122254b;
                if ((i12 & 2) != 0) {
                    localDate = chip.f122255c;
                }
                if ((i12 & 4) != 0) {
                    str = chip.f122256d;
                }
                if ((i12 & 8) != 0) {
                    z12 = chip.f122257e;
                }
                chip.getClass();
                return new Chip(str2, localDate, str, z12);
            }

            @Override // com.akita.compose.component.chips.InterfaceC27333b
            @InterfaceC42165v
            @l
            public final Integer c() {
                return null;
            }

            @Override // com.akita.compose.component.chips.InterfaceC27333b
            @InterfaceC42165v
            @l
            public final Integer d() {
                return null;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Chip)) {
                    return false;
                }
                Chip chip = (Chip) obj;
                return L.f(this.f122254b, chip.f122254b) && L.f(this.f122255c, chip.f122255c) && L.f(this.f122256d, chip.f122256d) && this.f122257e == chip.f122257e;
            }

            @Override // com.akita.compose.component.chips.InterfaceC27333b
            @k
            /* renamed from: getTitle, reason: from getter */
            public final String getF4193c() {
                return this.f122256d;
            }

            public final int hashCode() {
                int iHashCode = this.f122254b.hashCode() * 31;
                LocalDate localDate = this.f122255c;
                return Boolean.hashCode(this.f122257e) + H.d((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.f122256d);
            }

            @Override // com.akita.compose.component.chips.InterfaceC27333b
            public final boolean isActive() {
                return true;
            }

            @Override // com.akita.compose.component.chips.InterfaceC27333b
            /* renamed from: isEnabled */
            public final boolean getF4195e() {
                return true;
            }

            @Override // com.akita.compose.component.chips.InterfaceC27333b
            /* renamed from: isSelected, reason: from getter */
            public final boolean getF4194d() {
                return this.f122257e;
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Chip(id=");
                sb2.append(this.f122254b);
                sb2.append(", date=");
                sb2.append(this.f122255c);
                sb2.append(", title=");
                sb2.append(this.f122256d);
                sb2.append(", isSelected=");
                return r.x(sb2, this.f122257e, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f122254b);
                parcel.writeSerializable(this.f122255c);
                parcel.writeString(this.f122256d);
                parcel.writeInt(this.f122257e ? 1 : 0);
            }

            public /* synthetic */ Chip(String str, LocalDate localDate, String str2, boolean z12, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? null : localDate, str2, (i12 & 8) != 0 ? false : z12);
            }
        }

        public /* synthetic */ ChipDateInput(LocalDate localDate, AttributedText attributedText, List list, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : localDate, attributedText, list, (i12 & 8) != 0 ? true : z12, (i12 & 16) != 0 ? false : z13);
        }
    }

    /* compiled from: EndDealField.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/model/EndDealField$Comment;", "Lcom/avito/android/comfortable_deal/end_deal/model/EndDealField;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @F3
    @d
    public static final /* data */ class Comment implements EndDealField {

        @k
        public static final Parcelable.Creator<Comment> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f122268b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f122269c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final AttributedText f122270d;

        /* compiled from: EndDealField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Comment> {
            @Override // android.os.Parcelable.Creator
            public final Comment createFromParcel(Parcel parcel) {
                return new Comment(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(Comment.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Comment[] newArray(int i12) {
                return new Comment[i12];
            }
        }

        public Comment(@l String str, @l String str2, @k AttributedText attributedText) {
            this.f122268b = str;
            this.f122269c = str2;
            this.f122270d = attributedText;
        }

        @Override // com.avito.android.comfortable_deal.end_deal.model.EndDealField
        public final boolean X() {
            String str = this.f122268b;
            return true ^ (str == null || C43066x.K(str));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Comment)) {
                return false;
            }
            Comment comment = (Comment) obj;
            return L.f(this.f122268b, comment.f122268b) && L.f(this.f122269c, comment.f122269c) && L.f(this.f122270d, comment.f122270d);
        }

        @Override // com.avito.android.comfortable_deal.end_deal.model.EndDealField
        /* renamed from: getHasError */
        public final boolean getF122253f() {
            return false;
        }

        public final int hashCode() {
            String str = this.f122268b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f122269c;
            return this.f122270d.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Comment(value=");
            sb2.append(this.f122268b);
            sb2.append(", placeholder=");
            sb2.append(this.f122269c);
            sb2.append(", title=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f122270d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f122268b);
            parcel.writeString(this.f122269c);
            parcel.writeParcelable(this.f122270d, i12);
        }

        public /* synthetic */ Comment(String str, String str2, AttributedText attributedText, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, attributedText);
        }
    }

    /* compiled from: EndDealField.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/model/EndDealField$ChipGroup;", "Lcom/avito/android/comfortable_deal/end_deal/model/EndDealField;", "Chip", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @F3
    @d
    public static final /* data */ class ChipGroup implements EndDealField {

        @k
        public static final Parcelable.Creator<ChipGroup> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f122259b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f122260c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<Chip> f122261d;

        /* compiled from: EndDealField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ChipGroup> {
            @Override // android.os.Parcelable.Creator
            public final ChipGroup createFromParcel(Parcel parcel) {
                int iC2 = 0;
                boolean z12 = parcel.readInt() != 0;
                AttributedText attributedText = (AttributedText) parcel.readParcelable(ChipGroup.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Chip.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new ChipGroup(arrayList, z12, attributedText);
            }

            @Override // android.os.Parcelable.Creator
            public final ChipGroup[] newArray(int i12) {
                return new ChipGroup[i12];
            }
        }

        /* compiled from: EndDealField.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/comfortable_deal/end_deal/model/EndDealField$ChipGroup$Chip;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b extends N implements Y41.l<Chip, CharSequence> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f122267l = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            public final CharSequence invoke(Chip chip) {
                return chip.f122263c;
            }
        }

        public ChipGroup(@k List list, boolean z12, @k AttributedText attributedText) {
            this.f122259b = z12;
            this.f122260c = attributedText;
            this.f122261d = list;
        }

        @Override // com.avito.android.comfortable_deal.end_deal.model.EndDealField
        public final boolean X() {
            return c() != null;
        }

        @l
        public final String c() {
            List<Chip> list = this.f122261d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Chip) obj).f122265e) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
            if (arrayList2 != null) {
                return C42745f0.O(arrayList2, null, null, null, b.f122267l, 31);
            }
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChipGroup)) {
                return false;
            }
            ChipGroup chipGroup = (ChipGroup) obj;
            return this.f122259b == chipGroup.f122259b && L.f(this.f122260c, chipGroup.f122260c) && L.f(this.f122261d, chipGroup.f122261d);
        }

        @Override // com.avito.android.comfortable_deal.end_deal.model.EndDealField
        /* renamed from: getHasError */
        public final boolean getF122253f() {
            return false;
        }

        public final int hashCode() {
            return this.f122261d.hashCode() + com.avito.android.actions_sheet.a.b(Boolean.hashCode(this.f122259b) * 31, 31, this.f122260c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChipGroup(multiselect=");
            sb2.append(this.f122259b);
            sb2.append(", title=");
            sb2.append(this.f122260c);
            sb2.append(", chips=");
            return H.p(sb2, this.f122261d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f122259b ? 1 : 0);
            parcel.writeParcelable(this.f122260c, i12);
            Iterator itJ = C0.j(this.f122261d, parcel);
            while (itJ.hasNext()) {
                ((Chip) itJ.next()).writeToParcel(parcel, i12);
            }
        }

        /* compiled from: EndDealField.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/model/EndDealField$ChipGroup$Chip;", "Lcom/akita/compose/component/chips/b;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @F3
        @d
        public static final /* data */ class Chip implements InterfaceC27333b, Parcelable {

            @k
            public static final Parcelable.Creator<Chip> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final boolean f122262b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f122263c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f122264d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f122265e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f122266f;

            /* compiled from: EndDealField.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Chip> {
                @Override // android.os.Parcelable.Creator
                public final Chip createFromParcel(Parcel parcel) {
                    return new Chip(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Chip[] newArray(int i12) {
                    return new Chip[i12];
                }
            }

            public Chip(boolean z12, boolean z13, boolean z14, @k String str, @k String str2) {
                this.f122262b = z12;
                this.f122263c = str;
                this.f122264d = str2;
                this.f122265e = z13;
                this.f122266f = z14;
            }

            public static Chip a(Chip chip, boolean z12, boolean z13, int i12) {
                boolean z14 = chip.f122262b;
                String str = chip.f122263c;
                String str2 = chip.f122264d;
                if ((i12 & 8) != 0) {
                    z12 = chip.f122265e;
                }
                chip.getClass();
                return new Chip(z14, z12, z13, str, str2);
            }

            @Override // com.akita.compose.component.chips.InterfaceC27333b
            @InterfaceC42165v
            @l
            public final Integer c() {
                return null;
            }

            @Override // com.akita.compose.component.chips.InterfaceC27333b
            @InterfaceC42165v
            @l
            public final Integer d() {
                return null;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Chip)) {
                    return false;
                }
                Chip chip = (Chip) obj;
                return this.f122262b == chip.f122262b && L.f(this.f122263c, chip.f122263c) && L.f(this.f122264d, chip.f122264d) && this.f122265e == chip.f122265e && this.f122266f == chip.f122266f;
            }

            @Override // com.akita.compose.component.chips.InterfaceC27333b
            @k
            /* renamed from: getTitle, reason: from getter */
            public final String getF4193c() {
                return this.f122264d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f122266f) + r.i(H.d(H.d(Boolean.hashCode(this.f122262b) * 31, 31, this.f122263c), 31, this.f122264d), 31, this.f122265e);
            }

            @Override // com.akita.compose.component.chips.InterfaceC27333b
            public final boolean isActive() {
                return true;
            }

            @Override // com.akita.compose.component.chips.InterfaceC27333b
            /* renamed from: isEnabled, reason: from getter */
            public final boolean getF4195e() {
                return this.f122266f;
            }

            @Override // com.akita.compose.component.chips.InterfaceC27333b
            /* renamed from: isSelected, reason: from getter */
            public final boolean getF4194d() {
                return this.f122265e;
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Chip(disableOtherChips=");
                sb2.append(this.f122262b);
                sb2.append(", id=");
                sb2.append(this.f122263c);
                sb2.append(", title=");
                sb2.append(this.f122264d);
                sb2.append(", isSelected=");
                sb2.append(this.f122265e);
                sb2.append(", isEnabled=");
                return r.x(sb2, this.f122266f, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.f122262b ? 1 : 0);
                parcel.writeString(this.f122263c);
                parcel.writeString(this.f122264d);
                parcel.writeInt(this.f122265e ? 1 : 0);
                parcel.writeInt(this.f122266f ? 1 : 0);
            }

            public /* synthetic */ Chip(boolean z12, String str, String str2, boolean z13, boolean z14, int i12, C42822w c42822w) {
                this(z12, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? true : z14, str, str2);
            }
        }
    }

    /* compiled from: EndDealField.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/model/EndDealField$RoubleInput;", "Lcom/avito/android/comfortable_deal/end_deal/model/EndDealField;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @F3
    @d
    public static final /* data */ class RoubleInput implements EndDealField {

        @k
        public static final Parcelable.Creator<RoubleInput> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f122271b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f122272c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final AttributedText f122273d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final PrintableText f122274e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Integer f122275f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f122276g;

        /* compiled from: EndDealField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RoubleInput> {
            @Override // android.os.Parcelable.Creator
            public final RoubleInput createFromParcel(Parcel parcel) {
                return new RoubleInput(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(RoubleInput.class.getClassLoader()), (PrintableText) parcel.readParcelable(RoubleInput.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final RoubleInput[] newArray(int i12) {
                return new RoubleInput[i12];
            }
        }

        public RoubleInput(@l String str, @l String str2, @k AttributedText attributedText, @l PrintableText printableText, @l Integer num, boolean z12) {
            this.f122271b = str;
            this.f122272c = str2;
            this.f122273d = attributedText;
            this.f122274e = printableText;
            this.f122275f = num;
            this.f122276g = z12;
        }

        public static RoubleInput a(RoubleInput roubleInput, String str, PrintableText printableText, int i12) {
            if ((i12 & 1) != 0) {
                str = roubleInput.f122271b;
            }
            String str2 = roubleInput.f122272c;
            AttributedText attributedText = roubleInput.f122273d;
            Integer num = roubleInput.f122275f;
            boolean z12 = roubleInput.f122276g;
            roubleInput.getClass();
            return new RoubleInput(str, str2, attributedText, printableText, num, z12);
        }

        @Override // com.avito.android.comfortable_deal.end_deal.model.EndDealField
        public final boolean X() {
            String str = this.f122271b;
            return true ^ (str == null || C43066x.K(str));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoubleInput)) {
                return false;
            }
            RoubleInput roubleInput = (RoubleInput) obj;
            return L.f(this.f122271b, roubleInput.f122271b) && L.f(this.f122272c, roubleInput.f122272c) && L.f(this.f122273d, roubleInput.f122273d) && L.f(this.f122274e, roubleInput.f122274e) && L.f(this.f122275f, roubleInput.f122275f) && this.f122276g == roubleInput.f122276g;
        }

        @Override // com.avito.android.comfortable_deal.end_deal.model.EndDealField
        /* renamed from: getHasError */
        public final boolean getF122253f() {
            return this.f122274e != null;
        }

        public final int hashCode() {
            String str = this.f122271b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f122272c;
            int iB2 = com.avito.android.actions_sheet.a.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f122273d);
            PrintableText printableText = this.f122274e;
            int iHashCode2 = (iB2 + (printableText == null ? 0 : printableText.hashCode())) * 31;
            Integer num = this.f122275f;
            return Boolean.hashCode(this.f122276g) + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RoubleInput(value=");
            sb2.append(this.f122271b);
            sb2.append(", placeholder=");
            sb2.append(this.f122272c);
            sb2.append(", title=");
            sb2.append(this.f122273d);
            sb2.append(", errorText=");
            sb2.append(this.f122274e);
            sb2.append(", minValue=");
            sb2.append(this.f122275f);
            sb2.append(", required=");
            return r.x(sb2, this.f122276g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f122271b);
            parcel.writeString(this.f122272c);
            parcel.writeParcelable(this.f122273d, i12);
            parcel.writeParcelable(this.f122274e, i12);
            Integer num = this.f122275f;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeInt(this.f122276g ? 1 : 0);
        }

        public /* synthetic */ RoubleInput(String str, String str2, AttributedText attributedText, PrintableText printableText, Integer num, boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, attributedText, (i12 & 8) != 0 ? null : printableText, (i12 & 16) != 0 ? null : num, (i12 & 32) != 0 ? true : z12);
        }
    }
}
