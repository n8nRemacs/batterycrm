package com.avito.android.select_bottom_sheet_dialog.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: JobSelectBottomSheetDialogLink.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink$Type;", "type", "", "title", "", "Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink$Option;", "options", "selectedId", "<init>", "(Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink$Type;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink$Type;", "h", "()Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink$Type;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "f", "()Ljava/util/List;", "g", "Option", "b", "Type", "_avito_job_select-bottom-sheet-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class JobSelectBottomSheetDialogLink extends DeepLink {

    @k
    public static final Parcelable.Creator<JobSelectBottomSheetDialogLink> CREATOR = new a();

    @com.google.gson.annotations.c("options")
    @k
    private final List<Option> options;

    @com.google.gson.annotations.c("selectedId")
    @l
    private final String selectedId;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("type")
    @k
    private final Type type;

    /* compiled from: JobSelectBottomSheetDialogLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink$Option;", "Landroid/os/Parcelable;", "", "id", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "_avito_job_select-bottom-sheet-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Option implements Parcelable {

        @k
        public static final Parcelable.Creator<Option> CREATOR = new a();

        @com.google.gson.annotations.c("id")
        @k
        private final String id;

        @com.google.gson.annotations.c("subtitle")
        @l
        private final String subtitle;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        /* compiled from: JobSelectBottomSheetDialogLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Option> {
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                return new Option(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i12) {
                return new Option[i12];
            }
        }

        public Option(@k String str, @k String str2, @l String str3) {
            this.id = str;
            this.title = str2;
            this.subtitle = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return L.f(this.id, option.id) && L.f(this.title, option.title) && L.f(this.subtitle, option.subtitle);
        }

        @k
        public final String getId() {
            return this.id;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Option(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            return C22026a.c(sb2, this.subtitle, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JobSelectBottomSheetDialogLink.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink$Type;", "", "Landroid/os/Parcelable;", "_avito_job_select-bottom-sheet-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class Type implements Parcelable {

        @k
        public static final Parcelable.Creator<Type> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        public static final Type f266860b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Type[] f266861c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f266862d;

        /* compiled from: JobSelectBottomSheetDialogLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Type> {
            @Override // android.os.Parcelable.Creator
            public final Type createFromParcel(Parcel parcel) {
                return Type.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Type[] newArray(int i12) {
                return new Type[i12];
            }
        }

        static {
            Type type = new Type("JOB_SEARCH_STATUS", 0);
            Type type2 = new Type("CV_VISIBILITY", 1);
            Type type3 = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
            f266860b = type3;
            Type[] typeArr = {type, type2, type3};
            f266861c = typeArr;
            f266862d = kotlin.enums.c.a(typeArr);
            CREATOR = new a();
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f266861c.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(name());
        }
    }

    /* compiled from: JobSelectBottomSheetDialogLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobSelectBottomSheetDialogLink> {
        @Override // android.os.Parcelable.Creator
        public final JobSelectBottomSheetDialogLink createFromParcel(Parcel parcel) {
            Type typeCreateFromParcel = Type.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Option.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new JobSelectBottomSheetDialogLink(typeCreateFromParcel, string, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JobSelectBottomSheetDialogLink[] newArray(int i12) {
            return new JobSelectBottomSheetDialogLink[i12];
        }
    }

    /* compiled from: JobSelectBottomSheetDialogLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink$b;", "LJu/c$b;", "a", "b", "c", "Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink$b$a;", "Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink$b$b;", "Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink$b$c;", "_avito_job_select-bottom-sheet-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: JobSelectBottomSheetDialogLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink$b$a;", "Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink$b;", "<init>", "()V", "_avito_job_select-bottom-sheet-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f266863b = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1098159496;
            }

            @k
            public final String toString() {
                return "Cancel";
            }
        }

        /* compiled from: JobSelectBottomSheetDialogLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink$b$b;", "Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink$b;", "<init>", "()V", "_avito_job_select-bottom-sheet-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.select_bottom_sheet_dialog.deeplink.JobSelectBottomSheetDialogLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C7957b implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C7957b f266864b = new C7957b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C7957b);
            }

            public final int hashCode() {
                return -725803446;
            }

            @k
            public final String toString() {
                return "Error";
            }
        }

        /* compiled from: JobSelectBottomSheetDialogLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink$b$c;", "Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink$b;", "_avito_job_select-bottom-sheet-dialog_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Type f266865b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Option f266866c;

            public c(@k Type type, @k Option option) {
                this.f266865b = type;
                this.f266866c = option;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f266865b == cVar.f266865b && L.f(this.f266866c, cVar.f266866c);
            }

            public final int hashCode() {
                return this.f266866c.hashCode() + (this.f266865b.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "Success(type=" + this.f266865b + ", selectedOption=" + this.f266866c + ')';
            }
        }
    }

    public JobSelectBottomSheetDialogLink(@k Type type, @k String str, @k List<Option> list, @l String str2) {
        this.type = type;
        this.title = str;
        this.options = list;
        this.selectedId = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobSelectBottomSheetDialogLink)) {
            return false;
        }
        JobSelectBottomSheetDialogLink jobSelectBottomSheetDialogLink = (JobSelectBottomSheetDialogLink) obj;
        return this.type == jobSelectBottomSheetDialogLink.type && L.f(this.title, jobSelectBottomSheetDialogLink.title) && L.f(this.options, jobSelectBottomSheetDialogLink.options) && L.f(this.selectedId, jobSelectBottomSheetDialogLink.selectedId);
    }

    @k
    public final List<Option> f() {
        return this.options;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getSelectedId() {
        return this.selectedId;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        int iE2 = H.e(H.d(this.type.hashCode() * 31, 31, this.title), 31, this.options);
        String str = this.selectedId;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobSelectBottomSheetDialogLink(type=");
        sb2.append(this.type);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", options=");
        sb2.append(this.options);
        sb2.append(", selectedId=");
        return C22026a.c(sb2, this.selectedId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.type.writeToParcel(parcel, i12);
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.options, parcel);
        while (itJ.hasNext()) {
            ((Option) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.selectedId);
    }
}
