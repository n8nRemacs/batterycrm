package com.avito.android.messenger.conversation.mvi.send;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.view.InterfaceC22982O;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.messenger.conversation.adapter.quote.QuoteViewData;
import com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView;
import com.avito.android.messenger.conversation.mvi.quick_replies.adapter.a;
import com.avito.android.messenger.input.MessageInput;
import com.avito.android.remote.feedback.FeedbackAdvertItem;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenu;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message.Quote;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import ru.avito.messenger.MessengerUserHashInfo;
import shark.AndroidResourceIdNames;

/* compiled from: SendMessagePresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter;", "LS20/a;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "Landroidx/lifecycle/O;", "ContextItemInfo", "IncidentWarning", "RecordingVideoFileReference", "State", "VoiceRecorderState", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SendMessagePresenter extends S20.a<State>, InterfaceC22982O {

    /* compiled from: SendMessagePresenter.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$ContextItemInfo;", "Landroid/os/Parcelable;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ContextItemInfo implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ContextItemInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f194405b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f194406c;

        /* compiled from: SendMessagePresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ContextItemInfo> {
            @Override // android.os.Parcelable.Creator
            public final ContextItemInfo createFromParcel(Parcel parcel) {
                return new ContextItemInfo(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ContextItemInfo[] newArray(int i12) {
                return new ContextItemInfo[i12];
            }
        }

        public ContextItemInfo(@Y61.k String str, boolean z12) {
            this.f194405b = str;
            this.f194406c = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContextItemInfo)) {
                return false;
            }
            ContextItemInfo contextItemInfo = (ContextItemInfo) obj;
            return kotlin.jvm.internal.L.f(this.f194405b, contextItemInfo.f194405b) && this.f194406c == contextItemInfo.f194406c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f194406c) + (this.f194405b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContextItemInfo(itemId=");
            sb2.append(this.f194405b);
            sb2.append(", isItemSeller=");
            return androidx.appcompat.app.r.x(sb2, this.f194406c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f194405b);
            parcel.writeInt(this.f194406c ? 1 : 0);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$IncidentWarning;", "Landroid/os/Parcelable;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class IncidentWarning implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<IncidentWarning> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f194407b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f194408c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f194409d;

        /* compiled from: SendMessagePresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<IncidentWarning> {
            @Override // android.os.Parcelable.Creator
            public final IncidentWarning createFromParcel(Parcel parcel) {
                return new IncidentWarning(parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final IncidentWarning[] newArray(int i12) {
                return new IncidentWarning[i12];
            }
        }

        public IncidentWarning(boolean z12, @Y61.k String str, boolean z13) {
            this.f194407b = z12;
            this.f194408c = str;
            this.f194409d = z13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IncidentWarning)) {
                return false;
            }
            IncidentWarning incidentWarning = (IncidentWarning) obj;
            return this.f194407b == incidentWarning.f194407b && kotlin.jvm.internal.L.f(this.f194408c, incidentWarning.f194408c) && this.f194409d == incidentWarning.f194409d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f194409d) + androidx.compose.foundation.H.d(Boolean.hashCode(this.f194407b) * 31, 31, this.f194408c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("IncidentWarning(blockInput=");
            sb2.append(this.f194407b);
            sb2.append(", warningText=");
            sb2.append(this.f194408c);
            sb2.append(", showToastBar=");
            return androidx.appcompat.app.r.x(sb2, this.f194409d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f194407b ? 1 : 0);
            parcel.writeString(this.f194408c);
            parcel.writeInt(this.f194409d ? 1 : 0);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$RecordingVideoFileReference;", "Landroid/os/Parcelable;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class RecordingVideoFileReference implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<RecordingVideoFileReference> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Uri f194410b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f194411c;

        /* compiled from: SendMessagePresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RecordingVideoFileReference> {
            @Override // android.os.Parcelable.Creator
            public final RecordingVideoFileReference createFromParcel(Parcel parcel) {
                return new RecordingVideoFileReference((Uri) parcel.readParcelable(RecordingVideoFileReference.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RecordingVideoFileReference[] newArray(int i12) {
                return new RecordingVideoFileReference[i12];
            }
        }

        public RecordingVideoFileReference(@Y61.k Uri uri, @Y61.k String str) {
            this.f194410b = uri;
            this.f194411c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecordingVideoFileReference)) {
                return false;
            }
            RecordingVideoFileReference recordingVideoFileReference = (RecordingVideoFileReference) obj;
            return kotlin.jvm.internal.L.f(this.f194410b, recordingVideoFileReference.f194410b) && kotlin.jvm.internal.L.f(this.f194411c, recordingVideoFileReference.f194411c);
        }

        public final int hashCode() {
            return this.f194411c.hashCode() + (this.f194410b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RecordingVideoFileReference(contentUri=");
            sb2.append(this.f194410b);
            sb2.append(", internalPath=");
            return C22026a.c(sb2, this.f194411c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f194410b, i12);
            parcel.writeString(this.f194411c);
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "Landroid/os/Parcelable;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class State implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* renamed from: A, reason: collision with root package name */
        @Y61.l
        public final Boolean f194412A;

        /* renamed from: B, reason: collision with root package name */
        @Y61.l
        public final Boolean f194413B;

        /* renamed from: C, reason: collision with root package name */
        @Y61.l
        public final Quote f194414C;

        /* renamed from: D, reason: collision with root package name */
        @Y61.l
        public final QuoteViewData f194415D;

        /* renamed from: E, reason: collision with root package name */
        @Y61.k
        public final List<User> f194416E;

        /* renamed from: F, reason: collision with root package name */
        @Y61.k
        public final Map<String, VideoInfo> f194417F;

        /* renamed from: G, reason: collision with root package name */
        @Y61.k
        public final VoiceRecorderState f194418G;

        /* renamed from: H, reason: collision with root package name */
        public final boolean f194419H;

        /* renamed from: I, reason: collision with root package name */
        @Y61.l
        public final MessageSuggestsView.SuggestItem f194420I;

        /* renamed from: J, reason: collision with root package name */
        @Y61.l
        public final IncidentWarning f194421J;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final MessengerUserHashInfo f194422b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final List<String> f194423c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final ContextItemInfo f194424d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Boolean f194425e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f194426f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f194427g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f194428h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f194429i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f194430j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f194431k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f194432l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f194433m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f194434n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f194435o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f194436p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.k
        public final MessageInput.AttachButtonState f194437q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.l
        public final AttachMenu f194438r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f194439s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.l
        public final MessageBody.Location f194440t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f194441u;

        /* renamed from: v, reason: collision with root package name */
        @Y61.k
        public final Map<Onboarding, OnboardingState> f194442v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f194443w;

        /* renamed from: x, reason: collision with root package name */
        public final boolean f194444x;

        /* renamed from: y, reason: collision with root package name */
        @Y61.l
        public final Boolean f194445y;

        /* renamed from: z, reason: collision with root package name */
        @Y61.l
        public final String f194446z;

        /* compiled from: SendMessagePresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) parcel.readParcelable(State.class.getClassLoader());
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ContextItemInfo contextItemInfoCreateFromParcel = parcel.readInt() == 0 ? null : ContextItemInfo.CREATOR.createFromParcel(parcel);
                Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                String string = parcel.readString();
                boolean z12 = parcel.readInt() != 0;
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0;
                boolean z15 = parcel.readInt() != 0;
                boolean z16 = parcel.readInt() != 0;
                boolean z17 = parcel.readInt() != 0;
                boolean z18 = parcel.readInt() != 0;
                boolean z19 = parcel.readInt() != 0;
                boolean z22 = parcel.readInt() != 0;
                boolean z23 = parcel.readInt() != 0;
                MessageInput.AttachButtonState attachButtonStateValueOf = MessageInput.AttachButtonState.valueOf(parcel.readString());
                AttachMenu attachMenu = (AttachMenu) parcel.readParcelable(State.class.getClassLoader());
                boolean z24 = parcel.readInt() != 0;
                MessageBody.Location location = (MessageBody.Location) parcel.readParcelable(State.class.getClassLoader());
                boolean z25 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashMap.put(Onboarding.valueOf(parcel.readString()), OnboardingState.valueOf(parcel.readString()));
                }
                boolean z26 = parcel.readInt() != 0;
                boolean z27 = parcel.readInt() != 0;
                Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                String string2 = parcel.readString();
                Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Boolean boolValueOf4 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Quote quote = (Quote) parcel.readParcelable(State.class.getClassLoader());
                QuoteViewData quoteViewDataCreateFromParcel = parcel.readInt() == 0 ? null : QuoteViewData.CREATOR.createFromParcel(parcel);
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                int iL2 = 0;
                while (iL2 != i14) {
                    iL2 = com.avito.android.actions_sheet.a.l(State.class, parcel, arrayList, iL2, 1);
                }
                int i15 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i15);
                int iC2 = 0;
                while (iC2 != i15) {
                    iC2 = com.avito.android.bxcontent.mvi.entity.f.c(State.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                    arrayList = arrayList;
                    linkedHashMap = linkedHashMap;
                    i15 = i15;
                }
                return new State(messengerUserHashInfo, arrayListCreateStringArrayList, contextItemInfoCreateFromParcel, boolValueOf, string, z12, z13, z14, z15, z16, z17, z18, z19, z22, z23, attachButtonStateValueOf, attachMenu, z24, location, z25, linkedHashMap, z26, z27, boolValueOf2, string2, boolValueOf3, boolValueOf4, quote, quoteViewDataCreateFromParcel, arrayList, linkedHashMap2, (VoiceRecorderState) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : MessageSuggestsView.SuggestItem.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? IncidentWarning.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i12) {
                return new State[i12];
            }
        }

        public State() {
            this(null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, -1, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static State a(State state, MessengerUserHashInfo messengerUserHashInfo, ArrayList arrayList, ContextItemInfo contextItemInfo, Boolean bool, String str, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z22, MessageInput.AttachButtonState attachButtonState, AttachMenu attachMenu, boolean z23, MessageBody.Location location, boolean z24, Map map, Boolean bool2, String str2, Boolean bool3, Boolean bool4, Quote quote, QuoteViewData quoteViewData, List list, Map map2, VoiceRecorderState voiceRecorderState, boolean z25, MessageSuggestsView.SuggestItem suggestItem, IncidentWarning incidentWarning, int i12, int i13) {
            MessengerUserHashInfo messengerUserHashInfo2 = (i12 & 1) != 0 ? state.f194422b : messengerUserHashInfo;
            List list2 = (i12 & 2) != 0 ? state.f194423c : arrayList;
            ContextItemInfo contextItemInfo2 = (i12 & 4) != 0 ? state.f194424d : contextItemInfo;
            Boolean bool5 = (i12 & 8) != 0 ? state.f194425e : bool;
            String str3 = (i12 & 16) != 0 ? state.f194426f : str;
            boolean z26 = (i12 & 32) != 0 ? state.f194427g : z12;
            boolean z27 = (i12 & 64) != 0 ? state.f194428h : z13;
            boolean z28 = (i12 & 128) != 0 ? state.f194429i : z14;
            boolean z29 = (i12 & 256) != 0 ? state.f194430j : z15;
            boolean z32 = state.f194431k;
            boolean z33 = (i12 & 1024) != 0 ? state.f194432l : z16;
            boolean z34 = (i12 & 2048) != 0 ? state.f194433m : z17;
            boolean z35 = (i12 & 4096) != 0 ? state.f194434n : z18;
            boolean z36 = (i12 & 8192) != 0 ? state.f194435o : z19;
            boolean z37 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? state.f194436p : z22;
            MessageInput.AttachButtonState attachButtonState2 = (32768 & i12) != 0 ? state.f194437q : attachButtonState;
            AttachMenu attachMenu2 = (65536 & i12) != 0 ? state.f194438r : attachMenu;
            boolean z38 = (131072 & i12) != 0 ? state.f194439s : z23;
            MessageBody.Location location2 = (262144 & i12) != 0 ? state.f194440t : location;
            boolean z39 = (524288 & i12) != 0 ? state.f194441u : z24;
            Map map3 = (1048576 & i12) != 0 ? state.f194442v : map;
            boolean z42 = (2097152 & i12) != 0 ? state.f194443w : true;
            boolean z43 = (4194304 & i12) != 0 ? state.f194444x : true;
            Boolean bool6 = (8388608 & i12) != 0 ? state.f194445y : bool2;
            String str4 = (16777216 & i12) != 0 ? state.f194446z : str2;
            Boolean bool7 = (33554432 & i12) != 0 ? state.f194412A : bool3;
            Boolean bool8 = (67108864 & i12) != 0 ? state.f194413B : bool4;
            Quote quote2 = (134217728 & i12) != 0 ? state.f194414C : quote;
            QuoteViewData quoteViewData2 = (268435456 & i12) != 0 ? state.f194415D : quoteViewData;
            List list3 = (536870912 & i12) != 0 ? state.f194416E : list;
            Map map4 = (1073741824 & i12) != 0 ? state.f194417F : map2;
            VoiceRecorderState voiceRecorderState2 = (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? state.f194418G : voiceRecorderState;
            boolean z44 = (i13 & 1) != 0 ? state.f194419H : z25;
            MessageSuggestsView.SuggestItem suggestItem2 = (i13 & 2) != 0 ? state.f194420I : suggestItem;
            IncidentWarning incidentWarning2 = (i13 & 4) != 0 ? state.f194421J : incidentWarning;
            state.getClass();
            return new State(messengerUserHashInfo2, list2, contextItemInfo2, bool5, str3, z26, z27, z28, z29, z32, z33, z34, z35, z36, z37, attachButtonState2, attachMenu2, z38, location2, z39, map3, z42, z43, bool6, str4, bool7, bool8, quote2, quoteViewData2, list3, map4, voiceRecorderState2, z44, suggestItem2, incidentWarning2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return kotlin.jvm.internal.L.f(this.f194422b, state.f194422b) && kotlin.jvm.internal.L.f(this.f194423c, state.f194423c) && kotlin.jvm.internal.L.f(this.f194424d, state.f194424d) && kotlin.jvm.internal.L.f(this.f194425e, state.f194425e) && kotlin.jvm.internal.L.f(this.f194426f, state.f194426f) && this.f194427g == state.f194427g && this.f194428h == state.f194428h && this.f194429i == state.f194429i && this.f194430j == state.f194430j && this.f194431k == state.f194431k && this.f194432l == state.f194432l && this.f194433m == state.f194433m && this.f194434n == state.f194434n && this.f194435o == state.f194435o && this.f194436p == state.f194436p && this.f194437q == state.f194437q && kotlin.jvm.internal.L.f(this.f194438r, state.f194438r) && this.f194439s == state.f194439s && kotlin.jvm.internal.L.f(this.f194440t, state.f194440t) && this.f194441u == state.f194441u && kotlin.jvm.internal.L.f(this.f194442v, state.f194442v) && this.f194443w == state.f194443w && this.f194444x == state.f194444x && kotlin.jvm.internal.L.f(this.f194445y, state.f194445y) && kotlin.jvm.internal.L.f(this.f194446z, state.f194446z) && kotlin.jvm.internal.L.f(this.f194412A, state.f194412A) && kotlin.jvm.internal.L.f(this.f194413B, state.f194413B) && kotlin.jvm.internal.L.f(this.f194414C, state.f194414C) && kotlin.jvm.internal.L.f(this.f194415D, state.f194415D) && kotlin.jvm.internal.L.f(this.f194416E, state.f194416E) && kotlin.jvm.internal.L.f(this.f194417F, state.f194417F) && kotlin.jvm.internal.L.f(this.f194418G, state.f194418G) && this.f194419H == state.f194419H && kotlin.jvm.internal.L.f(this.f194420I, state.f194420I) && kotlin.jvm.internal.L.f(this.f194421J, state.f194421J);
        }

        public final int hashCode() {
            MessengerUserHashInfo messengerUserHashInfo = this.f194422b;
            int iE2 = androidx.compose.foundation.H.e((messengerUserHashInfo == null ? 0 : messengerUserHashInfo.hashCode()) * 31, 31, this.f194423c);
            ContextItemInfo contextItemInfo = this.f194424d;
            int iHashCode = (iE2 + (contextItemInfo == null ? 0 : contextItemInfo.hashCode())) * 31;
            Boolean bool = this.f194425e;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.f194426f;
            int iHashCode3 = (this.f194437q.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f194427g), 31, this.f194428h), 31, this.f194429i), 31, this.f194430j), 31, this.f194431k), 31, this.f194432l), 31, this.f194433m), 31, this.f194434n), 31, this.f194435o), 31, this.f194436p)) * 31;
            AttachMenu attachMenu = this.f194438r;
            int i12 = androidx.appcompat.app.r.i((iHashCode3 + (attachMenu == null ? 0 : attachMenu.hashCode())) * 31, 31, this.f194439s);
            MessageBody.Location location = this.f194440t;
            int i13 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(AK.c.c(androidx.appcompat.app.r.i((i12 + (location == null ? 0 : location.hashCode())) * 31, 31, this.f194441u), 31, this.f194442v), 31, this.f194443w), 31, this.f194444x);
            Boolean bool2 = this.f194445y;
            int iHashCode4 = (i13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.f194446z;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool3 = this.f194412A;
            int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.f194413B;
            int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Quote quote = this.f194414C;
            int iHashCode8 = (iHashCode7 + (quote == null ? 0 : quote.hashCode())) * 31;
            QuoteViewData quoteViewData = this.f194415D;
            int i14 = androidx.appcompat.app.r.i((this.f194418G.hashCode() + AK.c.c(androidx.compose.foundation.H.e((iHashCode8 + (quoteViewData == null ? 0 : quoteViewData.hashCode())) * 31, 31, this.f194416E), 31, this.f194417F)) * 31, 31, this.f194419H);
            MessageSuggestsView.SuggestItem suggestItem = this.f194420I;
            int iHashCode9 = (i14 + (suggestItem == null ? 0 : suggestItem.hashCode())) * 31;
            IncidentWarning incidentWarning = this.f194421J;
            return iHashCode9 + (incidentWarning != null ? incidentWarning.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "State(currentUserInfo=" + this.f194422b + ", otherUserIds=" + this.f194423c + ", contextItemInfo=" + this.f194424d + ", contextIsReady=" + this.f194425e + ", draftText=" + this.f194426f + ", photoEnabled=" + this.f194427g + ", photoAvailable=" + this.f194428h + ", videoEnabled=" + this.f194429i + ", voiceEnabled=" + this.f194430j + ", voiceAvailable=" + this.f194431k + ", supportEnabled=" + this.f194432l + ", locationEnabled=" + this.f194433m + ", quickRepliesButtonEnabled=" + this.f194434n + ", addRepliesMenuItemIfItIsMissing=" + this.f194435o + ", quickRepliesOnboardingIsAllowed=" + this.f194436p + ", attachButtonState=" + this.f194437q + ", attachMenu=" + this.f194438r + ", attachMenuIsShown=" + this.f194439s + ", defaultSharedLocation=" + this.f194440t + ", startTypingLogged=" + this.f194441u + ", onboardingStates=" + this.f194442v + ", userChangedText=" + this.f194443w + ", draftWasDeletedFromOutside=" + this.f194444x + ", draftWasEmptyOnScreenOpen=" + this.f194445y + ", readOnlyDescription=" + this.f194446z + ", attachFileOnboardingIsAllowed=" + this.f194412A + ", attachFileOnboardingTooltipIsAllowed=" + this.f194413B + ", quoteReply=" + this.f194414C + ", quoteReplyData=" + this.f194415D + ", users=" + this.f194416E + ", videoInfoById=" + this.f194417F + ", voiceRecorderState=" + this.f194418G + ", videoSourceChooserDialogIsShown=" + this.f194419H + ", lastClickedSuggest=" + this.f194420I + ", incidentWarning=" + this.f194421J + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f194422b, i12);
            parcel.writeStringList(this.f194423c);
            ContextItemInfo contextItemInfo = this.f194424d;
            if (contextItemInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                contextItemInfo.writeToParcel(parcel, i12);
            }
            Boolean bool = this.f194425e;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                com.akita.compose.theme.re23.style.C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.f194426f);
            parcel.writeInt(this.f194427g ? 1 : 0);
            parcel.writeInt(this.f194428h ? 1 : 0);
            parcel.writeInt(this.f194429i ? 1 : 0);
            parcel.writeInt(this.f194430j ? 1 : 0);
            parcel.writeInt(this.f194431k ? 1 : 0);
            parcel.writeInt(this.f194432l ? 1 : 0);
            parcel.writeInt(this.f194433m ? 1 : 0);
            parcel.writeInt(this.f194434n ? 1 : 0);
            parcel.writeInt(this.f194435o ? 1 : 0);
            parcel.writeInt(this.f194436p ? 1 : 0);
            parcel.writeString(this.f194437q.name());
            parcel.writeParcelable(this.f194438r, i12);
            parcel.writeInt(this.f194439s ? 1 : 0);
            parcel.writeParcelable(this.f194440t, i12);
            parcel.writeInt(this.f194441u ? 1 : 0);
            Iterator itI = com.akita.compose.theme.re23.style.C0.i(parcel, this.f194442v);
            while (itI.hasNext()) {
                Map.Entry entry = (Map.Entry) itI.next();
                parcel.writeString(((Onboarding) entry.getKey()).name());
                parcel.writeString(((OnboardingState) entry.getValue()).name());
            }
            parcel.writeInt(this.f194443w ? 1 : 0);
            parcel.writeInt(this.f194444x ? 1 : 0);
            Boolean bool2 = this.f194445y;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                com.akita.compose.theme.re23.style.C0.l(parcel, 1, bool2);
            }
            parcel.writeString(this.f194446z);
            Boolean bool3 = this.f194412A;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                com.akita.compose.theme.re23.style.C0.l(parcel, 1, bool3);
            }
            Boolean bool4 = this.f194413B;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                com.akita.compose.theme.re23.style.C0.l(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.f194414C, i12);
            QuoteViewData quoteViewData = this.f194415D;
            if (quoteViewData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                quoteViewData.writeToParcel(parcel, i12);
            }
            Iterator itJ = com.akita.compose.theme.re23.style.C0.j(this.f194416E, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
            Iterator itI2 = com.akita.compose.theme.re23.style.C0.i(parcel, this.f194417F);
            while (itI2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itI2.next();
                parcel.writeString((String) entry2.getKey());
                parcel.writeParcelable((Parcelable) entry2.getValue(), i12);
            }
            parcel.writeParcelable(this.f194418G, i12);
            parcel.writeInt(this.f194419H ? 1 : 0);
            MessageSuggestsView.SuggestItem suggestItem = this.f194420I;
            if (suggestItem == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                suggestItem.writeToParcel(parcel, i12);
            }
            IncidentWarning incidentWarning = this.f194421J;
            if (incidentWarning == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                incidentWarning.writeToParcel(parcel, i12);
            }
        }

        public State(MessengerUserHashInfo messengerUserHashInfo, List list, ContextItemInfo contextItemInfo, Boolean bool, String str, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z22, boolean z23, MessageInput.AttachButtonState attachButtonState, AttachMenu attachMenu, boolean z24, MessageBody.Location location, boolean z25, Map map, boolean z26, boolean z27, Boolean bool2, String str2, Boolean bool3, Boolean bool4, Quote quote, QuoteViewData quoteViewData, List list2, Map map2, VoiceRecorderState voiceRecorderState, boolean z28, MessageSuggestsView.SuggestItem suggestItem, IncidentWarning incidentWarning, int i12, int i13, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : messengerUserHashInfo, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? null : contextItemInfo, (i12 & 8) != 0 ? null : bool, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? false : z14, (i12 & 256) != 0 ? false : z15, (i12 & 512) != 0 ? false : z16, (i12 & 1024) != 0 ? false : z17, (i12 & 2048) != 0 ? false : z18, (i12 & 4096) != 0 ? false : z19, (i12 & 8192) != 0 ? false : z22, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z23, (i12 & 32768) != 0 ? MessageInput.AttachButtonState.f196376c : attachButtonState, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : attachMenu, (i12 & 131072) != 0 ? false : z24, (i12 & 262144) != 0 ? null : location, (i12 & 524288) != 0 ? false : z25, (i12 & 1048576) != 0 ? kotlin.collections.P0.c() : map, (i12 & 2097152) != 0 ? false : z26, (i12 & 4194304) != 0 ? false : z27, (i12 & 8388608) != 0 ? null : bool2, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str2, (i12 & 33554432) != 0 ? null : bool3, (i12 & 67108864) != 0 ? null : bool4, (i12 & 134217728) != 0 ? null : quote, (i12 & 268435456) != 0 ? null : quoteViewData, (i12 & 536870912) != 0 ? C42784z0.f406748b : list2, (i12 & 1073741824) != 0 ? kotlin.collections.P0.c() : map2, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? VoiceRecorderState.Empty.f194447b : voiceRecorderState, (i13 & 1) != 0 ? false : z28, (i13 & 2) != 0 ? null : suggestItem, (i13 & 4) != 0 ? null : incidentWarning);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State(@Y61.l MessengerUserHashInfo messengerUserHashInfo, @Y61.k List<String> list, @Y61.l ContextItemInfo contextItemInfo, @Y61.l Boolean bool, @Y61.l String str, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z22, boolean z23, @Y61.k MessageInput.AttachButtonState attachButtonState, @Y61.l AttachMenu attachMenu, boolean z24, @Y61.l MessageBody.Location location, boolean z25, @Y61.k Map<Onboarding, ? extends OnboardingState> map, boolean z26, boolean z27, @Y61.l Boolean bool2, @Y61.l String str2, @Y61.l Boolean bool3, @Y61.l Boolean bool4, @Y61.l Quote quote, @Y61.l QuoteViewData quoteViewData, @Y61.k List<User> list2, @Y61.k Map<String, VideoInfo> map2, @Y61.k VoiceRecorderState voiceRecorderState, boolean z28, @Y61.l MessageSuggestsView.SuggestItem suggestItem, @Y61.l IncidentWarning incidentWarning) {
            this.f194422b = messengerUserHashInfo;
            this.f194423c = list;
            this.f194424d = contextItemInfo;
            this.f194425e = bool;
            this.f194426f = str;
            this.f194427g = z12;
            this.f194428h = z13;
            this.f194429i = z14;
            this.f194430j = z15;
            this.f194431k = z16;
            this.f194432l = z17;
            this.f194433m = z18;
            this.f194434n = z19;
            this.f194435o = z22;
            this.f194436p = z23;
            this.f194437q = attachButtonState;
            this.f194438r = attachMenu;
            this.f194439s = z24;
            this.f194440t = location;
            this.f194441u = z25;
            this.f194442v = map;
            this.f194443w = z26;
            this.f194444x = z27;
            this.f194445y = bool2;
            this.f194446z = str2;
            this.f194412A = bool3;
            this.f194413B = bool4;
            this.f194414C = quote;
            this.f194415D = quoteViewData;
            this.f194416E = list2;
            this.f194417F = map2;
            this.f194418G = voiceRecorderState;
            this.f194419H = z28;
            this.f194420I = suggestItem;
            this.f194421J = incidentWarning;
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$VoiceRecorderState;", "Landroid/os/Parcelable;", "Empty", "ReachedMaxDuration", "RecordingInProgress", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$VoiceRecorderState$Empty;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$VoiceRecorderState$ReachedMaxDuration;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$VoiceRecorderState$RecordingInProgress;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public interface VoiceRecorderState extends Parcelable {

        /* compiled from: SendMessagePresenter.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$VoiceRecorderState$Empty;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$VoiceRecorderState;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class Empty implements VoiceRecorderState {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Empty f194447b = new Empty();

            @Y61.k
            public static final Parcelable.Creator<Empty> CREATOR = new a();

            /* compiled from: SendMessagePresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Empty> {
                @Override // android.os.Parcelable.Creator
                public final Empty createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Empty.f194447b;
                }

                @Override // android.os.Parcelable.Creator
                public final Empty[] newArray(int i12) {
                    return new Empty[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: SendMessagePresenter.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$VoiceRecorderState$ReachedMaxDuration;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$VoiceRecorderState;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class ReachedMaxDuration implements VoiceRecorderState {

            @Y61.k
            public static final Parcelable.Creator<ReachedMaxDuration> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final long f194448b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final File f194449c;

            /* compiled from: SendMessagePresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ReachedMaxDuration> {
                @Override // android.os.Parcelable.Creator
                public final ReachedMaxDuration createFromParcel(Parcel parcel) {
                    return new ReachedMaxDuration((File) parcel.readSerializable(), parcel.readLong());
                }

                @Override // android.os.Parcelable.Creator
                public final ReachedMaxDuration[] newArray(int i12) {
                    return new ReachedMaxDuration[i12];
                }
            }

            public ReachedMaxDuration(@Y61.k File file, long j12) {
                this.f194448b = j12;
                this.f194449c = file;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ReachedMaxDuration)) {
                    return false;
                }
                ReachedMaxDuration reachedMaxDuration = (ReachedMaxDuration) obj;
                return this.f194448b == reachedMaxDuration.f194448b && kotlin.jvm.internal.L.f(this.f194449c, reachedMaxDuration.f194449c);
            }

            public final int hashCode() {
                return this.f194449c.hashCode() + (Long.hashCode(this.f194448b) * 31);
            }

            @Y61.k
            public final String toString() {
                return "ReachedMaxDuration(duration=" + this.f194448b + ", file=" + this.f194449c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeLong(this.f194448b);
                parcel.writeSerializable(this.f194449c);
            }
        }

        /* compiled from: SendMessagePresenter.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$VoiceRecorderState$RecordingInProgress;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$VoiceRecorderState;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class RecordingInProgress implements VoiceRecorderState {

            @Y61.k
            public static final Parcelable.Creator<RecordingInProgress> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final File f194450b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public io.reactivex.rxjava3.core.z<Long> f194451c;

            /* compiled from: SendMessagePresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RecordingInProgress> {
                @Override // android.os.Parcelable.Creator
                public final RecordingInProgress createFromParcel(Parcel parcel) {
                    return new RecordingInProgress((File) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final RecordingInProgress[] newArray(int i12) {
                    return new RecordingInProgress[i12];
                }
            }

            public RecordingInProgress() {
                throw null;
            }

            public RecordingInProgress(@Y61.k File file) {
                this.f194450b = file;
                this.f194451c = io.reactivex.rxjava3.internal.operators.observable.H0.f403644b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RecordingInProgress) && kotlin.jvm.internal.L.f(this.f194450b, ((RecordingInProgress) obj).f194450b);
            }

            public final int hashCode() {
                return this.f194450b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "RecordingInProgress(file=" + this.f194450b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeSerializable(this.f194450b);
            }
        }
    }

    /* compiled from: SendMessagePresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void C70(@Y61.k Uri uri);

    void CE();

    void De(@Y61.k MessageSuggestsView.SuggestItem suggestItem);

    @Y61.k
    com.avito.android.util.architecture_components.D F60();

    @Y61.k
    com.avito.android.util.architecture_components.D Fq();

    @Y61.k
    com.avito.android.util.architecture_components.D Fy();

    @Y61.k
    com.avito.android.util.architecture_components.D Gu();

    void Hs(@Y61.k String str);

    void Ju();

    void P60(@Y61.k Uri uri);

    void QR();

    void Rr(@Y61.k AttachMenuItem.File file);

    void Rx();

    void TW();

    void VW();

    void Vx();

    @Y61.k
    com.avito.android.util.architecture_components.D WG();

    void XI();

    void XT();

    void XW();

    void ZA();

    void Zy(@Y61.k Uri uri, @Y61.k String str);

    @Y61.k
    com.avito.android.util.architecture_components.D bF();

    void bN(@Y61.k FeedbackAdvertItem feedbackAdvertItem);

    void eq();

    void gv(@Y61.k MessageBody.Location location);

    void gw(@Y61.k String str);

    void hD();

    void hF();

    @Y61.k
    com.avito.android.util.architecture_components.D lP();

    void mK();

    void mn();

    void pQ();

    @Y61.k
    com.avito.android.util.architecture_components.D qj();

    @Y61.k
    com.avito.android.util.architecture_components.D rZ();

    void sW(@Y61.k com.avito.android.messenger.conversation.mvi.message_menu.d dVar);

    @Y61.k
    com.avito.android.util.architecture_components.D ss();

    void su();

    @Y61.k
    com.avito.android.util.architecture_components.D sx();

    void tD(boolean z12);

    void tQ(@Y61.k String str);

    @Y61.k
    com.avito.android.util.architecture_components.D uZ();

    void vD(@Y61.k a.c cVar);

    void xV();

    @Y61.k
    com.avito.android.util.architecture_components.D zx();
}
