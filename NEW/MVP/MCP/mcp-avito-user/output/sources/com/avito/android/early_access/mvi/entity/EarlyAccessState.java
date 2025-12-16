package com.avito.android.early_access.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.C22602e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.early_access.mvi.entity.PopupContentType;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessState.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "Content", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessState$Content;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class EarlyAccessState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f145472b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final Content f145473c = new Content(new ButtonContent("", null, null, 6, null), null, C42784z0.f406748b, PopupContentType.Default.f145482b, false, false, 48, null);

    /* compiled from: EarlyAccessState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessState$Content;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessState;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Content extends EarlyAccessState {

        @k
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ButtonContent f145474d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final CharSequence f145475e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final List<ParcelableItem> f145476f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final PopupContentType f145477g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f145478h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f145479i;

        /* compiled from: EarlyAccessState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Content> {
            @Override // android.os.Parcelable.Creator
            public final Content createFromParcel(Parcel parcel) {
                ButtonContent buttonContentCreateFromParcel = ButtonContent.CREATOR.createFromParcel(parcel);
                CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Content.class, parcel, arrayList, iL2, 1);
                }
                return new Content(buttonContentCreateFromParcel, charSequence, arrayList, (PopupContentType) parcel.readParcelable(Content.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Content[] newArray(int i12) {
                return new Content[i12];
            }
        }

        public /* synthetic */ Content(ButtonContent buttonContent, CharSequence charSequence, List list, PopupContentType popupContentType, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this(buttonContent, charSequence, list, popupContentType, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? false : z13);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.CharSequence] */
        public static Content a(Content content, ButtonContent buttonContent, C22602e c22602e, ArrayList arrayList, PopupContentType popupContentType, boolean z12, boolean z13, int i12) {
            if ((i12 & 1) != 0) {
                buttonContent = content.f145474d;
            }
            ButtonContent buttonContent2 = buttonContent;
            C22602e c22602e2 = c22602e;
            if ((i12 & 2) != 0) {
                c22602e2 = content.f145475e;
            }
            C22602e c22602e3 = c22602e2;
            List list = arrayList;
            if ((i12 & 4) != 0) {
                list = content.f145476f;
            }
            List list2 = list;
            if ((i12 & 8) != 0) {
                popupContentType = content.f145477g;
            }
            PopupContentType popupContentType2 = popupContentType;
            if ((i12 & 16) != 0) {
                z12 = content.f145478h;
            }
            boolean z14 = z12;
            if ((i12 & 32) != 0) {
                z13 = content.f145479i;
            }
            content.getClass();
            return new Content(buttonContent2, c22602e3, list2, popupContentType2, z14, z13);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f145474d, content.f145474d) && L.f(this.f145475e, content.f145475e) && L.f(this.f145476f, content.f145476f) && L.f(this.f145477g, content.f145477g) && this.f145478h == content.f145478h && this.f145479i == content.f145479i;
        }

        public final int hashCode() {
            int iHashCode = this.f145474d.hashCode() * 31;
            CharSequence charSequence = this.f145475e;
            return Boolean.hashCode(this.f145479i) + r.i((this.f145477g.hashCode() + H.e((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.f145476f)) * 31, 31, this.f145478h);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(buttonContent=");
            sb2.append(this.f145474d);
            sb2.append(", legalText=");
            sb2.append((Object) this.f145475e);
            sb2.append(", items=");
            sb2.append(this.f145476f);
            sb2.append(", popupContentType=");
            sb2.append(this.f145477g);
            sb2.append(", isLoading=");
            sb2.append(this.f145478h);
            sb2.append(", isPaying=");
            return r.x(sb2, this.f145479i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f145474d.writeToParcel(parcel, i12);
            TextUtils.writeToParcel(this.f145475e, parcel, i12);
            Iterator itJ = C0.j(this.f145476f, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
            parcel.writeParcelable(this.f145477g, i12);
            parcel.writeInt(this.f145478h ? 1 : 0);
            parcel.writeInt(this.f145479i ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Content(@k ButtonContent buttonContent, @l CharSequence charSequence, @k List<? extends ParcelableItem> list, @k PopupContentType popupContentType, boolean z12, boolean z13) {
            super(null);
            this.f145474d = buttonContent;
            this.f145475e = charSequence;
            this.f145476f = list;
            this.f145477g = popupContentType;
            this.f145478h = z12;
            this.f145479i = z13;
        }
    }

    /* compiled from: EarlyAccessState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/EarlyAccessState$a;", "", "<init>", "()V", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ EarlyAccessState(C42822w c42822w) {
        this();
    }

    public EarlyAccessState() {
    }
}
