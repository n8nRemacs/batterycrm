package com.avito.android.messenger.conversation.mvi.message_suggests;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import j.InterfaceC42156l;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MessageSuggestsView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView;", "Lcom/avito/android/mvi/e;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "b", "SuggestItem", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MessageSuggestsView extends com.avito.android.mvi.e<b> {

    /* compiled from: MessageSuggestsView.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$SuggestItem;", "Lcom/avito/android/lib/design/chips/h;", "Landroid/os/Parcelable;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class SuggestItem implements com.avito.android.lib.design.chips.h, Parcelable {

        @Y61.k
        public static final Parcelable.Creator<SuggestItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f191926b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f191927c;

        /* renamed from: d, reason: collision with root package name */
        public final int f191928d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f191929e;

        /* renamed from: f, reason: collision with root package name */
        public final int f191930f;

        /* compiled from: MessageSuggestsView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SuggestItem> {
            @Override // android.os.Parcelable.Creator
            public final SuggestItem createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                return new SuggestItem(parcel.readInt(), parcel.readInt(), string, string2, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuggestItem[] newArray(int i12) {
                return new SuggestItem[i12];
            }
        }

        public SuggestItem(int i12, int i13, @Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
            this.f191926b = str;
            this.f191927c = str2;
            this.f191928d = i12;
            this.f191929e = str3;
            this.f191930f = i13;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@Y61.k Object obj) {
            if (obj instanceof SuggestItem) {
                return L.f(((SuggestItem) obj).f191926b, this.f191926b);
            }
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: W */
        public final CharSequence getF278901b() {
            return this.f191926b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e e2() {
            return null;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuggestItem)) {
                return false;
            }
            SuggestItem suggestItem = (SuggestItem) obj;
            return L.f(this.f191926b, suggestItem.f191926b) && L.f(this.f191927c, suggestItem.f191927c) && this.f191928d == suggestItem.f191928d && L.f(this.f191929e, suggestItem.f191929e) && this.f191930f == suggestItem.f191930f;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF178766f() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        public final int hashCode() {
            int iE2 = androidx.appcompat.app.r.e(this.f191928d, androidx.compose.foundation.H.d(this.f191926b.hashCode() * 31, 31, this.f191927c), 31);
            String str = this.f191929e;
            return Integer.hashCode(this.f191930f) + ((iE2 + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF178769i() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SuggestItem(chipTitle=");
            sb2.append(this.f191926b);
            sb2.append(", suggestText=");
            sb2.append(this.f191927c);
            sb2.append(", suggestId=");
            sb2.append(this.f191928d);
            sb2.append(", intent=");
            sb2.append(this.f191929e);
            sb2.append(", positionIndex=");
            return androidx.appcompat.app.r.t(sb2, this.f191930f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f191926b);
            parcel.writeString(this.f191927c);
            parcel.writeInt(this.f191928d);
            parcel.writeString(this.f191929e);
            parcel.writeInt(this.f191930f);
        }
    }

    /* compiled from: MessageSuggestsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: MessageSuggestsView.kt */
    @P
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "", "a", "b", "c", "d", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b$a;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b$b;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b$c;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<SuggestItem> f191931a;

        /* compiled from: MessageSuggestsView.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b$a;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f191932b = new a();

            public a() {
                super(C42784z0.f406748b, null);
            }
        }

        /* compiled from: MessageSuggestsView.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b$b;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView$b$b, reason: collision with other inner class name */
        public static final class C5670b extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C5670b f191933b = new C5670b();

            public C5670b() {
                super(C42784z0.f406748b, null);
            }
        }

        /* compiled from: MessageSuggestsView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b$c;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f191934b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f191935c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f191936d;

            public c(@Y61.l String str, @Y61.k List list, boolean z12) {
                super(list, null);
                this.f191934b = str;
                this.f191935c = z12;
                this.f191936d = !z12;
            }
        }

        /* compiled from: MessageSuggestsView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b$d;", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f191937b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f191938c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f191939d;

            public d(@Y61.l String str, @Y61.k List list, boolean z12) {
                super(list, null);
                this.f191937b = str;
                this.f191938c = z12;
                this.f191939d = !z12;
            }
        }

        public b() {
            throw null;
        }

        public b(List list, C42822w c42822w) {
            this.f191931a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && getClass().equals(obj.getClass())) {
                return L.f(this.f191931a, ((b) obj).f191931a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f191931a.hashCode();
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append("(suggestItems=");
            return androidx.compose.foundation.H.p(sb2, this.f191931a, ')');
        }
    }
}
