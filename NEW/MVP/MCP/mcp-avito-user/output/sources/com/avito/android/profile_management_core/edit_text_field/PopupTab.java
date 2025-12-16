package com.avito.android.profile_management_core.edit_text_field;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PopupTabs.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_management_core/edit_text_field/PopupTab;", "Landroid/os/Parcelable;", "ListTab", "StoryTab", "Lcom/avito/android/profile_management_core/edit_text_field/PopupTab$ListTab;", "Lcom/avito/android/profile_management_core/edit_text_field/PopupTab$StoryTab;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface PopupTab extends Parcelable {

    /* compiled from: PopupTabs.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/edit_text_field/PopupTab$ListTab;", "Lcom/avito/android/profile_management_core/edit_text_field/PopupTab;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ListTab implements PopupTab {

        @k
        public static final Parcelable.Creator<ListTab> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f226616b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<String> f226617c;

        /* compiled from: PopupTabs.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ListTab> {
            @Override // android.os.Parcelable.Creator
            public final ListTab createFromParcel(Parcel parcel) {
                return new ListTab(parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final ListTab[] newArray(int i12) {
                return new ListTab[i12];
            }
        }

        public ListTab(@k String str, @k List<String> list) {
            this.f226616b = str;
            this.f226617c = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListTab)) {
                return false;
            }
            ListTab listTab = (ListTab) obj;
            return L.f(this.f226616b, listTab.f226616b) && L.f(this.f226617c, listTab.f226617c);
        }

        @Override // com.avito.android.profile_management_core.edit_text_field.PopupTab
        @k
        /* renamed from: getTitle, reason: from getter */
        public final String getF226618b() {
            return this.f226616b;
        }

        public final int hashCode() {
            return this.f226617c.hashCode() + (this.f226616b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ListTab(title=");
            sb2.append(this.f226616b);
            sb2.append(", points=");
            return H.p(sb2, this.f226617c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f226616b);
            parcel.writeStringList(this.f226617c);
        }
    }

    /* compiled from: PopupTabs.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_management_core/edit_text_field/PopupTab$StoryTab;", "Lcom/avito/android/profile_management_core/edit_text_field/PopupTab;", "Story", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class StoryTab implements PopupTab {

        @k
        public static final Parcelable.Creator<StoryTab> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f226618b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f226619c;

        /* compiled from: PopupTabs.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/edit_text_field/PopupTab$StoryTab$Story;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Story implements Parcelable {

            @k
            public static final Parcelable.Creator<Story> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @l
            public final List<String> f226620b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final AttributedText f226621c;

            /* compiled from: PopupTabs.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Story> {
                @Override // android.os.Parcelable.Creator
                public final Story createFromParcel(Parcel parcel) {
                    return new Story(parcel.createStringArrayList(), (AttributedText) parcel.readParcelable(Story.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Story[] newArray(int i12) {
                    return new Story[i12];
                }
            }

            public Story(@l List<String> list, @k AttributedText attributedText) {
                this.f226620b = list;
                this.f226621c = attributedText;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Story)) {
                    return false;
                }
                Story story = (Story) obj;
                return L.f(this.f226620b, story.f226620b) && L.f(this.f226621c, story.f226621c);
            }

            public final int hashCode() {
                List<String> list = this.f226620b;
                return this.f226621c.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Story(points=");
                sb2.append(this.f226620b);
                sb2.append(", text=");
                return com.avito.android.actions_sheet.a.w(sb2, this.f226621c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeStringList(this.f226620b);
                parcel.writeParcelable(this.f226621c, i12);
            }
        }

        /* compiled from: PopupTabs.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StoryTab> {
            @Override // android.os.Parcelable.Creator
            public final StoryTab createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Story.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new StoryTab(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final StoryTab[] newArray(int i12) {
                return new StoryTab[i12];
            }
        }

        public StoryTab(@k String str, @k ArrayList arrayList) {
            this.f226618b = str;
            this.f226619c = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StoryTab)) {
                return false;
            }
            StoryTab storyTab = (StoryTab) obj;
            return L.f(this.f226618b, storyTab.f226618b) && this.f226619c.equals(storyTab.f226619c);
        }

        @Override // com.avito.android.profile_management_core.edit_text_field.PopupTab
        @k
        /* renamed from: getTitle, reason: from getter */
        public final String getF226618b() {
            return this.f226618b;
        }

        public final int hashCode() {
            return this.f226619c.hashCode() + (this.f226618b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("StoryTab(title=");
            sb2.append(this.f226618b);
            sb2.append(", stories=");
            return e.p(sb2, this.f226619c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f226618b);
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f226619c, parcel);
            while (itZ.hasNext()) {
                ((Story) itZ.next()).writeToParcel(parcel, i12);
            }
        }
    }

    @k
    /* renamed from: getTitle */
    String getF226618b();
}
