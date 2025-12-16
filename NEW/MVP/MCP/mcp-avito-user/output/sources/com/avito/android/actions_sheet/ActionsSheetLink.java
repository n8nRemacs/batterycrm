package com.avito.android.actions_sheet;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ActionsSheetLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/actions_sheet/ActionsSheetLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_actions-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes10.dex */
public final /* data */ class ActionsSheetLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ActionsSheetLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ActionsSheetContent f68186b;

    /* compiled from: ActionsSheetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActionsSheetLink> {
        @Override // android.os.Parcelable.Creator
        public final ActionsSheetLink createFromParcel(Parcel parcel) {
            return new ActionsSheetLink(ActionsSheetContent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ActionsSheetLink[] newArray(int i12) {
            return new ActionsSheetLink[i12];
        }
    }

    /* compiled from: ActionsSheetLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/actions_sheet/ActionsSheetLink$b;", "", "a", "b", "Lcom/avito/android/actions_sheet/ActionsSheetLink$b$a;", "Lcom/avito/android/actions_sheet/ActionsSheetLink$b$b;", "_avito_actions-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ActionsSheetLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/actions_sheet/ActionsSheetLink$b$a;", "LJu/c$a;", "Lcom/avito/android/actions_sheet/ActionsSheetLink$b;", "_avito_actions-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.a, b {
        }

        /* compiled from: ActionsSheetLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/actions_sheet/ActionsSheetLink$b$b;", "LJu/c$b;", "Lcom/avito/android/actions_sheet/ActionsSheetLink$b;", "<init>", "()V", "_avito_actions-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.actions_sheet.ActionsSheetLink$b$b, reason: collision with other inner class name */
        public static final class C2132b implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C2132b f68187b = new C2132b();
        }
    }

    public ActionsSheetLink(@k ActionsSheetContent actionsSheetContent) {
        this.f68186b = actionsSheetContent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionsSheetLink) && L.f(this.f68186b, ((ActionsSheetLink) obj).f68186b);
    }

    public final int hashCode() {
        return this.f68186b.hashCode();
    }

    @k
    public final String toString() {
        return "ActionsSheetLink(content=" + this.f68186b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f68186b.writeToParcel(parcel, i12);
    }
}
